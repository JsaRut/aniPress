package p031c.p032a.p042J;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import p031c.p032a.p060d.C0601d;

/* renamed from: c.a.J.a */
/* loaded from: classes.dex */
public class C0534a implements HostnameVerifier {

    /* renamed from: a */
    public String f2646a;

    public C0534a(String str) {
        this.f2646a = null;
        this.f2646a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        C0601d.m3072b("DefaultHostVerifier", "host:" + str + ",checkHost:" + this.f2646a);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f2646a, str);
    }
}
