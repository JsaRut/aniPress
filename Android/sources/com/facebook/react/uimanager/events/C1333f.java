package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1104f;
import com.facebook.react.modules.core.C1163b;
import com.facebook.react.modules.core.C1170i;
import com.facebook.systrace.C1550a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.uimanager.events.f */
/* loaded from: classes.dex */
public class C1333f implements LifecycleEventListener {

    /* renamed from: a */
    private static final Comparator<AbstractC1330c> f4871a = new C1331d();

    /* renamed from: d */
    private final ReactApplicationContext f4874d;

    /* renamed from: o */
    private volatile ReactEventEmitter f4885o;

    /* renamed from: b */
    private final Object f4872b = new Object();

    /* renamed from: c */
    private final Object f4873c = new Object();

    /* renamed from: e */
    private final LongSparseArray<Integer> f4875e = new LongSparseArray<>();

    /* renamed from: f */
    private final Map<String, Short> f4876f = C1104f.m5182b();

    /* renamed from: g */
    private final a f4877g = new a(this, null);

    /* renamed from: h */
    private final ArrayList<AbstractC1330c> f4878h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<InterfaceC1335h> f4879i = new ArrayList<>();

    /* renamed from: j */
    private final List<InterfaceC1328a> f4880j = new ArrayList();

    /* renamed from: k */
    private final b f4881k = new b(this, null);

    /* renamed from: l */
    private final AtomicInteger f4882l = new AtomicInteger();

    /* renamed from: m */
    private AbstractC1330c[] f4883m = new AbstractC1330c[16];

    /* renamed from: n */
    private int f4884n = 0;

    /* renamed from: p */
    private short f4886p = 0;

    /* renamed from: q */
    private volatile boolean f4887q = false;

    /* renamed from: com.facebook.react.uimanager.events.f$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(C1333f c1333f, C1331d c1331d) {
            this();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public void run() {
            C1550a.m6454a(0L, "DispatchEventsRunnable");
            try {
                C1550a.m6459b(0L, "ScheduleDispatchFrameCallback", C1333f.this.f4882l.getAndIncrement());
                C1333f.this.f4887q = false;
                C2038a.m8318a(C1333f.this.f4885o);
                synchronized (C1333f.this.f4873c) {
                    if (C1333f.this.f4884n > 0) {
                        if (C1333f.this.f4884n > 1) {
                            Arrays.sort(C1333f.this.f4883m, 0, C1333f.this.f4884n, C1333f.f4871a);
                        }
                        for (int i = 0; i < C1333f.this.f4884n; i++) {
                            AbstractC1330c abstractC1330c = C1333f.this.f4883m[i];
                            if (abstractC1330c != null) {
                                C1550a.m6459b(0L, abstractC1330c.mo5715d(), abstractC1330c.m5722f());
                                abstractC1330c.mo5714a(C1333f.this.f4885o);
                                abstractC1330c.m5719b();
                            }
                        }
                        C1333f.this.m5735d();
                        C1333f.this.f4875e.clear();
                    }
                }
                Iterator it = C1333f.this.f4880j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1328a) it.next()).mo5241a();
                }
            } finally {
                C1550a.m6453a(0L);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.events.f$b */
    /* loaded from: classes.dex */
    public class b extends C1163b.a {

        /* renamed from: b */
        private volatile boolean f4889b;

        /* renamed from: c */
        private boolean f4890c;

        private b() {
            this.f4889b = false;
            this.f4890c = false;
        }

        /* synthetic */ b(C1333f c1333f, C1331d c1331d) {
            this();
        }

        /* renamed from: e */
        private void m5758e() {
            C1170i.m5289a().m5296a(C1170i.a.TIMERS_EVENTS, C1333f.this.f4881k);
        }

        @Override // com.facebook.react.modules.core.C1163b.a
        /* renamed from: a */
        public void mo5272a(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.f4890c) {
                this.f4889b = false;
            } else {
                m5758e();
            }
            C1550a.m6454a(0L, "ScheduleDispatchFrameCallback");
            try {
                C1333f.this.m5740f();
                if (!C1333f.this.f4887q) {
                    C1333f.this.f4887q = true;
                    C1550a.m6464d(0L, "ScheduleDispatchFrameCallback", C1333f.this.f4882l.get());
                    C1333f.this.f4874d.runOnJSQueueThread(C1333f.this.f4877g);
                }
            } finally {
                C1550a.m6453a(0L);
            }
        }

        /* renamed from: b */
        public void m5759b() {
            if (this.f4889b) {
                return;
            }
            this.f4889b = true;
            m5758e();
        }

        /* renamed from: c */
        public void m5760c() {
            if (this.f4889b) {
                return;
            }
            if (C1333f.this.f4874d.isOnUiQueueThread()) {
                m5759b();
            } else {
                C1333f.this.f4874d.runOnUiQueueThread(new RunnableC1334g(this));
            }
        }

