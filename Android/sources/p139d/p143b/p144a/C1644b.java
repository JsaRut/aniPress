package p139d.p143b.p144a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.a.b */
/* loaded from: classes.dex */
public class C1644b implements InterfaceC1643a {

    /* renamed from: a */
    private final File f6080a;

    private C1644b(File file) {
        C1691j.m6971a(file);
        this.f6080a = file;
    }

    /* renamed from: a */
    public static C1644b m6806a(File file) {
        if (file != null) {
            return new C1644b(file);
        }
        return null;
    }

    @Override // p139d.p143b.p144a.InterfaceC1643a
    /* renamed from: a */
    public InputStream mo6805a() {
        return new FileInputStream(this.f6080a);
    }

    /* renamed from: b */
    public File m6807b() {
        return this.f6080a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1644b)) {
            return false;
        }
        return this.f6080a.equals(((C1644b) obj).f6080a);
    }

    public int hashCode() {
        return this.f6080a.hashCode();
    }

    @Override // p139d.p143b.p144a.InterfaceC1643a
    public long size() {
        return this.f6080a.length();
    }
}
