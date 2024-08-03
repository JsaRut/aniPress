package android.support.v4.app;

import android.arch.lifecycle.InterfaceC0146f;
import android.arch.lifecycle.InterfaceC0160t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.X */
/* loaded from: classes.dex */
public abstract class AbstractC0186X {
    /* renamed from: a */
    public static <T extends InterfaceC0146f & InterfaceC0160t> AbstractC0186X m837a(T t) {
        return new LoaderManagerImpl(t, t.mo752c());
    }

    /* renamed from: a */
    public abstract void mo772a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo773a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
