package androidx.media;

import android.media.AudioAttributes;
import android.support.v4.media.C0227b;
import androidx.versionedparcelable.AbstractC0489b;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static C0227b read(AbstractC0489b abstractC0489b) {
        C0227b c0227b = new C0227b();
        c0227b.f1007a = (AudioAttributes) abstractC0489b.m2600a((AbstractC0489b) c0227b.f1007a, 1);
        c0227b.f1008b = abstractC0489b.m2599a(c0227b.f1008b, 2);
        return c0227b;
    }

    public static void write(C0227b c0227b, AbstractC0489b abstractC0489b) {
        abstractC0489b.m2607a(false, false);
        abstractC0489b.m2614b(c0227b.f1007a, 1);
        abstractC0489b.m2613b(c0227b.f1008b, 2);
    }
}
