package p031c.p101b.p102a.p115m;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.m.c */
/* loaded from: classes.dex */
public class C0940c {
    /* renamed from: a */
    public static File m4732a(Context context, String str) {
        File filesDir;
        if (context != null && (filesDir = context.getFilesDir()) != null) {
            return new File(filesDir, str);
        }
        C0923b.m4653i("FileUtils", "can't get file :" + str);
        return null;
    }

    /* renamed from: a */
    public static Object m4733a(File file) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (file == null || !file.exists() || file.isDirectory()) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Object readObject = objectInputStream.readObject();
            C0943f.m4755a((Closeable) objectInputStream);
            return readObject;
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            C0943f.m4755a((Closeable) objectInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m4734a(Context context) {
        File[] listFiles;
        File m4732a = m4732a(context, "rich");
        if (m4732a != null && m4732a.exists() && m4732a.isDirectory() && (listFiles = m4732a.listFiles()) != null && listFiles.length > 10) {
            Arrays.sort(listFiles, new C0939b());
            m4745c(listFiles[listFiles.length - 1]);
        }
    }

    /* renamed from: a */
    public static boolean m4735a(File file, Object obj) {
        if (file == null || file.isDirectory()) {
            C0923b.m4653i("FileUtils", "file should not be null or a directory");
            return false;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                m4741b(file);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file));
                try {
                    objectOutputStream2.writeObject(obj);
                    C0943f.m4755a(objectOutputStream2);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    C0943f.m4755a(objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    public static boolean m4736a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Throwable th) {
            C0923b.m4653i("FileUtils", "FileUtils e:" + th);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4737a(String str, String str2) {
        byte[] bytes;
        if (str2 != null) {
            try {
                bytes = str2.getBytes("UTF-8");
            } catch (Exception e2) {
                C0923b.m4653i("FileUtils", "getBytes exception:" + e2);
                return false;
            }
        } else {
            bytes = null;
        }
        return m4743b(str, bytes);
    }

    /* renamed from: a */
    public static boolean m4738a(String str, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return m4743b(str, bArr);
    }

    /* renamed from: b */
    public static String m4739b(Context context, String str) {
        try {
            File m4732a = m4732a(context, str);
            if (m4732a == null) {
                C0923b.m4653i("FileUtils", str + " can't be null");
                return "";
            }
            if (m4732a.isFile()) {
                m4732a.delete();
            }
            if (!m4732a.exists()) {
                m4732a.mkdirs();
            }
            return m4732a.getAbsolutePath() + File.separator;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m4740b(String str) {
        return TextUtils.isEmpty(str) ? "" : str.substring(str.lastIndexOf("/") + 1);
    }

    /* renamed from: b */
    public static void m4741b(File file) {
        if (file == null || file.exists()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m4742b(String str, String str2) {
        C0923b.m4651g("FileUtils", "action:createHtmlFile - filePath:" + str + ", content:" + str2);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return m4737a(str, str2);
    }

    /* renamed from: b */
    private static boolean m4743b(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                m4741b(file);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    C0943f.m4755a(fileOutputStream2);
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    C0923b.m4653i("FileUtils", "save to file exception:" + e + " path = " + str);
                    C0943f.m4755a(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C0943f.m4755a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: c */
    public static String m4744c(Context context, String str) {
        try {
            if (!C0938a.m4714a()) {
                m4734a(context);
                return m4739b(context, "rich" + File.separator + str);
            }
            String str2 = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + str + File.separator;
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            return str2;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m4745c(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
            if (file.isFile()) {
                return file.delete();
            }
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    File file2 = new File(file, str);
                    if (file2.isDirectory()) {
                        m4745c(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            return file.delete();
        } catch (Exception unused) {
            C0923b.m4646c("FileUtils", "Delete dir error");
            return false;
        }
    }

    /* renamed from: d */
    public static String m4746d(Context context, String str) {
        try {
            if (!C0938a.m4714a()) {
                return "";
            }
            String str2 = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + str;
            if (new File(str2).exists()) {
                return str2;
            }
            C0923b.m4654j("FileUtils", "Can't find developer picture resource in SDCard.");
            return "";
        } catch (Throwable th) {
            C0923b.m4654j("FileUtils", "Get developer picture resource failed.");
            th.printStackTrace();
            return "";
        }
    }
}
