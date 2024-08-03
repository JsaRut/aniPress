package p139d.p143b.p208m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.C1289W;
import com.facebook.react.uimanager.C1347h;
import com.facebook.react.uimanager.C1353k;
import com.facebook.react.uimanager.C1355l;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.InterfaceC1274J;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.InterfaceC1321a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.systrace.C1550a;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: d.b.m.P */
/* loaded from: classes.dex */
public class C2056P extends SizeMonitoringFrameLayout implements InterfaceC1274J, InterfaceC1321a {

    /* renamed from: b */
    private C2047G f7472b;

    /* renamed from: c */
    private String f7473c;

    /* renamed from: d */
    private Bundle f7474d;

    /* renamed from: e */
    private String f7475e;

    /* renamed from: f */
    private a f7476f;

    /* renamed from: g */
    private b f7477g;

    /* renamed from: h */
    private int f7478h;

    /* renamed from: i */
    private boolean f7479i;

    /* renamed from: j */
    private boolean f7480j;

    /* renamed from: k */
    private C1355l f7481k;

    /* renamed from: l */
    private final C2129t f7482l;

    /* renamed from: m */
    private boolean f7483m;

    /* renamed from: n */
    private int f7484n;

    /* renamed from: o */
    private int f7485o;

    /* renamed from: p */
    private int f7486p;

    /* renamed from: d.b.m.P$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final Rect f7487a;

        /* renamed from: b */
        private final int f7488b;

        /* renamed from: c */
        private int f7489c = 0;

        /* renamed from: d */
        private int f7490d = 0;

        /* renamed from: e */
        private DisplayMetrics f7491e = new DisplayMetrics();

        /* renamed from: f */
        private DisplayMetrics f7492f = new DisplayMetrics();

        a() {
            C1347h.m5786b(C2056P.this.getContext().getApplicationContext());
            this.f7487a = new Rect();
            this.f7488b = (int) C1374w.m5959b(60.0f);
        }

        /* renamed from: a */
        private void m8413a() {
            C1347h.m5781a(C2056P.this.getContext());
            if (m8415a(this.f7491e, C1347h.m5783b()) && m8415a(this.f7492f, C1347h.m5778a())) {
                return;
            }
            this.f7491e.setTo(C1347h.m5783b());
            this.f7492f.setTo(C1347h.m5778a());
            m8418d();
        }

