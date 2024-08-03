package com.brentvatne.exoplayer;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.p135ui.SubtitleView;
import java.util.List;
import p000a.p005b.p009c.p010a.C0022a;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.C2149N;
import p139d.p225c.p226a.p227a.C2399j;
import p139d.p225c.p226a.p227a.InterfaceC2139D;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.C2565m;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2564l;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p271o.C2670r;

@TargetApi(16)
/* renamed from: com.brentvatne.exoplayer.d */
/* loaded from: classes.dex */
public final class C0977d extends FrameLayout {

    /* renamed from: a */
    private View f4050a;

    /* renamed from: b */
    private final View f4051b;

    /* renamed from: c */
    private final SubtitleView f4052c;

    /* renamed from: d */
    private final C0974a f4053d;

    /* renamed from: e */
    private final a f4054e;

    /* renamed from: f */
    private C2149N f4055f;

    /* renamed from: g */
    private Context f4056g;

    /* renamed from: h */
    private ViewGroup.LayoutParams f4057h;

    /* renamed from: i */
    private boolean f4058i;

    /* renamed from: j */
    private boolean f4059j;

    /* renamed from: k */
    private final Runnable f4060k;

    /* renamed from: com.brentvatne.exoplayer.d$a */
    /* loaded from: classes.dex */
    private final class a implements C2149N.b, C2565m.a, InterfaceC2517k.a {
        private a() {
        }

        /* synthetic */ a(C0977d c0977d, RunnableC0976c runnableC0976c) {
            this();
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4843a() {
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4844a(int i) {
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2671s
        /* renamed from: a */
        public /* synthetic */ void mo4845a(int i, int i2) {
            C2670r.m11326a(this, i, i2);
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2671s
        /* renamed from: a */
        public void mo4846a(int i, int i2, int i3, float f) {
            boolean z = C0977d.this.f4053d.getAspectRatio() == 0.0f;
            C0977d.this.f4053d.setAspectRatio(i2 == 0 ? 1.0f : (i * f) / i2);
            if (z) {
                C0977d c0977d = C0977d.this;
                c0977d.post(c0977d.f4060k);
            }
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4847a(C2137B c2137b) {
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4848a(AbstractC2151P abstractC2151P, Object obj, int i) {
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4849a(C2413N c2413n, C2578l c2578l) {
            C0977d.this.m4837b();
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4850a(C2399j c2399j) {
        }

        @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2564l
        /* renamed from: a */
        public void mo4851a(List<C2527b> list) {
            C0977d.this.f4052c.mo4851a(list);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4852a(boolean z) {
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4853a(boolean z, int i) {
        }

        @Override // p139d.p225c.p226a.p227a.p271o.InterfaceC2671s
        /* renamed from: b */
        public void mo4854b() {
            C0977d.this.f4051b.setVisibility(4);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: b */
        public void mo4855b(int i) {
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: b */
        public void mo4856b(boolean z) {
        }
    }

    public C0977d(Context context) {
        this(context, null);
    }

    public C0977d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0977d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4058i = true;
        this.f4059j = false;
        this.f4060k = new RunnableC0976c(this);
        this.f4056g = context;
        this.f4057h = new ViewGroup.LayoutParams(-1, -1);
        this.f4054e = new a(this, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f4053d = new C0974a(context);
        this.f4053d.setLayoutParams(layoutParams);
        this.f4051b = new View(getContext());
        this.f4051b.setLayoutParams(this.f4057h);
        this.f4051b.setBackgroundColor(C0022a.m86a(context, R.color.black));
        this.f4052c = new SubtitleView(context);
        this.f4052c.setLayoutParams(this.f4057h);
        this.f4052c.m6575a();
        this.f4052c.m6577b();
        m4841d();
        this.f4053d.addView(this.f4051b, 1, this.f4057h);
        this.f4053d.addView(this.f4052c, 2, this.f4057h);
        addViewInLayout(this.f4053d, 0, layoutParams);
    }

    /* renamed from: a */
    private void m4835a() {
        View view = this.f4050a;
        if (view instanceof TextureView) {
            this.f4055f.m8607a((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f4055f.m8606a((SurfaceView) view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4837b() {
        C2149N c2149n = this.f4055f;
        if (c2149n == null) {
            return;
        }
        C2578l m8617u = c2149n.m8617u();
        for (int i = 0; i < m8617u.f10726a; i++) {
            if (this.f4055f.m8614b(i) == 2 && m8617u.m10887a(i) != null) {
                return;
            }
        }
        this.f4051b.setVisibility(0);
    }

    /* renamed from: c */
    private void m4839c() {
        this.f4051b.setVisibility(this.f4059j ? 4 : 0);
    }

    /* renamed from: d */
    private void m4841d() {
        View textureView = this.f4058i ? new TextureView(this.f4056g) : new SurfaceView(this.f4056g);
        textureView.setLayoutParams(this.f4057h);
        this.f4050a = textureView;
        if (this.f4053d.getChildAt(0) != null) {
            this.f4053d.removeViewAt(0);
        }
        this.f4053d.addView(this.f4050a, 0, this.f4057h);
        if (this.f4055f != null) {
            m4835a();
        }
    }

    public View getVideoSurfaceView() {
        return this.f4050a;
    }

    public void setHideShutterView(boolean z) {
        this.f4059j = z;
        m4839c();
    }

    public void setPlayer(C2149N c2149n) {
        C2149N c2149n2 = this.f4055f;
        if (c2149n2 == c2149n) {
            return;
        }
        if (c2149n2 != null) {
            c2149n2.m8616b((InterfaceC2564l) null);
            this.f4055f.m8609a((C2149N.b) null);
            this.f4055f.mo8516b((InterfaceC2139D.b) this.f4054e);
            this.f4055f.m8604a((Surface) null);
        }
        this.f4055f = c2149n;
        this.f4051b.setVisibility(0);
        if (c2149n != null) {
            m4835a();
            c2149n.m8609a((C2149N.b) this.f4054e);
            c2149n.mo8513a((InterfaceC2139D.b) this.f4054e);
            c2149n.m8616b((InterfaceC2564l) this.f4054e);
        }
    }

    public void setResizeMode(int i) {
        if (this.f4053d.getResizeMode() != i) {
            this.f4053d.setResizeMode(i);
            post(this.f4060k);
        }
    }

    public void setUseTextureView(boolean z) {
        if (z != this.f4058i) {
            this.f4058i = z;
            m4841d();
        }
    }
}
