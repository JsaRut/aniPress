package p139d.p143b.p184i.p198l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.support.v4.util.C0267m;
import com.facebook.imagepipeline.memory.C0992e;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p158j.C1721a;
import p139d.p143b.p148c.p158j.C1722b;
import p139d.p143b.p184i.p196j.C1920d;

@TargetApi(21)
/* renamed from: d.b.i.l.a */
/* loaded from: classes.dex */
public class C1927a implements InterfaceC1931e {

    /* renamed from: a */
    private static final Class<?> f7084a = C1927a.class;

    /* renamed from: b */
    private static final byte[] f7085b = {-1, -39};

    /* renamed from: c */
    private final C0992e f7086c;

    /* renamed from: d */
    final C0267m<ByteBuffer> f7087d;

    public C1927a(C0992e c0992e, int i, C0267m c0267m) {
        this.f7086c = c0992e;
        this.f7087d = c0267m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7087d.mo1327a(ByteBuffer.allocate(16384));
        }
    }

    /* renamed from: a */
    private static BitmapFactory.Options m7935a(C1920d c1920d, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c1920d.m7924u();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1920d.m7922s(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // p139d.p143b.p184i.p198l.InterfaceC1931e
    /* renamed from: a */
    public C1716b<Bitmap> mo7936a(C1920d c1920d, Bitmap.Config config, Rect rect) {
        BitmapFactory.Options m7935a = m7935a(c1920d, config);
        boolean z = m7935a.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return m7938a(c1920d.m7922s(), m7935a, rect);
        } catch (RuntimeException e2) {
            if (z) {
                return mo7936a(c1920d, Bitmap.Config.ARGB_8888, rect);
            }
            throw e2;
        }
    }

    @Override // p139d.p143b.p184i.p198l.InterfaceC1931e
    /* renamed from: a */
    public C1716b<Bitmap> mo7937a(C1920d c1920d, Bitmap.Config config, Rect rect, int i) {
        boolean m7910c = c1920d.m7910c(i);
        BitmapFactory.Options m7935a = m7935a(c1920d, config);
        InputStream m7922s = c1920d.m7922s();
        C1691j.m6971a(m7922s);
        if (c1920d.m7925v() > i) {
            m7922s = new C1721a(m7922s, i);
        }
        InputStream c1722b = !m7910c ? new C1722b(m7922s, f7085b) : m7922s;
        boolean z = m7935a.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return m7938a(c1722b, m7935a, rect);
        } catch (RuntimeException e2) {
            if (z) {
                return mo7936a(c1920d, Bitmap.Config.ARGB_8888, rect);
            }
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: all -> 0x0090, RuntimeException -> 0x0092, IllegalArgumentException -> 0x0099, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0092, blocks: (B:10:0x0033, B:19:0x004c, B:21:0x0070, B:33:0x0062, B:37:0x0069, B:38:0x006c), top: B:9:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[Catch: all -> 0x0090, RuntimeException -> 0x0092, IllegalArgumentException -> 0x0099, TryCatch #3 {RuntimeException -> 0x0092, blocks: (B:10:0x0033, B:19:0x004c, B:21:0x0070, B:33:0x0062, B:37:0x0069, B:38:0x006c), top: B:9:0x0033, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p139d.p143b.p148c.p156h.C1716b<android.graphics.Bitmap> m7938a(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, android.graphics.Rect r11) {
        /*
            r8 = this;
            p139d.p143b.p148c.p152d.C1691j.m6971a(r9)
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            if (r11 == 0) goto L11
            int r0 = r11.width()
            int r1 = r11.height()
        L11:
            android.graphics.Bitmap$Config r2 = r10.inPreferredConfig
            int r2 = p139d.p143b.p203j.C2032b.m8292a(r0, r1, r2)
            com.facebook.imagepipeline.memory.e r3 = r8.f7086c
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto Lbe
            r10.inBitmap = r2
            android.support.v4.util.m<java.nio.ByteBuffer> r3 = r8.f7087d
            java.lang.Object r3 = r3.mo1326a()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 != 0) goto L33
            r3 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
        L33:
            byte[] r4 = r3.array()     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92 java.lang.IllegalArgumentException -> L99
            r10.inTempStorage = r4     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92 java.lang.IllegalArgumentException -> L99
            r4 = 0
            if (r11 == 0) goto L6d
            r5 = 1
            android.graphics.Bitmap$Config r6 = r10.inPreferredConfig     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r2.reconfigure(r0, r1, r6)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r9, r5)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            android.graphics.Bitmap r11 = r0.decodeRegion(r11, r10)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L66
            if (r0 == 0) goto L6e
            r0.recycle()     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92 java.lang.IllegalArgumentException -> L99
            goto L6e
        L50:
            r10 = move-exception
            r0 = r4
            goto L67
        L53:
            r0 = r4
        L54:
            java.lang.Class<?> r1 = p139d.p143b.p184i.p198l.C1927a.f7084a     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L66
            r7 = 0
            r5[r7] = r11     // Catch: java.lang.Throwable -> L66
            p139d.p143b.p148c.p153e.C1700a.m6995a(r1, r6, r5)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L6d
            r0.recycle()     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92 java.lang.IllegalArgumentException -> L99
            goto L6d
        L66:
            r10 = move-exception
        L67:
            if (r0 == 0) goto L6c
            r0.recycle()     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92 java.lang.IllegalArgumentException -> L99
        L6c:
            throw r10     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92 java.lang.IllegalArgumentException -> L99
        L6d:
            r11 = r4
        L6e:
            if (r11 != 0) goto L74
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r9, r4, r10)     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92 java.lang.IllegalArgumentException -> L99
        L74:
            android.support.v4.util.m<java.nio.ByteBuffer> r9 = r8.f7087d
            r9.mo1327a(r3)
            if (r2 != r11) goto L82
            com.facebook.imagepipeline.memory.e r9 = r8.f7086c
            d.b.c.h.b r9 = p139d.p143b.p148c.p156h.C1716b.m7044a(r11, r9)
            return r9
        L82:
            com.facebook.imagepipeline.memory.e r9 = r8.f7086c
            r9.mo4987a(r2)
            r11.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L90:
            r9 = move-exception
            goto Lb8
        L92:
            r9 = move-exception
            com.facebook.imagepipeline.memory.e r10 = r8.f7086c     // Catch: java.lang.Throwable -> L90
            r10.mo4987a(r2)     // Catch: java.lang.Throwable -> L90
            throw r9     // Catch: java.lang.Throwable -> L90
        L99:
            r10 = move-exception
            com.facebook.imagepipeline.memory.e r11 = r8.f7086c     // Catch: java.lang.Throwable -> L90
            r11.mo4987a(r2)     // Catch: java.lang.Throwable -> L90
            r9.reset()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> Lb7
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> Lb7
            if (r9 == 0) goto Lb6
            d.b.i.c.g r11 = p139d.p143b.p184i.p189c.C1843g.m7550a()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> Lb7
            d.b.c.h.b r9 = p139d.p143b.p148c.p156h.C1716b.m7044a(r9, r11)     // Catch: java.lang.Throwable -> L90 java.io.IOException -> Lb7
            android.support.v4.util.m<java.nio.ByteBuffer> r10 = r8.f7087d
            r10.mo1327a(r3)
            return r9
        Lb6:
            throw r10     // Catch: java.lang.Throwable -> L90 java.io.IOException -> Lb7
        Lb7:
            throw r10     // Catch: java.lang.Throwable -> L90
        Lb8:
            android.support.v4.util.m<java.nio.ByteBuffer> r10 = r8.f7087d
            r10.mo1327a(r3)
            throw r9
        Lbe:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "BitmapPool.get returned null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p184i.p198l.C1927a.m7938a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect):d.b.c.h.b");
    }
}
