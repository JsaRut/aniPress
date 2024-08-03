package p139d.p225c.p226a.p227a.p234f.p239e;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.f.e.n */
/* loaded from: classes.dex */
public final class C2269n {

    /* renamed from: a */
    public final boolean f8667a;

    /* renamed from: b */
    public final String f8668b;

    /* renamed from: c */
    public final InterfaceC2337q.a f8669c;

    /* renamed from: d */
    public final int f8670d;

    /* renamed from: e */
    public final byte[] f8671e;

    public C2269n(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        C2628e.m11111a((bArr2 == null) ^ (i == 0));
        this.f8667a = z;
        this.f8668b = str;
        this.f8670d = i;
        this.f8671e = bArr2;
        this.f8669c = new InterfaceC2337q.a(m9420a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m9420a(String str) {
        if (str == null) {
            return 1;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return 1;
        }
        if (c2 == 2 || c2 == 3) {
            return 2;
        }
        C2638o.m11160d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        return 1;
    }
}
