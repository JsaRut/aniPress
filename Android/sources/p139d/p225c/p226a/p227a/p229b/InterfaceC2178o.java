package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: d.c.a.a.b.o */
/* loaded from: classes.dex */
public interface InterfaceC2178o {

    /* renamed from: a */
    public static final ByteBuffer f7882a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: d.c.a.a.b.o$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* renamed from: a */
    ByteBuffer mo8797a();

    /* renamed from: a */
    void mo8798a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo8799a(int i, int i2, int i3);

    /* renamed from: b */
    int mo8800b();

    /* renamed from: c */
    int mo8801c();

    /* renamed from: d */
    boolean mo8802d();

    /* renamed from: e */
    int mo8803e();

    /* renamed from: f */
    void mo8804f();

    void flush();

    /* renamed from: g */
    boolean mo8805g();

    void reset();
}
