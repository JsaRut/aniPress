package p139d.p143b.p184i.p200n;

import android.media.ExifInterface;
import java.util.Map;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.M */
/* loaded from: classes.dex */
class C1956M extends AbstractC2014wa<C1920d> {

    /* renamed from: f */
    final /* synthetic */ C2023c f7170f;

    /* renamed from: g */
    final /* synthetic */ C1958O f7171g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1956M(C1958O c1958o, InterfaceC1995n interfaceC1995n, InterfaceC2002qa interfaceC2002qa, String str, String str2, C2023c c2023c) {
        super(interfaceC1995n, interfaceC2002qa, str, str2);
        this.f7171g = c1958o;
        this.f7170f = c2023c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo6941a(C1920d c1920d) {
        C1920d.m7902b(c1920d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: b */
    public C1920d mo6942b() {
        InterfaceC1711h interfaceC1711h;
        C1920d m8025a;
        ExifInterface m8027a = this.f7171g.m8027a(this.f7170f.m8249o());
        if (m8027a == null || !m8027a.hasThumbnail()) {
            return null;
        }
        byte[] thumbnail = m8027a.getThumbnail();
        interfaceC1711h = this.f7171g.f7175b;
        m8025a = this.f7171g.m8025a(interfaceC1711h.mo5038a(thumbnail), m8027a);
        return m8025a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC2014wa
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map<String, String> mo8022c(C1920d c1920d) {
        return C1687f.m6957a("createdThumbnail", Boolean.toString(c1920d != null));
    }
}
