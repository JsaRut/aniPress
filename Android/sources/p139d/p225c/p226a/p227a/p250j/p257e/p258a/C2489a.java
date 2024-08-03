package p139d.p225c.p226a.p227a.p250j.p257e.p258a;

import android.net.Uri;
import java.util.List;
import java.util.UUID;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p249i.InterfaceC2398a;
import p139d.p225c.p226a.p227a.p270n.C2621H;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.e.a.a */
/* loaded from: classes.dex */
public class C2489a implements InterfaceC2398a<C2489a> {

    /* renamed from: a */
    public final int f10054a;

    /* renamed from: b */
    public final int f10055b;

    /* renamed from: c */
    public final int f10056c;

    /* renamed from: d */
    public final boolean f10057d;

    /* renamed from: e */
    public final a f10058e;

    /* renamed from: f */
    public final b[] f10059f;

    /* renamed from: g */
    public final long f10060g;

    /* renamed from: h */
    public final long f10061h;

    /* renamed from: d.c.a.a.j.e.a.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final UUID f10062a;

        /* renamed from: b */
        public final byte[] f10063b;

        public a(UUID uuid, byte[] bArr) {
            this.f10062a = uuid;
            this.f10063b = bArr;
        }
    }

    /* renamed from: d.c.a.a.j.e.a.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f10064a;

        /* renamed from: b */
        public final String f10065b;

        /* renamed from: c */
        public final long f10066c;

        /* renamed from: d */
        public final String f10067d;

        /* renamed from: e */
        public final int f10068e;

        /* renamed from: f */
        public final int f10069f;

        /* renamed from: g */
        public final int f10070g;

        /* renamed from: h */
        public final int f10071h;

        /* renamed from: i */
        public final String f10072i;

        /* renamed from: j */
        public final C2676s[] f10073j;

        /* renamed from: k */
        public final int f10074k;

        /* renamed from: l */
        private final String f10075l;

        /* renamed from: m */
        private final String f10076m;

        /* renamed from: n */
        private final List<Long> f10077n;

        /* renamed from: o */
        private final long[] f10078o;

        /* renamed from: p */
        private final long f10079p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C2676s[] c2676sArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, c2676sArr, list, C2622I.m11070a(list, 1000000L, j), C2622I.m11085c(j2, 1000000L, j));
        }

        private b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C2676s[] c2676sArr, List<Long> list, long[] jArr, long j2) {
            this.f10075l = str;
            this.f10076m = str2;
            this.f10064a = i;
            this.f10065b = str3;
            this.f10066c = j;
            this.f10067d = str4;
            this.f10068e = i2;
            this.f10069f = i3;
            this.f10070g = i4;
            this.f10071h = i5;
            this.f10072i = str5;
            this.f10073j = c2676sArr;
            this.f10077n = list;
            this.f10078o = jArr;
            this.f10079p = j2;
            this.f10074k = list.size();
        }

        /* renamed from: a */
        public int m10388a(long j) {
            return C2622I.m11079b(this.f10078o, j, true, true);
        }

        /* renamed from: a */
        public long m10389a(int i) {
            if (i == this.f10074k - 1) {
                return this.f10079p;
            }
            long[] jArr = this.f10078o;
            return jArr[i + 1] - jArr[i];
        }

        /* renamed from: a */
        public Uri m10390a(int i, int i2) {
            C2628e.m11113b(this.f10073j != null);
            C2628e.m11113b(this.f10077n != null);
            C2628e.m11113b(i2 < this.f10077n.size());
            String num = Integer.toString(this.f10073j[i].f11178c);
            String l = this.f10077n.get(i2).toString();
            return C2621H.m11034b(this.f10075l, this.f10076m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        /* renamed from: b */
        public long m10391b(int i) {
            return this.f10078o[i];
        }
    }

    private C2489a(int i, int i2, long j, long j2, int i3, boolean z, a aVar, b[] bVarArr) {
        this.f10054a = i;
        this.f10055b = i2;
        this.f10060g = j;
        this.f10061h = j2;
        this.f10056c = i3;
        this.f10057d = z;
        this.f10058e = aVar;
        this.f10059f = bVarArr;
    }

    public C2489a(int i, int i2, long j, long j2, long j3, int i3, boolean z, a aVar, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : C2622I.m11085c(j2, 1000000L, j), j3 != 0 ? C2622I.m11085c(j3, 1000000L, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }
}
