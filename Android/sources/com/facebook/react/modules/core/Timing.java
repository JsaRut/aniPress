package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.C1107i;
import com.facebook.react.devsupport.p124a.InterfaceC1114b;
import com.facebook.react.modules.core.C1163b;
import com.facebook.react.modules.core.C1170i;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p139d.p143b.p208m.p211c.C2070b;
import p139d.p143b.p208m.p211c.InterfaceC2071c;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = Timing.NAME)
/* loaded from: classes.dex */
public final class Timing extends ReactContextBaseJavaModule implements LifecycleEventListener, InterfaceC2071c {
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    public static final String NAME = "Timing";
    private final AtomicBoolean isPaused;
    private final AtomicBoolean isRunningTasks;
    private RunnableC1158a mCurrentIdleCallbackRunnable;
    private final InterfaceC1114b mDevSupportManager;
    private boolean mFrameCallbackPosted;
    private boolean mFrameIdleCallbackPosted;
    private final Object mIdleCallbackGuard;
    private final C1159b mIdleFrameCallback;
    private final C1170i mReactChoreographer;
    private boolean mSendIdleEvents;
    private final C1161d mTimerFrameCallback;
    private final Object mTimerGuard;
    private final SparseArray<C1160c> mTimerIdsToTimers;
    private final PriorityQueue<C1160c> mTimers;

    /* renamed from: com.facebook.react.modules.core.Timing$a */
    /* loaded from: classes.dex */
    private class RunnableC1158a implements Runnable {

        /* renamed from: a */
        private volatile boolean f4481a = false;

        /* renamed from: b */
        private final long f4482b;

        public RunnableC1158a(long j) {
            this.f4482b = j;
        }

