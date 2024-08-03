package p031c.p032a.p061e;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p031c.p032a.p059c.C0590a;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p095u.C0844a;
import p031c.p032a.p096v.C0845a;
import p031c.p032a.p096v.C0849e;
import p031c.p032a.p096v.C0850f;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.e.d */
/* loaded from: classes.dex */
public final class C0605d {

    /* renamed from: a */
    private static String f2868a;

    /* renamed from: b */
    private static String f2869b;

    /* renamed from: c */
    private static ConcurrentHashMap<File, Boolean> f2870c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final AtomicBoolean f2871d = new AtomicBoolean(false);

    /* renamed from: a */
    public static File m3095a(Context context, String str, JSONObject jSONObject, boolean z) {
        File file = new File(m3110e(context) + str + File.separator + UUID.randomUUID().toString());
        if (z) {
            m3104b(file);
        }
        C0849e.m4136a(file, jSONObject.toString());
        return file;
    }

    /* renamed from: a */
    public static void m3097a(Context context) {
        C0850f c0850f = new C0850f(false, true, "jpush_stat_history", 1);
        String m3050b = C0595f.m3050b(context);
        File[] m4138a = C0849e.m4138a(context.getFilesDir(), c0850f, new C0606e());
        if (m4138a != null) {
            for (File file : m4138a) {
                try {
                    C0849e.m4141c(new File(file, "nowrap"));
                    File file2 = new File(file.getParent() + File.separator + m3050b + File.separator + file.getName());
                    if (!file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    file.renameTo(file2);
                } catch (Throwable th) {
                    C0601d.m3072b("updateByAppKey", "e=" + th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m3098a(Context context, File file) {
        C0601d.m3072b("ReportHistory", "upload space=" + m3111e(file));
        m3106c(context, file);
        m3109d(file);
        m3103b(context, file);
        m3107c(file);
    }

    /* renamed from: a */
    public static void m3099a(Context context, String... strArr) {
        FileFilter[] fileFilterArr = new FileFilter[2];
        for (int i = 0; i <= 0; i++) {
            fileFilterArr[1] = C0850f.m4143a(strArr[0]);
        }
        fileFilterArr[0] = new C0850f(false, true, "jpush_stat_history", 1);
        File[] m4138a = C0849e.m4138a(context.getFilesDir(), fileFilterArr);
        if (m4138a != null) {
            for (File file : m4138a) {
                C0849e.m4141c(file);
            }
        }
    }

    /* renamed from: a */
    public static void m3100a(File file) {
        if (file != null) {
            f2870c.remove(file);
        }
    }

    /* renamed from: b */
    private static Set<String> m3101b() {
        HashSet hashSet = new HashSet();
        hashSet.add("uid");
        hashSet.add("app_key");
        hashSet.add("sdk_ver");
        hashSet.add("channel");
        hashSet.add("app_version");
        JSONObject jSONObject = new JSONObject();
        C0590a.m3014a();
        C0590a.m3017a(jSONObject);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: b */
    public static void m3102b(Context context) {
        if (f2871d.get()) {
            C0601d.m3072b("ReportHistory", "isRunning, no need report");
        } else {
            C0844a.m4116a("REPORT_HISTORY", new RunnableC0607f(context));
        }
    }

    /* renamed from: b */
    private static void m3103b(Context context, File file) {
        if (((Long) C0867b.m4225a(context, C0866a.m4202c())).longValue() == 0) {
            C0601d.m3072b("ReportHistory", "can't get uid, skip upload history");
            return;
        }
        File[] m4138a = C0849e.m4138a(file, C0850f.f3598a);
        if (m4138a == null || m4138a.length == 0) {
            return;
        }
        LinkedList<File> linkedList = new LinkedList();
        for (File file2 : m4138a) {
            if (!Boolean.TRUE.equals(f2870c.get(file2))) {
                linkedList.add(file2);
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        C0601d.m3072b("ReportHistory", "process space=" + m3111e(file) + " history[" + linkedList.size() + "]");
        Collections.sort(linkedList, new C0608g());
        for (File file3 : linkedList) {
            try {
                JSONObject m3093a = C0604c.m3093a(file3);
                if (m3093a == null) {
                    C0849e.m4135a(file3);
                } else {
                    m3104b(file3);
                    Set<String> m3127a = C0612k.m3127a(m3093a);
                    C0601d.m3072b("ReportHistory", "report history types=" + m3127a);
                    if (C0612k.m3120a(context, m3127a, m3093a, file3, null) == -2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                C0601d.m3077f("ReportHistory", "upload e:" + th);
            }
        }
    }

    /* renamed from: b */
    private static void m3104b(File file) {
        if (file != null) {
            f2870c.put(file, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: Throwable -> 0x007d, TryCatch #0 {Throwable -> 0x007d, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x0017, B:14:0x002a, B:18:0x002e, B:19:0x005e, B:21:0x0061, B:28:0x006c, B:27:0x0073, B:34:0x0078), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[Catch: Throwable -> 0x007d, TRY_LEAVE, TryCatch #0 {Throwable -> 0x007d, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x0017, B:14:0x002a, B:18:0x002e, B:19:0x005e, B:21:0x0061, B:28:0x006c, B:27:0x0073, B:34:0x0078), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m3106c(android.content.Context r6, java.io.File r7) {
        /*
            java.lang.String r0 = "ReportHistory"
            org.json.JSONObject r6 = p031c.p032a.p061e.C0612k.m3129a(r6)     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L13
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L7d
            if (r3 != 0) goto L11
            goto L13
        L11:
            r3 = 0
            goto L14
        L13:
            r3 = 1
        L14:
            if (r3 == 0) goto L17
            return
        L17:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "nowrap"
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L7d
            java.io.FileFilter[] r4 = new java.io.FileFilter[r2]     // Catch: java.lang.Throwable -> L7d
            c.a.v.f r5 = p031c.p032a.p096v.C0850f.f3598a     // Catch: java.lang.Throwable -> L7d
            r4[r1] = r5     // Catch: java.lang.Throwable -> L7d
            java.io.File[] r3 = p031c.p032a.p096v.C0849e.m4138a(r3, r4)     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L7c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L7d
            if (r4 != 0) goto L2e
            goto L7c
        L2e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "process space="
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = m3111e(r7)     // Catch: java.lang.Throwable -> L7d
            r4.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = " nowrap["
            r4.append(r5)     // Catch: java.lang.Throwable -> L7d
            int r5 = r3.length     // Catch: java.lang.Throwable -> L7d
            r4.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7d
            p031c.p032a.p060d.C0601d.m3072b(r0, r4)     // Catch: java.lang.Throwable -> L7d
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "tmp"
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L7d
            r7 = r3[r1]     // Catch: java.lang.Throwable -> L7d
            c.a.e.c r7 = p031c.p032a.p061e.C0604c.m3092a(r7, r6)     // Catch: java.lang.Throwable -> L7d
        L5e:
            int r1 = r3.length     // Catch: java.lang.Throwable -> L7d
            if (r2 >= r1) goto L76
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L7d
            c.a.e.c r1 = p031c.p032a.p061e.C0604c.m3092a(r1, r6)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L73
            if (r7 != 0) goto L6c
            goto L72
        L6c:
            boolean r5 = r7.m3094a(r1, r4)     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L73
        L72:
            r7 = r1
        L73:
            int r2 = r2 + 1
            goto L5e
        L76:
            if (r7 == 0) goto L7c
            r6 = 0
            r7.m3094a(r6, r4)     // Catch: java.lang.Throwable -> L7d
        L7c:
            return
        L7d:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "processNowrap e:"
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            p031c.p032a.p060d.C0601d.m3077f(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p061e.C0605d.m3106c(android.content.Context, java.io.File):void");
    }

    /* renamed from: c */
    private static void m3107c(File file) {
        int i = 0;
        File[] m4138a = C0849e.m4138a(file, C0850f.f3598a);
        if (m4138a == null || m4138a.length <= 1) {
            return;
        }
        List<File> asList = Arrays.asList(m4138a);
        Collections.sort(asList, new C0609h());
        for (File file2 : asList) {
            i = (int) (i + file2.length());
            if (i > 1048576) {
                C0849e.m4135a(file2);
            }
        }
        if (asList.size() < m4138a.length) {
            C0601d.m3072b("ReportHistory", "trim space history=" + m3111e(file) + "," + m4138a.length + " to " + asList.size());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: d */
    private static synchronized String m3108d(Context context) {
        String str;
        String replaceFirst;
        synchronized (C0605d.class) {
            if (!TextUtils.isEmpty(f2869b)) {
                return f2869b;
            }
            if (f2868a == null) {
                String m4118a = C0845a.m4118a(context);
                if (!TextUtils.isEmpty(m4118a)) {
                    if (m4118a.equals(context.getPackageName())) {
                        replaceFirst = "";
                    } else {
                        replaceFirst = m4118a.replaceFirst(context.getPackageName() + ":", "_");
                    }
                    f2868a = replaceFirst;
                }
            }
            if (f2868a != null) {
                str = "jpush_stat_history" + f2868a;
            } else {
                str = "jpush_stat_history";
            }
            File m4133a = C0849e.m4133a(context, str);
            if (m4133a != null) {
                String absolutePath = m4133a.getAbsolutePath();
                f2869b = absolutePath;
                return absolutePath;
            }
            return "jpush_stat_history" + f2868a;
        }
    }

    /* renamed from: d */
    private static void m3109d(File file) {
        try {
            File[] m4138a = C0849e.m4138a(new File(file, "tmp"), C0850f.f3598a);
            if (m4138a != null && m4138a.length != 0) {
                LinkedList linkedList = new LinkedList();
                for (File file2 : m4138a) {
                    if (!Boolean.TRUE.equals(f2870c.get(file2))) {
                        linkedList.add(file2);
                    }
                }
                if (linkedList.isEmpty()) {
                    return;
                }
                C0601d.m3072b("ReportHistory", "process space=" + m3111e(file) + " tmp[" + linkedList.size() + "]");
                Set<String> m3101b = m3101b();
                HashMap hashMap = new HashMap();
                C0604c m3091a = C0604c.m3091a(C0849e.m4134a(C0849e.m4138a(file, C0850f.f3598a)), m3101b);
                if (m3091a != null) {
                    hashMap.put(String.valueOf(m3091a.f2865d), m3091a);
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C0604c m3091a2 = C0604c.m3091a((File) it.next(), m3101b);
                    if (m3091a2 != null) {
                        String valueOf = String.valueOf(m3091a2.f2865d);
                        C0604c c0604c = (C0604c) hashMap.get(valueOf);
                        if (c0604c != null && c0604c.m3094a(m3091a2, file)) {
                        }
                        hashMap.put(valueOf, m3091a2);
                    }
                }
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    ((C0604c) it2.next()).m3094a((C0604c) null, file);
                }
            }
        } catch (Throwable th) {
            C0601d.m3077f("ReportHistory", "processTmp e:" + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static String m3110e(Context context) {
        String m3050b = C0595f.m3050b(context);
        if (TextUtils.isEmpty(m3050b)) {
            m3050b = "0";
        }
        return m3108d(context) + File.separator + m3050b;
    }

    /* renamed from: e */
    private static String m3111e(File file) {
        try {
            File parentFile = file.getParentFile();
            return parentFile.getParentFile().getName() + File.separator + parentFile.getName() + File.separator + file.getName();
        } catch (Throwable unused) {
            return file.getAbsolutePath();
        }
    }
}
