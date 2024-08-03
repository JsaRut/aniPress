package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class SysUtil {

    @InterfaceC1536d
    @TargetApi(21)
    /* loaded from: classes.dex */
    private static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @InterfaceC1536d
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e2) {
                int i = e2.errno;
                if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e2.toString(), e2);
                }
            }
        }

        @InterfaceC1536d
        public static String[] getSupportedAbis() {
            return Build.SUPPORTED_ABIS;
        }
    }

    /* renamed from: a */
    public static int m6399a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m6400a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m6401a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static void m6402a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                m6402a(file2);
            }
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("could not delete: " + file);
    }

    /* renamed from: a */
    public static void m6403a(FileDescriptor fileDescriptor, long j) {
        if (Build.VERSION.SDK_INT >= 21) {
            LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
        }
    }

    /* renamed from: a */
    public static String[] m6404a() {
        return Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : LollipopSysdeps.getSupportedAbis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public static void m6405b(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("cannot list directory " + file);
            }
            for (File file2 : listFiles) {
                m6405b(file2);
            }
            return;
        }
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        Throwable th = null;
        try {
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th2) {
            if (th != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            } else {
                randomAccessFile.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m6406c(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}
