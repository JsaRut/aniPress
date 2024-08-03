package p031c.p032a.p072p.p073a.p080f.p083c;

import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;

/* renamed from: c.a.p.a.f.c.e */
/* loaded from: classes.dex */
public final class C0740e {

    /* renamed from: a */
    public static SSLContext f3339a;

    /* renamed from: b */
    public static TrustManager f3340b;

    /* renamed from: c */
    private static final SimpleDateFormat f3341c = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:            if (r6 == null) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a7, code lost:            return r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a4, code lost:            r6.disconnect();     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a2, code lost:            if (r6 == null) goto L74;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: IOException -> 0x012d, all -> 0x01a8, TryCatch #2 {all -> 0x01a8, blocks: (B:13:0x0024, B:47:0x0029, B:48:0x0062, B:50:0x0066, B:52:0x006a, B:16:0x0089, B:20:0x009a, B:22:0x00a7, B:23:0x00ae, B:25:0x00b4, B:26:0x00bb, B:28:0x00d6, B:29:0x00f3, B:30:0x00f9, B:32:0x00ff, B:34:0x0108, B:45:0x00e5, B:55:0x0044, B:56:0x0050, B:58:0x0055, B:61:0x0131, B:63:0x014e, B:64:0x0155, B:66:0x0159, B:68:0x015d, B:71:0x0184), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4 A[Catch: IOException -> 0x012d, all -> 0x01a8, TryCatch #2 {all -> 0x01a8, blocks: (B:13:0x0024, B:47:0x0029, B:48:0x0062, B:50:0x0066, B:52:0x006a, B:16:0x0089, B:20:0x009a, B:22:0x00a7, B:23:0x00ae, B:25:0x00b4, B:26:0x00bb, B:28:0x00d6, B:29:0x00f3, B:30:0x00f9, B:32:0x00ff, B:34:0x0108, B:45:0x00e5, B:55:0x0044, B:56:0x0050, B:58:0x0055, B:61:0x0131, B:63:0x014e, B:64:0x0155, B:66:0x0159, B:68:0x015d, B:71:0x0184), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6 A[Catch: IOException -> 0x012d, all -> 0x01a8, TryCatch #2 {all -> 0x01a8, blocks: (B:13:0x0024, B:47:0x0029, B:48:0x0062, B:50:0x0066, B:52:0x006a, B:16:0x0089, B:20:0x009a, B:22:0x00a7, B:23:0x00ae, B:25:0x00b4, B:26:0x00bb, B:28:0x00d6, B:29:0x00f3, B:30:0x00f9, B:32:0x00ff, B:34:0x0108, B:45:0x00e5, B:55:0x0044, B:56:0x0050, B:58:0x0055, B:61:0x0131, B:63:0x014e, B:64:0x0155, B:66:0x0159, B:68:0x015d, B:71:0x0184), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff A[Catch: IOException -> 0x012d, all -> 0x01a8, LOOP:0: B:30:0x00f9->B:32:0x00ff, LOOP_END, TryCatch #2 {all -> 0x01a8, blocks: (B:13:0x0024, B:47:0x0029, B:48:0x0062, B:50:0x0066, B:52:0x006a, B:16:0x0089, B:20:0x009a, B:22:0x00a7, B:23:0x00ae, B:25:0x00b4, B:26:0x00bb, B:28:0x00d6, B:29:0x00f3, B:30:0x00f9, B:32:0x00ff, B:34:0x0108, B:45:0x00e5, B:55:0x0044, B:56:0x0050, B:58:0x0055, B:61:0x0131, B:63:0x014e, B:64:0x0155, B:66:0x0159, B:68:0x015d, B:71:0x0184), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108 A[EDGE_INSN: B:33:0x0108->B:34:0x0108 BREAK  A[LOOP:0: B:30:0x00f9->B:32:0x00ff], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[Catch: IOException -> 0x012d, all -> 0x01a8, TryCatch #2 {all -> 0x01a8, blocks: (B:13:0x0024, B:47:0x0029, B:48:0x0062, B:50:0x0066, B:52:0x006a, B:16:0x0089, B:20:0x009a, B:22:0x00a7, B:23:0x00ae, B:25:0x00b4, B:26:0x00bb, B:28:0x00d6, B:29:0x00f3, B:30:0x00f9, B:32:0x00ff, B:34:0x0108, B:45:0x00e5, B:55:0x0044, B:56:0x0050, B:58:0x0055, B:61:0x0131, B:63:0x014e, B:64:0x0155, B:66:0x0159, B:68:0x015d, B:71:0x0184), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0066 A[Catch: IOException -> 0x012d, all -> 0x01a8, TryCatch #2 {all -> 0x01a8, blocks: (B:13:0x0024, B:47:0x0029, B:48:0x0062, B:50:0x0066, B:52:0x006a, B:16:0x0089, B:20:0x009a, B:22:0x00a7, B:23:0x00ae, B:25:0x00b4, B:26:0x00bb, B:28:0x00d6, B:29:0x00f3, B:30:0x00f9, B:32:0x00ff, B:34:0x0108, B:45:0x00e5, B:55:0x0044, B:56:0x0050, B:58:0x0055, B:61:0x0131, B:63:0x014e, B:64:0x0155, B:66:0x0159, B:68:0x015d, B:71:0x0184), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p031c.p032a.p072p.p073a.p080f.p083c.C0738c m3757a(p031c.p032a.p072p.p073a.p080f.p083c.C0737b r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p080f.p083c.C0740e.m3757a(c.a.p.a.f.c.b, java.lang.String):c.a.p.a.f.c.c");
    }

    /* renamed from: a */
    private static void m3758a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map == null || map.size() == 0 || httpURLConnection == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!C0766h.m3817c(entry.getKey())) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }
}
