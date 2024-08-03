package p031c.p032a.p094t;

import android.content.Context;
import android.os.Bundle;
import java.nio.ByteBuffer;
import p031c.p032a.p092s.AbstractC0827c;
import p031c.p032a.p092s.AbstractC0832h;
import p031c.p032a.p092s.C0830f;
import p031c.p032a.p092s.EnumC0837m;
import p031c.p032a.p092s.InterfaceC0826b;

/* renamed from: c.a.t.f */
/* loaded from: classes.dex */
public class C0843f extends AbstractC0832h {
    /* renamed from: h */
    private static InterfaceC0826b m4113h(String str) {
        C0838a.m4096a();
        return C0838a.m4095a(str);
    }

    /* renamed from: i */
    private static AbstractC0827c m4114i(String str) {
        C0838a.m4096a();
        return C0838a.m4098b(str);
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public Object mo4085a(Context context, String str, int i, String str2) {
        AbstractC0827c m4114i = m4114i(str);
        if (m4114i != null) {
            return m4114i.m4045a(context, i, str2);
        }
        return null;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public short mo3387a(String str) {
        if (str.equals(EnumC0837m.JPUSH.name())) {
            return (short) 1;
        }
        if (str.equals(EnumC0837m.JANALYTICS.name())) {
            return (short) 2;
        }
        if (str.equals(EnumC0837m.JSHARE.name())) {
            return (short) 4;
        }
        if (str.equals(EnumC0837m.JSSP.name())) {
            return (short) 5;
        }
        return str.equals(EnumC0837m.JVERIFICATION.name()) ? (short) 3 : (short) 0;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3388a(Context context, String str, int i, int i2, long j, long j2, ByteBuffer byteBuffer) {
        InterfaceC0826b m4113h = m4113h(str);
        if (m4113h != null) {
            C0841d.m4105b("SupportDispatchAction", "dispatchMessage ,command:" + i + ",ver:" + i2 + ",rid:" + j + ",reuqestId:" + j2);
            if (str.equals(EnumC0837m.JMESSAGE.name())) {
                m4113h.mo3654a(context, 0L, i, new C0840c(false, byteBuffer.limit() + 20, i2, i, j, C0830f.m4067d(), C0830f.m4069e()), byteBuffer);
            } else {
                m4113h.mo3654a(context, 0L, i, new C0840c(false, i2, i, j2), byteBuffer);
            }
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo4086a(Context context, String str, int i, int i2, String str2) {
        InterfaceC0826b m4113h = m4113h(str);
        if (m4113h != null) {
            m4113h.mo3656a(context, 0L, i);
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo4087a(Context context, String str, long j, int i) {
        InterfaceC0826b m4113h = m4113h(str);
        if (m4113h != null) {
            m4113h.mo3657a(context, 0L, j, i);
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3389a(Context context, String str, Object obj) {
        C0841d.m4105b("SupportDispatchAction", "handleMessage,sdkType:" + str);
        InterfaceC0826b m4113h = m4113h(str);
        if (m4113h != null) {
            m4113h.mo3659a(context, 0L, obj);
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3390a(Context context, String str, String str2, Bundle bundle) {
        InterfaceC0826b m4113h = m4113h(str);
        if (m4113h != null) {
            m4113h.mo3658a(context, 0L, bundle, (Object) null);
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public boolean mo4088a(String str, int i) {
        AbstractC0827c m4114i = m4114i(str);
        if (m4114i != null) {
            return m4114i.m4046a(i);
        }
        return true;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: b */
    public short mo3391b(String str) {
        if (str.equals(EnumC0837m.JPUSH.name())) {
            return (short) 1;
        }
        if (str.equals(EnumC0837m.JANALYTICS.name())) {
            return (short) 4;
        }
        if (str.equals(EnumC0837m.JSHARE.name())) {
            return (short) 8;
        }
        if (str.equals(EnumC0837m.JSSP.name())) {
            return (short) 128;
        }
        if (str.equals(EnumC0837m.JMESSAGE.name())) {
            return (short) 32;
        }
        return str.equals(EnumC0837m.JVERIFICATION.name()) ? (short) 256 : (short) 0;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: b */
    public boolean mo3392b(String str, int i) {
        InterfaceC0826b m4113h = m4113h(str);
        if (m4113h != null) {
            return m4113h.mo3660a(i);
        }
        return false;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: c */
    public short mo3393c(String str) {
        if (str.equals(EnumC0837m.JPUSH.name())) {
            return (short) 1;
        }
        if (str.equals(EnumC0837m.JANALYTICS.name())) {
            return (short) 4;
        }
        if (str.equals(EnumC0837m.JSHARE.name())) {
            return (short) 8;
        }
        if (str.equals(EnumC0837m.JSSP.name())) {
            return (short) 128;
        }
        if (str.equals(EnumC0837m.JMESSAGE.name())) {
            return (short) 32;
        }
        return str.equals(EnumC0837m.JVERIFICATION.name()) ? (short) 256 : (short) 0;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: d */
    public short mo3394d(String str) {
        if (str.equals(EnumC0837m.JPUSH.name())) {
            return (short) 0;
        }
        if (str.equals(EnumC0837m.JANALYTICS.name())) {
            return (short) 1;
        }
        if (str.equals(EnumC0837m.JSHARE.name())) {
            return (short) 2;
        }
        if (str.equals(EnumC0837m.JSSP.name())) {
            return (short) 4;
        }
        return str.equals(EnumC0837m.JVERIFICATION.name()) ? (short) 5 : (short) 3;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: e */
    public String mo3395e(String str) {
        if (str.equals(EnumC0837m.JPUSH.name())) {
            return "sdk_ver";
        }
        if (str.equals(EnumC0837m.JANALYTICS.name())) {
            return "statistics_sdk_ver";
        }
        if (str.equals(EnumC0837m.JSHARE.name())) {
            return "share_sdk_ver";
        }
        if (str.equals(EnumC0837m.JSSP.name())) {
            return "ssp_sdk_ver";
        }
        if (str.equals(EnumC0837m.JMESSAGE.name())) {
            return "im_sdk_ver";
        }
        if (str.equals(EnumC0837m.JVERIFICATION.name())) {
            return "verification_sdk_ver";
        }
        return null;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: f */
    public String mo3396f(String str) {
        InterfaceC0826b m4113h = m4113h(str);
        return m4113h != null ? m4113h.mo3655a() : "";
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: g */
    public short mo3397g(String str) {
        if (str.equals(EnumC0837m.JPUSH.name())) {
            return (short) 1;
        }
        if (str.equals(EnumC0837m.JMESSAGE.name())) {
            return (short) 2;
        }
        if (str.equals(EnumC0837m.JANALYTICS.name())) {
            return (short) 4;
        }
        if (str.equals(EnumC0837m.JSHARE.name())) {
            return (short) 5;
        }
        if (str.equals(EnumC0837m.JSSP.name())) {
            return (short) 9;
        }
        return str.equals(EnumC0837m.JVERIFICATION.name()) ? (short) 10 : (short) 6;
    }
}
