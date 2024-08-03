package com.facebook.react.modules.permissions;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.InterfaceC1166e;
import java.util.ArrayList;

/* renamed from: com.facebook.react.modules.permissions.b */
/* loaded from: classes.dex */
class C1236b implements Callback {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4662a;

    /* renamed from: b */
    final /* synthetic */ WritableMap f4663b;

    /* renamed from: c */
    final /* synthetic */ Promise f4664c;

    /* renamed from: d */
    final /* synthetic */ PermissionsModule f4665d;

    public C1236b(PermissionsModule permissionsModule, ArrayList arrayList, WritableMap writableMap, Promise promise) {
        this.f4665d = permissionsModule;
        this.f4662a = arrayList;
        this.f4663b = writableMap;
        this.f4664c = promise;
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        WritableMap writableMap;
        String str;
        int[] iArr = (int[]) objArr[0];
        InterfaceC1166e interfaceC1166e = (InterfaceC1166e) objArr[1];
        for (int i = 0; i < this.f4662a.size(); i++) {
            String str2 = (String) this.f4662a.get(i);
            if (iArr.length > 0 && iArr[i] == 0) {
                writableMap = this.f4663b;
                str = "granted";
            } else if (interfaceC1166e.shouldShowRequestPermissionRationale(str2)) {
                writableMap = this.f4663b;
                str = "denied";
            } else {
                writableMap = this.f4663b;
                str = "never_ask_again";
            }
            writableMap.putString(str2, str);
        }
        this.f4664c.resolve(this.f4663b);
    }
}
