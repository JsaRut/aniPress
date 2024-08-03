package p000a.p005b.p009c.p018g;

import android.os.Build;
import android.support.v4.util.C0265k;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: a.b.c.g.b */
/* loaded from: classes.dex */
public class C0065b implements Spannable {

    /* renamed from: a */
    private static final Object f226a = new Object();

    /* renamed from: b */
    private static Executor f227b = null;

    /* renamed from: c */
    private final Spannable f228c;

    /* renamed from: d */
    private final a f229d;

    /* renamed from: e */
    private final PrecomputedText f230e;

    /* renamed from: a.b.c.g.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f231a;

        /* renamed from: b */
        private final TextDirectionHeuristic f232b;

        /* renamed from: c */
        private final int f233c;

        /* renamed from: d */
        private final int f234d;

        /* renamed from: e */
        final PrecomputedText.Params f235e;

        /* renamed from: a.b.c.g.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C2796a {

            /* renamed from: a */
            private final TextPaint f236a;

            /* renamed from: b */
            private TextDirectionHeuristic f237b;

            /* renamed from: c */
            private int f238c;

            /* renamed from: d */
            private int f239d;

            public C2796a(TextPaint textPaint) {
                this.f236a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f238c = 1;
                    this.f239d = 1;
                } else {
                    this.f239d = 0;
                    this.f238c = 0;
                }
                this.f237b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C2796a m273a(int i) {
                this.f238c = i;
                return this;
            }

            /* renamed from: a */
            public C2796a m274a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f237b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public a m275a() {
                return new a(this.f236a, this.f237b, this.f238c, this.f239d);
            }

            /* renamed from: b */
            public C2796a m276b(int i) {
                this.f239d = i;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f231a = params.getTextPaint();
            this.f232b = params.getTextDirection();
            this.f233c = params.getBreakStrategy();
            this.f234d = params.getHyphenationFrequency();
            this.f235e = params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f235e = Build.VERSION.SDK_INT >= 28 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f231a = textPaint;
            this.f232b = textDirectionHeuristic;
            this.f233c = i;
            this.f234d = i2;
        }

        /* renamed from: a */
        public int m269a() {
            return this.f233c;
        }

        /* renamed from: b */
        public int m270b() {
            return this.f234d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic m271c() {
            return this.f232b;
        }

        /* renamed from: d */
        public TextPaint m272d() {
            return this.f231a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            PrecomputedText.Params params = this.f235e;
            if (params != null) {
                return params.equals(aVar.f235e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f233c != aVar.m269a() || this.f234d != aVar.m270b())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f232b != aVar.m271c()) || this.f231a.getTextSize() != aVar.m272d().getTextSize() || this.f231a.getTextScaleX() != aVar.m272d().getTextScaleX() || this.f231a.getTextSkewX() != aVar.m272d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f231a.getLetterSpacing() != aVar.m272d().getLetterSpacing() || !TextUtils.equals(this.f231a.getFontFeatureSettings(), aVar.m272d().getFontFeatureSettings()))) || this.f231a.getFlags() != aVar.m272d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f231a.getTextLocales().equals(aVar.m272d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f231a.getTextLocale().equals(aVar.m272d().getTextLocale())) {
                return false;
            }
            if (this.f231a.getTypeface() == null) {
                if (aVar.m272d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f231a.getTypeface().equals(aVar.m272d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            return C0265k.m1382a(i >= 24 ? new Object[]{Float.valueOf(this.f231a.getTextSize()), Float.valueOf(this.f231a.getTextScaleX()), Float.valueOf(this.f231a.getTextSkewX()), Float.valueOf(this.f231a.getLetterSpacing()), Integer.valueOf(this.f231a.getFlags()), this.f231a.getTextLocales(), this.f231a.getTypeface(), Boolean.valueOf(this.f231a.isElegantTextHeight()), this.f232b, Integer.valueOf(this.f233c), Integer.valueOf(this.f234d)} : i >= 21 ? new Object[]{Float.valueOf(this.f231a.getTextSize()), Float.valueOf(this.f231a.getTextScaleX()), Float.valueOf(this.f231a.getTextSkewX()), Float.valueOf(this.f231a.getLetterSpacing()), Integer.valueOf(this.f231a.getFlags()), this.f231a.getTextLocale(), this.f231a.getTypeface(), Boolean.valueOf(this.f231a.isElegantTextHeight()), this.f232b, Integer.valueOf(this.f233c), Integer.valueOf(this.f234d)} : i >= 18 ? new Object[]{Float.valueOf(this.f231a.getTextSize()), Float.valueOf(this.f231a.getTextScaleX()), Float.valueOf(this.f231a.getTextSkewX()), Integer.valueOf(this.f231a.getFlags()), this.f231a.getTextLocale(), this.f231a.getTypeface(), this.f232b, Integer.valueOf(this.f233c), Integer.valueOf(this.f234d)} : i >= 17 ? new Object[]{Float.valueOf(this.f231a.getTextSize()), Float.valueOf(this.f231a.getTextScaleX()), Float.valueOf(this.f231a.getTextSkewX()), Integer.valueOf(this.f231a.getFlags()), this.f231a.getTextLocale(), this.f231a.getTypeface(), this.f232b, Integer.valueOf(this.f233c), Integer.valueOf(this.f234d)} : new Object[]{Float.valueOf(this.f231a.getTextSize()), Float.valueOf(this.f231a.getTextScaleX()), Float.valueOf(this.f231a.getTextSkewX()), Integer.valueOf(this.f231a.getFlags()), this.f231a.getTypeface(), this.f232b, Integer.valueOf(this.f233c), Integer.valueOf(this.f234d)});
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p018g.C0065b.a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public a m267a() {
        return this.f229d;
    }

    /* renamed from: b */
    public PrecomputedText m268b() {
        Spannable spannable = this.f228c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f228c.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f228c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f228c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f228c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.f230e.getSpans(i, i2, cls) : (T[]) this.f228c.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f228c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f228c.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f230e.removeSpan(obj);
        } else {
            this.f228c.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f230e.setSpan(obj, i, i2, i3);
        } else {
            this.f228c.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f228c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f228c.toString();
    }
}
