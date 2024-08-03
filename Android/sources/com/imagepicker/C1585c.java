package com.imagepicker;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.imagepicker.p137b.C1584d;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.imagepicker.c */
/* loaded from: classes.dex */
public class C1585c implements C1584d.a {

    /* renamed from: a */
    final /* synthetic */ ImagePickerModule f5991a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1585c(ImagePickerModule imagePickerModule) {
        this.f5991a = imagePickerModule;
    }

    @Override // com.imagepicker.p137b.C1584d.a
    /* renamed from: a */
    public void mo6672a(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface) {
        ImagePickerModule imagePickerModule = weakReference.get();
        if (imagePickerModule == null) {
            return;
        }
        imagePickerModule.doOnCancel();
    }

    @Override // com.imagepicker.p137b.C1584d.a
    /* renamed from: b */
    public void mo6673b(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface) {
        ImagePickerModule imagePickerModule = weakReference.get();
        if (imagePickerModule == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", imagePickerModule.getContext().getPackageName(), null));
        Activity activity = imagePickerModule.getActivity();
        if (activity == null) {
            return;
        }
        activity.startActivityForResult(intent, 1);
    }
}
