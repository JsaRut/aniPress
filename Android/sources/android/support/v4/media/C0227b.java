package android.support.v4.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(21)
/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public class C0227b implements InterfaceC0226a {

    /* renamed from: a */
    AudioAttributes f1007a;

    /* renamed from: b */
    int f1008b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof C0227b) {
            return this.f1007a.equals(((C0227b) obj).f1007a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1007a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1007a;
    }
}