        /* renamed from: a */
        private void m8414a(int i) {
            double d2;
            String str;
            double d3;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    d3 = -90.0d;
                    str = "landscape-primary";
                } else if (i == 2) {
                    d2 = 180.0d;
                    str = "portrait-secondary";
                } else {
                    if (i != 3) {
                        return;
                    }
                    d3 = 90.0d;
                    str = "landscape-secondary";
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str);
                createMap.putDouble("rotationDegrees", d3);
                createMap.putBoolean("isLandscape", z);
                C2056P.this.m8410a("namedOrientationDidChange", createMap);
            }
            d2 = 0.0d;
            str = "portrait-primary";
            d3 = d2;
            z = false;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("name", str);
            createMap2.putDouble("rotationDegrees", d3);
            createMap2.putBoolean("isLandscape", z);
            C2056P.this.m8410a("namedOrientationDidChange", createMap2);
        }

        /* renamed from: a */
        private boolean m8415a(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            return Build.VERSION.SDK_INT >= 17 ? displayMetrics.equals(displayMetrics2) : displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi;
        }

        /* renamed from: b */
        private void m8416b() {
            int rotation = ((WindowManager) C2056P.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f7490d == rotation) {
                return;
            }
            this.f7490d = rotation;
            m8414a(rotation);
        }

        /* renamed from: c */
        private void m8417c() {
            C2056P.this.getRootView().getWindowVisibleDisplayFrame(this.f7487a);
            int i = C1347h.m5783b().heightPixels - this.f7487a.bottom;
            if (this.f7489c == i || i <= this.f7488b) {
                if (this.f7489c == 0 || i > this.f7488b) {
                    return;
                }
                this.f7489c = 0;
                C2056P.this.m8410a("keyboardDidHide", (WritableMap) null);
                return;
            }
            this.f7489c = i;
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("screenY", C1374w.m5957a(this.f7487a.bottom));
            createMap2.putDouble("screenX", C1374w.m5957a(this.f7487a.left));
            createMap2.putDouble("width", C1374w.m5957a(this.f7487a.width()));
            createMap2.putDouble("height", C1374w.m5957a(this.f7489c));
            createMap.putMap("endCoordinates", createMap2);
            C2056P.this.m8410a("keyboardDidShow", createMap);
        }

        /* renamed from: d */
        private void m8418d() {
            ((DeviceInfoModule) C2056P.this.f7472b.m8362c().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C2056P.this.f7472b == null || !C2056P.this.f7479i || C2056P.this.f7472b.m8362c() == null) {
                return;
            }
            m8417c();
            m8416b();
            m8413a();
        }
    }

    /* renamed from: d.b.m.P$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m8419a(C2056P c2056p);
    }

    public C2056P(Context context) {
        super(context);
        this.f7482l = new C2129t(this);
        this.f7483m = false;
        this.f7484n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f7485o = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f7486p = 1;
        m8406f();
    }

    /* renamed from: a */
    private void m8401a(int i, int i2) {
        C2047G c2047g = this.f7472b;
        if (c2047g == null) {
            C1700a.m7015d("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext m8362c = c2047g.m8362c();
        if (m8362c != null) {
            C1289W.m5672a(m8362c, getUIManagerType()).updateRootLayoutSpecs(getRootViewTag(), i, i2);
        }
    }

    /* renamed from: b */
    private void m8402b(MotionEvent motionEvent) {
        C2047G c2047g = this.f7472b;
        if (c2047g == null || !this.f7479i || c2047g.m8362c() == null) {
            C1700a.m7015d("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.f7481k == null) {
            C1700a.m7015d("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.f7481k.m5847a(motionEvent, ((UIManagerModule) this.f7472b.m8362c().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    /* renamed from: d */
    private void m8404d() {
        C1550a.m6454a(0L, "attachToReactInstanceManager");
        try {
            if (this.f7479i) {
                return;
            }
            this.f7479i = true;
            C2047G c2047g = this.f7472b;
            C2038a.m8318a(c2047g);
            c2047g.m8358a(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            C1550a.m6453a(0L);
        }
    }

    /* renamed from: e */
    private void m8405e() {
        C2047G c2047g = this.f7472b;
        if (c2047g == null) {
            C1700a.m7015d("ReactNative", "Unable to enable layout calculation for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext m8362c = c2047g.m8362c();
        if (m8362c != null) {
            ((UIManagerModule) m8362c.getCatalystInstance().getNativeModule(UIManagerModule.class)).getUIImplementation().m5647b(getRootViewTag());
        }
    }

    /* renamed from: f */
    private void m8406f() {
        setClipChildren(false);
    }

    /* renamed from: g */
    private void m8407g() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f7476f == null) {
            this.f7476f = new a();
        }
        return this.f7476f;
    }

    /* renamed from: a */
    public void m8408a() {
        this.f7481k = new C1355l(this);
        b bVar = this.f7477g;
        if (bVar != null) {
            bVar.m8419a(this);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1274J
    /* renamed from: a */
    public void mo5583a(MotionEvent motionEvent) {
        C2047G c2047g = this.f7472b;
        if (c2047g == null || !this.f7479i || c2047g.m8362c() == null) {
            C1700a.m7015d("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.f7481k == null) {
            C1700a.m7015d("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.f7481k.m5848b(motionEvent, ((UIManagerModule) this.f7472b.m8362c().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    /* renamed from: a */
    public void mo6761a(C2047G c2047g, String str, Bundle bundle) {
        m8409a(c2047g, str, bundle, null);
    }

    /* renamed from: a */
    public void m8409a(C2047G c2047g, String str, Bundle bundle, String str2) {
        C1550a.m6454a(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            C2038a.m8321a(this.f7472b == null, "This root view has already been attached to a catalyst instance manager");
            this.f7472b = c2047g;
            this.f7473c = str;
            this.f7474d = bundle;
            this.f7475e = str2;
            if (!this.f7472b.m8366f()) {
                this.f7472b.m8359b();
            }
            m8404d();
        } finally {
            C1550a.m6453a(0L);
        }
    }

    /* renamed from: a */
    public void m8410a(String str, WritableMap writableMap) {
        C2047G c2047g = this.f7472b;
        if (c2047g != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) c2047g.m8362c().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1274J
    /* renamed from: a */
    public void mo5584a(Throwable th) {
        C2047G c2047g = this.f7472b;
        if (c2047g == null || c2047g.m8362c() == null) {
            throw new RuntimeException(th);
        }
        this.f7472b.m8362c().handleException(new C1353k(th.getMessage(), this, th));
    }

    /* renamed from: b */
    public void m8411b() {
        C1550a.m6454a(0L, "ReactRootView.runApplication");
        try {
            if (this.f7472b != null && this.f7479i) {
                ReactContext m8362c = this.f7472b.m8362c();
                if (m8362c == null) {
                    return;
                }
                CatalystInstance catalystInstance = m8362c.getCatalystInstance();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                if (getUIManagerType() == 2) {
                    writableNativeMap.putBoolean("fabric", true);
                }
                this.f7480j = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(getJSModuleName(), writableNativeMap);
            }
        } finally {
            C1550a.m6453a(0L);
        }
    }

    /* renamed from: c */
    public void m8412c() {
        C2047G c2047g = this.f7472b;
        if (c2047g != null && this.f7479i) {
            c2047g.m8361b(this);
            this.f7472b = null;
            this.f7479i = false;
        }
        this.f7480j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e2) {
            mo5584a(e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C2047G c2047g = this.f7472b;
        if (c2047g == null || !this.f7479i || c2047g.m8362c() == null) {
            C1700a.m7015d("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
        } else {
            this.f7482l.m8498a(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    protected void finalize() {
        super.finalize();
        C2038a.m8321a(!this.f7479i, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public Bundle getAppProperties() {
        return this.f7474d;
    }

    @Override // com.facebook.react.uimanager.common.InterfaceC1321a
    public int getHeightMeasureSpec() {
        return (this.f7483m || getLayoutParams() == null || getLayoutParams().height <= 0) ? this.f7485o : View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824);
    }

    public String getInitialUITemplate() {
        return this.f7475e;
    }

    String getJSModuleName() {
        String str = this.f7473c;
        C2038a.m8318a(str);
        return str;
    }

    public C2047G getReactInstanceManager() {
        return this.f7472b;
    }

    public int getRootViewTag() {
        return this.f7478h;
    }

    public int getUIManagerType() {
        return this.f7486p;
    }

    @Override // com.facebook.react.uimanager.common.InterfaceC1321a
    public int getWidthMeasureSpec() {
        return (this.f7483m || getLayoutParams() == null || getLayoutParams().width <= 0) ? this.f7484n : View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7479i) {
            m8407g();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7479i) {
            m8407g();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        C2047G c2047g = this.f7472b;
        if (c2047g == null || !this.f7479i || c2047g.m8362c() == null) {
            C1700a.m7015d("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
        } else {
            this.f7482l.m8497a();
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m8402b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:3:0x0007, B:7:0x0017, B:8:0x0043, B:12:0x004c, B:13:0x0076, B:15:0x0080, B:17:0x0084, B:21:0x008b, B:23:0x0052, B:25:0x0058, B:28:0x001e, B:30:0x0024), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: all -> 0x0099, LOOP:0: B:23:0x0052->B:25:0x0058, LOOP_END, TryCatch #0 {all -> 0x0099, blocks: (B:3:0x0007, B:7:0x0017, B:8:0x0043, B:12:0x004c, B:13:0x0076, B:15:0x0080, B:17:0x0084, B:21:0x008b, B:23:0x0052, B:25:0x0058, B:28:0x001e, B:30:0x0024), top: B:2:0x0007 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r2 = "ReactRootView.onMeasure"
            com.facebook.systrace.C1550a.m6454a(r0, r2)
            r8.f7484n = r9     // Catch: java.lang.Throwable -> L99
            r8.f7485o = r10     // Catch: java.lang.Throwable -> L99
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch: java.lang.Throwable -> L99
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r2 == r3) goto L1c
            if (r2 != 0) goto L17
            goto L1c
        L17:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch: java.lang.Throwable -> L99
            goto L43
        L1c:
            r9 = 0
            r2 = 0
        L1e:
            int r5 = r8.getChildCount()     // Catch: java.lang.Throwable -> L99
            if (r9 >= r5) goto L42
            android.view.View r5 = r8.getChildAt(r9)     // Catch: java.lang.Throwable -> L99
            int r6 = r5.getLeft()     // Catch: java.lang.Throwable -> L99
            int r7 = r5.getMeasuredWidth()     // Catch: java.lang.Throwable -> L99
            int r6 = r6 + r7
            int r7 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L99
            int r6 = r6 + r7
            int r5 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> L99
            int r6 = r6 + r5
            int r2 = java.lang.Math.max(r2, r6)     // Catch: java.lang.Throwable -> L99
            int r9 = r9 + 1
            goto L1e
        L42:
            r9 = r2
        L43:
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch: java.lang.Throwable -> L99
            if (r2 == r3) goto L51
            if (r2 != 0) goto L4c
            goto L51
        L4c:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch: java.lang.Throwable -> L99
            goto L76
        L51:
            r10 = 0
        L52:
            int r2 = r8.getChildCount()     // Catch: java.lang.Throwable -> L99
            if (r4 >= r2) goto L76
            android.view.View r2 = r8.getChildAt(r4)     // Catch: java.lang.Throwable -> L99
            int r3 = r2.getTop()     // Catch: java.lang.Throwable -> L99
            int r5 = r2.getMeasuredHeight()     // Catch: java.lang.Throwable -> L99
            int r3 = r3 + r5
            int r5 = r2.getPaddingTop()     // Catch: java.lang.Throwable -> L99
            int r3 = r3 + r5
            int r2 = r2.getPaddingBottom()     // Catch: java.lang.Throwable -> L99
            int r3 = r3 + r2
            int r10 = java.lang.Math.max(r10, r3)     // Catch: java.lang.Throwable -> L99
            int r4 = r4 + 1
            goto L52
        L76:
            r8.setMeasuredDimension(r9, r10)     // Catch: java.lang.Throwable -> L99
            r9 = 1
            r8.f7483m = r9     // Catch: java.lang.Throwable -> L99
            d.b.m.G r9 = r8.f7472b     // Catch: java.lang.Throwable -> L99
            if (r9 == 0) goto L8b
            boolean r9 = r8.f7479i     // Catch: java.lang.Throwable -> L99
            if (r9 != 0) goto L8b
            r8.m8404d()     // Catch: java.lang.Throwable -> L99
            r8.m8405e()     // Catch: java.lang.Throwable -> L99
            goto L95
        L8b:
            r8.m8405e()     // Catch: java.lang.Throwable -> L99
            int r9 = r8.f7484n     // Catch: java.lang.Throwable -> L99
            int r10 = r8.f7485o     // Catch: java.lang.Throwable -> L99
            r8.m8401a(r9, r10)     // Catch: java.lang.Throwable -> L99
        L95:
            com.facebook.systrace.C1550a.m6453a(r0)
            return
        L99:
            r9 = move-exception
            com.facebook.systrace.C1550a.m6453a(r0)
            throw r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p208m.C2056P.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m8402b(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f7480j) {
            this.f7480j = false;
            String str = this.f7473c;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.f7478h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        C2047G c2047g = this.f7472b;
        if (c2047g == null || !this.f7479i || c2047g.m8362c() == null) {
            C1700a.m7015d("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        } else {
            this.f7482l.m8499a(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f7474d = bundle;
        if (getRootViewTag() != 0) {
            m8411b();
        }
    }

    public void setEventListener(b bVar) {
        this.f7477g = bVar;
    }

    public void setIsFabric(boolean z) {
        this.f7486p = z ? 2 : 1;
    }

    public void setRootViewTag(int i) {
        this.f7478h = i;
    }
}
