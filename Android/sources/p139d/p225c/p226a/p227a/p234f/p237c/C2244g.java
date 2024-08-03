package p139d.p225c.p226a.p227a.p234f.p237c;

import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p229b.C2171h;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2230b;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2639p;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.c.g */
/* loaded from: classes.dex */
public final class C2244g implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8234a = new InterfaceC2330j() { // from class: d.c.a.a.f.c.a
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2244g.m9240d();
        }
    };

    /* renamed from: b */
    private static final byte[] f8235b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c */
    private static final byte[] f8236c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: d */
    private static final byte[] f8237d = C2622I.m11086c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e */
    private static final byte[] f8238e = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f */
    private static final byte[] f8239f = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: g */
    private static final UUID f8240g = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private b f8241A;

    /* renamed from: B */
    private boolean f8242B;

    /* renamed from: C */
    private int f8243C;

    /* renamed from: D */
    private long f8244D;

    /* renamed from: E */
    private boolean f8245E;

    /* renamed from: F */
    private long f8246F;

    /* renamed from: G */
    private long f8247G;

    /* renamed from: H */
    private long f8248H;

    /* renamed from: I */
    private C2639p f8249I;

    /* renamed from: J */
    private C2639p f8250J;

    /* renamed from: K */
    private boolean f8251K;

    /* renamed from: L */
    private int f8252L;

    /* renamed from: M */
    private long f8253M;

    /* renamed from: N */
    private long f8254N;

    /* renamed from: O */
    private int f8255O;

    /* renamed from: P */
    private int f8256P;

    /* renamed from: Q */
    private int[] f8257Q;

    /* renamed from: R */
    private int f8258R;

    /* renamed from: S */
    private int f8259S;

    /* renamed from: T */
    private int f8260T;

    /* renamed from: U */
    private int f8261U;

    /* renamed from: V */
    private boolean f8262V;

    /* renamed from: W */
    private boolean f8263W;

    /* renamed from: X */
    private boolean f8264X;

    /* renamed from: Y */
    private boolean f8265Y;

    /* renamed from: Z */
    private byte f8266Z;

    /* renamed from: aa */
    private int f8267aa;

    /* renamed from: ba */
    private int f8268ba;

    /* renamed from: ca */
    private int f8269ca;

    /* renamed from: da */
    private boolean f8270da;

    /* renamed from: ea */
    private boolean f8271ea;

    /* renamed from: fa */
    private InterfaceC2325i f8272fa;

    /* renamed from: h */
    private final InterfaceC2241d f8273h;

    /* renamed from: i */
    private final C2246i f8274i;

    /* renamed from: j */
    private final SparseArray<b> f8275j;

    /* renamed from: k */
    private final boolean f8276k;

    /* renamed from: l */
    private final C2644u f8277l;

    /* renamed from: m */
    private final C2644u f8278m;

    /* renamed from: n */
    private final C2644u f8279n;

    /* renamed from: o */
    private final C2644u f8280o;

    /* renamed from: p */
    private final C2644u f8281p;

    /* renamed from: q */
    private final C2644u f8282q;

    /* renamed from: r */
    private final C2644u f8283r;

    /* renamed from: s */
    private final C2644u f8284s;

    /* renamed from: t */
    private final C2644u f8285t;

    /* renamed from: u */
    private ByteBuffer f8286u;

    /* renamed from: v */
    private long f8287v;

    /* renamed from: w */
    private long f8288w;

    /* renamed from: x */
    private long f8289x;

    /* renamed from: y */
    private long f8290y;

    /* renamed from: z */
    private long f8291z;

    /* renamed from: d.c.a.a.f.c.g$a */
    /* loaded from: classes.dex */
    private final class a implements InterfaceC2242e {
        private a() {
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: a */
        public void mo9218a(int i) {
            C2244g.this.m9243a(i);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: a */
        public void mo9219a(int i, double d2) {
            C2244g.this.m9244a(i, d2);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: a */
        public void mo9220a(int i, int i2, InterfaceC2289h interfaceC2289h) {
            C2244g.this.m9245a(i, i2, interfaceC2289h);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: a */
        public void mo9221a(int i, long j) {
            C2244g.this.m9246a(i, j);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: a */
        public void mo9222a(int i, long j, long j2) {
            C2244g.this.m9247a(i, j, j2);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: a */
        public void mo9223a(int i, String str) {
            C2244g.this.m9248a(i, str);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: b */
        public int mo9224b(int i) {
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                    return 5;
                default:
                    return 0;
            }
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2242e
        /* renamed from: c */
        public boolean mo9225c(int i) {
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.c.g$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        public float f8293A;

        /* renamed from: B */
        public float f8294B;

        /* renamed from: C */
        public float f8295C;

        /* renamed from: D */
        public float f8296D;

        /* renamed from: E */
        public float f8297E;

        /* renamed from: F */
        public float f8298F;

        /* renamed from: G */
        public float f8299G;

        /* renamed from: H */
        public int f8300H;

        /* renamed from: I */
        public int f8301I;

        /* renamed from: J */
        public int f8302J;

        /* renamed from: K */
        public long f8303K;

        /* renamed from: L */
        public long f8304L;

        /* renamed from: M */
        public c f8305M;

        /* renamed from: N */
        public boolean f8306N;

        /* renamed from: O */
        public boolean f8307O;

        /* renamed from: P */
        private String f8308P;

        /* renamed from: Q */
        public InterfaceC2337q f8309Q;

        /* renamed from: R */
        public int f8310R;

        /* renamed from: a */
        public String f8311a;

        /* renamed from: b */
        public String f8312b;

        /* renamed from: c */
        public int f8313c;

        /* renamed from: d */
        public int f8314d;

        /* renamed from: e */
        public int f8315e;

        /* renamed from: f */
        public boolean f8316f;

        /* renamed from: g */
        public byte[] f8317g;

        /* renamed from: h */
        public InterfaceC2337q.a f8318h;

        /* renamed from: i */
        public byte[] f8319i;

        /* renamed from: j */
        public C2213m f8320j;

        /* renamed from: k */
        public int f8321k;

        /* renamed from: l */
        public int f8322l;

        /* renamed from: m */
        public int f8323m;

        /* renamed from: n */
        public int f8324n;

        /* renamed from: o */
        public int f8325o;

        /* renamed from: p */
        public byte[] f8326p;

        /* renamed from: q */
        public int f8327q;

        /* renamed from: r */
        public boolean f8328r;

        /* renamed from: s */
        public int f8329s;

        /* renamed from: t */
        public int f8330t;

        /* renamed from: u */
        public int f8331u;

        /* renamed from: v */
        public int f8332v;

        /* renamed from: w */
        public int f8333w;

        /* renamed from: x */
        public float f8334x;

        /* renamed from: y */
        public float f8335y;

        /* renamed from: z */
        public float f8336z;

        private b() {
            this.f8321k = -1;
            this.f8322l = -1;
            this.f8323m = -1;
            this.f8324n = -1;
            this.f8325o = 0;
            this.f8326p = null;
            this.f8327q = -1;
            this.f8328r = false;
            this.f8329s = -1;
            this.f8330t = -1;
            this.f8331u = -1;
            this.f8332v = 1000;
            this.f8333w = 200;
            this.f8334x = -1.0f;
            this.f8335y = -1.0f;
            this.f8336z = -1.0f;
            this.f8293A = -1.0f;
            this.f8294B = -1.0f;
            this.f8295C = -1.0f;
            this.f8296D = -1.0f;
            this.f8297E = -1.0f;
            this.f8298F = -1.0f;
            this.f8299G = -1.0f;
            this.f8300H = 1;
            this.f8301I = -1;
            this.f8302J = 8000;
            this.f8303K = 0L;
            this.f8304L = 0L;
            this.f8307O = true;
            this.f8308P = "eng";
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        private static Pair<String, List<byte[]>> m9249a(C2644u c2644u) {
            try {
                c2644u.m11224f(16);
                long m11231m = c2644u.m11231m();
                if (m11231m == 1482049860) {
                    return new Pair<>("video/3gpp", null);
                }
                if (m11231m != 826496599) {
                    C2638o.m11160d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArr = c2644u.f11004a;
                for (int m11217c = c2644u.m11217c() + 20; m11217c < bArr.length - 4; m11217c++) {
                    if (bArr[m11217c] == 0 && bArr[m11217c + 1] == 0 && bArr[m11217c + 2] == 1 && bArr[m11217c + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, m11217c, bArr.length)));
                    }
                }
                throw new C2683z("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C2683z("Error parsing FourCC private data");
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        private static List<byte[]> m9251a(byte[] bArr) {
            try {
                if (bArr[0] != 2) {
                    throw new C2683z("Error parsing vorbis codec private");
                }
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + bArr[i3];
                if (bArr[i6] != 1) {
                    throw new C2683z("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, i6, bArr2, 0, i4);
                int i8 = i6 + i4;
                if (bArr[i8] != 3) {
                    throw new C2683z("Error parsing vorbis codec private");
                }
                int i9 = i8 + i7;
                if (bArr[i9] != 5) {
                    throw new C2683z("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i9];
                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C2683z("Error parsing vorbis codec private");
            }
        }

        /* renamed from: b */
        private static boolean m9252b(C2644u c2644u) {
            try {
                int m11233o = c2644u.m11233o();
                if (m11233o == 1) {
                    return true;
                }
                if (m11233o != 65534) {
                    return false;
                }
                c2644u.m11222e(24);
                if (c2644u.m11234p() == C2244g.f8240g.getMostSignificantBits()) {
                    if (c2644u.m11234p() == C2244g.f8240g.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C2683z("Error parsing MS/ACM codec private");
            }
        }

        /* renamed from: c */
        private byte[] m9253c() {
            if (this.f8334x == -1.0f || this.f8335y == -1.0f || this.f8336z == -1.0f || this.f8293A == -1.0f || this.f8294B == -1.0f || this.f8295C == -1.0f || this.f8296D == -1.0f || this.f8297E == -1.0f || this.f8298F == -1.0f || this.f8299G == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put((byte) 0);
            wrap.putShort((short) ((this.f8334x * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.f8335y * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.f8336z * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.f8293A * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.f8294B * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.f8295C * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.f8296D * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.f8297E * 50000.0f) + 0.5f));
            wrap.putShort((short) (this.f8298F + 0.5f));
            wrap.putShort((short) (this.f8299G + 0.5f));
            wrap.putShort((short) this.f8332v);
            wrap.putShort((short) this.f8333w);
            return bArr;
        }

        /* renamed from: a */
        public void m9254a() {
            c cVar = this.f8305M;
            if (cVar != null) {
                cVar.m9258a(this);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0172. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:15:0x02fa  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0304  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0329  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x02fc  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9255a(p139d.p225c.p226a.p227a.p234f.InterfaceC2325i r34, int r35) {
            /*
                Method dump skipped, instructions count: 1314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p237c.C2244g.b.m9255a(d.c.a.a.f.i, int):void");
        }

        /* renamed from: b */
        public void m9256b() {
            c cVar = this.f8305M;
            if (cVar != null) {
                cVar.m9257a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.c.g$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final byte[] f8337a = new byte[10];

        /* renamed from: b */
        private boolean f8338b;

        /* renamed from: c */
        private int f8339c;

        /* renamed from: d */
        private int f8340d;

        /* renamed from: e */
        private long f8341e;

        /* renamed from: f */
        private int f8342f;

        /* renamed from: a */
        public void m9257a() {
            this.f8338b = false;
        }

        /* renamed from: a */
        public void m9258a(b bVar) {
            if (!this.f8338b || this.f8339c <= 0) {
                return;
            }
            bVar.f8309Q.mo9431a(this.f8341e, this.f8342f, this.f8340d, 0, bVar.f8318h);
            this.f8339c = 0;
        }

        /* renamed from: a */
        public void m9259a(b bVar, long j) {
            if (this.f8338b) {
                int i = this.f8339c;
                this.f8339c = i + 1;
                if (i == 0) {
                    this.f8341e = j;
                }
                if (this.f8339c < 16) {
                    return;
                }
                bVar.f8309Q.mo9431a(this.f8341e, this.f8342f, this.f8340d, 0, bVar.f8318h);
                this.f8339c = 0;
            }
        }

        /* renamed from: a */
        public void m9260a(InterfaceC2289h interfaceC2289h, int i, int i2) {
            if (!this.f8338b) {
                interfaceC2289h.mo9276a(this.f8337a, 0, 10);
                interfaceC2289h.mo9280b();
                if (C2171h.m8855b(this.f8337a) == 0) {
                    return;
                }
                this.f8338b = true;
                this.f8339c = 0;
            }
            if (this.f8339c == 0) {
                this.f8342f = i;
                this.f8340d = 0;
            }
            this.f8340d += i2;
        }
    }

    public C2244g() {
        this(0);
    }

    public C2244g(int i) {
        this(new C2240c(), i);
    }

    C2244g(InterfaceC2241d interfaceC2241d, int i) {
        this.f8288w = -1L;
        this.f8289x = -9223372036854775807L;
        this.f8290y = -9223372036854775807L;
        this.f8291z = -9223372036854775807L;
        this.f8246F = -1L;
        this.f8247G = -1L;
        this.f8248H = -9223372036854775807L;
        this.f8273h = interfaceC2241d;
        this.f8273h.mo9214a(new a());
        this.f8276k = (i & 1) == 0;
        this.f8274i = new C2246i();
        this.f8275j = new SparseArray<>();
        this.f8279n = new C2644u(4);
        this.f8280o = new C2644u(ByteBuffer.allocate(4).putInt(-1).array());
        this.f8281p = new C2644u(4);
        this.f8277l = new C2644u(C2642s.f10980a);
        this.f8278m = new C2644u(4);
        this.f8282q = new C2644u();
        this.f8283r = new C2644u();
        this.f8284s = new C2644u(8);
        this.f8285t = new C2644u();
    }

    /* renamed from: a */
    private int m9226a(InterfaceC2289h interfaceC2289h, InterfaceC2337q interfaceC2337q, int i) {
        int mo9430a;
        int m11208a = this.f8282q.m11208a();
        if (m11208a > 0) {
            mo9430a = Math.min(i, m11208a);
            interfaceC2337q.mo9432a(this.f8282q, mo9430a);
        } else {
            mo9430a = interfaceC2337q.mo9430a(interfaceC2289h, i, false);
        }
        this.f8261U += mo9430a;
        this.f8269ca += mo9430a;
        return mo9430a;
    }

    /* renamed from: a */
    private long m9227a(long j) {
        long j2 = this.f8289x;
        if (j2 != -9223372036854775807L) {
            return C2622I.m11085c(j, j2, 1000L);
        }
        throw new C2683z("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private void m9228a(b bVar, long j) {
        int i;
        long j2;
        byte[] bArr;
        String str;
        c cVar = bVar.f8305M;
        if (cVar != null) {
            cVar.m9259a(bVar, j);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f8312b)) {
                i = 19;
                j2 = 1000;
                bArr = f8236c;
                str = "%02d:%02d:%02d,%03d";
            } else {
                if ("S_TEXT/ASS".equals(bVar.f8312b)) {
                    i = 21;
                    j2 = 10000;
                    bArr = f8239f;
                    str = "%01d:%02d:%02d:%02d";
                }
                bVar.f8309Q.mo9431a(j, this.f8260T, this.f8269ca, 0, bVar.f8318h);
            }
            m9229a(bVar, str, i, j2, bArr);
            bVar.f8309Q.mo9431a(j, this.f8260T, this.f8269ca, 0, bVar.f8318h);
        }
        this.f8270da = true;
        m9242f();
    }

    /* renamed from: a */
    private void m9229a(b bVar, String str, int i, long j, byte[] bArr) {
        m9234a(this.f8283r.f11004a, this.f8254N, str, i, j, bArr);
        InterfaceC2337q interfaceC2337q = bVar.f8309Q;
        C2644u c2644u = this.f8283r;
        interfaceC2337q.mo9432a(c2644u, c2644u.m11219d());
        this.f8269ca += this.f8283r.m11219d();
    }

    /* renamed from: a */
    private void m9230a(InterfaceC2289h interfaceC2289h, int i) {
        if (this.f8279n.m11219d() >= i) {
            return;
        }
        if (this.f8279n.m11215b() < i) {
            C2644u c2644u = this.f8279n;
            byte[] bArr = c2644u.f11004a;
            c2644u.m11213a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f8279n.m11219d());
        }
        C2644u c2644u2 = this.f8279n;
        interfaceC2289h.readFully(c2644u2.f11004a, c2644u2.m11219d(), i - this.f8279n.m11219d());
        this.f8279n.m11220d(i);
    }

    /* renamed from: a */
    private void m9231a(InterfaceC2289h interfaceC2289h, b bVar, int i) {
        int i2;
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(bVar.f8312b)) {
            bArr = f8235b;
        } else {
            if (!"S_TEXT/ASS".equals(bVar.f8312b)) {
                InterfaceC2337q interfaceC2337q = bVar.f8309Q;
                if (!this.f8262V) {
                    if (bVar.f8316f) {
                        this.f8260T &= -1073741825;
                        if (!this.f8263W) {
                            interfaceC2289h.readFully(this.f8279n.f11004a, 0, 1);
                            this.f8261U++;
                            byte[] bArr2 = this.f8279n.f11004a;
                            if ((bArr2[0] & 128) == 128) {
                                throw new C2683z("Extension bit is set in signal byte");
                            }
                            this.f8266Z = bArr2[0];
                            this.f8263W = true;
                        }
                        if ((this.f8266Z & 1) == 1) {
                            boolean z = (this.f8266Z & 2) == 2;
                            this.f8260T |= 1073741824;
                            if (!this.f8264X) {
                                interfaceC2289h.readFully(this.f8284s.f11004a, 0, 8);
                                this.f8261U += 8;
                                this.f8264X = true;
                                this.f8279n.f11004a[0] = (byte) ((z ? 128 : 0) | 8);
                                this.f8279n.m11222e(0);
                                interfaceC2337q.mo9432a(this.f8279n, 1);
                                this.f8269ca++;
                                this.f8284s.m11222e(0);
                                interfaceC2337q.mo9432a(this.f8284s, 8);
                                this.f8269ca += 8;
                            }
                            if (z) {
                                if (!this.f8265Y) {
                                    interfaceC2289h.readFully(this.f8279n.f11004a, 0, 1);
                                    this.f8261U++;
                                    this.f8279n.m11222e(0);
                                    this.f8267aa = this.f8279n.m11238t();
                                    this.f8265Y = true;
                                }
                                int i3 = this.f8267aa * 4;
                                this.f8279n.m11218c(i3);
                                interfaceC2289h.readFully(this.f8279n.f11004a, 0, i3);
                                this.f8261U += i3;
                                short s = (short) ((this.f8267aa / 2) + 1);
                                int i4 = (s * 6) + 2;
                                ByteBuffer byteBuffer = this.f8286u;
                                if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                    this.f8286u = ByteBuffer.allocate(i4);
                                }
                                this.f8286u.position(0);
                                this.f8286u.putShort(s);
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    i2 = this.f8267aa;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    int m11242x = this.f8279n.m11242x();
                                    if (i5 % 2 == 0) {
                                        this.f8286u.putShort((short) (m11242x - i6));
                                    } else {
                                        this.f8286u.putInt(m11242x - i6);
                                    }
                                    i5++;
                                    i6 = m11242x;
                                }
                                int i7 = (i - this.f8261U) - i6;
                                if (i2 % 2 == 1) {
                                    this.f8286u.putInt(i7);
                                } else {
                                    this.f8286u.putShort((short) i7);
                                    this.f8286u.putInt(0);
                                }
                                this.f8285t.m11213a(this.f8286u.array(), i4);
                                interfaceC2337q.mo9432a(this.f8285t, i4);
                                this.f8269ca += i4;
                            }
                        }
                    } else {
                        byte[] bArr3 = bVar.f8317g;
                        if (bArr3 != null) {
                            this.f8282q.m11213a(bArr3, bArr3.length);
                        }
                    }
                    this.f8262V = true;
                }
                int m11219d = i + this.f8282q.m11219d();
                if (!"V_MPEG4/ISO/AVC".equals(bVar.f8312b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f8312b)) {
                    if (bVar.f8305M != null) {
                        C2628e.m11113b(this.f8282q.m11219d() == 0);
                        bVar.f8305M.m9260a(interfaceC2289h, this.f8260T, m11219d);
                    }
                    while (true) {
                        int i8 = this.f8261U;
                        if (i8 >= m11219d) {
                            break;
                        } else {
                            m9226a(interfaceC2289h, interfaceC2337q, m11219d - i8);
                        }
                    }
                } else {
                    byte[] bArr4 = this.f8278m.f11004a;
                    bArr4[0] = 0;
                    bArr4[1] = 0;
                    bArr4[2] = 0;
                    int i9 = bVar.f8310R;
                    int i10 = 4 - i9;
                    while (this.f8261U < m11219d) {
                        int i11 = this.f8268ba;
                        if (i11 == 0) {
                            m9233a(interfaceC2289h, bArr4, i10, i9);
                            this.f8278m.m11222e(0);
                            this.f8268ba = this.f8278m.m11242x();
                            this.f8277l.m11222e(0);
                            interfaceC2337q.mo9432a(this.f8277l, 4);
                            this.f8269ca += 4;
                        } else {
                            this.f8268ba = i11 - m9226a(interfaceC2289h, interfaceC2337q, i11);
                        }
                    }
                }
                if ("A_VORBIS".equals(bVar.f8312b)) {
                    this.f8280o.m11222e(0);
                    interfaceC2337q.mo9432a(this.f8280o, 4);
                    this.f8269ca += 4;
                    return;
                }
                return;
            }
            bArr = f8238e;
        }
        m9232a(interfaceC2289h, bArr, i);
    }

    /* renamed from: a */
    private void m9232a(InterfaceC2289h interfaceC2289h, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.f8283r.m11215b() < length) {
            this.f8283r.f11004a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.f8283r.f11004a, 0, bArr.length);
        }
        interfaceC2289h.readFully(this.f8283r.f11004a, bArr.length, i);
        this.f8283r.m11218c(length);
    }

    /* renamed from: a */
    private void m9233a(InterfaceC2289h interfaceC2289h, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f8282q.m11208a());
        interfaceC2289h.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f8282q.m11214a(bArr, i, min);
        }
        this.f8261U += i2;
    }

    /* renamed from: a */
    private static void m9234a(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] m11086c;
        byte[] bArr3;
        if (j == -9223372036854775807L) {
            bArr3 = bArr2;
            m11086c = bArr3;
        } else {
            long j3 = j - ((r2 * 3600) * 1000000);
            int i2 = (int) (j3 / 60000000);
            long j4 = j3 - ((i2 * 60) * 1000000);
            int i3 = (int) (j4 / 1000000);
            m11086c = C2622I.m11086c(String.format(Locale.US, str, Integer.valueOf((int) (j / 3600000000L)), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
            bArr3 = bArr2;
        }
        System.arraycopy(m11086c, 0, bArr, i, bArr3.length);
    }

    /* renamed from: a */
    private boolean m9235a(C2334n c2334n, long j) {
        if (this.f8245E) {
            this.f8247G = j;
            c2334n.f9165a = this.f8246F;
            this.f8245E = false;
            return true;
        }
        if (this.f8242B) {
            long j2 = this.f8247G;
            if (j2 != -1) {
                c2334n.f9165a = j2;
                this.f8247G = -1L;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m9236a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    /* renamed from: a */
    private static int[] m9237a(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC2287g[] m9240d() {
        return new InterfaceC2287g[]{new C2244g()};
    }

    /* renamed from: e */
    private InterfaceC2335o m9241e() {
        C2639p c2639p;
        C2639p c2639p2;
        if (this.f8288w == -1 || this.f8291z == -9223372036854775807L || (c2639p = this.f8249I) == null || c2639p.m11161a() == 0 || (c2639p2 = this.f8250J) == null || c2639p2.m11161a() != this.f8249I.m11161a()) {
            this.f8249I = null;
            this.f8250J = null;
            return new InterfaceC2335o.b(this.f8291z);
        }
        int m11161a = this.f8249I.m11161a();
        int[] iArr = new int[m11161a];
        long[] jArr = new long[m11161a];
        long[] jArr2 = new long[m11161a];
        long[] jArr3 = new long[m11161a];
        int i = 0;
        for (int i2 = 0; i2 < m11161a; i2++) {
            jArr3[i2] = this.f8249I.m11162a(i2);
            jArr[i2] = this.f8288w + this.f8250J.m11162a(i2);
        }
        while (true) {
            int i3 = m11161a - 1;
            if (i >= i3) {
                iArr[i3] = (int) ((this.f8288w + this.f8287v) - jArr[i3]);
                jArr2[i3] = this.f8291z - jArr3[i3];
                this.f8249I = null;
                this.f8250J = null;
                return new C2230b(iArr, jArr, jArr2, jArr3);
            }
            int i4 = i + 1;
            iArr[i] = (int) (jArr[i4] - jArr[i]);
            jArr2[i] = jArr3[i4] - jArr3[i];
            i = i4;
        }
    }

    /* renamed from: f */
    private void m9242f() {
        this.f8261U = 0;
        this.f8269ca = 0;
        this.f8268ba = 0;
        this.f8262V = false;
        this.f8263W = false;
        this.f8265Y = false;
        this.f8267aa = 0;
        this.f8266Z = (byte) 0;
        this.f8264X = false;
        this.f8282q.m11207B();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        this.f8270da = false;
        boolean z = true;
        while (z && !this.f8270da) {
            z = this.f8273h.mo9215a(interfaceC2289h);
            if (z && m9235a(c2334n, interfaceC2289h.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f8275j.size(); i++) {
            this.f8275j.valueAt(i).m9254a();
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    /* renamed from: a */
    void m9243a(int i) {
        if (i == 160) {
            if (this.f8252L != 2) {
                return;
            }
            if (!this.f8271ea) {
                this.f8260T |= 1;
            }
            m9228a(this.f8275j.get(this.f8258R), this.f8253M);
            this.f8252L = 0;
            return;
        }
        if (i == 174) {
            if (m9236a(this.f8241A.f8312b)) {
                b bVar = this.f8241A;
                bVar.m9255a(this.f8272fa, bVar.f8313c);
                SparseArray<b> sparseArray = this.f8275j;
                b bVar2 = this.f8241A;
                sparseArray.put(bVar2.f8313c, bVar2);
            }
            this.f8241A = null;
            return;
        }
        if (i == 19899) {
            int i2 = this.f8243C;
            if (i2 != -1) {
                long j = this.f8244D;
                if (j != -1) {
                    if (i2 == 475249515) {
                        this.f8246F = j;
                        return;
                    }
                    return;
                }
            }
            throw new C2683z("Mandatory element SeekID or SeekPosition not found");
        }
        if (i == 25152) {
            b bVar3 = this.f8241A;
            if (bVar3.f8316f) {
                InterfaceC2337q.a aVar = bVar3.f8318h;
                if (aVar == null) {
                    throw new C2683z("Encrypted Track found but ContentEncKeyID was not found");
                }
                bVar3.f8320j = new C2213m(new C2213m.a(C2200d.f8059a, "video/webm", aVar.f9174b));
                return;
            }
            return;
        }
        if (i == 28032) {
            b bVar4 = this.f8241A;
            if (bVar4.f8316f && bVar4.f8317g != null) {
                throw new C2683z("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i == 357149030) {
            if (this.f8289x == -9223372036854775807L) {
                this.f8289x = 1000000L;
            }
            long j2 = this.f8290y;
            if (j2 != -9223372036854775807L) {
                this.f8291z = m9227a(j2);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.f8275j.size() == 0) {
                throw new C2683z("No valid tracks were found");
            }
            this.f8272fa.mo9672a();
        } else if (i == 475249515 && !this.f8242B) {
            this.f8272fa.mo9673a(m9241e());
            this.f8242B = true;
        }
    }

    /* renamed from: a */
    void m9244a(int i, double d2) {
        if (i == 181) {
            this.f8241A.f8302J = (int) d2;
            return;
        }
        if (i == 17545) {
            this.f8290y = (long) d2;
            return;
        }
        switch (i) {
            case 21969:
                this.f8241A.f8334x = (float) d2;
                return;
            case 21970:
                this.f8241A.f8335y = (float) d2;
                return;
            case 21971:
                this.f8241A.f8336z = (float) d2;
                return;
            case 21972:
                this.f8241A.f8293A = (float) d2;
                return;
            case 21973:
                this.f8241A.f8294B = (float) d2;
                return;
            case 21974:
                this.f8241A.f8295C = (float) d2;
                return;
            case 21975:
                this.f8241A.f8296D = (float) d2;
                return;
            case 21976:
                this.f8241A.f8297E = (float) d2;
                return;
            case 21977:
                this.f8241A.f8298F = (float) d2;
                return;
            case 21978:
                this.f8241A.f8299G = (float) d2;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:            throw new p139d.p225c.p226a.p227a.C2683z("EBML lacing sample size out of range.");     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m9245a(int r20, int r21, p139d.p225c.p226a.p227a.p234f.InterfaceC2289h r22) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p237c.C2244g.m9245a(int, int, d.c.a.a.f.h):void");
    }

    /* renamed from: a */
    void m9246a(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new C2683z("ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new C2683z("ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                this.f8241A.f8314d = (int) j;
                return;
            case 136:
                this.f8241A.f8307O = j == 1;
                return;
            case 155:
                this.f8254N = m9227a(j);
                return;
            case 159:
                this.f8241A.f8300H = (int) j;
                return;
            case 176:
                this.f8241A.f8321k = (int) j;
                return;
            case 179:
                this.f8249I.m11163a(m9227a(j));
                return;
            case 186:
                this.f8241A.f8322l = (int) j;
                return;
            case 215:
                this.f8241A.f8313c = (int) j;
                return;
            case 231:
                this.f8248H = m9227a(j);
                return;
            case 241:
                if (this.f8251K) {
                    return;
                }
                this.f8250J.m11163a(j);
                this.f8251K = true;
                return;
            case 251:
                this.f8271ea = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw new C2683z("ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw new C2683z("DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw new C2683z("EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw new C2683z("ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw new C2683z("AESSettingsCipherMode " + j + " not supported");
            case 21420:
                this.f8244D = j + this.f8288w;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.f8241A.f8327q = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f8241A.f8327q = 2;
                    return;
                } else if (i2 == 3) {
                    this.f8241A.f8327q = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f8241A.f8327q = 3;
                    return;
                }
            case 21680:
                this.f8241A.f8323m = (int) j;
                return;
            case 21682:
                this.f8241A.f8325o = (int) j;
                return;
            case 21690:
                this.f8241A.f8324n = (int) j;
                return;
            case 21930:
                this.f8241A.f8306N = j == 1;
                return;
            case 22186:
                this.f8241A.f8303K = j;
                return;
            case 22203:
                this.f8241A.f8304L = j;
                return;
            case 25188:
                this.f8241A.f8301I = (int) j;
                return;
            case 2352003:
                this.f8241A.f8315e = (int) j;
                return;
            case 2807729:
                this.f8289x = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.f8241A.f8331u = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.f8241A.f8331u = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.f8241A.f8330t = 6;
                                return;
                            } else if (i4 == 18) {
                                this.f8241A.f8330t = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.f8241A.f8330t = 3;
                        return;
                    case 21947:
                        b bVar = this.f8241A;
                        bVar.f8328r = true;
                        int i5 = (int) j;
                        if (i5 == 1) {
                            bVar.f8329s = 1;
                            return;
                        }
                        if (i5 == 9) {
                            bVar.f8329s = 6;
                            return;
                        } else {
                            if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                this.f8241A.f8329s = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.f8241A.f8332v = (int) j;
                        return;
                    case 21949:
                        this.f8241A.f8333w = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: a */
    void m9247a(int i, long j, long j2) {
        if (i == 160) {
            this.f8271ea = false;
            return;
        }
        if (i == 174) {
            this.f8241A = new b();
            return;
        }
        if (i == 187) {
            this.f8251K = false;
            return;
        }
        if (i == 19899) {
            this.f8243C = -1;
            this.f8244D = -1L;
            return;
        }
        if (i == 20533) {
            this.f8241A.f8316f = true;
            return;
        }
        if (i == 21968) {
            this.f8241A.f8328r = true;
            return;
        }
        if (i != 25152) {
            if (i == 408125543) {
                long j3 = this.f8288w;
                if (j3 != -1 && j3 != j) {
                    throw new C2683z("Multiple Segment elements not supported");
                }
                this.f8288w = j;
                this.f8287v = j2;
                return;
            }
            if (i == 475249515) {
                this.f8249I = new C2639p();
                this.f8250J = new C2639p();
            } else if (i == 524531317 && !this.f8242B) {
                if (this.f8276k && this.f8246F != -1) {
                    this.f8245E = true;
                } else {
                    this.f8272fa.mo9673a(new InterfaceC2335o.b(this.f8291z));
                    this.f8242B = true;
                }
            }
        }
    }

    /* renamed from: a */
    void m9248a(int i, String str) {
        if (i == 134) {
            this.f8241A.f8312b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                this.f8241A.f8311a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                this.f8241A.f8308P = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw new C2683z("DocType " + str + " not supported");
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f8248H = -9223372036854775807L;
        this.f8252L = 0;
        this.f8273h.reset();
        this.f8274i.m9267b();
        m9242f();
        for (int i = 0; i < this.f8275j.size(); i++) {
            this.f8275j.valueAt(i).m9256b();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8272fa = interfaceC2325i;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        return new C2245h().m9262a(interfaceC2289h);
    }
}
