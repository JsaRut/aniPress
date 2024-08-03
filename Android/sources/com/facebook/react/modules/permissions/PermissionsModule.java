package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.InterfaceC1166e;
import com.facebook.react.modules.core.InterfaceC1167f;
import java.util.ArrayList;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = PermissionsModule.NAME)
/* loaded from: classes.dex */
public class PermissionsModule extends ReactContextBaseJavaModule implements InterfaceC1167f {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> mCallbacks;
    private int mRequestCode;

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRequestCode = 0;
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
        this.mCallbacks = new SparseArray<>();
    }

    private InterfaceC1166e getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof InterfaceC1166e) {
            return (InterfaceC1166e) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    @ReactMethod
    public void checkPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23 ? baseContext.checkSelfPermission(str) != 0 : baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            z = false;
        }
        promise.resolve(Boolean.valueOf(z));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.modules.core.InterfaceC1167f
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        return this.mCallbacks.size() == 0;
    }

    @ReactMethod
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            String str = "granted";
            if (Build.VERSION.SDK_INT < 23) {
                if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) != 0) {
                    str = "denied";
                }
            } else if (baseContext.checkSelfPermission(string) != 0) {
                arrayList.add(string);
            }
            writableNativeMap.putString(string, str);
            i++;
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            InterfaceC1166e permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new C1236b(this, arrayList, writableNativeMap, promise));
            permissionAwareActivity.mo5286a((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }

    @ReactMethod
    public void requestPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0 ? "denied" : "granted");
            return;
        }
        if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve("granted");
            return;
        }
        try {
            InterfaceC1166e permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new C1235a(this, promise, str));
            permissionAwareActivity.mo5286a(new String[]{str}, this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(false);
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }
}
