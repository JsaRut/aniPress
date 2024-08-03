package p031c.p032a.p072p.p073a.p089h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: c.a.p.a.h.m */
/* loaded from: classes.dex */
public final class C0802m extends ImageView {

    /* renamed from: a */
    Paint f3507a;

    public C0802m(Context context) {
        super(context);
        this.f3507a = new Paint();
        this.f3507a.setColor(-1);
        this.f3507a.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
        Path path = new Path();
        path.moveTo(getWidth() * 0.4f, 0.0f);
        path.lineTo(getWidth() * 0.6f, 0.0f);
        path.lineTo(getWidth() * 0.6f, getHeight() * 0.7f);
        path.lineTo(getWidth(), getHeight() * 0.7f);
        path.lineTo(getWidth() * 0.5f, getHeight());
        path.lineTo(0.0f, getHeight() * 0.7f);
        path.lineTo(getWidth() * 0.4f, getHeight() * 0.7f);
        path.close();
        canvas.drawPath(path, this.f3507a);
    }
}
