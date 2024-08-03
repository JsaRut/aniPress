package p031c.p032a.p065i;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0816e;
import p031c.p032a.p092s.AbstractC0832h;

/* renamed from: c.a.i.q */
/* loaded from: classes.dex */
public final class C0674q {

    /* renamed from: a */
    private static volatile C0674q f3121a;

    /* renamed from: b */
    private static final Object f3122b = new Object();

    /* renamed from: c */
    private Map<Long, String> f3123c = new HashMap();

    /* renamed from: a */
    public static C0674q m3457a() {
        if (f3121a == null) {
            synchronized (f3122b) {
                if (f3121a == null) {
                    f3121a = new C0674q();
                }
            }
        }
        return f3121a;
    }

    /* renamed from: a */
    private static String m3458a(Context context, String str, String str2) {
        String str3 = (String) C0618c.m3190a(context, C0617b.m3154a(str));
        if (!TextUtils.isEmpty(str2) && !str2.equals(str3)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("need not ");
        sb.append(str);
        sb.append(" userctrl,newest version:");
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        sb.append(str2);
        C0675a.m3465a("UserCtrlHelper", sb.toString());
        return "";
    }

    /* renamed from: a */
    public final void m3459a(long j) {
        C0675a.m3469c("UserCtrlHelper", "onUserCtrlTimeout rid:" + j);
        this.f3123c.remove(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void m3460a(long j, int i) {
        String remove = this.f3123c.remove(Long.valueOf(j));
        if (TextUtils.isEmpty(remove)) {
            C0675a.m3469c("UserCtrlHelper", "onUserCtrlFailed but not found rid:" + j);
            return;
        }
        C0675a.m3469c("UserCtrlHelper", "onUserCtrlFailed rid:" + j + ",sdkType:" + remove + ",errorCode:" + i);
        C0659b.m3371a();
        if (TextUtils.isEmpty(C0659b.m3372a(remove, ""))) {
            C0675a.m3469c("UserCtrlHelper", "onUserCtrlFailed but not found sdkversion by sdkType:" + remove);
        }
    }

    /* renamed from: a */
    public final void m3461a(Context context) {
        if (context == null) {
            C0675a.m3475g("UserCtrlHelper", "handleUserCtrl failed,context is null");
            return;
        }
        HashMap<String, AbstractC0832h> hashMap = C0659b.f3058c;
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<String, AbstractC0832h> entry : hashMap.entrySet()) {
                AbstractC0832h value = entry.getValue();
                if (value != null) {
                    String m3458a = m3458a(context, entry.getKey(), value.mo3396f(entry.getKey()));
                    if (!TextUtils.isEmpty(m3458a)) {
                        short mo3397g = value.mo3397g(entry.getKey());
                        String key = entry.getKey();
                        C0675a.m3469c("UserCtrlHelper", "sendUserCtrlInfo sdkType:" + key + ",property:" + ((int) mo3397g) + ",verInfo:" + m3458a);
                        long m3450b = C0672o.m3450b();
                        C0816e c0816e = new C0816e(20480);
                        c0816e.m3974a((int) mo3397g);
                        c0816e.m3974a(1);
                        c0816e.m3977a(m3458a);
                        C0557c.m2894a(context, C0556b.f2704d, 26, 0, m3450b, 10000L, c0816e.m3982b());
                        this.f3123c.put(Long.valueOf(m3450b), key);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3462a(Context context, long j) {
        String str;
        Map<Long, String> map;
        String remove = this.f3123c.remove(Long.valueOf(j));
        if (TextUtils.isEmpty(remove)) {
            str = "userCtrlSuccess but not found rid:" + j;
        } else {
            C0675a.m3469c("UserCtrlHelper", "userCtrlSuccess rid:" + j + ",sdkType:" + remove);
            C0659b.m3371a();
            String m3372a = C0659b.m3372a(remove, "");
            if (!TextUtils.isEmpty(m3372a)) {
                C0617b<String> m3154a = C0617b.m3154a(remove);
                m3154a.m3188a((C0617b<String>) m3372a);
                C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3154a});
                map = this.f3123c;
                if (map == null && map.isEmpty() && !C0557c.m2923q(context)) {
                    C0666i.m3408a().m3426a(context, "tcp_a21", null);
                    return;
                }
                return;
            }
            str = "userCtrlSuccess but not found sdkversion by sdkType:" + remove;
        }
        C0675a.m3469c("UserCtrlHelper", str);
        map = this.f3123c;
        if (map == null) {
        }
    }

    /* renamed from: b */
    public final boolean m3463b(Context context) {
        if (context == null) {
            C0675a.m3476h("UserCtrlHelper", "get isNeedUserCtrl failed,context is null");
            return false;
        }
        HashMap<String, AbstractC0832h> hashMap = C0659b.f3058c;
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<String, AbstractC0832h> entry : hashMap.entrySet()) {
                AbstractC0832h value = entry.getValue();
                if (value != null && !TextUtils.isEmpty(m3458a(context, entry.getKey(), value.mo3396f(entry.getKey())))) {
                    return true;
                }
            }
        }
        return false;
    }
}
