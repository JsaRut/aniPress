package p031c.p032a.p072p.p073a.p080f;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: c.a.p.a.f.f */
/* loaded from: classes.dex */
public final class C0754f {
    /* renamed from: a */
    public static void m3778a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
