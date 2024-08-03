package p031c.p032a.p035C;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p036D.C0520a;
import p031c.p032a.p037E.C0522a;
import p031c.p032a.p047O.C0552b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.C.b */
/* loaded from: classes.dex */
public class C0516b extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0516b f2591a;

    /* renamed from: b */
    private Context f2592b;

    /* renamed from: c */
    private Set<String> f2593c;

    /* renamed from: d */
    private List<C0520a> f2594d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m2726a(C0516b c0516b, Context context, Intent intent) {
        String dataString;
        int i;
        String str;
        String str2;
        String action = intent.getAction();
        if (action == null || TextUtils.isEmpty(action)) {
            C0675a.m3475g("JAppMovement", "the action'" + action + "'is illegal");
            return;
        }
        if ((action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REMOVED")) && (dataString = intent.getDataString()) != null && !TextUtils.isEmpty(dataString) && dataString.length() > 8 && dataString.startsWith("package:")) {
            String substring = dataString.substring(8);
            C0675a.m3469c("JAppMovement", "receive the action'" + action + ",package:" + substring);
            boolean z = false;
            if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                i = C0522a.m2736a(C0522a.m2737a(context, substring));
                C0675a.m3469c("JAppMovement", "report add app:" + substring);
                str = "add";
            } else {
                C0675a.m3469c("JAppMovement", "report remove app:" + substring);
                i = -1000;
                str = "rmv";
            }
            c0516b.m2727a(substring, i, str, 0);
            c0516b.f2593c = c0516b.m2730e();
            Set<String> set = c0516b.f2593c;
            if (set != null && !set.isEmpty()) {
                try {
                    boolean z2 = true;
                    if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                        c0516b.f2593c.add(substring);
                        z = true;
                    }
                    if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        c0516b.f2593c.remove(substring);
                    } else {
                        z2 = z;
                    }
                    if (z2 && c0516b.f2593c != null) {
                        String m2739a = C0522a.m2739a(c0516b.f2593c);
                        if (!TextUtils.isEmpty(m2739a)) {
                            C0675a.m3469c("JAppMovement", "update installedAppList cache:" + c0516b.f2593c);
                            C0552b.m2878a(context, "bal.catch", m2739a);
                        }
                    }
                } catch (Throwable th) {
                    str2 = "cache appList add remove failed:" + th.getMessage();
                }
                C0675a.m3469c("JAppMovement", "executeAction: [JAppMovement]");
                c0516b.mo2680c(context, "JAppMovement");
                c0516b.mo2683d(context, "JAppMovement");
            }
            str2 = "get cache appList failed";
            C0675a.m3475g("JAppMovement", str2);
            C0675a.m3469c("JAppMovement", "executeAction: [JAppMovement]");
            c0516b.mo2680c(context, "JAppMovement");
            c0516b.mo2683d(context, "JAppMovement");
        }
    }

    /* renamed from: a */
    private void m2727a(String str, int i, String str2, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str2);
            jSONObject.put("appid", str);
            jSONObject.put("source", i2);
            if (i != -1000) {
                jSONObject.put("install_type", i);
            }
            C0513h.m2719a(this.f2592b, jSONObject, "app_add_rmv");
            C0513h.m2720a(this.f2592b, (Object) jSONObject);
        } catch (JSONException e2) {
            C0675a.m3475g("JAppMovement", "package json exception:" + e2.getMessage());
        }
    }

    /* renamed from: a */
    private static boolean m2728a(int i, String str) {
        if (i != 1) {
            return false;
        }
        C0675a.m3475g("JAppMovement", "the " + str + " app is system app,need dealAction all apps,to executeMovementAction JAppAll");
        return true;
    }

    /* renamed from: d */
    public static C0516b m2729d() {
        if (f2591a == null) {
            synchronized (C0516b.class) {
                f2591a = new C0516b();
            }
        }
        return f2591a;
    }

    /* renamed from: e */
    private Set<String> m2730e() {
        String m2880b = C0552b.m2880b(this.f2592b, "bal.catch");
        if (TextUtils.isEmpty(m2880b) || m2880b == null || TextUtils.isEmpty(m2880b)) {
            return null;
        }
        return C0522a.m2745a(m2880b);
    }

    /* renamed from: a */
    public final void m2731a(Context context, Intent intent) {
        this.f2592b = context;
        C0675a.m3469c("JAppMovement", "executeMovementAction: [JAppMovement] from broadcast");
        if (mo2673a()) {
            C0557c.m2901a("JCommon", new RunnableC0517c(this, context, intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    public final boolean mo2673a() {
        C0675a.m3469c("JAppMovement", "for googlePlay:false");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        List<C0520a> m2742a = C0522a.m2742a(context, true);
        if (m2742a == null || m2742a.isEmpty()) {
            C0675a.m3475g("JAppMovement", "collect installedAppList failed");
            return;
        }
        C0675a.m3469c("JAppMovement", "collect installedAppList success");
        if (m2742a.size() == 1 && m2742a.get(0).f2606b.equals(context.getPackageName())) {
            C0675a.m3475g("JAppMovement", "installedAppList only has one app and this app is itself");
            return;
        }
        if (this.f2593c == null) {
            this.f2593c = m2730e();
        }
        Set<String> set = this.f2593c;
        if (set == null || set.isEmpty()) {
            C0675a.m3475g("JAppMovement", "current appList cache is empty,need collect appList first,to executeMovementAction JAppAll");
            C0515a.m2725d().m2675b(context);
            return;
        }
        C0675a.m3469c("JAppMovement", "get installedAppList cache:" + this.f2593c);
        this.f2594d = new ArrayList(m2742a);
        for (C0520a c0520a : m2742a) {
            if (this.f2593c.remove(c0520a.f2606b)) {
                this.f2594d.remove(c0520a);
            }
        }
        if (this.f2593c.isEmpty() && this.f2594d.isEmpty()) {
            C0675a.m3469c("JAppMovement", "installedAppList has no change");
            return;
        }
        String m2738a = C0522a.m2738a(m2742a);
        if (TextUtils.isEmpty(m2738a)) {
            return;
        }
        C0675a.m3469c("JAppMovement", "update installedAppList cache:" + m2742a);
        C0552b.m2878a(context, "bal.catch", m2738a);
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2592b = context;
        return "JAppMovement";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        List<C0520a> list = this.f2594d;
        if (list == null || list.isEmpty()) {
            C0675a.m3475g("JAppMovement", "there are no add app data to report");
        } else {
            for (C0520a c0520a : this.f2594d) {
                if (m2728a(c0520a.f2609e, "add")) {
                    C0515a.m2725d().m2675b(context);
                } else {
                    m2727a(c0520a.f2606b, c0520a.f2609e, "add", 1);
                    super.mo2683d(context, str);
                }
            }
        }
        Set<String> set = this.f2593c;
        if (set == null || set.isEmpty()) {
            C0675a.m3475g("JAppMovement", "there are no remove app data to report");
        } else {
            for (String str2 : this.f2593c) {
                if (m2728a(-1000, "rmv")) {
                    C0515a.m2725d().m2675b(context);
                } else {
                    m2727a(str2, -1000, "rmv", 1);
                    super.mo2683d(context, str);
                }
            }
        }
        this.f2594d = null;
        this.f2593c = null;
    }
}
