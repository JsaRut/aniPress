package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.InterfaceC0414O;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0414O {

    /* renamed from: a */
    private InterfaceC0414O.a f2030a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0414O.a aVar = this.f2030a;
        if (aVar != null) {
            aVar.mo1855a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.support.v7.widget.InterfaceC0414O
    public void setOnFitSystemWindowsListener(InterfaceC0414O.a aVar) {
        this.f2030a = aVar;
    }
}
