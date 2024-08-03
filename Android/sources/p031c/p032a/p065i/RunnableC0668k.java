package p031c.p032a.p065i;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p063g.C0621c;
import p031c.p032a.p063g.RunnableC0627i;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p068l.C0680b;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0818g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.i.k */
/* loaded from: classes.dex */
public final class RunnableC0668k implements Runnable {

    /* renamed from: a */
    private Context f3091a;

    /* renamed from: b */
    private String f3092b;

    /* renamed from: c */
    private Bundle f3093c;

    /* renamed from: d */
    final /* synthetic */ C0666i f3094d;

    public RunnableC0668k(C0666i c0666i, Context context, String str, Bundle bundle) {
        this.f3094d = c0666i;
        this.f3091a = context;
        this.f3092b = str;
        this.f3093c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC0627i runnableC0627i;
        C0666i c0666i;
        RunnableC0627i runnableC0627i2;
        long j;
        String str;
        RunnableC0627i runnableC0627i3;
        try {
            if (this.f3092b.equals("tcp_a1")) {
                runnableC0627i3 = this.f3094d.f3078c;
                if (runnableC0627i3 != null) {
                    return;
                } else {
                    c0666i = this.f3094d;
                }
            } else {
                if (!this.f3092b.equals("tcp_a3") && !this.f3092b.equals("tcp_a4") && !this.f3092b.equals("tcp_a20")) {
                    if (this.f3092b.equals("tcp_a5")) {
                        if (this.f3093c != null) {
                            byte[] byteArray = this.f3093c.getByteArray("body");
                            int i = this.f3093c.getInt("cmd", -1);
                            int i2 = this.f3093c.getInt("ver", -1);
                            long j2 = this.f3093c.getLong("rid", -1L);
                            String string = this.f3093c.getString("sdk_type");
                            long j3 = this.f3093c.getLong("timeout");
                            C0675a.m3469c("JCoreTCPManager", "send quest,cmd:" + i + ",ver:" + i2 + ",rid:" + j2 + ",body size:" + byteArray.length);
                            if (i >= 0 && i2 >= 0 && j2 >= 0 && !TextUtils.isEmpty(string)) {
                                C0672o.m3448a().m3455a(this.f3091a, j2, i, i2, byteArray, string, j3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.f3092b.equals("tcp_a19")) {
                        C0666i.m3417d(this.f3094d);
                        return;
                    }
                    if (this.f3092b.equals("tcp_a11")) {
                        C0675a.m3471d("JCoreTCPManager", "resgiter success:" + C0557c.m2913g(this.f3091a));
                        C0659b.m3371a().m3385a(this.f3091a, 0, 0, C0557c.m2913g(this.f3091a));
                        C0661d.m3386a(this.f3091a, "on_register", null);
                        return;
                    }
                    if (this.f3092b.equals("tcp_a10")) {
                        C0666i.m3418e(this.f3094d);
                        return;
                    }
                    if (this.f3092b.equals("tcp_a9")) {
                        C0666i.m3410a(this.f3094d, this.f3091a);
                        return;
                    }
                    if (this.f3092b.equals("tcp_a8")) {
                        C0666i.m3414b(this.f3094d, this.f3091a);
                        return;
                    }
                    if (this.f3092b.equals("tcp_a2")) {
                        C0664g.m3399a().m3404a(this.f3091a, false);
                        this.f3094d.m3427a(this.f3093c);
                        return;
                    }
                    if (this.f3092b.equals("tcp_a13")) {
                        C0675a.m3471d("JCoreTCPManager", "resgiter failed");
                        if (this.f3093c != null) {
                            int i3 = this.f3093c.getInt("resCode", 0);
                            this.f3094d.f3080e = i3;
                            Context context = this.f3091a;
                            String m3988a = C0818g.m3988a(i3);
                            C0675a.m3478j("ConnectingHelper", "Register Failed with server error - code:" + i3);
                            if (!TextUtils.isEmpty(m3988a)) {
                                C0675a.m3476h("ConnectingHelper", "Local error description: " + m3988a);
                            }
                            C0659b.m3371a().m3385a(context, 0, i3, m3988a);
                            String m2915i = C0557c.m2915i(context);
                            if (i3 != 11) {
                                if (i3 == 1012) {
                                    C0621c.m3197a(context);
                                    return;
                                }
                                if (i3 != 10001) {
                                    switch (i3) {
                                        case 1005:
                                            str = "包名: " + context.getPackageName() + " 与 AppKey:" + m2915i + "不匹配";
                                            break;
                                        case 1006:
                                            str = "包名: " + context.getPackageName() + " 不存在";
                                            break;
                                        case 1007:
                                            C0675a.m3473e("ConnectingHelper", "IMEI is duplicated reported by server. Give up now. ");
                                            return;
                                        case 1008:
                                            str = " AppKey:" + m2915i + " 是无效的AppKey,请确认与JIGUANG web端的AppKey一致";
                                            break;
                                        case 1009:
                                            str = " AppKey:" + m2915i + " 非android AppKey";
                                            break;
                                        default:
                                            C0675a.m3473e("ConnectingHelper", "Unhandled server response error code - " + i3);
                                            return;
                                    }
                                } else {
                                    str = " 未在manifest中配置AppKey";
                                }
                                C0812a.m3936a(context, str, -1);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.f3092b.equals("tcp_a12")) {
                        C0675a.m3471d("JCoreTCPManager", "login failed");
                        if (this.f3093c != null) {
                            C0666i.m3413b(this.f3094d, this.f3093c.getInt("resCode", 0));
                            return;
                        }
                        return;
                    }
                    if (!this.f3092b.equals("tcp_a14")) {
                        if (this.f3092b.equals("tcp_a15")) {
                            this.f3094d.m3429b(this.f3093c);
                            return;
                        }
                        if (this.f3092b.equals("tcp_a16")) {
                            this.f3094d.m3415c(this.f3093c);
                            return;
                        }
                        if (this.f3092b.equals("tcp_a17")) {
                            C0666i.m3421f(this.f3094d);
                            return;
                        }
                        if (this.f3092b.equals("tcp_a18")) {
                            C0666i.m3423g(this.f3094d);
                            return;
                        }
                        if (this.f3092b.equals("tcp_a6")) {
                            if (this.f3093c != null) {
                                long j4 = this.f3093c.getLong("rid", -1L);
                                if (j4 > 0) {
                                    C0672o.m3448a().m3453a(this.f3091a, j4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (this.f3092b.equals("tcp_a7")) {
                            if (this.f3093c != null) {
                                long j5 = this.f3093c.getLong("rid", -1L);
                                if (j5 > 0) {
                                    C0672o.m3448a().m3451a(j5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (this.f3092b.equals("tcp_a21")) {
                            this.f3094d.m3419e();
                            return;
                        } else {
                            if (this.f3092b.equals("tcp_a22")) {
                                this.f3094d.m3428b();
                                return;
                            }
                            return;
                        }
                    }
                    c0666i = this.f3094d;
                }
                runnableC0627i = this.f3094d.f3078c;
                if (runnableC0627i != null) {
                    runnableC0627i2 = this.f3094d.f3078c;
                    if (runnableC0627i2.m3228c() != null) {
                        byte[] byteArray2 = this.f3093c.getByteArray("body");
                        int i4 = this.f3093c.getInt("cmd", -1);
                        int i5 = this.f3093c.getInt("ver", -1);
                        long j6 = this.f3093c.getLong("rid", -1L);
                        String string2 = this.f3093c.getString("sdk_type");
                        C0675a.m3469c("JCoreTCPManager", "send data,cmd:" + i4 + ",ver:" + i5 + ",rid:" + j6 + ",body size:" + byteArray2.length);
                        if (i4 >= 0 && i5 >= 0 && j6 >= 0) {
                            if (this.f3092b.equals("tcp_a3")) {
                                C0672o.m3448a().m3454a(this.f3091a, j6, i4, i5, byteArray2, string2);
                                return;
                            }
                            if (this.f3092b.equals("tcp_a20")) {
                                long j7 = this.f3093c.getLong("uid", 0L);
                                if (j7 == 0) {
                                    C0675a.m3475g("JCoreTCPManager", "share response uid is 0");
                                    return;
                                }
                                j = j7;
                            } else {
                                j = 0;
                            }
                            C0666i.m3408a().m3430c().m3228c().mo3555a(C0680b.m3495a(this.f3091a, i4, i5, j6, byteArray2, j));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0675a.m3469c("JCoreTCPManager", "send data failed:tcp breaked,will restart");
                c0666i = this.f3094d;
            }
            c0666i.m3424h();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
