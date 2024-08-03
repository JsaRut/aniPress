package p139d.p143b.p184i.p190d;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p159k.C1724b;
import p139d.p143b.p184i.p191e.C1878b;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p191e.C1882f;

/* renamed from: d.b.i.d.e */
/* loaded from: classes.dex */
public class C1855e implements InterfaceC1648d {

    /* renamed from: a */
    private final String f6789a;

    /* renamed from: b */
    private final C1881e f6790b;

    /* renamed from: c */
    private final C1882f f6791c;

    /* renamed from: d */
    private final C1878b f6792d;

    /* renamed from: e */
    private final InterfaceC1648d f6793e;

    /* renamed from: f */
    private final String f6794f;

    /* renamed from: g */
    private final int f6795g;

    /* renamed from: h */
    private final Object f6796h;

    /* renamed from: i */
    private final long f6797i;

    public C1855e(String str, C1881e c1881e, C1882f c1882f, C1878b c1878b, InterfaceC1648d interfaceC1648d, String str2, Object obj) {
        C1691j.m6971a(str);
        this.f6789a = str;
        this.f6790b = c1881e;
        this.f6791c = c1882f;
        this.f6792d = c1878b;
        this.f6793e = interfaceC1648d;
        this.f6794f = str2;
        this.f6795g = C1724b.m7075a(Integer.valueOf(str.hashCode()), Integer.valueOf(c1881e != null ? c1881e.hashCode() : 0), Integer.valueOf(c1882f.hashCode()), this.f6792d, this.f6793e, str2);
        this.f6796h = obj;
        this.f6797i = RealtimeSinceBootClock.get().now();
    }

    @Override // p139d.p143b.p145b.p146a.InterfaceC1648d
    /* renamed from: a */
    public String mo6817a() {
        return this.f6789a;
    }

    @Override // p139d.p143b.p145b.p146a.InterfaceC1648d
    /* renamed from: a */
    public boolean mo6818a(Uri uri) {
        return mo6817a().contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1855e)) {
            return false;
        }
        C1855e c1855e = (C1855e) obj;
        return this.f6795g == c1855e.f6795g && this.f6789a.equals(c1855e.f6789a) && C1690i.m6963a(this.f6790b, c1855e.f6790b) && C1690i.m6963a(this.f6791c, c1855e.f6791c) && C1690i.m6963a(this.f6792d, c1855e.f6792d) && C1690i.m6963a(this.f6793e, c1855e.f6793e) && C1690i.m6963a(this.f6794f, c1855e.f6794f);
    }

    public int hashCode() {
        return this.f6795g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f6789a, this.f6790b, this.f6791c, this.f6792d, this.f6793e, this.f6794f, Integer.valueOf(this.f6795g));
    }
}
