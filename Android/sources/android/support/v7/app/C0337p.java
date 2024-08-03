package android.support.v7.app;

import android.content.res.Resources;
import java.lang.Thread;

/* renamed from: android.support.v7.app.p */
/* loaded from: classes.dex */
class C0337p implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f1578a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0337p(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1578a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private boolean m1854a(Throwable th) {
        String message;
        if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
            return false;
        }
        return message.contains("drawable") || message.contains("Drawable");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!m1854a(th)) {
            this.f1578a.uncaughtException(thread, th);
            return;
        }
        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
        notFoundException.initCause(th.getCause());
        notFoundException.setStackTrace(th.getStackTrace());
        this.f1578a.uncaughtException(thread, notFoundException);
    }
}
