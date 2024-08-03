package p139d.p143b.p183h;

import p139d.p143b.p148c.p152d.C1688g;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p160l.C1731c;
import p139d.p143b.p183h.C1827c;

/* renamed from: d.b.h.a */
/* loaded from: classes.dex */
public class C1825a implements C1827c.a {

    /* renamed from: a */
    private static final byte[] f6728a = {-1, -40, -1};

    /* renamed from: b */
    private static final int f6729b = f6728a.length;

    /* renamed from: c */
    private static final byte[] f6730c = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: d */
    private static final int f6731d = f6730c.length;

    /* renamed from: e */
    private static final byte[] f6732e = C1829e.m7528a("GIF87a");

    /* renamed from: f */
    private static final byte[] f6733f = C1829e.m7528a("GIF89a");

    /* renamed from: g */
    private static final byte[] f6734g = C1829e.m7528a("BM");

    /* renamed from: h */
    private static final int f6735h = f6734g.length;

    /* renamed from: i */
    private static final String[] f6736i = {"heic", "heix", "hevc", "hevx"};

    /* renamed from: j */
    private static final int f6737j = C1829e.m7528a("ftyp" + f6736i[0]).length;

    /* renamed from: k */
    final int f6738k = C1688g.m6959a(21, 20, f6729b, f6731d, 6, f6735h, f6737j);

    /* renamed from: b */
    private static C1827c m7509b(byte[] bArr, int i) {
        C1691j.m6974a(C1731c.m7102b(bArr, 0, i));
        return C1731c.m7104d(bArr, 0) ? C1826b.f6743e : C1731c.m7103c(bArr, 0) ? C1826b.f6744f : C1731c.m7097a(bArr, 0, i) ? C1731c.m7096a(bArr, 0) ? C1826b.f6747i : C1731c.m7101b(bArr, 0) ? C1826b.f6746h : C1826b.f6745g : C1827c.f6749a;
    }

    /* renamed from: c */
    private static boolean m7510c(byte[] bArr, int i) {
        byte[] bArr2 = f6734g;
        if (i < bArr2.length) {
            return false;
        }
        return C1829e.m7527a(bArr, bArr2);
    }

    /* renamed from: d */
    private static boolean m7511d(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        return C1829e.m7527a(bArr, f6732e) || C1829e.m7527a(bArr, f6733f);
    }

    /* renamed from: e */
    private static boolean m7512e(byte[] bArr, int i) {
        if (i < f6737j || bArr[3] < 8) {
            return false;
        }
        for (String str : f6736i) {
            if (C1829e.m7526a(bArr, bArr.length, C1829e.m7528a("ftyp" + str), f6737j) > -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m7513f(byte[] bArr, int i) {
        byte[] bArr2 = f6728a;
        return i >= bArr2.length && C1829e.m7527a(bArr, bArr2);
    }

    /* renamed from: g */
    private static boolean m7514g(byte[] bArr, int i) {
        byte[] bArr2 = f6730c;
        return i >= bArr2.length && C1829e.m7527a(bArr, bArr2);
    }

    @Override // p139d.p143b.p183h.C1827c.a
    /* renamed from: a */
    public int mo7515a() {
        return this.f6738k;
    }

    @Override // p139d.p143b.p183h.C1827c.a
    /* renamed from: a */
    public final C1827c mo7516a(byte[] bArr, int i) {
        C1691j.m6971a(bArr);
        return C1731c.m7102b(bArr, 0, i) ? m7509b(bArr, i) : m7513f(bArr, i) ? C1826b.f6739a : m7514g(bArr, i) ? C1826b.f6740b : m7511d(bArr, i) ? C1826b.f6741c : m7510c(bArr, i) ? C1826b.f6742d : m7512e(bArr, i) ? C1826b.f6748j : C1827c.f6749a;
    }
}
