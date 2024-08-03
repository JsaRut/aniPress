package p031c.p032a.p072p.p073a.p080f;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.List;
import p031c.p032a.p072p.p073a.p078d.C0728a;
import p031c.p032a.p072p.p073a.p080f.p087g.C0769k;
import p031c.p032a.p072p.p073a.p088g.C0776d;
import p031c.p032a.p072p.p073a.p088g.C0788p;

/* renamed from: c.a.p.a.f.g */
/* loaded from: classes.dex */
public final class C0758g {
    /* renamed from: a */
    private static int m3788a(View view, ViewGroup viewGroup, String str) {
        int i;
        View childAt;
        Integer num = (Integer) view.getTag(-16769023);
        if (num != null) {
            i = num.intValue();
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount() && view != (childAt = viewGroup.getChildAt(i3)); i3++) {
                if (str.equals(m3791a(childAt, false))) {
                    i2++;
                }
            }
            i = i2;
        }
        view.setTag(-16769023, Integer.valueOf(i));
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|5|(4:7|8|(2:10|11)(2:43|(1:45)(5:46|(1:48)(2:54|(1:56)(2:57|(2:59|(1:61))(1:62)))|49|50|51))|12)(1:65)|(2:40|41)|14|(4:(2:16|(7:18|19|20|(3:22|23|(1:25))|27|28|29))|27|28|29)|39|19|20|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:            r4 = r0;        r3 = r9;        r7 = r10;        r5 = r11;     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8 A[Catch: Throwable -> 0x00c2, TRY_LEAVE, TryCatch #5 {Throwable -> 0x00c2, blocks: (B:20:0x00a0, B:22:0x00a8), top: B:19:0x00a0 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p031c.p032a.p072p.p073a.p088g.C0788p m3789a(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p080f.C0758g.m3789a(android.view.View):c.a.p.a.g.p");
    }

    /* renamed from: a */
    public static String m3790a(Activity activity) {
        return m3792a((Object) activity);
    }

    /* renamed from: a */
    private static String m3791a(View view, boolean z) {
        String str = (String) view.getTag(-16769024);
        if (str == null) {
            if (!C0769k.m3827a(view.getClass().getPackage())) {
                str = m3792a((Object) view);
            } else if (view == null) {
                str = "";
            } else {
                str = view.getClass().getName();
                int lastIndexOf = str.lastIndexOf(".");
                if (lastIndexOf >= 0) {
                    str = str.substring(lastIndexOf + 1);
                }
            }
        }
        if (z) {
            view.setTag(-16769024, str);
        }
        return str;
    }

    /* renamed from: a */
    private static String m3792a(Object obj) {
        return obj == null ? "" : obj.getClass().getName();
    }

    /* renamed from: a */
    public static void m3793a(List<View> list, View view, boolean z) {
        if (view == null) {
            return;
        }
        try {
            if (C0770h.m3839a(view, z) && view.getGlobalVisibleRect(new Rect())) {
                list.add(view);
            }
            if (!(view instanceof ViewGroup) || (view instanceof WebView)) {
                return;
            }
            if (!z && C0770h.m3840a(view.getParent())) {
                z = true;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3793a(list, viewGroup.getChildAt(i), z);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static View m3794b(Activity activity) {
        View findViewById;
        try {
            View decorView = activity.getWindow().getDecorView();
            if (decorView != null && (findViewById = decorView.findViewById(R.id.content)) != null) {
                return (View) findViewById.getParent();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static C0728a m3795b(View view) {
        String str;
        try {
            if (view == null) {
                return new C0728a("", "", null);
            }
            View m3794b = m3794b(C0770h.m3844d(view));
            if (C0770h.m3838a(view, m3794b)) {
                return new C0728a("", "", null);
            }
            str = C0770h.m3842b(view);
            try {
                List m3843c = C0770h.m3843c(view);
                int indexOf = m3843c.indexOf(m3794b);
                if (indexOf < 0) {
                    m3843c.add(m3794b);
                } else {
                    m3843c = m3843c.subList(0, indexOf + 1);
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int size = m3843c.size() - 1; size >= 0; size--) {
                    C0788p m3789a = m3789a((View) m3843c.get(size));
                    sb.append("/");
                    sb.append(m3789a.f3454a);
                    if (m3789a.f3458e) {
                        sb2.append(m3789a.f3455b);
                        sb2.append(",");
                    }
                }
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                return new C0728a(sb.toString(), sb2.toString(), str);
            } catch (Throwable unused) {
                return new C0728a("", "", str);
            }
        } catch (Throwable unused2) {
            str = "";
        }
    }

    /* renamed from: c */
    public static void m3796c(Activity activity) {
        try {
            View m3794b = m3794b(activity);
            if (m3794b instanceof ViewGroup) {
                C0776d.m3863a(m3794b);
            }
        } catch (Throwable unused) {
        }
    }
}
