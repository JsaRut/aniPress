package p031c.p032a.p091r;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.d */
/* loaded from: classes.dex */
public final class C0815d {
    /* renamed from: a */
    public static void m3965a(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    file.delete();
                    C0675a.m3469c("FileUtils", "delete File:" + file.getPath());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m3966a(File file, String str) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes("UTF-8");
            } catch (Throwable th) {
                C0675a.m3475g("FileUtils", "getBytes exception:" + th);
                return false;
            }
        } else {
            bytes = null;
        }
        return m3967a(file, bytes);
    }

    /* renamed from: a */
    private static boolean m3967a(File file, byte[] bArr) {
        Throwable th;
        if (file == null || file.isDirectory()) {
            C0675a.m3475g("FileUtils", "file should not be null or a directory");
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (bArr == null) {
                try {
                    bArr = new byte[0];
                } catch (Throwable th2) {
                    th = th2;
                    C0675a.m3475g("FileUtils", "save to file exception:" + th + " path = " + file.getAbsolutePath());
                    C0822k.m4013a(fileOutputStream);
                    return false;
                }
            }
            if (file != null && !file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                try {
                    file.createNewFile();
                } catch (Throwable unused) {
                }
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                C0822k.m4013a(fileOutputStream2);
                return true;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                C0675a.m3475g("FileUtils", "save to file exception:" + th + " path = " + file.getAbsolutePath());
                C0822k.m4013a(fileOutputStream);
                return false;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: b */
    public static String m3968b(File file) {
        byte[] m3969c = m3969c(file);
        if (m3969c == null) {
            return null;
        }
        try {
            return new String(m3969c, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            C0675a.m3469c("FileUtils", "can't encoding, give up read :" + e2);
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m3969c(File file) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists() || file.isDirectory()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            try {
                byte[] m4015a = C0822k.m4015a((InputStream) fileInputStream);
                C0822k.m4013a((Closeable) fileInputStream);
                return m4015a;
            } catch (Throwable th2) {
                th = th2;
                C0822k.m4013a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C0675a.m3469c("FileUtils", "can't read, give up read. e:" + th);
            C0822k.m4013a((Closeable) fileInputStream);
            return null;
        }
    }
}
