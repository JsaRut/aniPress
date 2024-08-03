package p139d.p225c.p226a.p227a.p244g;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2641r;

@TargetApi(16)
/* renamed from: d.c.a.a.g.a */
/* loaded from: classes.dex */
public final class C2339a {

    /* renamed from: a */
    public final String f9189a;

    /* renamed from: b */
    public final String f9190b;

    /* renamed from: c */
    public final MediaCodecInfo.CodecCapabilities f9191c;

    /* renamed from: d */
    public final boolean f9192d;

    /* renamed from: e */
    public final boolean f9193e;

    /* renamed from: f */
    public final boolean f9194f;

    /* renamed from: g */
    public final boolean f9195g;

    /* renamed from: h */
    private final boolean f9196h;

    private C2339a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        C2628e.m11110a(str);
        this.f9189a = str;
        this.f9190b = str2;
        this.f9191c = codecCapabilities;
        this.f9195g = z;
        boolean z4 = true;
        this.f9192d = (z2 || codecCapabilities == null || !m9709a(codecCapabilities)) ? false : true;
        this.f9193e = codecCapabilities != null && m9717e(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !m9714c(codecCapabilities))) {
            z4 = false;
        }
        this.f9194f = z4;
        this.f9196h = C2641r.m11174i(str2);
    }

    /* renamed from: a */
    private static int m9707a(String str, String str2, int i) {
        if (i > 1 || ((C2622I.f10916a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        C2638o.m11160d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    /* renamed from: a */
    public static C2339a m9708a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C2339a(str, str2, codecCapabilities, false, z, z2);
    }

    /* renamed from: a */
    private static boolean m9709a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C2622I.f10916a >= 19 && m9712b(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static boolean m9710a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        return (d2 == -1.0d || d2 <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d2);
    }

    /* renamed from: b */
    public static C2339a m9711b(String str) {
        return new C2339a(str, null, null, true, false, false);
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m9712b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: c */
    private void m9713c(String str) {
        C2638o.m11155a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f9189a + ", " + this.f9190b + "] [" + C2622I.f10920e + "]");
    }

    /* renamed from: c */
    private static boolean m9714c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C2622I.f10916a >= 21 && m9716d(codecCapabilities);
    }

    /* renamed from: d */
    private void m9715d(String str) {
        C2638o.m11155a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f9189a + ", " + this.f9190b + "] [" + C2622I.f10920e + "]");
    }

    @TargetApi(21)
    /* renamed from: d */
    private static boolean m9716d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: e */
    private static boolean m9717e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C2622I.f10916a >= 21 && m9718f(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: f */
    private static boolean m9718f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    @TargetApi(21)
    /* renamed from: a */
    public Point m9719a(int i, int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9191c;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(C2622I.m11037a(i, widthAlignment) * widthAlignment, C2622I.m11037a(i2, heightAlignment) * heightAlignment);
            }
            str = "align.vCaps";
        }
        m9715d(str);
        return null;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean m9720a(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9191c;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (m9707a(this.f9189a, this.f9190b, audioCapabilities.getMaxInputChannelCount()) >= i) {
                    return true;
                }
                str = "channelCount.support, " + i;
            }
        }
        m9715d(str);
        return false;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean m9721a(int i, int i2, double d2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9191c;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (m9710a(videoCapabilities, i, i2, d2)) {
                    return true;
                }
                if (i < i2 && m9710a(videoCapabilities, i2, i, d2)) {
                    m9713c("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d2);
                    return true;
                }
                str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d2;
            }
        }
        m9715d(str);
        return false;
    }

    /* renamed from: a */
    public boolean m9722a(C2676s c2676s) {
        int i;
        if (!m9724a(c2676s.f11179d)) {
            return false;
        }
        if (!this.f9196h) {
            if (C2622I.f10916a >= 21) {
                int i2 = c2676s.f11196u;
                if (i2 != -1 && !m9726b(i2)) {
                    return false;
                }
                int i3 = c2676s.f11195t;
                if (i3 != -1 && !m9720a(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = c2676s.f11187l;
        if (i4 <= 0 || (i = c2676s.f11188m) <= 0) {
            return true;
        }
        if (C2622I.f10916a >= 21) {
            return m9721a(i4, i, c2676s.f11189n);
        }
        boolean z = i4 * i <= C2345g.m9780b();
        if (!z) {
            m9715d("legacyFrameSize, " + c2676s.f11187l + "x" + c2676s.f11188m);
        }
        return z;
    }

    /* renamed from: a */
    public boolean m9723a(C2676s c2676s, C2676s c2676s2, boolean z) {
        if (this.f9196h) {
            return c2676s.f11182g.equals(c2676s2.f11182g) && c2676s.f11190o == c2676s2.f11190o && (this.f9192d || (c2676s.f11187l == c2676s2.f11187l && c2676s.f11188m == c2676s2.f11188m)) && ((!z && c2676s2.f11194s == null) || C2622I.m11067a(c2676s.f11194s, c2676s2.f11194s));
        }
        if ("audio/mp4a-latm".equals(this.f9190b) && c2676s.f11182g.equals(c2676s2.f11182g) && c2676s.f11195t == c2676s2.f11195t && c2676s.f11196u == c2676s2.f11196u) {
            Pair<Integer, Integer> m9773a = C2345g.m9773a(c2676s.f11179d);
            Pair<Integer, Integer> m9773a2 = C2345g.m9773a(c2676s2.f11179d);
            if (m9773a != null && m9773a2 != null) {
                return ((Integer) m9773a.first).intValue() == 42 && ((Integer) m9773a2.first).intValue() == 42;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m9724a(String str) {
        String m11168c;
        StringBuilder sb;
        String str2;
        if (str == null || this.f9190b == null || (m11168c = C2641r.m11168c(str)) == null) {
            return true;
        }
        if (this.f9190b.equals(m11168c)) {
            Pair<Integer, Integer> m9773a = C2345g.m9773a(str);
            if (m9773a == null) {
                return true;
            }
            int intValue = ((Integer) m9773a.first).intValue();
            int intValue2 = ((Integer) m9773a.second).intValue();
            if (!this.f9196h && intValue != 42) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m9725a()) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str2 = "codec.profileLevel, ";
        } else {
            sb = new StringBuilder();
            str2 = "codec.mime ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(m11168c);
        m9715d(sb.toString());
        return false;
    }

    /* renamed from: a */
    public MediaCodecInfo.CodecProfileLevel[] m9725a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9191c;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    /* renamed from: b */
    public boolean m9726b(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9191c;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i)) {
                    return true;
                }
                str = "sampleRate.support, " + i;
            }
        }
        m9715d(str);
        return false;
    }

    /* renamed from: b */
    public boolean m9727b(C2676s c2676s) {
        if (this.f9196h) {
            return this.f9192d;
        }
        Pair<Integer, Integer> m9773a = C2345g.m9773a(c2676s.f11179d);
        return m9773a != null && ((Integer) m9773a.first).intValue() == 42;
    }

    public String toString() {
        return this.f9189a;
    }
}
