package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.C0274D;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p000a.p005b.p009c.p019h.InterfaceC0105t;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.i */
/* loaded from: classes.dex */
public class C0452i extends AutoCompleteTextView implements InterfaceC0105t {

    /* renamed from: a */
    private static final int[] f2376a = {R.attr.popupBackground};

    /* renamed from: b */
    private final C0454j f2377b;

    /* renamed from: c */
    private final C0403H f2378c;

    public C0452i(Context context) {
        this(context, null);
    }

    public C0452i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.autoCompleteTextViewStyle);
    }

    public C0452i(Context context, AttributeSet attributeSet, int i) {
        super(C0473sa.m2564a(context), attributeSet, i);
        C0479va m2571a = C0479va.m2571a(getContext(), attributeSet, f2376a, i, 0);
        if (m2571a.m2589g(0)) {
            setDropDownBackgroundDrawable(m2571a.m2579b(0));
        }
        m2571a.m2576a();
        this.f2377b = new C0454j(this);
        this.f2377b.m2470a(attributeSet, i);
        this.f2378c = new C0403H(this);
        this.f2378c.m2211a(attributeSet, i);
        this.f2378c.m2206a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0454j c0454j = this.f2377b;
        if (c0454j != null) {
            c0454j.m2465a();
        }
        C0403H c0403h = this.f2378c;
        if (c0403h != null) {
            c0403h.m2206a();
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public ColorStateList getSupportBackgroundTintList() {
        C0454j c0454j = this.f2377b;
        if (c0454j != null) {
            return c0454j.m2471b();
        }
        return null;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0454j c0454j = this.f2377b;
        if (c0454j != null) {
            return c0454j.m2473c();
        }
        return null;
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
        C0454j c0454j = this.f2377b;
        if (c0454j != null) {
            c0454j.m2469a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0454j c0454j = this.f2377b;
        if (c0454j != null) {
            c0454j.m2466a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0274D.m1433a(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0122a.m550b(getContext(), i));
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0454j c0454j = this.f2377b;
        if (c0454j != null) {
            c0454j.m2472b(colorStateList);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0454j c0454j = this.f2377b;
        if (c0454j != null) {
            c0454j.m2468a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0403H c0403h = this.f2378c;
        if (c0403h != null) {
            c0403h.m2210a(context, i);
        }
    }
}
