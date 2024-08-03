package p031c.p101b.p102a.p114l;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: c.b.a.l.m */
/* loaded from: classes.dex */
public class C0934m {

    /* renamed from: a */
    private static int f3956a = -1;

    /* renamed from: b */
    private static int f3957b = -1;

    /* renamed from: c */
    private static float f3958c = -1.0f;

    /* renamed from: d */
    private static float f3959d = -1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.b.a.l.m$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo4684a(View view);
    }

    /* renamed from: a */
    public static int m4686a() {
        return f3956a;
    }

    /* renamed from: a */
    public static void m4688a(Context context) {
        try {
            if (f3956a == -1 || f3957b == -1) {
                m4695c(context);
                if (f3956a == -1 || f3957b == -1) {
                    m4693b(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m4689a(View view, a aVar) {
        if (view == null || aVar == null) {
            return;
        }
        aVar.mo4684a(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4689a(viewGroup.getChildAt(i), aVar);
            }
        }
    }

    /* renamed from: b */
    public static int m4691b() {
        return f3957b;
    }

    @TargetApi(11)
    /* renamed from: b */
    private static void m4693b(Context context) {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle("title");
        builder.setContentText("content");
        try {
            ViewGroup viewGroup = (ViewGroup) (Build.VERSION.SDK_INT >= 24 ? builder.createContentView() : (Build.VERSION.SDK_INT >= 16 ? builder.build() : builder.getNotification()).contentView).apply(context, new FrameLayout(context));
            C0923b.m4642a("NotificationStyleHelper", "begain fetch colors by internal , root view is :" + viewGroup);
            m4689a(viewGroup, new C0932k());
        } catch (Throwable th) {
            C0923b.m4646c("NotificationStyleHelper", "getNotificationColorInternal error:" + th.getMessage());
        }
    }

    /* renamed from: c */
    public static float m4694c() {
        return f3958c;
    }

    @TargetApi(11)
    /* renamed from: c */
    private static void m4695c(Context context) {
        try {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setContentTitle("title");
            builder.setContentText("content");
            if (Build.VERSION.SDK_INT >= 16) {
                builder.setSubText("subtext");
            }
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate((Build.VERSION.SDK_INT >= 24 ? builder.createContentView() : (Build.VERSION.SDK_INT >= 16 ? builder.build() : builder.getNotification()).contentView).getLayoutId(), (ViewGroup) null);
            C0923b.m4642a("NotificationStyleHelper", "begain fetch colors by compat, root view is :" + viewGroup);
            m4689a(viewGroup, new C0933l());
        } catch (Throwable th) {
            C0923b.m4646c("NotificationStyleHelper", "getNotificationColorCompat error:" + th.getMessage());
        }
    }

    /* renamed from: d */
    public static float m4696d() {
        return f3959d;
    }
}
