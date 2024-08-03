package cn.jiguang.plugins.push;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cn.jiguang.plugins.push.p119a.C0951a;
import cn.jiguang.plugins.push.p120b.C0953a;
import cn.jiguang.plugins.push.receiver.JPushBroadcastReceiver;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashSet;
import org.json.JSONObject;
import p031c.p101b.p102a.p104b.C0878a;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p109g.C0904a;

/* loaded from: classes.dex */
public class JPushModule extends ReactContextBaseJavaModule {
    public static boolean isAppForeground = false;
    public static ReactApplicationContext reactContext;

    public JPushModule(ReactApplicationContext reactApplicationContext) {
        super(reactContext);
        reactContext = reactApplicationContext;
    }

    public static void registerActivityLifecycle(Application application) {
        application.registerActivityLifecycleCallbacks(new C0950a());
    }

    @ReactMethod
    public void addLocalNotification(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        int i = readableMap.getInt("notificationID");
        int i2 = readableMap.getInt("notificationBuilderID");
        int i3 = readableMap.getInt("notificationTime");
        String string = readableMap.getString("notificationTitle");
        String string2 = readableMap.getString("notificationContent");
        JSONObject jSONObject = new JSONObject(readableMap.getMap("notificationExtra").toHashMap());
        C0904a c0904a = new C0904a();
        c0904a.m4477b(i);
        c0904a.m4480c(i2);
        c0904a.m4474a(i3);
        c0904a.m4481c(string);
        c0904a.m4475a(string2);
        c0904a.m4478b(jSONObject.toString());
        C0883f.m4315a(reactContext, c0904a);
    }

