package p139d.p143b.p169g.p182i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p169g.p181h.InterfaceC1815a;
import p139d.p143b.p169g.p181h.InterfaceC1816b;
import p139d.p143b.p169g.p182i.C1819a;

/* renamed from: d.b.g.i.c */
/* loaded from: classes.dex */
public class C1821c<DH extends InterfaceC1816b> extends ImageView {

    /* renamed from: a */
    private static boolean f6718a = false;

    /* renamed from: b */
    private final C1819a.a f6719b;

    /* renamed from: c */
    private float f6720c;

    /* renamed from: d */
    private C1820b<DH> f6721d;

    /* renamed from: e */
    private boolean f6722e;

    /* renamed from: f */
    private boolean f6723f;

    public C1821c(Context context) {
        super(context);
        this.f6719b = new C1819a.a();
        this.f6720c = 0.0f;
        this.f6722e = false;
        this.f6723f = false;
        m7494a(context);
    }

    /* renamed from: a */
    private void m7494a(Context context) {
        if (this.f6722e) {
            return;
        }
        this.f6722e = true;
        this.f6721d = C1820b.m7479a(null, context);
        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                return;
            } else {
                setColorFilter(imageTintList.getDefaultColor());
            }
        }
        this.f6723f = f6718a && context.getApplicationInfo().targetSdkVersion >= 24;
    }

    /* renamed from: e */
    private void m7495e() {
        Drawable drawable;
        if (!this.f6723f || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f6718a = z;
    }

    /* renamed from: a */
    protected void m7496a() {
        this.f6721d.m7492d();
    }

    /* renamed from: b */
    protected void m7497b() {
        this.f6721d.m7493e();
    }

    /* renamed from: c */
    protected void m7498c() {
        m7496a();
    }

    /* renamed from: d */
    protected void m7499d() {
        m7497b();
    }

    public float getAspectRatio() {
        return this.f6720c;
    }

    public InterfaceC1815a getController() {
        return this.f6721d.m7485a();
    }

    public DH getHierarchy() {
        return this.f6721d.m7490b();
    }

    public Drawable getTopLevelDrawable() {
        return this.f6721d.m7491c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7495e();
        m7498c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7495e();
        m7499d();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m7495e();
        m7498c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        C1819a.a aVar = this.f6719b;
        aVar.f6710a = i;
        aVar.f6711b = i2;
        C1819a.m7477a(aVar, this.f6720c, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C1819a.a aVar2 = this.f6719b;
        super.onMeasure(aVar2.f6710a, aVar2.f6711b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m7495e();
        m7499d();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6721d.m7489a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m7495e();
    }

    public void setAspectRatio(float f) {
        if (f == this.f6720c) {
            return;
        }
        this.f6720c = f;
        requestLayout();
    }

    public void setController(InterfaceC1815a interfaceC1815a) {
        this.f6721d.m7487a(interfaceC1815a);
        super.setImageDrawable(this.f6721d.m7491c());
    }

    public void setHierarchy(DH dh) {
        this.f6721d.m7488a((C1820b<DH>) dh);
        super.setImageDrawable(this.f6721d.m7491c());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        m7494a(getContext());
        this.f6721d.m7487a((InterfaceC1815a) null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        m7494a(getContext());
        this.f6721d.m7487a((InterfaceC1815a) null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        m7494a(getContext());
        this.f6721d.m7487a((InterfaceC1815a) null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        m7494a(getContext());
        this.f6721d.m7487a((InterfaceC1815a) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f6723f = z;
    }

    @Override // android.view.View
    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        C1820b<DH> c1820b = this.f6721d;
        m6961a.m6967a("holder", c1820b != null ? c1820b.toString() : "<no holder set>");
        return m6961a.toString();
    }
}
