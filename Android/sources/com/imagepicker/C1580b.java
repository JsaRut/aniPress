package com.imagepicker;

import com.imagepicker.p138c.C1594i;

/* renamed from: com.imagepicker.b */
/* loaded from: classes.dex */
class C1580b implements C1594i.a {

    /* renamed from: a */
    final /* synthetic */ ImagePickerModule f5986a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1580b(ImagePickerModule imagePickerModule) {
        this.f5986a = imagePickerModule;
    }

    @Override // com.imagepicker.p138c.C1594i.a
    /* renamed from: a */
    public void mo6666a(ImagePickerModule imagePickerModule) {
        if (imagePickerModule == null) {
            return;
        }
        imagePickerModule.doOnCancel();
    }

    @Override // com.imagepicker.p138c.C1594i.a
    /* renamed from: a */
    public void mo6667a(ImagePickerModule imagePickerModule, String str) {
        if (imagePickerModule == null) {
            return;
        }
        imagePickerModule.invokeCustomButton(str);
    }

    @Override // com.imagepicker.p138c.C1594i.a
    /* renamed from: b */
    public void mo6668b(ImagePickerModule imagePickerModule) {
        if (imagePickerModule == null) {
            return;
        }
        imagePickerModule.launchImageLibrary();
    }

    @Override // com.imagepicker.p138c.C1594i.a
    /* renamed from: c */
    public void mo6669c(ImagePickerModule imagePickerModule) {
        if (imagePickerModule == null) {
            return;
        }
        imagePickerModule.launchCamera();
    }
}
