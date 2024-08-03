package p139d.p225c.p226a.p227a.p259k.p267h;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.k.h.f */
/* loaded from: classes.dex */
public final class C2556f extends C2527b {

    /* renamed from: o */
    public final long f10583o;

    /* renamed from: p */
    public final long f10584p;

    /* renamed from: d.c.a.a.k.h.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private long f10585a;

        /* renamed from: b */
        private long f10586b;

        /* renamed from: c */
        private SpannableStringBuilder f10587c;

        /* renamed from: d */
        private Layout.Alignment f10588d;

        /* renamed from: e */
        private float f10589e;

        /* renamed from: f */
        private int f10590f;

        /* renamed from: g */
        private int f10591g;

        /* renamed from: h */
        private float f10592h;

        /* renamed from: i */
        private int f10593i;

        /* renamed from: j */
        private float f10594j;

        public a() {
            m10766b();
        }

        /* renamed from: c */
        private a m10756c() {
            Layout.Alignment alignment = this.f10588d;
            if (alignment == null) {
                this.f10593i = Integer.MIN_VALUE;
            } else {
                int i = C2555e.f10582a[alignment.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.f10593i = 1;
                    } else if (i != 3) {
                        C2638o.m11160d("WebvttCueBuilder", "Unrecognized alignment: " + this.f10588d);
                    } else {
                        this.f10593i = 2;
                    }
                }
                this.f10593i = 0;
            }
            return this;
        }

        /* renamed from: a */
        public a m10757a(float f) {
            this.f10589e = f;
            return this;
        }

        /* renamed from: a */
        public a m10758a(int i) {
            this.f10591g = i;
            return this;
        }

        /* renamed from: a */
        public a m10759a(long j) {
            this.f10586b = j;
            return this;
        }

        /* renamed from: a */
        public a m10760a(Layout.Alignment alignment) {
            this.f10588d = alignment;
            return this;
        }

        /* renamed from: a */
        public a m10761a(SpannableStringBuilder spannableStringBuilder) {
            this.f10587c = spannableStringBuilder;
            return this;
        }

        /* renamed from: a */
        public C2556f m10762a() {
            if (this.f10592h != Float.MIN_VALUE && this.f10593i == Integer.MIN_VALUE) {
                m10756c();
            }
            return new C2556f(this.f10585a, this.f10586b, this.f10587c, this.f10588d, this.f10589e, this.f10590f, this.f10591g, this.f10592h, this.f10593i, this.f10594j);
        }

        /* renamed from: b */
        public a m10763b(float f) {
            this.f10592h = f;
            return this;
        }

        /* renamed from: b */
        public a m10764b(int i) {
            this.f10590f = i;
            return this;
        }

        /* renamed from: b */
        public a m10765b(long j) {
            this.f10585a = j;
            return this;
        }

        /* renamed from: b */
        public void m10766b() {
            this.f10585a = 0L;
            this.f10586b = 0L;
            this.f10587c = null;
            this.f10588d = null;
            this.f10589e = Float.MIN_VALUE;
            this.f10590f = Integer.MIN_VALUE;
            this.f10591g = Integer.MIN_VALUE;
            this.f10592h = Float.MIN_VALUE;
            this.f10593i = Integer.MIN_VALUE;
            this.f10594j = Float.MIN_VALUE;
        }

        /* renamed from: c */
        public a m10767c(float f) {
            this.f10594j = f;
            return this;
        }

        /* renamed from: c */
        public a m10768c(int i) {
            this.f10593i = i;
            return this;
        }
    }

    public C2556f(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C2556f(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f10583o = j;
        this.f10584p = j2;
    }

    public C2556f(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    /* renamed from: a */
    public boolean m10755a() {
        return this.f10392d == Float.MIN_VALUE && this.f10395g == Float.MIN_VALUE;
    }
}
