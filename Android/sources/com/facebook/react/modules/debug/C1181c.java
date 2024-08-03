package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C1163b;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.modules.debug.c */
/* loaded from: classes.dex */
public class C1181c extends C1163b.a {

    /* renamed from: b */
    private C1163b f4534b;

    /* renamed from: c */
    private final ReactContext f4535c;

    /* renamed from: d */
    private final UIManagerModule f4536d;

    /* renamed from: n */
    private TreeMap<Long, a> f4546n;

    /* renamed from: f */
    private boolean f4538f = false;

    /* renamed from: g */
    private long f4539g = -1;

    /* renamed from: h */
    private long f4540h = -1;

    /* renamed from: i */
    private int f4541i = 0;

    /* renamed from: j */
    private int f4542j = 0;

    /* renamed from: k */
    private int f4543k = 0;

    /* renamed from: l */
    private int f4544l = 0;

    /* renamed from: m */
    private boolean f4545m = false;

    /* renamed from: e */
    private final C1178a f4537e = new C1178a();

    /* renamed from: com.facebook.react.modules.debug.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f4547a;

        /* renamed from: b */
        public final int f4548b;

        /* renamed from: c */
        public final int f4549c;

        /* renamed from: d */
        public final int f4550d;

        /* renamed from: e */
        public final double f4551e;

        /* renamed from: f */
        public final double f4552f;

        /* renamed from: g */
        public final int f4553g;

        public a(int i, int i2, int i3, int i4, double d2, double d3, int i5) {
            this.f4547a = i;
            this.f4548b = i2;
            this.f4549c = i3;
            this.f4550d = i4;
            this.f4551e = d2;
            this.f4552f = d3;
            this.f4553g = i5;
        }
    }

    public C1181c(ReactContext reactContext) {
        this.f4535c = reactContext;
        this.f4536d = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
    }

    @Override // com.facebook.react.modules.core.C1163b.a
    /* renamed from: a */
    public void mo5272a(long j) {
        if (this.f4538f) {
            return;
        }
        if (this.f4539g == -1) {
            this.f4539g = j;
        }
        long j2 = this.f4540h;
        this.f4540h = j;
        if (this.f4537e.m5310a(j2, j)) {
            this.f4544l++;
        }
        this.f4541i++;
        int m5316b = m5316b();
        if ((m5316b - this.f4542j) - 1 >= 4) {
            this.f4543k++;
        }
        if (this.f4545m) {
            C2038a.m8318a(this.f4546n);
            this.f4546n.put(Long.valueOf(System.currentTimeMillis()), new a(m5320e(), m5321f(), m5316b, this.f4543k, m5318c(), m5319d(), m5322g()));
        }
        this.f4542j = m5316b;
        C1163b c1163b = this.f4534b;
        if (c1163b != null) {
            c1163b.m5282a(this);
        }
    }

    /* renamed from: b */
    public int m5316b() {
        double m5322g = m5322g();
        Double.isNaN(m5322g);
        return (int) ((m5322g / 16.9d) + 1.0d);
    }

    /* renamed from: b */
    public a m5317b(long j) {
        C2038a.m8319a(this.f4546n, "FPS was not recorded at each frame!");
        Map.Entry<Long, a> floorEntry = this.f4546n.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    /* renamed from: c */
    public double m5318c() {
        if (this.f4540h == this.f4539g) {
            return 0.0d;
        }
        double m5320e = m5320e();
        Double.isNaN(m5320e);
        double d2 = this.f4540h - this.f4539g;
        Double.isNaN(d2);
        return (m5320e * 1.0E9d) / d2;
    }

    /* renamed from: d */
    public double m5319d() {
        if (this.f4540h == this.f4539g) {
            return 0.0d;
        }
        double m5321f = m5321f();
        Double.isNaN(m5321f);
        double d2 = this.f4540h - this.f4539g;
        Double.isNaN(d2);
        return (m5321f * 1.0E9d) / d2;
    }

    /* renamed from: e */
    public int m5320e() {
        return this.f4541i - 1;
    }

    /* renamed from: f */
    public int m5321f() {
        return this.f4544l - 1;
    }

    /* renamed from: g */
    public int m5322g() {
        double d2 = this.f4540h;
        double d3 = this.f4539g;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return ((int) (d2 - d3)) / 1000000;
    }

    /* renamed from: h */
    public void m5323h() {
        this.f4538f = false;
        this.f4535c.getCatalystInstance().addBridgeIdleDebugListener(this.f4537e);
        this.f4536d.setViewHierarchyUpdateDebugListener(this.f4537e);
        UiThreadUtil.runOnUiThread(new RunnableC1180b(this, this));
    }

    /* renamed from: i */
    public void m5324i() {
        this.f4546n = new TreeMap<>();
        this.f4545m = true;
        m5323h();
    }

    /* renamed from: j */
    public void m5325j() {
        this.f4538f = true;
        this.f4535c.getCatalystInstance().removeBridgeIdleDebugListener(this.f4537e);
        this.f4536d.setViewHierarchyUpdateDebugListener(null);
    }
}
