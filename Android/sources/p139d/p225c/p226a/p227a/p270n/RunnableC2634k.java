package p139d.p225c.p226a.p227a.p270n;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

@TargetApi(17)
/* renamed from: d.c.a.a.n.k */
/* loaded from: classes.dex */
public final class RunnableC2634k implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    private static final int[] f10952a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f10953b;

    /* renamed from: c */
    private final int[] f10954c;

    /* renamed from: d */
    private final b f10955d;

    /* renamed from: e */
    private EGLDisplay f10956e;

    /* renamed from: f */
    private EGLContext f10957f;

    /* renamed from: g */
    private EGLSurface f10958g;

    /* renamed from: h */
    private SurfaceTexture f10959h;

    /* renamed from: d.c.a.a.n.k$a */
    /* loaded from: classes.dex */
    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }
    }

    /* renamed from: d.c.a.a.n.k$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m11144a();
    }

    public RunnableC2634k(Handler handler) {
        this(handler, null);
    }

    public RunnableC2634k(Handler handler, b bVar) {
        this.f10953b = handler;
        this.f10955d = bVar;
        this.f10954c = new int[1];
    }

    /* renamed from: a */
    private static EGLConfig m11135a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f10952a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new a(C2622I.m11054a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    /* renamed from: a */
    private static EGLContext m11136a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new a("eglCreateContext failed");
    }

    /* renamed from: a */
    private static EGLSurface m11137a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed");
    }

    /* renamed from: a */
    private static void m11138a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new a("glGenTextures failed. Error: " + Integer.toHexString(glGetError));
    }

    /* renamed from: c */
    private void m11139c() {
        b bVar = this.f10955d;
        if (bVar != null) {
            bVar.m11144a();
        }
    }

    /* renamed from: d */
    private static EGLDisplay m11140d() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new a("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new a("eglInitialize failed");
    }

    /* renamed from: a */
    public SurfaceTexture m11141a() {
        SurfaceTexture surfaceTexture = this.f10959h;
        C2628e.m11110a(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: a */
    public void m11142a(int i) {
        this.f10956e = m11140d();
        EGLConfig m11135a = m11135a(this.f10956e);
        this.f10957f = m11136a(this.f10956e, m11135a, i);
        this.f10958g = m11137a(this.f10956e, m11135a, this.f10957f, i);
        m11138a(this.f10954c);
        this.f10959h = new SurfaceTexture(this.f10954c[0]);
        this.f10959h.setOnFrameAvailableListener(this);
    }

    /* renamed from: b */
    public void m11143b() {
        this.f10953b.removeCallbacks(this);
        try {
            if (this.f10959h != null) {
                this.f10959h.release();
                GLES20.glDeleteTextures(1, this.f10954c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f10956e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f10956e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f10958g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f10956e, this.f10958g);
            }
            EGLContext eGLContext = this.f10957f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f10956e, eGLContext);
            }
            if (C2622I.f10916a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f10956e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f10956e);
            }
            this.f10956e = null;
            this.f10957f = null;
            this.f10958g = null;
            this.f10959h = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f10953b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m11139c();
        SurfaceTexture surfaceTexture = this.f10959h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
