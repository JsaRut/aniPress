package p031c.p101b.p102a.p114l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p104b.C0884g;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p111i.C0911b;
import p031c.p101b.p102a.p115m.C0941d;

/* renamed from: c.b.a.l.j */
/* loaded from: classes.dex */
public class C0931j {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<Long> f3949a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static final Object f3950b = new Object();

    /* renamed from: c */
    private static C0931j f3951c;

    /* renamed from: d */
    private ConcurrentHashMap<Long, a> f3952d = new ConcurrentHashMap<>();

    /* renamed from: c.b.a.l.j$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public int f3953a;

        /* renamed from: b */
        public String f3954b;

        public a(int i, String str) {
            this.f3953a = i;
            this.f3954b = str;
        }

        public String toString() {
            return "MobileBean{sequence=" + this.f3953a + ", mobileNumber='" + this.f3954b + "'}";
        }
    }

    /* renamed from: a */
    private static int m4677a(long j) {
        if (f3949a.size() >= 3) {
            long longValue = j - f3949a.element().longValue();
            if (longValue < 0) {
                f3949a.clear();
                return 2;
            }
            if (longValue <= 10000) {
                return 1;
            }
            while (f3949a.size() >= 3) {
                f3949a.poll();
            }
        }
        f3949a.offer(Long.valueOf(j));
        return 0;
    }

    /* renamed from: a */
    public static synchronized C0931j m4678a() {
        C0931j c0931j;
        synchronized (C0931j.class) {
            if (f3951c == null) {
                synchronized (f3950b) {
                    if (f3951c == null) {
                        f3951c = new C0931j();
                    }
                }
            }
            c0931j = f3951c;
        }
        return c0931j;
    }

    /* renamed from: a */
    public C0884g m4679a(Context context, Intent intent) {
        C0884g c0884g = null;
        if (intent == null) {
            return null;
        }
        try {
            int intExtra = intent.getIntExtra("sequence", -1);
            int intExtra2 = intent.getIntExtra("code", -1);
            String stringExtra = intent.getStringExtra("mobile");
            C0884g c0884g2 = new C0884g();
            try {
                c0884g2.m4356b(intExtra);
                c0884g2.m4351a(intExtra2);
                c0884g2.m4360c(stringExtra);
                return c0884g2;
            } catch (Throwable th) {
                th = th;
                c0884g = c0884g2;
                C0923b.m4653i("MobileNumberHelper", "parese mobile number response to JPushMessage failed, error:" + th);
                return c0884g;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public void m4680a(Context context, int i, int i2, String str) {
        try {
            C0923b.m4642a("MobileNumberHelper", "Action - onResult,sequence:" + i + ",code:" + i2 + ",mobileNumber:" + str);
            String m4243b = C0869a.m4243b(context);
            Intent intent = new Intent();
            if (TextUtils.isEmpty(m4243b)) {
                C0923b.m4642a("MobileNumberHelper", "not found messageReceiver");
            } else {
                intent = new Intent(context, Class.forName(m4243b));
                intent.setAction("mobile_result");
                intent.putExtra("sequence", i);
                intent.putExtra("code", i2);
                intent.putExtra("mobile", str);
            }
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            C0923b.m4654j("MobileNumberHelper", "onResult error:" + th);
        }
    }

    /* renamed from: a */
    public void m4681a(Context context, int i, String str) {
        C0923b.m4644b("MobileNumberHelper", "action - setMobileNubmer, sequence:" + i + ",mobileNumber:" + str);
        Bundle bundle = new Bundle();
        bundle.putInt("sequence", i);
        bundle.putString("mobile", str);
        C0922a.m4637a(context, "JPUSH", "set_mobile", bundle);
    }

    /* renamed from: a */
    public void m4682a(Context context, long j, int i) {
        if (this.f3952d.size() != 0) {
            a remove = this.f3952d.remove(Long.valueOf(j));
            C0923b.m4642a("MobileNumberHelper", "mobileBean:" + remove);
            if (remove == null) {
                C0923b.m4642a("MobileNumberHelper", "#unexcepted, do not find mobile number request cache");
                return;
            }
            if (i == 0) {
                C0902c.m4448a(context, remove.f3954b);
            } else if (i == 11) {
                i = C0883f.a.f3744x;
            } else if (i == 10) {
                i = C0883f.a.f3743w;
            }
            m4680a(context, remove.f3953a, i, remove.f3954b);
        }
    }

    /* renamed from: a */
    public void m4683a(Context context, Bundle bundle) {
        if (bundle == null) {
            C0923b.m4654j("MobileNumberHelper", "[setMobileNum] bundle is bull");
            return;
        }
        int i = bundle.getInt("sequence", 0);
        String string = bundle.getString("mobile");
        String m4460d = C0902c.m4460d(context);
        C0923b.m4644b("MobileNumberHelper", "action:setMobileNum sequence:" + i + ",mobileNumber:" + string + ",lastMobileNumber:" + m4460d);
        if (m4460d != null && TextUtils.equals(string, m4460d)) {
            C0923b.m4644b("MobileNumberHelper", "already set this mobile number");
            m4680a(context, i, C0883f.a.f3721a, string);
            return;
        }
        if (C0902c.m4451b(context) == 1) {
            m4680a(context, i, C0883f.a.f3732l, string);
            return;
        }
        if (m4460d != null) {
            C0902c.m4448a(context, (String) null);
        }
        int m4677a = m4677a(System.currentTimeMillis());
        if (m4677a != 0) {
            C0923b.m4653i("MobileNumberHelper", m4677a == 1 ? "set mobile number too soon,over 3 times in 10s" : "set mobile number failed,time shaft error，please try again");
            m4680a(context, i, m4677a == 1 ? C0883f.a.f3731k : C0883f.a.f3733m, string);
            return;
        }
        int m4750c = C0941d.m4750c(string);
        if (m4750c == 0) {
            byte[] m4537a = C0911b.m4537a(string);
            long m4700a = C0936o.m4700a();
            this.f3952d.put(Long.valueOf(m4700a), new a(i, string));
            C0922a.m4633a(context, "JPUSH", 26, 1, m4700a, 0L, m4537a);
            return;
        }
        C0923b.m4644b("MobileNumberHelper", "Invalid mobile number: " + string + ", will not set mobile number this time.");
        m4680a(context, i, m4750c, string);
    }
}
