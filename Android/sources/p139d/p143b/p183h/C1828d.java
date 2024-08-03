package p139d.p143b.p183h;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import p139d.p143b.p148c.p152d.C1682a;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.C1699r;
import p139d.p143b.p183h.C1827c;

/* renamed from: d.b.h.d */
/* loaded from: classes.dex */
public class C1828d {

    /* renamed from: a */
    private static C1828d f6752a;

    /* renamed from: b */
    private int f6753b;

    /* renamed from: c */
    private List<C1827c.a> f6754c;

    /* renamed from: d */
    private final C1827c.a f6755d = new C1825a();

    private C1828d() {
        m7523b();
    }

    /* renamed from: a */
    private static int m7520a(int i, InputStream inputStream, byte[] bArr) {
        C1691j.m6971a(inputStream);
        C1691j.m6971a(bArr);
        C1691j.m6974a(bArr.length >= i);
        if (!inputStream.markSupported()) {
            return C1682a.m6951a(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return C1682a.m6951a(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: a */
    public static synchronized C1828d m7521a() {
        C1828d c1828d;
        synchronized (C1828d.class) {
            if (f6752a == null) {
                f6752a = new C1828d();
            }
            c1828d = f6752a;
        }
        return c1828d;
    }

    /* renamed from: b */
    public static C1827c m7522b(InputStream inputStream) {
        return m7521a().m7525a(inputStream);
    }

    /* renamed from: b */
    private void m7523b() {
        this.f6753b = this.f6755d.mo7515a();
        List<C1827c.a> list = this.f6754c;
        if (list != null) {
            Iterator<C1827c.a> it = list.iterator();
            while (it.hasNext()) {
                this.f6753b = Math.max(this.f6753b, it.next().mo7515a());
            }
        }
    }

    /* renamed from: c */
    public static C1827c m7524c(InputStream inputStream) {
        try {
            return m7522b(inputStream);
        } catch (IOException e2) {
            C1699r.m6984a(e2);
            throw null;
        }
    }

    /* renamed from: a */
    public C1827c m7525a(InputStream inputStream) {
        C1691j.m6971a(inputStream);
        int i = this.f6753b;
        byte[] bArr = new byte[i];
        int m7520a = m7520a(i, inputStream, bArr);
        C1827c mo7516a = this.f6755d.mo7516a(bArr, m7520a);
        if (mo7516a != null && mo7516a != C1827c.f6749a) {
            return mo7516a;
        }
        List<C1827c.a> list = this.f6754c;
        if (list != null) {
            Iterator<C1827c.a> it = list.iterator();
            while (it.hasNext()) {
                C1827c mo7516a2 = it.next().mo7516a(bArr, m7520a);
                if (mo7516a2 != null && mo7516a2 != C1827c.f6749a) {
                    return mo7516a2;
                }
            }
        }
        return C1827c.f6749a;
    }
}
