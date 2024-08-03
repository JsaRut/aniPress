package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import com.facebook.react.module.model.InterfaceC1141a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.f */
/* loaded from: classes.dex */
public class C2076f extends AbstractC2114j {
    @Override // p139d.p143b.p208m.AbstractC2114j
    /* renamed from: a */
    public InterfaceC1141a mo8444a() {
        return AbstractC2114j.m8454a(this);
    }

    @Override // p139d.p143b.p208m.AbstractC2114j
    /* renamed from: d */
    public List<ModuleSpec> mo8445d(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) JSCHeapCapture.class, new C2072d(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) JSCSamplingProfiler.class, new C2074e(this, reactApplicationContext)));
        return arrayList;
    }
}
