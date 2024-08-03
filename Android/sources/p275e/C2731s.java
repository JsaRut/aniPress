package p275e;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.s */
/* loaded from: classes.dex */
public final class C2731s extends C2715c {

    /* renamed from: a */
    final /* synthetic */ Socket f11417a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2731s(Socket socket) {
        this.f11417a = socket;
    }

    @Override // p275e.C2715c
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p275e.C2715c
    protected void timedOut() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Exception exc;
        try {
            this.f11417a.close();
        } catch (AssertionError e2) {
            if (!C2732t.m11746a(e2)) {
                throw e2;
            }
            Logger logger2 = C2732t.f11418a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e2;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f11417a);
            logger.log(level, sb.toString(), (Throwable) exc);
        } catch (Exception e3) {
            Logger logger3 = C2732t.f11418a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e3;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f11417a);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
