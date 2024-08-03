package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import p139d.p143b.p208m.p217g.InterfaceC2108c;

/* renamed from: com.facebook.react.uimanager.O */
/* loaded from: classes.dex */
public class C1279O {

    /* renamed from: a */
    private static final float[] f4765a = new float[2];

    /* renamed from: b */
    private static final PointF f4766b = new PointF();

    /* renamed from: c */
    private static final float[] f4767c = new float[2];

    /* renamed from: d */
    private static final Matrix f4768d = new Matrix();

    /* renamed from: a */
    public static int m5598a(float f, float f2, ViewGroup viewGroup) {
        return m5599a(f, f2, viewGroup, f4765a, (int[]) null);
    }

    /* renamed from: a */
    public static int m5599a(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View m5601a;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View m5603a = m5603a(fArr, viewGroup);
        if (m5603a == null || (m5601a = m5601a(m5603a)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = m5601a.getId();
        }
        return m5600a(m5601a, fArr[0], fArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static int m5600a(View view, float f, float f2) {
        return view instanceof InterfaceC1265A ? ((InterfaceC1265A) view).mo5472a(f, f2) : view.getId();
    }

    /* renamed from: a */
    private static View m5601a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static View m5602a(float[] fArr, View view) {
        EnumC1375x pointerEvents = view instanceof InterfaceC1267C ? ((InterfaceC1267C) view).getPointerEvents() : EnumC1375x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == EnumC1375x.AUTO) {
                pointerEvents = EnumC1375x.BOX_NONE;
            } else if (pointerEvents == EnumC1375x.BOX_ONLY) {
                pointerEvents = EnumC1375x.NONE;
            }
        }
        if (pointerEvents == EnumC1375x.NONE) {
            return null;
        }
        if (pointerEvents == EnumC1375x.BOX_ONLY) {
            return view;
        }
        if (pointerEvents != EnumC1375x.BOX_NONE) {
            if (pointerEvents == EnumC1375x.AUTO) {
                return (!((view instanceof InterfaceC1266B) && ((InterfaceC1266B) view).m5473b(fArr[0], fArr[1])) && (view instanceof ViewGroup)) ? m5603a(fArr, (ViewGroup) view) : view;
            }
            throw new JSApplicationIllegalArgumentException("Unknown pointer event type: " + pointerEvents.toString());
        }
        if (view instanceof ViewGroup) {
            View m5603a = m5603a(fArr, (ViewGroup) view);
            if (m5603a != view) {
                return m5603a;
            }
            if ((view instanceof InterfaceC1265A) && ((InterfaceC1265A) view).mo5472a(fArr[0], fArr[1]) != view.getId()) {
                return view;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static View m5603a(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        InterfaceC1273I interfaceC1273I = viewGroup instanceof InterfaceC1273I ? (InterfaceC1273I) viewGroup : null;
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = viewGroup.getChildAt(interfaceC1273I != null ? interfaceC1273I.mo5581a(i) : i);
            PointF pointF = f4766b;
            if (m5604a(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View m5602a = m5602a(fArr, childAt);
                if (m5602a != null) {
                    return m5602a;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static boolean m5604a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f4767c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f4768d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof InterfaceC2108c) {
            InterfaceC2108c interfaceC2108c = (InterfaceC2108c) view;
            if (interfaceC2108c.getHitSlopRect() != null) {
                Rect hitSlopRect = interfaceC2108c.getHitSlopRect();
                if (scrollX < (-hitSlopRect.left) || scrollX >= (view.getRight() - view.getLeft()) + hitSlopRect.right || scrollY < (-hitSlopRect.top) || scrollY >= (view.getBottom() - view.getTop()) + hitSlopRect.bottom) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < 0.0f || scrollX >= view.getRight() - view.getLeft() || scrollY < 0.0f || scrollY >= view.getBottom() - view.getTop()) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
