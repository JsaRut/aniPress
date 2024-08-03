package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k;

/* renamed from: d.c.a.a.j.c.a.j */
/* loaded from: classes.dex */
public abstract class AbstractC2444j {

    /* renamed from: a */
    public final String f9635a;

    /* renamed from: b */
    public final long f9636b;

    /* renamed from: c */
    public final C2676s f9637c;

    /* renamed from: d */
    public final String f9638d;

    /* renamed from: e */
    public final long f9639e;

    /* renamed from: f */
    public final List<C2438d> f9640f;

    /* renamed from: g */
    private final C2442h f9641g;

    /* renamed from: d.c.a.a.j.c.a.j$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2444j implements InterfaceC2455h {

        /* renamed from: h */
        private final AbstractC2445k.a f9642h;

        public a(String str, long j, C2676s c2676s, String str2, AbstractC2445k.a aVar, List<C2438d> list) {
            super(str, j, c2676s, str2, aVar, list);
            this.f9642h = aVar;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
        /* renamed from: a */
        public long mo10107a(long j) {
            return this.f9642h.m10120b(j);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
        /* renamed from: a */
        public long mo10108a(long j, long j2) {
            return this.f9642h.m10117a(j, j2);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
        /* renamed from: a */
        public boolean mo10109a() {
            return this.f9642h.mo10122c();
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
        /* renamed from: b */
        public long mo10110b() {
            return this.f9642h.m10119b();
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
        /* renamed from: b */
        public long mo10111b(long j, long j2) {
            return this.f9642h.m10121b(j, j2);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
        /* renamed from: b */
        public C2442h mo10112b(long j) {
            return this.f9642h.mo10118a(this, j);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
        /* renamed from: c */
        public int mo10113c(long j) {
            return this.f9642h.mo10116a(j);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j
        /* renamed from: c */
        public String mo10103c() {
            return null;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j
        /* renamed from: d */
        public InterfaceC2455h mo10104d() {
            return this;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j
        /* renamed from: e */
        public C2442h mo10105e() {
            return null;
        }
    }

    /* renamed from: d.c.a.a.j.c.a.j$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC2444j {

        /* renamed from: h */
        public final Uri f9643h;

        /* renamed from: i */
        public final long f9644i;

        /* renamed from: j */
        private final String f9645j;

        /* renamed from: k */
        private final C2442h f9646k;

        /* renamed from: l */
        private final C2446l f9647l;

        public b(String str, long j, C2676s c2676s, String str2, AbstractC2445k.e eVar, List<C2438d> list, String str3, long j2) {
            super(str, j, c2676s, str2, eVar, list);
            String str4;
            this.f9643h = Uri.parse(str2);
            this.f9646k = eVar.m10123b();
            if (str3 != null) {
                str4 = str3;
            } else if (str != null) {
                str4 = str + "." + c2676s.f11176a + "." + j;
            } else {
                str4 = null;
            }
            this.f9645j = str4;
            this.f9644i = j2;
            this.f9647l = this.f9646k == null ? new C2446l(new C2442h(null, 0L, j2)) : null;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j
        /* renamed from: c */
        public String mo10103c() {
            return this.f9645j;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j
        /* renamed from: d */
        public InterfaceC2455h mo10104d() {
            return this.f9647l;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j
        /* renamed from: e */
        public C2442h mo10105e() {
            return this.f9646k;
        }
    }

    private AbstractC2444j(String str, long j, C2676s c2676s, String str2, AbstractC2445k abstractC2445k, List<C2438d> list) {
        this.f9635a = str;
        this.f9636b = j;
        this.f9637c = c2676s;
        this.f9638d = str2;
        this.f9640f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f9641g = abstractC2445k.mo10115a(this);
        this.f9639e = abstractC2445k.m10114a();
    }

    /* synthetic */ AbstractC2444j(String str, long j, C2676s c2676s, String str2, AbstractC2445k abstractC2445k, List list, C2443i c2443i) {
        this(str, j, c2676s, str2, abstractC2445k, list);
    }

    /* renamed from: a */
    public static AbstractC2444j m10101a(String str, long j, C2676s c2676s, String str2, AbstractC2445k abstractC2445k, List<C2438d> list) {
        return m10102a(str, j, c2676s, str2, abstractC2445k, list, null);
    }

    /* renamed from: a */
    public static AbstractC2444j m10102a(String str, long j, C2676s c2676s, String str2, AbstractC2445k abstractC2445k, List<C2438d> list, String str3) {
        if (abstractC2445k instanceof AbstractC2445k.e) {
            return new b(str, j, c2676s, str2, (AbstractC2445k.e) abstractC2445k, list, str3, -1L);
        }
        if (abstractC2445k instanceof AbstractC2445k.a) {
            return new a(str, j, c2676s, str2, (AbstractC2445k.a) abstractC2445k, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: c */
    public abstract String mo10103c();

    /* renamed from: d */
    public abstract InterfaceC2455h mo10104d();

    /* renamed from: e */
    public abstract C2442h mo10105e();

    /* renamed from: f */
    public C2442h m10106f() {
        return this.f9641g;
    }
}
