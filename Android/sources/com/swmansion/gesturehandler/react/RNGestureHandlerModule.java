package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p139d.p143b.p208m.C2056P;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p139d.p273d.p274a.C2685b;
import p139d.p273d.p274a.C2686c;
import p139d.p273d.p274a.C2693j;
import p139d.p273d.p274a.C2694k;
import p139d.p273d.p274a.C2696m;
import p139d.p273d.p274a.C2698o;
import p139d.p273d.p274a.C2702s;
import p139d.p273d.p274a.C2704u;
import p139d.p273d.p274a.InterfaceC2695l;

@InterfaceC2073a(name = RNGestureHandlerModule.MODULE_NAME)
/* loaded from: classes.dex */
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private List<Integer> mEnqueuedRootViewInit;
    private InterfaceC2695l mEventListener;
    private AbstractC1616b[] mHandlerFactories;
    private C1626d mInteractionManager;
    private final C1630h mRegistry;
    private List<C1632j> mRoots;

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a */
    /* loaded from: classes.dex */
    public static class C1615a extends AbstractC1616b<C2685b> {
        private C1615a() {
            super(null);
        }

        /* synthetic */ C1615a(C1627e c1627e) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public C2685b mo6749a(Context context) {
            return new C2685b();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public String mo6750a() {
            return "FlingGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public void mo6752a(C2685b c2685b, ReadableMap readableMap) {
            super.mo6752a((C1615a) c2685b, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                c2685b.m11500e(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                c2685b.m11499d(readableMap.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b, com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(C2685b c2685b, WritableMap writableMap) {
            super.mo6753a((C1615a) c2685b, writableMap);
            writableMap.putDouble("x", C1374w.m5957a(c2685b.m11534h()));
            writableMap.putDouble("y", C1374w.m5957a(c2685b.m11535i()));
            writableMap.putDouble("absoluteX", C1374w.m5957a(c2685b.m11532f()));
            writableMap.putDouble("absoluteY", C1374w.m5957a(c2685b.m11533g()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: b */
        public Class<C2685b> mo6754b() {
            return C2685b.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1616b<T extends C2686c> implements InterfaceC1625c<T> {
        private AbstractC1616b() {
        }

        /* synthetic */ AbstractC1616b(C1627e c1627e) {
            this();
        }

        /* renamed from: a */
        public abstract T mo6749a(Context context);

        /* renamed from: a */
        public abstract String mo6750a();

        /* renamed from: a */
        public void mo6752a(T t, ReadableMap readableMap) {
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                t.m11519b(readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                t.m11511a(readableMap.getBoolean(RNGestureHandlerModule.KEY_ENABLED));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }

        @Override // com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(T t, WritableMap writableMap) {
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, t.m11536j());
        }

        /* renamed from: b */
        public abstract Class<T> mo6754b();
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$c */
    /* loaded from: classes.dex */
    public static class C1617c extends AbstractC1616b<C2693j> {
        private C1617c() {
            super(null);
        }

        /* synthetic */ C1617c(C1627e c1627e) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public C2693j mo6749a(Context context) {
            return new C2693j(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public String mo6750a() {
            return "LongPressGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public void mo6752a(C2693j c2693j, ReadableMap readableMap) {
            super.mo6752a((C1617c) c2693j, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                c2693j.m11577a(readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (readableMap.hasKey("maxDist")) {
                c2693j.m11576a(C1374w.m5956a(readableMap.getDouble("maxDist")));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b, com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(C2693j c2693j, WritableMap writableMap) {
            super.mo6753a((C1617c) c2693j, writableMap);
            writableMap.putDouble("x", C1374w.m5957a(c2693j.m11534h()));
            writableMap.putDouble("y", C1374w.m5957a(c2693j.m11535i()));
            writableMap.putDouble("absoluteX", C1374w.m5957a(c2693j.m11532f()));
            writableMap.putDouble("absoluteY", C1374w.m5957a(c2693j.m11533g()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: b */
        public Class<C2693j> mo6754b() {
            return C2693j.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$d */
    /* loaded from: classes.dex */
    public static class C1618d extends AbstractC1616b<C2694k> {
        private C1618d() {
            super(null);
        }

        /* synthetic */ C1618d(C1627e c1627e) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public C2694k mo6749a(Context context) {
            return new C2694k();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public String mo6750a() {
            return "NativeViewGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public void mo6752a(C2694k c2694k, ReadableMap readableMap) {
            super.mo6752a((C1618d) c2694k, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                c2694k.m11580d(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                c2694k.m11579c(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b, com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(C2694k c2694k, WritableMap writableMap) {
            super.mo6753a((C1618d) c2694k, writableMap);
            writableMap.putBoolean("pointerInside", c2694k.m11541o());
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: b */
        public Class<C2694k> mo6754b() {
            return C2694k.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$e */
    /* loaded from: classes.dex */
    public static class C1619e extends AbstractC1616b<C2696m> {
        private C1619e() {
            super(null);
        }

        /* synthetic */ C1619e(C1627e c1627e) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public C2696m mo6749a(Context context) {
            return new C2696m(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public String mo6750a() {
            return "PanGestureHandler";
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo6752a(p139d.p273d.p274a.C2696m r5, com.facebook.react.bridge.ReadableMap r6) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.C1619e.mo6752a(d.d.a.m, com.facebook.react.bridge.ReadableMap):void");
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b, com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(C2696m c2696m, WritableMap writableMap) {
            super.mo6753a((C1619e) c2696m, writableMap);
            writableMap.putDouble("x", C1374w.m5957a(c2696m.m11534h()));
            writableMap.putDouble("y", C1374w.m5957a(c2696m.m11535i()));
            writableMap.putDouble("absoluteX", C1374w.m5957a(c2696m.m11532f()));
            writableMap.putDouble("absoluteY", C1374w.m5957a(c2696m.m11533g()));
            writableMap.putDouble("translationX", C1374w.m5957a(c2696m.m11599t()));
            writableMap.putDouble("translationY", C1374w.m5957a(c2696m.m11600u()));
            writableMap.putDouble("velocityX", C1374w.m5957a(c2696m.m11601v()));
            writableMap.putDouble("velocityY", C1374w.m5957a(c2696m.m11602w()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: b */
        public Class<C2696m> mo6754b() {
            return C2696m.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$f */
    /* loaded from: classes.dex */
    public static class C1620f extends AbstractC1616b<C2698o> {
        private C1620f() {
            super(null);
        }

        /* synthetic */ C1620f(C1627e c1627e) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public C2698o mo6749a(Context context) {
            return new C2698o();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public String mo6750a() {
            return "PinchGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b, com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(C2698o c2698o, WritableMap writableMap) {
            super.mo6753a((C1620f) c2698o, writableMap);
            writableMap.putDouble("scale", c2698o.m11611v());
            writableMap.putDouble("focalX", C1374w.m5957a(c2698o.m11609t()));
            writableMap.putDouble("focalY", C1374w.m5957a(c2698o.m11610u()));
            writableMap.putDouble("velocity", c2698o.m11612w());
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: b */
        public Class<C2698o> mo6754b() {
            return C2698o.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$g */
    /* loaded from: classes.dex */
    public static class C1621g extends AbstractC1616b<C2702s> {
        private C1621g() {
            super(null);
        }

        /* synthetic */ C1621g(C1627e c1627e) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public C2702s mo6749a(Context context) {
            return new C2702s();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public String mo6750a() {
            return "RotationGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b, com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(C2702s c2702s, WritableMap writableMap) {
            super.mo6753a((C1621g) c2702s, writableMap);
            writableMap.putDouble("rotation", c2702s.m11628v());
            writableMap.putDouble("anchorX", C1374w.m5957a(c2702s.m11626t()));
            writableMap.putDouble("anchorY", C1374w.m5957a(c2702s.m11627u()));
            writableMap.putDouble("velocity", c2702s.m11629w());
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: b */
        public Class<C2702s> mo6754b() {
            return C2702s.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$h */
    /* loaded from: classes.dex */
    public static class C1622h extends AbstractC1616b<C2704u> {
        private C1622h() {
            super(null);
        }

        /* synthetic */ C1622h(C1627e c1627e) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public C2704u mo6749a(Context context) {
            return new C2704u();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public String mo6750a() {
            return "TapGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: a */
        public void mo6752a(C2704u c2704u, ReadableMap readableMap) {
            super.mo6752a((C1622h) c2704u, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                c2704u.m11639e(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                c2704u.m11636b(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                c2704u.m11634a(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                c2704u.m11635b(C1374w.m5956a(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                c2704u.m11637c(C1374w.m5956a(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (readableMap.hasKey("maxDist")) {
                c2704u.m11633a(C1374w.m5956a(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                c2704u.m11638d(readableMap.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b, com.swmansion.gesturehandler.react.InterfaceC1625c
        /* renamed from: a */
        public void mo6753a(C2704u c2704u, WritableMap writableMap) {
            super.mo6753a((C1622h) c2704u, writableMap);
            writableMap.putDouble("x", C1374w.m5957a(c2704u.m11534h()));
            writableMap.putDouble("y", C1374w.m5957a(c2704u.m11535i()));
            writableMap.putDouble("absoluteX", C1374w.m5957a(c2704u.m11532f()));
            writableMap.putDouble("absoluteY", C1374w.m5957a(c2704u.m11533g()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC1616b
        /* renamed from: b */
        public Class<C2704u> mo6754b() {
            return C2704u.class;
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEventListener = new C1627e(this);
        this.mHandlerFactories = new AbstractC1616b[]{new C1618d(null), new C1622h(null), new C1617c(null), new C1619e(null), new C1620f(null), new C1621g(null), new C1615a(null)};
        this.mRegistry = new C1630h();
        this.mInteractionManager = new C1626d();
        this.mRoots = new ArrayList();
        this.mEnqueuedRootViewInit = new ArrayList();
    }

    private AbstractC1616b findFactoryForHandler(C2686c c2686c) {
        int i = 0;
        while (true) {
            AbstractC1616b[] abstractC1616bArr = this.mHandlerFactories;
            if (i >= abstractC1616bArr.length) {
                return null;
            }
            AbstractC1616b abstractC1616b = abstractC1616bArr[i];
            if (abstractC1616b.mo6754b().equals(c2686c.getClass())) {
                return abstractC1616b;
            }
            i++;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private C1632j findRootHelperForViewAncestor(int i) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                C1632j c1632j = this.mRoots.get(i2);
                if (c1632j.m6790a().getRootViewTag() == resolveRootTagFromReactTag) {
                    return c1632j;
                }
            }
            return null;
        }
    }

    public static void handleHitSlopProperty(C2686c c2686c, ReadableMap readableMap) {
        float f;
        float f2;
        float f3;
        float f4;
        if (readableMap.getType(KEY_HIT_SLOP) == ReadableType.Number) {
            float m5956a = C1374w.m5956a(readableMap.getDouble(KEY_HIT_SLOP));
            c2686c.m11508a(m5956a, m5956a, m5956a, m5956a, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap(KEY_HIT_SLOP);
        if (map.hasKey(KEY_HIT_SLOP_HORIZONTAL)) {
            f = C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_HORIZONTAL));
            f2 = f;
        } else {
            f = Float.NaN;
            f2 = Float.NaN;
        }
        if (map.hasKey(KEY_HIT_SLOP_VERTICAL)) {
            f3 = C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_VERTICAL));
            f4 = f3;
        } else {
            f3 = Float.NaN;
            f4 = Float.NaN;
        }
        if (map.hasKey(KEY_HIT_SLOP_LEFT)) {
            f = C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_LEFT));
        }
        float f5 = f;
        if (map.hasKey(KEY_HIT_SLOP_TOP)) {
            f4 = C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_TOP));
        }
        float f6 = f4;
        if (map.hasKey(KEY_HIT_SLOP_RIGHT)) {
            f2 = C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_RIGHT));
        }
        float f7 = f2;
        if (map.hasKey(KEY_HIT_SLOP_BOTTOM)) {
            f3 = C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_BOTTOM));
        }
        c2686c.m11508a(f5, f6, f7, f3, map.hasKey(KEY_HIT_SLOP_WIDTH) ? C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_WIDTH)) : Float.NaN, map.hasKey(KEY_HIT_SLOP_HEIGHT) ? C1374w.m5956a(map.getDouble(KEY_HIT_SLOP_HEIGHT)) : Float.NaN);
    }

    public void onStateChange(C2686c c2686c, int i, int i2) {
        if (c2686c.m11538l() < 0) {
            return;
        }
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(C1634l.m6798a(c2686c, i, i2, findFactoryForHandler(c2686c)));
    }

    public void onTouchEvent(C2686c c2686c, MotionEvent motionEvent) {
        if (c2686c.m11538l() >= 0 && c2686c.m11537k() == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(C1624b.m6764a(c2686c, findFactoryForHandler(c2686c)));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void tryInitializeHandlerForReactRootView(int i) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        int resolveRootTagFromReactTag = uIManagerModule.resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag < 1) {
            throw new JSApplicationIllegalArgumentException("Could find root view for a given ancestor with tag " + i);
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                if (this.mRoots.get(i2).m6790a().getRootViewTag() == resolveRootTagFromReactTag) {
                    return;
                }
            }
            synchronized (this.mEnqueuedRootViewInit) {
                if (this.mEnqueuedRootViewInit.contains(Integer.valueOf(resolveRootTagFromReactTag))) {
                    return;
                }
                this.mEnqueuedRootViewInit.add(Integer.valueOf(resolveRootTagFromReactTag));
                uIManagerModule.addUIBlock(new C1628f(this, resolveRootTagFromReactTag));
            }
        }
    }

    @ReactMethod
    public void attachGestureHandler(int i, int i2) {
        tryInitializeHandlerForReactRootView(i2);
        if (this.mRegistry.m6782a(i, i2)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @ReactMethod
    public void createGestureHandler(String str, int i, ReadableMap readableMap) {
        int i2 = 0;
        while (true) {
            AbstractC1616b[] abstractC1616bArr = this.mHandlerFactories;
            if (i2 >= abstractC1616bArr.length) {
                throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
            }
            AbstractC1616b abstractC1616b = abstractC1616bArr[i2];
            if (abstractC1616b.mo6750a().equals(str)) {
                C2686c mo6749a = abstractC1616b.mo6749a(getReactApplicationContext());
                mo6749a.m11513a(i);
                mo6749a.m11510a(this.mEventListener);
                this.mRegistry.m6781a(mo6749a);
                this.mInteractionManager.m6769a(mo6749a, readableMap);
                abstractC1616b.mo6752a((AbstractC1616b) mo6749a, readableMap);
                return;
            }
            i2++;
        }
    }

    @ReactMethod
    public void dropGestureHandler(int i) {
        this.mInteractionManager.m6768a(i);
        this.mRegistry.m6780a(i);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map getConstants() {
        return C1104f.m5177a("State", C1104f.m5181a("UNDETERMINED", 0, "BEGAN", 2, "ACTIVE", 4, "CANCELLED", 3, "FAILED", 1, "END", 5), "Direction", C1104f.m5179a("RIGHT", 1, "LEFT", 2, "UP", 4, "DOWN", 8));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public C1630h getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(int i, boolean z) {
        C1632j findRootHelperForViewAncestor;
        if (this.mRegistry == null || (findRootHelperForViewAncestor = findRootHelperForViewAncestor(i)) == null) {
            return;
        }
        findRootHelperForViewAncestor.m6791a(i, z);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mRegistry.m6779a();
        this.mInteractionManager.m6767a();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                C1632j c1632j = this.mRoots.get(0);
                C2056P m6790a = c1632j.m6790a();
                if (m6790a instanceof C1623a) {
                    ((C1623a) m6790a).m6763e();
                } else {
                    c1632j.m6794b();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    public void registerRootHelper(C1632j c1632j) {
        synchronized (this.mRoots) {
            if (this.mRoots.contains(c1632j)) {
                throw new IllegalStateException("Root helper" + c1632j + " already registered");
            }
            this.mRoots.add(c1632j);
        }
    }

    public void unregisterRootHelper(C1632j c1632j) {
        synchronized (this.mRoots) {
            this.mRoots.remove(c1632j);
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i, ReadableMap readableMap) {
        AbstractC1616b findFactoryForHandler;
        C2686c m6783b = this.mRegistry.m6783b(i);
        if (m6783b == null || (findFactoryForHandler = findFactoryForHandler(m6783b)) == null) {
            return;
        }
        this.mInteractionManager.m6768a(i);
        this.mInteractionManager.m6769a(m6783b, readableMap);
        findFactoryForHandler.mo6752a((AbstractC1616b) m6783b, readableMap);
    }
}
