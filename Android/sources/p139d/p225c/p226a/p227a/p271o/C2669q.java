package p139d.p225c.p226a.p227a.p271o;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import p139d.p225c.p226a.p227a.p270n.C2622I;

@TargetApi(16)
/* renamed from: d.c.a.a.o.q */
/* loaded from: classes.dex */
public final class C2669q {

    /* renamed from: a */
    private final WindowManager f11104a;

    /* renamed from: b */
    private final b f11105b;

    /* renamed from: c */
    private final a f11106c;

    /* renamed from: d */
    private long f11107d;

    /* renamed from: e */
    private long f11108e;

    /* renamed from: f */
    private long f11109f;

    /* renamed from: g */
    private long f11110g;

    /* renamed from: h */
    private long f11111h;

    /* renamed from: i */
    private boolean f11112i;

    /* renamed from: j */
    private long f11113j;

    /* renamed from: k */
    private long f11114k;

    /* renamed from: l */
    private long f11115l;

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(17)
    /* renamed from: d.c.a.a.o.q$a */
    /* loaded from: classes.dex */
    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f11116a;

        public a(DisplayManager displayManager) {
            this.f11116a = displayManager;
        }

        /* renamed from: a */
        public void m11318a() {
            this.f11116a.registerDisplayListener(this, null);
        }

        /* renamed from: b */
        public void m11319b() {
            this.f11116a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                C2669q.this.m11314c();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: d.c.a.a.o.q$b */
    /* loaded from: classes.dex */
    private static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: a */
        private static final b f11118a = new b();

        /* renamed from: c */
        private final Handler f11120c;

        /* renamed from: e */
        private Choreographer f11122e;

        /* renamed from: f */
        private int f11123f;

        /* renamed from: b */
        public volatile long f11119b = -9223372036854775807L;

        /* renamed from: d */
        private final HandlerThread f11121d = new HandlerThread("ChoreographerOwner:Handler");

        private b() {
            this.f11121d.start();
            this.f11120c = C2622I.m11048a(this.f11121d.getLooper(), (Handler.Callback) this);
            this.f11120c.sendEmptyMessage(0);
        }

        /* renamed from: b */
        public static b m11320b() {
            return f11118a;
        }

        /* renamed from: d */
        private void m11321d() {
            this.f11123f++;
            if (this.f11123f == 1) {
                this.f11122e.postFrameCallback(this);
            }
        }

        /* renamed from: e */
        private void m11322e() {
            this.f11122e = Choreographer.getInstance();
        }

        /* renamed from: f */
        private void m11323f() {
            this.f11123f--;
            if (this.f11123f == 0) {
                this.f11122e.removeFrameCallback(this);
                this.f11119b = -9223372036854775807L;
            }
        }

        /* renamed from: a */
        public void m11324a() {
            this.f11120c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void m11325c() {
            this.f11120c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f11119b = j;
            this.f11122e.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m11322e();
                return true;
            }
            if (i == 1) {
                m11321d();
                return true;
            }
            if (i != 2) {
                return false;
            }
            m11323f();
            return true;
        }
    }

    public C2669q(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f11104a = (WindowManager) context.getSystemService("window");
        } else {
            this.f11104a = null;
        }
        if (this.f11104a != null) {
            this.f11106c = C2622I.f10916a >= 17 ? m11311a(context) : null;
            this.f11105b = b.m11320b();
        } else {
            this.f11106c = null;
            this.f11105b = null;
        }
        this.f11107d = -9223372036854775807L;
        this.f11108e = -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m11310a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @TargetApi(17)
    /* renamed from: a */
    private a m11311a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    /* renamed from: b */
    private boolean m11313b(long j, long j2) {
        return Math.abs((j2 - this.f11113j) - (j - this.f11114k)) > 20000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m11314c() {
        Display defaultDisplay = this.f11104a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            this.f11107d = (long) (1.0E9d / refreshRate);
            this.f11108e = (this.f11107d * 80) / 100;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:            if (m11313b(r0, r13) != false) goto L11;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m11315a(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f11112i
            if (r2 == 0) goto L41
            long r2 = r10.f11109f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r10.f11115l
            r4 = 1
            long r2 = r2 + r4
            r10.f11115l = r2
            long r2 = r10.f11111h
            r10.f11110g = r2
        L19:
            long r2 = r10.f11115l
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r10.f11114k
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.f11110g
            long r2 = r2 + r4
            boolean r4 = r10.m11313b(r2, r13)
            if (r4 == 0) goto L33
        L30:
            r10.f11112i = r6
            goto L41
        L33:
            long r4 = r10.f11113j
            long r4 = r4 + r2
            long r6 = r10.f11114k
            long r4 = r4 - r6
            goto L43
        L3a:
            boolean r2 = r10.m11313b(r0, r13)
            if (r2 == 0) goto L41
            goto L30
        L41:
            r4 = r13
            r2 = r0
        L43:
            boolean r6 = r10.f11112i
            if (r6 != 0) goto L52
            r10.f11114k = r0
            r10.f11113j = r13
            r13 = 0
            r10.f11115l = r13
            r13 = 1
            r10.f11112i = r13
        L52:
            r10.f11109f = r11
            r10.f11111h = r2
            d.c.a.a.o.q$b r11 = r10.f11105b
            if (r11 == 0) goto L77
            long r12 = r10.f11107d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L66
            goto L77
        L66:
            long r6 = r11.f11119b
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L6d
            return r4
        L6d:
            long r8 = r10.f11107d
            long r11 = m11310a(r4, r6, r8)
            long r13 = r10.f11108e
            long r11 = r11 - r13
            return r11
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p271o.C2669q.m11315a(long, long):long");
    }

    /* renamed from: a */
    public void m11316a() {
        if (this.f11104a != null) {
            a aVar = this.f11106c;
            if (aVar != null) {
                aVar.m11319b();
            }
            this.f11105b.m11325c();
        }
    }

    /* renamed from: b */
    public void m11317b() {
        this.f11112i = false;
        if (this.f11104a != null) {
            this.f11105b.m11324a();
            a aVar = this.f11106c;
            if (aVar != null) {
                aVar.m11318a();
            }
            m11314c();
        }
    }
}
