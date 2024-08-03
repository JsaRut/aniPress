package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C1163b;
import java.util.ArrayDeque;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.modules.core.i */
/* loaded from: classes.dex */
public class C1170i {

    /* renamed from: a */
    private static C1170i f4500a;

    /* renamed from: b */
    private volatile C1163b f4501b;

    /* renamed from: e */
    private int f4504e = 0;

    /* renamed from: f */
    private boolean f4505f = false;

    /* renamed from: c */
    private final b f4502c = new b(this, null);

    /* renamed from: d */
    private final ArrayDeque<C1163b.a>[] f4503d = new ArrayDeque[a.values().length];

    /* renamed from: com.facebook.react.modules.core.i$a */
    /* loaded from: classes.dex */
    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);


        /* renamed from: g */
        private final int f4512g;

        a(int i) {
            this.f4512g = i;
        }

        /* renamed from: b */
        int m5300b() {
            return this.f4512g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.i$b */
    /* loaded from: classes.dex */
    public class b extends C1163b.a {
        private b() {
        }

        /* synthetic */ b(C1170i c1170i, RunnableC1168g runnableC1168g) {
            this();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.facebook.react.modules.core.C1163b.a
        /* renamed from: a */
        public void mo5272a(long j) {
            synchronized (C1170i.this) {
                C1170i.this.f4505f = false;
                for (int i = 0; i < C1170i.this.f4503d.length; i++) {
                    int size = C1170i.this.f4503d[i].size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C1163b.a) C1170i.this.f4503d[i].removeFirst()).mo5272a(j);
                        C1170i.m5293c(C1170i.this);
                    }
                }
                C1170i.this.m5294d();
            }
        }
    }

    private C1170i() {
        int i = 0;
        while (true) {
            ArrayDeque<C1163b.a>[] arrayDequeArr = this.f4503d;
            if (i >= arrayDequeArr.length) {
                m5297a((Runnable) null);
                return;
            } else {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            }
        }
    }

    /* renamed from: a */
    public static C1170i m5289a() {
        C2038a.m8319a(f4500a, "ReactChoreographer needs to be initialized.");
        return f4500a;
    }

    /* renamed from: b */
    public static void m5291b() {
        if (f4500a == null) {
            f4500a = new C1170i();
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m5293c(C1170i c1170i) {
        int i = c1170i.f4504e;
        c1170i.f4504e = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5294d() {
        C2038a.m8320a(this.f4504e >= 0);
        if (this.f4504e == 0 && this.f4505f) {
            if (this.f4501b != null) {
                this.f4501b.m5283b(this.f4502c);
            }
            this.f4505f = false;
        }
    }

    /* renamed from: a */
    public synchronized void m5296a(a aVar, C1163b.a aVar2) {
        this.f4503d[aVar.m5300b()].addLast(aVar2);
        boolean z = true;
        this.f4504e++;
        if (this.f4504e <= 0) {
            z = false;
        }
        C2038a.m8320a(z);
        if (!this.f4505f) {
            if (this.f4501b == null) {
                m5297a(new RunnableC1168g(this));
            } else {
                m5299c();
            }
        }
    }

    /* renamed from: a */
    public void m5297a(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new RunnableC1169h(this, runnable));
    }

    /* renamed from: b */
    public synchronized void m5298b(a aVar, C1163b.a aVar2) {
        if (this.f4503d[aVar.m5300b()].removeFirstOccurrence(aVar2)) {
            this.f4504e--;
            m5294d();
        } else {
            C1700a.m7006b("ReactNative", "Tried to remove non-existent frame callback");
        }
    }

    /* renamed from: c */
    public void m5299c() {
        this.f4501b.m5282a(this.f4502c);
        this.f4505f = true;
    }
}
