package p139d.p225c.p226a.p227a.p250j.p255d;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p259k.p267h.C2559i;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.j.d.q */
/* loaded from: classes.dex */
public final class C2486q implements InterfaceC2287g {

    /* renamed from: a */
    private static final Pattern f10041a = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: b */
    private static final Pattern f10042b = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: c */
    private final String f10043c;

    /* renamed from: d */
    private final C2619F f10044d;

    /* renamed from: f */
    private InterfaceC2325i f10046f;

    /* renamed from: h */
    private int f10048h;

    /* renamed from: e */
    private final C2644u f10045e = new C2644u();

    /* renamed from: g */
    private byte[] f10047g = new byte[1024];

    public C2486q(String str, C2619F c2619f) {
        this.f10043c = str;
        this.f10044d = c2619f;
    }

    /* renamed from: a */
    private InterfaceC2337q m10386a(long j) {
        InterfaceC2337q mo9671a = this.f10046f.mo9671a(0, 3);
        mo9671a.mo9433a(C2676s.m11428a((String) null, "text/vtt", (String) null, -1, 0, this.f10043c, (C2213m) null, j));
        this.f10046f.mo9672a();
        return mo9671a;
    }

    /* renamed from: b */
    private void m10387b() {
        C2644u c2644u = new C2644u(this.f10047g);
        C2559i.m10793c(c2644u);
        long j = 0;
        long j2 = 0;
        while (true) {
            String m11228j = c2644u.m11228j();
            if (TextUtils.isEmpty(m11228j)) {
                Matcher m10790a = C2559i.m10790a(c2644u);
                if (m10790a == null) {
                    m10386a(0L);
                    return;
                }
                long m10791b = C2559i.m10791b(m10790a.group(1));
                long m11022b = this.f10044d.m11022b(C2619F.m11018e((j + m10791b) - j2));
                InterfaceC2337q m10386a = m10386a(m11022b - m10791b);
                this.f10045e.m11213a(this.f10047g, this.f10048h);
                m10386a.mo9432a(this.f10045e, this.f10048h);
                m10386a.mo9431a(m11022b, 1, this.f10048h, 0, null);
                return;
            }
            if (m11228j.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f10041a.matcher(m11228j);
                if (!matcher.find()) {
                    throw new C2683z("X-TIMESTAMP-MAP doesn't contain local timestamp: " + m11228j);
                }
                Matcher matcher2 = f10042b.matcher(m11228j);
                if (!matcher2.find()) {
                    throw new C2683z("X-TIMESTAMP-MAP doesn't contain media timestamp: " + m11228j);
                }
                j2 = C2559i.m10791b(matcher.group(1));
                j = C2619F.m11017c(Long.parseLong(matcher2.group(1)));
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        int length = (int) interfaceC2289h.getLength();
        int i = this.f10048h;
        byte[] bArr = this.f10047g;
        if (i == bArr.length) {
            this.f10047g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f10047g;
        int i2 = this.f10048h;
        int read = interfaceC2289h.read(bArr2, i2, bArr2.length - i2);
        if (read != -1) {
            this.f10048h += read;
            if (length == -1 || this.f10048h != length) {
                return 0;
            }
        }
        m10387b();
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f10046f = interfaceC2325i;
        interfaceC2325i.mo9673a(new InterfaceC2335o.b(-9223372036854775807L));
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.mo9282b(this.f10047g, 0, 6, false);
        this.f10045e.m11213a(this.f10047g, 6);
        if (C2559i.m10792b(this.f10045e)) {
            return true;
        }
        interfaceC2289h.mo9282b(this.f10047g, 6, 3, false);
        this.f10045e.m11213a(this.f10047g, 9);
        return C2559i.m10792b(this.f10045e);
    }
}
