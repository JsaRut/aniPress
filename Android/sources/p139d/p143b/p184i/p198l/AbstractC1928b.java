package p139d.p143b.p184i.p198l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.memory.C0990c;
import com.facebook.imagepipeline.memory.C0991d;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.util.Locale;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.C1699r;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p191e.C1883g;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p203j.C2032b;

/* renamed from: d.b.i.l.b */
/* loaded from: classes.dex */
abstract class AbstractC1928b implements InterfaceC1931e {

    /* renamed from: a */
    protected static final byte[] f7088a = {-1, -39};

    /* renamed from: b */
    private final C0990c f7089b = C0991d.m5008a();

    /* renamed from: a */
    private static BitmapFactory.Options m7939a(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static boolean m7940a(C1716b<InterfaceC1710g> c1716b, int i) {
        InterfaceC1710g m7048n = c1716b.m7048n();
        return i >= 2 && m7048n.mo5032a(i + (-2)) == -1 && m7048n.mo5032a(i - 1) == -39;
    }

    /* renamed from: a */
    abstract Bitmap mo7941a(C1716b<InterfaceC1710g> c1716b, int i, BitmapFactory.Options options);

    /* renamed from: a */
    abstract Bitmap mo7942a(C1716b<InterfaceC1710g> c1716b, BitmapFactory.Options options);

    /* renamed from: a */
    public C1716b<Bitmap> mo7943a(Bitmap bitmap) {
        try {
            Bitmaps.m5077a(bitmap);
            if (this.f7089b.m5004b(bitmap)) {
                return C1716b.m7044a(bitmap, this.f7089b.m5006d());
            }
            int m8294a = C2032b.m8294a(bitmap);
            bitmap.recycle();
            throw new C1883g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(m8294a), Integer.valueOf(this.f7089b.m5001a()), Long.valueOf(this.f7089b.m5007e()), Integer.valueOf(this.f7089b.m5003b()), Integer.valueOf(this.f7089b.m5005c())));
        } catch (Exception e2) {
            bitmap.recycle();
            C1699r.m6984a(e2);
            throw null;
        }
    }

    @Override // p139d.p143b.p184i.p198l.InterfaceC1931e
    /* renamed from: a */
    public C1716b<Bitmap> mo7936a(C1920d c1920d, Bitmap.Config config, Rect rect) {
        BitmapFactory.Options m7939a = m7939a(c1920d.m7924u(), config);
        C1716b<InterfaceC1710g> m7917n = c1920d.m7917n();
        C1691j.m6971a(m7917n);
        try {
            return mo7943a(mo7942a(m7917n, m7939a));
        } finally {
            C1716b.m7045b(m7917n);
        }
    }

    @Override // p139d.p143b.p184i.p198l.InterfaceC1931e
    /* renamed from: a */
    public C1716b<Bitmap> mo7937a(C1920d c1920d, Bitmap.Config config, Rect rect, int i) {
        BitmapFactory.Options m7939a = m7939a(c1920d.m7924u(), config);
        C1716b<InterfaceC1710g> m7917n = c1920d.m7917n();
        C1691j.m6971a(m7917n);
        try {
            return mo7943a(mo7941a(m7917n, i, m7939a));
        } finally {
            C1716b.m7045b(m7917n);
        }
    }
}
