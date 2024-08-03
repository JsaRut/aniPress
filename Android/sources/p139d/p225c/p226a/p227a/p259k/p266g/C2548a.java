package p139d.p225c.p226a.p227a.p259k.p266g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import java.nio.charset.Charset;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.C2547g;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.g.a */
/* loaded from: classes.dex */
public final class C2548a extends AbstractC2531c {

    /* renamed from: o */
    private static final int f10546o = C2622I.m11078b("styl");

    /* renamed from: p */
    private static final int f10547p = C2622I.m11078b("tbox");

    /* renamed from: q */
    private final C2644u f10548q;

    /* renamed from: r */
    private boolean f10549r;

    /* renamed from: s */
    private int f10550s;

    /* renamed from: t */
    private int f10551t;

    /* renamed from: u */
    private String f10552u;

    /* renamed from: v */
    private float f10553v;

    /* renamed from: w */
    private int f10554w;

    public C2548a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f10548q = new C2644u();
        m10712a(list);
    }

    /* renamed from: a */
    private static String m10708a(C2644u c2644u) {
        char m11221e;
        m10713a(c2644u.m11208a() >= 2);
        int m11244z = c2644u.m11244z();
        if (m11244z == 0) {
            return "";
        }
        return c2644u.m11210a(m11244z, Charset.forName((c2644u.m11208a() < 2 || !((m11221e = c2644u.m11221e()) == 65279 || m11221e == 65534)) ? "UTF-8" : "UTF-16"));
    }

    /* renamed from: a */
    private static void m10709a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: a */
    private static void m10710a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: a */
    private void m10711a(C2644u c2644u, SpannableStringBuilder spannableStringBuilder) {
        m10713a(c2644u.m11208a() >= 12);
        int m11244z = c2644u.m11244z();
        int m11244z2 = c2644u.m11244z();
        c2644u.m11224f(2);
        int m11238t = c2644u.m11238t();
        c2644u.m11224f(1);
        int m11226h = c2644u.m11226h();
        m10714b(spannableStringBuilder, m11238t, this.f10550s, m11244z, m11244z2, 0);
        m10709a(spannableStringBuilder, m11226h, this.f10551t, m11244z, m11244z2, 0);
    }

    /* renamed from: a */
    private void m10712a(List<byte[]> list) {
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f10550s = bArr[24];
            this.f10551t = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f10552u = "Serif".equals(C2622I.m11057a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            this.f10554w = bArr[25] * 20;
            this.f10549r = (bArr[0] & 32) != 0;
            if (this.f10549r) {
                this.f10553v = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / this.f10554w;
                this.f10553v = C2622I.m11035a(this.f10553v, 0.0f, 0.95f);
                return;
            }
        } else {
            this.f10550s = 0;
            this.f10551t = -1;
            this.f10552u = "sans-serif";
            this.f10549r = false;
        }
        this.f10553v = 0.85f;
    }

    /* renamed from: a */
    private static void m10713a(boolean z) {
        if (!z) {
            throw new C2547g("Unexpected subtitle format.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m10714b(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4e
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = 1
            goto Ld
        Lc:
            r10 = 0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r10 == 0) goto L25
            if (r2 == 0) goto L1f
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 3
            r3.<init>(r4)
            goto L2d
        L1f:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r1)
            goto L2d
        L25:
            if (r2 == 0) goto L30
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2d:
            r5.setSpan(r3, r8, r9, r7)
        L30:
            r6 = r6 & 4
            if (r6 == 0) goto L35
            goto L36
        L35:
            r1 = 0
        L36:
            if (r1 == 0) goto L40
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L40:
            if (r1 != 0) goto L4e
            if (r10 != 0) goto L4e
            if (r2 != 0) goto L4e
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p259k.p266g.C2548a.m10714b(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    protected InterfaceC2537e mo10610a(byte[] bArr, int i, boolean z) {
        this.f10548q.m11213a(bArr, i);
        String m10708a = m10708a(this.f10548q);
        if (m10708a.isEmpty()) {
            return C2549b.f10555a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10708a);
        m10714b(spannableStringBuilder, this.f10550s, 0, 0, spannableStringBuilder.length(), 16711680);
        m10709a(spannableStringBuilder, this.f10551t, -1, 0, spannableStringBuilder.length(), 16711680);
        m10710a(spannableStringBuilder, this.f10552u, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.f10553v;
        while (this.f10548q.m11208a() >= 8) {
            int m11217c = this.f10548q.m11217c();
            int m11226h = this.f10548q.m11226h();
            int m11226h2 = this.f10548q.m11226h();
            if (m11226h2 == f10546o) {
                m10713a(this.f10548q.m11208a() >= 2);
                int m11244z = this.f10548q.m11244z();
                for (int i2 = 0; i2 < m11244z; i2++) {
                    m10711a(this.f10548q, spannableStringBuilder);
                }
            } else if (m11226h2 == f10547p && this.f10549r) {
                m10713a(this.f10548q.m11208a() >= 2);
                f = C2622I.m11035a(this.f10548q.m11244z() / this.f10554w, 0.0f, 0.95f);
            }
            this.f10548q.m11222e(m11217c + m11226h);
        }
        return new C2549b(new C2527b(spannableStringBuilder, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
