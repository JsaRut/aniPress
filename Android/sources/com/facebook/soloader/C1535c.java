package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.soloader.c */
/* loaded from: classes.dex */
public class C1535c extends AbstractC1546n {

    /* renamed from: a */
    protected final File f5672a;

    /* renamed from: b */
    protected final int f5673b;

    public C1535c(File file, int i) {
        this.f5672a = file;
        this.f5673b = i;
    }

    /* renamed from: a */
    private void m6415a(File file, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] m6416a = m6416a(file);
        Log.d("SoLoader", "Loading lib dependencies: " + Arrays.toString(m6416a));
        for (String str : m6416a) {
            if (!str.startsWith("/")) {
                SoLoader.m6387a(str, i | 1, threadPolicy);
            }
        }
    }

    /* renamed from: a */
    private static String[] m6416a(File file) {
        if (SoLoader.f5653a) {
            Api18TraceUtils.m6381a("SoLoader.getElfDependencies[" + file.getName() + "]");
        }
        try {
            return C1543k.m6432a(file);
        } finally {
            if (SoLoader.f5653a) {
                Api18TraceUtils.m6380a();
            }
        }
    }

    @Override // com.facebook.soloader.AbstractC1546n
    /* renamed from: a */
    public int mo6411a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return m6417a(str, i, this.f5672a, threadPolicy);
    }

    /* renamed from: a */
    public int m6417a(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            Log.d("SoLoader", str + " not found on " + file.getCanonicalPath());
            return 0;
        }
        Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
        if ((i & 1) != 0 && (this.f5673b & 2) != 0) {
            Log.d("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f5673b & 1) != 0) {
            m6415a(file2, i, threadPolicy);
        } else {
            Log.d("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f5654b.mo6438a(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e2) {
            if (!e2.getMessage().contains("bad ELF magic")) {
                throw e2;
            }
            Log.d("SoLoader", "Corrupted lib file detected");
            return 3;
        }
    }

    @Override // com.facebook.soloader.AbstractC1546n
    /* renamed from: a */
    public File mo6412a(String str) {
        File file = new File(this.f5672a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // com.facebook.soloader.AbstractC1546n
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f5672a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f5672a.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f5673b + ']';
    }
}
