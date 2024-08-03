package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
/* loaded from: classes.dex */
public class C0438b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2332a;

    public C0438b(ActionBarContainer actionBarContainer) {
        this.f2332a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2332a;
        if (actionBarContainer.f1912h) {
            Drawable drawable = actionBarContainer.f1911g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1909e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2332a;
        Drawable drawable3 = actionBarContainer2.f1910f;
        if (drawable3 == null || !actionBarContainer2.f1913i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f2332a;
        if (actionBarContainer.f1912h) {
            drawable = actionBarContainer.f1911g;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1909e;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
