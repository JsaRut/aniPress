package p000a.p005b.p009c.p017f;

import java.util.ArrayList;
import p000a.p005b.p009c.p017f.C0058f;
import p000a.p005b.p009c.p017f.C0063k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.b.c.f.d */
/* loaded from: classes.dex */
public class C0056d implements C0063k.a<C0058f.c> {

    /* renamed from: a */
    final /* synthetic */ String f188a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0056d(String str) {
        this.f188a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p000a.p005b.p009c.p017f.C0063k.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo241a(C0058f.c cVar) {
        synchronized (C0058f.f191c) {
            ArrayList<C0063k.a<C0058f.c>> arrayList = C0058f.f192d.get(this.f188a);
            if (arrayList == null) {
                return;
            }
            C0058f.f192d.remove(this.f188a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).mo241a(cVar);
            }
        }
    }
}
