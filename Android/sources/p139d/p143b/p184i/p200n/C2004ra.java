package p139d.p143b.p184i.p200n;

import android.content.ContentResolver;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.ra */
/* loaded from: classes.dex */
public class C2004ra extends AbstractC1961S {

    /* renamed from: c */
    private final ContentResolver f7313c;

    public C2004ra(Executor executor, InterfaceC1711h interfaceC1711h, ContentResolver contentResolver) {
        super(executor, interfaceC1711h);
        this.f7313c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public C1920d mo8001a(C2023c c2023c) {
        return m8031b(this.f7313c.openInputStream(c2023c.m8249o()), -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public String mo8002a() {
        return "QualifiedResourceFetchProducer";
    }
}
