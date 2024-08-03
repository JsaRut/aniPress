package p031c.p101b.p102a.p115m;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: c.b.a.m.f */
/* loaded from: classes.dex */
public class C0943f {

    /* renamed from: a */
    private static final Object f3978a = new Object();

    /* renamed from: b */
    private static ConcurrentHashMap<String, ThreadLocal<SimpleDateFormat>> f3979b = new ConcurrentHashMap<>();

    /* renamed from: c.b.a.m.f$a */
    /* loaded from: classes.dex */
    private static class a extends ThreadLocal<SimpleDateFormat> {

        /* renamed from: a */
        private String f3980a;

        a(String str) {
            this.f3980a = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(this.f3980a, Locale.ENGLISH);
        }
    }

    /* renamed from: a */
    public static double m4752a(double d2, double d3, double d4, double d5) {
        double d6 = d3 * 0.008726646259971648d;
        double d7 = d5 * 0.008726646259971648d;
        return Math.round((Math.asin(Math.sqrt(Math.pow(Math.sin(d6 - d7), 2.0d) + ((Math.cos(d6 * 2.0d) * Math.cos(d7 * 2.0d)) * Math.pow(Math.sin((d2 - d4) * 0.008726646259971648d), 2.0d)))) * 1.2756274E7d) * 10000.0d) / 10000;
    }

    /* renamed from: a */
    public static SimpleDateFormat m4753a(String str) {
        ThreadLocal<SimpleDateFormat> threadLocal = f3979b.get(str);
        if (threadLocal == null) {
            synchronized (f3978a) {
                threadLocal = f3979b.get(str);
                if (threadLocal == null) {
                    threadLocal = new a(str);
                    f3979b.put(str, threadLocal);
                }
            }
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public static ArrayList<String> m4754a(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m4755a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static byte[] m4756a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            throw new IOException("InputStream is null");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m4755a(byteArrayOutputStream);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            th = th2;
            m4755a(byteArrayOutputStream);
            throw th;
        }
    }
}
