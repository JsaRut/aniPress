package p031c.p032a.p096v;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.LinkedList;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p091r.C0822k;

/* renamed from: c.a.v.e */
/* loaded from: classes.dex */
public final class C0849e {
    /* renamed from: a */
    public static File m4133a(Context context, String str) {
        File filesDir;
        if (context != null && (filesDir = context.getFilesDir()) != null) {
            return new File(filesDir, str);
        }
        C0601d.m3077f("FileUtils", "can't get file :" + str);
        return null;
    }

    /* renamed from: a */
    public static File m4134a(File[] fileArr) {
        File file = null;
        if (fileArr != null && fileArr.length != 0) {
            if (fileArr.length == 1) {
                return fileArr[0];
            }
            for (File file2 : fileArr) {
                if (file2.lastModified() > (file != null ? file.lastModified() : 0L)) {
                    file = file2;
                }
            }
        }
        return file;
    }

    /* renamed from: a */
    public static void m4135a(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    file.delete();
                    C0601d.m3072b("FileUtils", "delete File:" + file.getPath());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m4136a(File file, String str) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes("UTF-8");
            } catch (Throwable th) {
                C0601d.m3077f("FileUtils", "getBytes exception:" + th);
                return false;
            }
        } else {
            bytes = null;
        }
        return m4137a(file, bytes);
    }

    /* renamed from: a */
    private static boolean m4137a(File file, byte[] bArr) {
        Throwable th;
        if (file == null || file.isDirectory()) {
            C0601d.m3077f("FileUtils", "file should not be null or a directory");
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (bArr == null) {
                try {
                    bArr = new byte[0];
                } catch (Throwable th2) {
                    th = th2;
                    C0601d.m3077f("FileUtils", "save to file exception:" + th + " path = " + file.getAbsolutePath());
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
                C0601d.m3077f("FileUtils", "save to file exception:" + th + " path = " + file.getAbsolutePath());
                C0822k.m4013a(fileOutputStream);
                return false;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: a */
    public static File[] m4138a(File file, FileFilter... fileFilterArr) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            return null;
        }
        if (fileFilterArr == null || fileFilterArr.length == 0 || (fileFilterArr.length == 1 && fileFilterArr[0] == null)) {
            return file.listFiles();
        }
        if (fileFilterArr.length == 1) {
            return file.listFiles(fileFilterArr[0]);
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        int length = fileFilterArr.length;
        LinkedList<File> linkedList2 = linkedList;
        int i = 0;
        while (i < length) {
            FileFilter fileFilter = fileFilterArr[i];
            LinkedList linkedList3 = new LinkedList();
            for (File file2 : linkedList2) {
                File[] listFiles = fileFilter != null ? file2.listFiles(fileFilter) : file2.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    Collections.addAll(linkedList3, listFiles);
                }
            }
            if (linkedList3.isEmpty()) {
                return null;
            }
            i++;
            linkedList2 = linkedList3;
        }
        return (File[]) linkedList2.toArray(new File[0]);
    }

    /* renamed from: a */
    public static File[] m4139a(String str, FileFilter... fileFilterArr) {
        try {
            return m4138a(new File(str), fileFilterArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m4140b(File file) {
        byte[] m4142d = m4142d(file);
        if (m4142d == null) {
            return null;
        }
        try {
            return new String(m4142d, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            C0601d.m3072b("FileUtils", "can't encoding, give up read :" + e2);
            return null;
        }
    }

    /* renamed from: c */
    public static void m4141c(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m4141c(file2);
                file2.delete();
            }
        }
        file.delete();
    }

    /* renamed from: d */
    private static byte[] m4142d(File file) {
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
            C0601d.m3072b("FileUtils", "can't read, give up read. e:" + th);
            C0822k.m4013a((Closeable) fileInputStream);
            return null;
        }
    }
}
