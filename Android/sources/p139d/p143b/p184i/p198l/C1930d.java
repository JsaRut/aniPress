package p139d.p143b.p184i.p198l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.facebook.imagepipeline.memory.C0999l;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p196j.C1920d;

@TargetApi(19)
/* renamed from: d.b.i.l.d */
/* loaded from: classes.dex */
public class C1930d extends AbstractC1928b {

    /* renamed from: c */
    private final C0999l f7091c;

    public C1930d(C0999l c0999l) {
        this.f7091c = c0999l;
    }

    /* renamed from: a */
    private static void m7948a(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // p139d.p143b.p184i.p198l.AbstractC1928b
    /* renamed from: a */
    protected Bitmap mo7941a(C1716b<InterfaceC1710g> c1716b, int i, BitmapFactory.Options options) {
        byte[] bArr = AbstractC1928b.m7940a(c1716b, i) ? null : AbstractC1928b.f7088a;
        InterfaceC1710g m7048n = c1716b.m7048n();
        C1691j.m6974a(i <= m7048n.size());
        int i2 = i + 2;
        C1716b<byte[]> m5027a = this.f7091c.m5027a(i2);
        try {
            byte[] m7048n2 = m5027a.m7048n();
            m7048n.mo5033a(0, m7048n2, 0, i);
            if (bArr != null) {
                m7948a(m7048n2, i);
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m7048n2, 0, i, options);
            C1691j.m6972a(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            C1716b.m7045b(m5027a);
        }
    }

    @Override // p139d.p143b.p184i.p198l.AbstractC1928b
    /* renamed from: a */
    protected Bitmap mo7942a(C1716b<InterfaceC1710g> c1716b, BitmapFactory.Options options) {
        InterfaceC1710g m7048n = c1716b.m7048n();
        int size = m7048n.size();
        C1716b<byte[]> m5027a = this.f7091c.m5027a(size);
        try {
            byte[] m7048n2 = m5027a.m7048n();
            m7048n.mo5033a(0, m7048n2, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m7048n2, 0, size, options);
            C1691j.m6972a(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            C1716b.m7045b(m5027a);
        }
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
