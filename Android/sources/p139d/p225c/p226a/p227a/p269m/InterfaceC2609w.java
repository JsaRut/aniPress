package p139d.p225c.p226a.p227a.p269m;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2646w;

/* renamed from: d.c.a.a.m.w */
/* loaded from: classes.dex */
public interface InterfaceC2609w extends InterfaceC2597k {

    /* renamed from: b */
    public static final InterfaceC2646w<String> f10837b = new InterfaceC2646w() { // from class: d.c.a.a.m.b
        @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2646w
        public final boolean evaluate(Object obj) {
            return C2608v.m10951a((String) obj);
        }
    };

    /* renamed from: d.c.a.a.m.w$a */
    /* loaded from: classes.dex */
    public static abstract class a implements b {

        /* renamed from: a */
        private final f f10838a = new f();

        @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k.a
        /* renamed from: a */
        public final InterfaceC2609w mo10923a() {
            return mo9123a(this.f10838a);
        }

        /* renamed from: a */
        protected abstract InterfaceC2609w mo9123a(f fVar);

        /* renamed from: b */
        public final f m10952b() {
            return this.f10838a;
        }
    }

    /* renamed from: d.c.a.a.m.w$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC2597k.a {
    }

    /* renamed from: d.c.a.a.m.w$c */
    /* loaded from: classes.dex */
    public static class c extends IOException {

        /* renamed from: a */
        public final int f10839a;

        /* renamed from: b */
        public final C2600n f10840b;

        public c(IOException iOException, C2600n c2600n, int i) {
            super(iOException);
            this.f10840b = c2600n;
            this.f10839a = i;
        }

        public c(String str, C2600n c2600n, int i) {
            super(str);
            this.f10840b = c2600n;
            this.f10839a = i;
        }

        public c(String str, IOException iOException, C2600n c2600n, int i) {
            super(str, iOException);
            this.f10840b = c2600n;
            this.f10839a = i;
        }
    }

    /* renamed from: d.c.a.a.m.w$d */
    /* loaded from: classes.dex */
    public static final class d extends c {

        /* renamed from: c */
        public final String f10841c;

        public d(String str, C2600n c2600n) {
            super("Invalid content type: " + str, c2600n, 1);
            this.f10841c = str;
        }
    }

    /* renamed from: d.c.a.a.m.w$e */
    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: c */
        public final int f10842c;

        /* renamed from: d */
        public final String f10843d;

        /* renamed from: e */
        public final Map<String, List<String>> f10844e;

        public e(int i, String str, Map<String, List<String>> map, C2600n c2600n) {
            super("Response code: " + i, c2600n, 1);
            this.f10842c = i;
            this.f10843d = str;
            this.f10844e = map;
        }
    }

    /* renamed from: d.c.a.a.m.w$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        private final Map<String, String> f10845a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f10846b;

        /* renamed from: a */
        public synchronized Map<String, String> m10953a() {
            if (this.f10846b == null) {
                this.f10846b = Collections.unmodifiableMap(new HashMap(this.f10845a));
            }
            return this.f10846b;
        }

        /* renamed from: a */
        public synchronized void m10954a(Map<String, String> map) {
            this.f10846b = null;
            this.f10845a.putAll(map);
        }
    }
}
