package p275e;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: e.i */
/* loaded from: classes.dex */
public interface InterfaceC2721i extends InterfaceC2709D, ReadableByteChannel {
    /* renamed from: a */
    long mo11669a(byte b2);

    /* renamed from: a */
    C2719g mo11674a();

    /* renamed from: a */
    C2722j mo11682a(long j);

    /* renamed from: a */
    String mo11684a(Charset charset);

    /* renamed from: a */
    void mo11685a(C2719g c2719g, long j);

    /* renamed from: a */
    boolean mo11686a(long j, C2722j c2722j);

    /* renamed from: b */
    String mo11691b(long j);

    /* renamed from: c */
    byte[] mo11694c();

    /* renamed from: d */
    boolean mo11695d();

    /* renamed from: d */
    boolean mo11696d(long j);

    /* renamed from: e */
    byte[] mo11698e(long j);

    /* renamed from: f */
    long mo11699f();

    /* renamed from: f */
    void mo11700f(long j);

    /* renamed from: g */
    String mo11702g();

    /* renamed from: h */
    int mo11704h();

    /* renamed from: i */
    short mo11706i();

    /* renamed from: k */
    long mo11709k();

    /* renamed from: l */
    InputStream mo11711l();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);
}
