package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.C0274D;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p000a.p005b.p009c.p019h.InterfaceC0105t;
import p000a.p005b.p022d.p023a.C0112a;

/* renamed from: android.support.v7.widget.p */
/* loaded from: classes.dex */
public class C0466p extends EditText implements InterfaceC0105t {

    /* renamed from: a */
    private final C0454j f2435a;

    /* renamed from: b */
    private final C0403H f2436b;

    public C0466p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.editTextStyle);
    }

    public C0466p(Context context, AttributeSet attributeSet, int i) {
        super(C0473sa.m2564a(context), attributeSet, i);
        this.f2435a = new C0454j(this);
        this.f2435a.m2470a(attributeSet, i);
        this.f2436b = new C0403H(this);
        this.f2436b.m2211a(attributeSet, i);
        this.f2436b.m2206a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0454j c0454j = this.f2435a;
        if (c0454j != null) {
            c0454j.m2465a();
        }
        C0403H c0403h = this.f2436b;
        if (c0403h != null) {
            c0403h.m2206a();
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public ColorStateList getSupportBackgroundTintList() {
        C0454j c0454j = this.f2435a;
        if (c0454j != null) {
            return c0454j.m2471b();
        }
        return null;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0454j c0454j = this.f2435a;
        if (c0454j != null) {
            return c0454j.m2473c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0468q.m2548a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0454j c0454j = this.f2435a;
        if (c0454j != null) {
            c0454j.m2469a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0454j c0454j = this.f2435a;
        if (c0454j != null) {
            c0454j.m2466a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0274D.m1433a(this, callback));
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0454j c0454j = this.f2435a;
        if (c0454j != null) {
            c0454j.m2472b(colorStateList);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0454j c0454j = this.f2435a;
        if (c0454j != null) {
            c0454j.m2468a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0403H c0403h = this.f2436b;
        if (c0403h != null) {
            c0403h.m2210a(context, i);
        }
    }
}
