package okhttp3;

import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p275e.C2722j;

/* loaded from: classes.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        return "Basic " + C2722j.m11722a(str + ":" + str2, charset).mo11649b();
    }
}
