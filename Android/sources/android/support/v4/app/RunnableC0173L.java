package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.app.C0176M;
import android.support.v4.util.C0256b;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.L */
/* loaded from: classes.dex */
public class RunnableC0173L implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC0185W f658a;

    /* renamed from: b */
    final /* synthetic */ C0256b f659b;

    /* renamed from: c */
    final /* synthetic */ Object f660c;

    /* renamed from: d */
    final /* synthetic */ C0176M.a f661d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f662e;

    /* renamed from: f */
    final /* synthetic */ View f663f;

    /* renamed from: g */
    final /* synthetic */ ComponentCallbacksC0205l f664g;

    /* renamed from: h */
    final /* synthetic */ ComponentCallbacksC0205l f665h;

    /* renamed from: i */
    final /* synthetic */ boolean f666i;

    /* renamed from: j */
    final /* synthetic */ ArrayList f667j;

    /* renamed from: k */
    final /* synthetic */ Object f668k;

    /* renamed from: l */
    final /* synthetic */ Rect f669l;

    public RunnableC0173L(AbstractC0185W abstractC0185W, C0256b c0256b, Object obj, C0176M.a aVar, ArrayList arrayList, View view, ComponentCallbacksC0205l componentCallbacksC0205l, ComponentCallbacksC0205l componentCallbacksC0205l2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f658a = abstractC0185W;
        this.f659b = c0256b;
        this.f660c = obj;
        this.f661d = aVar;
        this.f662e = arrayList;
        this.f663f = view;
        this.f664g = componentCallbacksC0205l;
        this.f665h = componentCallbacksC0205l2;
        this.f666i = z;
        this.f667j = arrayList2;
        this.f668k = obj2;
        this.f669l = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0256b<String, View> m784a = C0176M.m784a(this.f658a, (C0256b<String, String>) this.f659b, this.f660c, this.f661d);
        if (m784a != null) {
            this.f662e.addAll(m784a.values());
            this.f662e.add(this.f663f);
        }
        C0176M.m797a(this.f664g, this.f665h, this.f666i, m784a, false);
        Object obj = this.f660c;
        if (obj != null) {
            this.f658a.mo823b(obj, this.f667j, this.f662e);
            View m785a = C0176M.m785a(m784a, this.f661d, this.f668k, this.f666i);
            if (m785a != null) {
                this.f658a.m831a(m785a, this.f669l);
            }
        }
    }
}
