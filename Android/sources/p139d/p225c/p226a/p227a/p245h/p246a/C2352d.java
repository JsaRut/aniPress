package p139d.p225c.p226a.p227a.p245h.p246a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.h.a.d */
/* loaded from: classes.dex */
public final class C2352d {

    /* renamed from: a */
    private final ByteArrayOutputStream f9277a = new ByteArrayOutputStream(512);

    /* renamed from: b */
    private final DataOutputStream f9278b = new DataOutputStream(this.f9277a);

    /* renamed from: a */
    private static void m9807a(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    /* renamed from: a */
    private static void m9808a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] m9809a(C2350b c2350b, long j) {
        C2628e.m11111a(j >= 0);
        this.f9277a.reset();
        try {
            m9808a(this.f9278b, c2350b.f9270a);
            m9808a(this.f9278b, c2350b.f9271b != null ? c2350b.f9271b : "");
            m9807a(this.f9278b, j);
            m9807a(this.f9278b, C2622I.m11085c(c2350b.f9273d, j, 1000000L));
            m9807a(this.f9278b, C2622I.m11085c(c2350b.f9272c, j, 1000L));
            m9807a(this.f9278b, c2350b.f9274e);
            this.f9278b.write(c2350b.f9275f);
            this.f9278b.flush();
            return this.f9277a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
