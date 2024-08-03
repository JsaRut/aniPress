package com.google.android.exoplayer2.p135ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.p135ui.InterfaceC1575n;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.C2140E;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2226f;
import p139d.p225c.p226a.p227a.C2399j;
import p139d.p225c.p226a.p227a.C2674q;
import p139d.p225c.p226a.p227a.InterfaceC2138C;
import p139d.p225c.p226a.p227a.InterfaceC2139D;
import p139d.p225c.p226a.p227a.InterfaceC2223e;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2648y;

/* renamed from: com.google.android.exoplayer2.ui.g */
/* loaded from: classes.dex */
public class C1568g extends FrameLayout {

    /* renamed from: A */
    private b f5899A;

    /* renamed from: B */
    private InterfaceC2138C f5900B;

    /* renamed from: C */
    private boolean f5901C;

    /* renamed from: D */
    private boolean f5902D;

    /* renamed from: E */
    private boolean f5903E;

    /* renamed from: F */
    private boolean f5904F;

    /* renamed from: G */
    private int f5905G;

    /* renamed from: H */
    private int f5906H;

    /* renamed from: I */
    private int f5907I;

    /* renamed from: J */
    private int f5908J;

    /* renamed from: K */
    private boolean f5909K;

    /* renamed from: L */
    private long f5910L;

    /* renamed from: M */
    private long[] f5911M;

    /* renamed from: N */
    private boolean[] f5912N;

    /* renamed from: O */
    private long[] f5913O;

    /* renamed from: P */
    private boolean[] f5914P;

    /* renamed from: a */
    private final a f5915a;

    /* renamed from: b */
    private final View f5916b;

    /* renamed from: c */
    private final View f5917c;

    /* renamed from: d */
    private final View f5918d;

    /* renamed from: e */
    private final View f5919e;

    /* renamed from: f */
    private final View f5920f;

    /* renamed from: g */
    private final View f5921g;

    /* renamed from: h */
    private final ImageView f5922h;

    /* renamed from: i */
    private final View f5923i;

    /* renamed from: j */
    private final TextView f5924j;

    /* renamed from: k */
    private final TextView f5925k;

    /* renamed from: l */
    private final InterfaceC1575n f5926l;

    /* renamed from: m */
    private final StringBuilder f5927m;

    /* renamed from: n */
    private final Formatter f5928n;

    /* renamed from: o */
    private final AbstractC2151P.a f5929o;

    /* renamed from: p */
    private final AbstractC2151P.b f5930p;

    /* renamed from: q */
    private final Runnable f5931q;

    /* renamed from: r */
    private final Runnable f5932r;

    /* renamed from: s */
    private final Drawable f5933s;

    /* renamed from: t */
    private final Drawable f5934t;

    /* renamed from: u */
    private final Drawable f5935u;

    /* renamed from: v */
    private final String f5936v;

    /* renamed from: w */
    private final String f5937w;

    /* renamed from: x */
    private final String f5938x;

    /* renamed from: y */
    private InterfaceC2139D f5939y;

