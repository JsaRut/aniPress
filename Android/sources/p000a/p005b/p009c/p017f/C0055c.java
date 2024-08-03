package p000a.p005b.p009c.p017f;

import android.os.Handler;
import p000a.p005b.p009c.p010a.p011a.C0030h;
import p000a.p005b.p009c.p017f.C0058f;
import p000a.p005b.p009c.p017f.C0063k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.b.c.f.c */
/* loaded from: classes.dex */
public class C0055c implements C0063k.a<C0058f.c> {

    /* renamed from: a */
    final /* synthetic */ C0030h.a f186a;

    /* renamed from: b */
    final /* synthetic */ Handler f187b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0055c(C0030h.a aVar, Handler handler) {
        this.f186a = aVar;
        this.f187b = handler;
    }

    @Override // p000a.p005b.p009c.p017f.C0063k.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo241a(C0058f.c cVar) {
        int i;
        C0030h.a aVar;
        if (cVar == null) {
            aVar = this.f186a;
            i = 1;
        } else {
            i = cVar.f202b;
            if (i == 0) {
                this.f186a.m142a(cVar.f201a, this.f187b);
                return;
            }
            aVar = this.f186a;
        }
        aVar.m140a(i, this.f187b);
    }
}
