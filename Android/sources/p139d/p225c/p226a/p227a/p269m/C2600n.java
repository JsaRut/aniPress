package p139d.p225c.p226a.p227a.p269m;

import android.net.Uri;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.m.n */
/* loaded from: classes.dex */
public final class C2600n {

    /* renamed from: a */
    public final Uri f10782a;

    /* renamed from: b */
    public final int f10783b;

    /* renamed from: c */
    public final byte[] f10784c;

    /* renamed from: d */
    @Deprecated
    public final byte[] f10785d;

    /* renamed from: e */
    public final long f10786e;

    /* renamed from: f */
    public final long f10787f;

    /* renamed from: g */
    public final long f10788g;

    /* renamed from: h */
    public final String f10789h;

    /* renamed from: i */
    public final int f10790i;

    public C2600n(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public C2600n(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        boolean z = true;
        C2628e.m11111a(j >= 0);
        C2628e.m11111a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C2628e.m11111a(z);
        this.f10782a = uri;
        this.f10783b = i;
        this.f10784c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f10785d = this.f10784c;
        this.f10786e = j;
        this.f10787f = j2;
        this.f10788g = j3;
        this.f10789h = str;
        this.f10790i = i2;
    }

    public C2600n(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C2600n(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C2600n(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C2600n(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    /* renamed from: a */
    public static String m10926a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new AssertionError(i);
    }

    /* renamed from: a */
    public C2600n m10927a(long j) {
        long j2 = this.f10788g;
        return m10928a(j, j2 != -1 ? j2 - j : -1L);
    }

    /* renamed from: a */
    public C2600n m10928a(long j, long j2) {
        return (j == 0 && this.f10788g == j2) ? this : new C2600n(this.f10782a, this.f10783b, this.f10784c, this.f10786e + j, this.f10787f + j, j2, this.f10789h, this.f10790i);
    }

    /* renamed from: a */
    public final String m10929a() {
        return m10926a(this.f10783b);
    }

    /* renamed from: b */
    public boolean m10930b(int i) {
        return (this.f10790i & i) == i;
    }

    public String toString() {
        return "DataSpec[" + m10929a() + " " + this.f10782a + ", " + Arrays.toString(this.f10784c) + ", " + this.f10786e + ", " + this.f10787f + ", " + this.f10788g + ", " + this.f10789h + ", " + this.f10790i + "]";
    }
}
