package p139d.p225c.p226a.p227a.p270n;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;

/* renamed from: d.c.a.a.n.I */
/* loaded from: classes.dex */
public final class C2622I {

    /* renamed from: a */
    public static final int f10916a = Build.VERSION.SDK_INT;

    /* renamed from: b */
    public static final String f10917b = Build.DEVICE;

    /* renamed from: c */
    public static final String f10918c = Build.MANUFACTURER;

    /* renamed from: d */
    public static final String f10919d = Build.MODEL;

    /* renamed from: e */
    public static final String f10920e = f10917b + ", " + f10919d + ", " + f10918c + ", " + f10916a;

    /* renamed from: f */
    public static final byte[] f10921f = new byte[0];

    /* renamed from: g */
    private static final Pattern f10922g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    private static final Pattern f10923h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    private static final Pattern f10924i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    private static final int[] f10925j = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: a */
    public static float m11035a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: a */
    public static int m11036a(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f10916a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m11037a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    public static int m11038a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: a */
    private static int m11039a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            default:
                return 6;
            case 18:
                return 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.Comparable<? super T>> int m11040a(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L21
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            if (r4 == 0) goto L20
            int r2 = r0 + 1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r5 == 0) goto L28
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p270n.C2622I.m11040a(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: a */
    public static int m11041a(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f10925j[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m11042a(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L9
            r5 = r0 ^ (-1)
            goto L1b
        L9:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L15
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L15
            goto L9
        L15:
            if (r7 == 0) goto L1a
            int r5 = r0 + (-1)
            goto L1b
        L1a:
            r5 = r0
        L1b:
            if (r8 == 0) goto L24
            int r4 = r4.length
            int r4 = r4 + (-1)
            int r5 = java.lang.Math.min(r4, r5)
        L24:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p270n.C2622I.m11042a(long[], long, boolean, boolean):int");
    }

    /* renamed from: a */
    public static long m11043a(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d2 = j;
        double d3 = f;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    /* renamed from: a */
    public static long m11044a(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: a */
    public static long m11045a(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: a */
    public static long m11046a(long j, C2147L c2147l, long j2, long j3) {
        if (C2147L.f7661a.equals(c2147l)) {
            return j;
        }
        long m11089d = m11089d(j, c2147l.f7666f, Long.MIN_VALUE);
        long m11045a = m11045a(j, c2147l.f7667g, Long.MAX_VALUE);
        boolean z = m11089d <= j2 && j2 <= m11045a;
        boolean z2 = m11089d <= j3 && j3 <= m11045a;
        return (z && z2) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z ? j2 : z2 ? j3 : m11089d;
    }

    /* renamed from: a */
    public static Handler m11047a(Handler.Callback callback) {
        return m11048a(m11049a(), callback);
    }

    /* renamed from: a */
    public static Handler m11048a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: a */
    public static Looper m11049a() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: a */
    public static <T> T m11050a(T t) {
        return t;
    }

    /* renamed from: a */
    public static String m11051a(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return m11099k(networkCountryIso);
            }
        }
        return m11099k(Locale.getDefault().getCountry());
    }

    /* renamed from: a */
    public static String m11052a(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.9.3";
    }

    /* renamed from: a */
    public static String m11053a(String str, int i) {
        String[] m11097i = m11097i(str);
        if (m11097i.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : m11097i) {
            if (i == C2641r.m11170e(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m11054a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static String m11055a(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        return (j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)) : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3))).toString();
    }

    /* renamed from: a */
    public static String m11056a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public static String m11057a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m11058a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: a */
    public static void m11059a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m11060a(InterfaceC2597k interfaceC2597k) {
        if (interfaceC2597k != null) {
            try {
                interfaceC2597k.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m11061a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static <T> void m11062a(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: a */
    public static void m11063a(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
            return;
        }
        double d2 = j;
        double d3 = j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        while (i < jArr.length) {
            double d5 = jArr[i];
            Double.isNaN(d5);
            jArr[i] = (long) (d5 * d4);
            i++;
        }
    }

    /* renamed from: a */
    public static boolean m11064a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: a */
    public static boolean m11065a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:            return false;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m11066a(p139d.p225c.p226a.p227a.p270n.C2644u r4, p139d.p225c.p226a.p227a.p270n.C2644u r5, java.util.zip.Inflater r6) {
        /*
            int r0 = r4.m11208a()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            byte[] r0 = r5.f11004a
            int r2 = r0.length
            int r3 = r4.m11208a()
            if (r2 >= r3) goto L19
            int r0 = r4.m11208a()
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
        L19:
            if (r6 != 0) goto L20
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r6.<init>()
        L20:
            byte[] r2 = r4.f11004a
            int r3 = r4.m11217c()
            int r4 = r4.m11208a()
            r6.setInput(r2, r3, r4)
            r4 = 0
        L2e:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            int r2 = r2 - r4
            int r2 = r6.inflate(r0, r4, r2)     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            int r4 = r4 + r2
            boolean r2 = r6.finished()     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            if (r2 == 0) goto L43
            r5.m11213a(r0, r4)     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            r4 = 1
            r6.reset()
            return r4
        L43:
            boolean r2 = r6.needsDictionary()     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            if (r2 != 0) goto L5b
            boolean r2 = r6.needsInput()     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            if (r2 == 0) goto L50
            goto L5b
        L50:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            if (r4 != r2) goto L2e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            int r2 = r2 * 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L5f java.util.zip.DataFormatException -> L64
            goto L2e
        L5b:
            r6.reset()
            return r1
        L5f:
            r4 = move-exception
            r6.reset()
            throw r4
        L64:
            r6.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p270n.C2622I.m11066a(d.c.a.a.n.u, d.c.a.a.n.u, java.util.zip.Inflater):boolean");
    }

    /* renamed from: a */
    public static boolean m11067a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public static byte[] m11068a(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static int[] m11069a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static long[] m11070a(List<Long> list, long j, long j2) {
        long[] jArr = new long[list.size()];
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = list.get(i).longValue() / j3;
                i++;
            }
        } else if (j2 >= j || j % j2 != 0) {
            double d2 = j;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 / d3;
            while (i < jArr.length) {
                double longValue = list.get(i).longValue();
                Double.isNaN(longValue);
                jArr[i] = (long) (longValue * d4);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = list.get(i).longValue() * j4;
                i++;
            }
        }
        return jArr;
    }

    /* renamed from: a */
    public static <T> T[] m11071a(T[] tArr) {
        return tArr;
    }

    /* renamed from: a */
    public static <T> T[] m11072a(T[] tArr, int i) {
        C2628e.m11111a(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    /* renamed from: a */
    public static String[] m11073a(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: b */
    public static int m11074b(int i) {
        switch (i) {
            case 0:
                return 16777216;
            case 1:
                return 3538944;
            case 2:
                return 13107200;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static int m11075b(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 * 2;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 * 4;
    }

    /* renamed from: b */
    public static int m11076b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: b */
    public static int m11077b(Context context) {
        ConnectivityManager connectivityManager;
        int i = 0;
        if (context == null) {
            return 0;
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (SecurityException unused) {
        }
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        i = 1;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            return m11039a(activeNetworkInfo);
        }
        return i;
    }

    /* renamed from: b */
    public static int m11078b(String str) {
        int length = str.length();
        C2628e.m11111a(length <= 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m11079b(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r4 = -r0
            goto L1b
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L15
            goto La
        L15:
            if (r7 == 0) goto L1a
            int r4 = r0 + 1
            goto L1b
        L1a:
            r4 = r0
        L1b:
            if (r8 == 0) goto L22
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L22:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p270n.C2622I.m11079b(long[], long, boolean, boolean):int");
    }

    /* renamed from: b */
    public static long m11080b(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d2 = j;
        double d3 = f;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    /* renamed from: b */
    public static long m11081b(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: b */
    public static String m11082b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String[] m11083b(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: c */
    public static int m11084c(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public static long m11085c(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d2 = j2;
        double d3 = j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = j;
        Double.isNaN(d4);
        return (long) (d4 * (d2 / d3));
    }

    /* renamed from: c */
    public static byte[] m11086c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public static int m11087d(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    /* renamed from: d */
    public static int m11088d(String str) {
        String m11098j = m11098j(str);
        if (m11098j.endsWith(".mpd")) {
            return 0;
        }
        if (m11098j.endsWith(".m3u8")) {
            return 2;
        }
        return m11098j.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    /* renamed from: d */
    public static long m11089d(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: e */
    public static ExecutorService m11090e(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: d.c.a.a.n.d

            /* renamed from: a */
            private final /* synthetic */ String f10942a;

            public /* synthetic */ ThreadFactoryC2627d(String str2) {
                r1 = str2;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C2622I.m11058a(r1, runnable);
            }
        });
    }

    /* renamed from: e */
    public static boolean m11091e(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    /* renamed from: f */
    public static String m11092f(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return m11098j(str);
        }
    }

    /* renamed from: f */
    public static boolean m11093f(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    /* renamed from: g */
    public static long m11094g(String str) {
        Matcher matcher = f10922g.matcher(str);
        if (!matcher.matches()) {
            throw new C2683z("Invalid date/time format: " + str);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* renamed from: g */
    public static boolean m11095g(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: h */
    public static long m11096h(String str) {
        Matcher matcher = f10923h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? 3600.0d * Double.parseDouble(group4) : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    /* renamed from: i */
    public static String[] m11097i(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m11073a(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: j */
    public static String m11098j(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    /* renamed from: k */
    public static String m11099k(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }
}
