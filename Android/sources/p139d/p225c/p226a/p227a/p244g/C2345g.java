package p139d.p225c.p226a.p227a.p244g;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2641r;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* renamed from: d.c.a.a.g.g */
/* loaded from: classes.dex */
public final class C2345g {

    /* renamed from: e */
    private static final SparseIntArray f9258e;

    /* renamed from: f */
    private static final Map<String, Integer> f9259f;

    /* renamed from: g */
    private static final SparseIntArray f9260g;

    /* renamed from: a */
    private static final Pattern f9254a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final f f9255b = new f();

    /* renamed from: c */
    private static final HashMap<a, List<C2339a>> f9256c = new HashMap<>();

    /* renamed from: h */
    private static int f9261h = -1;

    /* renamed from: d */
    private static final SparseIntArray f9257d = new SparseIntArray();

    /* renamed from: d.c.a.a.g.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f9262a;

        /* renamed from: b */
        public final boolean f9263b;

        public a(String str, boolean z) {
            this.f9262a = str;
            this.f9263b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f9262a, aVar.f9262a) && this.f9263b == aVar.f9263b;
        }

        public int hashCode() {
            String str = this.f9262a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f9263b ? 1231 : 1237);
        }
    }

    /* renamed from: d.c.a.a.g.g$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }

        /* synthetic */ b(Throwable th, C2344f c2344f) {
            this(th);
        }
    }

    /* renamed from: d.c.a.a.g.g$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo9785a();

        /* renamed from: a */
        MediaCodecInfo mo9786a(int i);

        /* renamed from: a */
        boolean mo9787a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo9788b();
    }

    /* renamed from: d.c.a.a.g.g$d */
    /* loaded from: classes.dex */
    public static final class d implements c {
        private d() {
        }

        /* synthetic */ d(C2344f c2344f) {
            this();
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: a */
        public int mo9785a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: a */
        public MediaCodecInfo mo9786a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: a */
        public boolean mo9787a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: b */
        public boolean mo9788b() {
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: d.c.a.a.g.g$e */
    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a */
        private final int f9264a;

        /* renamed from: b */
        private MediaCodecInfo[] f9265b;

        public e(boolean z) {
            this.f9264a = z ? 1 : 0;
        }

        /* renamed from: c */
        private void m9789c() {
            if (this.f9265b == null) {
                this.f9265b = new MediaCodecList(this.f9264a).getCodecInfos();
            }
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: a */
        public int mo9785a() {
            m9789c();
            return this.f9265b.length;
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: a */
        public MediaCodecInfo mo9786a(int i) {
            m9789c();
            return this.f9265b[i];
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: a */
        public boolean mo9787a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // p139d.p225c.p226a.p227a.p244g.C2345g.c
        /* renamed from: b */
        public boolean mo9788b() {
            return true;
        }
    }

    /* renamed from: d.c.a.a.g.g$f */
    /* loaded from: classes.dex */
    public static final class f implements Comparator<C2339a> {
        private f() {
        }

        /* synthetic */ f(C2344f c2344f) {
            this();
        }

        /* renamed from: a */
        private static int m9790a(C2339a c2339a) {
            String str = c2339a.f9189a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return -1;
            }
            return (C2622I.f10916a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C2339a c2339a, C2339a c2339a2) {
            return m9790a(c2339a) - m9790a(c2339a2);
        }
    }

    static {
        f9257d.put(66, 1);
        f9257d.put(77, 2);
        f9257d.put(88, 4);
        f9257d.put(100, 8);
        f9257d.put(C0121j.AppCompatTheme_viewInflaterClass, 16);
        f9257d.put(122, 32);
        f9257d.put(244, 64);
        f9258e = new SparseIntArray();
        f9258e.put(10, 1);
        f9258e.put(11, 4);
        f9258e.put(12, 8);
        f9258e.put(13, 16);
        f9258e.put(20, 32);
        f9258e.put(21, 64);
        f9258e.put(22, 128);
        f9258e.put(30, 256);
        f9258e.put(31, 512);
        f9258e.put(32, 1024);
        f9258e.put(40, 2048);
        f9258e.put(41, 4096);
        f9258e.put(42, 8192);
        f9258e.put(50, 16384);
        f9258e.put(51, 32768);
        f9258e.put(52, 65536);
        f9259f = new HashMap();
        f9259f.put("L30", 1);
        f9259f.put("L60", 4);
        f9259f.put("L63", 16);
        f9259f.put("L90", 64);
        f9259f.put("L93", 256);
        f9259f.put("L120", 1024);
        f9259f.put("L123", 4096);
        f9259f.put("L150", 16384);
        f9259f.put("L153", 65536);
        f9259f.put("L156", 262144);
        f9259f.put("L180", 1048576);
        f9259f.put("L183", 4194304);
        f9259f.put("L186", 16777216);
        f9259f.put("H30", 2);
        f9259f.put("H60", 8);
        f9259f.put("H63", 32);
        f9259f.put("H90", 128);
        f9259f.put("H93", 512);
        f9259f.put("H120", 2048);
        f9259f.put("H123", 8192);
        f9259f.put("H150", 32768);
        f9259f.put("H153", 131072);
        f9259f.put("H156", 524288);
        f9259f.put("H180", 2097152);
        f9259f.put("H183", 8388608);
        f9259f.put("H186", 33554432);
        f9260g = new SparseIntArray();
        f9260g.put(1, 1);
        f9260g.put(2, 2);
        f9260g.put(3, 3);
        f9260g.put(4, 4);
        f9260g.put(5, 5);
        f9260g.put(6, 6);
        f9260g.put(17, 17);
        f9260g.put(20, 20);
        f9260g.put(23, 23);
        f9260g.put(29, 29);
        f9260g.put(39, 39);
        f9260g.put(42, 42);
    }

    /* renamed from: a */
    private static int m9772a(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case C0121j.AppCompatTheme_activityChooserViewStyle /* 32 */:
                return 101376;
            case C0121j.AppCompatTheme_dropDownListViewStyle /* 64 */:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:            if (r3.equals("hev1") != false) goto L96;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m9773a(java.lang.String r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r10.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            switch(r5) {
                case 3006243: goto L41;
                case 3006244: goto L37;
                case 3199032: goto L2e;
                case 3214780: goto L24;
                case 3356560: goto L1a;
                default: goto L19;
            }
        L19:
            goto L4b
        L1a:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4b
            r2 = 4
            goto L4c
        L24:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4b
            r2 = 1
            goto L4c
        L2e:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L4b
            goto L4c
        L37:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4b
            r2 = 3
            goto L4c
        L41:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4b
            r2 = 2
            goto L4c
        L4b:
            r2 = -1
        L4c:
            if (r2 == 0) goto L61
            if (r2 == r9) goto L61
            if (r2 == r8) goto L5c
            if (r2 == r7) goto L5c
            if (r2 == r6) goto L57
            return r0
        L57:
            android.util.Pair r10 = m9774a(r10, r1)
            return r10
        L5c:
            android.util.Pair r10 = m9781b(r10, r1)
            return r10
        L61:
            android.util.Pair r10 = m9784c(r10, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p244g.C2345g.m9773a(java.lang.String):android.util.Pair");
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m9774a(String str, String[] strArr) {
        if (strArr.length != 3) {
            C2638o.m11160d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C2641r.m11165a(Integer.parseInt(strArr[1], 16)))) {
                int i = f9260g.get(Integer.parseInt(strArr[2]), -1);
                if (i != -1) {
                    return new Pair<>(Integer.valueOf(i), 0);
                }
            }
        } catch (NumberFormatException unused) {
            C2638o.m11160d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: a */
    public static C2339a m9775a() {
        C2339a m9776a = m9776a("audio/raw", false);
        if (m9776a == null) {
            return null;
        }
        return C2339a.m9711b(m9776a.f9189a);
    }

    /* renamed from: a */
    public static C2339a m9776a(String str, boolean z) {
        List<C2339a> m9782b = m9782b(str, z);
        if (m9782b.isEmpty()) {
            return null;
        }
        return m9782b.get(0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private static ArrayList<C2339a> m9777a(a aVar, c cVar, String str) {
        int i;
        c cVar2 = cVar;
        try {
            ArrayList<C2339a> arrayList = new ArrayList<>();
            String str2 = aVar.f9262a;
            int mo9785a = cVar.mo9785a();
            boolean mo9788b = cVar.mo9788b();
            int i2 = 0;
            while (i2 < mo9785a) {
                MediaCodecInfo mo9786a = cVar2.mo9786a(i2);
                String name = mo9786a.getName();
                if (m9779a(mo9786a, name, mo9788b, str)) {
                    String[] supportedTypes = mo9786a.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str3 = supportedTypes[i3];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mo9786a.getCapabilitiesForType(str3);
                                boolean mo9787a = cVar2.mo9787a(str2, capabilitiesForType);
                                boolean m9783b = m9783b(name);
                                if (mo9788b) {
                                    i = mo9785a;
                                    try {
                                        if (aVar.f9263b != mo9787a) {
                                        }
                                        arrayList.add(C2339a.m9708a(name, str2, capabilitiesForType, m9783b, false));
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (C2622I.f10916a > 23 || arrayList.isEmpty()) {
                                            C2638o.m11157b("MediaCodecUtil", "Failed to query codec " + name + " (" + str3 + ")");
                                            throw e;
                                        }
                                        C2638o.m11157b("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                        i3++;
                                        cVar2 = cVar;
                                        mo9785a = i;
                                    }
                                } else {
                                    i = mo9785a;
                                }
                                if (!mo9788b && !aVar.f9263b) {
                                    arrayList.add(C2339a.m9708a(name, str2, capabilitiesForType, m9783b, false));
                                } else if (!mo9788b && mo9787a) {
                                    arrayList.add(C2339a.m9708a(name + ".secure", str2, capabilitiesForType, m9783b, true));
                                    return arrayList;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i = mo9785a;
                            }
                        } else {
                            i = mo9785a;
                        }
                        i3++;
                        cVar2 = cVar;
                        mo9785a = i;
                    }
                }
                i2++;
                cVar2 = cVar;
                mo9785a = mo9785a;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new b(e4);
        }
    }

    /* renamed from: a */
    private static void m9778a(String str, List<C2339a> list) {
        if ("audio/raw".equals(str)) {
            Collections.sort(list, f9255b);
        }
    }

    /* renamed from: a */
    private static boolean m9779a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (C2622I.f10916a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (C2622I.f10916a < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if ("OMX.SEC.mp3.dec".equals(str) && (C2622I.f10919d.startsWith("GT-I9152") || C2622I.f10919d.startsWith("GT-I9515") || C2622I.f10919d.startsWith("GT-P5220") || C2622I.f10919d.startsWith("GT-S7580") || C2622I.f10919d.startsWith("SM-G350") || C2622I.f10919d.startsWith("SM-G386") || C2622I.f10919d.startsWith("SM-T231") || C2622I.f10919d.startsWith("SM-T530"))) {
            return false;
        }
        if ("OMX.brcm.audio.mp3.decoder".equals(str) && (C2622I.f10919d.startsWith("GT-I9152") || C2622I.f10919d.startsWith("GT-S7580") || C2622I.f10919d.startsWith("SM-G350"))) {
            return false;
        }
        if (C2622I.f10916a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(C2622I.f10917b) || ("Xiaomi".equals(C2622I.f10918c) && C2622I.f10917b.startsWith("HM")))) {
            return false;
        }
        if (C2622I.f10916a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(C2622I.f10917b) || "protou".equals(C2622I.f10917b) || "ville".equals(C2622I.f10917b) || "villeplus".equals(C2622I.f10917b) || "villec2".equals(C2622I.f10917b) || C2622I.f10917b.startsWith("gee") || "C6602".equals(C2622I.f10917b) || "C6603".equals(C2622I.f10917b) || "C6606".equals(C2622I.f10917b) || "C6616".equals(C2622I.f10917b) || "L36h".equals(C2622I.f10917b) || "SO-02E".equals(C2622I.f10917b))) {
            return false;
        }
        if (C2622I.f10916a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(C2622I.f10917b) || "C1505".equals(C2622I.f10917b) || "C1604".equals(C2622I.f10917b) || "C1605".equals(C2622I.f10917b))) {
            return false;
        }
        if (C2622I.f10916a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C2622I.f10918c) && (C2622I.f10917b.startsWith("zeroflte") || C2622I.f10917b.startsWith("zerolte") || C2622I.f10917b.startsWith("zenlte") || "SC-05G".equals(C2622I.f10917b) || "marinelteatt".equals(C2622I.f10917b) || "404SC".equals(C2622I.f10917b) || "SC-04G".equals(C2622I.f10917b) || "SCV31".equals(C2622I.f10917b)))) {
            return false;
        }
        if (C2622I.f10916a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C2622I.f10918c) && (C2622I.f10917b.startsWith("d2") || C2622I.f10917b.startsWith("serrano") || C2622I.f10917b.startsWith("jflte") || C2622I.f10917b.startsWith("santos") || C2622I.f10917b.startsWith("t0"))) {
            return false;
        }
        if (C2622I.f10916a <= 19 && C2622I.f10917b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: b */
    public static int m9780b() {
        if (f9261h == -1) {
            int i = 0;
            C2339a m9776a = m9776a("video/avc", false);
            if (m9776a != null) {
                MediaCodecInfo.CodecProfileLevel[] m9725a = m9776a.m9725a();
                int length = m9725a.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m9772a(m9725a[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C2622I.f10916a >= 21 ? 345600 : 172800);
            }
            f9261h = i;
        }
        return f9261h;
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m9781b(String str, String[] strArr) {
        StringBuilder sb;
        Integer valueOf;
        Integer valueOf2;
        int i;
        String str2;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    Integer valueOf3 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                    valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                    valueOf = valueOf3;
                } else {
                    if (strArr.length < 3) {
                        C2638o.m11160d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                    valueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
                }
                i = f9257d.get(valueOf.intValue(), -1);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
            if (i == -1) {
                str2 = "Unknown AVC profile: " + valueOf;
                C2638o.m11160d("MediaCodecUtil", str2);
                return null;
            }
            int i2 = f9258e.get(valueOf2.intValue(), -1);
            if (i2 != -1) {
                return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
            }
            sb = new StringBuilder();
            sb.append("Unknown AVC level: ");
            sb.append(valueOf2);
            str2 = sb.toString();
            C2638o.m11160d("MediaCodecUtil", str2);
            return null;
        }
        sb = new StringBuilder();
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        C2638o.m11160d("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: b */
    public static synchronized List<C2339a> m9782b(String str, boolean z) {
        synchronized (C2345g.class) {
            a aVar = new a(str, z);
            List<C2339a> list = f9256c.get(aVar);
            if (list != null) {
                return list;
            }
            c eVar = C2622I.f10916a >= 21 ? new e(z) : new d();
            ArrayList<C2339a> m9777a = m9777a(aVar, eVar, str);
            if (z && m9777a.isEmpty() && 21 <= C2622I.f10916a && C2622I.f10916a <= 23) {
                eVar = new d();
                m9777a = m9777a(aVar, eVar, str);
                if (!m9777a.isEmpty()) {
                    C2638o.m11160d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + m9777a.get(0).f9189a);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                m9777a.addAll(m9777a(new a("audio/eac3", aVar.f9263b), eVar, str));
            }
            m9778a(str, m9777a);
            List<C2339a> unmodifiableList = Collections.unmodifiableList(m9777a);
            f9256c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: b */
    private static boolean m9783b(String str) {
        return C2622I.f10916a <= 22 && ("ODROID-XU3".equals(C2622I.f10919d) || "Nexus 10".equals(C2622I.f10919d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    /* renamed from: c */
    private static Pair<Integer, Integer> m9784c(String str, String[] strArr) {
        StringBuilder sb;
        int i;
        String str2;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            Matcher matcher = f9254a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                if ("1".equals(str)) {
                    i = 1;
                } else {
                    if (!"2".equals(str)) {
                        sb = new StringBuilder();
                        sb.append("Unknown HEVC profile string: ");
                        sb.append(str);
                        str2 = sb.toString();
                        C2638o.m11160d("MediaCodecUtil", str2);
                        return null;
                    }
                    i = 2;
                }
                Integer num = f9259f.get(strArr[3]);
                if (num != null) {
                    return new Pair<>(Integer.valueOf(i), num);
                }
                str2 = "Unknown HEVC level string: " + matcher.group(1);
                C2638o.m11160d("MediaCodecUtil", str2);
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed HEVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        C2638o.m11160d("MediaCodecUtil", str2);
        return null;
    }
}
