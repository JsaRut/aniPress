package p031c.p101b.p102a.p113k;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p107e.C0900a;
import p031c.p101b.p102a.p107e.C0901b;
import p031c.p101b.p102a.p111i.C0911b;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0936o;

/* renamed from: c.b.a.k.a */
/* loaded from: classes.dex */
public class C0919a {

    /* renamed from: a */
    private static volatile C0919a f3920a;

    /* renamed from: b */
    private Map<Byte, a> f3921b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.b.a.k.a$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public byte f3922a;

        /* renamed from: b */
        public String f3923b;

        /* renamed from: c */
        public long f3924c;

        /* renamed from: d */
        public byte[] f3925d;

        /* renamed from: e */
        public int f3926e = 0;

        public a(byte b2, String str, long j, byte[] bArr) {
            this.f3922a = b2;
            this.f3923b = str;
            this.f3924c = j;
            this.f3925d = bArr;
        }

        public String toString() {
            return "PluginPlatformRegIDBean{pluginPlatformType=" + ((int) this.f3922a) + ", regid='" + this.f3923b + "', rid=" + this.f3924c + ", retryCount=" + this.f3926e + '}';
        }
    }

    private C0919a() {
    }

    /* renamed from: a */
    private a m4606a(long j) {
        for (Map.Entry<Byte, a> entry : this.f3921b.entrySet()) {
            if (entry.getValue().f3924c == j) {
                return entry.getValue();
            }
        }
        C0923b.m4642a("PluginPlatformRidUpdate", "can not find uploadBean by rid");
        return null;
    }

    /* renamed from: a */
    public static C0919a m4607a() {
        if (f3920a == null) {
            synchronized (C0919a.class) {
                if (f3920a == null) {
                    f3920a = new C0919a();
                }
            }
        }
        return f3920a;
    }

    /* renamed from: a */
    private synchronized void m4608a(Context context, a aVar) {
        C0922a.m4633a(context, "JPUSH", 27, 1, aVar.f3924c, 10000L, aVar.f3925d);
    }

    /* renamed from: a */
    public void m4609a(Context context, byte b2, String str) {
        long m4700a = C0936o.m4700a();
        C0923b.m4651g("PluginPlatformRidUpdate", "sendUpdateRidInfo regid:" + str + ",rid:" + m4700a + ",whichPlatform:" + ((int) b2));
        a aVar = new a(b2, str, m4700a, C0911b.m4538a(str, b2));
        this.f3921b.put(Byte.valueOf(b2), aVar);
        m4608a(context, aVar);
    }

    /* renamed from: a */
    public void m4610a(Context context, long j) {
        a m4606a = m4606a(j);
        C0923b.m4650f("PluginPlatformRidUpdate", "onUpdateRidSuccess rid:" + j + " ,pluginPlatformRegIDBean:" + m4606a);
        if (m4606a != null) {
            C0900a<String> m4433a = C0900a.m4433a(m4606a.f3922a);
            m4433a.m4436a((C0900a<String>) m4606a.f3923b);
            C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4433a});
            C0900a<Boolean> m4435b = C0900a.m4435b(m4606a.f3922a);
            m4435b.m4436a((C0900a<Boolean>) true);
            C0901b.m4440a(context, (C0900a<?>[]) new C0900a[]{m4435b});
            this.f3921b.remove(Byte.valueOf(m4606a.f3922a));
        }
    }

    /* renamed from: a */
    public void m4611a(Context context, long j, int i) {
        a m4606a = m4606a(j);
        C0923b.m4650f("PluginPlatformRidUpdate", "onUpdateRidFailed rid:" + j + ",errorCode:" + i + " ,pluginPlatformRegIDBean:" + m4606a);
        if (m4606a != null) {
            int i2 = m4606a.f3926e;
            if (i2 < 3) {
                m4606a.f3926e = i2 + 1;
                m4608a(context, m4606a);
            } else {
                C0923b.m4642a("PluginPlatformRidUpdate", "updateRegId failed");
                this.f3921b.remove(Byte.valueOf(m4606a.f3922a));
            }
        }
    }

    /* renamed from: a */
    public synchronized void m4612a(Context context, Bundle bundle) {
        byte byteValue = bundle.getByte("platform", (byte) 0).byteValue();
        if (byteValue == 0) {
            C0923b.m4653i("PluginPlatformRidUpdate", "unknown plugin platform type");
        } else {
            if (!C0869a.m4244b()) {
                C0923b.m4642a("PluginPlatformRidUpdate", "tcp disconnected");
                return;
            }
            String string = bundle.getString("token");
            if (this.f3921b.containsKey(Byte.valueOf(byteValue)) && TextUtils.equals(this.f3921b.get(Byte.valueOf(byteValue)).f3923b, string)) {
                C0923b.m4642a("PluginPlatformRidUpdate", "same regid request, drop it");
                return;
            }
            m4609a(context, byteValue, string);
        }
    }

    /* renamed from: b */
    public void m4613b(Context context, long j) {
        a m4606a = m4606a(j);
        C0923b.m4650f("PluginPlatformRidUpdate", "onUpdateRidTimeout rid:" + j + " ,pluginPlatformRegIDBean:" + m4606a);
        if (m4606a != null) {
            int i = m4606a.f3926e;
            if (i < 3) {
                m4606a.f3926e = i + 1;
                m4608a(context, m4606a);
            } else {
                C0923b.m4642a("PluginPlatformRidUpdate", "updateRegId failed by timeout");
                this.f3921b.remove(Byte.valueOf(m4606a.f3922a));
            }
        }
    }
}
