package com.imagepicker;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.InterfaceC1167f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.imagepicker.a */
/* loaded from: classes.dex */
public class C1578a implements InterfaceC1167f {

    /* renamed from: a */
    final /* synthetic */ ImagePickerModule f5978a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1578a(ImagePickerModule imagePickerModule) {
        this.f5978a = imagePickerModule;
    }

    @Override // com.facebook.react.modules.core.InterfaceC1167f
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ReadableMap readableMap;
        ReadableMap readableMap2;
        ReadableMap readableMap3;
        C1598g c1598g;
        boolean z = true;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            z = z && (iArr[i2] == 0);
        }
        ImagePickerModule imagePickerModule = this.f5978a;
        if (imagePickerModule.callback != null) {
            readableMap = imagePickerModule.options;
            if (readableMap != null) {
                if (!z) {
                    c1598g = this.f5978a.responseHelper;
                    c1598g.m6707b(this.f5978a.callback, "Permissions weren't granted");
                    return false;
                }
                if (i == 14001) {
                    ImagePickerModule imagePickerModule2 = this.f5978a;
                    readableMap2 = imagePickerModule2.options;
                    imagePickerModule2.launchCamera(readableMap2, this.f5978a.callback);
                } else if (i == 14002) {
                    ImagePickerModule imagePickerModule3 = this.f5978a;
                    readableMap3 = imagePickerModule3.options;
                    imagePickerModule3.launchImageLibrary(readableMap3, this.f5978a.callback);
                }
                return true;
            }
        }
        return false;
    }
}
