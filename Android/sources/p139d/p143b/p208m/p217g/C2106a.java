package p139d.p143b.p208m.p217g;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: d.b.m.g.a */
/* loaded from: classes.dex */
public class C2106a implements InterfaceC2107b {

    /* renamed from: a */
    private volatile int f7585a = -1;

    /* renamed from: b */
    private ViewParent f7586b;

    /* renamed from: b */
    private void m8448b() {
        ViewParent viewParent = this.f7586b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f7586b = null;
        }
    }

    /* renamed from: a */
    public void m8449a() {
        this.f7585a = -1;
        m8448b();
    }

    /* renamed from: a */
    public void m8450a(int i, ViewParent viewParent) {
        this.f7585a = i;
        m8448b();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f7586b = viewParent;
        }
    }

    @Override // p139d.p143b.p208m.p217g.InterfaceC2107b
    /* renamed from: a */
    public boolean mo8451a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.f7585a;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }
}
