package p139d.p143b.p184i.p191e;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p159k.C1724b;

/* renamed from: d.b.i.e.e */
/* loaded from: classes.dex */
public class C1881e {

    /* renamed from: a */
    public final int f6865a;

    /* renamed from: b */
    public final int f6866b;

    /* renamed from: c */
    public final float f6867c;

    /* renamed from: d */
    public final float f6868d;

    public C1881e(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public C1881e(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public C1881e(int i, int i2, float f, float f2) {
        C1691j.m6974a(i > 0);
        C1691j.m6974a(i2 > 0);
        this.f6865a = i;
        this.f6866b = i2;
        this.f6867c = f;
        this.f6868d = f2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1881e)) {
            return false;
        }
        C1881e c1881e = (C1881e) obj;
        return this.f6865a == c1881e.f6865a && this.f6866b == c1881e.f6866b;
    }

    public int hashCode() {
        return C1724b.m7072a(this.f6865a, this.f6866b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f6865a), Integer.valueOf(this.f6866b));
    }
}
