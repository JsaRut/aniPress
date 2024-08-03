package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import p275e.C2719g;
import p275e.C2722j;

/* loaded from: classes.dex */
public final class HttpHeaders {
    private static final C2722j QUOTED_STRING_DELIMITERS = C2722j.m11725c("\"\\");
    private static final C2722j TOKEN_DELIMITERS = C2722j.m11725c("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) ? false : true;
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007d, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseChallengeHeader(java.util.List<okhttp3.Challenge> r8, p275e.C2719g r9) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipWhitespaceAndCommas(r9)
            java.lang.String r1 = readToken(r9)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipWhitespaceAndCommas(r9)
            java.lang.String r3 = readToken(r9)
            if (r3 != 0) goto L2c
            boolean r9 = r9.mo11695d()
            if (r9 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r9 = new okhttp3.Challenge
            java.util.Map r0 = java.util.Collections.emptyMap()
            r9.<init>(r1, r0)
            r8.add(r9)
            return
        L2c:
            r4 = 61
            int r5 = skipAll(r9, r4)
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r2 != 0) goto L60
            if (r6 != 0) goto L40
            boolean r2 = r9.mo11695d()
            if (r2 == 0) goto L60
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = repeat(r4, r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L60:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = skipAll(r9, r4)
            int r5 = r5 + r6
        L6a:
            if (r3 != 0) goto L7b
            java.lang.String r3 = readToken(r9)
            boolean r5 = skipWhitespaceAndCommas(r9)
            if (r5 == 0) goto L77
            goto L7d
        L77:
            int r5 = skipAll(r9, r4)
        L7b:
            if (r5 != 0) goto L88
        L7d:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L88:
            r6 = 1
            if (r5 <= r6) goto L8c
            return
        L8c:
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r6 == 0) goto L93
            return
        L93:
            boolean r6 = r9.mo11695d()
            if (r6 != 0) goto La8
            r6 = 0
            byte r6 = r9.m11703h(r6)
            r7 = 34
            if (r6 != r7) goto La8
            java.lang.String r6 = readQuotedString(r9)
            goto Lac
        La8:
            java.lang.String r6 = readToken(r9)
        Lac:
            if (r6 != 0) goto Laf
            return
        Laf:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = skipWhitespaceAndCommas(r9)
            if (r3 != 0) goto Lc5
            boolean r3 = r9.mo11695d()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.parseChallengeHeader(java.util.List, e.g):void");
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                C2719g c2719g = new C2719g();
                c2719g.mo11677a(headers.value(i));
                parseChallengeHeader(arrayList, c2719g);
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static String readQuotedString(C2719g c2719g) {
        if (c2719g.readByte() != 34) {
            throw new IllegalArgumentException();
        }
        C2719g c2719g2 = new C2719g();
        while (true) {
            long m11688b = c2719g.m11688b(QUOTED_STRING_DELIMITERS);
            if (m11688b == -1) {
                return null;
            }
            if (c2719g.m11703h(m11688b) == 34) {
                c2719g2.write(c2719g, m11688b);
                c2719g.readByte();
                return c2719g2.m11715p();
            }
            if (c2719g.size() == m11688b + 1) {
                return null;
            }
            c2719g2.write(c2719g, m11688b);
            c2719g.readByte();
            c2719g2.write(c2719g, 1L);
        }
    }

    private static String readToken(C2719g c2719g) {
        try {
            long m11688b = c2719g.m11688b(TOKEN_DELIMITERS);
            if (m11688b == -1) {
                m11688b = c2719g.size();
            }
            if (m11688b != 0) {
                return c2719g.m11705i(m11688b);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static String repeat(char c2, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c2);
        return new String(cArr);
    }

    private static int skipAll(C2719g c2719g, byte b2) {
        int i = 0;
        while (!c2719g.mo11695d() && c2719g.m11703h(0L) == b2) {
            i++;
            c2719g.readByte();
        }
        return i;
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    private static boolean skipWhitespaceAndCommas(C2719g c2719g) {
        boolean z = false;
        while (!c2719g.mo11695d()) {
            byte m11703h = c2719g.m11703h(0L);
            if (m11703h != 44) {
                if (m11703h != 32 && m11703h != 9) {
                    break;
                }
                c2719g.readByte();
            } else {
                c2719g.readByte();
                z = true;
            }
        }
        return z;
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        Set<String> set = emptySet;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                if (set.isEmpty()) {
                    set = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : value.split(",")) {
                    set.add(str.trim());
                }
            }
        }
        return set;
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }
}
