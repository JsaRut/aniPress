package android.support.v4.media;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.c */
/* loaded from: classes.dex */
public class C0228c implements InterfaceC0226a {

    /* renamed from: a */
    int f1009a = 0;

    /* renamed from: b */
    int f1010b = 0;

    /* renamed from: c */
    int f1011c = 0;

    /* renamed from: d */
    int f1012d = -1;

    /* renamed from: a */
    public int m1232a() {
        return this.f1010b;
    }

    /* renamed from: b */
    public int m1233b() {
        int i = this.f1011c;
        int m1234c = m1234c();
        if (m1234c == 6) {
            i |= 4;
        } else if (m1234c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m1234c() {
        int i = this.f1012d;
        return i != -1 ? i : AudioAttributesCompat.m1218a(false, this.f1011c, this.f1009a);
    }

    /* renamed from: d */
    public int m1235d() {
        return this.f1009a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0228c)) {
            return false;
        }
        C0228c c0228c = (C0228c) obj;
        return this.f1010b == c0228c.m1232a() && this.f1011c == c0228c.m1233b() && this.f1009a == c0228c.m1235d() && this.f1012d == c0228c.f1012d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1010b), Integer.valueOf(this.f1011c), Integer.valueOf(this.f1009a), Integer.valueOf(this.f1012d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1012d != -1) {
            sb.append(" stream=");
            sb.append(this.f1012d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m1219a(this.f1009a));
        sb.append(" content=");
        sb.append(this.f1010b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1011c).toUpperCase());
        return sb.toString();
    }
}
