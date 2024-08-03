package com.facebook.react.views.toolbar;

import android.graphics.drawable.Drawable;
import com.facebook.react.views.toolbar.C1506f;
import p139d.p143b.p169g.p182i.C1820b;

/* renamed from: com.facebook.react.views.toolbar.b */
/* loaded from: classes.dex */
public class C1502b extends C1506f.b {

    /* renamed from: e */
    final /* synthetic */ C1506f f5538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502b(C1506f c1506f, C1820b c1820b) {
        super(c1820b);
        this.f5538e = c1506f;
    }

    @Override // com.facebook.react.views.toolbar.C1506f.b
    /* renamed from: a */
    protected void mo6281a(Drawable drawable) {
        this.f5538e.setLogo(drawable);
    }
}
