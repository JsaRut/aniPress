package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* renamed from: com.facebook.react.views.textinput.l */
/* loaded from: classes.dex */
public final class C1491l {

    /* renamed from: a */
    private final SpannableStringBuilder f5513a;

    /* renamed from: b */
    private final float f5514b;

    /* renamed from: c */
    private final int f5515c;

    /* renamed from: d */
    private final int f5516d;

    /* renamed from: e */
    private final int f5517e;

    /* renamed from: f */
    private final int f5518f;

    /* renamed from: g */
    private final CharSequence f5519g;

    public C1491l(EditText editText) {
        this.f5513a = new SpannableStringBuilder(editText.getText());
        this.f5514b = editText.getTextSize();
        this.f5517e = editText.getInputType();
        this.f5519g = editText.getHint();
        this.f5515c = editText.getMinLines();
        this.f5516d = editText.getMaxLines();
        this.f5518f = Build.VERSION.SDK_INT >= 23 ? editText.getBreakStrategy() : 0;
    }

    /* renamed from: a */
    public void m6274a(EditText editText) {
        editText.setText(this.f5513a);
        editText.setTextSize(0, this.f5514b);
        editText.setMinLines(this.f5515c);
        editText.setMaxLines(this.f5516d);
        editText.setInputType(this.f5517e);
        editText.setHint(this.f5519g);
        if (Build.VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f5518f);
        }
    }
}
