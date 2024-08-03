package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogInterfaceOnCancelListenerC0201h;
import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.facebook.react.modules.timepicker.b */
/* loaded from: classes.dex */
public class C1258b extends DialogInterfaceOnCancelListenerC0201h {

    /* renamed from: ha */
    private TimePickerDialog.OnTimeSetListener f4711ha;

    /* renamed from: ia */
    private DialogInterface.OnDismissListener f4712ia;

    /* renamed from: a */
    static Dialog m5469a(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        EnumC1259c enumC1259c = EnumC1259c.DEFAULT;
        if (bundle != null && bundle.getString("mode", null) != null) {
            enumC1259c = EnumC1259c.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        if (bundle != null) {
            i = bundle.getInt("hour", calendar.get(11));
            i2 = bundle.getInt("minute", calendar.get(12));
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (enumC1259c == EnumC1259c.CLOCK) {
                return new TimePickerDialogC1257a(context, context.getResources().getIdentifier("ClockTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
            if (enumC1259c == EnumC1259c.SPINNER) {
                return new TimePickerDialogC1257a(context, context.getResources().getIdentifier("SpinnerTimePickerDialog", "style", context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
            }
        }
        return new TimePickerDialogC1257a(context, onTimeSetListener, i, i2, is24HourFormat);
    }

    /* renamed from: a */
    public void m5470a(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f4711ha = onTimeSetListener;
    }

    /* renamed from: a */
    public void m5471a(DialogInterface.OnDismissListener onDismissListener) {
        this.f4712ia = onDismissListener;
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0201h
    /* renamed from: n */
    public Dialog mo901n(Bundle bundle) {
        return m5469a(m984i(), m968d(), this.f4711ha);
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0201h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f4712ia;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
