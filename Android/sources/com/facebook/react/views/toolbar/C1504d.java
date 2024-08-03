package com.facebook.react.views.toolbar;

import android.graphics.drawable.Drawable;
import com.facebook.react.views.toolbar.C1506f;
import p139d.p143b.p169g.p182i.C1820b;

/* renamed from: com.facebook.react.views.toolbar.d */
/* loaded from: classes.dex */
public class C1504d extends C1506f.b {

    /* renamed from: e */
    final /* synthetic */ C1506f f5540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504d(C1506f c1506f, C1820b c1820b) {
        super(c1820b);
        this.f5540e = c1506f;
    }

    @Override // com.facebook.react.views.toolbar.C1506f.b
    /* renamed from: a */
    protected void mo6281a(Drawable drawable) {
        this.f5540e.setOverflowIcon(drawable);
    }
}
