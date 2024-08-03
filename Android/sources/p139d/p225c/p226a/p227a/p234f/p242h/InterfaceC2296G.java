package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.G */
/* loaded from: classes.dex */
public interface InterfaceC2296G {

    /* renamed from: d.c.a.a.f.h.G$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f8855a;

        /* renamed from: b */
        public final int f8856b;

        /* renamed from: c */
        public final byte[] f8857c;

        public a(String str, int i, byte[] bArr) {
            this.f8855a = str;
            this.f8856b = i;
            this.f8857c = bArr;
        }
    }

    /* renamed from: d.c.a.a.f.h.G$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f8858a;

        /* renamed from: b */
        public final String f8859b;

        /* renamed from: c */
        public final List<a> f8860c;

        /* renamed from: d */
        public final byte[] f8861d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            this.f8858a = i;
            this.f8859b = str;
            this.f8860c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f8861d = bArr;
        }
    }

    /* renamed from: d.c.a.a.f.h.G$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        SparseArray<InterfaceC2296G> mo9545a();

        /* renamed from: a */
        InterfaceC2296G mo9546a(int i, b bVar);
    }

    /* renamed from: d.c.a.a.f.h.G$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f8862a;

        /* renamed from: b */
        private final int f8863b;

        /* renamed from: c */
        private final int f8864c;

        /* renamed from: d */
        private int f8865d;

        /* renamed from: e */
        private String f8866e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f8862a = str;
            this.f8863b = i2;
            this.f8864c = i3;
            this.f8865d = Integer.MIN_VALUE;
        }

        /* renamed from: d */
        private void m9547d() {
            if (this.f8865d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void m9548a() {
            int i = this.f8865d;
            this.f8865d = i == Integer.MIN_VALUE ? this.f8863b : i + this.f8864c;
            this.f8866e = this.f8862a + this.f8865d;
        }

        /* renamed from: b */
        public String m9549b() {
            m9547d();
            return this.f8866e;
        }

        /* renamed from: c */
        public int m9550c() {
            m9547d();
            return this.f8865d;
        }
    }

    /* renamed from: a */
    void mo9503a();

    /* renamed from: a */
    void mo9504a(C2619F c2619f, InterfaceC2325i interfaceC2325i, d dVar);

    /* renamed from: a */
    void mo9505a(C2644u c2644u, int i);
}
