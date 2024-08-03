package p031c.p032a.p096v;

import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;

/* renamed from: c.a.v.f */
/* loaded from: classes.dex */
public final class C0850f implements FileFilter {

    /* renamed from: a */
    public static final C0850f f3598a = new C0850f(true, false);

    /* renamed from: b */
    public static final C0850f f3599b = new C0850f(false, true);

    /* renamed from: c */
    private final boolean f3600c;

    /* renamed from: d */
    private final boolean f3601d;

    /* renamed from: e */
    private final String f3602e;

    /* renamed from: f */
    private final int f3603f;

    private C0850f(boolean z, boolean z2) {
        this.f3600c = z;
        this.f3601d = z2;
        this.f3602e = null;
        this.f3603f = 0;
    }

    public C0850f(boolean z, boolean z2, String str, int i) {
        this.f3602e = str;
        this.f3603f = i;
        this.f3600c = false;
        this.f3601d = true;
    }

    /* renamed from: a */
    public static C0850f m4143a(String str) {
        return new C0850f(false, true, str, 3);
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (this.f3600c && !file.isFile()) {
            return false;
        }
        if (this.f3601d && !file.isDirectory()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f3602e)) {
            return true;
        }
        int i = this.f3603f;
        if (i == 1) {
            return file.getName().startsWith(this.f3602e);
        }
        if (i == 2) {
            return file.getName().endsWith(this.f3602e);
        }
        if (i == 3) {
            return file.getName().equals(this.f3602e);
        }
        if (i != 4) {
            return false;
        }
        return file.getName().contains(this.f3602e);
    }
}
