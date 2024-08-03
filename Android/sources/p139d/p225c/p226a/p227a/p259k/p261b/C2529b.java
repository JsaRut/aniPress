package p139d.p225c.p226a.p227a.p259k.p261b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2643t;

/* renamed from: d.c.a.a.k.b.b */
/* loaded from: classes.dex */
final class C2529b {

    /* renamed from: a */
    private static final byte[] f10404a = {0, 7, 8, 15};

    /* renamed from: b */
    private static final byte[] f10405b = {0, 119, -120, -1};

    /* renamed from: c */
    private static final byte[] f10406c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: d */
    private final Paint f10407d = new Paint();

    /* renamed from: e */
    private final Paint f10408e;

    /* renamed from: f */
    private final Canvas f10409f;

    /* renamed from: g */
    private final b f10410g;

    /* renamed from: h */
    private final a f10411h;

    /* renamed from: i */
    private final h f10412i;

    /* renamed from: j */
    private Bitmap f10413j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f10414a;

        /* renamed from: b */
        public final int[] f10415b;

        /* renamed from: c */
        public final int[] f10416c;

        /* renamed from: d */
        public final int[] f10417d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f10414a = i;
            this.f10415b = iArr;
            this.f10416c = iArr2;
            this.f10417d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f10418a;

        /* renamed from: b */
        public final int f10419b;

        /* renamed from: c */
        public final int f10420c;

        /* renamed from: d */
        public final int f10421d;

        /* renamed from: e */
        public final int f10422e;

        /* renamed from: f */
        public final int f10423f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f10418a = i;
            this.f10419b = i2;
            this.f10420c = i3;
            this.f10421d = i4;
            this.f10422e = i5;
            this.f10423f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f10424a;

        /* renamed from: b */
        public final boolean f10425b;

        /* renamed from: c */
        public final byte[] f10426c;

        /* renamed from: d */
        public final byte[] f10427d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f10424a = i;
            this.f10425b = z;
            this.f10426c = bArr;
            this.f10427d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f10428a;

        /* renamed from: b */
        public final int f10429b;

        /* renamed from: c */
        public final int f10430c;

        /* renamed from: d */
        public final SparseArray<e> f10431d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.f10428a = i;
            this.f10429b = i2;
            this.f10430c = i3;
            this.f10431d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final int f10432a;

        /* renamed from: b */
        public final int f10433b;

        public e(int i, int i2) {
            this.f10432a = i;
            this.f10433b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final int f10434a;

        /* renamed from: b */
        public final boolean f10435b;

        /* renamed from: c */
        public final int f10436c;

        /* renamed from: d */
        public final int f10437d;

        /* renamed from: e */
        public final int f10438e;

        /* renamed from: f */
        public final int f10439f;

        /* renamed from: g */
        public final int f10440g;

        /* renamed from: h */
        public final int f10441h;

        /* renamed from: i */
        public final int f10442i;

        /* renamed from: j */
        public final int f10443j;

        /* renamed from: k */
        public final SparseArray<g> f10444k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<g> sparseArray) {
            this.f10434a = i;
            this.f10435b = z;
            this.f10436c = i2;
            this.f10437d = i3;
            this.f10438e = i4;
            this.f10439f = i5;
            this.f10440g = i6;
            this.f10441h = i7;
            this.f10442i = i8;
            this.f10443j = i9;
            this.f10444k = sparseArray;
        }

        /* renamed from: a */
        public void m10629a(f fVar) {
            if (fVar == null) {
                return;
            }
            SparseArray<g> sparseArray = fVar.f10444k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f10444k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final int f10445a;

        /* renamed from: b */
        public final int f10446b;

        /* renamed from: c */
        public final int f10447c;

        /* renamed from: d */
        public final int f10448d;

        /* renamed from: e */
        public final int f10449e;

        /* renamed from: f */
        public final int f10450f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f10445a = i;
            this.f10446b = i2;
            this.f10447c = i3;
            this.f10448d = i4;
            this.f10449e = i5;
            this.f10450f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.b.b$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final int f10451a;

        /* renamed from: b */
        public final int f10452b;

        /* renamed from: c */
        public final SparseArray<f> f10453c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<a> f10454d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<c> f10455e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<a> f10456f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<c> f10457g = new SparseArray<>();

        /* renamed from: h */
        public b f10458h;

        /* renamed from: i */
        public d f10459i;

        public h(int i, int i2) {
            this.f10451a = i;
            this.f10452b = i2;
        }

        /* renamed from: a */
        public void m10630a() {
            this.f10453c.clear();
            this.f10454d.clear();
            this.f10455e.clear();
            this.f10456f.clear();
            this.f10457g.clear();
            this.f10458h = null;
            this.f10459i = null;
        }
    }

