package p031c.p032a.p046N;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p031c.p032a.p045M.C0544b;
import p031c.p032a.p048P.p049a.C0557c;

@SuppressLint({"MissingPermission"})
/* renamed from: c.a.N.f */
/* loaded from: classes.dex */
public final class C0550f {

    /* renamed from: a */
    private static int f2697a;

    /* renamed from: a */
    private static int m2861a(int i) {
        try {
            Method declaredMethod = Class.forName("android.telephony.SubscriptionManager").getDeclaredMethod("getSubId", Integer.TYPE);
            declaredMethod.setAccessible(true);
            int[] iArr = (int[]) declaredMethod.invoke(null, Integer.valueOf(i));
            return iArr.length > 0 ? iArr[0] : i;
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    private static int m2862a(TelephonyManager telephonyManager) {
        try {
            return ((Integer) telephonyManager.getClass().getMethod("getSimCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static ArrayList<C0544b> m2863a(Context context) {
        if (C0557c.m2903a(context, false, "do not get sim info")) {
            return null;
        }
        int i = f2697a;
        if ((i == 0 || i == 1) && m2864a()) {
            f2697a = 1;
            return m2865b(context);
        }
        int i2 = f2697a;
        if ((i2 == 0 || i2 == 2) && m2867c(context)) {
            f2697a = 2;
            return m2868d(context);
        }
        int i3 = f2697a;
        if ((i3 == 0 || i3 == 3) && m2869e(context)) {
            f2697a = 3;
            return m2870f(context);
        }
        int i4 = f2697a;
        if ((i4 == 0 || i4 == 4) && m2871g(context)) {
            f2697a = 4;
            return m2872h(context);
        }
        f2697a = 1;
        return m2865b(context);
    }

    /* renamed from: a */
    private static boolean m2864a() {
        try {
            return TelephonyManager.class.getMethod("getSimCount", new Class[0]) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static ArrayList<C0544b> m2865b(Context context) {
        ArrayList<C0544b> arrayList = new ArrayList<>();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            int m2862a = m2862a(telephonyManager);
            if (m2862a > 0) {
                try {
                    Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getImei", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = telephonyManager.getClass().getDeclaredMethod("getSimSerialNumber", Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    Method declaredMethod3 = telephonyManager.getClass().getDeclaredMethod("getSubscriberId", Integer.TYPE);
                    declaredMethod3.setAccessible(true);
                    for (int i = 0; i < m2862a; i++) {
                        int m2861a = m2861a(i);
                        C0544b c0544b = new C0544b();
                        try {
                            c0544b.f2683a = C0547c.m2841a((String) declaredMethod.invoke(telephonyManager, Integer.valueOf(i)));
                            c0544b.f2685c = (String) declaredMethod2.invoke(telephonyManager, Integer.valueOf(m2861a));
                            c0544b.f2684b = (String) declaredMethod3.invoke(telephonyManager, Integer.valueOf(m2861a));
                        } catch (Throwable unused) {
                        }
                        arrayList.add(c0544b);
                    }
                } catch (Throwable unused2) {
                    arrayList.clear();
                }
            }
        } catch (Throwable unused3) {
            arrayList.clear();
        }
        return arrayList;
    }

    /* renamed from: b */
    private static ArrayList<Integer> m2866b(TelephonyManager telephonyManager) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            int i = 0;
            for (Field field : TelephonyManager.class.getDeclaredFields()) {
                field.setAccessible(true);
                if (TextUtils.equals(field.getType().getName(), "com.android.internal.telephony.ITelephonyRegistry") && field.get(telephonyManager) != null) {
                    arrayList.add(Integer.valueOf(i));
                    i++;
                }
            }
        } catch (Throwable unused) {
            arrayList.clear();
            arrayList.add(0);
            arrayList.add(1);
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m2867c(Context context) {
        try {
            m2866b((TelephonyManager) context.getSystemService("phone"));
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubscriberIdGemini", Integer.TYPE);
            Method declaredMethod2 = TelephonyManager.class.getDeclaredMethod("getDeviceIdGemini", Integer.TYPE);
            Method declaredMethod3 = TelephonyManager.class.getDeclaredMethod("getPhoneTypeGemini", Integer.TYPE);
            Field declaredField = TelephonyManager.class.getDeclaredField("mtkGeminiSupport");
            if (declaredMethod != null && declaredMethod2 != null && declaredMethod3 != null && declaredField != null) {
                declaredField.setAccessible(true);
                if (((Boolean) declaredField.get(null)).booleanValue()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: d */
    private static ArrayList<C0544b> m2868d(Context context) {
        ArrayList<C0544b> arrayList = new ArrayList<>();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubscriberIdGemini", Integer.TYPE);
            Method declaredMethod2 = TelephonyManager.class.getDeclaredMethod("getDeviceIdGemini", Integer.TYPE);
            Method declaredMethod3 = TelephonyManager.class.getDeclaredMethod("getSimSerialNumberGemini", Integer.TYPE);
            ArrayList<Integer> m2866b = m2866b(telephonyManager);
            for (int i = 0; i < m2866b.size(); i++) {
                C0544b c0544b = new C0544b();
                try {
                    int intValue = m2866b.get(i).intValue();
                    c0544b.f2684b = (String) declaredMethod.invoke(telephonyManager, Integer.valueOf(intValue));
                    c0544b.f2683a = C0547c.m2841a((String) declaredMethod2.invoke(telephonyManager, Integer.valueOf(intValue)));
                    c0544b.f2685c = (String) declaredMethod3.invoke(telephonyManager, Integer.valueOf(intValue));
                } catch (Throwable unused) {
                }
                arrayList.add(c0544b);
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: e */
    private static boolean m2869e(Context context) {
        Class<?> cls;
        try {
            cls = Class.forName("android.telephony.MSimTelephonyManager");
        } catch (Throwable unused) {
        }
        return (context.getSystemService("phone_msim") == null || cls.getMethod("getDeviceId", Integer.TYPE) == null || cls.getMethod("getSubscriberId", Integer.TYPE) == null) ? false : true;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: f */
    private static ArrayList<C0544b> m2870f(Context context) {
        ArrayList<C0544b> arrayList = new ArrayList<>();
        try {
            Class<?> cls = Class.forName("android.telephony.MSimTelephonyManager");
            Object systemService = context.getSystemService("phone_msim");
            Method method = cls.getMethod("getDeviceId", Integer.TYPE);
            Method method2 = cls.getMethod("getSubscriberId", Integer.TYPE);
            C0544b c0544b = new C0544b();
            try {
                c0544b.f2683a = C0547c.m2841a((String) method.invoke(systemService, 0));
                c0544b.f2684b = (String) method2.invoke(systemService, 0);
            } catch (Throwable unused) {
            }
            arrayList.add(c0544b);
            C0544b c0544b2 = new C0544b();
            try {
                c0544b2.f2683a = C0547c.m2841a((String) method.invoke(systemService, 1));
                c0544b2.f2684b = (String) method2.invoke(systemService, 1);
            } catch (Throwable unused2) {
            }
            arrayList.add(c0544b2);
            return arrayList;
        } catch (Throwable unused3) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: g */
    private static boolean m2871g(Context context) {
        Method method;
        String str;
        try {
            Class<?> cls = Class.forName("com.android.internal.telephony.PhoneFactory");
            method = cls.getMethod("getServiceName", String.class, Integer.TYPE);
            str = (String) method.invoke(cls, "phone", 1);
        } catch (Throwable unused) {
        }
        return (method == null || str == null || ((TelephonyManager) context.getSystemService(str)) == null) ? false : true;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: h */
    private static ArrayList<C0544b> m2872h(Context context) {
        ArrayList<C0544b> arrayList = new ArrayList<>();
        try {
            Class<?> cls = Class.forName("com.android.internal.telephony.PhoneFactory");
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService((String) cls.getMethod("getServiceName", String.class, Integer.TYPE).invoke(cls, "phone", 1));
            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
            C0544b c0544b = new C0544b();
            try {
                c0544b.f2684b = telephonyManager2.getSubscriberId();
                c0544b.f2683a = telephonyManager2.getDeviceId();
                c0544b.f2685c = telephonyManager2.getSimSerialNumber();
            } catch (Throwable unused) {
            }
            arrayList.add(c0544b);
            C0544b c0544b2 = new C0544b();
            try {
                c0544b2.f2684b = telephonyManager.getSubscriberId();
                c0544b2.f2683a = telephonyManager.getDeviceId();
                c0544b2.f2685c = telephonyManager.getSimSerialNumber();
            } catch (Throwable unused2) {
            }
            arrayList.add(c0544b2);
            return arrayList;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
