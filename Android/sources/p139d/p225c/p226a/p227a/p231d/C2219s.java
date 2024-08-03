package p139d.p225c.p226a.p227a.p231d;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* renamed from: d.c.a.a.d.s */
/* loaded from: classes.dex */
public final class C2219s implements InterfaceC2217q {

    /* renamed from: a */
    private final MediaCrypto f8117a;

    /* renamed from: b */
    private final boolean f8118b;

    /* renamed from: a */
    public MediaCrypto m9107a() {
        return this.f8117a;
    }

    /* renamed from: a */
    public boolean m9108a(String str) {
        return !this.f8118b && this.f8117a.requiresSecureDecoderComponent(str);
    }
}
