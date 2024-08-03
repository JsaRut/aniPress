package p031c.p032a.p072p.p073a.p074a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.a.p.a.a.c */
/* loaded from: classes.dex */
public final class C0693c {

    /* renamed from: a */
    private static boolean f3192a = false;

    /* renamed from: b */
    private static final Map<String, String> f3193b = new HashMap();

    /* renamed from: c */
    private static final Map<String, String> f3194c = new HashMap();

    /* renamed from: d */
    private static final Map<String, String> f3195d = new HashMap();

    static {
        f3193b.put("fetch_bury", "https://ce3e75d5.jpush.cn/wi/cjc5tb");
        f3193b.put("go_2_bury", "https://ce3e75d5.jpush.cn/bury/#/resultPage");
        f3194c.put("fetch_bury", "http://office-test.jpushoa.com/sdk-config/wi/cjc5tb");
        f3194c.put("go_2_bury", "http://office-test.jpushoa.com/bury-h5/#/resultPage");
    }

    /* renamed from: a */
    public static String m3567a(String str) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f3192a) {
            String str2 = f3195d.get(str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            map = f3194c;
        } else {
            map = f3193b;
        }
        return map.get(str);
    }
}
