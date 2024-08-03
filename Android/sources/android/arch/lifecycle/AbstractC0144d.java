package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.d */
/* loaded from: classes.dex */
public abstract class AbstractC0144d {

    /* renamed from: android.arch.lifecycle.d$a */
    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.d$b */
    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m713a(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract b mo710a();

    /* renamed from: a */
    public abstract void mo711a(InterfaceC0145e interfaceC0145e);

    /* renamed from: b */
    public abstract void mo712b(InterfaceC0145e interfaceC0145e);
}
