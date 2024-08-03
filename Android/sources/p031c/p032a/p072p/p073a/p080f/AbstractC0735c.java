package p031c.p032a.p072p.p073a.p080f;

import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: c.a.p.a.f.c */
/* loaded from: classes.dex */
public abstract class AbstractC0735c {

    /* renamed from: a */
    private WebView f3324a;

    public AbstractC0735c(WebView webView) {
        this.f3324a = webView;
    }

    /* renamed from: a */
    public abstract String mo3740a();

    /* renamed from: a */
    public abstract void mo3741a(int i, String str);

    /* renamed from: a */
    public abstract void mo3742a(String str);

    /* renamed from: a */
    public abstract void mo3743a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract void mo3744b();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: Throwable -> 0x00cb, TryCatch #1 {Throwable -> 0x00cb, blocks: (B:6:0x002a, B:19:0x0067, B:22:0x006b, B:25:0x0080, B:27:0x0084, B:29:0x008d, B:33:0x0093, B:35:0x009b, B:37:0x00a3, B:40:0x0041, B:43:0x004b, B:46:0x0055), top: B:5:0x002a, inners: #0 }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void exec(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "js call native: func="
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " params="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = "callback="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BuryJs_xxx"
            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3718b(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L2a
            return
        L2a:
            int r0 = r7.hashCode()     // Catch: java.lang.Throwable -> Lcb
            r2 = -1913642710(0xffffffff8df0212a, float:-1.4799126E-30)
            r3 = 2
            r4 = 1
            r5 = -1
            if (r0 == r2) goto L55
            r2 = -75605984(0xfffffffffb7e5820, float:-1.3206308E36)
            if (r0 == r2) goto L4b
            r2 = 1463983836(0x57429edc, float:2.1398755E14)
            if (r0 == r2) goto L41
            goto L5f
        L41:
            java.lang.String r0 = "onResult"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto L5f
            r7 = 1
            goto L60
        L4b:
            java.lang.String r0 = "getData"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto L5f
            r7 = 0
            goto L60
        L55:
            java.lang.String r0 = "showToast"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto L5f
            r7 = 2
            goto L60
        L5f:
            r7 = -1
        L60:
            if (r7 == 0) goto L9b
            if (r7 == r4) goto L6b
            if (r7 == r3) goto L67
            goto L83
        L67:
            r6.mo3742a(r8)     // Catch: java.lang.Throwable -> Lcb
            goto L83
        L6b:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            r7.<init>(r8)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            java.lang.String r8 = "code"
            int r8 = r7.getInt(r8)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            java.lang.String r9 = "content"
            java.lang.String r7 = r7.optString(r9)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            if (r8 == r5) goto L8d
            if (r8 == 0) goto L84
            r6.mo3741a(r8, r7)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
        L83:
            return
        L84:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            r8.<init>(r7)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            r6.mo3743a(r8)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            goto Ldd
        L8d:
            r6.mo3744b()     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Lcb
            goto Ldd
        L91:
            r7 = move-exception
            r8 = -2
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lcb
            r6.mo3741a(r8, r7)     // Catch: java.lang.Throwable -> Lcb
            goto Ldd
        L9b:
            java.lang.String r7 = r6.mo3740a()     // Catch: java.lang.Throwable -> Lcb
            android.webkit.WebView r8 = r6.f3324a     // Catch: java.lang.Throwable -> Lcb
            if (r8 == 0) goto Ldd
            android.webkit.WebView r8 = r6.f3324a     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "javascript:"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lcb
            r0.append(r9)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r9 = "("
            r0.append(r9)     // Catch: java.lang.Throwable -> Lcb
            r0.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = ")"
            r0.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> Lcb
            c.a.p.a.f.j r9 = new c.a.p.a.f.j     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lcb
            r2 = 0
            r8.postDelayed(r9, r2)     // Catch: java.lang.Throwable -> Lcb
            goto Ldd
        Lcb:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "exec e:"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3725h(r1, r7)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p080f.AbstractC0735c.exec(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
