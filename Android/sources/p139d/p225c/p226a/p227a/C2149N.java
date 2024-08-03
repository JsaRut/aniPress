package p139d.p225c.p226a.p227a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p139d.p225c.p226a.p227a.InterfaceC2139D;
import p139d.p225c.p226a.p227a.p228a.C2153a;
import p139d.p225c.p226a.p227a.p229b.C2173j;
import p139d.p225c.p226a.p227a.p229b.C2176m;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2177n;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2179p;
import p139d.p225c.p226a.p227a.p230c.C2195e;
import p139d.p225c.p226a.p227a.p231d.C2210j;
import p139d.p225c.p226a.p227a.p231d.C2219s;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2395g;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2564l;
import p139d.p225c.p226a.p227a.p268l.AbstractC2579m;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2629f;
import p139d.p225c.p226a.p227a.p271o.InterfaceC2671s;
import p139d.p225c.p226a.p227a.p271o.InterfaceC2672t;

@TargetApi(16)
/* renamed from: d.c.a.a.N */
/* loaded from: classes.dex */
public class C2149N extends AbstractC2155b implements InterfaceC2517k, InterfaceC2139D.a, InterfaceC2139D.e, InterfaceC2139D.d, InterfaceC2139D.c {

    /* renamed from: A */
    private C2173j f7668A;

    /* renamed from: B */
    private float f7669B;

    /* renamed from: C */
    private InterfaceC2515y f7670C;

    /* renamed from: D */
    private List<C2527b> f7671D;

    /* renamed from: E */
    private boolean f7672E;

    /* renamed from: b */
    protected final InterfaceC2143H[] f7673b;

    /* renamed from: c */
    private final C2613n f7674c;

    /* renamed from: d */
    private final Handler f7675d;

    /* renamed from: e */
    private final a f7676e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<InterfaceC2671s> f7677f;

    /* renamed from: g */
    private final CopyOnWriteArraySet<InterfaceC2177n> f7678g;

    /* renamed from: h */
    private final CopyOnWriteArraySet<InterfaceC2564l> f7679h;

    /* renamed from: i */
    private final CopyOnWriteArraySet<InterfaceC2395g> f7680i;

    /* renamed from: j */
    private final CopyOnWriteArraySet<InterfaceC2672t> f7681j;

    /* renamed from: k */
    private final CopyOnWriteArraySet<InterfaceC2179p> f7682k;

    /* renamed from: l */
    private final InterfaceC2592f f7683l;

    /* renamed from: m */
    private final C2153a f7684m;

    /* renamed from: n */
    private final C2176m f7685n;

    /* renamed from: o */
    private C2676s f7686o;

    /* renamed from: p */
    private C2676s f7687p;

    /* renamed from: q */
    private Surface f7688q;

    /* renamed from: r */
    private boolean f7689r;

    /* renamed from: s */
    private int f7690s;

    /* renamed from: t */
    private SurfaceHolder f7691t;

    /* renamed from: u */
    private TextureView f7692u;

    /* renamed from: v */
    private int f7693v;

    /* renamed from: w */
    private int f7694w;

    /* renamed from: x */
    private C2195e f7695x;

    /* renamed from: y */
    private C2195e f7696y;

    /* renamed from: z */
    private int f7697z;

