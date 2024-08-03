package p139d.p225c.p226a.p227a.p234f.p239e;

import java.nio.ByteBuffer;
import java.util.UUID;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.e.k */
/* loaded from: classes.dex */
public final class C2266k {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.e.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final UUID f8652a;

        /* renamed from: b */
        private final int f8653b;

        /* renamed from: c */
        private final byte[] f8654c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f8652a = uuid;
            this.f8653b = i;
            this.f8654c = bArr;
        }
    }

    /* renamed from: a */
    public static UUID m9410a(byte[] bArr) {
        a m9413b = m9413b(bArr);
        if (m9413b == null) {
            return null;
        }
        return m9413b.f8652a;
    }

    /* renamed from: a */
    public static byte[] m9411a(UUID uuid, byte[] bArr) {
        return m9412a(uuid, null, bArr);
    }

    /* renamed from: a */
    public static byte[] m9412a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(AbstractC2258c.f8442U);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: b */
    private static a m9413b(byte[] bArr) {
        C2644u c2644u = new C2644u(bArr);
        if (c2644u.m11219d() < 32) {
            return null;
        }
        c2644u.m11222e(0);
        if (c2644u.m11226h() != c2644u.m11208a() + 4 || c2644u.m11226h() != AbstractC2258c.f8442U) {
            return null;
        }
        int m9304c = AbstractC2258c.m9304c(c2644u.m11226h());
        if (m9304c > 1) {
            C2638o.m11160d("PsshAtomUtil", "Unsupported pssh version: " + m9304c);
            return null;
        }
        UUID uuid = new UUID(c2644u.m11234p(), c2644u.m11234p());
        if (m9304c == 1) {
            c2644u.m11224f(c2644u.m11242x() * 16);
        }
        int m11242x = c2644u.m11242x();
        if (m11242x != c2644u.m11208a()) {
            return null;
        }
        byte[] bArr2 = new byte[m11242x];
        c2644u.m11214a(bArr2, 0, m11242x);
        return new a(uuid, m9304c, bArr2);
    }
}
