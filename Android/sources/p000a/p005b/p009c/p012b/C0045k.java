package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: a.b.c.b.k */
/* loaded from: classes.dex */
public class C0045k {
    /* renamed from: a */
    public static File m222a(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getCacheDir(), str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static ByteBuffer m223a(Context context, Resources resources, int i) {
        File m222a = m222a(context);
        if (m222a == null) {
            return null;
        }
        try {
            if (m227a(m222a, resources, i)) {
                return m225a(m222a);
            }
            return null;
        } finally {
            m222a.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[Catch: all -> 0x0048, Throwable -> 0x004b, TRY_ENTER, TryCatch #0 {Throwable -> 0x004b, blocks: (B:10:0x0013, B:13:0x002c, B:25:0x0044, B:26:0x0047), top: B:9:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[Catch: IOException -> 0x005d, SYNTHETIC, TRY_LEAVE, TryCatch #6 {IOException -> 0x005d, blocks: (B:3:0x0005, B:6:0x000f, B:15:0x0031, B:43:0x0059, B:44:0x005c), top: B:2:0x0005 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.nio.ByteBuffer m224a(android.content.Context r8, android.os.CancellationSignal r9, android.net.Uri r10) {
        /*
            android.content.ContentResolver r8 = r8.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r10, r1, r9)     // Catch: java.io.IOException -> L5d
            if (r8 != 0) goto L13
            if (r8 == 0) goto L12
            r8.close()     // Catch: java.io.IOException -> L5d
        L12:
            return r0
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            java.io.FileDescriptor r10 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            java.nio.channels.FileChannel r1 = r9.getChannel()     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            long r5 = r1.size()     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            r3 = 0
            java.nio.MappedByteBuffer r10 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L38
            r9.close()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
            if (r8 == 0) goto L34
            r8.close()     // Catch: java.io.IOException -> L5d
        L34:
            return r10
        L35:
            r10 = move-exception
            r1 = r0
            goto L3e
        L38:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L3a
        L3a:
            r1 = move-exception
            r7 = r1
            r1 = r10
            r10 = r7
        L3e:
            if (r1 == 0) goto L44
            r9.close()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L48
            goto L47
        L44:
            r9.close()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
        L47:
            throw r10     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4b
        L48:
            r9 = move-exception
            r10 = r0
            goto L51
        L4b:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L4d
        L4d:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L51:
            if (r8 == 0) goto L5c
            if (r10 == 0) goto L59
            r8.close()     // Catch: java.lang.Throwable -> L5c
            goto L5c
        L59:
            r8.close()     // Catch: java.io.IOException -> L5d
        L5c:
            throw r9     // Catch: java.io.IOException -> L5d
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p012b.C0045k.m224a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x002d, TRY_ENTER, TryCatch #3 {IOException -> 0x002d, blocks: (B:3:0x0001, B:6:0x0016, B:13:0x0029, B:14:0x002c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.nio.ByteBuffer m225a(java.io.File r9) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L2d
            r1.<init>(r9)     // Catch: java.io.IOException -> L2d
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            r4 = 0
            java.nio.MappedByteBuffer r9 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L1d
            r1.close()     // Catch: java.io.IOException -> L2d
            return r9
        L1a:
            r9 = move-exception
            r2 = r0
            goto L23
        L1d:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L1f
        L1f:
            r2 = move-exception
            r8 = r2
            r2 = r9
            r9 = r8
        L23:
            if (r2 == 0) goto L29
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L29:
            r1.close()     // Catch: java.io.IOException -> L2d
        L2c:
            throw r9     // Catch: java.io.IOException -> L2d
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p012b.C0045k.m225a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static void m226a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m227a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m228a = m228a(file, inputStream);
            m226a(inputStream);
            return m228a;
        } catch (Throwable th2) {
            th = th2;
            m226a(inputStream);
            throw th;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static boolean m228a(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m226a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m226a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m226a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }
}
