package p031c.p101b.p102a.p103a;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p031c.p032a.p092s.C0831g;
import p031c.p101b.p102a.p106d.C0897b;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p107e.C0900a;
import p031c.p101b.p102a.p107e.C0901b;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p115m.C0940c;

/* renamed from: c.b.a.a.g */
/* loaded from: classes.dex */
public abstract class AbstractC0876g {

    /* renamed from: a */
    protected Context f3688a;

    /* renamed from: b */
    protected LinkedHashMap<String, C0874e> f3689b;

    /* renamed from: c */
    protected int f3690c;

    public AbstractC0876g(Context context) {
        this.f3690c = 100;
        this.f3688a = context.getApplicationContext();
        this.f3690c = C0902c.m4459d(context, 10);
        m4280a(context);
        m4282b(this.f3690c);
    }

    /* renamed from: a */
    private static C0874e m4279a(C0899d c0899d) {
        C0874e c0874e = new C0874e();
        c0874e.f3667a = c0899d.f3830X;
        c0874e.f3668b = c0899d.f3831Y;
        c0874e.f3669c = c0899d.f3832Z;
        c0874e.f3670d = c0899d.f3834aa;
        c0874e.f3671e = c0899d.f3836ba;
        c0874e.f3672f = c0899d.f3838ca;
        c0874e.f3673g = c0899d.f3840da;
        c0874e.f3674h = c0899d.f3842ea;
        return c0874e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m4280a(Context context) {
        LinkedHashMap linkedHashMap;
        try {
            File m4732a = C0940c.m4732a(context, "jpush_geofence_v4");
            if (m4732a == null || !m4732a.exists()) {
                int intValue = ((Integer) C0901b.m4438a(context, C0900a.m4432a())).intValue();
                if (intValue >= 318 && intValue <= 330 && (linkedHashMap = (LinkedHashMap) C0940c.m4733a(C0940c.m4732a(context, "jpush_geofence_v3"))) != null && !linkedHashMap.isEmpty()) {
                    C0923b.m4642a("GeofenceAction", "old geofences:" + linkedHashMap);
                    LinkedHashMap<String, C0874e> linkedHashMap2 = new LinkedHashMap<>();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), m4279a((C0899d) entry.getValue()));
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        this.f3689b = linkedHashMap2;
                        m4289c();
                    }
                }
            } else {
                this.f3689b = (LinkedHashMap) C0940c.m4733a(m4732a);
            }
        } catch (Throwable th) {
            C0923b.m4644b("GeofenceAction", "recover geofence failed:" + th);
        }
        if (this.f3689b == null) {
            this.f3689b = new LinkedHashMap<>();
        }
        m4283d();
        C0923b.m4644b("GeofenceAction", "Recover geofence size:" + this.f3689b.size());
    }

    /* renamed from: a */
    private void m4281a(Context context, C0874e c0874e) {
        try {
            C0923b.m4642a("GeofenceAction", "geofence report id=" + c0874e.f3667a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("geofence_id", c0874e.f3667a);
            if (C0831g.m4072a(null, null, 26, null, null, jSONObject, "geo_fence") instanceof JSONObject) {
                C0831g.m4072a(context, "JPUSH", 15, null, null, jSONObject, new C0875f(this));
            }
        } catch (Throwable th) {
            C0923b.m4653i("GeofenceAction", "report geofence error:" + th);
        }
    }

    /* renamed from: b */
    private void m4282b(int i) {
        int size = this.f3689b.size();
        if (size > i) {
            C0923b.m4644b("GeofenceAction", "Geofence count= " + size + ",limit=" + i + ",need remove earliest");
            Iterator<C0874e> it = this.f3689b.values().iterator();
            while (it.hasNext() && size > i) {
                C0874e next = it.next();
                if (next != null) {
                    mo4275b(next);
                }
                it.remove();
                size--;
            }
        }
    }

    /* renamed from: d */
    private void m4283d() {
        Iterator<Map.Entry<String, C0874e>> it = this.f3689b.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            C0874e value = it.next().getValue();
            if (value != null && value.f3671e * 1000 <= System.currentTimeMillis()) {
                z = true;
                C0923b.m4644b("GeofenceAction", "Geofence " + value.f3667a + " is out of date!");
                it.remove();
                mo4275b(value);
            }
        }
        if (z) {
            m4289c();
        }
    }

    /* renamed from: e */
    private void m4284e() {
        m4289c();
        if (this.f3689b.size() == 0) {
            mo4270a();
        } else {
            mo4274b();
        }
    }

    /* renamed from: e */
    private boolean m4285e(C0874e c0874e) {
        if (c0874e != null && !TextUtils.isEmpty(c0874e.f3667a) && c0874e.f3668b != -1) {
            double d2 = c0874e.f3673g;
            if (d2 >= -90.0d && d2 <= 90.0d) {
                double d3 = c0874e.f3672f;
                if (d3 >= -180.0d && d3 <= 180.0d) {
                    return true;
                }
            }
        }
        C0923b.m4654j("GeofenceAction", "The geofence is invalid, won't operate!");
        return false;
    }

    /* renamed from: a */
    protected abstract void mo4270a();

    /* renamed from: a */
    public void m4286a(int i) {
        C0902c.m4456c(this.f3688a, i);
        this.f3690c = i;
        m4282b(this.f3690c);
    }

    /* renamed from: a */
    public abstract void mo4271a(long j);

    /* renamed from: a */
    protected abstract void mo4272a(C0874e c0874e);

    /* renamed from: a */
    protected abstract void mo4273a(C0874e c0874e, C0874e c0874e2);

    /* renamed from: a */
    public void m4287a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0874e remove = this.f3689b.remove(str);
        if (remove != null) {
            mo4275b(remove);
            m4284e();
            return;
        }
        C0923b.m4642a("GeofenceAction", "geofence=" + str + " already not exists");
    }

    /* renamed from: a */
    public void m4288a(String str, JSONObject jSONObject) {
        String str2;
        if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        C0923b.m4644b("GeofenceAction", "Current geofence size:" + this.f3689b.size());
        C0874e c0874e = this.f3689b.get(str);
        if (c0874e != null) {
            if (jSONObject.has("type")) {
                str2 = c0874e.f3675i != jSONObject.optInt("type", 1) ? "can not update geofence because type can't change" : "can not update geofence because origin one not found";
            }
            c0874e.m4278b(jSONObject);
            if (c0874e.f3671e * 1000 <= System.currentTimeMillis()) {
                this.f3689b.remove(str);
                mo4275b(c0874e);
            } else {
                mo4273a(c0874e, c0874e);
            }
            m4284e();
            return;
        }
        C0923b.m4654j("GeofenceAction", str2);
    }

    /* renamed from: b */
    public abstract void mo4274b();

    /* renamed from: b */
    protected abstract void mo4275b(C0874e c0874e);

    /* renamed from: c */
    public void m4289c() {
        C0923b.m4644b("GeofenceAction", "save geofence to file");
        C0940c.m4735a(C0940c.m4732a(this.f3688a, "jpush_geofence_v4"), this.f3689b);
    }

    /* renamed from: c */
    public void m4290c(C0874e c0874e) {
        C0923b.m4644b("GeofenceAction", "Current geofence size:" + this.f3689b.size());
        if (m4285e(c0874e)) {
            C0874e c0874e2 = this.f3689b.get(c0874e.f3667a);
            if (c0874e2 != null) {
                if (c0874e.f3671e * 1000 <= System.currentTimeMillis()) {
                    this.f3689b.remove(c0874e.f3667a);
                    mo4275b(c0874e2);
                } else {
                    c0874e.m4277a(c0874e2);
                    this.f3689b.put(c0874e.f3667a, c0874e);
                    mo4273a(c0874e2, c0874e);
                }
            } else {
                if (c0874e.f3671e * 1000 <= System.currentTimeMillis()) {
                    C0923b.m4644b("GeofenceAction", "The geofence " + c0874e.f3667a + " is out of date, will not create!");
                    return;
                }
                m4282b(this.f3690c - 1);
                this.f3689b.put(c0874e.f3667a, c0874e);
                mo4272a(c0874e);
            }
            m4284e();
        }
    }

    /* renamed from: d */
    public void m4291d(C0874e c0874e) {
        if (c0874e != null) {
            try {
                if (c0874e.f3675i == 2) {
                    m4281a(this.f3688a, c0874e);
                } else if (c0874e.f3686t != null) {
                    C0897b.m4419a(this.f3688a, c0874e.f3686t);
                } else {
                    C0923b.m4653i("GeofenceAction", "there is no push entity, won't show notification");
                }
            } catch (Throwable th) {
                C0923b.m4654j("GeofenceAction", "process geofence error:" + th);
            }
        }
    }
}
