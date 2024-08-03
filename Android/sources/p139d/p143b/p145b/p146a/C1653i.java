package p139d.p143b.p145b.p146a;

import android.net.Uri;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.b.a.i */
/* loaded from: classes.dex */
public class C1653i implements InterfaceC1648d {

    /* renamed from: a */
    final String f6107a;

    public C1653i(String str) {
        C1691j.m6971a(str);
        this.f6107a = str;
    }

    @Override // p139d.p143b.p145b.p146a.InterfaceC1648d
    /* renamed from: a */
    public String mo6817a() {
        return this.f6107a;
    }

    @Override // p139d.p143b.p145b.p146a.InterfaceC1648d
    /* renamed from: a */
    public boolean mo6818a(Uri uri) {
        return this.f6107a.contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1653i) {
            return this.f6107a.equals(((C1653i) obj).f6107a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6107a.hashCode();
    }

    public String toString() {
        return this.f6107a;
    }
}
