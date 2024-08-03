package okhttp3.internal.cache;

import java.io.IOException;
import p275e.AbstractC2723k;
import p275e.C2719g;
import p275e.InterfaceC2708C;

/* loaded from: classes.dex */
class FaultHidingSink extends AbstractC2723k {
    private boolean hasErrors;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(InterfaceC2708C interfaceC2708C) {
        super(interfaceC2708C);
    }

    @Override // p275e.AbstractC2723k, p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }

    @Override // p275e.AbstractC2723k, p275e.InterfaceC2708C, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }

    protected void onException(IOException iOException) {
    }

    @Override // p275e.AbstractC2723k, p275e.InterfaceC2708C
    public void write(C2719g c2719g, long j) {
        if (this.hasErrors) {
            c2719g.skip(j);
            return;
        }
        try {
            super.write(c2719g, j);
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }
}
