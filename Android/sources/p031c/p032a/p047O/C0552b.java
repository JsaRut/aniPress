package p031c.p032a.p047O;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0815d;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.O.b */
/* loaded from: classes.dex */
public final class C0552b {
    /* renamed from: a */
    public static JSONObject m2875a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                synchronized (str) {
                    Object m4072a = C0831g.m4072a(context, "JCOMMON", 42, null, null, str);
                    if (!(m4072a instanceof JSONObject)) {
                        return null;
                    }
                    return (JSONObject) m4072a;
                }
            } catch (Throwable th) {
                C0675a.m3475g("JCommonFileHelper", "readJson throwable:" + th.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m2876a(File file, ZipOutputStream zipOutputStream, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.trim().length() == 0 ? "" : File.separator);
            sb.append(file.getName());
            String str2 = new String(sb.toString().getBytes("8859_1"), "GB2312");
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        m2876a(file2, zipOutputStream, str2);
                    }
                    return;
                }
                return;
            }
            byte[] bArr = new byte[1048576];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1048576);
            zipOutputStream.putNextEntry(new ZipEntry(str2));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    bufferedInputStream.close();
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    return;
                }
                zipOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            C0675a.m3475g("JCommonFileHelper", "zipFile throwable:" + th.getMessage());
        }
    }

    /* renamed from: a */
    public static void m2877a(Collection<File> collection, File file) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1048576));
        Iterator<File> it = collection.iterator();
        while (it.hasNext()) {
            m2876a(it.next(), zipOutputStream, "");
        }
        zipOutputStream.close();
    }

    /* renamed from: a */
    public static boolean m2878a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                synchronized (str) {
                    File m2717a = C0513h.m2717a(context, str);
                    if (m2717a == null) {
                        return false;
                    }
                    return C0815d.m3966a(m2717a, str2);
                }
            } catch (Throwable th) {
                C0675a.m3475g("JCommonFileHelper", "writeString throwable:" + th.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2879a(Context context, String str, JSONObject jSONObject) {
        boolean booleanValue;
        if (context != null && !TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                synchronized (str) {
                    Object m4072a = C0831g.m4072a(context, "JCOMMON", 41, null, null, str, jSONObject);
                    booleanValue = m4072a instanceof Boolean ? ((Boolean) m4072a).booleanValue() : false;
                }
                return booleanValue;
            } catch (Throwable th) {
                C0675a.m3475g("JCommonFileHelper", "writeJson throwable:" + th.getMessage());
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m2880b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                synchronized (str) {
                    File m2717a = C0513h.m2717a(context, str);
                    if (m2717a == null) {
                        return null;
                    }
                    return C0815d.m3968b(m2717a);
                }
            } catch (Throwable th) {
                C0675a.m3475g("JCommonFileHelper", "readString throwable:" + th.getMessage());
            }
        }
        return null;
    }
}
