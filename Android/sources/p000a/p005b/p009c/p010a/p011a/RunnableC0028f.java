package p000a.p005b.p009c.p010a.p011a;

import android.graphics.Typeface;
import p000a.p005b.p009c.p010a.p011a.C0030h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.b.c.a.a.f */
/* loaded from: classes.dex */
public class RunnableC0028f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Typeface f138a;

    /* renamed from: b */
    final /* synthetic */ C0030h.a f139b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0028f(C0030h.a aVar, Typeface typeface) {
        this.f139b = aVar;
        this.f138a = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f139b.mo141a(this.f138a);
    }
}
