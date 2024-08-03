package p139d.p143b.p148c.p159k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: d.b.c.k.f */
/* loaded from: classes.dex */
public class C1728f {

    /* renamed from: a */
    private static final Uri f6271a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    /* renamed from: a */
    public static Uri m7079a(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: a */
    public static String m7080a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor;
        int columnIndex;
        String str = null;
        if (!m7086f(uri)) {
            if (m7087g(uri)) {
                return uri.getPath();
            }
            return null;
        }
        try {
            cursor = contentResolver.query(uri, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst() && (columnIndex = cursor.getColumnIndex("_data")) != -1) {
                        str = cursor.getString(columnIndex);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor == null) {
                return str;
            }
            cursor.close();
            return str;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* renamed from: a */
    public static String m7081a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: b */
    public static boolean m7082b(Uri uri) {
        return "data".equals(m7081a(uri));
    }

    /* renamed from: c */
    public static boolean m7083c(Uri uri) {
        return "asset".equals(m7081a(uri));
    }

    /* renamed from: d */
    public static boolean m7084d(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    /* renamed from: e */
    public static boolean m7085e(Uri uri) {
        return m7086f(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(f6271a.getPath());
    }

    /* renamed from: f */
    public static boolean m7086f(Uri uri) {
        return "content".equals(m7081a(uri));
    }

    /* renamed from: g */
    public static boolean m7087g(Uri uri) {
        return "file".equals(m7081a(uri));
    }

    /* renamed from: h */
    public static boolean m7088h(Uri uri) {
        return "res".equals(m7081a(uri));
    }

    /* renamed from: i */
    public static boolean m7089i(Uri uri) {
        String m7081a = m7081a(uri);
        return "https".equals(m7081a) || "http".equals(m7081a);
    }

    /* renamed from: j */
    public static boolean m7090j(Uri uri) {
        return "android.resource".equals(m7081a(uri));
    }

    /* renamed from: k */
    public static URL m7091k(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }
}
