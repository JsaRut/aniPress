package p275e;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: e.h */
/* loaded from: classes.dex */
public interface InterfaceC2720h extends InterfaceC2708C, WritableByteChannel {
    /* renamed from: a */
    long mo11671a(InterfaceC2709D interfaceC2709D);

    /* renamed from: a */
    C2719g mo11674a();

    /* renamed from: a */
    InterfaceC2720h mo11676a(C2722j c2722j);

    /* renamed from: a */
    InterfaceC2720h mo11677a(String str);

    /* renamed from: b */
    InterfaceC2720h mo11689b();

    /* renamed from: c */
    InterfaceC2720h mo11693c(long j);

    /* renamed from: e */
    InterfaceC2720h mo11697e();

    @Override // p275e.InterfaceC2708C, java.io.Flushable
    void flush();

    /* renamed from: g */
    InterfaceC2720h mo11701g(long j);

    /* renamed from: j */
    OutputStream mo11707j();

    InterfaceC2720h write(byte[] bArr);

    InterfaceC2720h write(byte[] bArr, int i, int i2);

    InterfaceC2720h writeByte(int i);

    InterfaceC2720h writeInt(int i);

    InterfaceC2720h writeShort(int i);
}
