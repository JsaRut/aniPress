package p000a.p005b.p009c.p017f;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;
import p000a.p005b.p009c.p017f.C0058f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.b.c.f.b */
/* loaded from: classes.dex */
public class CallableC0054b implements Callable<C0058f.c> {

    /* renamed from: a */
    final /* synthetic */ Context f182a;

    /* renamed from: b */
    final /* synthetic */ C0053a f183b;

    /* renamed from: c */
    final /* synthetic */ int f184c;

    /* renamed from: d */
    final /* synthetic */ String f185d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC0054b(Context context, C0053a c0053a, int i, String str) {
        this.f182a = context;
        this.f183b = c0053a;
        this.f184c = i;
        this.f185d = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public C0058f.c call() {
        C0058f.c m244a = C0058f.m244a(this.f182a, this.f183b, this.f184c);
        Typeface typeface = m244a.f201a;
        if (typeface != null) {
            C0058f.f189a.m1367a(this.f185d, typeface);
        }
        return m244a;
    }
}
