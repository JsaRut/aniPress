package p139d.p225c.p226a.p227a.p259k.p260a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p225c.p226a.p227a.p259k.AbstractC2563k;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.C2562j;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.a.a */
/* loaded from: classes.dex */
public final class C2519a extends AbstractC2524f {

    /* renamed from: g */
    private static final int[] f10302g = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: h */
    private static final int[] f10303h = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: i */
    private static final int[] f10304i = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: j */
    private static final int[] f10305j = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, C0121j.AppCompatTheme_textAppearanceSearchResultSubtitle, C0121j.AppCompatTheme_textAppearanceSearchResultTitle, C0121j.AppCompatTheme_textAppearanceSmallPopupMenu, C0121j.AppCompatTheme_textColorAlertDialogListItem, C0121j.AppCompatTheme_textColorSearchUrl, C0121j.AppCompatTheme_toolbarNavigationButtonStyle, C0121j.AppCompatTheme_toolbarStyle, C0121j.AppCompatTheme_tooltipForegroundColor, C0121j.AppCompatTheme_tooltipFrameBackground, C0121j.AppCompatTheme_viewInflaterClass, C0121j.AppCompatTheme_windowActionBar, C0121j.AppCompatTheme_windowActionBarOverlay, C0121j.AppCompatTheme_windowActionModeOverlay, C0121j.AppCompatTheme_windowFixedHeightMajor, C0121j.AppCompatTheme_windowFixedHeightMinor, C0121j.AppCompatTheme_windowFixedWidthMajor, C0121j.AppCompatTheme_windowFixedWidthMinor, C0121j.AppCompatTheme_windowMinWidthMajor, C0121j.AppCompatTheme_windowMinWidthMinor, C0121j.AppCompatTheme_windowNoTitle, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: k */
    private static final int[] f10306k = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: l */
    private static final int[] f10307l = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: m */
    private static final int[] f10308m = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: o */
    private final int f10310o;

    /* renamed from: p */
    private final int f10311p;

    /* renamed from: s */
    private List<C2527b> f10314s;

    /* renamed from: t */
    private List<C2527b> f10315t;

    /* renamed from: u */
    private int f10316u;

    /* renamed from: v */
    private int f10317v;

    /* renamed from: w */
    private boolean f10318w;

    /* renamed from: x */
    private byte f10319x;

    /* renamed from: y */
    private byte f10320y;

    /* renamed from: n */
    private final C2644u f10309n = new C2644u();

    /* renamed from: q */
    private final ArrayList<a> f10312q = new ArrayList<>();

    /* renamed from: r */
    private a f10313r = new a(0, 4);

    /* renamed from: d.c.a.a.k.a.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final List<C2805a> f10321a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f10322b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f10323c = new StringBuilder();

        /* renamed from: d */
        private int f10324d;

        /* renamed from: e */
        private int f10325e;

        /* renamed from: f */
        private int f10326f;

        /* renamed from: g */
        private int f10327g;

        /* renamed from: h */
        private int f10328h;

        /* renamed from: d.c.a.a.k.a.a$a$a */
        /* loaded from: classes.dex */
        public static class C2805a {

            /* renamed from: a */
            public final int f10329a;

            /* renamed from: b */
            public final boolean f10330b;

            /* renamed from: c */
            public int f10331c;

            public C2805a(int i, boolean z, int i2) {
                this.f10329a = i;
                this.f10330b = z;
                this.f10331c = i2;
            }
        }

        public a(int i, int i2) {
            m10552a(i);
            m10555b(i2);
        }

        /* renamed from: a */
        private static void m10547a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: a */
        private static void m10548a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        /* renamed from: b */
        private static void m10549b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: a */
        public void m10550a() {
            int length = this.f10323c.length();
            if (length > 0) {
                this.f10323c.delete(length - 1, length);
                for (int size = this.f10321a.size() - 1; size >= 0; size--) {
                    C2805a c2805a = this.f10321a.get(size);
                    int i = c2805a.f10331c;
                    if (i != length) {
                        return;
                    }
                    c2805a.f10331c = i - 1;
                }
            }
        }

        /* renamed from: a */
        public void m10551a(char c2) {
            this.f10323c.append(c2);
        }

        /* renamed from: a */
        public void m10552a(int i) {
            this.f10327g = i;
            this.f10321a.clear();
            this.f10322b.clear();
            this.f10323c.setLength(0);
            this.f10324d = 15;
            this.f10325e = 0;
            this.f10326f = 0;
        }

        /* renamed from: a */
        public void m10553a(int i, boolean z) {
            this.f10321a.add(new C2805a(i, z, this.f10323c.length()));
        }

