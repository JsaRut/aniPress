package p031c.p032a.p065i;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p070n.RunnableC0686a;
import p031c.p032a.p091r.C0816e;
import p031c.p032a.p092s.AbstractC0832h;

/* renamed from: c.a.i.e */
/* loaded from: classes.dex */
public class C0662e extends AbstractC0832h {
    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public short mo3387a(String str) {
        return (short) 0;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3388a(Context context, String str, int i, int i2, long j, long j2, ByteBuffer byteBuffer) {
        try {
            if (i == 19) {
                C0666i.m3408a().m3426a(context, "tcp_a18", null);
                return;
            }
            if (i == 30 || i == 32) {
                RunnableC0686a.m3523a().m3535a(0, i);
                return;
            }
            if (i == 25) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("RESPONSE_BODY", byteBuffer.array());
                C0661d.m3386a(context, "cmd", bundle);
            } else {
                if (i != 26) {
                    return;
                }
                short s = byteBuffer.getShort();
                if (s == 0) {
                    C0674q.m3457a().m3462a(context, j2);
                } else {
                    C0674q.m3457a().m3460a(j2, s);
                }
            }
        } catch (Throwable th) {
            C0675a.m3475g("JCoreDispatchAction", "dispatchMessage failed:" + th.getMessage());
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3389a(Context context, String str, Object obj) {
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: a */
    public void mo3390a(Context context, String str, String str2, Bundle bundle) {
        if (bundle != null) {
            try {
            } catch (Throwable th) {
                C0675a.m3475g("JCoreDispatchAction", "onActionRun failed:" + th.getMessage());
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (str2.equals("asm")) {
                RunnableC0686a.m3523a().m3540a(context, bundle);
                return;
            }
            if (!str2.equals("asmr")) {
                if (!str2.equals("lbsenable")) {
                    if (str2.equals("lbsforenry")) {
                        try {
                            long j = bundle.getLong("forenry");
                            C0675a.m3469c("JCoreDispatchAction", "setLbsPermissionDialogShieldDelay=" + j);
                            C0617b[] c0617bArr = new C0617b[1];
                            C0617b<Long> m3175m = C0617b.m3175m();
                            m3175m.m3188a((C0617b<Long>) (j > 0 ? Long.valueOf(j) : null));
                            c0617bArr[0] = m3175m;
                            C0618c.m3193a(context, (C0617b<?>[]) c0617bArr);
                            return;
                        } catch (Throwable th2) {
                            C0675a.m3477i("JCoreDispatchAction", "onActionRun failed:" + th2);
                            return;
                        }
                    }
                    if (!str2.equals("notification_state")) {
                        if (str2.equals("old_cmd")) {
                            C0661d.m3386a(context, str2, bundle);
                            return;
                        }
                        return;
                    }
                }
                C0661d.m3386a(context, str2, bundle);
                return;
            }
            RunnableC0686a m3523a = RunnableC0686a.m3523a();
            try {
                String string = bundle.getString("data");
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    String optString = jSONObject.optString("mtmmi");
                    String optString2 = jSONObject.optString("ktmfp");
                    String optString3 = jSONObject.optString("ktma");
                    String optString4 = jSONObject.optString("ktmr");
                    String optString5 = jSONObject.optString("ktmu");
                    String optString6 = jSONObject.optString("asmrc", "0");
                    C0675a.m3469c("ShareProcessManager", "msg response,msgId:" + optString + ",fromPkg:" + optString2 + ",appKey:" + optString3 + ",rid:" + optString4 + ",uid:" + optString5 + ",responseCode:" + optString6);
                    if (optString6.equals("0") && !TextUtils.isEmpty(optString5) && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4)) {
                        C0675a.m3469c("ShareProcessManager", "response success,will send msg response to server");
                        long parseLong = Long.parseLong(optString);
                        C0816e c0816e = new C0816e(20480);
                        c0816e.m3979b(0);
                        c0816e.m3974a(0);
                        c0816e.m3981b(parseLong);
                        c0816e.m3977a(optString3);
                        C0557c.m2907b(context, C0556b.f2704d, 4, 2, C0672o.m3450b(), Long.parseLong(optString5), c0816e.m3982b());
                    } else if (optString6.equals("1") && !TextUtils.isEmpty(optString5)) {
                        m3523a.m3538a(context, Long.parseLong(optString5));
                    } else if (!optString6.equals("3") || TextUtils.isEmpty(optString5)) {
                        C0675a.m3469c("ShareProcessManager", "invalid msg response");
                    } else {
                        m3523a.m3538a(context, Long.parseLong(optString5));
                        RunnableC0686a.m3527a(context, optString2);
                    }
                }
                return;
            } catch (Throwable th3) {
                C0675a.m3475g("ShareProcessManager", "doMsgResponse failed:" + th3.getMessage());
                return;
            }
            C0675a.m3475g("JCoreDispatchAction", "onActionRun failed:" + th.getMessage());
        }
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: b */
    public short mo3391b(String str) {
        return (short) 0;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: b */
    public boolean mo3392b(String str, int i) {
        return i == 0 || i == 1 || i == 19 || i == 25 || i == 26 || i == 30 || i == 32;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: c */
    public short mo3393c(String str) {
        return (short) 0;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: d */
    public short mo3394d(String str) {
        return (short) 3;
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: e */
    public String mo3395e(String str) {
        return "core_sdk_ver";
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: f */
    public String mo3396f(String str) {
        return "2.1.2";
    }

    @Override // p031c.p032a.p092s.AbstractC0832h
    /* renamed from: g */
    public short mo3397g(String str) {
        return (short) 6;
    }
}
