package p139d.p225c.p226a.p227a.p250j.p255d;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p139d.p225c.p226a.p227a.p269m.C2599m;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.d.c */
/* loaded from: classes.dex */
class C2472c implements InterfaceC2597k {

    /* renamed from: a */
    private final InterfaceC2597k f9905a;

    /* renamed from: b */
    private final byte[] f9906b;

    /* renamed from: c */
    private final byte[] f9907c;

    /* renamed from: d */
    private CipherInputStream f9908d;

    public C2472c(InterfaceC2597k interfaceC2597k, byte[] bArr, byte[] bArr2) {
        this.f9905a = interfaceC2597k;
        this.f9906b = bArr;
        this.f9907c = bArr2;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public final long mo9121a(C2600n c2600n) {
        try {
            Cipher m10301b = m10301b();
            try {
                m10301b.init(2, new SecretKeySpec(this.f9906b, "AES"), new IvParameterSpec(this.f9907c));
                C2599m c2599m = new C2599m(this.f9905a, c2600n);
                this.f9908d = new CipherInputStream(c2599m, m10301b);
                c2599m.m10925m();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public final Map<String, List<String>> mo9122a() {
        return this.f9905a.mo9122a();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public final void mo10300a(InterfaceC2586E interfaceC2586E) {
        this.f9905a.mo10300a(interfaceC2586E);
    }

    /* renamed from: b */
    protected Cipher m10301b() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        if (this.f9908d != null) {
            this.f9908d = null;
            this.f9905a.close();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public final Uri getUri() {
        return this.f9905a.getUri();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public final int read(byte[] bArr, int i, int i2) {
        C2628e.m11110a(this.f9908d);
        int read = this.f9908d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
