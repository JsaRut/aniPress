package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.C1170i;
import com.facebook.react.uimanager.AbstractC1351j;
import com.facebook.react.uimanager.InterfaceC1327ea;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = NativeAnimatedModule.NAME)
/* loaded from: classes.dex */
public class NativeAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, InterfaceC1327ea {
    public static final String NAME = "NativeAnimatedModule";
    private final AbstractC1351j mAnimatedFrameCallback;
    private C1024H mNodesManager;
    private ArrayList<InterfaceC1031a> mOperations;
    private ArrayList<InterfaceC1031a> mPreOperations;
    private final C1170i mReactChoreographer;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1031a {
        /* renamed from: a */
        void mo5104a(C1024H c1024h);
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
        this.mPreOperations = new ArrayList<>();
        this.mReactChoreographer = C1170i.m5289a();
        this.mAnimatedFrameCallback = new C1056v(this, reactApplicationContext);
    }

    private void clearFrameCallback() {
        C1170i c1170i = this.mReactChoreographer;
        C2038a.m8318a(c1170i);
        c1170i.m5298b(C1170i.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        C1170i c1170i = this.mReactChoreographer;
        C2038a.m8318a(c1170i);
        c1170i.m5296a(C1170i.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1024H getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new C1024H((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class));
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void addAnimatedEventToView(int i, String str, ReadableMap readableMap) {
        this.mOperations.add(new C1057w(this, i, str, readableMap));
    }

    @ReactMethod
    public void connectAnimatedNodeToView(int i, int i2) {
        this.mOperations.add(new C1053s(this, i, i2));
    }

    @ReactMethod
    public void connectAnimatedNodes(int i, int i2) {
        this.mOperations.add(new C1051q(this, i, i2));
    }

    @ReactMethod
    public void createAnimatedNode(int i, ReadableMap readableMap) {
        this.mOperations.add(new C1017A(this, i, readableMap));
    }

    @ReactMethod
    public void disconnectAnimatedNodeFromView(int i, int i2) {
        this.mPreOperations.add(new C1054t(this, i, i2));
        this.mOperations.add(new C1055u(this, i, i2));
    }

    @ReactMethod
    public void disconnectAnimatedNodes(int i, int i2) {
        this.mOperations.add(new C1052r(this, i, i2));
    }

    @ReactMethod
    public void dropAnimatedNode(int i) {
        this.mOperations.add(new C1021E(this, i));
    }

    @ReactMethod
    public void extractAnimatedNodeOffset(int i) {
        this.mOperations.add(new C1048n(this, i));
    }

    @ReactMethod
    public void flattenAnimatedNodeOffset(int i) {
        this.mOperations.add(new C1047m(this, i));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @ReactMethod
    public void removeAnimatedEventFromView(int i, String str, int i2) {
        this.mOperations.add(new C1058x(this, i, str, i2));
    }

    @ReactMethod
    public void setAnimatedNodeOffset(int i, double d2) {
        this.mOperations.add(new C1046l(this, i, d2));
    }

    @ReactMethod
    public void setAnimatedNodeValue(int i, double d2) {
        this.mOperations.add(new C1022F(this, i, d2));
    }

    public void setNodesManager(C1024H c1024h) {
        this.mNodesManager = c1024h;
    }

    @ReactMethod
    public void startAnimatingNode(int i, int i2, ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new C1049o(this, i, i2, readableMap, callback));
    }

    @ReactMethod
    public void startListeningToAnimatedNodeValue(int i) {
        this.mOperations.add(new C1019C(this, i, new C1018B(this, i)));
    }

    @ReactMethod
    public void stopAnimation(int i) {
        this.mOperations.add(new C1050p(this, i));
    }

    @ReactMethod
    public void stopListeningToAnimatedNodeValue(int i) {
        this.mOperations.add(new C1020D(this, i));
    }

    @Override // com.facebook.react.uimanager.InterfaceC1327ea
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) {
            return;
        }
        ArrayList<InterfaceC1031a> arrayList = this.mPreOperations;
        ArrayList<InterfaceC1031a> arrayList2 = this.mOperations;
        this.mPreOperations = new ArrayList<>();
        this.mOperations = new ArrayList<>();
        uIManagerModule.prependUIBlock(new C1059y(this, arrayList));
        uIManagerModule.addUIBlock(new C1060z(this, arrayList2));
    }
}
