package p139d.p143b.p184i.p192f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: d.b.i.f.a */
/* loaded from: classes.dex */
public class C1884a implements InterfaceC1888e {

    /* renamed from: b */
    private final Executor f6875b;

    /* renamed from: c */
    private final Executor f6876c;

    /* renamed from: a */
    private final Executor f6874a = Executors.newFixedThreadPool(2, new ThreadFactoryC1900q(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d */
    private final Executor f6877d = Executors.newFixedThreadPool(1, new ThreadFactoryC1900q(10, "FrescoLightWeightBackgroundExecutor", true));

    public C1884a(int i) {
        this.f6875b = Executors.newFixedThreadPool(i, new ThreadFactoryC1900q(10, "FrescoDecodeExecutor", true));
        this.f6876c = Executors.newFixedThreadPool(i, new ThreadFactoryC1900q(10, "FrescoBackgroundExecutor", true));
    }

    @Override // p139d.p143b.p184i.p192f.InterfaceC1888e
    /* renamed from: a */
    public Executor mo7667a() {
        return this.f6875b;
    }

    @Override // p139d.p143b.p184i.p192f.InterfaceC1888e
    /* renamed from: b */
    public Executor mo7668b() {
        return this.f6877d;
    }

    @Override // p139d.p143b.p184i.p192f.InterfaceC1888e
    /* renamed from: c */
    public Executor mo7669c() {
        return this.f6876c;
    }

    @Override // p139d.p143b.p184i.p192f.InterfaceC1888e
    /* renamed from: d */
    public Executor mo7670d() {
        return this.f6874a;
    }

    @Override // p139d.p143b.p184i.p192f.InterfaceC1888e
    /* renamed from: e */
    public Executor mo7671e() {
        return this.f6874a;
    }
}
