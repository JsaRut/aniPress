package p139d.p225c.p226a.p227a;

import java.io.IOException;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j */
/* loaded from: classes.dex */
public final class C2399j extends Exception {

    /* renamed from: a */
    public final int f9380a;

    /* renamed from: b */
    public final int f9381b;

    /* renamed from: c */
    private final Throwable f9382c;

    private C2399j(int i, Throwable th, int i2) {
        super(th);
        this.f9380a = i;
        this.f9382c = th;
        this.f9381b = i2;
    }

    /* renamed from: a */
    public static C2399j m9869a(IOException iOException) {
        return new C2399j(0, iOException, -1);
    }

    /* renamed from: a */
    public static C2399j m9870a(Exception exc, int i) {
        return new C2399j(1, exc, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2399j m9871a(RuntimeException runtimeException) {
        return new C2399j(2, runtimeException, -1);
    }

    /* renamed from: b */
    public Exception m9872b() {
        C2628e.m11113b(this.f9380a == 1);
        return (Exception) this.f9382c;
    }

    /* renamed from: c */
    public IOException m9873c() {
        C2628e.m11113b(this.f9380a == 0);
        return (IOException) this.f9382c;
    }
}
