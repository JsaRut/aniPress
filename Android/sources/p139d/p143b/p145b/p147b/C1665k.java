package p139d.p143b.p145b.p147b;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p139d.p143b.p144a.InterfaceC1643a;
import p139d.p143b.p145b.p146a.InterfaceC1645a;
import p139d.p143b.p145b.p147b.InterfaceC1662h;
import p139d.p143b.p148c.p151c.C1679a;
import p139d.p143b.p148c.p151c.C1681c;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: d.b.b.b.k */
/* loaded from: classes.dex */
public class C1665k implements InterfaceC1662h {

    /* renamed from: a */
    private static final Class<?> f6183a = C1665k.class;

    /* renamed from: b */
    private final int f6184b;

    /* renamed from: c */
    private final InterfaceC1694m<File> f6185c;

    /* renamed from: d */
    private final String f6186d;

    /* renamed from: e */
    private final InterfaceC1645a f6187e;

    /* renamed from: f */
    volatile a f6188f = new a(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.b.b.b.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final InterfaceC1662h f6189a;

        /* renamed from: b */
        public final File f6190b;

        a(File file, InterfaceC1662h interfaceC1662h) {
            this.f6189a = interfaceC1662h;
            this.f6190b = file;
        }
    }

    public C1665k(int i, InterfaceC1694m<File> interfaceC1694m, String str, InterfaceC1645a interfaceC1645a) {
        this.f6184b = i;
        this.f6187e = interfaceC1645a;
        this.f6185c = interfaceC1694m;
        this.f6186d = str;
    }

    /* renamed from: g */
    private void m6919g() {
        File file = new File(this.f6185c.get(), this.f6186d);
        m6921a(file);
        this.f6188f = new a(file, new C1656b(file, this.f6184b, this.f6187e));
    }

    /* renamed from: h */
    private boolean m6920h() {
        File file;
        a aVar = this.f6188f;
        return aVar.f6189a == null || (file = aVar.f6190b) == null || !file.exists();
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: a */
    public long mo6844a(InterfaceC1662h.a aVar) {
        return m6923f().mo6844a(aVar);
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: a */
    public InterfaceC1662h.b mo6845a(String str, Object obj) {
        return m6923f().mo6845a(str, obj);
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: a */
    public void mo6846a() {
        m6923f().mo6846a();
    }

    /* renamed from: a */
    void m6921a(File file) {
        try {
            C1681c.m6949a(file);
            C1700a.m6990a(f6183a, "Created cache directory %s", file.getAbsolutePath());
        } catch (C1681c.a e2) {
            this.f6187e.mo6808a(InterfaceC1645a.a.WRITE_CREATE_DIR, f6183a, "createRootDirectoryIfNecessary", e2);
            throw e2;
        }
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: b */
    public boolean mo6848b() {
        try {
            return m6923f().mo6848b();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: b */
    public boolean mo6849b(String str, Object obj) {
        return m6923f().mo6849b(str, obj);
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: c */
    public InterfaceC1643a mo6850c(String str, Object obj) {
        return m6923f().mo6850c(str, obj);
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: c */
    public void mo6851c() {
        try {
            m6923f().mo6851c();
        } catch (IOException e2) {
            C1700a.m6994a(f6183a, "purgeUnexpectedResources", (Throwable) e2);
        }
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: d */
    public Collection<InterfaceC1662h.a> mo6852d() {
        return m6923f().mo6852d();
    }

    /* renamed from: e */
    void m6922e() {
        if (this.f6188f.f6189a == null || this.f6188f.f6190b == null) {
            return;
        }
        C1679a.m6948b(this.f6188f.f6190b);
    }

    /* renamed from: f */
    synchronized InterfaceC1662h m6923f() {
        InterfaceC1662h interfaceC1662h;
        if (m6920h()) {
            m6922e();
            m6919g();
        }
        interfaceC1662h = this.f6188f.f6189a;
        C1691j.m6971a(interfaceC1662h);
        return interfaceC1662h;
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    public long remove(String str) {
        return m6923f().remove(str);
    }
}
