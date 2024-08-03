package p139d.p225c.p226a.p227a.p250j.p255d;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.p238d.C2252e;
import p139d.p225c.p226a.p227a.p234f.p239e.C2263h;
import p139d.p225c.p226a.p227a.p234f.p242h.C2295F;
import p139d.p225c.p226a.p227a.p234f.p242h.C2303e;
import p139d.p225c.p226a.p227a.p234f.p242h.C2305g;
import p139d.p225c.p226a.p227a.p234f.p242h.C2307i;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: d.c.a.a.j.d.e */
/* loaded from: classes.dex */
public final class C2474e implements InterfaceC2477h {

    /* renamed from: a */
    private final int f9910a;

    public C2474e() {
        this(0);
    }

    public C2474e(int i) {
        this.f9910a = i;
    }

    /* renamed from: a */
    private static Pair<InterfaceC2287g, Boolean> m10303a(InterfaceC2287g interfaceC2287g) {
        return new Pair<>(interfaceC2287g, Boolean.valueOf((interfaceC2287g instanceof C2305g) || (interfaceC2287g instanceof C2303e) || (interfaceC2287g instanceof C2252e)));
    }

    /* renamed from: a */
    private InterfaceC2287g m10304a(Uri uri, C2676s c2676s, List<C2676s> list, C2213m c2213m, C2619F c2619f) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if ("text/vtt".equals(c2676s.f11182g) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            return new C2486q(c2676s.f11201z, c2619f);
        }
        if (lastPathSegment.endsWith(".aac")) {
            return new C2305g();
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return new C2303e();
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return new C2252e(0, 0L);
        }
        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return m10305a(this.f9910a, c2676s, list, c2619f);
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C2263h(0, c2619f, null, c2213m, list);
    }

    /* renamed from: a */
    private static C2295F m10305a(int i, C2676s c2676s, List<C2676s> list, C2619F c2619f) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else {
            list = Collections.singletonList(C2676s.m11419a(null, "application/cea-608", 0, null));
        }
        String str = c2676s.f11179d;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(C2641r.m11166a(str))) {
                i2 |= 2;
            }
            if (!"video/avc".equals(C2641r.m11171f(str))) {
                i2 |= 4;
            }
        }
        return new C2295F(2, c2619f, new C2307i(i2, list));
    }

    /* renamed from: a */
    private static boolean m10306a(InterfaceC2287g interfaceC2287g, InterfaceC2289h interfaceC2289h) {
        try {
            boolean mo9161a = interfaceC2287g.mo9161a(interfaceC2289h);
            interfaceC2289h.mo9280b();
            return mo9161a;
        } catch (EOFException unused) {
            interfaceC2289h.mo9280b();
            return false;
        } catch (Throwable th) {
            interfaceC2289h.mo9280b();
            throw th;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.InterfaceC2477h
    /* renamed from: a */
    public Pair<InterfaceC2287g, Boolean> mo10307a(InterfaceC2287g interfaceC2287g, Uri uri, C2676s c2676s, List<C2676s> list, C2213m c2213m, C2619F c2619f, Map<String, List<String>> map, InterfaceC2289h interfaceC2289h) {
        InterfaceC2287g c2252e;
        if (interfaceC2287g != null) {
            if ((interfaceC2287g instanceof C2295F) || (interfaceC2287g instanceof C2263h)) {
                return m10303a(interfaceC2287g);
            }
            if (interfaceC2287g instanceof C2486q) {
                c2252e = new C2486q(c2676s.f11201z, c2619f);
            } else if (interfaceC2287g instanceof C2305g) {
                c2252e = new C2305g();
            } else if (interfaceC2287g instanceof C2303e) {
                c2252e = new C2303e();
            } else {
                if (!(interfaceC2287g instanceof C2252e)) {
                    throw new IllegalArgumentException("Unexpected previousExtractor type: " + interfaceC2287g.getClass().getSimpleName());
                }
                c2252e = new C2252e();
            }
            return m10303a(c2252e);
        }
        InterfaceC2287g m10304a = m10304a(uri, c2676s, list, c2213m, c2619f);
        interfaceC2289h.mo9280b();
        if (m10306a(m10304a, interfaceC2289h)) {
            return m10303a(m10304a);
        }
        if (!(m10304a instanceof C2486q)) {
            C2486q c2486q = new C2486q(c2676s.f11201z, c2619f);
            if (m10306a(c2486q, interfaceC2289h)) {
                return m10303a(c2486q);
            }
        }
        if (!(m10304a instanceof C2305g)) {
            C2305g c2305g = new C2305g();
            if (m10306a(c2305g, interfaceC2289h)) {
                return m10303a(c2305g);
            }
        }
        if (!(m10304a instanceof C2303e)) {
            C2303e c2303e = new C2303e();
            if (m10306a(c2303e, interfaceC2289h)) {
                return m10303a(c2303e);
            }
        }
        if (!(m10304a instanceof C2252e)) {
            C2252e c2252e2 = new C2252e(0, 0L);
            if (m10306a(c2252e2, interfaceC2289h)) {
                return m10303a(c2252e2);
            }
        }
        if (!(m10304a instanceof C2263h)) {
            C2263h c2263h = new C2263h(0, c2619f, null, c2213m, list != null ? list : Collections.emptyList());
            if (m10306a(c2263h, interfaceC2289h)) {
                return m10303a(c2263h);
            }
        }
        if (!(m10304a instanceof C2295F)) {
            C2295F m10305a = m10305a(this.f9910a, c2676s, list, c2619f);
            if (m10306a(m10305a, interfaceC2289h)) {
                return m10303a(m10305a);
            }
        }
        return m10303a(m10304a);
    }
}
