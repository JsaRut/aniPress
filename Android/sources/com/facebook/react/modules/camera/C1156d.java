package com.facebook.react.modules.camera;

import com.facebook.react.modules.camera.ImageEditingManager;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.react.modules.camera.d */
/* loaded from: classes.dex */
public class C1156d implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ ImageEditingManager.AsyncTaskC1150a f4480a;

    public C1156d(ImageEditingManager.AsyncTaskC1150a asyncTaskC1150a) {
        this.f4480a = asyncTaskC1150a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith("ReactNative_cropped_image_");
    }
}
