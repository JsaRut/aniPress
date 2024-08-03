package com.brentvatne.exoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1278N;
import com.google.android.exoplayer2.p135ui.C1568g;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import p139d.p140a.p141a.C1637a;
import p139d.p140a.p142b.C1640a;
import p139d.p140a.p142b.InterfaceC1642c;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.C2149N;
import p139d.p225c.p226a.p227a.C2399j;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.InterfaceC2139D;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p234f.C2255e;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.C2396h;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2395g;
import p139d.p225c.p226a.p227a.p250j.C2409J;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.C2504n;
import p139d.p225c.p226a.p227a.p250j.C2513w;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.p253c.C2454g;
import p139d.p225c.p226a.p227a.p250j.p253c.C2457j;
import p139d.p225c.p226a.p227a.p250j.p255d.C2481l;
import p139d.p225c.p226a.p227a.p250j.p257e.C2492b;
import p139d.p225c.p226a.p227a.p250j.p257e.C2495e;
import p139d.p225c.p226a.p227a.p268l.AbstractC2575i;
import p139d.p225c.p226a.p227a.p268l.C2571e;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p269m.C2603q;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.brentvatne.exoplayer.i */
/* loaded from: classes.dex */
public class C0982i extends FrameLayout implements LifecycleEventListener, InterfaceC2517k.a, InterfaceC2592f.a, InterfaceC1642c, AudioManager.OnAudioFocusChangeListener, C2396h.a {

    /* renamed from: a */
    private static final C2603q f4067a = new C2603q();

    /* renamed from: b */
    private static final CookieManager f4068b = new CookieManager();

    /* renamed from: A */
    private int f4069A;

    /* renamed from: B */
    private int f4070B;

    /* renamed from: C */
    private Uri f4071C;

    /* renamed from: D */
    private String f4072D;

    /* renamed from: E */
    private boolean f4073E;

    /* renamed from: F */
    private String f4074F;

    /* renamed from: G */
    private Dynamic f4075G;

    /* renamed from: H */
    private String f4076H;

    /* renamed from: I */
    private Dynamic f4077I;

    /* renamed from: J */
    private String f4078J;

    /* renamed from: K */
    private Dynamic f4079K;

    /* renamed from: L */
    private ReadableArray f4080L;

    /* renamed from: M */
    private boolean f4081M;

    /* renamed from: N */
    private float f4082N;

    /* renamed from: O */
    private boolean f4083O;

    /* renamed from: P */
    private Map<String, String> f4084P;

    /* renamed from: Q */
    private boolean f4085Q;

    /* renamed from: R */
    private boolean f4086R;

    /* renamed from: S */
    private final C1278N f4087S;

    /* renamed from: T */
    private final AudioManager f4088T;

    /* renamed from: U */
    private final C1640a f4089U;

    /* renamed from: V */
    private final Handler f4090V;

    /* renamed from: c */
    private final C0984k f4091c;

    /* renamed from: d */
    private C1568g f4092d;

    /* renamed from: e */
    private View f4093e;

    /* renamed from: f */
    private InterfaceC2139D.b f4094f;

    /* renamed from: g */
    private Handler f4095g;

    /* renamed from: h */
    private C0977d f4096h;

    /* renamed from: i */
    private InterfaceC2597k.a f4097i;

    /* renamed from: j */
    private C2149N f4098j;

    /* renamed from: k */
    private C2571e f4099k;

    /* renamed from: l */
    private boolean f4100l;

    /* renamed from: m */
    private int f4101m;

    /* renamed from: n */
    private long f4102n;

    /* renamed from: o */
    private boolean f4103o;

    /* renamed from: p */
    private boolean f4104p;

    /* renamed from: q */
    private boolean f4105q;

    /* renamed from: r */
    private boolean f4106r;

    /* renamed from: s */
    private boolean f4107s;

    /* renamed from: t */
    private float f4108t;

    /* renamed from: u */
    private float f4109u;

    /* renamed from: v */
    private int f4110v;

    /* renamed from: w */
    private int f4111w;

    /* renamed from: x */
    private long f4112x;

    /* renamed from: y */
    private int f4113y;

    /* renamed from: z */
    private int f4114z;

