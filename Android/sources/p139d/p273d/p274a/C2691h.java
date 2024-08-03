package p139d.p273d.p274a;

import android.view.MotionEvent;

/* renamed from: d.d.a.h */
/* loaded from: classes.dex */
public class C2691h {
    /* renamed from: a */
    public static float m11574a(MotionEvent motionEvent, boolean z) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount() - 1;
            if (pointerCount == actionIndex) {
                pointerCount--;
            }
            return motionEvent.getX(pointerCount) + rawX;
        }
        float f = 0.0f;
        int pointerCount2 = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            if (i2 != actionIndex) {
                f += motionEvent.getX(i2) + rawX;
                i++;
            }
        }
        return f / i;
    }

    /* renamed from: b */
    public static float m11575b(MotionEvent motionEvent, boolean z) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount() - 1;
            if (pointerCount == actionIndex) {
                pointerCount--;
            }
            return motionEvent.getY(pointerCount) + rawY;
        }
        float f = 0.0f;
        int pointerCount2 = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            if (i2 != actionIndex) {
                f += motionEvent.getY(i2) + rawY;
                i++;
            }
        }
        return f / i;
    }
}
