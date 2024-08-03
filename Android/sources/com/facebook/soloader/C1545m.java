package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.soloader.m */
/* loaded from: classes.dex */
public class C1545m implements InterfaceC1544l {

    /* renamed from: a */
    final /* synthetic */ boolean f5691a;

    /* renamed from: b */
    final /* synthetic */ String f5692b;

    /* renamed from: c */
    final /* synthetic */ String f5693c;

    /* renamed from: d */
    final /* synthetic */ Runtime f5694d;

    /* renamed from: e */
    final /* synthetic */ Method f5695e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1545m(boolean z, String str, String str2, Runtime runtime, Method method) {
        this.f5691a = z;
        this.f5692b = str;
        this.f5693c = str2;
        this.f5694d = runtime;
        this.f5695e = method;
    }

    /* renamed from: a */
    private String m6439a(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            Throwable th = null;
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return format;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                if (th != null) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                } else {
                    fileInputStream.close();
                }
                throw th3;
            }
        } catch (IOException e2) {
            return e2.toString();
        } catch (SecurityException e3) {
            return e3.toString();
        } catch (NoSuchAlgorithmException e4) {
            return e4.toString();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x006d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // com.facebook.soloader.InterfaceC1544l
    /* renamed from: a */
    public void mo6438a(java.lang.String r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f5691a
            if (r0 == 0) goto Lbb
            r0 = 4
            r10 = r10 & r0
            r1 = 1
            r2 = 0
            if (r10 != r0) goto Lc
            r10 = 1
            goto Ld
        Lc:
            r10 = 0
        Ld:
            if (r10 == 0) goto L12
            java.lang.String r10 = r8.f5692b
            goto L14
        L12:
            java.lang.String r10 = r8.f5693c
        L14:
            r0 = 0
            java.lang.Runtime r3 = r8.f5694d     // Catch: java.lang.Throwable -> L70 java.lang.reflect.InvocationTargetException -> L72 java.lang.IllegalArgumentException -> L74 java.lang.IllegalAccessException -> L76
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L70 java.lang.reflect.InvocationTargetException -> L72 java.lang.IllegalArgumentException -> L74 java.lang.IllegalAccessException -> L76
            java.lang.reflect.Method r4 = r8.f5695e     // Catch: java.lang.Throwable -> L6d
            java.lang.Runtime r5 = r8.f5694d     // Catch: java.lang.Throwable -> L6d
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6d
            r6[r2] = r9     // Catch: java.lang.Throwable -> L6d
            java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L6d
            r6[r1] = r2     // Catch: java.lang.Throwable -> L6d
            r1 = 2
            r6[r1] = r10     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r4.invoke(r5, r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L67
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto Lbe
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Error when loading lib: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " lib hash: "
            r0.append(r1)
            java.lang.String r9 = r8.m6439a(r9)
            r0.append(r9)
            java.lang.String r9 = " search path is "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "SoLoader"
            android.util.Log.e(r10, r9)
            goto Lbe
        L62:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L6e
        L67:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L6d:
            r1 = move-exception
        L6e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L70 java.lang.reflect.InvocationTargetException -> L72 java.lang.IllegalArgumentException -> L74 java.lang.IllegalAccessException -> L76
        L70:
            r1 = move-exception
            goto L8e
        L72:
            r1 = move-exception
            goto L77
        L74:
            r1 = move-exception
            goto L77
        L76:
            r1 = move-exception
        L77:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "Error: Cannot load "
            r2.append(r3)     // Catch: java.lang.Throwable -> L70
            r2.append(r9)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L70
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L70
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L70
            throw r2     // Catch: java.lang.Throwable -> L70
        L8e:
            if (r0 == 0) goto Lba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error when loading lib: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " lib hash: "
            r2.append(r0)
            java.lang.String r9 = r8.m6439a(r9)
            r2.append(r9)
            java.lang.String r9 = " search path is "
            r2.append(r9)
            r2.append(r10)
            java.lang.String r9 = r2.toString()
            java.lang.String r10 = "SoLoader"
            android.util.Log.e(r10, r9)
        Lba:
            throw r1
        Lbb:
            java.lang.System.load(r9)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1545m.mo6438a(java.lang.String, int):void");
    }
}
