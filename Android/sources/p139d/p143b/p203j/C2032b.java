package p139d.p143b.p203j;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v4.util.C0267m;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.j.b */
/* loaded from: classes.dex */
public final class C2032b {

    /* renamed from: a */
    private static final C0267m<ByteBuffer> f7404a = new C0267m<>(12);

    /* renamed from: a */
    public static int m8292a(int i, int i2, Bitmap.Config config) {
        return i * i2 * m8293a(config);
    }

    /* renamed from: a */
    public static int m8293a(Bitmap.Config config) {
        int i = C2031a.f7403a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static int m8294a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return Build.VERSION.SDK_INT >= 12 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m8295a(InputStream inputStream) {
        C1691j.m6971a(inputStream);
        ByteBuffer mo1326a = f7404a.mo1326a();
        if (mo1326a == null) {
            mo1326a = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = mo1326a.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            f7404a.mo1327a(mo1326a);
        }
    }
}
