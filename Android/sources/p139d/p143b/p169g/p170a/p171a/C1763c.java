package p139d.p143b.p169g.p170a.p171a;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p169g.p182i.C1824f;
import p139d.p143b.p184i.p192f.C1893j;
import p139d.p143b.p184i.p192f.C1895l;
import p139d.p143b.p184i.p192f.C1898o;

/* renamed from: d.b.g.a.a.c */
/* loaded from: classes.dex */
public class C1763c {

    /* renamed from: a */
    private static final Class<?> f6384a = C1763c.class;

    /* renamed from: b */
    private static C1767g f6385b = null;

    /* renamed from: c */
    private static volatile boolean f6386c = false;

    private C1763c() {
    }

    /* renamed from: a */
    public static C1893j m7207a() {
        return m7211b().m7793e();
    }

    /* renamed from: a */
    private static void m7208a(Context context, C1762b c1762b) {
        f6385b = new C1767g(context, c1762b);
        C1824f.m7505a(f6385b);
    }

    /* renamed from: a */
    public static void m7209a(Context context, C1895l c1895l) {
        m7210a(context, c1895l, null);
    }

    /* renamed from: a */
    public static void m7210a(Context context, C1895l c1895l, C1762b c1762b) {
        if (f6386c) {
            C1700a.m7009c(f6384a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f6386c = true;
        }
        try {
            SoLoader.m6383a(context, 0);
            Context applicationContext = context.getApplicationContext();
            if (c1895l == null) {
                C1898o.m7781b(applicationContext);
            } else {
                C1898o.m7780a(c1895l);
            }
            m7208a(applicationContext, c1762b);
        } catch (IOException e2) {
            throw new RuntimeException("Could not initialize SoLoader", e2);
        }
    }

    /* renamed from: b */
    public static C1898o m7211b() {
        return C1898o.m7782f();
    }

    /* renamed from: c */
    public static C1766f m7212c() {
        return f6385b.get();
    }
}
