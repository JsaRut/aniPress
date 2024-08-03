package com.facebook.react.uimanager.p129c;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.c.r */
/* loaded from: classes.dex */
public class InterpolatorC1318r implements Interpolator {

    /* renamed from: a */
    private final float f4859a;

    public InterpolatorC1318r(float f) {
        this.f4859a = f;
    }

    /* renamed from: a */
    public static float m5698a(ReadableMap readableMap) {
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (-10.0f) * f);
        float f2 = this.f4859a;
        double d2 = f - (f2 / 4.0f);
        Double.isNaN(d2);
        double d3 = f2;
        Double.isNaN(d3);
        return (float) ((pow * Math.sin(((d2 * 3.141592653589793d) * 2.0d) / d3)) + 1.0d);
    }
}
