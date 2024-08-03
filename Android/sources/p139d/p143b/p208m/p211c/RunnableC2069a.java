package p139d.p143b.p208m.p211c;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.c.a */
/* loaded from: classes.dex */
public class RunnableC2069a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f7519a;

    /* renamed from: b */
    final /* synthetic */ C2070b f7520b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2069a(C2070b c2070b, int i) {
        this.f7520b = c2070b;
        this.f7519a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set set;
        set = this.f7520b.f7523c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC2071c) it.next()).onHeadlessJsTaskFinish(this.f7519a);
        }
    }
}
