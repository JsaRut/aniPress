package p139d.p143b.p148c.p152d;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: d.b.c.d.b */
/* loaded from: classes.dex */
public final class C1683b {

    /* renamed from: a */
    static final Logger f6209a = Logger.getLogger(C1683b.class.getName());

    private C1683b() {
    }

    /* renamed from: a */
    public static void m6953a(Closeable closeable, boolean z) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            if (!z) {
                throw e2;
            }
            f6209a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e2);
        }
    }

    /* renamed from: a */
    public static void m6954a(InputStream inputStream) {
        try {
            m6953a(inputStream, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
