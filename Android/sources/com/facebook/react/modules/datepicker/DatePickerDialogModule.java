package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.AbstractC0212s;
import android.support.v4.app.ActivityC0208o;
import android.support.v4.app.DialogInterfaceOnCancelListenerC0201h;
import android.widget.DatePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = DatePickerDialogModule.FRAGMENT_TAG)
/* loaded from: classes.dex */
public class DatePickerDialogModule extends ReactContextBaseJavaModule {
    static final String ACTION_DATE_SET = "dateSetAction";
    static final String ACTION_DISMISSED = "dismissedAction";
    static final String ARG_DATE = "date";
    static final String ARG_MAXDATE = "maxDate";
    static final String ARG_MINDATE = "minDate";
    static final String ARG_MODE = "mode";
    private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "DatePickerAndroid";

    /* renamed from: com.facebook.react.modules.datepicker.DatePickerDialogModule$a */
    /* loaded from: classes.dex */
    private class DialogInterfaceOnDismissListenerC1173a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {

        /* renamed from: a */
        private final Promise f4517a;

        /* renamed from: b */
        private boolean f4518b = false;

        public DialogInterfaceOnDismissListenerC1173a(Promise promise) {
            this.f4517a = promise;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (this.f4518b || !DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
            writableNativeMap.putInt("year", i);
            writableNativeMap.putInt("month", i2);
            writableNativeMap.putInt("day", i3);
            this.f4517a.resolve(writableNativeMap);
            this.f4518b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f4518b || !DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DISMISSED);
            this.f4517a.resolve(writableNativeMap);
            this.f4518b = true;
        }
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(ARG_DATE) && !readableMap.isNull(ARG_DATE)) {
            bundle.putLong(ARG_DATE, (long) readableMap.getDouble(ARG_DATE));
        }
        if (readableMap.hasKey(ARG_MINDATE) && !readableMap.isNull(ARG_MINDATE)) {
            bundle.putLong(ARG_MINDATE, (long) readableMap.getDouble(ARG_MINDATE));
        }
        if (readableMap.hasKey(ARG_MAXDATE) && !readableMap.isNull(ARG_MAXDATE)) {
            bundle.putLong(ARG_MAXDATE, (long) readableMap.getDouble(ARG_MAXDATE));
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
            promise.reject(ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to an Activity");
            return;
        }
        AbstractC0212s m1015e = activityC0208o.m1015e();
        DialogInterfaceOnCancelListenerC0201h dialogInterfaceOnCancelListenerC0201h = (DialogInterfaceOnCancelListenerC0201h) m1015e.mo1059a(FRAGMENT_TAG);
        if (dialogInterfaceOnCancelListenerC0201h != null) {
            dialogInterfaceOnCancelListenerC0201h.m897ea();
        }
        C1175b c1175b = new C1175b();
        if (readableMap != null) {
            c1175b.m993m(createFragmentArguments(readableMap));
        }
        DialogInterfaceOnDismissListenerC1173a dialogInterfaceOnDismissListenerC1173a = new DialogInterfaceOnDismissListenerC1173a(promise);
        c1175b.m5304a((DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC1173a);
        c1175b.m5303a((DatePickerDialog.OnDateSetListener) dialogInterfaceOnDismissListenerC1173a);
        c1175b.m892a(m1015e, FRAGMENT_TAG);
    }
}