    /* renamed from: d.c.a.a.N$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC2672t, InterfaceC2179p, InterfaceC2564l, InterfaceC2395g, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C2176m.b {
        private a() {
        }

        /* synthetic */ a(C2149N c2149n, C2148M c2148m) {
            this();
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2176m.b
        /* renamed from: a */
        public void mo8621a(float f) {
            C2149N.this.m8602z();
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2176m.b
        /* renamed from: a */
        public void mo8622a(int i) {
            C2149N c2149n = C2149N.this;
            c2149n.m8590a(c2149n.mo8520e(), i);
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
        /* renamed from: a */
        public void mo8623a(int i, int i2, int i3, float f) {
            Iterator it = C2149N.this.f7677f.iterator();
            while (it.hasNext()) {
                InterfaceC2671s interfaceC2671s = (InterfaceC2671s) it.next();
                if (!C2149N.this.f7681j.contains(interfaceC2671s)) {
                    interfaceC2671s.mo4846a(i, i2, i3, f);
                }
            }
            Iterator it2 = C2149N.this.f7681j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2672t) it2.next()).mo8623a(i, i2, i3, f);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
        /* renamed from: a */
        public void mo8624a(int i, long j) {
            Iterator it = C2149N.this.f7681j.iterator();
            while (it.hasNext()) {
                ((InterfaceC2672t) it.next()).mo8624a(i, j);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
        /* renamed from: a */
        public void mo8625a(Surface surface) {
            if (C2149N.this.f7688q == surface) {
                Iterator it = C2149N.this.f7677f.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2671s) it.next()).mo4854b();
                }
            }
            Iterator it2 = C2149N.this.f7681j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2672t) it2.next()).mo8625a(surface);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
        /* renamed from: a */
        public void mo8626a(C2195e c2195e) {
            Iterator it = C2149N.this.f7682k.iterator();
            while (it.hasNext()) {
                ((InterfaceC2179p) it.next()).mo8626a(c2195e);
            }
            C2149N.this.f7687p = null;
            C2149N.this.f7696y = null;
            C2149N.this.f7697z = 0;
        }