    public C2529b(int i, int i2) {
        this.f10407d.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f10407d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f10407d.setPathEffect(null);
        this.f10408e = new Paint();
        this.f10408e.setStyle(Paint.Style.FILL);
        this.f10408e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f10408e.setPathEffect(null);
        this.f10409f = new Canvas();
        this.f10410g = new b(719, 575, 0, 719, 0, 575);
        this.f10411h = new a(0, m10622b(), m10625c(), m10626d());
        this.f10412i = new h(i, i2);
    }

    /* renamed from: a */
    private static int m10611a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[LOOP:0: B:2:0x0009->B:13:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m10612a(p139d.p225c.p226a.p227a.p270n.C2643t r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.m11191a(r3)
            r5 = 1
            if (r4 == 0) goto L15
            r12 = r2
            r3 = r4
        L13:
            r11 = 1
            goto L59
        L15:
            boolean r4 = r13.m11204e()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.m11191a(r6)
            int r4 = r4 + r6
        L21:
            int r3 = r13.m11191a(r3)
            r12 = r2
            r11 = r4
            goto L59
        L28:
            boolean r4 = r13.m11204e()
            if (r4 == 0) goto L31
            r12 = r2
            r3 = 0
            goto L13
        L31:
            int r4 = r13.m11191a(r3)
            if (r4 == 0) goto L56
            if (r4 == r5) goto L52
            if (r4 == r3) goto L4a
            if (r4 == r6) goto L41
            r12 = r2
            r3 = 0
            r11 = 0
            goto L59
        L41:
            r4 = 8
            int r4 = r13.m11191a(r4)
            int r4 = r4 + 29
            goto L21
        L4a:
            r4 = 4
            int r4 = r13.m11191a(r4)
            int r4 = r4 + 12
            goto L21
        L52:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L59
        L56:
            r3 = 0
            r11 = 0
            r12 = 1
        L59:
            if (r11 == 0) goto L77
            if (r8 == 0) goto L77
            if (r15 == 0) goto L61
            r3 = r15[r3]
        L61:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L77:
            int r10 = r10 + r11
            if (r12 == 0) goto L7b
            return r10
        L7b:
            r2 = r12
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p259k.p261b.C2529b.m10612a(d.c.a.a.n.t, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: a */
    private static a m10613a(C2643t c2643t, int i) {
        int m11191a;
        int i2;
        int m11191a2;
        int i3;
        int i4;
        int i5 = 8;
        int m11191a3 = c2643t.m11191a(8);
        c2643t.m11201c(8);
        int i6 = 2;
        int i7 = i - 2;
        int[] m10622b = m10622b();
        int[] m10625c = m10625c();
        int[] m10626d = m10626d();
        while (i7 > 0) {
            int m11191a4 = c2643t.m11191a(i5);
            int m11191a5 = c2643t.m11191a(i5);
            int i8 = i7 - 2;
            int[] iArr = (m11191a5 & 128) != 0 ? m10622b : (m11191a5 & 64) != 0 ? m10625c : m10626d;
            if ((m11191a5 & 1) != 0) {
                i3 = c2643t.m11191a(i5);
                i4 = c2643t.m11191a(i5);
                m11191a = c2643t.m11191a(i5);
                m11191a2 = c2643t.m11191a(i5);
                i2 = i8 - 4;
            } else {
                int m11191a6 = c2643t.m11191a(6) << i6;
                int m11191a7 = c2643t.m11191a(4) << 4;
                m11191a = c2643t.m11191a(4) << 4;
                i2 = i8 - 2;
                m11191a2 = c2643t.m11191a(i6) << 6;
                i3 = m11191a6;
                i4 = m11191a7;
            }
            if (i3 == 0) {
                i4 = 0;
                m11191a = 0;
                m11191a2 = 255;
            }
            double d2 = i3;
            double d3 = i4 - 128;
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d4 = m11191a - 128;
            Double.isNaN(d4);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d2);
            iArr[m11191a4] = m10611a((byte) (255 - (m11191a2 & 255)), C2622I.m11038a((int) (d2 + (1.402d * d3)), 0, 255), C2622I.m11038a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C2622I.m11038a((int) (d2 + (d4 * 1.772d)), 0, 255));
            i7 = i2;
            m11191a3 = m11191a3;
            i5 = 8;
            i6 = 2;
        }
        return new a(m11191a3, m10622b, m10625c, m10626d);
    }

    /* renamed from: a */
    private static b m10614a(C2643t c2643t) {
        int i;
        int i2;
        int i3;
        int i4;
        c2643t.m11201c(4);
        boolean m11204e = c2643t.m11204e();
        c2643t.m11201c(3);
        int m11191a = c2643t.m11191a(16);
        int m11191a2 = c2643t.m11191a(16);
        if (m11204e) {
            int m11191a3 = c2643t.m11191a(16);
            int m11191a4 = c2643t.m11191a(16);
            int m11191a5 = c2643t.m11191a(16);
            i2 = c2643t.m11191a(16);
            i = m11191a4;
            i4 = m11191a5;
            i3 = m11191a3;
        } else {
            i = m11191a;
            i2 = m11191a2;
            i3 = 0;
            i4 = 0;
        }
        return new b(m11191a, m11191a2, i3, i, i4, i2);
    }

    /* renamed from: a */
    private static void m10615a(c cVar, a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? aVar.f10417d : i == 2 ? aVar.f10416c : aVar.f10415b;
        m10617a(cVar.f10426c, iArr, i, i2, i3, paint, canvas);
        m10617a(cVar.f10427d, iArr, i, i2, i3 + 1, paint, canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static void m10616a(C2643t c2643t, h hVar) {
        SparseArray sparseArray;
        a aVar;
        int i;
        a aVar2;
        c cVar;
        int m11191a = c2643t.m11191a(8);
        int m11191a2 = c2643t.m11191a(16);
        int m11191a3 = c2643t.m11191a(16);
        int m11200c = c2643t.m11200c() + m11191a3;
        if (m11191a3 * 8 > c2643t.m11190a()) {
            C2638o.m11160d("DvbParser", "Data field length exceeds limit");
            c2643t.m11201c(c2643t.m11190a());
            return;
        }
        switch (m11191a) {
            case 16:
                if (m11191a2 == hVar.f10451a) {
                    d dVar = hVar.f10459i;
                    d m10621b = m10621b(c2643t, m11191a3);
                    if (m10621b.f10430c == 0) {
                        if (dVar != null && dVar.f10429b != m10621b.f10429b) {
                            hVar.f10459i = m10621b;
                            break;
                        }
                    } else {
                        hVar.f10459i = m10621b;
                        hVar.f10453c.clear();
                        hVar.f10454d.clear();
                        hVar.f10455e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f10459i;
                if (m11191a2 == hVar.f10451a && dVar2 != null) {
                    f m10624c = m10624c(c2643t, m11191a3);
                    if (dVar2.f10430c == 0) {
                        m10624c.m10629a(hVar.f10453c.get(m10624c.f10434a));
                    }
                    hVar.f10453c.put(m10624c.f10434a, m10624c);
                    break;
                }
                break;
            case 18:
                if (m11191a2 == hVar.f10451a) {
                    a m10613a = m10613a(c2643t, m11191a3);
                    sparseArray = hVar.f10454d;
                    aVar = m10613a;
                } else if (m11191a2 == hVar.f10452b) {
                    a m10613a2 = m10613a(c2643t, m11191a3);
                    sparseArray = hVar.f10456f;
                    aVar = m10613a2;
                }
                i = aVar.f10414a;
                aVar2 = aVar;
                sparseArray.put(i, aVar2);
                break;
            case 19:
                if (m11191a2 == hVar.f10451a) {
                    c m10620b = m10620b(c2643t);
                    sparseArray = hVar.f10455e;
                    cVar = m10620b;
                } else if (m11191a2 == hVar.f10452b) {
                    c m10620b2 = m10620b(c2643t);
                    sparseArray = hVar.f10457g;
                    cVar = m10620b2;
                }
                i = cVar.f10424a;
                aVar2 = cVar;
                sparseArray.put(i, aVar2);
                break;
            case 20:
                if (m11191a2 == hVar.f10451a) {
                    hVar.f10458h = m10614a(c2643t);
                    break;
                }
                break;
        }
        c2643t.m11203d(m11200c - c2643t.m11200c());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001f. Please report as an issue. */
    /* renamed from: a */
    private static void m10617a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] m10618a;
        byte[] bArr2;
        byte[] bArr3;
        int m10612a;
        C2643t c2643t = new C2643t(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (c2643t.m11190a() != 0) {
            int m11191a = c2643t.m11191a(8);
            if (m11191a != 240) {
                switch (m11191a) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                                m10612a = m10612a(c2643t, iArr, bArr2, i4, i5, paint, canvas);
                                c2643t.m11197b();
                                i4 = m10612a;
                                break;
                            } else {
                                bArr3 = bArr5 == null ? f10404a : bArr5;
                            }
                        } else {
                            bArr3 = bArr4 == null ? f10405b : bArr4;
                        }
                        bArr2 = bArr3;
                        m10612a = m10612a(c2643t, iArr, bArr2, i4, i5, paint, canvas);
                        c2643t.m11197b();
                        i4 = m10612a;
                    case 17:
                        m10612a = m10619b(c2643t, iArr, i == 3 ? f10406c : null, i4, i5, paint, canvas);
                        c2643t.m11197b();
                        i4 = m10612a;
                        break;
                    case 18:
                        m10612a = m10623c(c2643t, iArr, null, i4, i5, paint, canvas);
                        i4 = m10612a;
                        break;
                    default:
                        switch (m11191a) {
                            case C0121j.AppCompatTheme_activityChooserViewStyle /* 32 */:
                                bArr5 = m10618a(4, 4, c2643t);
                                continue;
                            case C0121j.AppCompatTheme_alertDialogButtonGroupStyle /* 33 */:
                                m10618a = m10618a(4, 8, c2643t);
                                break;
                            case C0121j.AppCompatTheme_alertDialogCenterButtons /* 34 */:
                                m10618a = m10618a(16, 8, c2643t);
                                break;
                        }
                        bArr4 = m10618a;
                        break;
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m10618a(int i, int i2, C2643t c2643t) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c2643t.m11191a(i2);
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[LOOP:0: B:2:0x0009->B:13:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m10619b(p139d.p225c.p226a.p227a.p270n.C2643t r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.m11191a(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L16
            r12 = r2
            r3 = r4
        L14:
            r11 = 1
            goto L66
        L16:
            boolean r4 = r13.m11204e()
            r7 = 3
            if (r4 != 0) goto L2d
            int r3 = r13.m11191a(r7)
            if (r3 == 0) goto L29
            int r3 = r3 + 2
            r12 = r2
            r11 = r3
            r3 = 0
            goto L66
        L29:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L66
        L2d:
            boolean r4 = r13.m11204e()
            if (r4 != 0) goto L3f
            int r4 = r13.m11191a(r5)
            int r4 = r4 + r3
        L38:
            int r3 = r13.m11191a(r3)
            r12 = r2
            r11 = r4
            goto L66
        L3f:
            int r4 = r13.m11191a(r5)
            if (r4 == 0) goto L63
            if (r4 == r6) goto L5f
            if (r4 == r5) goto L58
            if (r4 == r7) goto L4f
            r12 = r2
            r3 = 0
            r11 = 0
            goto L66
        L4f:
            r4 = 8
            int r4 = r13.m11191a(r4)
            int r4 = r4 + 25
            goto L38
        L58:
            int r4 = r13.m11191a(r3)
            int r4 = r4 + 9
            goto L38
        L5f:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L66
        L63:
            r12 = r2
            r3 = 0
            goto L14
        L66:
            if (r11 == 0) goto L82
            if (r8 == 0) goto L82
            if (r15 == 0) goto L6e
            r3 = r15[r3]
        L6e:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L82:
            int r10 = r10 + r11
            if (r12 == 0) goto L86
            return r10
        L86:
            r2 = r12
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p259k.p261b.C2529b.m10619b(d.c.a.a.n.t, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: b */
    private static c m10620b(C2643t c2643t) {
        byte[] bArr;
        int m11191a = c2643t.m11191a(16);
        c2643t.m11201c(4);
        int m11191a2 = c2643t.m11191a(2);
        boolean m11204e = c2643t.m11204e();
        c2643t.m11201c(1);
        byte[] bArr2 = null;
        if (m11191a2 == 1) {
            c2643t.m11201c(c2643t.m11191a(8) * 16);
        } else if (m11191a2 == 0) {
            int m11191a3 = c2643t.m11191a(16);
            int m11191a4 = c2643t.m11191a(16);
            if (m11191a3 > 0) {
                bArr2 = new byte[m11191a3];
                c2643t.m11199b(bArr2, 0, m11191a3);
            }
            if (m11191a4 > 0) {
                bArr = new byte[m11191a4];
                c2643t.m11199b(bArr, 0, m11191a4);
                return new c(m11191a, m11204e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(m11191a, m11204e, bArr2, bArr);
    }

    /* renamed from: b */
    private static d m10621b(C2643t c2643t, int i) {
        int m11191a = c2643t.m11191a(8);
        int m11191a2 = c2643t.m11191a(4);
        int m11191a3 = c2643t.m11191a(2);
        c2643t.m11201c(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int m11191a4 = c2643t.m11191a(8);
            c2643t.m11201c(8);
            i2 -= 6;
            sparseArray.put(m11191a4, new e(c2643t.m11191a(16), c2643t.m11191a(16)));
        }
        return new d(m11191a, m11191a2, m11191a3, sparseArray);
    }

    /* renamed from: b */
    private static int[] m10622b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: c */
    private static int m10623c(C2643t c2643t, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int m11191a;
        boolean z;
        int i3;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int m11191a2 = c2643t.m11191a(8);
            if (m11191a2 != 0) {
                z = z2;
                m11191a = m11191a2;
                i3 = 1;
            } else if (c2643t.m11204e()) {
                int m11191a3 = c2643t.m11191a(7);
                m11191a = c2643t.m11191a(8);
                z = z2;
                i3 = m11191a3;
            } else {
                int m11191a4 = c2643t.m11191a(7);
                if (m11191a4 != 0) {
                    z = z2;
                    i3 = m11191a4;
                    m11191a = 0;
                } else {
                    m11191a = 0;
                    i3 = 0;
                    z = true;
                }
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    m11191a = bArr[m11191a];
                }
                paint.setColor(iArr[m11191a]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: c */
    private static f m10624c(C2643t c2643t, int i) {
        int m11191a;
        int m11191a2;
        int m11191a3 = c2643t.m11191a(8);
        c2643t.m11201c(4);
        boolean m11204e = c2643t.m11204e();
        c2643t.m11201c(3);
        int i2 = 16;
        int m11191a4 = c2643t.m11191a(16);
        int m11191a5 = c2643t.m11191a(16);
        int m11191a6 = c2643t.m11191a(3);
        int m11191a7 = c2643t.m11191a(3);
        int i3 = 2;
        c2643t.m11201c(2);
        int m11191a8 = c2643t.m11191a(8);
        int m11191a9 = c2643t.m11191a(8);
        int m11191a10 = c2643t.m11191a(4);
        int m11191a11 = c2643t.m11191a(2);
        c2643t.m11201c(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int m11191a12 = c2643t.m11191a(i2);
            int m11191a13 = c2643t.m11191a(i3);
            int m11191a14 = c2643t.m11191a(i3);
            int m11191a15 = c2643t.m11191a(12);
            int i5 = m11191a11;
            c2643t.m11201c(4);
            int m11191a16 = c2643t.m11191a(12);
            i4 -= 6;
            if (m11191a13 == 1 || m11191a13 == 2) {
                i4 -= 2;
                m11191a = c2643t.m11191a(8);
                m11191a2 = c2643t.m11191a(8);
            } else {
                m11191a = 0;
                m11191a2 = 0;
            }
            sparseArray.put(m11191a12, new g(m11191a13, m11191a14, m11191a15, m11191a16, m11191a, m11191a2));
            m11191a11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new f(m11191a3, m11204e, m11191a4, m11191a5, m11191a6, m11191a7, m11191a8, m11191a9, m11191a10, m11191a11, sparseArray);
    }

    /* renamed from: c */
    private static int[] m10625c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                iArr[i] = m10611a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m10611a(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: d */
    private static int[] m10626d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < iArr.length; i++) {
            if (i < 8) {
                iArr[i] = m10611a(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m10611a(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m10611a(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m10611a(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m10611a(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public List<C2527b> m10627a(byte[] bArr, int i) {
        int i2;
        SparseArray<g> sparseArray;
        C2643t c2643t = new C2643t(bArr, i);
        while (c2643t.m11190a() >= 48 && c2643t.m11191a(8) == 15) {
            m10616a(c2643t, this.f10412i);
        }
        h hVar = this.f10412i;
        if (hVar.f10459i == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f10458h;
        if (bVar == null) {
            bVar = this.f10410g;
        }
        Bitmap bitmap = this.f10413j;
        if (bitmap == null || bVar.f10418a + 1 != bitmap.getWidth() || bVar.f10419b + 1 != this.f10413j.getHeight()) {
            this.f10413j = Bitmap.createBitmap(bVar.f10418a + 1, bVar.f10419b + 1, Bitmap.Config.ARGB_8888);
            this.f10409f.setBitmap(this.f10413j);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = this.f10412i.f10459i.f10431d;
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            e valueAt = sparseArray2.valueAt(i3);
            f fVar = this.f10412i.f10453c.get(sparseArray2.keyAt(i3));
            int i4 = valueAt.f10432a + bVar.f10420c;
            int i5 = valueAt.f10433b + bVar.f10422e;
            float f2 = i4;
            float f3 = i5;
            this.f10409f.clipRect(f2, f3, Math.min(fVar.f10436c + i4, bVar.f10421d), Math.min(fVar.f10437d + i5, bVar.f10423f), Region.Op.REPLACE);
            a aVar = this.f10412i.f10454d.get(fVar.f10440g);
            if (aVar == null && (aVar = this.f10412i.f10456f.get(fVar.f10440g)) == null) {
                aVar = this.f10411h;
            }
            SparseArray<g> sparseArray3 = fVar.f10444k;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i6);
                g valueAt2 = sparseArray3.valueAt(i6);
                c cVar = this.f10412i.f10455e.get(keyAt);
                c cVar2 = cVar == null ? this.f10412i.f10457g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i2 = i6;
                    sparseArray = sparseArray3;
                    m10615a(cVar2, aVar, fVar.f10439f, valueAt2.f10447c + i4, i5 + valueAt2.f10448d, cVar2.f10425b ? null : this.f10407d, this.f10409f);
                } else {
                    i2 = i6;
                    sparseArray = sparseArray3;
                }
                i6 = i2 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f10435b) {
                int i7 = fVar.f10439f;
                this.f10408e.setColor(i7 == 3 ? aVar.f10417d[fVar.f10441h] : i7 == 2 ? aVar.f10416c[fVar.f10442i] : aVar.f10415b[fVar.f10443j]);
                this.f10409f.drawRect(f2, f3, fVar.f10436c + i4, fVar.f10437d + i5, this.f10408e);
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.f10413j, i4, i5, fVar.f10436c, fVar.f10437d);
            int i8 = bVar.f10418a;
            int i9 = bVar.f10419b;
            arrayList.add(new C2527b(createBitmap, f2 / i8, 0, f3 / i9, 0, fVar.f10436c / i8, fVar.f10437d / i9));
            this.f10409f.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m10628a() {
        this.f10412i.m10630a();
    }
}
