package p139d.p143b.p184i.p192f;

import android.net.Uri;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.InterfaceC1692k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.f.h */
/* loaded from: classes.dex */
public class C1891h implements InterfaceC1692k<InterfaceC1648d> {

    /* renamed from: a */
    final /* synthetic */ Uri f6880a;

    /* renamed from: b */
    final /* synthetic */ C1893j f6881b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1891h(C1893j c1893j, Uri uri) {
        this.f6881b = c1893j;
        this.f6880a = uri;
    }

    @Override // p139d.p143b.p148c.p152d.InterfaceC1692k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean apply(InterfaceC1648d interfaceC1648d) {
        return interfaceC1648d.mo6818a(this.f6880a);
    }
}
