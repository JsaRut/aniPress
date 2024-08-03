package p139d.p143b.p184i.p200n;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import java.util.Map;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p189c.C1843g;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1919c;
import p139d.p143b.p184i.p196j.C1922f;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.V */
/* loaded from: classes.dex */
class C1964V extends AbstractC2014wa<C1716b<AbstractC1918b>> {

    /* renamed from: f */
    final /* synthetic */ InterfaceC2002qa f7186f;

    /* renamed from: g */
    final /* synthetic */ String f7187g;

    /* renamed from: h */
    final /* synthetic */ C2023c f7188h;

    /* renamed from: i */
    final /* synthetic */ C1966X f7189i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1964V(C1966X c1966x, InterfaceC1995n interfaceC1995n, InterfaceC2002qa interfaceC2002qa, String str, String str2, InterfaceC2002qa interfaceC2002qa2, String str3, C2023c c2023c) {
        super(interfaceC1995n, interfaceC2002qa, str, str2);
        this.f7189i = c1966x;
        this.f7186f = interfaceC2002qa2;
        this.f7187g = str3;
        this.f7188h = c2023c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo6941a(C1716b<AbstractC1918b> c1716b) {
        C1716b.m7045b(c1716b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC2014wa, p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: a */
    public void mo6940a(Exception exc) {
        super.mo6940a(exc);
        this.f7186f.mo7174a(this.f7187g, "VideoThumbnailProducer", false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: b */
    public C1716b<AbstractC1918b> mo6942b() {
        String m8039c;
        int m8038b;
        m8039c = this.f7189i.m8039c(this.f7188h);
        if (m8039c == null) {
            return null;
        }
        m8038b = C1966X.m8038b(this.f7188h);
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(m8039c, m8038b);
        if (createVideoThumbnail == null) {
            return null;
        }
        return C1716b.m7043a(new C1919c(createVideoThumbnail, C1843g.m7550a(), C1922f.f7079a, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC2014wa
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map<String, String> mo8022c(C1716b<AbstractC1918b> c1716b) {
        return C1687f.m6957a("createdThumbnail", String.valueOf(c1716b != null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC2014wa, p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: c, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6943b(C1716b<AbstractC1918b> c1716b) {
        super.mo6943b((C1964V) c1716b);
        this.f7186f.mo7174a(this.f7187g, "VideoThumbnailProducer", c1716b != null);
    }
}
