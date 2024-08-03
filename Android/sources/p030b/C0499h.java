package p030b;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [TResult] */
/* renamed from: b.h */
/* loaded from: classes.dex */
public class C0499h<TResult> implements InterfaceC0497f<TResult, Void> {

    /* renamed from: a */
    final /* synthetic */ C0503l f2540a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC0497f f2541b;

    /* renamed from: c */
    final /* synthetic */ Executor f2542c;

    /* renamed from: d */
    final /* synthetic */ C0496e f2543d;

    /* renamed from: e */
    final /* synthetic */ C0502k f2544e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0499h(C0502k c0502k, C0503l c0503l, InterfaceC0497f interfaceC0497f, Executor executor, C0496e c0496e) {
        this.f2544e = c0502k;
        this.f2540a = c0503l;
        this.f2541b = interfaceC0497f;
        this.f2542c = executor;
        this.f2543d = c0496e;
    }

    @Override // p030b.InterfaceC0497f
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Void mo2635a(C0502k<TResult> c0502k) {
        C0502k.m2641b(this.f2540a, this.f2541b, c0502k, this.f2542c, this.f2543d);
        return null;
    }
}
