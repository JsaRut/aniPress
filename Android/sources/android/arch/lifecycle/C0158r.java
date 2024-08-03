package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.r */
/* loaded from: classes.dex */
public class C0158r {

    /* renamed from: a */
    private final a f611a;

    /* renamed from: b */
    private final C0159s f612b;

    /* renamed from: android.arch.lifecycle.r$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        <T extends AbstractC0157q> T mo748a(Class<T> cls);
    }

    public C0158r(C0159s c0159s, a aVar) {
        this.f611a = aVar;
        this.f612b = c0159s;
    }

    /* renamed from: a */
    public <T extends AbstractC0157q> T m746a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m747a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* renamed from: a */
    public <T extends AbstractC0157q> T m747a(String str, Class<T> cls) {
        T t = (T) this.f612b.m749a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f611a.mo748a(cls);
        this.f612b.m751a(str, t2);
        return t2;
    }
}
