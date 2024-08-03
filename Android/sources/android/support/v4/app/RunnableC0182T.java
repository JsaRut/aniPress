package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;
import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.T */
/* loaded from: classes.dex */
public class RunnableC0182T implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f705a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f706b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f707c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f708d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f709e;

    /* renamed from: f */
    final /* synthetic */ AbstractC0185W f710f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0182T(AbstractC0185W abstractC0185W, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f710f = abstractC0185W;
        this.f705a = i;
        this.f706b = arrayList;
        this.f707c = arrayList2;
        this.f708d = arrayList3;
        this.f709e = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f705a; i++) {
            C0107v.m503a((View) this.f706b.get(i), (String) this.f707c.get(i));
            C0107v.m503a((View) this.f708d.get(i), (String) this.f709e.get(i));
        }
    }
}
