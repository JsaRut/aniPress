package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.util.List;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.b.h */
/* loaded from: classes.dex */
public final class C2171h {

    /* renamed from: a */
    private static final int[] f7849a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f7850b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f7851c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f7852d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f7853e = {32, 40, 48, 56, 64, 80, 96, C0121j.AppCompatTheme_windowActionBarOverlay, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f7854f = {69, 87, C0121j.AppCompatTheme_textColorAlertDialogListItem, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: d.c.a.a.b.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f7855a;

        /* renamed from: b */
        public final int f7856b;

        /* renamed from: c */
        public final int f7857c;

        /* renamed from: d */
        public final int f7858d;

        /* renamed from: e */
        public final int f7859e;

        /* renamed from: f */
        public final int f7860f;

        private a(String str, int i, int i2, int i3, int i4, int i5) {
            this.f7855a = str;
            this.f7856b = i;
            this.f7858d = i2;
            this.f7857c = i3;
            this.f7859e = i4;
            this.f7860f = i5;
        }

        /* synthetic */ a(String str, int i, int i2, int i3, int i4, int i5, C2170g c2170g) {
            this(str, i, i2, i3, i4, i5);
        }
    }

    /* renamed from: a */
    public static int m8847a() {
        return 1536;
    }

    /* renamed from: a */
    private static int m8848a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f7850b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f7854f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f7853e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: a */
    public static int m8849a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & (-16777217)) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m8850a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: a */
    public static int m8851a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 255) >> 3) == 16) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return m8848a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: a */
    public static a m8852a(C2643t c2643t) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m11191a;
        int i6;
        int i7;
        int i8;
        int m11202d = c2643t.m11202d();
        c2643t.m11201c(40);
        boolean z = c2643t.m11191a(5) == 16;
        c2643t.m11198b(m11202d);
        int i9 = -1;
        if (z) {
            c2643t.m11201c(16);
            int m11191a2 = c2643t.m11191a(2);
            if (m11191a2 == 0) {
                i9 = 0;
            } else if (m11191a2 == 1) {
                i9 = 1;
            } else if (m11191a2 == 2) {
                i9 = 2;
            }
            c2643t.m11201c(3);
            int m11191a3 = (c2643t.m11191a(11) + 1) * 2;
            int m11191a4 = c2643t.m11191a(2);
            if (m11191a4 == 3) {
                i7 = f7851c[c2643t.m11191a(2)];
                m11191a = 3;
                i6 = 6;
            } else {
                m11191a = c2643t.m11191a(2);
                i6 = f7849a[m11191a];
                i7 = f7850b[m11191a4];
            }
            int i10 = i6 * 256;
            int m11191a5 = c2643t.m11191a(3);
            boolean m11204e = c2643t.m11204e();
            int i11 = f7852d[m11191a5] + (m11204e ? 1 : 0);
            c2643t.m11201c(10);
            if (c2643t.m11204e()) {
                c2643t.m11201c(8);
            }
            if (m11191a5 == 0) {
                c2643t.m11201c(5);
                if (c2643t.m11204e()) {
                    c2643t.m11201c(8);
                }
            }
            if (i9 == 1 && c2643t.m11204e()) {
                c2643t.m11201c(16);
            }
            if (c2643t.m11204e()) {
                if (m11191a5 > 2) {
                    c2643t.m11201c(2);
                }
                if ((m11191a5 & 1) != 0 && m11191a5 > 2) {
                    c2643t.m11201c(6);
                }
                if ((m11191a5 & 4) != 0) {
                    c2643t.m11201c(6);
                }
                if (m11204e && c2643t.m11204e()) {
                    c2643t.m11201c(5);
                }
                if (i9 == 0) {
                    if (c2643t.m11204e()) {
                        c2643t.m11201c(6);
                    }
                    if (m11191a5 == 0 && c2643t.m11204e()) {
                        c2643t.m11201c(6);
                    }
                    if (c2643t.m11204e()) {
                        c2643t.m11201c(6);
                    }
                    int m11191a6 = c2643t.m11191a(2);
                    if (m11191a6 == 1) {
                        c2643t.m11201c(5);
                    } else if (m11191a6 == 2) {
                        c2643t.m11201c(12);
                    } else if (m11191a6 == 3) {
                        int m11191a7 = c2643t.m11191a(5);
                        if (c2643t.m11204e()) {
                            c2643t.m11201c(5);
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(4);
                            }
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(4);
                            }
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(4);
                            }
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(4);
                            }
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(4);
                            }
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(4);
                            }
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(4);
                            }
                            if (c2643t.m11204e()) {
                                if (c2643t.m11204e()) {
                                    c2643t.m11201c(4);
                                }
                                if (c2643t.m11204e()) {
                                    c2643t.m11201c(4);
                                }
                            }
                        }
                        if (c2643t.m11204e()) {
                            c2643t.m11201c(5);
                            if (c2643t.m11204e()) {
                                c2643t.m11201c(7);
                                if (c2643t.m11204e()) {
                                    c2643t.m11201c(8);
                                }
                            }
                        }
                        c2643t.m11201c((m11191a7 + 2) * 8);
                        c2643t.m11197b();
                    }
                    if (m11191a5 < 2) {
                        if (c2643t.m11204e()) {
                            c2643t.m11201c(14);
                        }
                        if (m11191a5 == 0 && c2643t.m11204e()) {
                            c2643t.m11201c(14);
                        }
                    }
                    if (c2643t.m11204e()) {
                        if (m11191a == 0) {
                            c2643t.m11201c(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (c2643t.m11204e()) {
                                    c2643t.m11201c(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c2643t.m11204e()) {
                c2643t.m11201c(5);
                if (m11191a5 == 2) {
                    c2643t.m11201c(4);
                }
                if (m11191a5 >= 6) {
                    c2643t.m11201c(2);
                }
                if (c2643t.m11204e()) {
                    c2643t.m11201c(8);
                }
                if (m11191a5 == 0 && c2643t.m11204e()) {
                    c2643t.m11201c(8);
                }
                i8 = 3;
                if (m11191a4 < 3) {
                    c2643t.m11205f();
                }
            } else {
                i8 = 3;
            }
            if (i9 == 0 && m11191a != i8) {
                c2643t.m11205f();
            }
            if (i9 == 2 && (m11191a == i8 || c2643t.m11204e())) {
                c2643t.m11201c(6);
            }
            str = (c2643t.m11204e() && c2643t.m11191a(6) == 1 && c2643t.m11191a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i9;
            i = m11191a3;
            i2 = i7;
            i5 = i10;
            i3 = i11;
        } else {
            c2643t.m11201c(32);
            int m11191a8 = c2643t.m11191a(2);
            int m8848a = m8848a(m11191a8, c2643t.m11191a(6));
            c2643t.m11201c(8);
            int m11191a9 = c2643t.m11191a(3);
            if ((m11191a9 & 1) != 0 && m11191a9 != 1) {
                c2643t.m11201c(2);
            }
            if ((m11191a9 & 4) != 0) {
                c2643t.m11201c(2);
            }
            if (m11191a9 == 2) {
                c2643t.m11201c(2);
            }
            str = "audio/ac3";
            i = m8848a;
            i2 = f7850b[m11191a8];
            i3 = f7852d[m11191a9] + (c2643t.m11204e() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new a(str, i4, i3, i2, i, i5);
    }

    /* renamed from: a */
    public static C2676s m8853a(C2644u c2644u, String str, String str2, C2213m c2213m) {
        int i = f7850b[(c2644u.m11238t() & 192) >> 6];
        int m11238t = c2644u.m11238t();
        int i2 = f7852d[(m11238t & 56) >> 3];
        if ((m11238t & 4) != 0) {
            i2++;
        }
        return C2676s.m11426a(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, c2213m, 0, str2);
    }

    /* renamed from: b */
    public static int m8854b(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f7849a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    /* renamed from: b */
    public static int m8855b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    /* renamed from: b */
    public static C2676s m8856b(C2644u c2644u, String str, String str2, C2213m c2213m) {
        c2644u.m11224f(2);
        int i = f7850b[(c2644u.m11238t() & 192) >> 6];
        int m11238t = c2644u.m11238t();
        int i2 = f7852d[(m11238t & 14) >> 1];
        if ((m11238t & 1) != 0) {
            i2++;
        }
        if (((c2644u.m11238t() & 30) >> 1) > 0 && (2 & c2644u.m11238t()) != 0) {
            i2 += 2;
        }
        return C2676s.m11426a(str, (c2644u.m11208a() <= 0 || (c2644u.m11238t() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, (List<byte[]>) null, c2213m, 0, str2);
    }
}