        /* renamed from: d */
        public void m5761d() {
            this.f4890c = true;
        }
    }

    public C1333f(ReactApplicationContext reactApplicationContext) {
        this.f4874d = reactApplicationContext;
        this.f4874d.addLifecycleEventListener(this);
        this.f4885o = new ReactEventEmitter(this.f4874d);
    }

    /* renamed from: a */
    private long m5727a(int i, String str, short s) {
        short s2;
        Short sh = this.f4876f.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.f4886p;
            this.f4886p = (short) (s3 + 1);
            this.f4876f.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return m5728a(i, s2, s);
    }

    /* renamed from: a */
    private static long m5728a(int i, short s, short s2) {
        return ((s & 65535) << 32) | i | ((s2 & 65535) << 48);
    }

    /* renamed from: b */
    private void m5733b(AbstractC1330c abstractC1330c) {
        int i = this.f4884n;
        AbstractC1330c[] abstractC1330cArr = this.f4883m;
        if (i == abstractC1330cArr.length) {
            this.f4883m = (AbstractC1330c[]) Arrays.copyOf(abstractC1330cArr, abstractC1330cArr.length * 2);
        }
        AbstractC1330c[] abstractC1330cArr2 = this.f4883m;
        int i2 = this.f4884n;
        this.f4884n = i2 + 1;
        abstractC1330cArr2[i2] = abstractC1330c;
    }

    /* renamed from: d */
    public void m5735d() {
        Arrays.fill(this.f4883m, 0, this.f4884n, (Object) null);
        this.f4884n = 0;
    }

    /* renamed from: e */
    private void m5738e() {
        if (this.f4885o != null) {
            this.f4881k.m5760c();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: f */
    public void m5740f() {
        synchronized (this.f4872b) {
            synchronized (this.f4873c) {
                for (int i = 0; i < this.f4878h.size(); i++) {
                    AbstractC1330c abstractC1330c = this.f4878h.get(i);
                    if (abstractC1330c.mo5718a()) {
                        long m5727a = m5727a(abstractC1330c.m5723g(), abstractC1330c.mo5715d(), abstractC1330c.mo5720c());
                        Integer num = this.f4875e.get(m5727a);
                        AbstractC1330c abstractC1330c2 = null;
                        if (num == null) {
                            this.f4875e.put(m5727a, Integer.valueOf(this.f4884n));
                        } else {
                            AbstractC1330c abstractC1330c3 = this.f4883m[num.intValue()];
                            AbstractC1330c m5716a = abstractC1330c.m5716a(abstractC1330c3);
                            if (m5716a != abstractC1330c3) {
                                this.f4875e.put(m5727a, Integer.valueOf(this.f4884n));
                                this.f4883m[num.intValue()] = null;
                                abstractC1330c2 = abstractC1330c3;
                                abstractC1330c = m5716a;
                            } else {
                                abstractC1330c2 = abstractC1330c;
                                abstractC1330c = null;
                            }
                        }
                        if (abstractC1330c != null) {
                            m5733b(abstractC1330c);
                        }
                        if (abstractC1330c2 != null) {
                            abstractC1330c2.m5719b();
                        }
                    } else {
                        m5733b(abstractC1330c);
                    }
                }
            }
            this.f4878h.clear();
        }
    }

    /* renamed from: g */
    public void m5741g() {
        UiThreadUtil.assertOnUiThread();
        this.f4881k.m5761d();
    }

    /* renamed from: a */
    public void m5750a(int i) {
        this.f4885o.unregister(i);
    }

    /* renamed from: a */
    public void m5751a(int i, RCTEventEmitter rCTEventEmitter) {
        this.f4885o.register(i, rCTEventEmitter);
    }

    /* renamed from: a */
    public void m5752a(InterfaceC1328a interfaceC1328a) {
        this.f4880j.add(interfaceC1328a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m5753a(AbstractC1330c abstractC1330c) {
        C2038a.m8321a(abstractC1330c.m5724h(), "Dispatched event hasn't been initialized");
        Iterator<InterfaceC1335h> it = this.f4879i.iterator();
        while (it.hasNext()) {
            it.next().mo5119a(abstractC1330c);
        }
        synchronized (this.f4872b) {
            this.f4878h.add(abstractC1330c);
            C1550a.m6464d(0L, abstractC1330c.mo5715d(), abstractC1330c.m5722f());
        }
        m5738e();
    }

    /* renamed from: a */
    public void m5754a(InterfaceC1335h interfaceC1335h) {
        this.f4879i.add(interfaceC1335h);
    }

    /* renamed from: b */
    public void m5755b() {
        m5738e();
    }

    /* renamed from: b */
    public void m5756b(InterfaceC1328a interfaceC1328a) {
        this.f4880j.remove(interfaceC1328a);
    }

    /* renamed from: c */
    public void m5757c() {
        UiThreadUtil.runOnUiThread(new RunnableC1332e(this));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        m5741g();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        m5741g();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.f4881k.m5760c();
    }
}
