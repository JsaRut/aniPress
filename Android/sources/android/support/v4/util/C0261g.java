package android.support.v4.util;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.util.g */
/* loaded from: classes.dex */
public class C0261g extends Writer {

    /* renamed from: a */
    private final String f1077a;

    /* renamed from: b */
    private StringBuilder f1078b = new StringBuilder(128);

    public C0261g(String str) {
        this.f1077a = str;
    }

    /* renamed from: m */
    private void m1354m() {
        if (this.f1078b.length() > 0) {
            Log.d(this.f1077a, this.f1078b.toString());
            StringBuilder sb = this.f1078b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1354m();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m1354m();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m1354m();
            } else {
                this.f1078b.append(c2);
            }
        }
    }
}
