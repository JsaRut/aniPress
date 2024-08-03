package p139d.p225c.p226a.p227a.p259k;

import java.nio.ByteBuffer;
import p139d.p225c.p226a.p227a.p230c.AbstractC2199i;

/* renamed from: d.c.a.a.k.c */
/* loaded from: classes.dex */
public abstract class AbstractC2531c extends AbstractC2199i<C2562j, AbstractC2563k, C2547g> implements InterfaceC2540f {

    /* renamed from: n */
    private final String f10461n;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2531c(String str) {
        super(new C2562j[2], new AbstractC2563k[2]);
        this.f10461n = str;
        m9042a(1024);
    }

    /* renamed from: a */
    protected abstract InterfaceC2537e mo10610a(byte[] bArr, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p230c.AbstractC2199i
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final C2547g mo9040a(C2562j c2562j, AbstractC2563k abstractC2563k, boolean z) {
        try {
            ByteBuffer byteBuffer = c2562j.f8040c;
            abstractC2563k.m10794a(c2562j.f8041d, mo10610a(byteBuffer.array(), byteBuffer.limit(), z), c2562j.f10616f);
            abstractC2563k.m9008c(Integer.MIN_VALUE);
            return null;
        } catch (C2547g e2) {
            return e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p225c.p226a.p227a.p230c.AbstractC2199i
    /* renamed from: a */
    public final C2547g mo9041a(Throwable th) {
        return new C2547g("Unexpected decode error", th);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2540f
    /* renamed from: a */
    public void mo10542a(long j) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m10631a(AbstractC2563k abstractC2563k) {
        super.m9044a((AbstractC2531c) abstractC2563k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p230c.AbstractC2199i
    /* renamed from: d, reason: avoid collision after fix types in other method */
    public final C2562j mo9045d() {
        return new C2562j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p230c.AbstractC2199i
    /* renamed from: e, reason: avoid collision after fix types in other method */
    public final AbstractC2563k mo9046e() {
        return new C2534d(this);
    }
}
