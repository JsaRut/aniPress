package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: d.b.m.h */
/* loaded from: classes.dex */
class C2110h implements Iterator<ModuleHolder> {

    /* renamed from: a */
    int f7587a = 0;

    /* renamed from: b */
    final /* synthetic */ C2112i f7588b;

    public C2110h(C2112i c2112i) {
        this.f7588b = c2112i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7587a < this.f7588b.f7589a.size();
    }

    @Override // java.util.Iterator
    public ModuleHolder next() {
        List list = this.f7588b.f7589a;
        int i = this.f7587a;
        this.f7587a = i + 1;
        ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
        String name = moduleSpec.getName();
        ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.f7588b.f7590b.get(name);
        if (reactModuleInfo != null) {
            return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
        }
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
        try {
            NativeModule nativeModule = moduleSpec.getProvider().get();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
            return new ModuleHolder(nativeModule);
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
            throw th;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
}