    /* renamed from: z */
    private InterfaceC2223e f5940z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.g$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC2139D.b, InterfaceC1575n.a, View.OnClickListener {
        private a() {
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public /* synthetic */ void mo4843a() {
            C2140E.m8534a(this);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4844a(int i) {
            C1568g.this.m6630o();
            C1568g.this.m6623l();
        }

        @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n.a
        /* renamed from: a */
        public void mo6648a(InterfaceC1575n interfaceC1575n, long j) {
            if (C1568g.this.f5925k != null) {
                C1568g.this.f5925k.setText(C2622I.m11055a(C1568g.this.f5927m, C1568g.this.f5928n, j));
            }
        }

        @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n.a
        /* renamed from: a */
        public void mo6649a(InterfaceC1575n interfaceC1575n, long j, boolean z) {
            C1568g.this.f5904F = false;
            if (z || C1568g.this.f5939y == null) {
                return;
            }
            C1568g.this.m6604b(j);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public /* synthetic */ void mo4847a(C2137B c2137b) {
            C2140E.m8536a(this, c2137b);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4848a(AbstractC2151P abstractC2151P, Object obj, int i) {
            C1568g.this.m6623l();
            C1568g.this.m6634q();
            C1568g.this.m6628n();
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public /* synthetic */ void mo4849a(C2413N c2413n, C2578l c2578l) {
            C2140E.m8538a(this, c2413n, c2578l);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public /* synthetic */ void mo4850a(C2399j c2399j) {
            C2140E.m8539a(this, c2399j);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public /* synthetic */ void mo4852a(boolean z) {
            C2140E.m8540a(this, z);
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: a */
        public void mo4853a(boolean z, int i) {
            C1568g.this.m6626m();
            C1568g.this.m6628n();
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: b */
        public void mo4855b(int i) {
            C1568g.this.m6623l();
            C1568g.this.m6628n();
        }

        @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n.a
        /* renamed from: b */
        public void mo6650b(InterfaceC1575n interfaceC1575n, long j) {
            C1568g.this.f5904F = true;
        }

        @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
        /* renamed from: b */
        public void mo4856b(boolean z) {
            C1568g.this.m6632p();
            C1568g.this.m6623l();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC2223e interfaceC2223e;
            InterfaceC2139D interfaceC2139D;
            if (C1568g.this.f5939y != null) {
                if (C1568g.this.f5917c == view) {
                    C1568g.this.m6613g();
                    return;
                }
                if (C1568g.this.f5916b == view) {
                    C1568g.this.m6616h();
                    return;
                }
                if (C1568g.this.f5920f == view) {
                    C1568g.this.m6608d();
                    return;
                }
                if (C1568g.this.f5921g == view) {
                    C1568g.this.m6620j();
                    return;
                }
                boolean z = true;
                if (C1568g.this.f5918d == view) {
                    if (C1568g.this.f5939y.mo8526k() == 1) {
                        if (C1568g.this.f5900B != null) {
                            C1568g.this.f5900B.m8510a();
                        }
                    } else if (C1568g.this.f5939y.mo8526k() == 4) {
                        C1568g.this.f5940z.mo9114a(C1568g.this.f5939y, C1568g.this.f5939y.mo8522g(), -9223372036854775807L);
                    }
                    interfaceC2223e = C1568g.this.f5940z;
                    interfaceC2139D = C1568g.this.f5939y;
                } else {
                    if (C1568g.this.f5919e != view) {
                        if (C1568g.this.f5922h == view) {
                            C1568g.this.f5940z.mo9113a(C1568g.this.f5939y, C2648y.m11259a(C1568g.this.f5939y.mo8529n(), C1568g.this.f5908J));
                            return;
                        } else {
                            if (C1568g.this.f5923i == view) {
                                C1568g.this.f5940z.mo9115a(C1568g.this.f5939y, true ^ C1568g.this.f5939y.mo8532q());
                                return;
                            }
                            return;
                        }
                    }
                    interfaceC2223e = C1568g.this.f5940z;
                    interfaceC2139D = C1568g.this.f5939y;
                    z = false;
                }
                interfaceC2223e.mo9116b(interfaceC2139D, z);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m6651a(int i);
    }

    static {
        C2674q.m11418a("goog.exo.ui");
    }

    public C1568g(Context context) {
        this(context, null);
    }

    public C1568g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1568g(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public C1568g(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C1571j.exo_player_control_view;
        this.f5905G = 5000;
        this.f5906H = 15000;
        this.f5907I = 5000;
        this.f5908J = 0;
        this.f5910L = -9223372036854775807L;
        this.f5909K = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1573l.PlayerControlView, 0, 0);
            try {
                this.f5905G = obtainStyledAttributes.getInt(C1573l.PlayerControlView_rewind_increment, this.f5905G);
                this.f5906H = obtainStyledAttributes.getInt(C1573l.PlayerControlView_fastforward_increment, this.f5906H);
                this.f5907I = obtainStyledAttributes.getInt(C1573l.PlayerControlView_show_timeout, this.f5907I);
                i2 = obtainStyledAttributes.getResourceId(C1573l.PlayerControlView_controller_layout_id, i2);
                this.f5908J = m6595a(obtainStyledAttributes, this.f5908J);
                this.f5909K = obtainStyledAttributes.getBoolean(C1573l.PlayerControlView_show_shuffle_button, this.f5909K);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f5929o = new AbstractC2151P.a();
        this.f5930p = new AbstractC2151P.b();
        this.f5927m = new StringBuilder();
        this.f5928n = new Formatter(this.f5927m, Locale.getDefault());
        this.f5911M = new long[0];
        this.f5912N = new boolean[0];
        this.f5913O = new long[0];
        this.f5914P = new boolean[0];
        this.f5915a = new a();
        this.f5940z = new C2226f();
        this.f5931q = new Runnable() { // from class: com.google.android.exoplayer2.ui.c
            @Override // java.lang.Runnable
            public final void run() {
                C1568g.this.m6628n();
            }
        };
        this.f5932r = new Runnable() { // from class: com.google.android.exoplayer2.ui.a
            @Override // java.lang.Runnable
            public final void run() {
                C1568g.this.m6644a();
            }
        };
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        this.f5924j = (TextView) findViewById(C1570i.exo_duration);
        this.f5925k = (TextView) findViewById(C1570i.exo_position);
        this.f5926l = (InterfaceC1575n) findViewById(C1570i.exo_progress);
        InterfaceC1575n interfaceC1575n = this.f5926l;
        if (interfaceC1575n != null) {
            interfaceC1575n.mo6569a(this.f5915a);
        }
        this.f5918d = findViewById(C1570i.exo_play);
        View view = this.f5918d;
        if (view != null) {
            view.setOnClickListener(this.f5915a);
        }
        this.f5919e = findViewById(C1570i.exo_pause);
        View view2 = this.f5919e;
        if (view2 != null) {
            view2.setOnClickListener(this.f5915a);
        }
        this.f5916b = findViewById(C1570i.exo_prev);
        View view3 = this.f5916b;
        if (view3 != null) {
            view3.setOnClickListener(this.f5915a);
        }
        this.f5917c = findViewById(C1570i.exo_next);
        View view4 = this.f5917c;
        if (view4 != null) {
            view4.setOnClickListener(this.f5915a);
        }
        this.f5921g = findViewById(C1570i.exo_rew);
        View view5 = this.f5921g;
        if (view5 != null) {
            view5.setOnClickListener(this.f5915a);
        }
        this.f5920f = findViewById(C1570i.exo_ffwd);
        View view6 = this.f5920f;
        if (view6 != null) {
            view6.setOnClickListener(this.f5915a);
        }
        this.f5922h = (ImageView) findViewById(C1570i.exo_repeat_toggle);
        ImageView imageView = this.f5922h;
        if (imageView != null) {
            imageView.setOnClickListener(this.f5915a);
        }
        this.f5923i = findViewById(C1570i.exo_shuffle);
        View view7 = this.f5923i;
        if (view7 != null) {
            view7.setOnClickListener(this.f5915a);
        }
        Resources resources = context.getResources();
        this.f5933s = resources.getDrawable(C1569h.exo_controls_repeat_off);
        this.f5934t = resources.getDrawable(C1569h.exo_controls_repeat_one);
        this.f5935u = resources.getDrawable(C1569h.exo_controls_repeat_all);
        this.f5936v = resources.getString(C1572k.exo_controls_repeat_off_description);
        this.f5937w = resources.getString(C1572k.exo_controls_repeat_one_description);
        this.f5938x = resources.getString(C1572k.exo_controls_repeat_all_description);
    }

    /* renamed from: a */
    private static int m6595a(TypedArray typedArray, int i) {
        return typedArray.getInt(C1573l.PlayerControlView_repeat_toggle_modes, i);
    }

    /* renamed from: a */
    private void m6596a(int i, long j) {
        if (this.f5940z.mo9114a(this.f5939y, i, j)) {
            return;
        }
        m6628n();
    }

    /* renamed from: a */
    private void m6597a(long j) {
        m6596a(this.f5939y.mo8522g(), j);
    }

    /* renamed from: a */
    private void m6600a(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.3f);
        view.setVisibility(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private static boolean m6601a(int i) {
        return i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: a */
    private static boolean m6603a(AbstractC2151P abstractC2151P, AbstractC2151P.b bVar) {
        if (abstractC2151P.mo8641b() > 100) {
            return false;
        }
        int mo8641b = abstractC2151P.mo8641b();
        for (int i = 0; i < mo8641b; i++) {
            if (abstractC2151P.m8649a(i, bVar).f7714i == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6604b(long j) {
        int mo8522g;
        AbstractC2151P mo8530o = this.f5939y.mo8530o();
        if (this.f5903E && !mo8530o.m8654c()) {
            int mo8641b = mo8530o.mo8641b();
            mo8522g = 0;
            while (true) {
                long m8674c = mo8530o.m8649a(mo8522g, this.f5930p).m8674c();
                if (j < m8674c) {
                    break;
                }
                if (mo8522g == mo8641b - 1) {
                    j = m8674c;
                    break;
                } else {
                    j -= m8674c;
                    mo8522g++;
                }
            }
        } else {
            mo8522g = this.f5939y.mo8522g();
        }
        m6596a(mo8522g, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6608d() {
        if (this.f5906H <= 0) {
            return;
        }
        long duration = this.f5939y.getDuration();
        long currentPosition = this.f5939y.getCurrentPosition() + this.f5906H;
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        m6597a(currentPosition);
    }

    /* renamed from: e */
    private void m6609e() {
        removeCallbacks(this.f5932r);
        if (this.f5907I <= 0) {
            this.f5910L = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = this.f5907I;
        this.f5910L = uptimeMillis + i;
        if (this.f5901C) {
            postDelayed(this.f5932r, i);
        }
    }

    /* renamed from: f */
    private boolean m6612f() {
        InterfaceC2139D interfaceC2139D = this.f5939y;
        return (interfaceC2139D == null || interfaceC2139D.mo8526k() == 4 || this.f5939y.mo8526k() == 1 || !this.f5939y.mo8520e()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m6613g() {
        AbstractC2151P mo8530o = this.f5939y.mo8530o();
        if (mo8530o.m8654c() || this.f5939y.mo8518c()) {
            return;
        }
        int mo8522g = this.f5939y.mo8522g();
        int mo8528m = this.f5939y.mo8528m();
        if (mo8528m != -1) {
            m6596a(mo8528m, -9223372036854775807L);
        } else if (mo8530o.m8649a(mo8522g, this.f5930p).f7710e) {
            m6596a(mo8522g, -9223372036854775807L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:            if (r1.f7709d == false) goto L15;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m6616h() {
        /*
            r6 = this;
            d.c.a.a.D r0 = r6.f5939y
            d.c.a.a.P r0 = r0.mo8530o()
            boolean r1 = r0.m8654c()
            if (r1 != 0) goto L4d
            d.c.a.a.D r1 = r6.f5939y
            boolean r1 = r1.mo8518c()
            if (r1 == 0) goto L15
            goto L4d
        L15:
            d.c.a.a.D r1 = r6.f5939y
            int r1 = r1.mo8522g()
            d.c.a.a.P$b r2 = r6.f5930p
            r0.m8649a(r1, r2)
            d.c.a.a.D r0 = r6.f5939y
            int r0 = r0.mo8524i()
            r1 = -1
            if (r0 == r1) goto L48
            d.c.a.a.D r1 = r6.f5939y
            long r1 = r1.getCurrentPosition()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3f
            d.c.a.a.P$b r1 = r6.f5930p
            boolean r2 = r1.f7710e
            if (r2 == 0) goto L48
            boolean r1 = r1.f7709d
            if (r1 != 0) goto L48
        L3f:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.m6596a(r0, r1)
            goto L4d
        L48:
            r0 = 0
            r6.m6597a(r0)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.C1568g.m6616h():void");
    }

    /* renamed from: i */
    private void m6617i() {
        View view;
        View view2;
        boolean m6612f = m6612f();
        if (!m6612f && (view2 = this.f5918d) != null) {
            view2.requestFocus();
        } else {
            if (!m6612f || (view = this.f5919e) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m6620j() {
        if (this.f5905G <= 0) {
            return;
        }
        m6597a(Math.max(this.f5939y.getCurrentPosition() - this.f5905G, 0L));
    }

    /* renamed from: k */
    private void m6622k() {
        m6626m();
        m6623l();
        m6630o();
        m6632p();
        m6628n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m6623l() {
        /*
            r6 = this;
            boolean r0 = r6.m6646b()
            if (r0 == 0) goto L8d
            boolean r0 = r6.f5901C
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            d.c.a.a.D r0 = r6.f5939y
            if (r0 == 0) goto L15
            d.c.a.a.P r0 = r0.mo8530o()
            goto L16
        L15:
            r0 = 0
        L16:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            boolean r3 = r0.m8654c()
            if (r3 != 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L5e
            d.c.a.a.D r3 = r6.f5939y
            boolean r3 = r3.mo8518c()
            if (r3 != 0) goto L5e
            d.c.a.a.D r3 = r6.f5939y
            int r3 = r3.mo8522g()
            d.c.a.a.P$b r4 = r6.f5930p
            r0.m8649a(r3, r4)
            d.c.a.a.P$b r0 = r6.f5930p
            boolean r3 = r0.f7709d
            if (r3 != 0) goto L4d
            boolean r0 = r0.f7710e
            if (r0 == 0) goto L4d
            d.c.a.a.D r0 = r6.f5939y
            boolean r0 = r0.hasPrevious()
            if (r0 == 0) goto L4b
            goto L4d
        L4b:
            r0 = 0
            goto L4e
        L4d:
            r0 = 1
        L4e:
            d.c.a.a.P$b r4 = r6.f5930p
            boolean r4 = r4.f7710e
            if (r4 != 0) goto L5c
            d.c.a.a.D r4 = r6.f5939y
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L60
        L5c:
            r4 = 1
            goto L61
        L5e:
            r0 = 0
            r3 = 0
        L60:
            r4 = 0
        L61:
            android.view.View r5 = r6.f5916b
            r6.m6600a(r0, r5)
            android.view.View r0 = r6.f5917c
            r6.m6600a(r4, r0)
            int r0 = r6.f5906H
            if (r0 <= 0) goto L73
            if (r3 == 0) goto L73
            r0 = 1
            goto L74
        L73:
            r0 = 0
        L74:
            android.view.View r4 = r6.f5920f
            r6.m6600a(r0, r4)
            int r0 = r6.f5905G
            if (r0 <= 0) goto L80
            if (r3 == 0) goto L80
            goto L81
        L80:
            r1 = 0
        L81:
            android.view.View r0 = r6.f5921g
            r6.m6600a(r1, r0)
            com.google.android.exoplayer2.ui.n r0 = r6.f5926l
            if (r0 == 0) goto L8d
            r0.setEnabled(r3)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.C1568g.m6623l():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m6626m() {
        boolean z;
        if (m6646b() && this.f5901C) {
            boolean m6612f = m6612f();
            View view = this.f5918d;
            if (view != null) {
                z = (m6612f && view.isFocused()) | false;
                this.f5918d.setVisibility(m6612f ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f5919e;
            if (view2 != null) {
                z |= !m6612f && view2.isFocused();
                this.f5919e.setVisibility(m6612f ? 0 : 8);
            }
            if (z) {
                m6617i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m6628n() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        AbstractC2151P.b bVar;
        int i2;
        if (m6646b() && this.f5901C) {
            InterfaceC2139D interfaceC2139D = this.f5939y;
            long j5 = 0;
            boolean z = true;
            if (interfaceC2139D != null) {
                AbstractC2151P mo8530o = interfaceC2139D.mo8530o();
                if (mo8530o.m8654c()) {
                    j3 = 0;
                    j4 = 0;
                    i = 0;
                } else {
                    int mo8522g = this.f5939y.mo8522g();
                    int i3 = this.f5903E ? 0 : mo8522g;
                    int mo8641b = this.f5903E ? mo8530o.mo8641b() - 1 : mo8522g;
                    j3 = 0;
                    j4 = 0;
                    i = 0;
                    while (true) {
                        if (i3 > mo8641b) {
                            break;
                        }
                        if (i3 == mo8522g) {
                            j4 = C2200d.m9048b(j3);
                        }
                        mo8530o.m8649a(i3, this.f5930p);
                        AbstractC2151P.b bVar2 = this.f5930p;
                        int i4 = i3;
                        if (bVar2.f7714i == -9223372036854775807L) {
                            C2628e.m11113b(this.f5903E ^ z);
                            break;
                        }
                        int i5 = bVar2.f7711f;
                        while (true) {
                            bVar = this.f5930p;
                            if (i5 <= bVar.f7712g) {
                                mo8530o.m8647a(i5, this.f5929o);
                                int m8655a = this.f5929o.m8655a();
                                int i6 = i;
                                int i7 = 0;
                                while (i7 < m8655a) {
                                    long m8664b = this.f5929o.m8664b(i7);
                                    if (m8664b == Long.MIN_VALUE) {
                                        i2 = mo8522g;
                                        long j6 = this.f5929o.f7703d;
                                        if (j6 == -9223372036854775807L) {
                                            i7++;
                                            mo8522g = i2;
                                        } else {
                                            m8664b = j6;
                                        }
                                    } else {
                                        i2 = mo8522g;
                                    }
                                    long m8670e = m8664b + this.f5929o.m8670e();
                                    if (m8670e >= 0 && m8670e <= this.f5930p.f7714i) {
                                        long[] jArr = this.f5911M;
                                        if (i6 == jArr.length) {
                                            int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                            this.f5911M = Arrays.copyOf(this.f5911M, length);
                                            this.f5912N = Arrays.copyOf(this.f5912N, length);
                                        }
                                        this.f5911M[i6] = C2200d.m9048b(j3 + m8670e);
                                        this.f5912N[i6] = this.f5929o.m8669d(i7);
                                        i6++;
                                    }
                                    i7++;
                                    mo8522g = i2;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        j3 += bVar.f7714i;
                        i3 = i4 + 1;
                        mo8522g = mo8522g;
                        z = true;
                    }
                }
                j5 = C2200d.m9048b(j3);
                j = this.f5939y.mo8523h() + j4;
                j2 = this.f5939y.mo8533r() + j4;
                if (this.f5926l != null) {
                    int length2 = this.f5913O.length;
                    int i8 = i + length2;
                    long[] jArr2 = this.f5911M;
                    if (i8 > jArr2.length) {
                        this.f5911M = Arrays.copyOf(jArr2, i8);
                        this.f5912N = Arrays.copyOf(this.f5912N, i8);
                    }
                    System.arraycopy(this.f5913O, 0, this.f5911M, i, length2);
                    System.arraycopy(this.f5914P, 0, this.f5912N, i, length2);
                    this.f5926l.mo6570a(this.f5911M, this.f5912N, i8);
                }
            } else {
                j = 0;
                j2 = 0;
            }
            TextView textView = this.f5924j;
            if (textView != null) {
                textView.setText(C2622I.m11055a(this.f5927m, this.f5928n, j5));
            }
            TextView textView2 = this.f5925k;
            if (textView2 != null && !this.f5904F) {
                textView2.setText(C2622I.m11055a(this.f5927m, this.f5928n, j));
            }
            InterfaceC1575n interfaceC1575n = this.f5926l;
            if (interfaceC1575n != null) {
                interfaceC1575n.setPosition(j);
                this.f5926l.setBufferedPosition(j2);
                this.f5926l.setDuration(j5);
            }
            removeCallbacks(this.f5931q);
            InterfaceC2139D interfaceC2139D2 = this.f5939y;
            int mo8526k = interfaceC2139D2 == null ? 1 : interfaceC2139D2.mo8526k();
            if (mo8526k == 1 || mo8526k == 4) {
                return;
            }
            long j7 = 1000;
            if (this.f5939y.mo8520e() && mo8526k == 3) {
                float f = this.f5939y.mo8515b().f7642b;
                if (f > 0.1f) {
                    if (f <= 5.0f) {
                        long max = 1000 / Math.max(1, Math.round(1.0f / f));
                        long j8 = max - (j % max);
                        if (j8 < max / 5) {
                            j8 += max;
                        }
                        if (f != 1.0f) {
                            j8 = ((float) j8) / f;
                        }
                        j7 = j8;
                    } else {
                        j7 = 200;
                    }
                }
            }
            postDelayed(this.f5931q, j7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m6630o() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (m6646b() && this.f5901C && (imageView = this.f5922h) != null) {
            if (this.f5908J == 0) {
                imageView.setVisibility(8);
                return;
            }
            if (this.f5939y == null) {
                m6600a(false, (View) imageView);
                return;
            }
            m6600a(true, (View) imageView);
            int mo8529n = this.f5939y.mo8529n();
            if (mo8529n == 0) {
                this.f5922h.setImageDrawable(this.f5933s);
                imageView2 = this.f5922h;
                str = this.f5936v;
            } else {
                if (mo8529n != 1) {
                    if (mo8529n == 2) {
                        this.f5922h.setImageDrawable(this.f5935u);
                        imageView2 = this.f5922h;
                        str = this.f5938x;
                    }
                    this.f5922h.setVisibility(0);
                }
                this.f5922h.setImageDrawable(this.f5934t);
                imageView2 = this.f5922h;
                str = this.f5937w;
            }
            imageView2.setContentDescription(str);
            this.f5922h.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m6632p() {
        View view;
        if (m6646b() && this.f5901C && (view = this.f5923i) != null) {
            if (!this.f5909K) {
                view.setVisibility(8);
                return;
            }
            InterfaceC2139D interfaceC2139D = this.f5939y;
            if (interfaceC2139D == null) {
                m6600a(false, view);
                return;
            }
            view.setAlpha(interfaceC2139D.mo8532q() ? 1.0f : 0.3f);
            this.f5923i.setEnabled(true);
            this.f5923i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m6634q() {
        InterfaceC2139D interfaceC2139D = this.f5939y;
        if (interfaceC2139D == null) {
            return;
        }
        this.f5903E = this.f5902D && m6603a(interfaceC2139D.mo8530o(), this.f5930p);
    }

    /* renamed from: a */
    public void m6644a() {
        if (m6646b()) {
            setVisibility(8);
            b bVar = this.f5899A;
            if (bVar != null) {
                bVar.m6651a(getVisibility());
            }
            removeCallbacks(this.f5931q);
            removeCallbacks(this.f5932r);
            this.f5910L = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public boolean m6645a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f5939y == null || !m6601a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                m6608d();
            } else if (keyCode == 89) {
                m6620j();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    this.f5940z.mo9116b(this.f5939y, !r0.mo8520e());
                } else if (keyCode == 87) {
                    m6613g();
                } else if (keyCode == 88) {
                    m6616h();
                } else if (keyCode == 126) {
                    this.f5940z.mo9116b(this.f5939y, true);
                } else if (keyCode == 127) {
                    this.f5940z.mo9116b(this.f5939y, false);
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m6646b() {
        return getVisibility() == 0;
    }

    /* renamed from: c */
    public void m6647c() {
        if (!m6646b()) {
            setVisibility(0);
            b bVar = this.f5899A;
            if (bVar != null) {
                bVar.m6651a(getVisibility());
            }
            m6622k();
            m6617i();
        }
        m6609e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m6645a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f5932r);
        } else if (motionEvent.getAction() == 1) {
            m6609e();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InterfaceC2139D getPlayer() {
        return this.f5939y;
    }

    public int getRepeatToggleModes() {
        return this.f5908J;
    }

    public boolean getShowShuffleButton() {
        return this.f5909K;
    }

    public int getShowTimeoutMs() {
        return this.f5907I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5901C = true;
        long j = this.f5910L;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                m6644a();
            } else {
                postDelayed(this.f5932r, uptimeMillis);
            }
        } else if (m6646b()) {
            m6609e();
        }
        m6622k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5901C = false;
        removeCallbacks(this.f5931q);
        removeCallbacks(this.f5932r);
    }

    public void setControlDispatcher(InterfaceC2223e interfaceC2223e) {
        if (interfaceC2223e == null) {
            interfaceC2223e = new C2226f();
        }
        this.f5940z = interfaceC2223e;
    }

    public void setFastForwardIncrementMs(int i) {
        this.f5906H = i;
        m6623l();
    }

    public void setPlaybackPreparer(InterfaceC2138C interfaceC2138C) {
        this.f5900B = interfaceC2138C;
    }

    public void setPlayer(InterfaceC2139D interfaceC2139D) {
        boolean z = true;
        C2628e.m11113b(Looper.myLooper() == Looper.getMainLooper());
        if (interfaceC2139D != null && interfaceC2139D.mo8531p() != Looper.getMainLooper()) {
            z = false;
        }
        C2628e.m11111a(z);
        InterfaceC2139D interfaceC2139D2 = this.f5939y;
        if (interfaceC2139D2 == interfaceC2139D) {
            return;
        }
        if (interfaceC2139D2 != null) {
            interfaceC2139D2.mo8516b(this.f5915a);
        }
        this.f5939y = interfaceC2139D;
        if (interfaceC2139D != null) {
            interfaceC2139D.mo8513a(this.f5915a);
        }
        m6622k();
    }

    public void setRepeatToggleModes(int i) {
        int i2;
        InterfaceC2223e interfaceC2223e;
        InterfaceC2139D interfaceC2139D;
        this.f5908J = i;
        InterfaceC2139D interfaceC2139D2 = this.f5939y;
        if (interfaceC2139D2 != null) {
            int mo8529n = interfaceC2139D2.mo8529n();
            if (i != 0 || mo8529n == 0) {
                i2 = 2;
                if (i == 1 && mo8529n == 2) {
                    this.f5940z.mo9113a(this.f5939y, 1);
                } else if (i == 2 && mo8529n == 1) {
                    interfaceC2223e = this.f5940z;
                    interfaceC2139D = this.f5939y;
                }
            } else {
                interfaceC2223e = this.f5940z;
                interfaceC2139D = this.f5939y;
                i2 = 0;
            }
            interfaceC2223e.mo9113a(interfaceC2139D, i2);
        }
        m6630o();
    }

    public void setRewindIncrementMs(int i) {
        this.f5905G = i;
        m6623l();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f5902D = z;
        m6634q();
    }

    public void setShowShuffleButton(boolean z) {
        this.f5909K = z;
        m6632p();
    }

    public void setShowTimeoutMs(int i) {
        this.f5907I = i;
        if (m6646b()) {
            m6609e();
        }
    }

    public void setVisibilityListener(b bVar) {
        this.f5899A = bVar;
    }
}
