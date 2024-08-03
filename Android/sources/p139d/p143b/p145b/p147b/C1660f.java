package p139d.p143b.p145b.p147b;

import java.io.File;
import p139d.p143b.p145b.p147b.C1661g;
import p139d.p143b.p148c.p152d.InterfaceC1694m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.b.b.f */
/* loaded from: classes.dex */
public class C1660f implements InterfaceC1694m<File> {

    /* renamed from: a */
    final /* synthetic */ C1661g.a f6131a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1660f(C1661g.a aVar) {
        this.f6131a = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p143b.p148c.p152d.InterfaceC1694m
    public File get() {
        return this.f6131a.f6155l.getApplicationContext().getCacheDir();
    }
}
