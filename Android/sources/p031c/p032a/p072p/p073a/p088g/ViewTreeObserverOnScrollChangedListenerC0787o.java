package p031c.p032a.p072p.p073a.p088g;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;
import p031c.p032a.p072p.p073a.p075b.p076a.C0709a;
import p031c.p032a.p072p.p073a.p078d.C0728a;
import p031c.p032a.p072p.p073a.p080f.C0758g;
import p031c.p032a.p072p.p073a.p089h.C0804o;

/* renamed from: c.a.p.a.g.o */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC0787o implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private final View f3449a;

    /* renamed from: b */
    private C0728a f3450b;

    /* renamed from: c */
    private boolean f3451c;

    /* renamed from: d */
    private boolean f3452d;

    /* renamed from: e */
    private final List<C0774b> f3453e;

    public ViewTreeObserverOnScrollChangedListenerC0787o(View view, List<C0774b> list) {
        this.f3449a = view;
        this.f3453e = list;
        try {
            this.f3450b = C0758g.m3795b(view);
            this.f3451c = m3894a(this.f3450b.m3698b(), this.f3450b.m3699c());
            m3893a(view.getGlobalVisibleRect(new Rect()));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m3893a(boolean z) {
        if (!this.f3451c) {
            C0804o.m3921d();
            return;
        }
        if (this.f3452d) {
            if (!z) {
                C0709a.m3631a(this.f3449a);
            }
        } else if (z) {
            C0709a.m3634b(this.f3449a);
        }
        C0804o.m3921d();
        this.f3452d = z;
    }

    /* renamed from: a */
    private boolean m3894a(String str, String str2) {
        Iterator<C0774b> it = this.f3453e.iterator();
        while (it.hasNext()) {
            if (it.next().m3851a(str, str2, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        try {
            C0728a m3795b = C0758g.m3795b(this.f3449a);
            boolean globalVisibleRect = this.f3449a.getGlobalVisibleRect(new Rect());
            if (m3795b.equals(this.f3450b)) {
                m3893a(globalVisibleRect);
                return;
            }
            if (this.f3451c) {
                C0709a.m3632a(this.f3450b);
            }
            this.f3450b = m3795b;
            this.f3451c = m3894a(this.f3450b.m3698b(), this.f3450b.m3699c());
            if (!this.f3451c || !globalVisibleRect) {
                C0804o.m3921d();
            } else {
                C0709a.m3634b(this.f3449a);
                C0804o.m3921d();
            }
        } catch (Throwable unused) {
        }
    }
}
