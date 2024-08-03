package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0489b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0489b abstractC0489b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f944b = abstractC0489b.m2599a(iconCompat.f944b, 1);
        iconCompat.f946d = abstractC0489b.m2610a(iconCompat.f946d, 2);
        iconCompat.f947e = abstractC0489b.m2600a((AbstractC0489b) iconCompat.f947e, 3);
        iconCompat.f948f = abstractC0489b.m2599a(iconCompat.f948f, 4);
        iconCompat.f949g = abstractC0489b.m2599a(iconCompat.f949g, 5);
        iconCompat.f950h = (ColorStateList) abstractC0489b.m2600a((AbstractC0489b) iconCompat.f950h, 6);
        iconCompat.f952j = abstractC0489b.m2602a(iconCompat.f952j, 7);
        iconCompat.m1192c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0489b abstractC0489b) {
        abstractC0489b.m2607a(true, true);
        iconCompat.m1190a(abstractC0489b.m2619c());
        abstractC0489b.m2613b(iconCompat.f944b, 1);
        abstractC0489b.m2617b(iconCompat.f946d, 2);
        abstractC0489b.m2614b(iconCompat.f947e, 3);
        abstractC0489b.m2613b(iconCompat.f948f, 4);
        abstractC0489b.m2613b(iconCompat.f949g, 5);
        abstractC0489b.m2614b(iconCompat.f950h, 6);
        abstractC0489b.m2616b(iconCompat.f952j, 7);
    }
}
