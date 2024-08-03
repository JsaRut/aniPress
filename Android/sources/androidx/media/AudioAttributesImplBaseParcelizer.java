package androidx.media;

import android.support.v4.media.C0228c;
import androidx.versionedparcelable.AbstractC0489b;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static C0228c read(AbstractC0489b abstractC0489b) {
        C0228c c0228c = new C0228c();
        c0228c.f1009a = abstractC0489b.m2599a(c0228c.f1009a, 1);
        c0228c.f1010b = abstractC0489b.m2599a(c0228c.f1010b, 2);
        c0228c.f1011c = abstractC0489b.m2599a(c0228c.f1011c, 3);
        c0228c.f1012d = abstractC0489b.m2599a(c0228c.f1012d, 4);
        return c0228c;
    }

    public static void write(C0228c c0228c, AbstractC0489b abstractC0489b) {
        abstractC0489b.m2607a(false, false);
        abstractC0489b.m2613b(c0228c.f1009a, 1);
        abstractC0489b.m2613b(c0228c.f1010b, 2);
        abstractC0489b.m2613b(c0228c.f1011c, 3);
        abstractC0489b.m2613b(c0228c.f1012d, 4);
    }
}