    static {
        f4068b.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public C0982i(C1278N c1278n) {
        super(c1278n);
        this.f4108t = 1.0f;
        this.f4109u = 1.0f;
        this.f4110v = 3;
        this.f4111w = 0;
        this.f4112x = -9223372036854775807L;
        this.f4113y = 15000;
        this.f4114z = 50000;
        this.f4069A = 2500;
        this.f4070B = 5000;
        this.f4082N = 250.0f;
        this.f4083O = false;
        this.f4085Q = false;
        this.f4090V = new HandlerC0978e(this);
        this.f4087S = c1278n;
        this.f4091c = new C0984k(c1278n);
        m4882i();
        this.f4088T = (AudioManager) c1278n.getSystemService("audio");
        this.f4087S.addLifecycleEventListener(this);
        this.f4089U = new C1640a(this.f4087S);
        m4892m();
    }

    /* renamed from: a */
    private int m4857a(C2413N c2413n) {
        if (c2413n.f9485b == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i = 0; i < c2413n.f9485b; i++) {
            String str = c2413n.m9978a(i).m9976a(0).f11201z;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private InterfaceC2515y m4861a(String str, Uri uri, String str2, String str3) {
        return new C2409J(uri, this.f4097i, C2676s.m11419a(str, str2, -1, str3), -9223372036854775807L);
    }

    /* renamed from: a */
    public void m4863a(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: b */
    public InterfaceC2515y m4867b(Uri uri, String str) {
        String lastPathSegment;
        if (TextUtils.isEmpty(str)) {
            lastPathSegment = uri.getLastPathSegment();
        } else {
            lastPathSegment = "." + str;
        }
        int m11088d = C2622I.m11088d(lastPathSegment);
        if (m11088d == 0) {
            return new C2454g(uri, m4891m(false), new C2457j.a(this.f4097i), this.f4110v, 30000L, this.f4095g, null);
        }
        if (m11088d == 1) {
            return new C2495e(uri, m4891m(false), new C2492b.a(this.f4097i), this.f4110v, 30000L, this.f4095g, null);
        }
        if (m11088d == 2) {
            return new C2481l(uri, this.f4097i, this.f4110v, this.f4095g, null);
        }
        if (m11088d == 3) {
            return new C2513w(uri, this.f4097i, new C2255e(), this.f4095g, null);
        }
        throw new IllegalStateException("Unsupported type: " + m11088d);
    }

    /* renamed from: b */
    private static boolean m4869b(C2399j c2399j) {
        if (c2399j.f9380a != 0) {
            return false;
        }
        for (Throwable m9873c = c2399j.m9873c(); m9873c != null; m9873c = m9873c.getCause()) {
            if (m9873c instanceof C2504n) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m4875e() {
        if (this.f4098j == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f4092d.setLayoutParams(layoutParams);
        int indexOfChild = indexOfChild(this.f4092d);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
        }
        addView(this.f4092d, 1, layoutParams);
    }

    /* renamed from: f */
    public void m4877f() {
        m4946j(this.f4073E);
    }

    /* renamed from: g */
    public ArrayList<InterfaceC2515y> m4879g() {
        ArrayList<InterfaceC2515y> arrayList = new ArrayList<>();
        if (this.f4080L == null) {
            return arrayList;
        }
        for (int i = 0; i < this.f4080L.size(); i++) {
            ReadableMap map = this.f4080L.getMap(i);
            String string = map.getString("language");
            InterfaceC2515y m4861a = m4861a(map.hasKey("title") ? map.getString("title") : string + " " + i, Uri.parse(map.getString("uri")), map.getString("type"), string);
            if (m4861a != null) {
                arrayList.add(m4861a);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m4881h() {
        this.f4101m = -1;
        this.f4102n = -9223372036854775807L;
    }

    /* renamed from: i */
    private void m4882i() {
        m4881h();
        this.f4097i = m4891m(true);
        this.f4095g = new Handler();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f4068b;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f4096h = new C0977d(getContext());
        this.f4096h.setLayoutParams(layoutParams);
        addView(this.f4096h, 0, layoutParams);
    }

    /* renamed from: j */
    private WritableArray m4884j() {
        WritableArray createArray = Arguments.createArray();
        AbstractC2575i.a m10878c = this.f4099k.m10878c();
        int m4932c = m4932c(1);
        if (m10878c != null && m4932c != -1) {
            C2413N m10884b = m10878c.m10884b(m4932c);
            for (int i = 0; i < m10884b.f9485b; i++) {
                C2676s m9976a = m10884b.m9978a(i).m9976a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                String str = m9976a.f11176a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                createMap.putString("title", str);
                createMap.putString("type", m9976a.f11182g);
                String str3 = m9976a.f11201z;
                if (str3 == null) {
                    str3 = "";
                }
                createMap.putString("language", str3);
                int i2 = m9976a.f11178c;
                if (i2 != -1) {
                    str2 = String.format(Locale.US, "%.2fMbps", Float.valueOf(i2 / 1000000.0f));
                }
                createMap.putString("bitrate", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    /* renamed from: k */
    private WritableArray m4887k() {
        WritableArray createArray = Arguments.createArray();
        AbstractC2575i.a m10878c = this.f4099k.m10878c();
        int m4932c = m4932c(3);
        if (m10878c != null && m4932c != -1) {
            C2413N m10884b = m10878c.m10884b(m4932c);
            for (int i = 0; i < m10884b.f9485b; i++) {
                C2676s m9976a = m10884b.m9978a(i).m9976a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                String str = m9976a.f11176a;
                if (str == null) {
                    str = "";
                }
                createMap.putString("title", str);
                createMap.putString("type", m9976a.f11182g);
                String str2 = m9976a.f11201z;
                if (str2 == null) {
                    str2 = "";
                }
                createMap.putString("language", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    /* renamed from: l */
    private WritableArray m4889l() {
        WritableArray createArray = Arguments.createArray();
        AbstractC2575i.a m10878c = this.f4099k.m10878c();
        int m4932c = m4932c(2);
        if (m10878c != null && m4932c != -1) {
            C2413N m10884b = m10878c.m10884b(m4932c);
            for (int i = 0; i < m10884b.f9485b; i++) {
                C2411L m9978a = m10884b.m9978a(i);
                for (int i2 = 0; i2 < m9978a.f9481a; i2++) {
                    C2676s m9976a = m9978a.m9976a(i2);
                    WritableMap createMap = Arguments.createMap();
                    int i3 = m9976a.f11187l;
                    if (i3 == -1) {
                        i3 = 0;
                    }
                    createMap.putInt("width", i3);
                    int i4 = m9976a.f11188m;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    createMap.putInt("height", i4);
                    int i5 = m9976a.f11178c;
                    if (i5 == -1) {
                        i5 = 0;
                    }
                    createMap.putInt("bitrate", i5);
                    String str = m9976a.f11179d;
                    if (str == null) {
                        str = "";
                    }
                    createMap.putString("codecs", str);
                    String str2 = m9976a.f11176a;
                    if (str2 == null) {
                        str2 = String.valueOf(i2);
                    }
                    createMap.putString("trackId", str2);
                    createArray.pushMap(createMap);
                }
            }
        }
        return createArray;
    }

    /* renamed from: m */
    private InterfaceC2597k.a m4891m(boolean z) {
        return C0975b.m4830a(this.f4087S, z ? f4067a : null, this.f4084P);
    }

    /* renamed from: m */
    private void m4892m() {
        new Handler().postDelayed(new RunnableC0981h(this, this), 1L);
    }

    /* renamed from: n */
    public void m4894n() {
        if (this.f4092d == null) {
            this.f4092d = new C1568g(getContext());
        }
        this.f4092d.setPlayer(this.f4098j);
        this.f4092d.m6647c();
        this.f4093e = this.f4092d.findViewById(C1637a.exo_play_pause_container);
        this.f4096h.setOnClickListener(new ViewOnClickListenerC0979f(this));
        this.f4094f = new C0980g(this);
        this.f4098j.mo8513a(this.f4094f);
    }

    /* renamed from: n */
    private void m4895n(boolean z) {
        C0984k c0984k;
        boolean z2;
        if (this.f4107s == z) {
            return;
        }
        this.f4107s = z;
        if (z) {
            c0984k = this.f4091c;
            z2 = true;
        } else {
            c0984k = this.f4091c;
            z2 = false;
        }
        c0984k.m4962b(z2);
    }

    /* renamed from: o */
    private void m4897o() {
        if (this.f4104p) {
            m4940e(false);
        }
        setKeepScreenOn(false);
        this.f4088T.abandonAudioFocus(this);
    }

    /* renamed from: o */
    public void m4898o(boolean z) {
        C2149N c2149n = this.f4098j;
        if (c2149n == null) {
            return;
        }
        if (!z) {
            c2149n.mo8517b(false);
        } else if (m4905s()) {
            this.f4098j.mo8517b(true);
        }
    }

    /* renamed from: p */
    private void m4900p() {
        C2149N c2149n = this.f4098j;
        if (c2149n != null && c2149n.mo8520e()) {
            m4898o(false);
        }
        setKeepScreenOn(false);
    }

    /* renamed from: q */
    private void m4902q() {
        if (this.f4098j != null) {
            m4916x();
            this.f4098j.m8620x();
            this.f4098j.m8615b((InterfaceC2395g) null);
            this.f4099k = null;
            this.f4098j = null;
        }
        this.f4090V.removeMessages(1);
        this.f4087S.removeLifecycleEventListener(this);
        this.f4089U.m6803a();
        f4067a.mo10916a(this);
    }

    /* renamed from: r */
    private void m4903r() {
        this.f4100l = true;
        m4892m();
    }

    /* renamed from: s */
    private boolean m4905s() {
        return this.f4081M || this.f4071C == null || this.f4088T.requestAudioFocus(this, 3, 1) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:            if (r0 != 4) goto L61;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4907t() {
        /*
            r3 = this;
            d.c.a.a.N r0 = r3.f4098j
            r1 = 1
            if (r0 == 0) goto L21
            int r0 = r0.mo8526k()
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L15
            r2 = 4
            if (r0 == r2) goto L21
            goto L24
        L15:
            d.c.a.a.N r0 = r3.f4098j
            boolean r0 = r0.mo8520e()
            if (r0 != 0) goto L24
            r3.m4898o(r1)
            goto L24
        L21:
            r3.m4892m()
        L24:
            boolean r0 = r3.f4081M
            if (r0 != 0) goto L2b
            r3.setKeepScreenOn(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.C0982i.m4907t():void");
    }

    /* renamed from: u */
    private void m4909u() {
        this.f4090V.sendEmptyMessage(1);
    }

    /* renamed from: v */
    private void m4912v() {
        m4897o();
        m4902q();
    }

    /* renamed from: w */
    public void m4914w() {
        if (this.f4098j == null) {
            return;
        }
        m4863a(this.f4092d);
        if (this.f4092d.m6646b()) {
            this.f4092d.m6644a();
        } else {
            this.f4092d.m6647c();
        }
    }

    /* renamed from: x */
    private void m4916x() {
        this.f4101m = this.f4098j.mo8522g();
        this.f4102n = this.f4098j.m8760t() ? Math.max(0L, this.f4098j.getCurrentPosition()) : -9223372036854775807L;
    }

    /* renamed from: y */
    private void m4918y() {
        if (this.f4103o) {
            this.f4103o = false;
            m4928a(this.f4074F, this.f4075G);
            m4934c(this.f4076H, this.f4077I);
            m4931b(this.f4078J, this.f4079K);
            C2676s m8619w = this.f4098j.m8619w();
            this.f4091c.m4954a(this.f4098j.getDuration(), this.f4098j.getCurrentPosition(), m8619w != null ? m8619w.f11187l : 0, m8619w != null ? m8619w.f11188m : 0, m4884j(), m4887k(), m4889l());
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public void mo4843a() {
        this.f4091c.m4957a(this.f4098j.getCurrentPosition(), this.f4112x);
        this.f4112x = -9223372036854775807L;
    }

    /* renamed from: a */
    public void m4919a(float f) {
        this.f4082N = f;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public void mo4844a(int i) {
    }

    /* renamed from: a */
    public void m4920a(int i, int i2, int i3, int i4) {
        this.f4113y = i;
        this.f4114z = i2;
        this.f4069A = i3;
        this.f4070B = i4;
        m4902q();
        m4892m();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2592f.a
    /* renamed from: a */
    public void mo4921a(int i, long j, long j2) {
        if (this.f4085Q) {
            this.f4091c.m4952a(j2);
        }
    }

    /* renamed from: a */
    public void m4922a(int i, String str, Dynamic dynamic) {
        int m4932c;
        AbstractC2575i.a m10878c;
        int m4857a;
        CaptioningManager captioningManager;
        if (this.f4098j == null || (m4932c = m4932c(i)) == -1 || (m10878c = this.f4099k.m10878c()) == null) {
            return;
        }
        C2413N m10884b = m10878c.m10884b(m4932c);
        int[] iArr = {0};
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        C2571e.d m10863a = this.f4099k.m10854e().m10863a();
        m10863a.m10871a(m4932c, true);
        C2571e.c m10868a = m10863a.m10868a();
        if (str.equals("disabled")) {
            this.f4099k.m10849a(m10868a);
            return;
        }
        if (str.equals("language")) {
            m4857a = 0;
            while (m4857a < m10884b.f9485b) {
                String str2 = m10884b.m9978a(m4857a).m9976a(0).f11201z;
                if (str2 != null && str2.equals(dynamic.asString())) {
                    break;
                } else {
                    m4857a++;
                }
            }
            m4857a = -1;
        } else if (str.equals("title")) {
            m4857a = 0;
            while (m4857a < m10884b.f9485b) {
                String str3 = m10884b.m9978a(m4857a).m9976a(0).f11176a;
                if (str3 != null && str3.equals(dynamic.asString())) {
                    break;
                } else {
                    m4857a++;
                }
            }
            m4857a = -1;
        } else if (str.equals("index")) {
            if (dynamic.asInt() < m10884b.f9485b) {
                m4857a = dynamic.asInt();
            }
            m4857a = -1;
        } else if (str.equals("resolution")) {
            int asInt = dynamic.asInt();
            int i2 = -1;
            for (int i3 = 0; i3 < m10884b.f9485b; i3++) {
                C2411L m9978a = m10884b.m9978a(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= m9978a.f9481a) {
                        break;
                    }
                    if (m9978a.m9976a(i4).f11188m == asInt) {
                        iArr[0] = i4;
                        i2 = i3;
                        break;
                    }
                    i4++;
                }
            }
            m4857a = i2;
        } else {
            if (m4932c != 3 || C2622I.f10916a <= 18 ? m4932c == 1 : !((captioningManager = (CaptioningManager) this.f4087S.getSystemService("captioning")) == null || !captioningManager.isEnabled())) {
                m4857a = m4857a(m10884b);
            }
            m4857a = -1;
        }
        if (m4857a == -1 && i == 2 && m10884b.f9485b != 0) {
            C2411L m9978a2 = m10884b.m9978a(0);
            iArr = new int[m9978a2.f9481a];
            for (int i5 = 0; i5 < m9978a2.f9481a; i5++) {
                iArr[i5] = i5;
            }
            m4857a = 0;
        }
        if (m4857a == -1) {
            this.f4099k.m10849a(m10868a);
            return;
        }
        C2571e.d m10863a2 = this.f4099k.m10854e().m10863a();
        m10863a2.m10871a(m4932c, false);
        m10863a2.m10870a(m4932c, m10884b, new C2571e.e(m4857a, iArr));
        this.f4099k.m10849a(m10863a2.m10868a());
    }

    /* renamed from: a */
    public void m4923a(long j) {
        C2149N c2149n = this.f4098j;
        if (c2149n != null) {
            this.f4112x = j;
            c2149n.m8758a(j);
        }
    }

    /* renamed from: a */
    public void m4924a(Uri uri, String str) {
        if (uri != null) {
            boolean z = this.f4071C == null;
            boolean equals = uri.equals(this.f4071C);
            this.f4071C = uri;
            this.f4072D = str;
            this.f4097i = m4891m(true);
            if (z || equals) {
                return;
            }
            m4903r();
        }
    }

    /* renamed from: a */
    public void m4925a(Uri uri, String str, Map<String, String> map) {
        if (uri != null) {
            boolean z = this.f4071C == null;
            boolean equals = uri.equals(this.f4071C);
            this.f4071C = uri;
            this.f4072D = str;
            this.f4084P = map;
            this.f4097i = C0975b.m4830a(this.f4087S, f4067a, this.f4084P);
            if (z || equals) {
                return;
            }
            m4903r();
        }
    }

    /* renamed from: a */
    public void m4926a(ReadableArray readableArray) {
        this.f4080L = readableArray;
        m4903r();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public void mo4847a(C2137B c2137b) {
        this.f4091c.m4955a(c2137b.f7642b);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public void mo4848a(AbstractC2151P abstractC2151P, Object obj, int i) {
    }

    @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2395g
    /* renamed from: a */
    public void mo4927a(C2353b c2353b) {
        this.f4091c.m4958a(c2353b);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public void mo4849a(C2413N c2413n, C2578l c2578l) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4850a(p139d.p225c.p226a.p227a.C2399j r7) {
        /*
            r6 = this;
            int r0 = r7.f9380a
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L58
            java.lang.Exception r0 = r7.m9872b()
            boolean r3 = r0 instanceof p139d.p225c.p226a.p227a.p244g.AbstractC2340b.a
            if (r3 == 0) goto L69
            d.c.a.a.g.b$a r0 = (p139d.p225c.p226a.p227a.p244g.AbstractC2340b.a) r0
            java.lang.String r2 = r0.f9249c
            r3 = 0
            if (r2 != 0) goto L46
            java.lang.Throwable r2 = r0.getCause()
            boolean r2 = r2 instanceof p139d.p225c.p226a.p227a.p244g.C2345g.b
            if (r2 == 0) goto L28
            android.content.res.Resources r0 = r6.getResources()
            int r2 = p139d.p140a.p141a.C1638b.error_querying_decoders
            java.lang.String r0 = r0.getString(r2)
            goto L56
        L28:
            boolean r2 = r0.f9248b
            if (r2 == 0) goto L39
            android.content.res.Resources r2 = r6.getResources()
            int r4 = p139d.p140a.p141a.C1638b.error_no_secure_decoder
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.f9247a
            r5[r3] = r0
            goto L52
        L39:
            android.content.res.Resources r2 = r6.getResources()
            int r4 = p139d.p140a.p141a.C1638b.error_no_decoder
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.f9247a
            r5[r3] = r0
            goto L52
        L46:
            android.content.res.Resources r2 = r6.getResources()
            int r4 = p139d.p140a.p141a.C1638b.error_instantiating_decoder
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.f9249c
            r5[r3] = r0
        L52:
            java.lang.String r0 = r2.getString(r4, r5)
        L56:
            r2 = r0
            goto L69
        L58:
            if (r0 != 0) goto L69
            java.io.IOException r0 = r7.m9873c()
            android.content.res.Resources r2 = r6.getResources()
            int r3 = p139d.p140a.p141a.C1638b.unrecognized_media_format
            java.lang.String r2 = r2.getString(r3)
            goto L6a
        L69:
            r0 = r7
        L6a:
            if (r2 == 0) goto L71
            com.brentvatne.exoplayer.k r3 = r6.f4091c
            r3.m4959a(r2, r0)
        L71:
            r6.f4100l = r1
            boolean r7 = m4869b(r7)
            if (r7 == 0) goto L80
            r6.m4881h()
            r6.m4892m()
            goto L83
        L80:
            r6.m4916x()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.C0982i.mo4850a(d.c.a.a.j):void");
    }

    /* renamed from: a */
    public void m4928a(String str, Dynamic dynamic) {
        this.f4074F = str;
        this.f4075G = dynamic;
        m4922a(1, this.f4074F, this.f4075G);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public void mo4852a(boolean z) {
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: a */
    public void mo4853a(boolean z, int i) {
        String str;
        String str2 = "onStateChanged: playWhenReady=" + z + ", playbackState=";
        if (i == 1) {
            str = str2 + "idle";
            this.f4091c.m4967g();
        } else if (i == 2) {
            str = str2 + "buffering";
            m4895n(true);
        } else if (i == 3) {
            str = str2 + "ready";
            this.f4091c.m4969i();
            m4895n(false);
            m4909u();
            m4918y();
            C1568g c1568g = this.f4092d;
            if (c1568g != null) {
                c1568g.m6647c();
            }
        } else if (i != 4) {
            str = str2 + "unknown";
        } else {
            str = str2 + "ended";
            this.f4091c.m4961b();
            m4897o();
        }
        Log.d("ReactExoplayerView", str);
    }

    @Override // p139d.p140a.p142b.InterfaceC1642c
    /* renamed from: b */
    public void mo4929b() {
        this.f4091c.m4951a();
    }

    /* renamed from: b */
    public void m4930b(float f) {
        this.f4108t = f;
        if (this.f4098j != null) {
            this.f4098j.m8608a(new C2137B(this.f4108t, 1.0f));
        }
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: b */
    public void mo4855b(int i) {
        if (this.f4100l) {
            m4916x();
        }
        if (i == 0 && this.f4098j.mo8529n() == 1) {
            this.f4091c.m4961b();
        }
    }

    /* renamed from: b */
    public void m4931b(String str, Dynamic dynamic) {
        this.f4078J = str;
        this.f4079K = dynamic;
        m4922a(3, this.f4078J, this.f4079K);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D.b
    /* renamed from: b */
    public void mo4856b(boolean z) {
    }

    /* renamed from: c */
    public int m4932c(int i) {
        int m8618v = this.f4098j.m8618v();
        for (int i2 = 0; i2 < m8618v; i2++) {
            if (this.f4098j.m8614b(i2) == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void m4933c(float f) {
        this.f4109u = f;
        C2149N c2149n = this.f4098j;
        if (c2149n != null) {
            c2149n.m8603a(this.f4109u);
        }
    }

    /* renamed from: c */
    public void m4934c(String str, Dynamic dynamic) {
        this.f4076H = str;
        this.f4077I = dynamic;
        m4922a(2, this.f4076H, this.f4077I);
    }

    /* renamed from: c */
    public void m4935c(boolean z) {
        this.f4086R = z;
        if (this.f4098j == null || this.f4096h == null) {
            return;
        }
        if (z) {
            m4875e();
            return;
        }
        int indexOfChild = indexOfChild(this.f4092d);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
        }
    }

    /* renamed from: d */
    public void m4936d() {
        m4912v();
    }

    /* renamed from: d */
    public void m4937d(int i) {
        this.f4111w = i;
        if (this.f4098j != null) {
            C2571e c2571e = this.f4099k;
            C2571e.d m10853d = c2571e.m10853d();
            int i2 = this.f4111w;
            if (i2 == 0) {
                i2 = Integer.MAX_VALUE;
            }
            m10853d.m10869a(i2);
            c2571e.m10850a(m10853d);
        }
    }

    /* renamed from: d */
    public void m4938d(boolean z) {
        this.f4081M = z;
    }

    /* renamed from: e */
    public void m4939e(int i) {
        this.f4110v = i;
        m4902q();
        m4892m();
    }

    /* renamed from: e */
    public void m4940e(boolean z) {
        if (z == this.f4104p) {
            return;
        }
        this.f4104p = z;
        Activity currentActivity = this.f4087S.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        if (!this.f4104p) {
            this.f4091c.m4965e();
            decorView.setSystemUiVisibility(0);
            this.f4091c.m4963c();
        } else {
            int i = C2622I.f10916a >= 19 ? 4102 : 6;
            this.f4091c.m4966f();
            decorView.setSystemUiVisibility(i);
            this.f4091c.m4964d();
        }
    }

    /* renamed from: f */
    public void m4941f(int i) {
        this.f4096h.setResizeMode(i);
    }

    /* renamed from: f */
    public void m4942f(boolean z) {
        this.f4096h.setHideShutterView(z);
    }

    /* renamed from: g */
    public void m4943g(boolean z) {
        this.f4109u = z ? 0.0f : 1.0f;
        C2149N c2149n = this.f4098j;
        if (c2149n != null) {
            c2149n.m8603a(this.f4109u);
        }
    }

    /* renamed from: h */
    public void m4944h(boolean z) {
        this.f4106r = z;
        if (this.f4098j != null) {
            if (z) {
                m4900p();
            } else {
                m4907t();
            }
        }
    }

    /* renamed from: i */
    public void m4945i(boolean z) {
        this.f4083O = z;
    }

    /* renamed from: j */
    public void m4946j(boolean z) {
        C2149N c2149n = this.f4098j;
        if (c2149n != null) {
            c2149n.mo8511a(z ? 1 : 0);
        }
        this.f4073E = z;
    }

    /* renamed from: k */
    public void m4947k(boolean z) {
        this.f4085Q = z;
    }

    /* renamed from: l */
    public void m4948l(boolean z) {
        this.f4096h.setUseTextureView(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4892m();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        float f;
        float f2;
        if (i == -1) {
            this.f4091c.m4960a(false);
        } else if (i == 1) {
            this.f4091c.m4960a(true);
        }
        C2149N c2149n = this.f4098j;
        if (c2149n != null) {
            if (i == -3) {
                f = this.f4109u;
                f2 = 0.8f;
            } else {
                if (i != 1) {
                    return;
                }
                f = this.f4109u;
                f2 = 1.0f;
            }
            c2149n.m8603a(f * f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        m4912v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f4105q = true;
        if (this.f4083O) {
            return;
        }
        m4898o(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.f4083O || !this.f4105q) {
            m4898o(!this.f4106r);
        }
        this.f4105q = false;
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        this.f4091c.m4956a(i);
    }
}
