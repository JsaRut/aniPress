package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p029e.AbstractC0131b;

/* renamed from: android.support.v7.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0322a {

    /* renamed from: android.support.v7.app.a$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1545a;

        public a(int i, int i2) {
            super(i, i2);
            this.f1545a = 0;
            this.f1545a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1545a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.ActionBarLayout);
            this.f1545a = obtainStyledAttributes.getInt(C0121j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f1545a = 0;
            this.f1545a = aVar.f1545a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1545a = 0;
        }
    }

    /* renamed from: android.support.v7.app.a$b */
    /* loaded from: classes.dex */
    public interface b {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m1805a();

        /* renamed from: b */
        public abstract View m1806b();

        /* renamed from: c */
        public abstract Drawable m1807c();

        /* renamed from: d */
        public abstract CharSequence m1808d();

        /* renamed from: e */
        public abstract void m1809e();
    }

    /* renamed from: a */
    public abstract AbstractC0131b mo1773a(AbstractC0131b.a aVar);

    /* renamed from: a */
    public abstract void mo1778a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo1779a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo1781a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean m1800a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo1783b(boolean z);

    /* renamed from: c */
    public abstract void mo1785c(boolean z);

    /* renamed from: d */
    public abstract void mo1787d(boolean z);

    /* renamed from: e */
    public boolean m1801e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo1790f();

    /* renamed from: g */
    public abstract int mo1791g();

    /* renamed from: h */
    public abstract Context mo1793h();

    /* renamed from: i */
    public boolean m1802i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1803j() {
    }

    /* renamed from: k */
    public boolean m1804k() {
        return false;
    }
}
