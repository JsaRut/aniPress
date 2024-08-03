package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.C1552c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class JavaModuleWrapper {
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @InterfaceC2039a
    /* loaded from: classes.dex */
    public class MethodDescriptor {

        @InterfaceC2039a
        Method method;

        @InterfaceC2039a
        String name;

        @InterfaceC2039a
        String signature;

        @InterfaceC2039a
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @InterfaceC2039a
    private void findMethods() {
        C1550a.m6454a(0L, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (hashSet.contains(name)) {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                methodDescriptor.type = javaMethodWrapper.getType();
                if (methodDescriptor.type == BaseJavaModule.METHOD_TYPE_SYNC) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        C1550a.m6453a(0L);
    }

    @InterfaceC2039a
    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        C1552c.a m6467a = C1552c.m6467a(0L, "JavaModuleWrapper.getConstants");
        m6467a.mo6469a("moduleName", name);
        m6467a.mo6470a();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        C1550a.m6454a(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        C1550a.m6453a(0L);
        C1550a.m6454a(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C1552c.m6466a(0L).mo6470a();
        }
    }

    @InterfaceC2039a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @InterfaceC2039a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @InterfaceC2039a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @InterfaceC2039a
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
    }
}
