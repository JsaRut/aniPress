package p031c.p032a.p072p.p073a.p080f.p083c;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.c.a */
/* loaded from: classes.dex */
public final class C0736a implements HostnameVerifier {

    /* renamed from: a */
    public String f3325a;

    public C0736a(String str) {
        this.f3325a = null;
        this.f3325a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        C0732b.m3718b("DefaultHostVerifier", "host:" + str + ",checkHost:" + this.f3325a);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f3325a, str);
    }
}
