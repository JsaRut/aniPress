package p031c.p032a.p041I;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.I.c */
/* loaded from: classes.dex */
public class C0532c extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0532c f2640a;

    /* renamed from: b */
    private Context f2641b;

    /* renamed from: c */
    private JSONObject f2642c;

    /* renamed from: d */
    public static C0532c m2771d() {
        if (f2640a == null) {
            synchronized (C0532c.class) {
                f2640a = new C0532c();
            }
        }
        return f2640a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            if (intExtra3 == 1) {
                intExtra3 = 0;
            } else if (intExtra3 == 2) {
                intExtra3 = 2;
            } else if (intExtra3 == 3 || intExtra3 == 4) {
                intExtra3 = 1;
            } else if (intExtra3 == 5) {
                intExtra3 = 3;
            }
            int intExtra4 = registerReceiver.getIntExtra("voltage", -1);
            int intExtra5 = registerReceiver.getIntExtra("temperature", -1);
            if (this.f2642c == null) {
                this.f2642c = new JSONObject();
            }
            this.f2642c.put("level", intExtra);
            this.f2642c.put("scale", intExtra2);
            this.f2642c.put("status", intExtra3);
            this.f2642c.put("voltage", intExtra4);
            this.f2642c.put("temperature", intExtra5);
            C0675a.m3469c("JDeviceBattery", "collect success:" + this.f2642c);
        } catch (JSONException e2) {
            C0675a.m3475g("JDeviceBattery", "packageJson exception: " + e2.getMessage());
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2641b = context;
        return "JDeviceBattery";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        JSONObject jSONObject = this.f2642c;
        if (jSONObject == null) {
            C0675a.m3475g("JDeviceBattery", "there are no data to report");
            return;
        }
        C0513h.m2719a(context, jSONObject, "battery");
        C0513h.m2720a(context, (Object) this.f2642c);
        super.mo2683d(context, str);
        this.f2642c = null;
    }
}
