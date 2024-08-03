package p139d.p225c.p226a.p227a.p269m;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.m.r */
/* loaded from: classes.dex */
public final class C2604r implements InterfaceC2597k {

    /* renamed from: a */
    private final Context f10819a;

    /* renamed from: b */
    private final List<InterfaceC2586E> f10820b;

    /* renamed from: c */
    private final InterfaceC2597k f10821c;

    /* renamed from: d */
    private InterfaceC2597k f10822d;

    /* renamed from: e */
    private InterfaceC2597k f10823e;

    /* renamed from: f */
    private InterfaceC2597k f10824f;

    /* renamed from: g */
    private InterfaceC2597k f10825g;

    /* renamed from: h */
    private InterfaceC2597k f10826h;

    /* renamed from: i */
    private InterfaceC2597k f10827i;

    /* renamed from: j */
    private InterfaceC2597k f10828j;

    public C2604r(Context context, InterfaceC2597k interfaceC2597k) {
        this.f10819a = context.getApplicationContext();
        C2628e.m11110a(interfaceC2597k);
        this.f10821c = interfaceC2597k;
        this.f10820b = new ArrayList();
    }

    /* renamed from: a */
    private void m10940a(InterfaceC2597k interfaceC2597k) {
        for (int i = 0; i < this.f10820b.size(); i++) {
            interfaceC2597k.mo10300a(this.f10820b.get(i));
        }
    }

    /* renamed from: a */
    private void m10941a(InterfaceC2597k interfaceC2597k, InterfaceC2586E interfaceC2586E) {
        if (interfaceC2597k != null) {
            interfaceC2597k.mo10300a(interfaceC2586E);
        }
    }

    /* renamed from: b */
    private InterfaceC2597k m10942b() {
        if (this.f10823e == null) {
            this.f10823e = new C2591e(this.f10819a);
            m10940a(this.f10823e);
        }
        return this.f10823e;
    }

    /* renamed from: c */
    private InterfaceC2597k m10943c() {
        if (this.f10824f == null) {
            this.f10824f = new C2594h(this.f10819a);
            m10940a(this.f10824f);
        }
        return this.f10824f;
    }

    /* renamed from: d */
    private InterfaceC2597k m10944d() {
        if (this.f10826h == null) {
            this.f10826h = new C2595i();
            m10940a(this.f10826h);
        }
        return this.f10826h;
    }

    /* renamed from: e */
    private InterfaceC2597k m10945e() {
        if (this.f10822d == null) {
            this.f10822d = new C2607u();
            m10940a(this.f10822d);
        }
        return this.f10822d;
    }

    /* renamed from: f */
    private InterfaceC2597k m10946f() {
        if (this.f10827i == null) {
            this.f10827i = new C2584C(this.f10819a);
            m10940a(this.f10827i);
        }
        return this.f10827i;
    }

    /* renamed from: g */
    private InterfaceC2597k m10947g() {
        if (this.f10825g == null) {
            try {
                this.f10825g = (InterfaceC2597k) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                m10940a(this.f10825g);
            } catch (ClassNotFoundException unused) {
                C2638o.m11160d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.f10825g == null) {
                this.f10825g = this.f10821c;
            }
        }
        return this.f10825g;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        InterfaceC2597k m10943c;
        C2628e.m11113b(this.f10828j == null);
        String scheme = c2600n.f10782a.getScheme();
        if (C2622I.m11064a(c2600n.f10782a)) {
            if (!c2600n.f10782a.getPath().startsWith("/android_asset/")) {
                m10943c = m10945e();
            }
            m10943c = m10942b();
        } else {
            if (!"asset".equals(scheme)) {
                m10943c = "content".equals(scheme) ? m10943c() : "rtmp".equals(scheme) ? m10947g() : "data".equals(scheme) ? m10944d() : "rawresource".equals(scheme) ? m10946f() : this.f10821c;
            }
            m10943c = m10942b();
        }
        this.f10828j = m10943c;
        return this.f10828j.mo9121a(c2600n);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public Map<String, List<String>> mo9122a() {
        InterfaceC2597k interfaceC2597k = this.f10828j;
        return interfaceC2597k == null ? Collections.emptyMap() : interfaceC2597k.mo9122a();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public void mo10300a(InterfaceC2586E interfaceC2586E) {
        this.f10821c.mo10300a(interfaceC2586E);
        this.f10820b.add(interfaceC2586E);
        m10941a(this.f10822d, interfaceC2586E);
        m10941a(this.f10823e, interfaceC2586E);
        m10941a(this.f10824f, interfaceC2586E);
        m10941a(this.f10825g, interfaceC2586E);
        m10941a(this.f10826h, interfaceC2586E);
        m10941a(this.f10827i, interfaceC2586E);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        InterfaceC2597k interfaceC2597k = this.f10828j;
        if (interfaceC2597k != null) {
            try {
                interfaceC2597k.close();
            } finally {
                this.f10828j = null;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        InterfaceC2597k interfaceC2597k = this.f10828j;
        if (interfaceC2597k == null) {
            return null;
        }
        return interfaceC2597k.getUri();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        InterfaceC2597k interfaceC2597k = this.f10828j;
        C2628e.m11110a(interfaceC2597k);
        return interfaceC2597k.read(bArr, i, i2);
    }
}
