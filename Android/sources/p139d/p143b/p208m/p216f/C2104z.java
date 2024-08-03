package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.z */
/* loaded from: classes.dex */
class C2104z implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7583a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7584b;

    public C2104z(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7584b = c2078b;
        this.f7583a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new DatePickerDialogModule(this.f7583a);
    }
}
