package p031c.p032a.p042J;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import p031c.p032a.p091r.C0822k;

/* renamed from: c.a.J.d */
/* loaded from: classes.dex */
public class C0537d {
    /* renamed from: a */
    public static C0536c m2800a(Context context, C0535b c0535b) {
        return m2801a(context, c0535b, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:            if (r12 == null) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027a, code lost:            if (r12 == null) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x027c, code lost:            r12.disconnect();     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024d, code lost:            if (r12 != null) goto L124;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139 A[Catch: all -> 0x016f, StackOverflowError -> 0x0175, Exception -> 0x0179, IOException -> 0x017f, MalformedURLException -> 0x0185, TryCatch #10 {all -> 0x016f, blocks: (B:30:0x0107, B:34:0x010f, B:52:0x0115, B:54:0x011b, B:39:0x0129, B:41:0x012f, B:43:0x0139, B:45:0x0145), top: B:29:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145 A[Catch: all -> 0x016f, StackOverflowError -> 0x0175, Exception -> 0x0179, IOException -> 0x017f, MalformedURLException -> 0x0185, TRY_LEAVE, TryCatch #10 {all -> 0x016f, blocks: (B:30:0x0107, B:34:0x010f, B:52:0x0115, B:54:0x011b, B:39:0x0129, B:41:0x012f, B:43:0x0139, B:45:0x0145), top: B:29:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0288  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p031c.p032a.p042J.C0536c m2801a(android.content.Context r10, p031c.p032a.p042J.C0535b r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p042J.C0537d.m2801a(android.content.Context, c.a.J.b, boolean):c.a.J.c");
    }

    /* renamed from: a */
    public static String m2802a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        String m2803a = m2803a(map);
        if (!TextUtils.isEmpty(m2803a)) {
            sb.append("?");
            sb.append(m2803a);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m2803a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder("");
        if (map != null && map.size() > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Map.Entry<String, String> next = it.next();
                    sb.append(next.getKey());
                    sb.append("=");
                    sb.append(URLEncoder.encode(next.getValue(), "UTF-8"));
                    if (it.hasNext()) {
                        sb.append("&");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static HttpURLConnection m2804a(Context context, String str) {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        URL url = new URL(str);
        if (context != null) {
            try {
                if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0 && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null && (extraInfo.equals("cmwap") || extraInfo.equals("3gwap") || extraInfo.equals("uniwap"))) {
                    return (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.172", 80)));
                }
            } catch (Throwable unused) {
            }
        }
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    public static void m2805a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map == null || map.size() == 0 || httpURLConnection == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public static byte[] m2806a(InputStream inputStream) {
        return C0822k.m4017b(inputStream);
    }
}
