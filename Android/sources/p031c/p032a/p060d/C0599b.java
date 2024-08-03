package p031c.p032a.p060d;

import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p095u.C0844a;
import p031c.p032a.p096v.C0846b;
import p031c.p032a.p096v.C0854j;

/* renamed from: c.a.d.b */
/* loaded from: classes.dex */
public final class C0599b {

    /* renamed from: a */
    private static String f2849a = ".jpush";

    /* renamed from: b */
    private static String f2850b = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + f2849a + File.separator;

    /* renamed from: c */
    private static String f2851c;

    /* renamed from: d */
    private static final SimpleDateFormat f2852d;

    /* renamed from: e */
    private static ArrayList<String> f2853e;

    /* renamed from: f */
    private static boolean f2854f;

    /* renamed from: g */
    private static boolean f2855g;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f2850b);
        sb.append(f2849a);
        f2851c = sb.toString();
        f2852d = new SimpleDateFormat("MM.dd_HH:mm:ss_SSS", Locale.ENGLISH);
        f2853e = new ArrayList<>();
        f2854f = false;
        f2855g = false;
    }

    /* renamed from: a */
    public static void m3066a(String str, String str2, String str3, Throwable th) {
        if (str2 == null || str2.trim().equals("")) {
            str2 = "Logger";
        }
        if (str3 == null) {
            return;
        }
        try {
            String format = f2852d.format(new Date());
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str3), 256);
            String m4159a = C0854j.m4159a("[" + str2 + "]", 24);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return;
                    }
                    String str4 = ((Object) format) + " " + C0854j.m4159a(str, 5) + " " + m4159a + " " + readLine;
                    if (!f2855g) {
                        try {
                            f2853e.add(str4);
                            if (f2853e.size() == 500) {
                                ArrayList<String> arrayList = f2853e;
                                f2853e = new ArrayList<>();
                                boolean m3939a = C0812a.m3939a(C0583a.f2794a, "android.permission.WRITE_EXTERNAL_STORAGE");
                                f2854f = m3939a;
                                if (m3939a) {
                                    C0601d.m3070a("Logger", "have writable external storage, write log file");
                                    m3067a(arrayList);
                                } else {
                                    C0601d.m3070a("Logger", "no writable external storage");
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            e2.printStackTrace();
                            f2853e = new ArrayList<>();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                } catch (IOException e3) {
                    C0601d.m3079h("Logger", e3.getMessage());
                    return;
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m3067a(ArrayList<String> arrayList) {
        try {
            if (C0583a.f2794a == null || C0812a.m3939a(C0583a.f2794a, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0844a.m4116a("ASYNC", new RunnableC0600c(arrayList));
            } else {
                C0601d.m3077f("Logger", "WRITE_EXTERNAL_STORAGE not get");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m3069c() {
        try {
            File file = new File(f2850b);
            if (file.exists()) {
                int length = f2849a.length() + 1;
                int length2 = C0846b.f3595c.length() + length;
                if (file.listFiles() != null) {
                    for (File file2 : file.listFiles()) {
                        if (C0846b.m4125a(C0846b.m4127b(file2.getName().substring(length, length2)), 2)) {
                            file2.delete();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C0601d.m3079h("Logger", th.getMessage());
        }
    }
}
