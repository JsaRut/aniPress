package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogInterfaceOnCancelListenerC0201h;
import android.widget.DatePicker;
import java.util.Calendar;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
/* renamed from: com.facebook.react.modules.datepicker.b */
/* loaded from: classes.dex */
public class C1175b extends DialogInterfaceOnCancelListenerC0201h {

    /* renamed from: ha */
    private DatePickerDialog.OnDateSetListener f4521ha;

    /* renamed from: ia */
    private DialogInterface.OnDismissListener f4522ia;

    /* renamed from: a */
    static Dialog m5302a(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        DatePickerDialogC1177d datePickerDialogC1177d;
        long j;
        Calendar calendar = Calendar.getInstance();
        if (bundle != null && bundle.containsKey("date")) {
            calendar.setTimeInMillis(bundle.getLong("date"));
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        EnumC1176c enumC1176c = EnumC1176c.DEFAULT;
        if (bundle != null && bundle.getString("mode", null) != null) {
            enumC1176c = EnumC1176c.valueOf(bundle.getString("mode").toUpperCase(Locale.US));
        }
        EnumC1176c enumC1176c2 = enumC1176c;
        if (Build.VERSION.SDK_INT >= 21) {
            int i4 = C1174a.f4520a[enumC1176c2.ordinal()];
            datePickerDialogC1177d = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : new DatePickerDialogC1177d(context, onDateSetListener, i, i2, i3) : new DatePickerDialogC1177d(context, context.getResources().getIdentifier("SpinnerDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3) : new DatePickerDialogC1177d(context, context.getResources().getIdentifier("CalendarDatePickerDialog", "style", context.getPackageName()), onDateSetListener, i, i2, i3);
        } else {
            DatePickerDialogC1177d datePickerDialogC1177d2 = new DatePickerDialogC1177d(context, onDateSetListener, i, i2, i3);
            int i5 = C1174a.f4520a[enumC1176c2.ordinal()];
            if (i5 == 1) {
                datePickerDialogC1177d2.getDatePicker().setCalendarViewShown(true);
                datePickerDialogC1177d2.getDatePicker().setSpinnersShown(false);
            } else if (i5 == 2) {
                datePickerDialogC1177d2.getDatePicker().setCalendarViewShown(false);
            }
            datePickerDialogC1177d = datePickerDialogC1177d2;
        }
        DatePicker datePicker = datePickerDialogC1177d.getDatePicker();
        if (bundle == null || !bundle.containsKey("minDate")) {
            j = -2208988800001L;
        } else {
            calendar.setTimeInMillis(bundle.getLong("minDate"));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            j = calendar.getTimeInMillis();
        }
        datePicker.setMinDate(j);
        if (bundle != null && bundle.containsKey("maxDate")) {
            calendar.setTimeInMillis(bundle.getLong("maxDate"));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            datePicker.setMaxDate(calendar.getTimeInMillis());
        }
        return datePickerDialogC1177d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5303a(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f4521ha = onDateSetListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5304a(DialogInterface.OnDismissListener onDismissListener) {
        this.f4522ia = onDismissListener;
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0201h
    /* renamed from: n */
    public Dialog mo901n(Bundle bundle) {
        return m5302a(m984i(), m968d(), this.f4521ha);
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0201h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f4522ia;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
