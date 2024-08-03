package p031c.p101b.p102a.p104b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.b.a */
/* loaded from: classes.dex */
public class C0878a extends C0882e {

    /* renamed from: e */
    public int f3696e;

    /* renamed from: g */
    protected Context f3698g;

    /* renamed from: c */
    public int f3694c = -2;

    /* renamed from: d */
    public int f3695d = 16;

    /* renamed from: f */
    public String f3697f = "developerArg0";

    public C0878a(Context context) {
        this.f3696e = 0;
        if (context == null) {
            throw new IllegalArgumentException("NULL context");
        }
        this.f3698g = context;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo == null) {
                C0923b.m4648d("BasicPushNotificationBu", "JPush get NULL appInfo.");
            } else {
                this.f3696e = applicationInfo.icon;
            }
        } catch (Throwable unused) {
            C0923b.m4654j("BasicPushNotificationBu", "[statusBarDrawable] JPush get NULL appInfo.");
        }
    }

    @Override // p031c.p101b.p102a.p104b.C0882e
    @TargetApi(11)
    /* renamed from: a */
    Notification mo4300a(Notification.Builder builder) {
        int i = this.f3694c;
        if (i != -2) {
            builder.setDefaults(i);
        }
        builder.setSmallIcon(this.f3696e);
        Notification build = Build.VERSION.SDK_INT >= 16 ? builder.build() : builder.getNotification();
        build.flags = this.f3695d | 1;
        return build;
    }

    @Override // p031c.p101b.p102a.p104b.InterfaceC0887j
    /* renamed from: a */
    public String mo4301a() {
        return this.f3697f;
    }

    @Override // p031c.p101b.p102a.p104b.C0882e
    /* renamed from: a */
    void mo4302a(Notification notification) {
        notification.defaults = this.f3694c;
        notification.flags = this.f3695d;
        notification.icon = this.f3696e;
    }

    /* renamed from: b */
    String m4303b() {
        return this.f3694c + "_____" + this.f3695d + "_____" + this.f3696e + "_____" + this.f3697f;
    }

    public String toString() {
        return "basic_____" + m4303b();
    }
}
