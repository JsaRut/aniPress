package p031c.p101b.p102a.p113k;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jpush.android.service.PushReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p104b.AbstractC0885h;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p107e.C0900a;
import p031c.p101b.p102a.p107e.C0901b;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.k.c */
/* loaded from: classes.dex */
public class C0921c {

    /* renamed from: b */
    private static C0921c f3929b;

    /* renamed from: d */
    private List<AbstractC0885h> f3931d = new ArrayList();

    /* renamed from: e */
    private boolean f3932e;

    /* renamed from: a */
    private static Map<String, Byte> f3928a = new HashMap();

    /* renamed from: c */
    private static final Object f3930c = new Object();

    static {
        f3928a.put("cn.jpush.android.thirdpush.meizu.MeizuPushManager", (byte) 3);
        f3928a.put("cn.jpush.android.thirdpush.xiaomi.XMPushManager", (byte) 1);
        f3928a.put("cn.jpush.android.thirdpush.huawei.HWPushManager", (byte) 2);
        f3928a.put("cn.jpush.android.thirdpush.fcm.FCMPushManager", (byte) 8);
        f3928a.put("cn.jpush.android.thridpush.oppo.OPushManager", (byte) 4);
        f3928a.put("cn.jpush.android.thirdpush.vivo.VivoPushManager", (byte) 5);
    }

    private C0921c() {
    }

    /* renamed from: a */
    public static C0921c m4615a() {
        if (f3929b == null) {
            synchronized (f3930c) {
                if (f3929b == null) {
                    f3929b = new C0921c();
                }
            }
        }
        return f3929b;
    }