    @ReactMethod
    public void addTags(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        if (!readableMap.hasKey("tags")) {
            C0951a.m4766c("there are no tags");
            return;
        }
        ReadableArray array = readableMap.getArray("tags");
        int i = readableMap.getInt("sequence");
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < array.size(); i2++) {
            hashSet.add(array.getString(i2));
        }
        C0883f.m4313a(reactContext, i, hashSet);
    }

    @ReactMethod
    public void checkTagBindState(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        C0883f.m4312a(reactContext, readableMap.getInt("sequence"), readableMap.getString("tag"));
    }

    @ReactMethod
    public void cleanTags(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else {
            C0883f.m4310a((Context) reactContext, readableMap.getInt("sequence"));
        }
    }

    @ReactMethod
    public void clearAllNotifications() {
        C0883f.m4309a(reactContext);
    }

    @ReactMethod
    public void clearLocalNotifications() {
        C0883f.m4322b(reactContext);
    }

    @ReactMethod
    public void clearNotificationById(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("notificationID")) {
            C0951a.m4766c("there are no notificationID");
        } else {
            C0883f.m4323b((Context) reactContext, readableMap.getInt("notificationID"));
        }
    }

    @ReactMethod
    public void deleteAlias(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else {
            C0883f.m4329c(reactContext, readableMap.getInt("sequence"));
        }
    }

    @ReactMethod
    public void deleteGeofence(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("geoFenceID")) {
            C0951a.m4766c("there are no geoFenceID");
        } else {
            C0883f.m4316a(reactContext, readableMap.getString("geoFenceID"));
        }
    }

    @ReactMethod
    public void deleteTags(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        if (!readableMap.hasKey("tags")) {
            C0951a.m4766c("there are no tags");
            return;
        }
        ReadableArray array = readableMap.getArray("tags");
        int i = readableMap.getInt("sequence");
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < array.size(); i2++) {
            hashSet.add(array.getString(i2));
        }
        C0883f.m4325b(reactContext, i, hashSet);
    }

    @ReactMethod
    public void filterValidTags(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        if (!readableMap.hasKey("tags")) {
            C0951a.m4766c("there are no tags");
            return;
        }
        ReadableArray array = readableMap.getArray("tags");
        HashSet hashSet = new HashSet();
        for (int i = 0; i < array.size(); i++) {
            hashSet.add(array.getString(i));
        }
        C0883f.m4308a(hashSet);
    }

    @ReactMethod
    public void getAlias(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else {
            C0883f.m4334d(reactContext, readableMap.getInt("sequence"));
        }
    }

    @ReactMethod
    public void getAllTags(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else {
            C0883f.m4337e(reactContext, readableMap.getInt("sequence"));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JPushModule";
    }

    @ReactMethod
    public void getRegistrationID(Callback callback) {
        if (callback == null) {
            C0951a.m4766c("callback cant be null");
        } else {
            callback.invoke(C0883f.m4328c(reactContext));
        }
    }

    @ReactMethod
    public void getUdid(Callback callback) {
        if (callback == null) {
            C0951a.m4766c("callback cant be null");
        } else {
            callback.invoke(C0883f.m4333d(reactContext));
        }
    }

    @ReactMethod
    public void init() {
        C0883f.m4336e(reactContext);
        Bundle bundle = JPushBroadcastReceiver.f3994a;
        if (bundle != null) {
            C0953a.m4775b("NotificationEvent", C0953a.m4771a("notificationOpened", bundle));
            JPushBroadcastReceiver.f3994a = null;
        }
    }

    @ReactMethod
    public void initCrashHandler() {
        C0883f.m4339f(reactContext);
    }

    @ReactMethod
    public void isPushStopped(Callback callback) {
        boolean m4342g = C0883f.m4342g(reactContext);
        if (callback == null) {
            C0951a.m4766c("callback cant be null");
        } else {
            callback.invoke(Boolean.valueOf(m4342g));
        }
    }

    @ReactMethod
    public void onFragmentPause(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("fragmentName")) {
            C0951a.m4766c("there are no fragmentName");
        } else {
            C0883f.m4327b(reactContext, readableMap.getString("fragmentName"));
        }
    }

    @ReactMethod
    public void onFragmentResume(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("fragmentName")) {
            C0951a.m4766c("there are no fragmentName");
        } else {
            C0883f.m4332c(reactContext, readableMap.getString("fragmentName"));
        }
    }

    @ReactMethod
    public void onKillProcess() {
        C0883f.m4343h(reactContext);
    }

    @ReactMethod
    public void onPause() {
        C0883f.m4344i(reactContext);
    }

    @ReactMethod
    public void onResume() {
        C0883f.m4345j(reactContext);
    }

    @ReactMethod
    public void removeLocalNotification(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("notificationID")) {
            C0951a.m4766c("there are no notificationID");
        } else {
            C0883f.m4314a(reactContext, readableMap.getInt("notificationID"));
        }
    }

    @ReactMethod
    public void reportNotificationOpened(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        String string = readableMap.getString("notificationID");
        int i = readableMap.getInt("romType");
        if (i > 0) {
            C0883f.m4317a(reactContext, string, (byte) i);
        } else {
            C0883f.m4335d(reactContext, string);
        }
    }

    @ReactMethod
    public void requestPermission() {
        C0883f.m4346k(reactContext);
    }

    @ReactMethod
    public void resumePush() {
        C0883f.m4347l(reactContext);
    }

    @ReactMethod
    public void setAlias(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        C0883f.m4324b(reactContext, readableMap.getInt("sequence"), readableMap.getString("alias"));
    }

    @ReactMethod
    public void setChannel(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        String string = readableMap.getString("channel");
        if (TextUtils.isEmpty(string)) {
            C0951a.m4766c("params illegal");
        } else {
            C0883f.m4338e(reactContext, string);
        }
    }

    @ReactMethod
    public void setDebugMode(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else {
            if (!readableMap.getBoolean("debug")) {
                Log.w("react-native-JPush", "params illegal");
                return;
            }
            boolean z = readableMap.getBoolean("debug");
            C0883f.m4321a(z);
            C0951a.m4764a(z);
        }
    }

    @ReactMethod
    public void setDefaultPushNotificationBuilder(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else {
            C0883f.m4319a(new C0878a(reactContext));
        }
    }

    @ReactMethod
    public void setGeofenceInterval(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("geoFenceInterval")) {
            C0951a.m4766c("there are no geoFenceInterval");
        } else {
            C0883f.m4326b(reactContext, readableMap.getInt("geoFenceInterval"));
        }
    }

    @ReactMethod
    public void setLatestNotificationNumber(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("notificationMaxNumber")) {
            C0951a.m4766c("there are no notificationMaxNumber");
        } else {
            C0883f.m4340f(reactContext, readableMap.getInt("notificationMaxNumber"));
        }
    }

    @ReactMethod
    public void setMaxGeofenceNumber(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
        } else if (!readableMap.hasKey("geoFenceMaxNumber")) {
            C0951a.m4766c("there are no geoFenceMaxNumber");
        } else {
            C0883f.m4341g(reactContext, readableMap.getInt("geoFenceMaxNumber"));
        }
    }

    @ReactMethod
    public void setMobileNumber(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        C0883f.m4330c(reactContext, readableMap.getInt("sequence"), readableMap.getString("mobileNumber"));
    }

    @ReactMethod
    public void setPushNotificationBuilder(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        int i = readableMap.getInt("notificationBuilderID");
        C0883f.m4320a(Integer.valueOf(i), new C0878a(reactContext));
    }

    @ReactMethod
    public void setPushTime(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        ReadableArray array = readableMap.getArray("pushTimeDays");
        int i = readableMap.getInt("pushTimeStartHour");
        int i2 = readableMap.getInt("pushTimeEndHour");
        if (array == null || i == 0 || i2 == 0) {
            C0951a.m4766c("params cant be null");
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < array.size(); i3++) {
            int i4 = array.getInt(i3);
            if (i4 > 6 || i4 < 0) {
                C0951a.m4766c("params cant be null");
                return;
            }
            hashSet.add(Integer.valueOf(i4));
        }
        C0883f.m4318a(reactContext, hashSet, i, i2);
    }

    @ReactMethod
    public void setSilenceTime(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        int i = readableMap.getInt("silenceTimeStartHour");
        int i2 = readableMap.getInt("silenceTimeStartMinute");
        int i3 = readableMap.getInt("silenceTimeEndHour");
        int i4 = readableMap.getInt("silenceTimeEndMinute");
        if (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) {
            C0951a.m4766c("params cant be null");
        } else {
            C0883f.m4311a(reactContext, i, i2, i3, i4);
        }
    }

    @ReactMethod
    public void setTags(ReadableMap readableMap) {
        if (readableMap == null) {
            C0951a.m4766c("params cant be null");
            return;
        }
        if (!readableMap.hasKey("tags")) {
            C0951a.m4766c("there are no tags");
            return;
        }
        ReadableArray array = readableMap.getArray("tags");
        int i = readableMap.getInt("sequence");
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < array.size(); i2++) {
            hashSet.add(array.getString(i2));
        }
        C0883f.m4331c(reactContext, i, hashSet);
    }

    @ReactMethod
    public void stopCrashHandler() {
        C0883f.m4348m(reactContext);
    }

    @ReactMethod
    public void stopPush() {
        C0883f.m4349n(reactContext);
    }
}
