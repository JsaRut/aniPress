package p031c.p032a.p046N;

import java.io.File;
import java.io.FileFilter;

/* renamed from: c.a.N.b */
/* loaded from: classes.dex */
final class C0546b implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file.getName();
        if (!name.startsWith("cpu")) {
            return false;
        }
        for (int i = 3; i < name.length(); i++) {
            if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
