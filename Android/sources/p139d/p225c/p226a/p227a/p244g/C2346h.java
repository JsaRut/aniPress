package p139d.p225c.p226a.p227a.p244g;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p139d.p225c.p226a.p227a.p271o.C2662j;

@TargetApi(16)
/* renamed from: d.c.a.a.g.h */
/* loaded from: classes.dex */
public final class C2346h {
    /* renamed from: a */
    public static void m9792a(MediaFormat mediaFormat, C2662j c2662j) {
        if (c2662j != null) {
            m9794a(mediaFormat, "color-transfer", c2662j.f11044c);
            m9794a(mediaFormat, "color-standard", c2662j.f11042a);
            m9794a(mediaFormat, "color-range", c2662j.f11043b);
            m9795a(mediaFormat, "hdr-static-info", c2662j.f11045d);
        }
    }

    /* renamed from: a */
    public static void m9793a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: a */
    public static void m9794a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public static void m9795a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: a */
    public static void m9796a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
