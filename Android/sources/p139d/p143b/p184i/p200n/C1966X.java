package p139d.p143b.p184i.p200n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.X */
/* loaded from: classes.dex */
public class C1966X implements InterfaceC1996na<C1716b<AbstractC1918b>> {

    /* renamed from: a */
    private final Executor f7192a;

    /* renamed from: b */
    private final ContentResolver f7193b;

    public C1966X(Executor executor, ContentResolver contentResolver) {
        this.f7192a = executor;
        this.f7193b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m8038b(C2023c c2023c) {
        return (c2023c.m8242h() > 96 || c2023c.m8241g() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m8039c(C2023c c2023c) {
        Uri uri;
        String str;
        String[] strArr;
        Uri m8249o = c2023c.m8249o();
        if (C1728f.m7087g(m8249o)) {
            return c2023c.m8248n().getPath();
        }
        if (C1728f.m7086f(m8249o)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(m8249o.getAuthority())) {
                uri = m8249o;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(m8249o);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f7193b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        InterfaceC2002qa mo8111e = interfaceC1998oa.mo8111e();
        String id = interfaceC1998oa.getId();
        C1964V c1964v = new C1964V(this, interfaceC1995n, mo8111e, "VideoThumbnailProducer", id, mo8111e, id, interfaceC1998oa.mo8109c());
        interfaceC1998oa.mo8106a(new C1965W(this, c1964v));
        this.f7192a.execute(c1964v);
    }
}
