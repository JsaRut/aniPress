package p031c.p032a.p091r;

import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: c.a.r.k */
/* loaded from: classes.dex */
public final class C0822k {
    /* renamed from: a */
    public static <T> LinkedList<T> m4012a(Collection<T> collection) {
        LinkedList<T> linkedList = new LinkedList<>();
        int i = 0;
        int size = collection != null ? collection.size() : 0;
        if (size == 0) {
            return linkedList;
        }
        if (size == 1) {
            linkedList.addAll(collection);
            return linkedList;
        }
        SecureRandom secureRandom = new SecureRandom();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            i++;
            linkedList.add(secureRandom.nextInt(i), it.next());
        }
        return linkedList;
    }

    /* renamed from: a */
    public static void m4013a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m4014a(long j, long j2) {
        if (j2 <= 0) {
            throw new AssertionError();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return j <= 0 || elapsedRealtime <= j || elapsedRealtime > j + j2;
    }

    /* renamed from: a */
    public static byte[] m4015a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IOException("InputStream is null");
        }
        byte[] bArr = new byte[inputStream.available()];
        inputStream.read(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m4016a(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            m4013a(byteArrayOutputStream);
            m4013a(gZIPOutputStream);
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            m4013a(byteArrayOutputStream);
            m4013a(gZIPOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public static byte[] m4017b(InputStream inputStream) {
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
                    m4013a(byteArrayOutputStream);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            th = th2;
            m4013a(byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m4018b(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        Throwable th;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        } catch (Throwable th2) {
            gZIPInputStream = null;
            th = th2;
        }
        try {
            byte[] bArr2 = new byte[256];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m4013a(byteArrayOutputStream);
                    m4013a((Closeable) byteArrayInputStream);
                    m4013a((Closeable) gZIPInputStream);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (Throwable th3) {
            th = th3;
            m4013a(byteArrayOutputStream);
            m4013a((Closeable) byteArrayInputStream);
            m4013a((Closeable) gZIPInputStream);
            throw th;
        }
    }
}
