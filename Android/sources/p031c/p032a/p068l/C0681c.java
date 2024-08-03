package p031c.p032a.p068l;

import java.nio.ByteBuffer;

/* renamed from: c.a.l.c */
/* loaded from: classes.dex */
public final class C0681c {

    /* renamed from: a */
    public int f3136a;

    /* renamed from: b */
    public int f3137b;

    /* renamed from: c */
    public int f3138c;

    /* renamed from: d */
    public byte f3139d;

    /* renamed from: e */
    public long f3140e;

    /* renamed from: f */
    public int f3141f;

    /* renamed from: g */
    public long f3142g;

    /* renamed from: h */
    private boolean f3143h;

    public C0681c(boolean z, byte[] bArr) {
        this.f3143h = false;
        try {
            this.f3143h = false;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f3136a = wrap.getShort();
            this.f3136a &= 32767;
            this.f3137b = wrap.get();
            this.f3138c = wrap.get();
            this.f3139d = wrap.get();
            wrap.get();
            wrap.getInt();
            this.f3140e = wrap.getShort();
            this.f3142g = wrap.getLong();
        } catch (Throwable unused) {
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[JHead] - len:");
        sb.append(this.f3136a);
        sb.append(", version:");
        sb.append(this.f3137b);
        sb.append(", command:");
        sb.append(this.f3138c);
        sb.append(", rid:");
        sb.append(this.f3140e);
        if (this.f3143h) {
            str = ", sid:" + this.f3141f;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", juid:");
        sb.append(this.f3142g);
        return sb.toString();
    }
}
