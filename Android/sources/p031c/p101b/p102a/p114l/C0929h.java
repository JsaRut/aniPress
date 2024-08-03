package p031c.p101b.p102a.p114l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import p031c.p032a.p092s.AbstractC0832h;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p105c.C0891c;
import p031c.p101b.p102a.p111i.C0912c;
import p031c.p101b.p102a.p113k.C0921c;

/* renamed from: c.b.a.l.h */
/* loaded from: classes.dex */
public class C0929h extends AbstractC0832h {
    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public Object mo4085a(Context context, String str, int i, String str2) {
        String str3;
        if (context == null) {
            str3 = "context was null";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                if ("platformtype".equals(str2)) {
                    if (i >= 16) {
                        return Byte.valueOf(C0921c.m4615a().m4627e(context));
                    }
                } else if ("platformregid".equals(str2)) {
                    return C0921c.m4615a().m4628f(context);
                }
                return super.mo4085a(context, str, i, str2);
            }
            str3 = " filed name was empty";
        }
        C0923b.m4646c("JPushDispacthAction", str3);
        return null;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public short mo3387a(String str) {
        return (short) 1;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3388a(Context context, String str, int i, int i2, long j, long j2, ByteBuffer byteBuffer) {
        C0923b.m4642a("JPushDispacthAction", "dispatchMessage command:" + i + ",ver:" + i2 + ",rid:" + j + ",requestid:" + j2);
        C0924c.m4655a().m4658a(context, "msg", new C0912c(i, j, j2, byteBuffer));
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo4086a(Context context, String str, int i, int i2, String str2) {
        try {
            if (i == -1 || i == 0 || i == 1) {
                C0869a.m4238a(context, i, i2, str2);
                if (i == 1) {
                    C0869a.m4240a(true);
                    C0921c.m4615a().m4629g(context);
                } else if (i == -1) {
                    C0869a.m4240a(false);
                }
            } else if (i != 19) {
            } else {
                C0891c.m4377a(context).m4387d(context);
            }
        } catch (Throwable th) {
            C0923b.m4653i("JPushDispacthAction", "onEvent failed:" + th.getMessage());
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo4087a(Context context, String str, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putLong("rid", j);
        bundle.putInt("cmd", i);
        C0924c.m4655a().m4658a(context, "msg_time_out", bundle);
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3389a(Context context, String str, Object obj) {
        if (obj instanceof Intent) {
            Intent intent = (Intent) obj;
            if ("intent.plugin.platform.REFRESSH_REGID".equals(intent.getAction())) {
                C0921c.m4615a().m4623a(context, intent.getExtras());
            }
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3390a(Context context, String str, String str2, Bundle bundle) {
        C0924c.m4655a().m4658a(context, str2, bundle);
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: b */
    public short mo3391b(String str) {
        return (short) 1;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: b */
    public boolean mo3392b(String str, int i) {
        return i == 3 || i == 29 || i == 28 || i == 27 || i == 10 || i == 26 || i == 25;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: c */
    public short mo3393c(String str) {
        return (short) 1;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: d */
    public short mo3394d(String str) {
        return (short) 0;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: e */
    public String mo3395e(String str) {
        return "sdk_ver";
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: f */
    public String mo3396f(String str) {
        return "3.3.4";
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: g */
    public short mo3397g(String str) {
        return (short) 1;
    }
}
