package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.q */
/* loaded from: classes.dex */
public class C0210q {

    /* renamed from: a */
    private final AbstractC0211r<?> f867a;

    private C0210q(AbstractC0211r<?> abstractC0211r) {
        this.f867a = abstractC0211r;
    }

    /* renamed from: a */
    public static C0210q m1026a(AbstractC0211r<?> abstractC0211r) {
        return new C0210q(abstractC0211r);
    }

    /* renamed from: a */
    public ComponentCallbacksC0205l m1027a(String str) {
        return this.f867a.f872e.m1130b(str);
    }

    /* renamed from: a */
    public View m1028a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f867a.f872e.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void m1029a() {
        this.f867a.f872e.m1147e();
    }

    /* renamed from: a */
    public void m1030a(Configuration configuration) {
        this.f867a.f872e.m1113a(configuration);
    }

    /* renamed from: a */
    public void m1031a(Parcelable parcelable, C0161A c0161a) {
        this.f867a.f872e.m1114a(parcelable, c0161a);
    }

    /* renamed from: a */
    public void m1032a(ComponentCallbacksC0205l componentCallbacksC0205l) {
        AbstractC0211r<?> abstractC0211r = this.f867a;
        abstractC0211r.f872e.m1122a(abstractC0211r, abstractC0211r, componentCallbacksC0205l);
    }

    /* renamed from: a */
    public void m1033a(Menu menu) {
        this.f867a.f872e.m1124a(menu);
    }

    /* renamed from: a */
    public void m1034a(boolean z) {
        this.f867a.f872e.m1125a(z);
    }

    /* renamed from: a */
    public boolean m1035a(Menu menu, MenuInflater menuInflater) {
        return this.f867a.f872e.m1126a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m1036a(MenuItem menuItem) {
        return this.f867a.f872e.m1127a(menuItem);
    }

    /* renamed from: b */
    public void m1037b() {
        this.f867a.f872e.m1150f();
    }

    /* renamed from: b */
    public void m1038b(boolean z) {
        this.f867a.f872e.m1137b(z);
    }

    /* renamed from: b */
    public boolean m1039b(Menu menu) {
        return this.f867a.f872e.m1138b(menu);
    }

    /* renamed from: b */
    public boolean m1040b(MenuItem menuItem) {
        return this.f867a.f872e.m1139b(menuItem);
    }

    /* renamed from: c */
    public void m1041c() {
        this.f867a.f872e.m1153g();
    }

    /* renamed from: d */
    public void m1042d() {
        this.f867a.f872e.m1159i();
    }

    /* renamed from: e */
    public void m1043e() {
        this.f867a.f872e.m1161j();
    }

    /* renamed from: f */
    public void m1044f() {
        this.f867a.f872e.m1163k();
    }

    /* renamed from: g */
    public void m1045g() {
        this.f867a.f872e.m1165l();
    }

    /* renamed from: h */
    public void m1046h() {
        this.f867a.f872e.m1168m();
    }

    /* renamed from: i */
    public boolean m1047i() {
        return this.f867a.f872e.m1172o();
    }

    /* renamed from: j */
    public AbstractC0212s m1048j() {
        return this.f867a.m1054d();
    }

    /* renamed from: k */
    public void m1049k() {
        this.f867a.f872e.m1176r();
    }

    /* renamed from: l */
    public C0161A m1050l() {
        return this.f867a.f872e.m1178t();
    }

    /* renamed from: m */
    public Parcelable m1051m() {
        return this.f867a.f872e.m1179u();
    }
}
