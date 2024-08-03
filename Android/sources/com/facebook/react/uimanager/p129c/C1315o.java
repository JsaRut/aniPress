package com.facebook.react.uimanager.p129c;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.facebook.react.uimanager.c.o */
/* loaded from: classes.dex */
class C1315o extends AbstractC1301a {
    @Override // com.facebook.react.uimanager.p129c.AbstractC1301a
    /* renamed from: a */
    boolean mo5679a() {
        return this.f4806e > 0;
    }

    @Override // com.facebook.react.uimanager.p129c.AbstractC1301a
    /* renamed from: b */
    Animation mo5680b(View view, int i, int i2, int i3, int i4) {
        boolean z = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        boolean z2 = (view.getWidth() == i3 && view.getHeight() == i4) ? false : true;
        if (z || z2) {
            return new C1317q(view, i, i2, i3, i4);
        }
        return null;
    }
}
