package p031c.p032a.p072p.p073a.p074a;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0763e;
import p031c.p032a.p072p.p073a.p080f.p087g.C0767i;
import p031c.p032a.p092s.C0830f;
import p031c.p032a.p092s.EnumC0837m;

/* renamed from: c.a.p.a.a.o */
/* loaded from: classes.dex */
public final class C0705o extends AbstractC0692b {

    /* renamed from: a */
    private static C0705o f3221a;

    /* renamed from: b */
    private Context f3222b;

    /* renamed from: c */
    private AtomicBoolean f3223c = new AtomicBoolean(false);

    /* renamed from: d */
    private AtomicBoolean f3224d = new AtomicBoolean(true);

    /* renamed from: e */
    private HashMap<String, AbstractC0692b> f3225e = new HashMap<>();

    /* renamed from: f */
    private HandlerC0706p f3226f;

    private C0705o() {
        HandlerThread handlerThread = new HandlerThread("upload");
        handlerThread.start();
        this.f3226f = new HandlerC0706p(this, handlerThread.getLooper());
    }

    /* renamed from: a */
    private static void m3603a(AbstractC0692b abstractC0692b, JSONArray jSONArray) {
        if (abstractC0692b == null) {
            return;
        }
        try {
            Object mo3566a = abstractC0692b.mo3566a();
            if (C0763e.m3809a(mo3566a)) {
                return;
            }
            if (!(mo3566a instanceof JSONArray)) {
                jSONArray.put(mo3566a);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) mo3566a;
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray2.get(i);
                if (!C0763e.m3809a(jSONObject)) {
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Exception e2) {
            C0732b.m3723f("UploadManager", "unexcepted - e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m3604a(C0705o c0705o) {
        if (c0705o.f3222b == null) {
            C0732b.m3724g("UploadManager", "UploadManager context is null,please call init method");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (C0767i.m3820b(uptimeMillis)) {
            C0732b.m3718b("UploadManager", "upload data too busy, give up this time");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<AbstractC0692b> it = c0705o.f3225e.values().iterator();
        while (it.hasNext()) {
            m3603a(it.next(), jSONArray);
        }
        if (jSONArray.length() == 0) {
            C0732b.m3718b("UploadManager", "event and session data is empty, give up upload");
            C0767i.m3822d(uptimeMillis);
        } else {
            C0732b.m3718b("UploadManager", "upload data:" + jSONArray.toString());
            C0830f.m4061a(c0705o.f3222b, jSONArray, EnumC0837m.JANALYTICS.name());
        }
    }

    /* renamed from: b */
    public static C0705o m3605b() {
        if (f3221a == null) {
            f3221a = new C0705o();
        }
        return f3221a;
    }

    @Override // p031c.p032a.p072p.p073a.p074a.AbstractC0692b
    /* renamed from: a */
    public final Object mo3566a() {
        return null;
    }

    /* renamed from: a */
    public final void m3607a(Context context) {
        if (context == null) {
            C0732b.m3718b("UploadManager", "UploadManager init context is null");
        } else if (this.f3223c.get()) {
            C0732b.m3718b("UploadManager", "UploadManager has inited");
        } else {
            this.f3222b = context.getApplicationContext();
            this.f3223c.set(true);
        }
    }

    /* renamed from: a */
    public final void m3608a(AbstractC0692b abstractC0692b) {
        if (abstractC0692b == null || this.f3225e.get(abstractC0692b.getClass().getName()) != null) {
            return;
        }
        this.f3225e.put(abstractC0692b.getClass().getName(), abstractC0692b);
    }

    /* renamed from: c */
    public final void m3609c() {
        if (this.f3224d.get()) {
            this.f3224d.set(false);
            this.f3226f.obtainMessage(1).sendToTarget();
        }
    }

    /* renamed from: d */
    public final void m3610d() {
        this.f3226f.obtainMessage(1).sendToTarget();
    }

    /* renamed from: e */
    public final void m3611e() {
        if (this.f3226f.hasMessages(2)) {
            this.f3226f.removeMessages(2);
        }
    }

    /* renamed from: f */
    public final void m3612f() {
        if (this.f3226f.hasMessages(2)) {
            return;
        }
        this.f3226f.sendEmptyMessageDelayed(2, 2000L);
    }
}
