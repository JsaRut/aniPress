package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.jsi.Binding;
import com.facebook.react.fabric.jsi.C1128b;
import com.facebook.react.fabric.jsi.EventBeatManager;
import com.facebook.react.fabric.jsi.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.C1129a;
import com.facebook.react.fabric.mounting.mountitems.C1130b;
import com.facebook.react.fabric.mounting.mountitems.C1131c;
import com.facebook.react.fabric.mounting.mountitems.C1132d;
import com.facebook.react.fabric.mounting.mountitems.C1134f;
import com.facebook.react.fabric.mounting.mountitems.C1135g;
import com.facebook.react.fabric.mounting.mountitems.C1136h;
import com.facebook.react.fabric.mounting.mountitems.C1137i;
import com.facebook.react.fabric.mounting.mountitems.C1138j;
import com.facebook.react.fabric.mounting.mountitems.C1139k;
import com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e;
import com.facebook.react.fabric.p125a.C1123a;
import com.facebook.react.fabric.p125a.C1124b;
import com.facebook.react.modules.core.C1170i;
import com.facebook.react.uimanager.C1268D;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1360na;
import com.facebook.react.uimanager.common.InterfaceC1321a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.systrace.C1550a;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@SuppressLint({"MissingNativeLoadLibrary"})
/* renamed from: com.facebook.react.fabric.b */
/* loaded from: classes.dex */
public class C1125b implements UIManager, LifecycleEventListener {

    /* renamed from: a */
    private static final Map<String, String> f4386a = new HashMap();

    /* renamed from: b */
    private Binding f4387b;

    /* renamed from: c */
    private final ReactApplicationContext f4388c;

    /* renamed from: d */
    private final C1124b f4389d;

    /* renamed from: e */
    private final C1333f f4390e;

    /* renamed from: f */
    private final ConcurrentHashMap<Integer, C1278N> f4391f;

    /* renamed from: g */
    private final EventBeatManager f4392g;

    /* renamed from: h */
    private final Object f4393h;

    /* renamed from: i */
    private final Object f4394i;

    /* renamed from: j */
    private List<InterfaceC1133e> f4395j;

    /* renamed from: k */
    private List<InterfaceC1133e> f4396k;

    /* renamed from: l */
    private final a f4397l;

    /* renamed from: m */
    private boolean f4398m;

    /* renamed from: n */
    private long f4399n;

    /* renamed from: o */
    private long f4400o;

    /* renamed from: p */
    private long f4401p;

    /* renamed from: q */
    private long f4402q;

    /* renamed from: r */
    private long f4403r;

    /* renamed from: s */
    private long f4404s;

    /* renamed from: t */
    private long f4405t;

    /* renamed from: com.facebook.react.fabric.b$a */
    /* loaded from: classes.dex */
    private class a extends AbstractC1126c {
    }

