package p139d.p143b.p184i.p198l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.MemoryFile;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p139d.p143b.p148c.p152d.C1682a;
import p139d.p143b.p148c.p152d.C1683b;
import p139d.p143b.p148c.p152d.C1699r;
import p139d.p143b.p148c.p155g.C1712i;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p158j.C1721a;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.l.c */
/* loaded from: classes.dex */
public class C1929c extends AbstractC1928b {

    /* renamed from: c */
    private static Method f7090c;

    /* renamed from: a */
    private static MemoryFile m7944a(C1716b<InterfaceC1710g> c1716b, int i, byte[] bArr) {
        OutputStream outputStream;
        C1712i c1712i;
        C1721a c1721a;
        C1721a c1721a2 = null;
        OutputStream outputStream2 = null;
        c1721a2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            c1712i = new C1712i(c1716b.m7048n());
            try {
                c1721a = new C1721a(c1712i, i);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
            }
            try {
                outputStream2 = memoryFile.getOutputStream();
                C1682a.m6952a(c1721a, outputStream2);
                if (bArr != null) {
                    memoryFile.writeBytes(bArr, 0, i, bArr.length);
                }
                C1716b.m7045b(c1716b);
                C1683b.m6954a(c1712i);
                C1683b.m6954a(c1721a);
                C1683b.m6953a(outputStream2, true);
                return memoryFile;
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStream2;
                c1721a2 = c1721a;
                C1716b.m7045b(c1716b);
                C1683b.m6954a(c1712i);
                C1683b.m6954a(c1721a2);
                C1683b.m6953a(outputStream, true);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            c1712i = null;
        }
    }

    /* renamed from: a */
    private FileDescriptor m7945a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) m7946a().invoke(memoryFile, new Object[0]);
        } catch (Exception e2) {
            C1699r.m6984a(e2);
            throw null;
        }
    }

    /* renamed from: a */
    private synchronized Method m7946a() {
        if (f7090c == null) {
            try {
                f7090c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e2) {
                C1699r.m6984a(e2);
                throw null;
            }
        }
        return f7090c;
    }

    @Override // p139d.p143b.p184i.p198l.AbstractC1928b
    /* renamed from: a */
    protected Bitmap mo7941a(C1716b<InterfaceC1710g> c1716b, int i, BitmapFactory.Options options) {
        return m7947a(c1716b, i, AbstractC1928b.m7940a(c1716b, i) ? null : AbstractC1928b.f7088a, options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.graphics.Bitmap m7947a(p139d.p143b.p148c.p156h.C1716b<p139d.p143b.p148c.p155g.InterfaceC1710g> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m7944a(r2, r3, r4)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            java.io.FileDescriptor r3 = r1.m7945a(r2)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            d.b.c.l.b r4 = p139d.p143b.p148c.p160l.C1731c.f6275d     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            android.graphics.Bitmap r3 = r4.m7092a(r3, r0, r5)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            java.lang.String r4 = "BitmapFactory returned null"
            p139d.p143b.p148c.p152d.C1691j.m6972a(r3, r4)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r2 == 0) goto L1b
            r2.close()
        L1b:
            return r3
        L1c:
            r3 = move-exception
            goto L29
        L1e:
            r3 = move-exception
            goto L25
        L20:
            r3 = move-exception
            r2 = r0
            goto L29
        L23:
            r3 = move-exception
            r2 = r0
        L25:
            p139d.p143b.p148c.p152d.C1699r.m6984a(r3)     // Catch: java.lang.Throwable -> L1c
            throw r0
        L29:
            if (r2 == 0) goto L2e
            r2.close()
        L2e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p184i.p198l.C1929c.m7947a(d.b.c.h.b, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @Override // p139d.p143b.p184i.p198l.AbstractC1928b
    /* renamed from: a */
    protected Bitmap mo7942a(C1716b<InterfaceC1710g> c1716b, BitmapFactory.Options options) {
        return m7947a(c1716b, c1716b.m7048n().size(), (byte[]) null, options);
    }

    @Override // p139d.p143b.p184i.p198l.AbstractC1928b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1716b mo7943a(Bitmap bitmap) {
        return super.mo7943a(bitmap);
    }

    @Override // p139d.p143b.p184i.p198l.AbstractC1928b, p139d.p143b.p184i.p198l.InterfaceC1931e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1716b mo7936a(C1920d c1920d, Bitmap.Config config, Rect rect) {
        return super.mo7936a(c1920d, config, rect);
    }

    @Override // p139d.p143b.p184i.p198l.AbstractC1928b, p139d.p143b.p184i.p198l.InterfaceC1931e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1716b mo7937a(C1920d c1920d, Bitmap.Config config, Rect rect, int i) {
        return super.mo7937a(c1920d, config, rect, i);
    }
}
