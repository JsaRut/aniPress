package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ImageEditingManager.NAME)
/* loaded from: classes.dex */
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final int COMPRESS_QUALITY = 90;
    protected static final String NAME = "ImageEditingManager";
    private static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList("file://", "content://");

    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.camera.ImageEditingManager$a */
    /* loaded from: classes.dex */
    public static class AsyncTaskC1150a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f4464a;

        private AsyncTaskC1150a(ReactContext reactContext) {
            super(reactContext);
            this.f4464a = reactContext;
        }

        /* renamed from: a */
        private void m5263a(File file) {
            File[] listFiles = file.listFiles(new C1156d(this));
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            m5263a(this.f4464a.getCacheDir());
            File externalCacheDir = this.f4464a.getExternalCacheDir();
            if (externalCacheDir != null) {
                m5263a(externalCacheDir);
            }
        }
    }

    /* renamed from: com.facebook.react.modules.camera.ImageEditingManager$b */
    /* loaded from: classes.dex */
    private static class AsyncTaskC1151b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final Context f4465a;

        /* renamed from: b */
        final String f4466b;

        /* renamed from: c */
        final int f4467c;

        /* renamed from: d */
        final int f4468d;

        /* renamed from: e */
        final int f4469e;

        /* renamed from: f */
        final int f4470f;

        /* renamed from: g */
        int f4471g;

        /* renamed from: h */
        int f4472h;

        /* renamed from: i */
        final Callback f4473i;

        /* renamed from: j */
        final Callback f4474j;

        private AsyncTaskC1151b(ReactContext reactContext, String str, int i, int i2, int i3, int i4, Callback callback, Callback callback2) {
            super(reactContext);
            this.f4471g = 0;
            this.f4472h = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.f4465a = reactContext;
            this.f4466b = str;
            this.f4467c = i;
            this.f4468d = i2;
            this.f4469e = i3;
            this.f4470f = i4;
            this.f4473i = callback;
            this.f4474j = callback2;
        }

        /* renamed from: a */
        private Bitmap m5265a(int i, int i2, BitmapFactory.Options options) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            C2038a.m8318a(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            InputStream m5267a = m5267a();
            try {
                BitmapFactory.decodeStream(m5267a, null, options2);
                if (m5267a != null) {
                    m5267a.close();
                }
                int i3 = this.f4469e;
                int i4 = this.f4470f;
                float f6 = i;
                float f7 = i2;
                float f8 = f6 / f7;
                if (i3 / i4 > f8) {
                    f = i4 * f8;
                    f3 = i4;
                    f2 = this.f4467c + ((i3 - f) / 2.0f);
                    f5 = this.f4468d;
                    f4 = f7 / i4;
                } else {
                    f = i3;
                    float f9 = i3 / f8;
                    f2 = this.f4467c;
                    float f10 = (i4 - f9) / 2.0f;
                    float f11 = f6 / i3;
                    f3 = f9;
                    f4 = f11;
                    f5 = f10 + this.f4468d;
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.f4469e, this.f4470f, i, i2);
                options2.inJustDecodeBounds = false;
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(m5267a(), null, options);
                    if (decodeStream == null) {
                        throw new IOException("Cannot decode bitmap: " + this.f4466b);
                    }
                    int floor = (int) Math.floor(f2 / options.inSampleSize);
                    int floor2 = (int) Math.floor(f5 / options.inSampleSize);
                    int floor3 = (int) Math.floor(f / options.inSampleSize);
                    int floor4 = (int) Math.floor(f3 / options.inSampleSize);
                    float f12 = f4 * options.inSampleSize;
                    Matrix matrix = new Matrix();
                    matrix.setScale(f12, f12);
                    return Bitmap.createBitmap(decodeStream, floor, floor2, floor3, floor4, matrix, true);
                } finally {
                }
            } finally {
                if (m5267a != null) {
                    m5267a.close();
                }
                throw th;
            }
        }

        /* renamed from: a */
        private Bitmap m5266a(BitmapFactory.Options options) {
            InputStream m5267a = m5267a();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(m5267a, false);
            try {
                return newInstance.decodeRegion(new Rect(this.f4467c, this.f4468d, this.f4467c + this.f4469e, this.f4468d + this.f4470f), options);
            } finally {
                if (m5267a != null) {
                    m5267a.close();
                }
                newInstance.recycle();
            }
        }

        /* renamed from: a */
        private InputStream m5267a() {
            InputStream openInputStream = ImageEditingManager.isLocalUri(this.f4466b) ? this.f4465a.getContentResolver().openInputStream(Uri.parse(this.f4466b)) : new URL(this.f4466b).openConnection().getInputStream();
            if (openInputStream != null) {
                return openInputStream;
            }
            throw new IOException("Cannot open bitmap: " + this.f4466b);
        }

        /* renamed from: a */
        public void m5268a(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f4471g = i;
            this.f4472h = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                Bitmap m5265a = this.f4471g > 0 && this.f4472h > 0 ? m5265a(this.f4471g, this.f4472h, options) : m5266a(options);
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                File createTempFile = ImageEditingManager.createTempFile(this.f4465a, str);
                ImageEditingManager.writeCompressedBitmapToFile(m5265a, str, createTempFile);
                if (str.equals("image/jpeg")) {
                    ImageEditingManager.copyExif(this.f4465a, Uri.parse(this.f4466b), createTempFile);
                }
                this.f4473i.invoke(Uri.fromFile(createTempFile).toString());
            } catch (Exception e2) {
                this.f4474j.invoke(e2.getMessage());
            }
        }
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new AsyncTaskC1150a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copyExif(Context context, Uri uri, File file) {
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            C1700a.m7015d("ReactNative", "Couldn't get real path for uri: " + uri);
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        for (String str : EXIF_ATTRIBUTES) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File createTempFile(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile(TEMP_FILE_PREFIX, getFileExtensionForType(str), externalCacheDir);
    }

    private static Bitmap.CompressFormat getCompressFormatForType(String str) {
        return "image/png".equals(str) ? Bitmap.CompressFormat.PNG : "image/webp".equals(str) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static String getFileExtensionForType(String str) {
        return "image/png".equals(str) ? ".png" : "image/webp".equals(str) ? ".webp" : ".jpg";
    }

    private static File getFileFromUri(Context context, Uri uri) {
        Cursor query;
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals("content") || (query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
            }
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLocalUri(String str) {
        Iterator<String> it = LOCAL_URI_PREFIXES.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        ReadableMap map = readableMap.hasKey("offset") ? readableMap.getMap("offset") : null;
        ReadableMap map2 = readableMap.hasKey("size") ? readableMap.getMap("size") : null;
        if (map == null || map2 == null || !map.hasKey("x") || !map.hasKey("y") || !map2.hasKey("width") || !map2.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        }
        if (str == null || str.isEmpty()) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        }
        AsyncTaskC1151b asyncTaskC1151b = new AsyncTaskC1151b(getReactApplicationContext(), str, (int) map.getDouble("x"), (int) map.getDouble("y"), (int) map2.getDouble("width"), (int) map2.getDouble("height"), callback, callback2);
        if (readableMap.hasKey("displaySize")) {
            ReadableMap map3 = readableMap.getMap("displaySize");
            asyncTaskC1151b.m5268a((int) map3.getDouble("width"), (int) map3.getDouble("height"));
        }
        asyncTaskC1151b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        new AsyncTaskC1150a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
