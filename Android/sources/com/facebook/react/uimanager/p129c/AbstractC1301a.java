package com.facebook.react.uimanager.p129c;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1353k;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC1301a {

    /* renamed from: a */
    private static final Map<EnumC1305e, BaseInterpolator> f4802a = C1104f.m5179a(EnumC1305e.LINEAR, new LinearInterpolator(), EnumC1305e.EASE_IN, new AccelerateInterpolator(), EnumC1305e.EASE_OUT, new DecelerateInterpolator(), EnumC1305e.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: b */
    private Interpolator f4803b;

    /* renamed from: c */
    private int f4804c;

    /* renamed from: d */
    protected EnumC1302b f4805d;

    /* renamed from: e */
    protected int f4806e;

    /* renamed from: a */
    private static Interpolator m5676a(EnumC1305e enumC1305e, ReadableMap readableMap) {
        BaseInterpolator interpolatorC1318r = enumC1305e.equals(EnumC1305e.SPRING) ? new InterpolatorC1318r(InterpolatorC1318r.m5698a(readableMap)) : f4802a.get(enumC1305e);
        if (interpolatorC1318r != null) {
            return interpolatorC1318r;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + enumC1305e);
    }

    /* renamed from: a */
    public final Animation m5677a(View view, int i, int i2, int i3, int i4) {
        if (!mo5679a()) {
            return null;
        }
        Animation mo5680b = mo5680b(view, i, i2, i3, i4);
        if (mo5680b != null) {
            mo5680b.setDuration(this.f4806e * 1);
            mo5680b.setStartOffset(this.f4804c * 1);
            mo5680b.setInterpolator(this.f4803b);
        }
        return mo5680b;
    }

    /* renamed from: a */
    public void m5678a(ReadableMap readableMap, int i) {
        this.f4805d = readableMap.hasKey("property") ? EnumC1302b.m5684a(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        this.f4806e = i;
        this.f4804c = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (!readableMap.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        this.f4803b = m5676a(EnumC1305e.m5686a(readableMap.getString("type")), readableMap);
        if (mo5679a()) {
            return;
        }
        throw new C1353k("Invalid layout animation : " + readableMap);
    }

    /* renamed from: a */
    abstract boolean mo5679a();

    /* renamed from: b */
    abstract Animation mo5680b(View view, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public void m5681b() {
        this.f4805d = null;
        this.f4806e = 0;
        this.f4804c = 0;
        this.f4803b = null;
    }
}