    static {
        C1128b.m5242a();
        f4386a.put("View", ReactViewManager.REACT_CLASS);
        f4386a.put("Image", ReactImageManager.REACT_CLASS);
        f4386a.put("ScrollView", ReactScrollViewManager.REACT_CLASS);
        f4386a.put("ReactPerformanceLoggerFlag", "ReactPerformanceLoggerFlag");
        f4386a.put("Paragraph", ReactTextViewManager.REACT_CLASS);
        f4386a.put("Text", "RCText");
        f4386a.put("RawText", ReactRawTextManager.REACT_CLASS);
        f4386a.put("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS);
        f4386a.put("ShimmeringView", "RKShimmeringView");
        f4386a.put("TemplateView", "RCTTemplateView");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m5236a() {
        List<InterfaceC1133e> list;
        List<InterfaceC1133e> list2;
        if (!this.f4398m) {
            C1700a.m7015d("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        try {
            synchronized (this.f4394i) {
                list = this.f4396k;
                this.f4396k = new ArrayList();
            }
            this.f4399n = SystemClock.uptimeMillis();
            synchronized (this.f4393h) {
                list2 = this.f4395j;
                this.f4395j = new ArrayList();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            C1550a.m6454a(0L, "FabricUIManager::premountViews (" + list.size() + " batches)");
            Iterator<InterfaceC1133e> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo5243a(this.f4389d);
            }
            this.f4401p = SystemClock.uptimeMillis() - uptimeMillis;
            C1550a.m6453a(0L);
            C1550a.m6454a(0L, "FabricUIManager::mountViews (" + list2.size() + " batches)");
            long uptimeMillis2 = SystemClock.uptimeMillis();
            Iterator<InterfaceC1133e> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().mo5243a(this.f4389d);
            }
            this.f4400o = SystemClock.uptimeMillis() - uptimeMillis2;
            C1550a.m6453a(0L);
        } catch (Exception e2) {
            C1700a.m6998a("ReactNative", "Exception thrown when executing UIFrameGuarded", e2);
            this.f4398m = false;
            throw e2;
        }
    }

    @InterfaceC2039a
    private InterfaceC1133e createBatchMountItem(InterfaceC1133e[] interfaceC1133eArr, int i) {
        return new BatchMountItem(interfaceC1133eArr, i);
    }

    @InterfaceC2039a
    private InterfaceC1133e createMountItem(String str, int i, int i2, boolean z) {
        String str2 = f4386a.get(str);
        if (str2 == null) {
            throw new IllegalArgumentException("Unable to find component with name " + str);
        }
        C1278N c1278n = this.f4391f.get(Integer.valueOf(i));
        if (c1278n != null) {
            return new C1129a(c1278n, str2, i2, z);
        }
        throw new IllegalArgumentException("Unable to find ReactContext for root: " + i);
    }

    @InterfaceC2039a
    private InterfaceC1133e deleteMountItem(int i) {
        return new C1130b(i);
    }

    @InterfaceC2039a
    private InterfaceC1133e insertMountItem(int i, int i2, int i3) {
        return new C1132d(i, i2, i3);
    }

    @InterfaceC2039a
    private long measure(String str, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, int i, int i2, int i3, int i4) {
        C1124b c1124b = this.f4389d;
        ReactApplicationContext reactApplicationContext = this.f4388c;
        float f = i;
        float f2 = i2;
        float m5219b = C1123a.m5219b(f, f2);
        YogaMeasureMode m5218a = C1123a.m5218a(f, f2);
        float f3 = i3;
        float f4 = i4;
        c1124b.m5221a(reactApplicationContext, str, readableNativeMap, readableNativeMap2, m5219b, m5218a, C1123a.m5219b(f3, f4), C1123a.m5218a(f3, f4));
        throw null;
    }

    @InterfaceC2039a
    private void preallocateView(int i, String str) {
        if (UiThreadUtil.isOnUiThread()) {
            return;
        }
        synchronized (this.f4394i) {
            C1278N c1278n = this.f4391f.get(Integer.valueOf(i));
            C2038a.m8318a(c1278n);
            String str2 = f4386a.get(str);
            C2038a.m8318a(str2);
            this.f4396k.add(new C1134f(c1278n, i, str2));
        }
    }

    @InterfaceC2039a
    private InterfaceC1133e removeMountItem(int i, int i2, int i3) {
        return new C1135g(i, i2, i3);
    }

    @InterfaceC2039a
    private void scheduleMountItems(InterfaceC1133e interfaceC1133e, long j, long j2, long j3) {
        this.f4403r = j;
        this.f4404s = j2;
        this.f4405t = SystemClock.uptimeMillis() - j3;
        this.f4402q = SystemClock.uptimeMillis();
        synchronized (this.f4393h) {
            this.f4395j.add(interfaceC1133e);
        }
        if (UiThreadUtil.isOnUiThread()) {
            m5236a();
        }
    }

    @InterfaceC2039a
    private InterfaceC1133e updateEventEmitterMountItem(int i, Object obj) {
        return new C1136h(i, (EventEmitterWrapper) obj);
    }

    @InterfaceC2039a
    private InterfaceC1133e updateLayoutMountItem(int i, int i2, int i3, int i4, int i5) {
        return new C1137i(i, i2, i3, i4, i5);
    }

    @InterfaceC2039a
    private InterfaceC1133e updateLocalDataMountItem(int i, ReadableNativeMap readableNativeMap) {
        return new C1138j(i, readableNativeMap);
    }

    @InterfaceC2039a
    private InterfaceC1133e updatePropsMountItem(int i, ReadableNativeMap readableNativeMap) {
        return new C1139k(i, readableNativeMap);
    }

    /* renamed from: a */
    public void m5237a(int i, String str, WritableMap writableMap) {
        this.f4389d.m5232b(i);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends SizeMonitoringFrameLayout & InterfaceC1321a> int addRootView(T t, WritableMap writableMap, String str) {
        int m5474a = C1268D.m5474a();
        new C1278N(this.f4388c, t.getContext());
        this.f4389d.m5229a(m5474a, t);
        throw null;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void clearJSResponder() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        synchronized (this.f4393h) {
            this.f4395j.add(new C1131c(i, i2, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f4403r));
        hashMap.put("LayoutTime", Long.valueOf(this.f4404s));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f4402q));
        hashMap.put("RunStartTime", Long.valueOf(this.f4399n));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f4400o));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f4401p));
        hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.f4405t));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
        this.f4390e.m5751a(2, new FabricEventEmitter(this));
        this.f4390e.m5752a(this.f4392g);
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        this.f4390e.m5756b(this.f4392g);
        this.f4390e.m5750a(2);
        this.f4387b.m5238a();
        C1360na.m5858a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        C1170i.m5289a().m5298b(C1170i.a.DISPATCH_UI, this.f4397l);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        C1170i.m5289a().m5296a(C1170i.a.DISPATCH_UI, this.f4397l);
    }

    @InterfaceC2039a
    public void onRequestEventBeat() {
        this.f4390e.m5755b();
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeRootView(int i) {
        this.f4389d.m5234c(i);
        throw null;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void setJSResponder(int i, boolean z) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        ReactApplicationContext reactApplicationContext = this.f4388c;
        reactApplicationContext.runOnJSQueueThread(new C1122a(this, reactApplicationContext, i, i2, i3));
    }
}
