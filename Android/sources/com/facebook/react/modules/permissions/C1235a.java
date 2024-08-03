package com.facebook.react.modules.permissions;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.core.InterfaceC1166e;

/* renamed from: com.facebook.react.modules.permissions.a */
/* loaded from: classes.dex */
class C1235a implements Callback {

    /* renamed from: a */
    final /* synthetic */ Promise f4659a;

    /* renamed from: b */
    final /* synthetic */ String f4660b;

    /* renamed from: c */
    final /* synthetic */ PermissionsModule f4661c;

    public C1235a(PermissionsModule permissionsModule, Promise promise, String str) {
        this.f4661c = permissionsModule;
        this.f4659a = promise;
        this.f4660b = str;
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        Promise promise;
        String str;
        int[] iArr = (int[]) objArr[0];
        if (iArr.length > 0 && iArr[0] == 0) {
            promise = this.f4659a;
            str = "granted";
        } else if (((InterfaceC1166e) objArr[1]).shouldShowRequestPermissionRationale(this.f4660b)) {
            promise = this.f4659a;
            str = "denied";
        } else {
            promise = this.f4659a;
            str = "never_ask_again";
        }
        promise.resolve(str);
    }
}