        /* renamed from: a */
        public void m5271a() {
            this.f4481a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (this.f4481a) {
                return;
            }
            long m5193c = C1107i.m5193c() - (this.f4482b / 1000000);
            long m5191a = C1107i.m5191a() - m5193c;
            if (Timing.FRAME_DURATION_MS - ((float) m5193c) < Timing.IDLE_CALLBACK_FRAME_DEADLINE_MS) {
                return;
            }
            synchronized (Timing.this.mIdleCallbackGuard) {
                z = Timing.this.mSendIdleEvents;
            }
            if (z) {
                ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callIdleCallbacks(m5191a);
            }
            Timing.this.mCurrentIdleCallbackRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.Timing$b */
    /* loaded from: classes.dex */
    public class C1159b extends C1163b.a {
        private C1159b() {
        }

        /* synthetic */ C1159b(Timing timing, C1171j c1171j) {
            this();
        }

        @Override // com.facebook.react.modules.core.C1163b.a
        /* renamed from: a */
        public void mo5272a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                if (Timing.this.mCurrentIdleCallbackRunnable != null) {
                    Timing.this.mCurrentIdleCallbackRunnable.m5271a();
                }
                Timing timing = Timing.this;
                timing.mCurrentIdleCallbackRunnable = new RunnableC1158a(j);
                Timing.this.getReactApplicationContext().runOnJSQueueThread(Timing.this.mCurrentIdleCallbackRunnable);
                Timing.this.mReactChoreographer.m5296a(C1170i.a.IDLE_EVENT, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.Timing$c */
    /* loaded from: classes.dex */
    public static class C1160c {

        /* renamed from: a */
        private final int f4485a;

        /* renamed from: b */
        private final boolean f4486b;

        /* renamed from: c */
        private final int f4487c;

        /* renamed from: d */
        private long f4488d;

        private C1160c(int i, long j, int i2, boolean z) {
            this.f4485a = i;
            this.f4488d = j;
            this.f4487c = i2;
            this.f4486b = z;
        }

        /* synthetic */ C1160c(int i, long j, int i2, boolean z, C1171j c1171j) {
            this(i, j, i2, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.Timing$d */
    /* loaded from: classes.dex */
    public class C1161d extends C1163b.a {

        /* renamed from: b */
        private WritableArray f4489b;

        private C1161d() {
            this.f4489b = null;
        }

        /* synthetic */ C1161d(Timing timing, C1171j c1171j) {
            this();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.facebook.react.modules.core.C1163b.a
        /* renamed from: a */
        public void mo5272a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                long j2 = j / 1000000;
                synchronized (Timing.this.mTimerGuard) {
                    while (!Timing.this.mTimers.isEmpty() && ((C1160c) Timing.this.mTimers.peek()).f4488d < j2) {
                        C1160c c1160c = (C1160c) Timing.this.mTimers.poll();
                        if (this.f4489b == null) {
                            this.f4489b = Arguments.createArray();
                        }
                        this.f4489b.pushInt(c1160c.f4485a);
                        if (c1160c.f4486b) {
                            c1160c.f4488d = c1160c.f4487c + j2;
                            Timing.this.mTimers.add(c1160c);
                        } else {
                            Timing.this.mTimerIdsToTimers.remove(c1160c.f4485a);
                        }
                    }
                }
                if (this.f4489b != null) {
                    ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(this.f4489b);
                    this.f4489b = null;
                }
                Timing.this.mReactChoreographer.m5296a(C1170i.a.TIMERS_EVENTS, this);
            }
        }
    }

    public Timing(ReactApplicationContext reactApplicationContext, InterfaceC1114b interfaceC1114b) {
        super(reactApplicationContext);
        this.mTimerGuard = new Object();
        this.mIdleCallbackGuard = new Object();
        this.isPaused = new AtomicBoolean(true);
        this.isRunningTasks = new AtomicBoolean(false);
        C1171j c1171j = null;
        this.mTimerFrameCallback = new C1161d(this, c1171j);
        this.mIdleFrameCallback = new C1159b(this, c1171j);
        this.mFrameCallbackPosted = false;
        this.mFrameIdleCallbackPosted = false;
        this.mSendIdleEvents = false;
        this.mDevSupportManager = interfaceC1114b;
        this.mTimers = new PriorityQueue<>(11, new C1171j(this));
        this.mTimerIdsToTimers = new SparseArray<>();
        this.mReactChoreographer = C1170i.m5289a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.m5298b(C1170i.a.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = false;
        }
    }

    private void clearFrameCallback() {
        C2070b m8437a = C2070b.m8437a(getReactApplicationContext());
        if (this.mFrameCallbackPosted && this.isPaused.get() && !m8437a.m8441a()) {
            this.mReactChoreographer.m5298b(C1170i.a.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = false;
        }
    }

    private void maybeIdleCallback() {
        if (!this.isPaused.get() || this.isRunningTasks.get()) {
            return;
        }
        clearFrameCallback();
    }

    private void maybeSetChoreographerIdleCallback() {
        synchronized (this.mIdleCallbackGuard) {
            if (this.mSendIdleEvents) {
                setChoreographerIdleCallback();
            }
        }
    }

    private void setChoreographerCallback() {
        if (this.mFrameCallbackPosted) {
            return;
        }
        this.mReactChoreographer.m5296a(C1170i.a.TIMERS_EVENTS, this.mTimerFrameCallback);
        this.mFrameCallbackPosted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            return;
        }
        this.mReactChoreographer.m5296a(C1170i.a.IDLE_EVENT, this.mIdleFrameCallback);
        this.mFrameIdleCallbackPosted = true;
    }

    @ReactMethod
    public void createTimer(int i, int i2, double d2, boolean z) {
        long m5191a = C1107i.m5191a();
        long j = (long) d2;
        if (this.mDevSupportManager.mo5206b() && Math.abs(j - m5191a) > 60000) {
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j - m5191a) + i2);
        if (i2 == 0 && !z) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushInt(i);
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(createArray);
        } else {
            C1160c c1160c = new C1160c(i, (C1107i.m5192b() / 1000000) + max, i2, z, null);
            synchronized (this.mTimerGuard) {
                this.mTimers.add(c1160c);
                this.mTimerIdsToTimers.put(i, c1160c);
            }
        }
    }

    @ReactMethod
    public void deleteTimer(int i) {
        synchronized (this.mTimerGuard) {
            C1160c c1160c = this.mTimerIdsToTimers.get(i);
            if (c1160c == null) {
                return;
            }
            this.mTimerIdsToTimers.remove(i);
            this.mTimers.remove(c1160c);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        C2070b.m8437a(getReactApplicationContext()).m8440a(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        clearFrameCallback();
        clearChoreographerIdleCallback();
        C2070b.m8437a(getReactApplicationContext()).m8442b(this);
    }

    @Override // p139d.p143b.p208m.p211c.InterfaceC2071c
    public void onHeadlessJsTaskFinish(int i) {
        if (C2070b.m8437a(getReactApplicationContext()).m8441a()) {
            return;
        }
        this.isRunningTasks.set(false);
        clearFrameCallback();
        maybeIdleCallback();
    }

    public void onHeadlessJsTaskStart(int i) {
        if (this.isRunningTasks.getAndSet(true)) {
            return;
        }
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @ReactMethod
    public void setSendIdleEvents(boolean z) {
        synchronized (this.mIdleCallbackGuard) {
            this.mSendIdleEvents = z;
        }
        UiThreadUtil.runOnUiThread(new RunnableC1172k(this, z));
    }
}
