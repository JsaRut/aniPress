package p139d.p143b.p184i.p200n;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.C1712i;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p183h.C1826b;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p203j.C2032b;
import p139d.p143b.p203j.C2033c;

/* renamed from: d.b.i.n.O */
/* loaded from: classes.dex */
public class C1958O implements InterfaceC1948Ha<C1920d> {

    /* renamed from: a */
    private final Executor f7174a;

    /* renamed from: b */
    private final InterfaceC1711h f7175b;

    /* renamed from: c */
    private final ContentResolver f7176c;

    public C1958O(Executor executor, InterfaceC1711h interfaceC1711h, ContentResolver contentResolver) {
        this.f7174a = executor;
        this.f7175b = interfaceC1711h;
        this.f7176c = contentResolver;
    }

    /* renamed from: a */
    private int m8023a(ExifInterface exifInterface) {
        return C2033c.m8296a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C1920d m8025a(InterfaceC1710g interfaceC1710g, ExifInterface exifInterface) {
        Pair<Integer, Integer> m8295a = C2032b.m8295a(new C1712i(interfaceC1710g));
        int m8023a = m8023a(exifInterface);
        int intValue = m8295a != null ? ((Integer) m8295a.first).intValue() : -1;
        int intValue2 = m8295a != null ? ((Integer) m8295a.second).intValue() : -1;
        C1716b m7043a = C1716b.m7043a(interfaceC1710g);
        try {
            C1920d c1920d = new C1920d((C1716b<InterfaceC1710g>) m7043a);
            C1716b.m7045b(m7043a);
            c1920d.m7906a(C1826b.f6739a);
            c1920d.m7913f(m8023a);
            c1920d.m7915h(intValue);
            c1920d.m7912e(intValue2);
            return c1920d;
        } catch (Throwable th) {
            C1716b.m7045b(m7043a);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ExifInterface m8027a(Uri uri) {
        String m7080a = C1728f.m7080a(this.f7176c, uri);
        try {
            if (m8028a(m7080a)) {
                return new ExifInterface(m7080a);
            }
            return null;
        } catch (IOException unused) {
            return null;
        } catch (StackOverflowError unused2) {
            C1700a.m6989a((Class<?>) C1958O.class, "StackOverflowError in ExifInterface constructor");
            return null;
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        C1956M c1956m = new C1956M(this, interfaceC1995n, interfaceC1998oa.mo8111e(), "LocalExifThumbnailProducer", interfaceC1998oa.getId(), interfaceC1998oa.mo8109c());
        interfaceC1998oa.mo8106a(new C1957N(this, c1956m));
        this.f7174a.execute(c1956m);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1948Ha
    /* renamed from: a */
    public boolean mo7982a(C1881e c1881e) {
        return C1950Ia.m7997a(512, 512, c1881e);
    }

    /* renamed from: a */
    boolean m8028a(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }
}
