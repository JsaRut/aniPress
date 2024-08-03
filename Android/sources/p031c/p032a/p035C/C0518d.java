package p031c.p032a.p035C;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.C.d */
/* loaded from: classes.dex */
public class C0518d extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0518d f2598a;

    /* renamed from: b */
    private Context f2599b;

    /* renamed from: c */
    private String[] f2600c;

    /* renamed from: d */
    public static C0518d m2732d() {
        if (f2598a == null) {
            synchronized (C0518d.class) {
                f2598a = new C0518d();
            }
        }
        return f2598a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    public final boolean mo2673a() {
        C0675a.m3469c("JAppPermission", "for googlePlay:false");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        try {
            this.f2600c = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (this.f2600c == null || this.f2600c.length <= 0) {
                C0675a.m3469c("JAppPermission", "collect failed");
                return;
            }
            C0675a.m3469c("JAppPermission", "collect success:" + Arrays.toString(this.f2600c));
        } catch (Throwable th) {
            this.f2600c = null;
            C0675a.m3475g("JAppPermission", "collect throwable:" + th.getMessage());
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2599b = context;
        return "JAppPermission";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        String[] strArr = this.f2600c;
        if (strArr == null || strArr.length == 0) {
            C0675a.m3475g("JAppPermission", "there are no data to report");
            return;
        }
        int length = strArr.length;
        StringBuilder sb = new StringBuilder("[");
        String m2915i = C0557c.m2915i(context);
        long m2911e = C0557c.m2911e(context);
        StringBuilder sb2 = sb;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            String str2 = this.f2600c[i];
            if (i2 == 0) {
                sb2.append("\"");
            } else {
                sb2.append(",\"");
            }
            sb2.append(str2);
            sb2.append("\"");
            int i4 = i + 1;
            i2++;
            if (i2 >= 50 || sb2.length() > 1000 || i4 == length) {
                sb2.append("]");
                String format = String.format(Locale.ENGLISH, "{\"total\":%d,\"page\":%d,\"senderid\":\"%s\",\"uid\":%s,\"permission_list\":%s}", Integer.valueOf(length), Integer.valueOf(i3), m2915i, Long.valueOf(m2911e), sb2.toString());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("data", format);
                } catch (JSONException e2) {
                    C0675a.m3475g("JAppPermission", "package json exception:" + e2.getMessage());
                }
                C0513h.m2719a(context, jSONObject, "android_permissions");
                C0513h.m2720a(context, (Object) jSONObject);
                super.mo2683d(context, str);
                i3++;
                sb2 = new StringBuilder("[");
                i2 = 0;
            }
            i = i4;
        }
        this.f2600c = null;
    }
}
