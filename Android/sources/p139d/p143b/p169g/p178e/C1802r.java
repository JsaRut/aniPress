package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: d.b.g.e.r */
/* loaded from: classes.dex */
public class C1802r extends AbstractC1801q {
    public C1802r(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // p139d.p143b.p169g.p178e.AbstractC1801q, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!mo7380a()) {
            super.draw(canvas);
            return;
        }
        m7387c();
        m7386b();
        canvas.clipPath(this.f6615e);
        super.draw(canvas);
    }
}
