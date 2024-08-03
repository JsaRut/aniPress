package p139d.p225c.p226a.p227a.p229b;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* renamed from: d.c.a.a.b.j */
/* loaded from: classes.dex */
public final class C2173j {

    /* renamed from: a */
    public static final C2173j f7861a = new a().m8858a();

    /* renamed from: b */
    public final int f7862b;

    /* renamed from: c */
    public final int f7863c;

    /* renamed from: d */
    public final int f7864d;

    /* renamed from: e */
    private AudioAttributes f7865e;

    /* renamed from: d.c.a.a.b.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private int f7866a = 0;

        /* renamed from: b */
        private int f7867b = 0;

        /* renamed from: c */
        private int f7868c = 1;

        /* renamed from: a */
        public C2173j m8858a() {
            return new C2173j(this.f7866a, this.f7867b, this.f7868c);
        }
    }

    private C2173j(int i, int i2, int i3) {
        this.f7862b = i;
        this.f7863c = i2;
        this.f7864d = i3;
    }

    @TargetApi(21)
    /* renamed from: a */
    public AudioAttributes m8857a() {
        if (this.f7865e == null) {
            this.f7865e = new AudioAttributes.Builder().setContentType(this.f7862b).setFlags(this.f7863c).setUsage(this.f7864d).build();
        }
        return this.f7865e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2173j.class != obj.getClass()) {
            return false;
        }
        C2173j c2173j = (C2173j) obj;
        return this.f7862b == c2173j.f7862b && this.f7863c == c2173j.f7863c && this.f7864d == c2173j.f7864d;
    }

    public int hashCode() {
        return ((((527 + this.f7862b) * 31) + this.f7863c) * 31) + this.f7864d;
    }
}
