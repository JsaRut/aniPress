package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.p249i.InterfaceC2398a;

/* renamed from: d.c.a.a.j.c.a.b */
/* loaded from: classes.dex */
public class C2436b implements InterfaceC2398a<C2436b> {

    /* renamed from: a */
    public final long f9590a;

    /* renamed from: b */
    public final long f9591b;

    /* renamed from: c */
    public final long f9592c;

    /* renamed from: d */
    public final boolean f9593d;

    /* renamed from: e */
    public final long f9594e;

    /* renamed from: f */
    public final long f9595f;

    /* renamed from: g */
    public final long f9596g;

    /* renamed from: h */
    public final long f9597h;

    /* renamed from: i */
    public final C2448n f9598i;

    /* renamed from: j */
    public final Uri f9599j;

    /* renamed from: k */
    public final C2441g f9600k;

    /* renamed from: l */
    private final List<C2440f> f9601l;

    public C2436b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C2441g c2441g, C2448n c2448n, Uri uri, List<C2440f> list) {
        this.f9590a = j;
        this.f9591b = j2;
        this.f9592c = j3;
        this.f9593d = z;
        this.f9594e = j4;
        this.f9595f = j5;
        this.f9596g = j6;
        this.f9597h = j7;
        this.f9600k = c2441g;
        this.f9598i = c2448n;
        this.f9599j = uri;
        this.f9601l = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final int m10037a() {
        return this.f9601l.size();
    }

    /* renamed from: a */
    public final C2440f m10038a(int i) {
        return this.f9601l.get(i);
    }

    /* renamed from: b */
    public final long m10039b(int i) {
        if (i != this.f9601l.size() - 1) {
            return this.f9601l.get(i + 1).f9623b - this.f9601l.get(i).f9623b;
        }
        long j = this.f9591b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - this.f9601l.get(i).f9623b;
    }

    /* renamed from: c */
    public final long m10040c(int i) {
        return C2200d.m9047a(m10039b(i));
    }
}
