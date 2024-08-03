package cn.jpush.reactnativejanalytics;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import p031c.p032a.p072p.p073a.p075b.AbstractC0716h;
import p031c.p032a.p072p.p073a.p075b.C0708a;
import p031c.p032a.p072p.p073a.p075b.C0711c;
import p031c.p032a.p072p.p073a.p075b.C0712d;
import p031c.p032a.p072p.p073a.p075b.C0713e;
import p031c.p032a.p072p.p073a.p075b.C0717i;
import p031c.p032a.p072p.p073a.p075b.C0718j;
import p031c.p032a.p072p.p073a.p075b.C0719k;
import p031c.p032a.p072p.p073a.p075b.C0720l;
import p031c.p032a.p072p.p073a.p075b.EnumC0714f;

/* loaded from: classes.dex */
public class JAnalyticsModule extends ReactContextBaseJavaModule {
    private static final String JANALYTICS_NAME = "RCTJAnalyticsModule";

    public JAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void sendEvent(AbstractC0716h abstractC0716h, ReadableMap readableMap) {
        ReadableMap map = readableMap.getMap("extra");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            abstractC0716h.m3639a(nextKey, map.getString(nextKey));
        }
        C0971c.m4825a("JAnalyticsModule", "sending event: " + abstractC0716h);
        C0717i.m3647a(getReactApplicationContext(), abstractC0716h);
    }

    @ReactMethod
    public void crashLogOFF() {
        C0717i.m3652c(getReactApplicationContext());
    }

    @ReactMethod
    public void crashLogON() {
        C0717i.m3650b(getReactApplicationContext());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return JANALYTICS_NAME;
    }

    @ReactMethod
    public void identifyAccount(ReadableMap readableMap, Callback callback, Callback callback2) {
        C0971c.m4826b(JANALYTICS_NAME, "Stopping page statistics");
        String string = readableMap.getString("accountID");
        long j = readableMap.getInt("creationTime");
        String string2 = readableMap.getString("name");
        int i = readableMap.getInt("sex");
        int i2 = readableMap.getInt("paid");
        String string3 = readableMap.getString("birthdate");
        String string4 = readableMap.getString("phone");
        String string5 = readableMap.getString("email");
        String string6 = readableMap.getString("weiboID");
        String string7 = readableMap.getString("wechatID");
        String string8 = readableMap.getString("qqID");
        ReadableMap map = readableMap.getMap("extras");
        C0708a c0708a = new C0708a(string);
        c0708a.m3621a(Long.valueOf(j));
        c0708a.m3626c(string2);
        c0708a.m3624b(Integer.valueOf(i));
        c0708a.m3620a(Integer.valueOf(i2));
        c0708a.m3622a(string3);
        c0708a.m3627d(string4);
        c0708a.m3625b(string5);
        c0708a.m3630g(string6);
        c0708a.m3629f(string7);
        c0708a.m3628e(string8);
        if (map != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                c0708a.m3623a(nextKey, map.getString(nextKey));
            }
        }
        C0717i.m3646a(getCurrentActivity(), c0708a, new C0969a(this, callback, callback2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactMethod
    public void postEvent(ReadableMap readableMap) {
        char c2;
        AbstractC0716h c0718j;
        String string = readableMap.getString("type");
        switch (string.hashCode()) {
            case -1380604278:
                if (string.equals("browse")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -690213213:
                if (string.equals("register")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 94851343:
                if (string.equals("count")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 103149417:
                if (string.equals("login")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1743324417:
                if (string.equals("purchase")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            c0718j = new C0718j(readableMap.getString("method"), readableMap.getBoolean("success"));
        } else {
            if (c2 != 1) {
                if (c2 != 2) {
                    if (c2 == 3) {
                        sendEvent(new C0711c(readableMap.getString("id"), readableMap.getString("name"), readableMap.getString("contentType"), (float) readableMap.getDouble("duration")), readableMap);
                        return;
                    } else if (c2 != 4) {
                        sendEvent(new C0712d(readableMap.getString("id"), readableMap.getDouble("value")), readableMap);
                        return;
                    } else {
                        sendEvent(new C0713e(readableMap.getString("id")), readableMap);
                        return;
                    }
                }
                String string2 = readableMap.getString("goodsId");
                String string3 = readableMap.getString("goodsType");
                String string4 = readableMap.getString("goodsName");
                double d2 = readableMap.getDouble("price");
                boolean z = readableMap.getBoolean("success");
                String string5 = readableMap.getString("currency");
                int i = readableMap.getInt("count");
                sendEvent(string5.equals(EnumC0714f.CNY.name()) ? new C0719k(string2, string4, d2, z, EnumC0714f.CNY, string3, i) : new C0719k(string2, string4, d2, z, EnumC0714f.USD, string3, i), readableMap);
                return;
            }
            c0718j = new C0720l(readableMap.getString("method"), readableMap.getBoolean("success"));
        }
        sendEvent(c0718j, readableMap);
    }

    @ReactMethod
    public void setAnalyticsReportPeriod(ReadableMap readableMap) {
        C0717i.m3645a(getCurrentActivity(), readableMap.getInt("period"));
    }

    @ReactMethod
    public void setChannel(ReadableMap readableMap) {
        String string = readableMap.getString("channel");
        C0971c.m4826b(JANALYTICS_NAME, "setChannel" + string);
        C0717i.m3653c(getCurrentActivity(), string);
    }

    @ReactMethod
    public void setup(ReadableMap readableMap) {
        C0717i.m3644a(getReactApplicationContext());
    }

    @ReactMethod
    public void startLogPageView(ReadableMap readableMap) {
        C0971c.m4826b(JANALYTICS_NAME, "Starting page statistics");
        String string = readableMap.getString("pageName");
        if (getCurrentActivity() != null) {
            C0717i.m3651b(getCurrentActivity(), string);
        }
    }

    @ReactMethod
    public void stopLogPageView(ReadableMap readableMap) {
        C0971c.m4826b(JANALYTICS_NAME, "Stopping page statistics");
        String string = readableMap.getString("pageName");
        if (getCurrentActivity() != null) {
            C0717i.m3648a(getCurrentActivity(), string);
        }
    }
}
