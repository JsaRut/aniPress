package p139d.p225c.p226a.p227a.p230c;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.c.c */
/* loaded from: classes.dex */
public final class C2193c {

    /* renamed from: a */
    public byte[] f8018a;

    /* renamed from: b */
    public byte[] f8019b;

    /* renamed from: c */
    public int f8020c;

    /* renamed from: d */
    public int[] f8021d;

    /* renamed from: e */
    public int[] f8022e;

    /* renamed from: f */
    public int f8023f;

    /* renamed from: g */
    public int f8024g;

    /* renamed from: h */
    public int f8025h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f8026i;

    /* renamed from: j */
    private final a f8027j;

    @TargetApi(24)
    /* renamed from: d.c.a.a.c.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f8028a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f8029b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f8028a = cryptoInfo;
            this.f8029b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, C2192b c2192b) {
            this(cryptoInfo);
        }

        /* renamed from: a */
        public void m9018a(int i, int i2) {
            this.f8029b.set(i, i2);
            this.f8028a.setPattern(this.f8029b);
        }
    }

    public C2193c() {
        this.f8026i = C2622I.f10916a >= 16 ? m9014b() : null;
        this.f8027j = C2622I.f10916a >= 24 ? new a(this.f8026i) : null;
    }

    @TargetApi(16)
    /* renamed from: b */
    private MediaCodec.CryptoInfo m9014b() {
        return new MediaCodec.CryptoInfo();
    }

    @TargetApi(16)
    /* renamed from: c */
    private void m9015c() {
        MediaCodec.CryptoInfo cryptoInfo = this.f8026i;
        cryptoInfo.numSubSamples = this.f8023f;
        cryptoInfo.numBytesOfClearData = this.f8021d;
        cryptoInfo.numBytesOfEncryptedData = this.f8022e;
        cryptoInfo.key = this.f8019b;
        cryptoInfo.iv = this.f8018a;
        cryptoInfo.mode = this.f8020c;
        if (C2622I.f10916a >= 24) {
            this.f8027j.m9018a(this.f8024g, this.f8025h);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public MediaCodec.CryptoInfo m9016a() {
        return this.f8026i;
    }

    /* renamed from: a */
    public void m9017a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f8023f = i;
        this.f8021d = iArr;
        this.f8022e = iArr2;
        this.f8019b = bArr;
        this.f8018a = bArr2;
        this.f8020c = i2;
        this.f8024g = i3;
        this.f8025h = i4;
        if (C2622I.f10916a >= 16) {
            m9015c();
        }
    }
}
