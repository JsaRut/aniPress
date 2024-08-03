package p139d.p143b.p184i.p200n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;
import p139d.p143b.p203j.C2033c;

/* renamed from: d.b.i.n.L */
/* loaded from: classes.dex */
public class C1955L extends AbstractC1961S implements InterfaceC1948Ha<C1920d> {

    /* renamed from: c */
    private static final Class<?> f7164c = C1955L.class;

    /* renamed from: d */
    private static final String[] f7165d = {"_id", "_data"};

    /* renamed from: e */
    private static final String[] f7166e = {"_data"};

    /* renamed from: f */
    private static final Rect f7167f = new Rect(0, 0, 512, 384);

    /* renamed from: g */
    private static final Rect f7168g = new Rect(0, 0, 96, 96);

    /* renamed from: h */
    private final ContentResolver f7169h;

    public C1955L(Executor executor, InterfaceC1711h interfaceC1711h, ContentResolver contentResolver) {
        super(executor, interfaceC1711h);
        this.f7169h = contentResolver;
    }

    /* renamed from: a */
    private static int m8015a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: a */
    private C1920d m8016a(Uri uri, C1881e c1881e) {
        C1920d m8017a;
        Cursor query = this.f7169h.query(uri, f7165d, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (c1881e == null || (m8017a = m8017a(c1881e, query.getInt(query.getColumnIndex("_id")))) == null) {
                return null;
            }
            m8017a.m7913f(m8019b(string));
            return m8017a;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    private C1920d m8017a(C1881e c1881e, int i) {
        Cursor cursor;
        int m8018b = m8018b(c1881e);
        if (m8018b == 0) {
            return null;
        }
        try {
            cursor = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f7169h, i, m8018b, f7166e);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                cursor.moveToFirst();
                if (cursor.getCount() > 0) {
                    String string = cursor.getString(cursor.getColumnIndex("_data"));
                    if (new File(string).exists()) {
                        C1920d m8031b = m8031b(new FileInputStream(string), m8015a(string));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return m8031b;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* renamed from: b */
    private static int m8018b(C1881e c1881e) {
        if (C1950Ia.m7997a(f7168g.width(), f7168g.height(), c1881e)) {
            return 3;
        }
        return C1950Ia.m7997a(f7167f.width(), f7167f.height(), c1881e) ? 1 : 0;
    }

    /* renamed from: b */
    private static int m8019b(String str) {
        if (str != null) {
            try {
                return C2033c.m8296a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e2) {
                C1700a.m6996a(f7164c, e2, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public C1920d mo8001a(C2023c c2023c) {
        C1920d m8016a;
        Uri m8249o = c2023c.m8249o();
        if (!C1728f.m7084d(m8249o) || (m8016a = m8016a(m8249o, c2023c.m8246l())) == null) {
            return null;
        }
        return m8016a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public String mo8002a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1948Ha
    /* renamed from: a */
    public boolean mo7982a(C1881e c1881e) {
        return C1950Ia.m7997a(f7167f.width(), f7167f.height(), c1881e);
    }
}
