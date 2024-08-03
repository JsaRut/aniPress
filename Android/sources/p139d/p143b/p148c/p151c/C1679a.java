package p139d.p143b.p148c.p151c;

import java.io.File;

/* renamed from: d.b.c.c.a */
/* loaded from: classes.dex */
public class C1679a {
    /* renamed from: a */
    public static void m6946a(File file, InterfaceC1680b interfaceC1680b) {
        interfaceC1680b.mo6855b(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m6946a(file2, interfaceC1680b);
                } else {
                    interfaceC1680b.mo6854a(file2);
                }
            }
        }
        interfaceC1680b.mo6856c(file);
    }

    /* renamed from: a */
    public static boolean m6947a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= m6948b(file2);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m6948b(File file) {
        if (file.isDirectory()) {
            m6947a(file);
        }
        return file.delete();
    }
}
