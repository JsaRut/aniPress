package com.imagepicker.p138c;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.util.Log;

/* renamed from: com.imagepicker.c.b */
/* loaded from: classes.dex */
class C1587b implements MediaScannerConnection.OnScanCompletedListener {
    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(String str, Uri uri) {
        Log.i("TAG", "Finished scanning " + str);
    }
}
