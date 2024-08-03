package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.AbstractC0212s;
import android.support.v4.app.ActivityC0208o;
import android.support.v4.app.DialogInterfaceOnCancelListenerC0201h;
import android.widget.TimePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = TimePickerDialogModule.FRAGMENT_TAG)
/* loaded from: classes.dex */
public class TimePickerDialogModule extends ReactContextBaseJavaModule {
    static final String ACTION_DISMISSED = "dismissedAction";
    static final String ACTION_TIME_SET = "timeSetAction";
    static final String ARG_HOUR = "hour";
    static final String ARG_IS24HOUR = "is24Hour";
    static final String ARG_MINUTE = "minute";
    static final String ARG_MODE = "mode";
    private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "TimePickerAndroid";

    /* renamed from: com.facebook.react.modules.timepicker.TimePickerDialogModule$a */
    /* loaded from: classes.dex */
    private class DialogInterfaceOnDismissListenerC1256a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener {

        /* renamed from: a */
        private final Promise f4708a;

        /* renamed from: b */
        private boolean f4709b = false;

        public DialogInterfaceOnDismissListenerC1256a(Promise promise) {
            this.f4708a = promise;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f4709b || !TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", TimePickerDialogModule.ACTION_DISMISSED);
            this.f4708a.resolve(writableNativeMap);
            this.f4709b = true;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (this.f4709b || !TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", TimePickerDialogModule.ACTION_TIME_SET);
            writableNativeMap.putInt(TimePickerDialogModule.ARG_HOUR, i);
            writableNativeMap.putInt(TimePickerDialogModule.ARG_MINUTE, i2);
            this.f4708a.resolve(writableNativeMap);
            this.f4709b = true;
        }
    }

    public TimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(ARG_HOUR) && !readableMap.isNull(ARG_HOUR)) {
            bundle.putInt(ARG_HOUR, readableMap.getInt(ARG_HOUR));
        }
        if (readableMap.hasKey(ARG_MINUTE) && !readableMap.isNull(ARG_MINUTE)) {
            bundle.putInt(ARG_MINUTE, readableMap.getInt(ARG_MINUTE));
        }
        if (readableMap.hasKey(ARG_IS24HOUR) && !readableMap.isNull(ARG_IS24HOUR)) {
            bundle.putBoolean(ARG_IS24HOUR, readableMap.getBoolean(ARG_IS24HOUR));
        }
        if (readableMap.hasKey(ARG_MODE) && !readableMap.isNull(ARG_MODE)) {
            bundle.putString(ARG_MODE, readableMap.getString(ARG_MODE));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        ActivityC0208o activityC0208o = (ActivityC0208o) getCurrentActivity();
        if (activityC0208o == null) {
            promise.reject(ERROR_NO_ACTIVITY, "Tried to open a TimePicker dialog while not attached to an Activity");
            return;
        }
        AbstractC0212s m1015e = activityC0208o.m1015e();
        DialogInterfaceOnCancelListenerC0201h dialogInterfaceOnCancelListenerC0201h = (DialogInterfaceOnCancelListenerC0201h) m1015e.mo1059a(FRAGMENT_TAG);
        if (dialogInterfaceOnCancelListenerC0201h != null) {
            dialogInterfaceOnCancelListenerC0201h.m897ea();
        }
        C1258b c1258b = new C1258b();
        if (readableMap != null) {
            c1258b.m993m(createFragmentArguments(readableMap));
        }
        DialogInterfaceOnDismissListenerC1256a dialogInterfaceOnDismissListenerC1256a = new DialogInterfaceOnDismissListenerC1256a(promise);
        c1258b.m5471a((DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC1256a);
        c1258b.m5470a((TimePickerDialog.OnTimeSetListener) dialogInterfaceOnDismissListenerC1256a);
        c1258b.m892a(m1015e, FRAGMENT_TAG);
    }
}
