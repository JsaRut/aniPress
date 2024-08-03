package p031c.p032a.p056W;

import android.content.Intent;

/* renamed from: c.a.W.c */
/* loaded from: classes.dex */
public final class C0582c {

    /* renamed from: a */
    public String f2789a;

    /* renamed from: b */
    public String f2790b;

    /* renamed from: c */
    public int f2791c;

    /* renamed from: d */
    public String f2792d;

    /* renamed from: e */
    public Intent f2793e;

    public C0582c() {
    }

    public C0582c(String str, String str2, int i) {
        this.f2789a = str;
        this.f2790b = str2;
        this.f2791c = i;
    }

    public final String toString() {
        return "JWakeTargetInfo{packageName='" + this.f2789a + "', serviceName='" + this.f2790b + "', targetVersion=" + this.f2791c + ", providerAuthority='" + this.f2792d + "', dActivityIntent=" + this.f2793e + '}';
    }
}
