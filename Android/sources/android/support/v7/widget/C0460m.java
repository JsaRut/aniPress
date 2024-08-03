package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.support.v4.widget.C0274D;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.m */
/* loaded from: classes.dex */
public class C0460m extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f2391a = {R.attr.checkMark};

    /* renamed from: b */
    private final C0403H f2392b;

    public C0460m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public C0460m(Context context, AttributeSet attributeSet, int i) {
        super(C0473sa.m2564a(context), attributeSet, i);
        this.f2392b = new C0403H(this);
        this.f2392b.m2211a(attributeSet, i);
        this.f2392b.m2206a();
        C0479va m2571a = C0479va.m2571a(getContext(), attributeSet, f2391a, i, 0);
        setCheckMarkDrawable(m2571a.m2579b(0));
        m2571a.m2576a();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0403H c0403h = this.f2392b;
        if (c0403h != null) {
            c0403h.m2206a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0468q.m2548a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0122a.m550b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0274D.m1433a(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0403H c0403h = this.f2392b;
        if (c0403h != null) {
            c0403h.m2210a(context, i);
        }
    }
}
