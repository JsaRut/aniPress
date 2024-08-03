package p031c.p101b.p102a.p104b;

import android.os.Bundle;

/* renamed from: c.b.a.b.c */
/* loaded from: classes.dex */
public class C0880c {

    /* renamed from: a */
    public int f3706a;

    /* renamed from: b */
    public int f3707b;

    /* renamed from: c */
    public String f3708c;

    /* renamed from: d */
    public Bundle f3709d;

    public C0880c(int i, int i2, String str, Bundle bundle) {
        this.f3706a = i;
        this.f3707b = i2;
        this.f3708c = str;
        this.f3709d = bundle;
    }

    public String toString() {
        return "CmdMessage{cmd=" + this.f3706a + ", errorCode=" + this.f3707b + ", msg='" + this.f3708c + "', extra=" + this.f3709d + '}';
    }
}
