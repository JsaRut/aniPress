package com.facebook.react.modules.camera;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.camera.CameraRollManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.camera.b */
/* loaded from: classes.dex */
public class C1154b implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a */
    final /* synthetic */ CameraRollManager.AsyncTaskC1149b f4479a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1154b(CameraRollManager.AsyncTaskC1149b asyncTaskC1149b) {
        this.f4479a = asyncTaskC1149b;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(String str, Uri uri) {
        Promise promise;
        Promise promise2;
        if (uri != null) {
            promise2 = this.f4479a.f4463c;
            promise2.resolve(uri.toString());
        } else {
            promise = this.f4479a.f4463c;
            promise.reject("E_UNABLE_TO_SAVE", "Could not add image to gallery");
        }
    }
}
