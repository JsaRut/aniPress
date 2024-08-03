package p139d.p143b.p169g.p170a.p171a.p172a;

/* renamed from: d.b.g.a.a.a.d */
/* loaded from: classes.dex */
public class C1757d {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m7176a(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1914072202:
                if (str.equals("BitmapMemoryCacheGetProducer")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1307634203:
                if (str.equals("EncodedMemoryCacheProducer")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1224383234:
                if (str.equals("NetworkFetchProducer")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 656304759:
                if (str.equals("DiskCacheProducer")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 957714404:
                if (str.equals("BitmapMemoryCacheProducer")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return 3;
        }
        if (c2 == 2) {
            return 2;
        }
        if (c2 != 3) {
            return c2 != 4 ? -1 : 0;
        }
        return 1;
    }
}
