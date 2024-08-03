package p139d.p143b.p148c.p155g;

import java.io.InputStream;
import java.io.OutputStream;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.c.g.k */
/* loaded from: classes.dex */
public class C1714k {

    /* renamed from: a */
    private final int f6236a;

    /* renamed from: b */
    private final InterfaceC1704a f6237b;

    public C1714k(InterfaceC1704a interfaceC1704a) {
        this(interfaceC1704a, 16384);
    }

    public C1714k(InterfaceC1704a interfaceC1704a, int i) {
        C1691j.m6974a(i > 0);
        this.f6236a = i;
        this.f6237b = interfaceC1704a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public long m7041a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.f6237b.get(this.f6236a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f6236a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            } finally {
                this.f6237b.mo4987a(bArr);
            }
        }
    }
}
