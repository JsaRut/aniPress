package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
public abstract class AbstractC0489b {
    /* renamed from: a */
    protected static <T extends InterfaceC0491d> T m2594a(String str, AbstractC0489b abstractC0489b) {
        try {
            return (T) Class.forName(str, true, AbstractC0489b.class.getClassLoader()).getDeclaredMethod("read", AbstractC0489b.class).invoke(null, abstractC0489b);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* renamed from: a */
    private static Class m2595a(Class<? extends InterfaceC0491d> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }

    /* renamed from: a */
    protected static <T extends InterfaceC0491d> void m2596a(T t, AbstractC0489b abstractC0489b) {
        try {
            m2597b(t).getDeclaredMethod("write", t.getClass(), AbstractC0489b.class).invoke(null, t, abstractC0489b);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (!(e5.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
            throw ((RuntimeException) e5.getCause());
        }
    }

    /* renamed from: b */
    private static <T extends InterfaceC0491d> Class m2597b(T t) {
        return m2595a((Class<? extends InterfaceC0491d>) t.getClass());
    }

    /* renamed from: c */
    private void m2598c(InterfaceC0491d interfaceC0491d) {
        try {
            mo2606a(m2595a((Class<? extends InterfaceC0491d>) interfaceC0491d.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(interfaceC0491d.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    /* renamed from: a */
    public int m2599a(int i, int i2) {
        return !mo2609a(i2) ? i : mo2621e();
    }

    /* renamed from: a */
    public <T extends Parcelable> T m2600a(T t, int i) {
        return !mo2609a(i) ? t : (T) mo2622f();
    }

    /* renamed from: a */
    public <T extends InterfaceC0491d> T m2601a(T t, int i) {
        return !mo2609a(i) ? t : (T) m2624h();
    }

    /* renamed from: a */
    public String m2602a(String str, int i) {
        return !mo2609a(i) ? str : mo2623g();
    }

    /* renamed from: a */
    protected abstract void mo2603a();

    /* renamed from: a */
    protected abstract void mo2604a(Parcelable parcelable);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2605a(InterfaceC0491d interfaceC0491d) {
        if (interfaceC0491d == null) {
            mo2606a((String) null);
            return;
        }
        m2598c(interfaceC0491d);
        AbstractC0489b mo2611b = mo2611b();
        m2596a(interfaceC0491d, mo2611b);
        mo2611b.mo2603a();
    }

    /* renamed from: a */
    protected abstract void mo2606a(String str);

    /* renamed from: a */
    public void m2607a(boolean z, boolean z2) {
    }

    /* renamed from: a */
    protected abstract void mo2608a(byte[] bArr);

    /* renamed from: a */
    protected abstract boolean mo2609a(int i);

    /* renamed from: a */
    public byte[] m2610a(byte[] bArr, int i) {
        return !mo2609a(i) ? bArr : mo2620d();
    }

    /* renamed from: b */
    protected abstract AbstractC0489b mo2611b();

    /* renamed from: b */
    protected abstract void mo2612b(int i);

    /* renamed from: b */
    public void m2613b(int i, int i2) {
        mo2612b(i2);
        mo2618c(i);
    }

    /* renamed from: b */
    public void m2614b(Parcelable parcelable, int i) {
        mo2612b(i);
        mo2604a(parcelable);
    }

    /* renamed from: b */
    public void m2615b(InterfaceC0491d interfaceC0491d, int i) {
        mo2612b(i);
        m2605a(interfaceC0491d);
    }

    /* renamed from: b */
    public void m2616b(String str, int i) {
        mo2612b(i);
        mo2606a(str);
    }

    /* renamed from: b */
    public void m2617b(byte[] bArr, int i) {
        mo2612b(i);
        mo2608a(bArr);
    }

    /* renamed from: c */
    protected abstract void mo2618c(int i);

    /* renamed from: c */
    public boolean m2619c() {
        return false;
    }

    /* renamed from: d */
    protected abstract byte[] mo2620d();

    /* renamed from: e */
    protected abstract int mo2621e();

    /* renamed from: f */
    protected abstract <T extends Parcelable> T mo2622f();

    /* renamed from: g */
    protected abstract String mo2623g();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends InterfaceC0491d> T m2624h() {
        String mo2623g = mo2623g();
        if (mo2623g == null) {
            return null;
        }
        return (T) m2594a(mo2623g, mo2611b());
    }
}
