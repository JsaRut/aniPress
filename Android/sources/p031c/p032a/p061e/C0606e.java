package p031c.p032a.p061e;

import java.io.File;
import java.io.FileFilter;

/* renamed from: c.a.e.e */
/* loaded from: classes.dex */
final class C0606e implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return (file.getName().length() == 24 || file.getName().equals("0")) ? false : true;
    }
}
