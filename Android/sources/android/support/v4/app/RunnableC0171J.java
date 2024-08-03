package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.J */
/* loaded from: classes.dex */
public class RunnableC0171J implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f643a;

    /* renamed from: b */
    final /* synthetic */ AbstractC0185W f644b;

    /* renamed from: c */
    final /* synthetic */ View f645c;

    /* renamed from: d */
    final /* synthetic */ ComponentCallbacksC0205l f646d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f647e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f648f;

    /* renamed from: g */
    final /* synthetic */ ArrayList f649g;

    /* renamed from: h */
    final /* synthetic */ Object f650h;

    public RunnableC0171J(Object obj, AbstractC0185W abstractC0185W, View view, ComponentCallbacksC0205l componentCallbacksC0205l, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f643a = obj;
        this.f644b = abstractC0185W;
        this.f645c = view;
        this.f646d = componentCallbacksC0205l;
        this.f647e = arrayList;
        this.f648f = arrayList2;
        this.f649g = arrayList3;
        this.f650h = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f643a;
        if (obj != null) {
            this.f644b.mo821b(obj, this.f645c);
            this.f648f.addAll(C0176M.m791a(this.f644b, this.f643a, this.f646d, (ArrayList<View>) this.f647e, this.f645c));
        }
        if (this.f649g != null) {
            if (this.f650h != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f645c);
                this.f644b.mo817a(this.f650h, this.f649g, arrayList);
            }
            this.f649g.clear();
            this.f649g.add(this.f645c);
        }
    }
}
