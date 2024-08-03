package p139d.p225c.p226a.p227a.p230c;

import java.nio.ByteBuffer;

/* renamed from: d.c.a.a.c.f */
/* loaded from: classes.dex */
public class C2196f extends AbstractC2191a {

    /* renamed from: b */
    public final C2193c f8039b = new C2193c();

    /* renamed from: c */
    public ByteBuffer f8040c;

    /* renamed from: d */
    public long f8041d;

    /* renamed from: e */
    private final int f8042e;

    public C2196f(int i) {
        this.f8042e = i;
    }

    /* renamed from: g */
    private ByteBuffer m9025g(int i) {
        int i2 = this.f8042e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f8040c;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    /* renamed from: i */
    public static C2196f m9026i() {
        return new C2196f(0);
    }

    @Override // p139d.p225c.p226a.p227a.p230c.AbstractC2191a
    /* renamed from: b */
    public void mo9006b() {
        super.mo9006b();
        ByteBuffer byteBuffer = this.f8040c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: f */
    public final void m9027f() {
        this.f8040c.flip();
    }

    /* renamed from: f */
    public void m9028f(int i) {
        ByteBuffer byteBuffer = this.f8040c;
        if (byteBuffer == null) {
            this.f8040c = m9025g(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f8040c.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer m9025g = m9025g(i2);
        if (position > 0) {
            this.f8040c.position(0);
            this.f8040c.limit(position);
            m9025g.put(this.f8040c);
        }
        this.f8040c = m9025g;
    }

    /* renamed from: g */
    public final boolean m9029g() {
        return m9011d(1073741824);
    }

    /* renamed from: h */
    public final boolean m9030h() {
        return this.f8040c == null && this.f8042e == 0;
    }
}