    /* renamed from: a */
    private void m4616a(Context context, AbstractC0885h abstractC0885h) {
        if (abstractC0885h == null || !abstractC0885h.m4370d(context)) {
            return;
        }
        byte m4366a = abstractC0885h.m4366a(context);
        C0900a<Boolean> m4435b = C0900a.m4435b(m4366a);
        m4435b.m4436a((C0900a<Boolean>) false);
        C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4435b});
        C0900a<String> m4433a = C0900a.m4433a(m4366a);
        m4433a.m4436a((C0900a<String>) null);
        C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4433a});
    }

    /* renamed from: a */
    private boolean m4617a(Context context, int i, String str) {
        String str2;
        byte b2 = (byte) i;
        if (!((Boolean) C0901b.m4438a(context, C0900a.m4435b(b2))).booleanValue()) {
            str2 = "need upload -- last upload failed or never upload success";
        } else {
            if (TextUtils.equals((String) C0901b.m4438a(context, C0900a.m4433a(b2)), str)) {
                C0923b.m4650f("ThirdPushManager", "need not upload regId");
                return false;
            }
            str2 = "need upload -- regId changed";
        }
        C0923b.m4650f("ThirdPushManager", str2);
        return true;
    }

    /* renamed from: b */
    private void m4618b(Context context, byte b2, String str) {
        C0923b.m4642a("ThirdPushManager", "sendUpdateRegIDRequest, WhichPlatform:" + ((int) b2) + ",regID:" + str);
        C0900a<Boolean> m4435b = C0900a.m4435b(b2);
        m4435b.m4436a((C0900a<Boolean>) false);
        C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4435b});
        C0900a<String> m4433a = C0900a.m4433a(b2);
        m4433a.m4436a((C0900a<String>) str);
        C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4433a});
        Bundle bundle = new Bundle();
        bundle.putString("token", str);
        bundle.putByte("platform", b2);
        C0922a.m4637a(context, "JPUSH", "third_push_upload_regid", bundle);
    }

    /* renamed from: b */
    private void m4619b(Context context, AbstractC0885h abstractC0885h) {
        C0923b.m4642a("ThirdPushManager", "sendBroadCastToUploadToken");
        String m4368b = abstractC0885h.m4368b(context);
        if (!TextUtils.isEmpty(m4368b)) {
            m4622a(context, abstractC0885h.m4366a(context), m4368b);
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) PushReceiver.class);
            intent.setAction("intent.plugin.platform.REFRESSH_REGID");
            Bundle bundle = new Bundle();
            bundle.putString("sdktype", "JPUSH");
            bundle.putByte("platform", abstractC0885h.m4366a(context));
            intent.putExtras(bundle);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            C0923b.m4654j("ThirdPushManager", "send ACTION_PLUGIN_PALTFORM_REFRESSH_REGID failed:" + th);
        }
    }

    /* renamed from: h */
    private void m4620h(Context context) {
        boolean z;
        boolean contains;
        boolean m4076a;
        RuntimeException runtimeException;
        Object newInstance;
        Iterator<Map.Entry<String, Byte>> it = f3928a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Byte> next = it.next();
            try {
                Class<?> loadClass = context.getClassLoader().loadClass(next.getKey());
                if (loadClass != null && (newInstance = loadClass.newInstance()) != null && (newInstance instanceof AbstractC0885h)) {
                    ((AbstractC0885h) newInstance).m4369c(context);
                    if (((AbstractC0885h) newInstance).m4371e(context)) {
                        this.f3931d.add((AbstractC0885h) newInstance);
                    } else {
                        Byte value = next.getValue();
                        C0900a<String> m4433a = C0900a.m4433a(value.byteValue());
                        m4433a.m4436a((C0900a<String>) null);
                        C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4433a});
                        C0900a<Boolean> m4435b = C0900a.m4435b(value.byteValue());
                        m4435b.m4436a((C0900a<Boolean>) false);
                        C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4435b});
                    }
                }
            } finally {
                if (z) {
                    if (contains) {
                        if (m4076a) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m4621a(Context context) {
        if (this.f3932e) {
            return;
        }
        if (context == null) {
            return;
        }
        m4620h(context);
        this.f3932e = true;
    }

    /* renamed from: a */
    public void m4622a(Context context, byte b2, String str) {
        if (context == null) {
            context = C0869a.f3646a;
        }
        if (context == null) {
            C0923b.m4646c("ThirdPushManager", "context was null");
            return;
        }
        C0923b.m4650f("ThirdPushManager", "uploadRegID regid:" + str);
        m4621a(context);
        for (AbstractC0885h abstractC0885h : this.f3931d) {
            if (abstractC0885h.m4366a(context) == b2) {
                m4616a(context, abstractC0885h);
                if (m4617a(context, (int) b2, str)) {
                    m4618b(context, b2, str);
                }
            }
        }
    }

    /* renamed from: a */
    public void m4623a(Context context, Bundle bundle) {
        m4621a(context);
        byte byteValue = bundle.getByte("platform", (byte) -1).byteValue();
        if (byteValue <= 0) {
            C0923b.m4653i("ThirdPushManager", "refreshToken romtype is <= 0");
            return;
        }
        for (AbstractC0885h abstractC0885h : this.f3931d) {
            if (abstractC0885h.m4366a(context) == byteValue) {
                m4622a(context, byteValue, abstractC0885h.m4368b(context));
            }
        }
    }

    /* renamed from: b */
    public void m4624b(Context context) {
        m4621a(context);
        if (C0883f.m4342g(context.getApplicationContext())) {
            C0923b.m4642a("ThirdPushManager", "push has close");
            return;
        }
        Iterator<AbstractC0885h> it = this.f3931d.iterator();
        while (it.hasNext()) {
            try {
                it.next().m4372f(context);
            } catch (Throwable th) {
                C0923b.m4647c("ThirdPushManager", "Third push register failed#", th);
            }
        }
    }

    /* renamed from: c */
    public void m4625c(Context context) {
        m4621a(context);
        Iterator<AbstractC0885h> it = this.f3931d.iterator();
        while (it.hasNext()) {
            it.next().m4373g(context);
        }
    }

    /* renamed from: d */
    public void m4626d(Context context) {
        m4621a(context);
        Iterator<AbstractC0885h> it = this.f3931d.iterator();
        while (it.hasNext()) {
            it.next().m4374h(context);
        }
    }

    /* renamed from: e */
    public byte m4627e(Context context) {
        int i;
        m4621a(context);
        byte b2 = 0;
        for (AbstractC0885h abstractC0885h : this.f3931d) {
            byte m4366a = abstractC0885h.m4366a(context);
            b2 = (byte) (b2 | m4366a);
            byte b3 = m4366a;
            String str = (String) C0901b.m4438a(context, C0900a.m4433a(b3));
            boolean booleanValue = ((Boolean) C0901b.m4438a(context, C0900a.m4435b(b3))).booleanValue();
            if (abstractC0885h.m4366a(context) == 8) {
                b2 = (byte) (b2 | 8);
                if (booleanValue && !TextUtils.isEmpty(str)) {
                    i = b2 | 32;
                    b2 = (byte) i;
                }
            } else {
                if (abstractC0885h.m4366a(context) == 2) {
                    b2 = (byte) (b2 | 64);
                }
                if (!booleanValue || TextUtils.isEmpty(str)) {
                    i = b2 | 128;
                    b2 = (byte) i;
                }
            }
        }
        C0923b.m4642a("ThirdPushManager", "getRomType,romType:" + ((int) b2));
        return b2;
    }

    /* renamed from: f */
    public String m4628f(Context context) {
        for (AbstractC0885h abstractC0885h : this.f3931d) {
            if (abstractC0885h.m4366a(context) != 8) {
                return (String) C0901b.m4438a(context, C0900a.m4433a(abstractC0885h.m4366a(context)));
            }
        }
        return null;
    }

    /* renamed from: g */
    public void m4629g(Context context) {
        if (context == null) {
            context = C0869a.f3646a;
        }
        if (context == null) {
            C0923b.m4646c("ThirdPushManager", "context was null");
            return;
        }
        m4621a(context);
        C0923b.m4650f("ThirdPushManager", "uploadRegIdAfterLogin");
        for (AbstractC0885h abstractC0885h : this.f3931d) {
            if (abstractC0885h.m4367a()) {
                m4619b(context, abstractC0885h);
            } else {
                m4616a(context, abstractC0885h);
                if (abstractC0885h.m4366a(context) == 2) {
                    abstractC0885h.m4368b(context);
                } else {
                    String m4368b = abstractC0885h.m4368b(context);
                    if (m4617a(context, (int) abstractC0885h.m4366a(context), m4368b)) {
                        m4618b(context, abstractC0885h.m4366a(context), m4368b);
                    }
                }
            }
        }
    }
}
