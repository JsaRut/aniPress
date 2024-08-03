package com.facebook.react.uimanager.p129c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.C1353k;

/* renamed from: com.facebook.react.uimanager.c.d */
/* loaded from: classes.dex */
abstract class AbstractC1304d extends AbstractC1301a {
    @Override // com.facebook.react.uimanager.p129c.AbstractC1301a
    /* renamed from: a */
    boolean mo5679a() {
        return this.f4806e > 0 && this.f4805d != null;
    }

    @Override // com.facebook.react.uimanager.p129c.AbstractC1301a
    /* renamed from: b */
    Animation mo5680b(View view, int i, int i2, int i3, int i4) {
        EnumC1302b enumC1302b = this.f4805d;
        if (enumC1302b == null) {
            throw new C1353k("Missing animated property from animation config");
        }
        int i5 = C1303c.f4824a[enumC1302b.ordinal()];
        if (i5 == 1) {
            return new C1316p(view, mo5685c() ? view.getAlpha() : 0.0f, mo5685c() ? 0.0f : view.getAlpha());
        }
        if (i5 == 2) {
            float f = mo5685c() ? 1.0f : 0.0f;
            float f2 = mo5685c() ? 0.0f : 1.0f;
            return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        }
        if (i5 == 3) {
            return new ScaleAnimation(mo5685c() ? 1.0f : 0.0f, mo5685c() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (i5 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, mo5685c() ? 1.0f : 0.0f, mo5685c() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        throw new C1353k("Missing animation for property : " + this.f4805d);
    }

    /* renamed from: c */
    abstract boolean mo5685c();
}
