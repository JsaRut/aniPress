package p139d.p143b.p208m;

import com.facebook.react.bridge.ReactApplicationContext;
import p139d.p143b.p208m.C2047G;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.C */
/* loaded from: classes.dex */
public class RunnableC2043C implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2047G.b[] f7413a;

    /* renamed from: b */
    final /* synthetic */ ReactApplicationContext f7414b;

    /* renamed from: c */
    final /* synthetic */ C2047G f7415c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2043C(C2047G c2047g, C2047G.b[] bVarArr, ReactApplicationContext reactApplicationContext) {
        this.f7415c = c2047g;
        this.f7413a = bVarArr;
        this.f7414b = reactApplicationContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (C2047G.b bVar : this.f7413a) {
            bVar.m8373a(this.f7414b);
        }
    }
}
