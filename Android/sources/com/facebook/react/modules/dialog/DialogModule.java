package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.AbstractC0212s;
import android.support.v4.app.ActivityC0208o;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1104f;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = DialogModule.NAME)
/* loaded from: classes.dex */
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = C1104f.m5180a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.modules.dialog.DialogModule$a */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC1182a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: a */
        private final Callback f4554a;

        /* renamed from: b */
        private boolean f4555b = false;

        public DialogInterfaceOnClickListenerC1182a(Callback callback) {
            this.f4554a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f4555b || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.f4554a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.f4555b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f4555b || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.f4554a.invoke(DialogModule.ACTION_DISMISSED);
            this.f4555b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.dialog.DialogModule$b */
    /* loaded from: classes.dex */
    public class C1183b {

        /* renamed from: a */
        private final FragmentManager f4557a;

        /* renamed from: b */
        private final AbstractC0212s f4558b;

        /* renamed from: c */
        private Object f4559c;

        public C1183b(FragmentManager fragmentManager) {
            this.f4557a = fragmentManager;
            this.f4558b = null;
        }

        public C1183b(AbstractC0212s abstractC0212s) {
            this.f4557a = null;
            this.f4558b = abstractC0212s;
        }

        /* renamed from: b */
        private void m5326b() {
            if (m5327c()) {
                DialogInterfaceOnClickListenerC1186c dialogInterfaceOnClickListenerC1186c = (DialogInterfaceOnClickListenerC1186c) this.f4558b.mo1059a(DialogModule.FRAGMENT_TAG);
                if (dialogInterfaceOnClickListenerC1186c == null || !dialogInterfaceOnClickListenerC1186c.m916I()) {
                    return;
                }
                dialogInterfaceOnClickListenerC1186c.m897ea();
                return;
            }
            DialogFragmentC1184a dialogFragmentC1184a = (DialogFragmentC1184a) this.f4557a.findFragmentByTag(DialogModule.FRAGMENT_TAG);
            if (dialogFragmentC1184a == null || !dialogFragmentC1184a.isResumed()) {
                return;
            }
            dialogFragmentC1184a.dismiss();
        }

        /* renamed from: c */
        private boolean m5327c() {
            return this.f4558b != null;
        }

        /* renamed from: a */
        public void m5328a() {
            UiThreadUtil.assertOnUiThread();
            if (this.f4559c == null) {
                return;
            }
            if (m5327c()) {
                ((DialogInterfaceOnClickListenerC1186c) this.f4559c).m892a(this.f4558b, DialogModule.FRAGMENT_TAG);
            } else {
                ((DialogFragmentC1184a) this.f4559c).show(this.f4557a, DialogModule.FRAGMENT_TAG);
            }
            this.f4559c = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v4, types: [android.support.v4.app.h, com.facebook.react.modules.dialog.c] */
        /* renamed from: a */
        public void m5329a(boolean z, Bundle bundle, Callback callback) {
            DialogFragmentC1184a dialogFragmentC1184a;
            UiThreadUtil.assertOnUiThread();
            m5326b();
            DialogInterfaceOnClickListenerC1182a dialogInterfaceOnClickListenerC1182a = callback != null ? new DialogInterfaceOnClickListenerC1182a(callback) : null;
            if (m5327c()) {
                ?? dialogInterfaceOnClickListenerC1186c = new DialogInterfaceOnClickListenerC1186c(dialogInterfaceOnClickListenerC1182a, bundle);
                dialogFragmentC1184a = dialogInterfaceOnClickListenerC1186c;
                if (z) {
                    dialogFragmentC1184a = dialogInterfaceOnClickListenerC1186c;
                    if (!this.f4558b.mo1064c()) {
                        if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                            dialogInterfaceOnClickListenerC1186c.m900j(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                        }
                        dialogInterfaceOnClickListenerC1186c.m892a(this.f4558b, DialogModule.FRAGMENT_TAG);
                        return;
                    }
                }
            } else {
                DialogFragmentC1184a dialogFragmentC1184a2 = new DialogFragmentC1184a(dialogInterfaceOnClickListenerC1182a, bundle);
                dialogFragmentC1184a = dialogFragmentC1184a2;
                if (z) {
                    if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                        dialogFragmentC1184a2.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                    }
                    dialogFragmentC1184a2.show(this.f4557a, DialogModule.FRAGMENT_TAG);
                    return;
                }
            }
            this.f4559c = dialogFragmentC1184a;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private C1183b getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return currentActivity instanceof ActivityC0208o ? new C1183b(((ActivityC0208o) currentActivity).m1015e()) : new C1183b(currentActivity.getFragmentManager());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        C1183b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.m5328a();
        } else {
            C1700a.m7009c((Class<?>) DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        C1183b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new RunnableC1185b(this, fragmentManagerHelper, bundle, callback2));
    }
}
