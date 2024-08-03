package com.facebook.react.bridge;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.systrace.C1552c;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import p139d.p143b.p162e.p165b.C1747c;
import p139d.p143b.p162e.p166c.C1748a;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;
import p139d.p143b.p208m.p218h.p219a.p220a.InterfaceC2111a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), InterfaceC2111a.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        C1747c.m7161a().mo7159a(C1748a.f6324e, "NativeModule init: %s", this.mName);
    }

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.m5249f();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.m5250g()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z = true;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        C1552c.a m6467a = C1552c.m6467a(0L, "ModuleHolder.createModule");
        m6467a.mo6469a("name", this.mName);
        m6467a.mo6470a();
        C1747c.m7161a().mo7159a(C1748a.f6324e, "NativeModule init: %s", this.mName);
        try {
            Provider<? extends NativeModule> provider = this.mProvider;
            C2038a.m8318a(provider);
            NativeModule nativeModule = provider.get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = nativeModule;
                if (!this.mInitializable || this.mIsInitializing) {
                    z = false;
                }
            }
            if (z) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
            C1552c.m6466a(0L).mo6470a();
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        C1552c.a m6467a = C1552c.m6467a(0L, "ModuleHolder.initialize");
        m6467a.mo6469a("name", this.mName);
        m6467a.mo6470a();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                z = true;
                if (!this.mInitializable || this.mIsInitializing) {
                    z = false;
                } else {
                    this.mIsInitializing = true;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            C1552c.m6466a(0L).mo6470a();
        }
    }

    public synchronized void destroy() {
        if (this.mModule != null) {
            this.mModule.onCatalystInstanceDestroy();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.m5244a();
    }

    public String getClassName() {
        return this.mReactModuleInfo.m5245b();
    }

    public boolean getHasConstants() {
        return this.mReactModuleInfo.m5246c();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @InterfaceC2039a
    public NativeModule getModule() {
        NativeModule nativeModule;
        synchronized (this) {
            if (this.mModule != null) {
                return this.mModule;
            }
            boolean z = true;
            if (this.mIsCreating) {
                z = false;
            } else {
                this.mIsCreating = true;
            }
            if (z) {
                NativeModule create = create();
                synchronized (this) {
                    this.mIsCreating = false;
                    notifyAll();
                }
                return create;
            }
            synchronized (this) {
                while (this.mModule == null && this.mIsCreating) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                NativeModule nativeModule2 = this.mModule;
                C2038a.m8318a(nativeModule2);
                nativeModule = nativeModule2;
            }
            return nativeModule;
        }
    }

    @InterfaceC2039a
    public String getName() {
        return this.mName;
    }

    public synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.m5247d();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.m5248e();
    }

    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            if (this.mModule != null) {
                C2038a.m8320a(this.mIsInitializing ? false : true);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z = false;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }
}
