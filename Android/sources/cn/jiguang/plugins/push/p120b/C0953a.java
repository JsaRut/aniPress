package cn.jiguang.plugins.push.p120b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.plugins.push.JPushModule;
import cn.jiguang.plugins.push.p119a.C0951a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import p031c.p101b.p102a.p104b.C0881d;
import p031c.p101b.p102a.p104b.C0884g;
import p031c.p101b.p102a.p104b.C0886i;

/* renamed from: cn.jiguang.plugins.push.b.a */
/* loaded from: classes.dex */
public class C0953a {
    /* renamed from: a */
    public static WritableMap m4769a(int i, C0884g c0884g) {
        String m4359c;
        String str;
        WritableMap createMap = Arguments.createMap();
        Set<String> m4364g = c0884g.m4364g();
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = m4364g.iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        createMap.putInt("code", c0884g.m4361d());
        createMap.putInt("sequence", c0884g.m4362e());
        if (i != 1) {
            if (i == 2) {
                createMap.putBoolean("tagEnable", c0884g.m4363f());
                m4359c = c0884g.m4359c();
                str = "tag";
            } else if (i == 3) {
                m4359c = c0884g.m4355b();
                str = "alias";
            }
            createMap.putString(str, m4359c);
        } else {
            createMap.putArray("tags", createArray);
        }
        return createMap;
    }

    /* renamed from: a */
    public static WritableMap m4770a(C0881d c0881d) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageID", c0881d.f3710a);
        createMap.putString("title", c0881d.f3714e);
        createMap.putString("content", c0881d.f3712c);
        m4774a(c0881d.f3711b, createMap);
        return createMap;
    }

    /* renamed from: a */
    public static WritableMap m4771a(String str, Bundle bundle) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("notificationEventType", str);
        createMap.putString("messageID", bundle.getString("cn.jpush.android.MSG_ID", ""));
        createMap.putString("title", bundle.getString("cn.jpush.android.NOTIFICATION_CONTENT_TITLE", ""));
        createMap.putString("content", bundle.getString("cn.jpush.android.ALERT", ""));
        m4774a(bundle.getString("cn.jpush.android.EXTRA", ""), createMap);
        return createMap;
    }

    /* renamed from: a */
    public static WritableMap m4772a(String str, C0886i c0886i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("notificationEventType", str);
        createMap.putString("messageID", c0886i.f3754b);
        createMap.putString("title", c0886i.f3757e);
        createMap.putString("content", c0886i.f3755c);
        m4774a(c0886i.f3760h, createMap);
        return createMap;
    }

    /* renamed from: a */
    public static void m4773a(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            launchIntentForPackage.setFlags(872415232);
            context.startActivity(launchIntentForPackage);
        } catch (Throwable unused) {
            C0951a.m4765b("");
        }
    }

    /* renamed from: a */
    public static void m4774a(String str, WritableMap writableMap) {
        if (TextUtils.isEmpty(str) || str.equals("{}")) {
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                createMap.putString(next, jSONObject.getString(next));
            }
            writableMap.putMap("extras", createMap);
        } catch (Throwable th) {
            C0951a.m4766c("convertExtras error:" + th.getMessage());
        }
    }

    /* renamed from: b */
    public static void m4775b(String str, WritableMap writableMap) {
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) JPushModule.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        } catch (Throwable th) {
            C0951a.m4765b("sendEvent error:" + th.getMessage());
        }
    }
}
