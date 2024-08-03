package p139d.p225c.p226a.p227a.p271o;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.RunnableC2634k;

@TargetApi(17)
/* renamed from: d.c.a.a.o.l */
/* loaded from: classes.dex */
public final class C2664l extends Surface {

    /* renamed from: a */
    private static int f11047a;

    /* renamed from: b */
    private static boolean f11048b;

    /* renamed from: c */
    public final boolean f11049c;

    /* renamed from: d */
    private final a f11050d;

    /* renamed from: e */
    private boolean f11051e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.o.l$a */
    /* loaded from: classes.dex */
    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        private RunnableC2634k f11052a;

        /* renamed from: b */
        private Handler f11053b;

        /* renamed from: c */
        private Error f11054c;

        /* renamed from: d */
        private RuntimeException f11055d;

        /* renamed from: e */
        private C2664l f11056e;

        public a() {
            super("dummySurface");
        }

        /* renamed from: b */
        private void m11271b() {
            C2628e.m11110a(this.f11052a);
            this.f11052a.m11143b();
        }

        /* renamed from: b */
        private void m11272b(int i) {
            C2628e.m11110a(this.f11052a);
            this.f11052a.m11142a(i);
            this.f11056e = new C2664l(this, this.f11052a.m11141a(), i != 0);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public C2664l m11273a(int i) {
            boolean z;
            start();
            this.f11053b = new Handler(getLooper(), this);
            this.f11052a = new RunnableC2634k(this.f11053b);
            synchronized (this) {
                z = false;
                this.f11053b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f11056e == null && this.f11055d == null && this.f11054c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f11055d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f11054c;
            if (error != null) {
                throw error;
            }
            C2664l c2664l = this.f11056e;
            C2628e.m11110a(c2664l);
            return c2664l;
        }

        /* renamed from: a */
        public void m11274a() {
            C2628e.m11110a(this.f11053b);
            this.f11053b.sendEmptyMessage(2);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    try {
                        if (i != 2) {
                            return true;
                        }
                        try {
                            m11271b();
                        } catch (Throwable th) {
                            C2638o.m11156a("DummySurface", "Failed to release dummy surface", th);
                        }
                        return true;
                    } finally {
                        quit();
                    }
                }
                try {
                    m11272b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    C2638o.m11156a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f11054c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    C2638o.m11156a("DummySurface", "Failed to initialize dummy surface", e3);
                    this.f11055d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private C2664l(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f11050d = aVar;
        this.f11049c = z;
    }

    /* renamed from: a */
    public static C2664l m11267a(Context context, boolean z) {
        m11268a();
        C2628e.m11113b(!z || m11269a(context));
        return new a().m11273a(z ? f11047a : 0);
    }

    /* renamed from: a */
    private static void m11268a() {
        if (C2622I.f10916a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    /* renamed from: a */
    public static synchronized boolean m11269a(Context context) {
        boolean z;
        synchronized (C2664l.class) {
            if (!f11048b) {
                f11047a = C2622I.f10916a < 24 ? 0 : m11270b(context);
                f11048b = true;
            }
            z = f11047a != 0;
        }
        return z;
    }

    @TargetApi(24)
    /* renamed from: b */
    private static int m11270b(Context context) {
        String eglQueryString;
        if (C2622I.f10916a < 26 && ("samsung".equals(C2622I.f10918c) || "XT1650".equals(C2622I.f10919d))) {
            return 0;
        }
        if ((C2622I.f10916a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f11050d) {
            if (!this.f11051e) {
                this.f11050d.m11274a();
                this.f11051e = true;
            }
        }
    }
}
