package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ComponentCallbacksC0205l;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: android.support.v4.app.s */
/* loaded from: classes.dex */
public abstract class AbstractC0212s {

    /* renamed from: android.support.v4.app.s$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: android.support.v4.app.s$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: a */
        public abstract void m1066a(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l);

        /* renamed from: a */
        public abstract void m1067a(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l, Context context);

        /* renamed from: a */
        public abstract void m1068a(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle);

        /* renamed from: a */
        public abstract void m1069a(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l, View view, Bundle bundle);

        /* renamed from: b */
        public abstract void m1070b(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l);

        /* renamed from: b */
        public abstract void m1071b(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l, Context context);

        /* renamed from: b */
        public abstract void m1072b(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle);

        /* renamed from: c */
        public abstract void m1073c(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l);

        /* renamed from: c */
        public abstract void m1074c(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle);

        /* renamed from: d */
        public abstract void m1075d(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l);

        /* renamed from: d */
        public abstract void m1076d(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle);

        /* renamed from: e */
        public abstract void m1077e(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l);

        /* renamed from: f */
        public abstract void m1078f(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l);

        /* renamed from: g */
        public abstract void m1079g(AbstractC0212s abstractC0212s, ComponentCallbacksC0205l componentCallbacksC0205l);
    }

    /* renamed from: android.support.v4.app.s$c */
    /* loaded from: classes.dex */
    public interface c {
        void onBackStackChanged();
    }

    /* renamed from: a */
    public abstract AbstractC0169H mo1056a();

    /* renamed from: a */
    public abstract ComponentCallbacksC0205l.d mo1057a(ComponentCallbacksC0205l componentCallbacksC0205l);

    /* renamed from: a */
    public abstract ComponentCallbacksC0205l mo1058a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract ComponentCallbacksC0205l mo1059a(String str);

    /* renamed from: a */
    public abstract void mo1060a(int i, int i2);

    /* renamed from: a */
    public abstract void mo1061a(Bundle bundle, String str, ComponentCallbacksC0205l componentCallbacksC0205l);

    /* renamed from: a */
    public abstract void mo1062a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract List<ComponentCallbacksC0205l> mo1063b();

    /* renamed from: c */
    public abstract boolean mo1064c();

    /* renamed from: d */
    public abstract boolean mo1065d();
}
