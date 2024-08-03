package p139d.p225c.p226a.p227a.p229b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: d.c.a.a.b.k */
/* loaded from: classes.dex */
public final class C2174k {

    /* renamed from: a */
    public static final C2174k f7869a = new C2174k(new int[]{2}, 8);

    /* renamed from: b */
    private final int[] f7870b;

    /* renamed from: c */
    private final int f7871c;

    public C2174k(int[] iArr, int i) {
        if (iArr != null) {
            this.f7870b = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.f7870b);
        } else {
            this.f7870b = new int[0];
        }
        this.f7871c = i;
    }

    /* renamed from: a */
    public static C2174k m8859a(Context context) {
        return m8860a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    static C2174k m8860a(Intent intent) {
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f7869a : new C2174k(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    /* renamed from: a */
    public int m8861a() {
        return this.f7871c;
    }

    /* renamed from: a */
    public boolean m8862a(int i) {
        return Arrays.binarySearch(this.f7870b, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2174k)) {
            return false;
        }
        C2174k c2174k = (C2174k) obj;
        return Arrays.equals(this.f7870b, c2174k.f7870b) && this.f7871c == c2174k.f7871c;
    }

    public int hashCode() {
        return this.f7871c + (Arrays.hashCode(this.f7870b) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7871c + ", supportedEncodings=" + Arrays.toString(this.f7870b) + "]";
    }
}
