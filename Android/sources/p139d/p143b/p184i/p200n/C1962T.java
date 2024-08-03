package p139d.p143b.p184i.p200n;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.T */
/* loaded from: classes.dex */
public class C1962T extends AbstractC1961S {
    public C1962T(Executor executor, InterfaceC1711h interfaceC1711h) {
        super(executor, interfaceC1711h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public C1920d mo8001a(C2023c c2023c) {
        return m8031b(new FileInputStream(c2023c.m8248n().toString()), (int) c2023c.m8248n().length());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public String mo8002a() {
        return "LocalFileFetchProducer";
    }
}
