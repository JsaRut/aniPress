package p139d.p143b.p184i.p200n;

import com.facebook.imagepipeline.nativecode.JpegTranscoder;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1683b;
import p139d.p143b.p148c.p152d.C1686e;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.AbstractC1713j;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p159k.EnumC1727e;
import p139d.p143b.p183h.C1826b;
import p139d.p143b.p183h.C1827c;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p191e.C1882f;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.ua */
/* loaded from: classes.dex */
public class C2010ua implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private static final C1686e<Integer> f7327a = C1686e.m6955a(2, 7, 4, 5);

    /* renamed from: b */
    private final Executor f7328b;

    /* renamed from: c */
    private final InterfaceC1711h f7329c;

    /* renamed from: d */
    private final boolean f7330d;

    /* renamed from: e */
    private final InterfaceC1996na<C1920d> f7331e;

    /* renamed from: f */
    private final boolean f7332f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.i.n.ua$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2005s<C1920d, C1920d> {

        /* renamed from: c */
        private final InterfaceC1998oa f7333c;

        /* renamed from: d */
        private boolean f7334d;

        /* renamed from: e */
        private final C1949I f7335e;

        public a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
            super(interfaceC1995n);
            this.f7334d = false;
            this.f7333c = interfaceC1998oa;
            this.f7335e = new C1949I(C2010ua.this.f7328b, new C2006sa(this, C2010ua.this), 100);
            this.f7333c.mo8106a(new C2008ta(this, C2010ua.this, interfaceC1995n));
        }

        /* renamed from: a */
        private C1920d m8209a(C1920d c1920d) {
            C1920d m7901a = C1920d.m7901a(c1920d);
            c1920d.close();
            return m7901a;
        }

        /* renamed from: a */
        private Map<String, String> m8211a(C1920d c1920d, C2023c c2023c, int i, int i2, int i3, int i4) {
            String str;
            String str2;
            if (!this.f7333c.mo8111e().mo5343a(this.f7333c.getId())) {
                return null;
            }
            String str3 = c1920d.m7926w() + "x" + c1920d.m7920q();
            if (c2023c.m8246l() != null) {
                str = c2023c.m8246l().f6865a + "x" + c2023c.m8246l().f6866b;
            } else {
                str = "Unspecified";
            }
            if (i > 0) {
                str2 = i + "/8";
            } else {
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str);
            hashMap.put("Fraction", str2);
            hashMap.put("queueTime", String.valueOf(this.f7335e.m7992b()));
            hashMap.put("downsampleEnumerator", Integer.toString(i2));
            hashMap.put("softwareEnumerator", Integer.toString(i3));
            hashMap.put("rotationAngle", Integer.toString(i4));
            return C1687f.m6956a(hashMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [d.b.i.o.c] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* renamed from: b */
        public void m8215b(C1920d c1920d, int i) {
            InputStream inputStream;
            this.f7333c.mo8111e().mo5339a(this.f7333c.getId(), "ResizeAndRotateProducer");
            int mo8109c = this.f7333c.mo8109c();
            AbstractC1713j mo5039a = C2010ua.this.f7329c.mo5039a();
            Map<String, String> map = null;
            try {
                int m8202c = C2010ua.m8202c(mo8109c, c1920d, C2010ua.this.f7330d);
                int m8231b = C2017y.m8231b(mo8109c, c1920d);
                int m8191a = C2010ua.m8191a(m8231b);
                int i2 = C2010ua.this.f7332f ? m8191a : m8202c;
                inputStream = c1920d.m7922s();
                try {
                    try {
                        if (C2010ua.f7327a.contains(Integer.valueOf(c1920d.m7919p()))) {
                            int m8201c = C2010ua.m8201c(mo8109c.m8247m(), c1920d);
                            map = m8211a(c1920d, mo8109c, i2, m8191a, m8202c, 0);
                            JpegTranscoder.m5082b(inputStream, mo5039a, m8201c, i2, 85);
                        } else {
                            int m8204d = C2010ua.m8204d(mo8109c.m8247m(), c1920d);
                            map = m8211a(c1920d, mo8109c, i2, m8191a, m8202c, m8204d);
                            JpegTranscoder.m5080a(inputStream, mo5039a, m8204d, i2, 85);
                        }
                        try {
                            C1716b m7043a = C1716b.m7043a(mo5039a.mo5043m());
                            try {
                                try {
                                    C1920d c1920d2 = new C1920d((C1716b<InterfaceC1710g>) m7043a);
                                    c1920d2.m7906a(C1826b.f6739a);
                                    try {
                                        c1920d2.m7928y();
                                        this.f7333c.mo8111e().mo5345b(this.f7333c.getId(), "ResizeAndRotateProducer", map);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        m8188c().mo8085a(c1920d2, m8231b != 1 ? i | 16 : i);
                                        C1920d.m7902b(c1920d2);
                                        C1716b.m7045b(m7043a);
                                        C1683b.m6954a(inputStream);
                                        mo5039a.close();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        C1920d.m7902b(c1920d2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    C1716b.m7045b(m7043a);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                C1716b.m7045b(m7043a);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            this.f7333c.mo8111e().mo5341a(this.f7333c.getId(), "ResizeAndRotateProducer", e, map);
                            if (AbstractC1973c.m8077a(mo8109c)) {
                                m8188c().mo8086a(e);
                            }
                            C1683b.m6954a(inputStream);
                            mo5039a.close();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        C1683b.m6954a(inputStream);
                        mo5039a.close();
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    mo8109c = i;
                }
            } catch (Exception e4) {
                e = e4;
                mo8109c = i;
                inputStream = null;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            if (this.f7334d) {
                return;
            }
            boolean m8077a = AbstractC1973c.m8077a(i);
            if (c1920d == null) {
                if (m8077a) {
                    m8188c().mo8085a(null, 1);
                    return;
                }
                return;
            }
            EnumC1727e m8205d = C2010ua.m8205d(this.f7333c.mo8109c(), c1920d, C2010ua.this.f7330d);
            if (m8077a || m8205d != EnumC1727e.UNSET) {
                if (m8205d != EnumC1727e.YES) {
                    if (!this.f7333c.mo8109c().m8247m().m7663c() && c1920d.m7923t() != 0 && c1920d.m7923t() != -1) {
                        c1920d = m8209a(c1920d);
                        c1920d.m7913f(0);
                    }
                    m8188c().mo8085a(c1920d, i);
                    return;
                }
                if (this.f7335e.m7991a(c1920d, i)) {
                    if (m8077a || this.f7333c.mo8112f()) {
                        this.f7335e.m7993c();
                    }
                }
            }
        }
    }

    public C2010ua(Executor executor, InterfaceC1711h interfaceC1711h, boolean z, InterfaceC1996na<C1920d> interfaceC1996na, boolean z2) {
        C1691j.m6971a(executor);
        this.f7328b = executor;
        C1691j.m6971a(interfaceC1711h);
        this.f7329c = interfaceC1711h;
        this.f7330d = z;
        C1691j.m6971a(interfaceC1996na);
        this.f7331e = interfaceC1996na;
        this.f7332f = z2;
    }

    /* renamed from: a */
    static float m8189a(C1881e c1881e, int i, int i2) {
        if (c1881e == null) {
            return 1.0f;
        }
        float f = i;
        float f2 = i2;
        float max = Math.max(c1881e.f6865a / f, c1881e.f6866b / f2);
        float f3 = f * max;
        float f4 = c1881e.f6867c;
        if (f3 > f4) {
            max = f4 / f;
        }
        float f5 = f2 * max;
        float f6 = c1881e.f6867c;
        return f5 > f6 ? f6 / f2 : max;
    }

    /* renamed from: a */
    static int m8190a(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }

    /* renamed from: a */
    static int m8191a(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: a */
    private static int m8193a(C1920d c1920d) {
        int m7923t = c1920d.m7923t();
        if (m7923t == 90 || m7923t == 180 || m7923t == 270) {
            return c1920d.m7923t();
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m8199b(int i) {
        return i < 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m8201c(C1882f c1882f, C1920d c1920d) {
        int indexOf = f7327a.indexOf(Integer.valueOf(c1920d.m7919p()));
        if (indexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        int m7664e = c1882f.m7666g() ? 0 : c1882f.m7664e();
        C1686e<Integer> c1686e = f7327a;
        return c1686e.get((indexOf + (m7664e / 90)) % c1686e.size()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m8202c(C2023c c2023c, C1920d c1920d, boolean z) {
        C1881e m8246l;
        if (!z || (m8246l = c2023c.m8246l()) == null) {
            return 8;
        }
        int m8204d = m8204d(c2023c.m8247m(), c1920d);
        int m8201c = f7327a.contains(Integer.valueOf(c1920d.m7919p())) ? m8201c(c2023c.m8247m(), c1920d) : 0;
        boolean z2 = m8204d == 90 || m8204d == 270 || m8201c == 5 || m8201c == 7;
        int m8190a = m8190a(m8189a(m8246l, z2 ? c1920d.m7920q() : c1920d.m7926w(), z2 ? c1920d.m7926w() : c1920d.m7920q()), m8246l.f6868d);
        if (m8190a > 8) {
            return 8;
        }
        if (m8190a < 1) {
            return 1;
        }
        return m8190a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m8204d(C1882f c1882f, C1920d c1920d) {
        if (!c1882f.m7665f()) {
            return 0;
        }
        int m8193a = m8193a(c1920d);
        return c1882f.m7666g() ? m8193a : (m8193a + c1882f.m7664e()) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static EnumC1727e m8205d(C2023c c2023c, C1920d c1920d, boolean z) {
        if (c1920d == null || c1920d.m7921r() == C1827c.f6749a) {
            return EnumC1727e.UNSET;
        }
        if (c1920d.m7921r() != C1826b.f6739a) {
            return EnumC1727e.NO;
        }
        return EnumC1727e.m7078a(m8207e(c2023c.m8247m(), c1920d) || m8199b(m8202c(c2023c, c1920d, z)));
    }

    /* renamed from: e */
    private static boolean m8207e(C1882f c1882f, C1920d c1920d) {
        return !c1882f.m7663c() && (m8204d(c1882f, c1920d) != 0 || m8208f(c1882f, c1920d));
    }

    /* renamed from: f */
    private static boolean m8208f(C1882f c1882f, C1920d c1920d) {
        if (c1882f.m7665f() && !c1882f.m7663c()) {
            return f7327a.contains(Integer.valueOf(c1920d.m7919p()));
        }
        c1920d.m7911d(0);
        return false;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        this.f7331e.mo7950a(new a(interfaceC1995n, interfaceC1998oa), interfaceC1998oa);
    }
}