        @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2395g
        /* renamed from: a */
        public void mo4927a(C2353b c2353b) {
            Iterator it = C2149N.this.f7680i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2395g) it.next()).mo4927a(c2353b);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
        /* renamed from: a */
        public void mo8627a(C2676s c2676s) {
            C2149N.this.f7686o = c2676s;
            Iterator it = C2149N.this.f7681j.iterator();
            while (it.hasNext()) {
                ((InterfaceC2672t) it.next()).mo8627a(c2676s);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
        /* renamed from: a */
        public void mo8628a(String str, long j, long j2) {
            Iterator it = C2149N.this.f7681j.iterator();
            while (it.hasNext()) {
                ((InterfaceC2672t) it.next()).mo8628a(str, j, j2);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2564l
        /* renamed from: a */
        public void mo4851a(List<C2527b> list) {
            C2149N.this.f7671D = list;
            Iterator it = C2149N.this.f7679h.iterator();
            while (it.hasNext()) {
                ((InterfaceC2564l) it.next()).mo4851a(list);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
        /* renamed from: b */
        public void mo8629b(int i, long j, long j2) {
            Iterator it = C2149N.this.f7682k.iterator();
            while (it.hasNext()) {
                ((InterfaceC2179p) it.next()).mo8629b(i, j, j2);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
        /* renamed from: b */
        public void mo8630b(C2195e c2195e) {
            C2149N.this.f7696y = c2195e;
            Iterator it = C2149N.this.f7682k.iterator();
            while (it.hasNext()) {
                ((InterfaceC2179p) it.next()).mo8630b(c2195e);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
        /* renamed from: b */
        public void mo8631b(C2676s c2676s) {
            C2149N.this.f7687p = c2676s;
            Iterator it = C2149N.this.f7682k.iterator();
            while (it.hasNext()) {
                ((InterfaceC2179p) it.next()).mo8631b(c2676s);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
        /* renamed from: b */
        public void mo8632b(String str, long j, long j2) {
            Iterator it = C2149N.this.f7682k.iterator();
            while (it.hasNext()) {
                ((InterfaceC2179p) it.next()).mo8632b(str, j, j2);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2179p
        /* renamed from: c */
        public void mo8633c(int i) {
            if (C2149N.this.f7697z == i) {
                return;
            }
            C2149N.this.f7697z = i;
            Iterator it = C2149N.this.f7678g.iterator();
            while (it.hasNext()) {
                InterfaceC2177n interfaceC2177n = (InterfaceC2177n) it.next();
                if (!C2149N.this.f7682k.contains(interfaceC2177n)) {
                    interfaceC2177n.m8883c(i);
                }
            }
            Iterator it2 = C2149N.this.f7682k.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2179p) it2.next()).mo8633c(i);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
        /* renamed from: c */
        public void mo8634c(C2195e c2195e) {
            C2149N.this.f7695x = c2195e;
            Iterator it = C2149N.this.f7681j.iterator();
            while (it.hasNext()) {
                ((InterfaceC2672t) it.next()).mo8634c(c2195e);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2672t
        /* renamed from: d */
        public void mo8635d(C2195e c2195e) {
            Iterator it = C2149N.this.f7681j.iterator();
            while (it.hasNext()) {
                ((InterfaceC2672t) it.next()).mo8635d(c2195e);
            }
            C2149N.this.f7686o = null;
            C2149N.this.f7695x = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C2149N.this.m8586a(new Surface(surfaceTexture), true);
            C2149N.this.m8585a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C2149N.this.m8586a((Surface) null, true);
            C2149N.this.m8585a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C2149N.this.m8585a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C2149N.this.m8585a(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C2149N.this.m8586a(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C2149N.this.m8586a((Surface) null, false);
            C2149N.this.m8585a(0, 0);
        }
    }

    @Deprecated
    /* renamed from: d.c.a.a.N$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC2671s {
    }

    public C2149N(Context context, InterfaceC2146K interfaceC2146K, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v, InterfaceC2215o<C2219s> interfaceC2215o, InterfaceC2592f interfaceC2592f, C2153a.a aVar, Looper looper) {
        this(context, interfaceC2146K, abstractC2579m, interfaceC2679v, interfaceC2215o, interfaceC2592f, aVar, InterfaceC2629f.f10943a, looper);
    }

    protected C2149N(Context context, InterfaceC2146K interfaceC2146K, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v, InterfaceC2215o<C2219s> interfaceC2215o, InterfaceC2592f interfaceC2592f, C2153a.a aVar, InterfaceC2629f interfaceC2629f, Looper looper) {
        this.f7683l = interfaceC2592f;
        this.f7676e = new a();
        this.f7677f = new CopyOnWriteArraySet<>();
        this.f7678g = new CopyOnWriteArraySet<>();
        this.f7679h = new CopyOnWriteArraySet<>();
        this.f7680i = new CopyOnWriteArraySet<>();
        this.f7681j = new CopyOnWriteArraySet<>();
        this.f7682k = new CopyOnWriteArraySet<>();
        this.f7675d = new Handler(looper);
        Handler handler = this.f7675d;
        a aVar2 = this.f7676e;
        this.f7673b = interfaceC2146K.mo8578a(handler, aVar2, aVar2, aVar2, aVar2, interfaceC2215o);
        this.f7669B = 1.0f;
        this.f7697z = 0;
        this.f7668A = C2173j.f7861a;
        this.f7690s = 1;
        this.f7671D = Collections.emptyList();
        this.f7674c = new C2613n(this.f7673b, abstractC2579m, interfaceC2679v, interfaceC2592f, interfaceC2629f, looper);
        this.f7684m = aVar.m8700a(this.f7674c, interfaceC2629f);
        mo8513a((InterfaceC2139D.b) this.f7684m);
        this.f7681j.add(this.f7684m);
        this.f7677f.add(this.f7684m);
        this.f7682k.add(this.f7684m);
        this.f7678g.add(this.f7684m);
        m8610a((InterfaceC2395g) this.f7684m);
        interfaceC2592f.mo10915a(this.f7675d, this.f7684m);
        if (interfaceC2215o instanceof C2210j) {
            ((C2210j) interfaceC2215o).m9085a(this.f7675d, this.f7684m);
        }
        this.f7685n = new C2176m(context, this.f7676e);
    }

    /* renamed from: A */
    private void m8579A() {
        if (Looper.myLooper() != mo8531p()) {
            C2638o.m11158b("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", this.f7672E ? null : new IllegalStateException());
            this.f7672E = true;
        }
    }

    /* renamed from: a */
    public void m8585a(int i, int i2) {
        if (i == this.f7693v && i2 == this.f7694w) {
            return;
        }
        this.f7693v = i;
        this.f7694w = i2;
        Iterator<InterfaceC2671s> it = this.f7677f.iterator();
        while (it.hasNext()) {
            it.next().mo4845a(i, i2);
        }
    }

    /* renamed from: a */
    public void m8586a(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2143H interfaceC2143H : this.f7673b) {
            if (interfaceC2143H.mo8568f() == 2) {
                C2141F m10980a = this.f7674c.m10980a(interfaceC2143H);
                m10980a.m8543a(1);
                m10980a.m8544a(surface);
                m10980a.m8556k();
                arrayList.add(m10980a);
            }
        }
        Surface surface2 = this.f7688q;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2141F) it.next()).m8546a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f7689r) {
                this.f7688q.release();
            }
        }
        this.f7688q = surface;
        this.f7689r = z;
    }

    /* renamed from: a */
    public void m8590a(boolean z, int i) {
        this.f7674c.m10984a(z && i != -1, i != 1);
    }

    /* renamed from: y */
    private void m8601y() {
        TextureView textureView = this.f7692u;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f7676e) {
                C2638o.m11160d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7692u.setSurfaceTextureListener(null);
            }
            this.f7692u = null;
        }
        SurfaceHolder surfaceHolder = this.f7691t;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f7676e);
            this.f7691t = null;
        }
    }

    /* renamed from: z */
    public void m8602z() {
        float m8879a = this.f7669B * this.f7685n.m8879a();
        for (InterfaceC2143H interfaceC2143H : this.f7673b) {
            if (interfaceC2143H.mo8568f() == 1) {
                C2141F m10980a = this.f7674c.m10980a(interfaceC2143H);
                m10980a.m8543a(2);
                m10980a.m8544a(Float.valueOf(m8879a));
                m10980a.m8556k();
            }
        }
    }

    /* renamed from: a */
    public void m8603a(float f) {
        m8579A();
        float m11035a = C2622I.m11035a(f, 0.0f, 1.0f);
        if (this.f7669B == m11035a) {
            return;
        }
        this.f7669B = m11035a;
        m8602z();
        Iterator<InterfaceC2177n> it = this.f7678g.iterator();
        while (it.hasNext()) {
            it.next().mo8683a(m11035a);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8511a(int i) {
        m8579A();
        this.f7674c.mo8511a(i);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8512a(int i, long j) {
        m8579A();
        this.f7684m.m8698g();
        this.f7674c.mo8512a(i, j);
    }

    /* renamed from: a */
    public void m8604a(Surface surface) {
        m8579A();
        m8601y();
        m8586a(surface, false);
        int i = surface != null ? -1 : 0;
        m8585a(i, i);
    }

    /* renamed from: a */
    public void m8605a(SurfaceHolder surfaceHolder) {
        m8579A();
        m8601y();
        this.f7691t = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.f7676e);
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                m8586a(surface, false);
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                m8585a(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        m8586a((Surface) null, false);
        m8585a(0, 0);
    }

    /* renamed from: a */
    public void m8606a(SurfaceView surfaceView) {
        m8605a(surfaceView == null ? null : surfaceView.getHolder());
    }

    /* renamed from: a */
    public void m8607a(TextureView textureView) {
        m8579A();
        m8601y();
        this.f7692u = textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                C2638o.m11160d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f7676e);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                m8586a(new Surface(surfaceTexture), true);
                m8585a(textureView.getWidth(), textureView.getHeight());
                return;
            }
        }
        m8586a((Surface) null, true);
        m8585a(0, 0);
    }

    /* renamed from: a */
    public void m8608a(C2137B c2137b) {
        m8579A();
        this.f7674c.m10982a(c2137b);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8513a(InterfaceC2139D.b bVar) {
        m8579A();
        this.f7674c.mo8513a(bVar);
    }

    @Deprecated
    /* renamed from: a */
    public void m8609a(b bVar) {
        this.f7677f.clear();
        if (bVar != null) {
            m8613a((InterfaceC2671s) bVar);
        }
    }

    /* renamed from: a */
    public void m8610a(InterfaceC2395g interfaceC2395g) {
        this.f7680i.add(interfaceC2395g);
    }

    /* renamed from: a */
    public void m8611a(InterfaceC2515y interfaceC2515y, boolean z, boolean z2) {
        m8579A();
        InterfaceC2515y interfaceC2515y2 = this.f7670C;
        if (interfaceC2515y2 != null) {
            interfaceC2515y2.mo10436a(this.f7684m);
            this.f7684m.m8699h();
        }
        this.f7670C = interfaceC2515y;
        interfaceC2515y.mo10433a(this.f7675d, this.f7684m);
        m8590a(mo8520e(), this.f7685n.m8880a(mo8520e()));
        this.f7674c.m10983a(interfaceC2515y, z, z2);
    }

    /* renamed from: a */
    public void m8612a(InterfaceC2564l interfaceC2564l) {
        if (!this.f7671D.isEmpty()) {
            interfaceC2564l.mo4851a(this.f7671D);
        }
        this.f7679h.add(interfaceC2564l);
    }

    /* renamed from: a */
    public void m8613a(InterfaceC2671s interfaceC2671s) {
        this.f7677f.add(interfaceC2671s);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: a */
    public void mo8514a(boolean z) {
        m8579A();
        this.f7674c.mo8514a(z);
    }

    /* renamed from: b */
    public int m8614b(int i) {
        m8579A();
        return this.f7674c.m10985b(i);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: b */
    public C2137B mo8515b() {
        m8579A();
        return this.f7674c.mo8515b();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: b */
    public void mo8516b(InterfaceC2139D.b bVar) {
        m8579A();
        this.f7674c.mo8516b(bVar);
    }

    @Deprecated
    /* renamed from: b */
    public void m8615b(InterfaceC2395g interfaceC2395g) {
        this.f7680i.retainAll(Collections.singleton(this.f7684m));
        if (interfaceC2395g != null) {
            m8610a(interfaceC2395g);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void m8616b(InterfaceC2564l interfaceC2564l) {
        this.f7679h.clear();
        if (interfaceC2564l != null) {
            m8612a(interfaceC2564l);
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: b */
    public void mo8517b(boolean z) {
        m8579A();
        m8590a(z, this.f7685n.m8881a(z, mo8526k()));
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: c */
    public boolean mo8518c() {
        m8579A();
        return this.f7674c.mo8518c();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: d */
    public long mo8519d() {
        m8579A();
        return this.f7674c.mo8519d();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: e */
    public boolean mo8520e() {
        m8579A();
        return this.f7674c.mo8520e();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: f */
    public int mo8521f() {
        m8579A();
        return this.f7674c.mo8521f();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: g */
    public int mo8522g() {
        m8579A();
        return this.f7674c.mo8522g();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    public long getCurrentPosition() {
        m8579A();
        return this.f7674c.getCurrentPosition();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    public long getDuration() {
        m8579A();
        return this.f7674c.getDuration();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: h */
    public long mo8523h() {
        m8579A();
        return this.f7674c.mo8523h();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: j */
    public long mo8525j() {
        m8579A();
        return this.f7674c.mo8525j();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: k */
    public int mo8526k() {
        m8579A();
        return this.f7674c.mo8526k();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: l */
    public int mo8527l() {
        m8579A();
        return this.f7674c.mo8527l();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: n */
    public int mo8529n() {
        m8579A();
        return this.f7674c.mo8529n();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: o */
    public AbstractC2151P mo8530o() {
        m8579A();
        return this.f7674c.mo8530o();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: p */
    public Looper mo8531p() {
        return this.f7674c.mo8531p();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: q */
    public boolean mo8532q() {
        m8579A();
        return this.f7674c.mo8532q();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: r */
    public long mo8533r() {
        m8579A();
        return this.f7674c.mo8533r();
    }

    /* renamed from: u */
    public C2578l m8617u() {
        m8579A();
        return this.f7674c.m10987v();
    }

    /* renamed from: v */
    public int m8618v() {
        m8579A();
        return this.f7674c.m10988w();
    }

    /* renamed from: w */
    public C2676s m8619w() {
        return this.f7686o;
    }

    /* renamed from: x */
    public void m8620x() {
        this.f7685n.m8882b();
        this.f7674c.m10989x();
        m8601y();
        Surface surface = this.f7688q;
        if (surface != null) {
            if (this.f7689r) {
                surface.release();
            }
            this.f7688q = null;
        }
        InterfaceC2515y interfaceC2515y = this.f7670C;
        if (interfaceC2515y != null) {
            interfaceC2515y.mo10436a(this.f7684m);
            this.f7670C = null;
        }
        this.f7683l.mo10916a(this.f7684m);
        this.f7671D = Collections.emptyList();
    }
}
