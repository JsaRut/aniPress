package p139d.p225c.p226a.p227a.p250j.p255d.p256a;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.C2676s;

/* renamed from: d.c.a.a.j.d.a.d */
/* loaded from: classes.dex */
public final class C2465d extends AbstractC2467f {

    /* renamed from: d */
    public static final C2465d f9830d = new C2465d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap());

    /* renamed from: e */
    public final List<a> f9831e;

    /* renamed from: f */
    public final List<a> f9832f;

    /* renamed from: g */
    public final List<a> f9833g;

    /* renamed from: h */
    public final C2676s f9834h;

    /* renamed from: i */
    public final List<C2676s> f9835i;

    /* renamed from: j */
    public final Map<String, String> f9836j;

    /* renamed from: d.c.a.a.j.d.a.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f9837a;

        /* renamed from: b */
        public final C2676s f9838b;

        public a(String str, C2676s c2676s) {
            this.f9837a = str;
            this.f9838b = c2676s;
        }

        /* renamed from: a */
        public static a m10273a(String str) {
            return new a(str, C2676s.m11433a("0", (String) null, "application/x-mpegURL", (String) null, (String) null, -1, 0, (String) null));
        }
    }

    public C2465d(String str, List<String> list, List<a> list2, List<a> list3, List<a> list4, C2676s c2676s, List<C2676s> list5, boolean z, Map<String, String> map) {
        super(str, list, z);
        this.f9831e = Collections.unmodifiableList(list2);
        this.f9832f = Collections.unmodifiableList(list3);
        this.f9833g = Collections.unmodifiableList(list4);
        this.f9834h = c2676s;
        this.f9835i = list5 != null ? Collections.unmodifiableList(list5) : null;
        this.f9836j = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public static C2465d m10272a(String str) {
        List singletonList = Collections.singletonList(a.m10273a(str));
        List emptyList = Collections.emptyList();
        return new C2465d(null, Collections.emptyList(), singletonList, emptyList, emptyList, null, null, false, Collections.emptyMap());
    }
}
