package p139d.p143b.p148c.p154f;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import java.util.Map;
import p139d.p143b.p148c.p152d.C1687f;

/* renamed from: d.b.c.f.a */
/* loaded from: classes.dex */
public class C1703a {

    /* renamed from: a */
    public static final Map<String, String> f6225a = C1687f.m6958a("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    public static String m7034a(String str) {
        String m7036c = m7036c(str);
        if (m7036c == null) {
            return null;
        }
        String lowerCase = m7036c.toLowerCase(Locale.US);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        return mimeTypeFromExtension == null ? f6225a.get(lowerCase) : mimeTypeFromExtension;
    }

    /* renamed from: b */
    public static boolean m7035b(String str) {
        return str != null && str.startsWith("video/");
    }

    /* renamed from: c */
    private static String m7036c(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }
}
