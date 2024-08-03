package p139d.p225c.p226a.p227a.p259k;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.k.a */
/* loaded from: classes.dex */
public final class C2518a {

    /* renamed from: a */
    public static final C2518a f10295a = new C2518a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: b */
    public final int f10296b;

    /* renamed from: c */
    public final int f10297c;

    /* renamed from: d */
    public final int f10298d;

    /* renamed from: e */
    public final int f10299e;

    /* renamed from: f */
    public final int f10300f;

    /* renamed from: g */
    public final Typeface f10301g;

    public C2518a(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f10296b = i;
        this.f10297c = i2;
        this.f10298d = i3;
        this.f10299e = i4;
        this.f10300f = i5;
        this.f10301g = typeface;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static C2518a m10521a(CaptioningManager.CaptionStyle captionStyle) {
        return C2622I.f10916a >= 21 ? m10523c(captionStyle) : m10522b(captionStyle);
    }

    @TargetApi(19)
    /* renamed from: b */
    private static C2518a m10522b(CaptioningManager.CaptionStyle captionStyle) {
        return new C2518a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    /* renamed from: c */
    private static C2518a m10523c(CaptioningManager.CaptionStyle captionStyle) {
        return new C2518a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f10295a.f10296b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f10295a.f10297c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f10295a.f10298d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f10295a.f10299e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f10295a.f10300f, captionStyle.getTypeface());
    }
}
