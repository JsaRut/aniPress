package p139d.p143b.p145b.p147b;

import android.content.Context;
import java.io.File;
import p139d.p143b.p145b.p146a.C1651g;
import p139d.p143b.p145b.p146a.C1652h;
import p139d.p143b.p145b.p146a.InterfaceC1645a;
import p139d.p143b.p145b.p146a.InterfaceC1647c;
import p139d.p143b.p148c.p149a.C1672c;
import p139d.p143b.p148c.p149a.InterfaceC1671b;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;

/* renamed from: d.b.b.b.g */
/* loaded from: classes.dex */
public class C1661g {

    /* renamed from: a */
    private final int f6132a;

    /* renamed from: b */
    private final String f6133b;

    /* renamed from: c */
    private final InterfaceC1694m<File> f6134c;

    /* renamed from: d */
    private final long f6135d;

    /* renamed from: e */
    private final long f6136e;

    /* renamed from: f */
    private final long f6137f;

    /* renamed from: g */
    private final InterfaceC1667m f6138g;

    /* renamed from: h */
    private final InterfaceC1645a f6139h;

    /* renamed from: i */
    private final InterfaceC1647c f6140i;

    /* renamed from: j */
    private final InterfaceC1671b f6141j;

    /* renamed from: k */
    private final Context f6142k;

    /* renamed from: l */
    private final boolean f6143l;

    /* renamed from: d.b.b.b.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f6144a;

        /* renamed from: b */
        private String f6145b;

        /* renamed from: c */
        private InterfaceC1694m<File> f6146c;

        /* renamed from: d */
        private long f6147d;

        /* renamed from: e */
        private long f6148e;

        /* renamed from: f */
        private long f6149f;

        /* renamed from: g */
        private InterfaceC1667m f6150g;

        /* renamed from: h */
        private InterfaceC1645a f6151h;

        /* renamed from: i */
        private InterfaceC1647c f6152i;

        /* renamed from: j */
        private InterfaceC1671b f6153j;

        /* renamed from: k */
        private boolean f6154k;

        /* renamed from: l */
        private final Context f6155l;

        private a(Context context) {
            this.f6144a = 1;
            this.f6145b = "image_cache";
            this.f6147d = 41943040L;
            this.f6148e = 10485760L;
            this.f6149f = 2097152L;
            this.f6150g = new C1658d();
            this.f6155l = context;
        }

        /* renamed from: a */
        public C1661g m6894a() {
            C1691j.m6979b((this.f6146c == null && this.f6155l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f6146c == null && this.f6155l != null) {
                this.f6146c = new C1660f(this);
            }
            return new C1661g(this);
        }
    }

    private C1661g(a aVar) {
        this.f6132a = aVar.f6144a;
        String str = aVar.f6145b;
        C1691j.m6971a(str);
        this.f6133b = str;
        InterfaceC1694m<File> interfaceC1694m = aVar.f6146c;
        C1691j.m6971a(interfaceC1694m);
        this.f6134c = interfaceC1694m;
        this.f6135d = aVar.f6147d;
        this.f6136e = aVar.f6148e;
        this.f6137f = aVar.f6149f;
        InterfaceC1667m interfaceC1667m = aVar.f6150g;
        C1691j.m6971a(interfaceC1667m);
        this.f6138g = interfaceC1667m;
        this.f6139h = aVar.f6151h == null ? C1651g.m6823a() : aVar.f6151h;
        this.f6140i = aVar.f6152i == null ? C1652h.m6824b() : aVar.f6152i;
        this.f6141j = aVar.f6153j == null ? C1672c.m6935a() : aVar.f6153j;
        this.f6142k = aVar.f6155l;
        this.f6143l = aVar.f6154k;
    }

    /* renamed from: a */
    public static a m6869a(Context context) {
        return new a(context);
    }

    /* renamed from: a */
    public String m6870a() {
        return this.f6133b;
    }

    /* renamed from: b */
    public InterfaceC1694m<File> m6871b() {
        return this.f6134c;
    }

    /* renamed from: c */
    public InterfaceC1645a m6872c() {
        return this.f6139h;
    }

    /* renamed from: d */
    public InterfaceC1647c m6873d() {
        return this.f6140i;
    }

    /* renamed from: e */
    public Context m6874e() {
        return this.f6142k;
    }

    /* renamed from: f */
    public long m6875f() {
        return this.f6135d;
    }

    /* renamed from: g */
    public InterfaceC1671b m6876g() {
        return this.f6141j;
    }

    /* renamed from: h */
    public InterfaceC1667m m6877h() {
        return this.f6138g;
    }

    /* renamed from: i */
    public boolean m6878i() {
        return this.f6143l;
    }

    /* renamed from: j */
    public long m6879j() {
        return this.f6136e;
    }

    /* renamed from: k */
    public long m6880k() {
        return this.f6137f;
    }

    /* renamed from: l */
    public int m6881l() {
        return this.f6132a;
    }
}
