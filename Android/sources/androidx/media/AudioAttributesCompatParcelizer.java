package androidx.media;

import android.support.v4.media.AudioAttributesCompat;
import android.support.v4.media.InterfaceC0226a;
import androidx.versionedparcelable.AbstractC0489b;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0489b abstractC0489b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f971c = (InterfaceC0226a) abstractC0489b.m2601a((AbstractC0489b) audioAttributesCompat.f971c, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0489b abstractC0489b) {
        abstractC0489b.m2607a(false, false);
        abstractC0489b.m2615b(audioAttributesCompat.f971c, 1);
    }
}
