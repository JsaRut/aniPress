package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1300c;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.C1361o;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p130d.C1324a;
import p000a.p005b.p009c.p019h.C0107v;
import p139d.p143b.p208m.C2122m;

/* loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends C1359n> extends ViewManager<T, C> {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String PROP_ACCESSIBILITY_COMPONENT_TYPE = "accessibilityComponentType";
    private static final String PROP_ACCESSIBILITY_HINT = "accessibilityHint";
    private static final String PROP_ACCESSIBILITY_LABEL = "accessibilityLabel";
    private static final String PROP_ACCESSIBILITY_LIVE_REGION = "accessibilityLiveRegion";
    private static final String PROP_ACCESSIBILITY_ROLE = "accessibilityRole";
    private static final String PROP_ACCESSIBILITY_STATES = "accessibilityStates";
    private static final String PROP_BACKGROUND_COLOR = "backgroundColor";
    private static final String PROP_ELEVATION = "elevation";
    private static final String PROP_IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility";
    public static final String PROP_NATIVE_ID = "nativeID";
    private static final String PROP_RENDER_TO_HARDWARE_TEXTURE = "renderToHardwareTextureAndroid";
    private static final String PROP_ROTATION = "rotation";
    private static final String PROP_SCALE_X = "scaleX";
    private static final String PROP_SCALE_Y = "scaleY";
    public static final String PROP_TEST_ID = "testID";
    private static final String PROP_TRANSFORM = "transform";
    private static final String PROP_TRANSLATE_X = "translateX";
    private static final String PROP_TRANSLATE_Y = "translateY";
    private static final String PROP_Z_INDEX = "zIndex";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static C1361o.a sMatrixDecompositionContext = new C1361o.a();
    private static double[] sTransformDecompositionArray = new double[16];

    private static void resetTransformProperty(View view) {
        view.setTranslationX(C1374w.m5959b(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(C1374w.m5959b(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        C1281Q.m5606a(readableArray, sTransformDecompositionArray);
        C1361o.m5871a(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(C1374w.m5959b((float) sMatrixDecompositionContext.f5033d[0]));
        view.setTranslationY(C1374w.m5959b((float) sMatrixDecompositionContext.f5033d[1]));
        view.setRotation((float) sMatrixDecompositionContext.f5034e[2]);
        view.setRotationX((float) sMatrixDecompositionContext.f5034e[0]);
        view.setRotationY((float) sMatrixDecompositionContext.f5034e[1]);
        view.setScaleX((float) sMatrixDecompositionContext.f5031b[0]);
        view.setScaleY((float) sMatrixDecompositionContext.f5031b[1]);
        double[] dArr = sMatrixDecompositionContext.f5030a;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = C1347h.m5778a().density;
            view.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    private void updateViewAccessibility(T t) {
        C1300c.m5675a(t);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @InterfaceC1294a(name = PROP_ACCESSIBILITY_COMPONENT_TYPE)
    public void setAccessibilityComponentType(T t, String str) {
        C1345g.m5777a(t, str);
    }

    @InterfaceC1294a(name = PROP_ACCESSIBILITY_HINT)
    public void setAccessibilityHint(T t, String str) {
        t.setTag(C2122m.accessibility_hint, str);
    }

    @InterfaceC1294a(name = PROP_ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(T t, String str) {
        t.setContentDescription(str);
    }

    @InterfaceC1294a(name = PROP_ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(T t, String str) {
        int i;
        if (str == null || str.equals("none")) {
            i = 0;
        } else if (str.equals("polite")) {
            i = 1;
        } else if (!str.equals("assertive")) {
            return;
        } else {
            i = 2;
        }
        C0107v.m511c(t, i);
    }

    @InterfaceC1294a(name = PROP_ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(T t, String str) {
        if (str == null) {
            return;
        }
        t.setTag(C2122m.accessibility_role, C1300c.a.m5682a(str));
    }

    @InterfaceC1294a(customType = "Color", defaultInt = 0, name = PROP_BACKGROUND_COLOR)
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @InterfaceC1294a(name = PROP_ELEVATION)
    public void setElevation(T t, float f) {
        C0107v.m493a(t, C1374w.m5959b(f));
    }

    @InterfaceC1294a(name = PROP_IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(T t, String str) {
        int i;
        if (str == null || str.equals("auto")) {
            i = 0;
        } else if (str.equals("yes")) {
            i = 1;
        } else if (str.equals("no")) {
            i = 2;
        } else if (!str.equals("no-hide-descendants")) {
            return;
        } else {
            i = 4;
        }
        C0107v.m513d(t, i);
    }

    @InterfaceC1294a(name = PROP_NATIVE_ID)
    public void setNativeId(T t, String str) {
        t.setTag(C2122m.view_tag_native_id, str);
        C1324a.m5704a(t);
    }

    @InterfaceC1294a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @InterfaceC1294a(name = PROP_RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @InterfaceC1294a(name = PROP_ROTATION)
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @InterfaceC1294a(defaultFloat = 1.0f, name = PROP_SCALE_X)
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @InterfaceC1294a(defaultFloat = 1.0f, name = PROP_SCALE_Y)
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @InterfaceC1294a(name = PROP_TEST_ID)
    public void setTestId(T t, String str) {
        t.setTag(C2122m.react_test_id, str);
        t.setTag(str);
    }

    @InterfaceC1294a(name = PROP_TRANSFORM)
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @InterfaceC1294a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = PROP_TRANSLATE_X)
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(C1374w.m5959b(f));
    }

    @InterfaceC1294a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = PROP_TRANSLATE_Y)
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(C1374w.m5959b(f));
    }

    @InterfaceC1294a(name = PROP_ACCESSIBILITY_STATES)
    public void setViewStates(T t, ReadableArray readableArray) {
        t.setSelected(false);
        t.setEnabled(true);
        if (readableArray == null) {
            return;
        }
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string.equals("selected")) {
                t.setSelected(true);
            } else if (string.equals("disabled")) {
                t.setEnabled(false);
            }
        }
    }

    @InterfaceC1294a(name = PROP_Z_INDEX)
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent == null || !(parent instanceof InterfaceC1273I)) {
            return;
        }
        ((InterfaceC1273I) parent).mo5582b();
    }
}
