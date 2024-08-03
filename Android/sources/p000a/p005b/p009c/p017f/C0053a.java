package p000a.p005b.p009c.p017f;

import android.support.v4.util.C0268n;
import android.util.Base64;
import java.util.List;

/* renamed from: a.b.c.f.a */
/* loaded from: classes.dex */
public final class C0053a {

    /* renamed from: a */
    private final String f176a;

    /* renamed from: b */
    private final String f177b;

    /* renamed from: c */
    private final String f178c;

    /* renamed from: d */
    private final List<List<byte[]>> f179d;

    /* renamed from: e */
    private final int f180e;

    /* renamed from: f */
    private final String f181f;

    public C0053a(String str, String str2, String str3, List<List<byte[]>> list) {
        C0268n.m1384a(str);
        this.f176a = str;
        C0268n.m1384a(str2);
        this.f177b = str2;
        C0268n.m1384a(str3);
        this.f178c = str3;
        C0268n.m1384a(list);
        this.f179d = list;
        this.f180e = 0;
        this.f181f = this.f176a + "-" + this.f177b + "-" + this.f178c;
    }

    /* renamed from: a */
    public List<List<byte[]>> m235a() {
        return this.f179d;
    }

    /* renamed from: b */
    public int m236b() {
        return this.f180e;
    }

    /* renamed from: c */
    public String m237c() {
        return this.f181f;
    }

    /* renamed from: d */
    public String m238d() {
        return this.f176a;
    }

    /* renamed from: e */
    public String m239e() {
        return this.f177b;
    }

    /* renamed from: f */
    public String m240f() {
        return this.f178c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f176a + ", mProviderPackage: " + this.f177b + ", mQuery: " + this.f178c + ", mCertificates:");
        for (int i = 0; i < this.f179d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f179d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f180e);
        return sb.toString();
    }
}
