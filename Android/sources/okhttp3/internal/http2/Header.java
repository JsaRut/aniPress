package okhttp3.internal.http2;

import okhttp3.Headers;
import okhttp3.internal.Util;
import p275e.C2722j;

/* loaded from: classes.dex */
public final class Header {
    final int hpackSize;
    public final C2722j name;
    public final C2722j value;
    public static final C2722j PSEUDO_PREFIX = C2722j.m11725c(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C2722j RESPONSE_STATUS = C2722j.m11725c(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C2722j TARGET_METHOD = C2722j.m11725c(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C2722j TARGET_PATH = C2722j.m11725c(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final C2722j TARGET_SCHEME = C2722j.m11725c(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C2722j TARGET_AUTHORITY = C2722j.m11725c(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Listener {
        void onHeaders(Headers headers);
    }

    public Header(C2722j c2722j, C2722j c2722j2) {
        this.name = c2722j;
        this.value = c2722j2;
        this.hpackSize = c2722j.mo11655h() + 32 + c2722j2.mo11655h();
    }

    public Header(C2722j c2722j, String str) {
        this(c2722j, C2722j.m11725c(str));
    }

    public Header(String str, String str2) {
        this(C2722j.m11725c(str), C2722j.m11725c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return this.name.equals(header.name) && this.value.equals(header.value);
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return Util.format("%s: %s", this.name.mo11658k(), this.value.mo11658k());
    }
}
