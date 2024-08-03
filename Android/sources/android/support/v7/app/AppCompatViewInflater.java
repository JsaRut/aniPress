package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.util.C0256b;
import android.support.v7.widget.C0392C;
import android.support.v7.widget.C0405I;
import android.support.v7.widget.C0452i;
import android.support.v7.widget.C0456k;
import android.support.v7.widget.C0458l;
import android.support.v7.widget.C0460m;
import android.support.v7.widget.C0466p;
import android.support.v7.widget.C0470r;
import android.support.v7.widget.C0473sa;
import android.support.v7.widget.C0474t;
import android.support.v7.widget.C0476u;
import android.support.v7.widget.C0482x;
import android.support.v7.widget.C0484y;
import android.support.v7.widget.C0486z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p029e.C0133d;

/* loaded from: classes.dex */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f1471a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f1472b = {R.attr.onClick};

    /* renamed from: c */
    private static final String[] f1473c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f1474d = new C0256b();

    /* renamed from: e */
    private final Object[] f1475e = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    /* loaded from: classes.dex */
    public static class ViewOnClickListenerC0313a implements View.OnClickListener {

        /* renamed from: a */
        private final View f1476a;

        /* renamed from: b */
        private final String f1477b;

        /* renamed from: c */
        private Method f1478c;

        /* renamed from: d */
        private Context f1479d;

        public ViewOnClickListenerC0313a(View view, String str) {
            this.f1476a = view;
            this.f1477b = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        private void m1744a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1477b, View.class)) != null) {
                        this.f1478c = method;
                        this.f1479d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f1476a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f1476a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1477b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1476a.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1478c == null) {
                m1744a(this.f1476a.getContext(), this.f1477b);
            }
            try {
                this.f1478c.invoke(this.f1479d, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    /* renamed from: a */
    private static Context m1724a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0121j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0121j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0133d) && ((C0133d) context).m648a() == resourceId) ? context : new C0133d(context, resourceId) : context;
    }

    /* renamed from: a */
    private View m1725a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = f1474d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f1471a);
                f1474d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f1475e);
    }

    /* renamed from: a */
    private void m1726a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C0107v.m527o(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1472b);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new ViewOnClickListenerC0313a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: a */
    private void m1727a(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: b */
    private View m1728b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f1475e[0] = context;
            this.f1475e[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m1725a(context, str, (String) null);
            }
            for (int i = 0; i < f1473c.length; i++) {
                View m1725a = m1725a(context, str, f1473c[i]);
                if (m1725a != null) {
                    return m1725a;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr = this.f1475e;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    /* renamed from: a */
    protected C0452i m1729a(Context context, AttributeSet attributeSet) {
        return new C0452i(context, attributeSet);
    }

    /* renamed from: a */
    protected View m1730a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: a */
    public final View m1731a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View m1743m;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1724a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0473sa.m2564a(context2);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                m1743m = m1743m(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 1:
                m1743m = m1737g(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 2:
                m1743m = m1732b(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 3:
                m1743m = m1735e(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 4:
                m1743m = m1742l(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 5:
                m1743m = m1736f(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 6:
                m1743m = m1733c(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 7:
                m1743m = m1739i(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case '\b':
                m1743m = m1734d(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case '\t':
                m1743m = m1729a(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case '\n':
                m1743m = m1738h(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case 11:
                m1743m = m1740j(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            case '\f':
                m1743m = m1741k(context2, attributeSet);
                m1727a(m1743m, str);
                break;
            default:
                m1743m = m1730a(context2, str, attributeSet);
                break;
        }
        if (m1743m == null && context != context2) {
            m1743m = m1728b(context2, str, attributeSet);
        }
        if (m1743m != null) {
            m1726a(m1743m, attributeSet);
        }
        return m1743m;
    }

    /* renamed from: b */
    protected C0456k m1732b(Context context, AttributeSet attributeSet) {
        return new C0456k(context, attributeSet);
    }

    /* renamed from: c */
    protected C0458l m1733c(Context context, AttributeSet attributeSet) {
        return new C0458l(context, attributeSet);
    }

    /* renamed from: d */
    protected C0460m m1734d(Context context, AttributeSet attributeSet) {
        return new C0460m(context, attributeSet);
    }

    /* renamed from: e */
    protected C0466p m1735e(Context context, AttributeSet attributeSet) {
        return new C0466p(context, attributeSet);
    }

    /* renamed from: f */
    protected C0470r m1736f(Context context, AttributeSet attributeSet) {
        return new C0470r(context, attributeSet);
    }

    /* renamed from: g */
    protected C0474t m1737g(Context context, AttributeSet attributeSet) {
        return new C0474t(context, attributeSet);
    }

    /* renamed from: h */
    protected C0476u m1738h(Context context, AttributeSet attributeSet) {
        return new C0476u(context, attributeSet);
    }

    /* renamed from: i */
    protected C0482x m1739i(Context context, AttributeSet attributeSet) {
        return new C0482x(context, attributeSet);
    }

    /* renamed from: j */
    protected C0484y m1740j(Context context, AttributeSet attributeSet) {
        return new C0484y(context, attributeSet);
    }

    /* renamed from: k */
    protected C0486z m1741k(Context context, AttributeSet attributeSet) {
        return new C0486z(context, attributeSet);
    }

    /* renamed from: l */
    protected C0392C m1742l(Context context, AttributeSet attributeSet) {
        return new C0392C(context, attributeSet);
    }

    /* renamed from: m */
    protected C0405I m1743m(Context context, AttributeSet attributeSet) {
        return new C0405I(context, attributeSet);
    }
}
