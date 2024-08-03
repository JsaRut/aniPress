package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;

/* renamed from: com.facebook.react.modules.datepicker.d */
/* loaded from: classes.dex */
public class DatePickerDialogC1177d extends DatePickerDialog {
    public DatePickerDialogC1177d(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
    }

    public DatePickerDialogC1177d(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        if (Build.VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }
}
