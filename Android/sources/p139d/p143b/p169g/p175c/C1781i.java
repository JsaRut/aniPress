package p139d.p143b.p169g.p175c;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d.b.g.c.i */
/* loaded from: classes.dex */
public class C1781i<INFO> implements InterfaceC1779g<INFO> {

    /* renamed from: a */
    private final List<InterfaceC1779g<? super INFO>> f6506a = new ArrayList(2);

    /* renamed from: c */
    private synchronized void m7322c(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    /* renamed from: a */
    public synchronized void m7323a() {
        this.f6506a.clear();
    }

    /* renamed from: a */
    public synchronized void m7324a(InterfaceC1779g<? super INFO> interfaceC1779g) {
        this.f6506a.add(interfaceC1779g);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public synchronized void mo7170a(String str) {
        int size = this.f6506a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1779g<? super INFO> interfaceC1779g = this.f6506a.get(i);
                if (interfaceC1779g != null) {
                    interfaceC1779g.mo7170a(str);
                }
            } catch (Exception e2) {
                m7322c("InternalListener exception in onRelease", e2);
            }
        }
    }

    @Override // p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public void mo7173a(String str, INFO info) {
        int size = this.f6506a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1779g<? super INFO> interfaceC1779g = this.f6506a.get(i);
                if (interfaceC1779g != null) {
                    interfaceC1779g.mo7173a(str, (String) info);
                }
            } catch (Exception e2) {
                m7322c("InternalListener exception in onIntermediateImageSet", e2);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public synchronized void mo6002a(String str, INFO info, Animatable animatable) {
        int size = this.f6506a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1779g<? super INFO> interfaceC1779g = this.f6506a.get(i);
                if (interfaceC1779g != null) {
                    interfaceC1779g.mo6002a(str, info, animatable);
                }
            } catch (Exception e2) {
                m7322c("InternalListener exception in onFinalImageSet", e2);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: a */
    public synchronized void mo6003a(String str, Throwable th) {
        int size = this.f6506a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1779g<? super INFO> interfaceC1779g = this.f6506a.get(i);
                if (interfaceC1779g != null) {
                    interfaceC1779g.mo6003a(str, th);
                }
            } catch (Exception e2) {
                m7322c("InternalListener exception in onFailure", e2);
            }
        }
    }

    /* renamed from: b */
    public synchronized void m7325b(InterfaceC1779g<? super INFO> interfaceC1779g) {
        int indexOf = this.f6506a.indexOf(interfaceC1779g);
        if (indexOf != -1) {
            this.f6506a.set(indexOf, null);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: b */
    public synchronized void mo6004b(String str, Object obj) {
        int size = this.f6506a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1779g<? super INFO> interfaceC1779g = this.f6506a.get(i);
                if (interfaceC1779g != null) {
                    interfaceC1779g.mo6004b(str, obj);
                }
            } catch (Exception e2) {
                m7322c("InternalListener exception in onSubmit", e2);
            }
        }
    }

    @Override // p139d.p143b.p169g.p175c.InterfaceC1779g
    /* renamed from: b */
    public void mo7321b(String str, Throwable th) {
        int size = this.f6506a.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1779g<? super INFO> interfaceC1779g = this.f6506a.get(i);
                if (interfaceC1779g != null) {
                    interfaceC1779g.mo7321b(str, th);
                }
            } catch (Exception e2) {
                m7322c("InternalListener exception in onIntermediateImageFailed", e2);
            }
        }
    }
}
