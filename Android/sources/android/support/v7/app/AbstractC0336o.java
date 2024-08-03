package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.o */
/* loaded from: classes.dex */
public abstract class AbstractC0336o {

    /* renamed from: a */
    private static int f1577a = -1;

    /* renamed from: a */
    public static AbstractC0336o m1831a(Activity activity, InterfaceC0335n interfaceC0335n) {
        return new LayoutInflaterFactory2C0345x(activity, activity.getWindow(), interfaceC0335n);
    }

    /* renamed from: a */
    public static AbstractC0336o m1832a(Dialog dialog, InterfaceC0335n interfaceC0335n) {
        return new LayoutInflaterFactory2C0345x(dialog.getContext(), dialog.getWindow(), interfaceC0335n);
    }

    /* renamed from: b */
    public static int m1833b() {
        return f1577a;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo1834a(int i);

    /* renamed from: a */
    public abstract void mo1835a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo1836a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo1837a(View view);

    /* renamed from: a */
    public abstract void mo1838a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo1839a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo1840a();

    /* renamed from: b */
    public abstract void mo1841b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo1842b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo1843b(int i);

    /* renamed from: c */
    public abstract MenuInflater mo1844c();

    /* renamed from: c */
    public abstract void mo1845c(int i);

    /* renamed from: c */
    public abstract void mo1846c(Bundle bundle);

    /* renamed from: d */
    public abstract AbstractC0322a mo1847d();

    /* renamed from: e */
    public abstract void mo1848e();

    /* renamed from: f */
    public abstract void mo1849f();

    /* renamed from: g */
    public abstract void mo1850g();

    /* renamed from: h */
    public abstract void mo1851h();

    /* renamed from: i */
    public abstract void mo1852i();

    /* renamed from: j */
    public abstract void mo1853j();
}
