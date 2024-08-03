package p139d.p143b.p169g.p170a.p171a.p172a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: d.b.g.a.a.a.a */
/* loaded from: classes.dex */
public class C1751a implements InterfaceC1755b {

    /* renamed from: a */
    private final List<InterfaceC1755b> f6331a;

    public C1751a(InterfaceC1755b... interfaceC1755bArr) {
        this.f6331a = new ArrayList(interfaceC1755bArr.length);
        Collections.addAll(this.f6331a, interfaceC1755bArr);
    }

    /* renamed from: a */
    public synchronized void m7167a(InterfaceC1755b interfaceC1755b) {
        this.f6331a.add(interfaceC1755b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p169g.p170a.p171a.p172a.InterfaceC1755b
    /* renamed from: a */
    public synchronized void mo7168a(String str, int i, boolean z) {
        int size = this.f6331a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.f6331a.get(i2).mo7168a(str, i, z);
            } catch (Exception e2) {
                C1700a.m6998a("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e2);
            }
        }
    }

    /* renamed from: b */
    public synchronized void m7169b(InterfaceC1755b interfaceC1755b) {
        this.f6331a.remove(interfaceC1755b);
    }
}
