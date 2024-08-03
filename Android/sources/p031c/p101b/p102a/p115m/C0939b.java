package p031c.p101b.p102a.p115m;

import java.io.File;
import java.util.Comparator;

/* renamed from: c.b.a.m.b */
/* loaded from: classes.dex */
class C0939b implements Comparator<File> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        if (file.lastModified() > file2.lastModified()) {
            return -1;
        }
        return file.lastModified() < file2.lastModified() ? 1 : 0;
    }
}
