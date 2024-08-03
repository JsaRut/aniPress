package com.facebook.react.modules.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = "ImageStoreManager")
/* loaded from: classes.dex */
public class ImageStoreManager extends ReactContextBaseJavaModule {
    private static final int BUFFER_SIZE = 8192;

    /* renamed from: com.facebook.react.modules.camera.ImageStoreManager$a */
    /* loaded from: classes.dex */
    private class AsyncTaskC1152a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final String f4475a;

        /* renamed from: b */
        private final Callback f4476b;

        /* renamed from: c */
        private final Callback f4477c;

        private AsyncTaskC1152a(ReactContext reactContext, String str, Callback callback, Callback callback2) {
            super(reactContext);
            this.f4475a = str;
            this.f4476b = callback;
            this.f4477c = callback2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                InputStream openInputStream = ImageStoreManager.this.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.f4475a));
                try {
                    try {
                        this.f4476b.invoke(ImageStoreManager.this.convertInputStreamToBase64OutputStream(openInputStream));
                    } catch (IOException e2) {
                        this.f4477c.invoke(e2.getMessage());
                    }
                } finally {
                    ImageStoreManager.closeQuietly(openInputStream);
                }
            } catch (FileNotFoundException e3) {
                this.f4477c.invoke(e3.getMessage());
            }
        }
    }

    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    String convertInputStreamToBase64OutputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[BUFFER_SIZE];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= -1) {
                    closeQuietly(base64OutputStream);
                    return byteArrayOutputStream.toString();
                }
                base64OutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                closeQuietly(base64OutputStream);
                throw th;
            }
        }
    }

    @ReactMethod
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        new AsyncTaskC1152a(getReactApplicationContext(), str, callback, callback2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageStoreManager";
    }
}
