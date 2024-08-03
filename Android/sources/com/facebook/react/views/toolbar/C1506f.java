package com.facebook.react.views.toolbar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1374w;
import p139d.p143b.p169g.p170a.p171a.C1763c;
import p139d.p143b.p169g.p170a.p171a.C1766f;
import p139d.p143b.p169g.p175c.C1778f;
import p139d.p143b.p169g.p175c.InterfaceC1779g;
import p139d.p143b.p169g.p178e.C1804t;
import p139d.p143b.p169g.p179f.C1809a;
import p139d.p143b.p169g.p179f.C1810b;
import p139d.p143b.p169g.p182i.C1820b;
import p139d.p143b.p169g.p182i.C1823e;
import p139d.p143b.p184i.p196j.InterfaceC1921e;

/* renamed from: com.facebook.react.views.toolbar.f */
/* loaded from: classes.dex */
public class C1506f extends Toolbar {

    /* renamed from: P */
    private final C1820b f5542P;

    /* renamed from: Q */
    private final C1820b f5543Q;

    /* renamed from: R */
    private final C1820b f5544R;

    /* renamed from: S */
    private final C1823e<C1809a> f5545S;

    /* renamed from: T */
    private b f5546T;

    /* renamed from: U */
    private b f5547U;

    /* renamed from: V */
    private b f5548V;

    /* renamed from: W */
    private final Runnable f5549W;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.toolbar.f$a */
    /* loaded from: classes.dex */
    public class a extends b {

        /* renamed from: e */
        private final MenuItem f5550e;

        a(MenuItem menuItem, C1820b c1820b) {
            super(c1820b);
            this.f5550e = menuItem;
        }

        @Override // com.facebook.react.views.toolbar.C1506f.b
        /* renamed from: a */
        protected void mo6281a(Drawable drawable) {
            this.f5550e.setIcon(drawable);
            C1506f.this.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.toolbar.f$b */
    /* loaded from: classes.dex */
    public abstract class b extends C1778f<InterfaceC1921e> {

        /* renamed from: b */
        private final C1820b f5552b;

        /* renamed from: c */
        private c f5553c;

        public b(C1820b c1820b) {
            this.f5552b = c1820b;
        }

        /* renamed from: a */
        protected abstract void mo6281a(Drawable drawable);

        /* renamed from: a */
        public void m6290a(c cVar) {
            this.f5553c = cVar;
        }

        @Override // p139d.p143b.p169g.p175c.C1778f, p139d.p143b.p169g.p175c.InterfaceC1779g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6002a(String str, InterfaceC1921e interfaceC1921e, Animatable animatable) {
            super.mo6002a(str, (String) interfaceC1921e, animatable);
            InterfaceC1921e interfaceC1921e2 = this.f5553c;
            if (interfaceC1921e2 == null) {
                interfaceC1921e2 = interfaceC1921e;
            }
            mo6281a(new C1500a(this.f5552b.m7491c(), interfaceC1921e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.toolbar.f$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC1921e {

        /* renamed from: a */
        private int f5555a;

        /* renamed from: b */
        private int f5556b;

        public c(int i, int i2) {
            this.f5555a = i;
            this.f5556b = i2;
        }

        @Override // p139d.p143b.p184i.p196j.InterfaceC1921e
        /* renamed from: m */
        public int mo6292m() {
            return this.f5556b;
        }

        @Override // p139d.p143b.p184i.p196j.InterfaceC1921e
        /* renamed from: n */
        public int mo6293n() {
            return this.f5555a;
        }
    }

    public C1506f(Context context) {
        super(context);
        this.f5545S = new C1823e<>();
        this.f5549W = new RunnableC1505e(this);
        this.f5542P = C1820b.m7479a(m6288t(), context);
        this.f5543Q = C1820b.m7479a(m6288t(), context);
        this.f5544R = C1820b.m7479a(m6288t(), context);
        this.f5546T = new C1502b(this, this.f5542P);
        this.f5547U = new C1503c(this, this.f5543Q);
        this.f5548V = new C1504d(this, this.f5544R);
    }

    /* renamed from: a */
    private Drawable m6282a(String str) {
        if (m6286b(str) != 0) {
            return getResources().getDrawable(m6286b(str));
        }
        return null;
    }

    /* renamed from: a */
    private c m6283a(ReadableMap readableMap) {
        if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
            return new c(Math.round(C1374w.m5959b(readableMap.getInt("width"))), Math.round(C1374w.m5959b(readableMap.getInt("height"))));
        }
        return null;
    }

    /* renamed from: a */
    private void m6284a(MenuItem menuItem, ReadableMap readableMap) {
        C1820b<C1809a> m7479a = C1820b.m7479a(m6288t(), getContext());
        a aVar = new a(menuItem, m7479a);
        aVar.m6290a(m6283a(readableMap));
        m6285a(readableMap, aVar, m7479a);
        this.f5545S.m7502a(m7479a);
    }

    /* renamed from: a */
    private void m6285a(ReadableMap readableMap, b bVar, C1820b c1820b) {
        String string = readableMap != null ? readableMap.getString("uri") : null;
        if (string == null) {
            bVar.m6290a((c) null);
            bVar.mo6281a((Drawable) null);
            return;
        }
        if (!string.startsWith("http://") && !string.startsWith("https://") && !string.startsWith("file://")) {
            bVar.mo6281a(m6282a(string));
            return;
        }
        bVar.m6290a(m6283a(readableMap));
        C1766f mo7240a = C1763c.m7212c().mo7240a(Uri.parse(string));
        mo7240a.m7302a((InterfaceC1779g) bVar);
        C1766f c1766f = mo7240a;
        c1766f.mo7303a(c1820b.m7485a());
        c1820b.m7487a(c1766f.build());
        c1820b.m7491c().setVisible(true, true);
    }

    /* renamed from: b */
    private int m6286b(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    /* renamed from: s */
    private void m6287s() {
        this.f5542P.m7492d();
        this.f5543Q.m7492d();
        this.f5544R.m7492d();
        this.f5545S.m7503b();
    }

    /* renamed from: t */
    private C1809a m6288t() {
        C1810b c1810b = new C1810b(getResources());
        c1810b.m7425a(C1804t.b.f6646c);
        c1810b.m7424a(0);
        return c1810b.m7423a();
    }

    /* renamed from: u */
    private void m6289u() {
        this.f5542P.m7493e();
        this.f5543Q.m7493e();
        this.f5544R.m7493e();
        this.f5545S.m7504c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m6287s();
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6289u();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m6287s();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m6289u();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f5549W);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActions(ReadableArray readableArray) {
        Menu menu = getMenu();
        menu.clear();
        this.f5545S.m7500a();
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                MenuItem add = menu.add(0, 0, i, map.getString("title"));
                if (map.hasKey("icon")) {
                    m6284a(add, map.getMap("icon"));
                }
                int i2 = map.hasKey("show") ? map.getInt("show") : 0;
                if (map.hasKey("showWithText") && map.getBoolean("showWithText")) {
                    i2 |= 4;
                }
                add.setShowAsAction(i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLogoSource(ReadableMap readableMap) {
        m6285a(readableMap, this.f5546T, this.f5542P);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNavIconSource(ReadableMap readableMap) {
        m6285a(readableMap, this.f5547U, this.f5543Q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOverflowIconSource(ReadableMap readableMap) {
        m6285a(readableMap, this.f5548V, this.f5544R);
    }
}
