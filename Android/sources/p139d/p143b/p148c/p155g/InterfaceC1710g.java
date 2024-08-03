package p139d.p143b.p148c.p155g;

import java.io.Closeable;

/* renamed from: d.b.c.g.g */
/* loaded from: classes.dex */
public interface InterfaceC1710g extends Closeable {

    /* renamed from: d.b.c.g.g$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: a */
    byte mo5032a(int i);

    /* renamed from: a */
    int mo5033a(int i, byte[] bArr, int i2, int i3);

    boolean isClosed();

    int size();
}
