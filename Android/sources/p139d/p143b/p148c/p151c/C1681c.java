package p139d.p143b.p148c.p151c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.c.c.c */
/* loaded from: classes.dex */
public class C1681c {

    /* renamed from: d.b.c.c.c$a */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: d.b.c.c.c$b */
    /* loaded from: classes.dex */
    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: d.b.c.c.c$c */
    /* loaded from: classes.dex */
    public static class c extends FileNotFoundException {
        public c(String str) {
            super(str);
        }
    }

    /* renamed from: d.b.c.c.c$d */
    /* loaded from: classes.dex */
    public static class d extends IOException {
        public d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: a */
    public static void m6949a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static void m6950a(File file, File file2) {
        C1691j.m6971a(file);
        C1691j.m6971a(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable th = null;
        if (file2.exists()) {
            th = new b(file2.getAbsolutePath());
        } else if (!file.getParentFile().exists()) {
            th = new c(file.getAbsolutePath());
        } else if (!file.exists()) {
            th = new FileNotFoundException(file.getAbsolutePath());
        }
        throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th);
    }
}
