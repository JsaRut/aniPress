package p139d.p143b.p145b.p146a;

import android.net.Uri;
import java.util.List;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.b.a.f */
/* loaded from: classes.dex */
public class C1650f implements InterfaceC1648d {

    /* renamed from: a */
    final List<InterfaceC1648d> f6104a;

    public C1650f(List<InterfaceC1648d> list) {
        C1691j.m6971a(list);
        this.f6104a = list;
    }

    @Override // p139d.p143b.p145b.p146a.InterfaceC1648d
    /* renamed from: a */
    public String mo6817a() {
        return this.f6104a.get(0).mo6817a();
    }

    @Override // p139d.p143b.p145b.p146a.InterfaceC1648d
    /* renamed from: a */
    public boolean mo6818a(Uri uri) {
        for (int i = 0; i < this.f6104a.size(); i++) {
            if (this.f6104a.get(i).mo6818a(uri)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public List<InterfaceC1648d> m6822b() {
        return this.f6104a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1650f) {
            return this.f6104a.equals(((C1650f) obj).f6104a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6104a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f6104a.toString();
    }
}
