package p031c.p032a.p061e;

import java.io.File;
import java.util.Comparator;

/* renamed from: c.a.e.g */
/* loaded from: classes.dex */
final class C0608g implements Comparator<File> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(File file, File file2) {
        long lastModified = file.lastModified() - file2.lastModified();
        if (lastModified < 0) {
            return 1;
        }
        return lastModified == 0 ? 0 : -1;
    }
}
