package p031c.p032a.p072p.p073a;

import android.os.Environment;
import java.io.File;

/* renamed from: c.a.p.a.d */
/* loaded from: classes.dex */
public final class C0727d {

    /* renamed from: a */
    public static boolean f3300a = false;

    /* renamed from: b */
    public static final String f3301b = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + ".janalytics" + File.separator;

    /* renamed from: c */
    public static final String f3302c;

    /* renamed from: d */
    public static boolean f3303d;

    /* renamed from: e */
    public static long f3304e;

    /* renamed from: f */
    public static boolean f3305f;

    /* renamed from: g */
    public static boolean f3306g;

    /* renamed from: h */
    public static int f3307h;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f3301b);
        sb.append(".janalytics");
        f3302c = sb.toString();
        f3303d = false;
        f3304e = 30000L;
        f3305f = true;
        f3306g = true;
        f3307h = 0;
    }
}
