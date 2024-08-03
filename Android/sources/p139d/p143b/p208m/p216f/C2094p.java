package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.p */
/* loaded from: classes.dex */
class C2094p implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7563a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7564b;

    public C2094p(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7564b = c2078b;
        this.f7563a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new TimePickerDialogModule(this.f7563a);
    }
}
