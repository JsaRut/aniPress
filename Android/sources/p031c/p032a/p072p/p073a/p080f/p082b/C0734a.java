package p031c.p032a.p072p.p073a.p080f.p082b;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.b.a */
/* loaded from: classes.dex */
public final class C0734a {

    /* renamed from: a */
    public static volatile C0734a f3321a;

    /* renamed from: b */
    public static final Object f3322b = new Object();

    /* renamed from: c */
    private SharedPreferences f3323c;

    private C0734a(Context context) {
        this.f3323c = null;
        if (this.f3323c == null) {
            this.f3323c = context.getSharedPreferences("jAnalysis_genera_config", 0);
        }
    }

    /* renamed from: a */
    public static C0734a m3728a(Context context) {
        if (f3321a == null) {
            synchronized (f3322b) {
                if (f3321a == null) {
                    f3321a = new C0734a(context);
                }
            }
        }
        return f3321a;
    }

    /* renamed from: a */
    public static synchronized Object m3729a(Context context, String str) {
        synchronized (C0734a.class) {
            File m3737d = m3737d(context, str);
            if (m3737d == null) {
                return null;
            }
            try {
                return m3730a(m3737d);
            } catch (Throwable th) {
                C0732b.m3723f("BaseSharePreference", "load object error:" + th);
                m3735b(context, str);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Object m3730a(File file) {
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
            m3733a(objectInputStream);
            return readObject;
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            m3733a(objectInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static synchronized void m3731a(Context context, String str, Object obj) {
        synchronized (C0734a.class) {
            File m3737d = m3737d(context, str);
            if (m3737d == null) {
                return;
            }
            m3734a(m3737d, obj);
        }
    }

    /* renamed from: a */
    public static synchronized <T> void m3732a(Context context, String str, ArrayList<T> arrayList) {
        synchronized (C0734a.class) {
            C0732b.m3716a("BaseSharePreference", "Action - saveObjects");
            File m3737d = m3737d(context, str);
            if (m3737d == null) {
                return;
            }
            m3734a(m3737d, arrayList);
        }
    }

    /* renamed from: a */
    private static void m3733a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static boolean m3734a(File file, Object obj) {
        Throwable th;
        Throwable th2;
        if (file == null || file.isDirectory()) {
            C0732b.m3723f("BaseSharePreference", "file should not be null or a directory");
            return false;
        }
        ObjectOutputStream objectOutputStream = null;
        if (file != null) {
            try {
                try {
                    if (!file.exists()) {
                        File parentFile = file.getParentFile();
                        if (parentFile != null && !parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        try {
                            file.createNewFile();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    m3733a(objectOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th2 = th4;
                C0732b.m3723f("BaseSharePreference", "save to file exception:" + th2 + " path = " + file.getAbsolutePath());
                m3733a(objectOutputStream);
                return false;
            }
        }
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(file));
        try {
            objectOutputStream2.writeObject(obj);
            m3733a(objectOutputStream2);
            return true;
        } catch (Throwable th5) {
            th2 = th5;
            objectOutputStream = objectOutputStream2;
            C0732b.m3723f("BaseSharePreference", "save to file exception:" + th2 + " path = " + file.getAbsolutePath());
            m3733a(objectOutputStream);
            return false;
        }
    }

    /* renamed from: b */
    public static synchronized void m3735b(Context context, String str) {
        synchronized (C0734a.class) {
            File m3737d = m3737d(context, str);
            if (m3737d != null && m3737d.exists()) {
                m3737d.delete();
                C0732b.m3718b("BaseSharePreference", "delete File:" + m3737d.getPath());
            }
        }
    }

    /* renamed from: c */
    public static synchronized <T> ArrayList<T> m3736c(Context context, String str) {
        synchronized (C0734a.class) {
            File m3737d = m3737d(context, str);
            if (m3737d == null) {
                return null;
            }
            try {
                return (ArrayList) m3730a(m3737d);
            } catch (Throwable th) {
                C0732b.m3723f("BaseSharePreference", "load object error:" + th);
                m3735b(context, str);
                return null;
            }
        }
    }

    /* renamed from: d */
    private static File m3737d(Context context, String str) {
        File filesDir;
        if (context != null && (filesDir = context.getFilesDir()) != null) {
            return new File(filesDir, str);
        }
        C0732b.m3723f("BaseSharePreference", "can't get file :" + str);
        return null;
    }

    /* renamed from: a */
    public final void m3738a(String str, long j) {
        if (this.f3323c != null) {
            synchronized (f3322b) {
                SharedPreferences.Editor edit = this.f3323c.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        }
    }

    /* renamed from: b */
    public final long m3739b(String str, long j) {
        SharedPreferences sharedPreferences = this.f3323c;
        return sharedPreferences != null ? sharedPreferences.getLong(str, j) : j;
    }
}
