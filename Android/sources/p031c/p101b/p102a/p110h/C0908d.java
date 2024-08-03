package p031c.p101b.p102a.p110h;

import android.content.Context;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.h.d */
/* loaded from: classes.dex */
public class C0908d {
    /* renamed from: a */
    public static int m4532a(Context context) {
        int identifier = context.getResources().getIdentifier("jpush_notification_icon", "drawable", context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        try {
            identifier = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
            C0923b.m4649e("ResourceHelper", "JPush.mPackageInconId == 0 ?, get icon from application info.");
            return identifier;
        } catch (Throwable th) {
            C0923b.m4645b("ResourceHelper", "failed to get application info and icon.", th);
            return identifier;
        }
    }
}
