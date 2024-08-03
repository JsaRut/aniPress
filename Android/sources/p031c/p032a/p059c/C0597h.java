package p031c.p032a.p059c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p060d.C0598a;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p096v.C0853i;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.c.h */
/* loaded from: classes.dex */
public final class C0597h {

    /* renamed from: a */
    private static Boolean f2848a;

    /* renamed from: a */
    private static String m3061a(Context context) {
        if (context == null) {
            return "-1";
        }
        if (!m3063b(context) || ((Integer) C0867b.m4225a(context, C0866a.m4210k())).intValue() == 1) {
            C0601d.m3072b("LocalShareProcessHelper", "[getTypeJson]share process is close by action");
            return "-4";
        }
        if (!C0592c.m3025a().m3036d()) {
            C0601d.m3072b("LocalShareProcessHelper", "getAttachJson,is not support jpush or jmessage ");
            return "-7";
        }
        int intValue = ((Integer) C0867b.m4225a(context, C0866a.m4205f())).intValue();
        if (intValue < 0) {
            C0601d.m3072b("LocalShareProcessHelper", "[getTypeJson]idc<0,need login to get it");
            return "-3";
        }
        long longValue = ((Long) C0867b.m4225a(context, C0866a.m4202c())).longValue();
        if (longValue <= 0) {
            C0601d.m3072b("LocalShareProcessHelper", "[getTypeJson]uid<=0,need login to get it");
            return "-2";
        }
        String str = (String) C0867b.m4225a(context, C0866a.m4208i());
        long longValue2 = ((Long) C0867b.m4225a(context, C0866a.m4209j())).longValue();
        String m3050b = C0595f.m3050b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("u", longValue);
            jSONObject.put("p", C0867b.m4225a(context, C0866a.m4204e()));
            jSONObject.put("ud", str);
            jSONObject.put("ak", m3050b);
            jSONObject.put("idc", intValue);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("sv", 212);
            jSONObject.put("uct", longValue2);
            return C0853i.m4151a(jSONObject.toString());
        } catch (JSONException unused) {
            C0601d.m3072b("LocalShareProcessHelper", "[getTypeJson] to json error");
            return "2.1.2";
        }
    }

    /* renamed from: a */
    public static String m3062a(Context context, Uri uri) {
        String queryParameter;
        if (uri == null) {
            return "2.1.2";
        }
        try {
            queryParameter = uri.getQueryParameter("kpgt");
        } catch (Throwable th) {
            C0601d.m3077f("LocalShareProcessHelper", "parseUriFromProvider failed:" + th.getMessage());
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return "2.1.2";
        }
        String m4155b = C0853i.m4155b(queryParameter);
        if (TextUtils.isEmpty(m4155b)) {
            return "-6";
        }
        JSONObject jSONObject = new JSONObject(m4155b);
        String optString = jSONObject.optString("kta");
        C0601d.m3072b("LocalShareProcessHelper", "action:" + optString);
        if (!TextUtils.isEmpty(optString)) {
            if (optString.equals("asai")) {
                return m3061a(context);
            }
            if (optString.equals("asm")) {
                C0601d.m3072b("LocalShareProcessHelper", "recv msg:" + jSONObject.toString());
                if (m3063b(context) && ((Integer) C0867b.m4225a(context, C0866a.m4210k())).intValue() != 1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("data", jSONObject.toString());
                    C0595f.m3048a(context, C0583a.f2797d, "asm", bundle);
                    return "0";
                }
                C0601d.m3072b("LocalShareProcessHelper", "share process is closed!");
                return "-4";
            }
            if (optString.equals("asmr")) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("data", jSONObject.toString());
                C0595f.m3048a(context, C0583a.f2797d, "asmr", bundle2);
            }
        }
        return "2.1.2";
    }

    /* renamed from: b */
    private static boolean m3063b(Context context) {
        Boolean bool = f2848a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            C0601d.m3077f("LocalShareProcessHelper", "context is null");
            return true;
        }
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("cn.jiguang.android.share.close");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            f2848a = queryIntentServices == null || queryIntentServices.isEmpty();
            return f2848a.booleanValue();
        } catch (Throwable unused) {
            C0598a.m3064a("JCore", "LocalShareProcessHelper", false, 3, "Get isShareProcessModeOpen error#");
            return true;
        }
    }
}