        /* renamed from: b */
        public C2527b m10554b() {
            float f;
            int i;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f10322b.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.f10322b.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m10556c());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.f10325e + this.f10326f;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (this.f10327g == 2 && (Math.abs(i6) < 3 || length < 0)) {
                f = 0.5f;
                i = 1;
            } else if (this.f10327g != 2 || i6 <= 0) {
                f = ((i5 / 32.0f) * 0.8f) + 0.1f;
                i = 0;
            } else {
                f = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                i = 2;
            }
            if (this.f10327g == 1 || (i2 = this.f10324d) > 7) {
                i2 = (this.f10324d - 15) - 2;
                i3 = 2;
            } else {
                i3 = 0;
            }
            return new C2527b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i2, 1, i3, f, i, Float.MIN_VALUE);
        }

        /* renamed from: b */
        public void m10555b(int i) {
            this.f10328h = i;
        }

        /* renamed from: c */
        public SpannableString m10556c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10323c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f10321a.size()) {
                C2805a c2805a = this.f10321a.get(i);
                boolean z2 = c2805a.f10330b;
                int i7 = c2805a.f10329a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C2519a.f10304i[i7];
                    }
                    z = z3;
                }
                int i8 = c2805a.f10331c;
                i++;
                if (i8 != (i < this.f10321a.size() ? this.f10321a.get(i).f10331c : length)) {
                    if (i2 != -1 && !z2) {
                        m10549b(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        m10547a(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        m10548a(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                m10549b(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                m10547a(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                m10548a(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: c */
        public void m10557c(int i) {
            this.f10325e = i;
        }

        /* renamed from: d */
        public int m10558d() {
            return this.f10324d;
        }

        /* renamed from: d */
        public void m10559d(int i) {
            this.f10324d = i;
        }

        /* renamed from: e */
        public void m10560e(int i) {
            this.f10326f = i;
        }

        /* renamed from: e */
        public boolean m10561e() {
            return this.f10321a.isEmpty() && this.f10322b.isEmpty() && this.f10323c.length() == 0;
        }

        /* renamed from: f */
        public void m10562f() {
            this.f10322b.add(m10556c());
            this.f10323c.setLength(0);
            this.f10321a.clear();
            int min = Math.min(this.f10328h, this.f10324d);
            while (this.f10322b.size() >= min) {
                this.f10322b.remove(0);
            }
        }

        public String toString() {
            return this.f10323c.toString();
        }
    }

    public C2519a(String str, int i) {
        this.f10310o = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 3 || i == 4) {
            this.f10311p = 2;
        } else {
            this.f10311p = 1;
        }
        m10525a(0);
        m10541h();
    }

    /* renamed from: a */
    private static char m10524a(byte b2) {
        return (char) f10305j[(b2 & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: a */
    private void m10525a(int i) {
        int i2 = this.f10316u;
        if (i2 == i) {
            return;
        }
        this.f10316u = i;
        m10541h();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f10314s = Collections.emptyList();
        }
    }

    /* renamed from: a */
    private boolean m10526a(byte b2, byte b3) {
        boolean m10540g = m10540g(b2);
        if (m10540g) {
            if (this.f10318w && this.f10319x == b2 && this.f10320y == b3) {
                this.f10318w = false;
                return true;
            }
            this.f10318w = true;
            this.f10319x = b2;
            this.f10320y = b3;
        }
        if (m10531c(b2, b3)) {
            m10534e(b3);
        } else if (m10535e(b2, b3)) {
            m10528b(b2, b3);
        } else if (m10537f(b2, b3)) {
            this.f10313r.m10560e(b3 - 32);
        } else if (m10533d(b2, b3)) {
            m10536f(b3);
        }
        return m10540g;
    }

    /* renamed from: b */
    private static char m10527b(byte b2) {
        return (char) f10307l[b2 & 31];
    }

    /* renamed from: b */
    private void m10528b(byte b2, byte b3) {
        int i = f10302g[b2 & 7];
        if ((b3 & 32) != 0) {
            i++;
        }
        if (i != this.f10313r.m10558d()) {
            if (this.f10316u != 1 && !this.f10313r.m10561e()) {
                this.f10313r = new a(this.f10316u, this.f10317v);
                this.f10312q.add(this.f10313r);
            }
            this.f10313r.m10559d(i);
        }
        boolean z = (b3 & 16) == 16;
        boolean z2 = (b3 & 1) == 1;
        int i2 = (b3 >> 1) & 7;
        this.f10313r.m10553a(z ? 8 : i2, z2);
        if (z) {
            this.f10313r.m10557c(f10303h[i2]);
        }
    }

    /* renamed from: b */
    private void m10529b(int i) {
        this.f10317v = i;
        this.f10313r.m10555b(i);
    }

    /* renamed from: c */
    private static char m10530c(byte b2) {
        return (char) f10308m[b2 & 31];
    }

    /* renamed from: c */
    private static boolean m10531c(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    /* renamed from: d */
    private static char m10532d(byte b2) {
        return (char) f10306k[b2 & 15];
    }

    /* renamed from: d */
    private static boolean m10533d(byte b2, byte b3) {
        return (b2 & 247) == 20 && (b3 & 240) == 32;
    }

    /* renamed from: e */
    private void m10534e(byte b2) {
        this.f10313r.m10551a(' ');
        this.f10313r.m10553a((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    /* renamed from: e */
    private static boolean m10535e(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    /* renamed from: f */
    private void m10536f(byte b2) {
        if (b2 == 32) {
            m10525a(2);
            return;
        }
        if (b2 == 41) {
            m10525a(3);
            return;
        }
        switch (b2) {
            case C0121j.AppCompatTheme_autoCompleteTextViewStyle /* 37 */:
                m10525a(1);
                m10529b(2);
                return;
            case C0121j.AppCompatTheme_borderlessButtonStyle /* 38 */:
                m10525a(1);
                m10529b(3);
                return;
            case C0121j.AppCompatTheme_buttonBarButtonStyle /* 39 */:
                m10525a(1);
                m10529b(4);
                return;
            default:
                int i = this.f10316u;
                if (i == 0) {
                    return;
                }
                if (b2 == 33) {
                    this.f10313r.m10550a();
                    return;
                }
                if (b2 != 36) {
                    switch (b2) {
                        case C0121j.AppCompatTheme_buttonStyle /* 44 */:
                            this.f10314s = Collections.emptyList();
                            int i2 = this.f10316u;
                            if (i2 != 1 && i2 != 3) {
                                return;
                            }
                            break;
                        case C0121j.AppCompatTheme_buttonStyleSmall /* 45 */:
                            if (i != 1 || this.f10313r.m10561e()) {
                                return;
                            }
                            this.f10313r.m10562f();
                            return;
                        case C0121j.AppCompatTheme_checkboxStyle /* 46 */:
                            break;
                        case C0121j.AppCompatTheme_checkedTextViewStyle /* 47 */:
                            this.f10314s = m10539g();
                            break;
                        default:
                            return;
                    }
                    m10541h();
                    return;
                }
                return;
        }
    }

    /* renamed from: f */
    private static boolean m10537f(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    /* renamed from: g */
    private List<C2527b> m10539g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10312q.size(); i++) {
            C2527b m10554b = this.f10312q.get(i).m10554b();
            if (m10554b != null) {
                arrayList.add(m10554b);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static boolean m10540g(byte b2) {
        return (b2 & 240) == 16;
    }

    /* renamed from: h */
    private void m10541h() {
        this.f10313r.m10552a(this.f10316u);
        this.f10312q.clear();
        this.f10312q.add(this.f10313r);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: a */
    public void mo9020a() {
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p259k.InterfaceC2540f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo10542a(long j) {
        super.mo10542a(j);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: a */
    protected void mo10543a(C2562j c2562j) {
        a aVar;
        char m10524a;
        this.f10309n.m11213a(c2562j.f8040c.array(), c2562j.f8040c.limit());
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int m11208a = this.f10309n.m11208a();
            int i = this.f10310o;
            if (m11208a < i) {
                break;
            }
            byte m11238t = i == 2 ? (byte) -4 : (byte) this.f10309n.m11238t();
            byte m11238t2 = (byte) (this.f10309n.m11238t() & 127);
            byte m11238t3 = (byte) (this.f10309n.m11238t() & 127);
            if ((m11238t & 6) == 4 && (this.f10311p != 1 || (m11238t & 1) == 0)) {
                if (this.f10311p != 2 || (m11238t & 1) == 1) {
                    if (m11238t2 != 0 || m11238t3 != 0) {
                        if ((m11238t2 & 247) == 17 && (m11238t3 & 240) == 48) {
                            aVar = this.f10313r;
                            m10524a = m10532d(m11238t3);
                        } else if ((m11238t2 & 246) == 18 && (m11238t3 & 224) == 32) {
                            this.f10313r.m10550a();
                            if ((m11238t2 & 1) == 0) {
                                aVar = this.f10313r;
                                m10524a = m10527b(m11238t3);
                            } else {
                                aVar = this.f10313r;
                                m10524a = m10530c(m11238t3);
                            }
                        } else {
                            if ((m11238t2 & 224) == 0) {
                                z2 = m10526a(m11238t2, m11238t3);
                            } else {
                                this.f10313r.m10551a(m10524a(m11238t2));
                                if ((m11238t3 & 224) != 0) {
                                    aVar = this.f10313r;
                                    m10524a = m10524a(m11238t3);
                                }
                            }
                            z = true;
                        }
                        aVar.m10551a(m10524a);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            if (!z2) {
                this.f10318w = false;
            }
            int i2 = this.f10316u;
            if (i2 == 1 || i2 == 3) {
                this.f10314s = m10539g();
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: b */
    public /* bridge */ /* synthetic */ AbstractC2563k mo9022b() {
        return super.mo9022b();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo9021a(C2562j c2562j) {
        super.mo9021a(c2562j);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: c */
    public /* bridge */ /* synthetic */ C2562j mo9023c() {
        return super.mo9023c();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: d */
    protected InterfaceC2537e mo10545d() {
        List<C2527b> list = this.f10314s;
        this.f10315t = list;
        return new C2525g(list);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f
    /* renamed from: e */
    protected boolean mo10546e() {
        return this.f10314s != this.f10315t;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.p260a.AbstractC2524f, p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    public void flush() {
        super.flush();
        this.f10314s = null;
        this.f10315t = null;
        m10525a(0);
        m10529b(4);
        m10541h();
        this.f10318w = false;
        this.f10319x = (byte) 0;
        this.f10320y = (byte) 0;
    }
}
