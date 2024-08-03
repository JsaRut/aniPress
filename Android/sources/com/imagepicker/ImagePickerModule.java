package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v4.app.C0191b;
import android.support.v7.app.DialogInterfaceC0333l;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.InterfaceC1166e;
import com.facebook.react.modules.core.InterfaceC1167f;
import com.imagepicker.p136a.C1579a;
import com.imagepicker.p137b.C1584d;
import com.imagepicker.p137b.InterfaceC1581a;
import com.imagepicker.p138c.C1588c;
import com.imagepicker.p138c.C1590e;
import com.imagepicker.p138c.C1594i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import p000a.p005b.p009c.p010a.C0022a;
import p139d.p143b.p208m.AbstractActivityC2126q;

/* loaded from: classes.dex */
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_IMAGE_LIBRARY = 13002;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13004;
    public static final int REQUEST_LAUNCH_VIDEO_LIBRARY = 13003;
    public static final int REQUEST_PERMISSIONS_FOR_CAMERA = 14001;
    public static final int REQUEST_PERMISSIONS_FOR_LIBRARY = 14002;
    protected Callback callback;
    protected Uri cameraCaptureURI;
    private final int dialogThemeId;
    private C1579a imageConfig;
    private InterfaceC1167f listener;
    private Boolean noData;
    private ReadableMap options;
    private Boolean pickVideo;
    private final ReactApplicationContext reactContext;
    private C1598g responseHelper;

    @Deprecated
    private int videoDurationLimit;

    @Deprecated
    private int videoQuality;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext, int i) {
        super(reactApplicationContext);
        this.noData = false;
        this.pickVideo = false;
        this.imageConfig = new C1579a(null, null, 0, 0, 100, 0, false);
        this.videoQuality = 1;
        this.videoDurationLimit = 0;
        this.responseHelper = new C1598g();
        this.listener = new C1578a(this);
        this.dialogThemeId = i;
        this.reactContext = reactApplicationContext;
        this.reactContext.addActivityEventListener(this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private File createFileFromURI(Uri uri) {
        File file = new File(this.reactContext.getExternalCacheDir(), "photo-" + uri.getLastPathSegment());
        InputStream openInputStream = this.reactContext.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    return file;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } finally {
            fileOutputStream.close();
            openInputStream.close();
        }
    }

    private String getBase64StringFromFile(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            fileInputStream = null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private String getRealPathFromURI(Uri uri) {
        return C1590e.m6693b(this.reactContext, uri);
    }

    private boolean isCameraAvailable() {
        return this.reactContext.getPackageManager().hasSystemFeature("android.hardware.camera") || this.reactContext.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    private void parseOptions(ReadableMap readableMap) {
        this.noData = false;
        if (readableMap.hasKey("noData")) {
            this.noData = Boolean.valueOf(readableMap.getBoolean("noData"));
        }
        this.imageConfig = this.imageConfig.m6660a(readableMap);
        this.pickVideo = false;
        if (readableMap.hasKey("mediaType") && readableMap.getString("mediaType").equals("video")) {
            this.pickVideo = true;
        }
        this.videoQuality = 1;
        if (readableMap.hasKey("videoQuality") && readableMap.getString("videoQuality").equals("low")) {
            this.videoQuality = 0;
        }
        this.videoDurationLimit = 0;
        if (readableMap.hasKey("durationLimit")) {
            this.videoDurationLimit = readableMap.getInt("durationLimit");
        }
    }

    private boolean passResult(int i) {
        return this.callback == null || (this.cameraCaptureURI == null && i == 13001) || !(i == 13001 || i == 13002 || i == 13003 || i == 13004);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean permissionsCheck(Activity activity, Callback callback, int i) {
        if (C0022a.m87a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && C0022a.m87a(activity, "android.permission.CAMERA") == 0) {
            return true;
        }
        if (Boolean.valueOf(C0191b.m849a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") && C0191b.m849a(activity, "android.permission.CAMERA")).booleanValue()) {
            DialogInterfaceC0333l m6671a = C1584d.m6671a(this, this.options, new C1585c(this));
            if (m6671a != null) {
                m6671a.show();
            }
            return false;
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
        if (activity instanceof AbstractActivityC2126q) {
            ((AbstractActivityC2126q) activity).mo5286a(strArr, i, this.listener);
        } else if (activity instanceof InterfaceC1166e) {
            ((InterfaceC1166e) activity).mo5286a(strArr, i, this.listener);
        } else {
            if (!(activity instanceof InterfaceC1581a)) {
                throw new UnsupportedOperationException(activity.getClass().getSimpleName() + " must implement " + InterfaceC1581a.class.getSimpleName() + " or " + InterfaceC1166e.class.getSimpleName());
            }
            ((InterfaceC1581a) activity).m6670a(this.listener);
            C0191b.m848a(activity, strArr, i);
        }
        return false;
    }

    private void putExtraFileInfo(String str, C1598g c1598g) {
        try {
            File file = new File(str);
            c1598g.m6702a("fileSize", file.length());
            c1598g.m6704a("fileName", file.getName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            c1598g.m6704a("type", MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl));
        }
    }

    private void updatedResultResponse(Uri uri, String str) {
        this.responseHelper.m6704a("uri", uri.toString());
        this.responseHelper.m6704a("path", str);
        if (!this.noData.booleanValue()) {
            this.responseHelper.m6704a("data", getBase64StringFromFile(str));
        }
        putExtraFileInfo(str, this.responseHelper);
    }

    public void doOnCancel() {
        Callback callback = this.callback;
        if (callback != null) {
            this.responseHelper.m6700a(callback);
            this.callback = null;
        }
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getContext() {
        return getReactApplicationContext();
    }

    public int getDialogThemeId() {
        return this.dialogThemeId;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImagePickerManager";
    }

    public void invokeCustomButton(String str) {
        this.responseHelper.m6701a(this.callback, str);
    }

    public void launchCamera() {
        launchCamera(this.options, this.callback);
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback) {
        int i;
        Intent intent;
        if (!isCameraAvailable()) {
            this.responseHelper.m6707b(callback, "Camera not available");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            this.responseHelper.m6707b(callback, "can't find current Activity");
            return;
        }
        this.callback = callback;
        this.options = readableMap;
        if (permissionsCheck(currentActivity, callback, REQUEST_PERMISSIONS_FOR_CAMERA)) {
            parseOptions(this.options);
            if (this.pickVideo.booleanValue()) {
                i = REQUEST_LAUNCH_VIDEO_CAPTURE;
                intent = new Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("android.intent.extra.videoQuality", this.videoQuality);
                int i2 = this.videoDurationLimit;
                if (i2 > 0) {
                    intent.putExtra("android.intent.extra.durationLimit", i2);
                }
            } else {
                i = REQUEST_LAUNCH_IMAGE_CAPTURE;
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                this.imageConfig = this.imageConfig.m6661a(C1588c.m6682a(this.reactContext, this.options, false));
                File file = this.imageConfig.f5979a;
                if (file == null) {
                    this.responseHelper.m6707b(callback, "Couldn't get file path for photo");
                    return;
                }
                this.cameraCaptureURI = C1590e.m6689a(this.reactContext, file);
                Uri uri = this.cameraCaptureURI;
                if (uri == null) {
                    this.responseHelper.m6707b(callback, "Couldn't get file path for photo");
                    return;
                }
                intent.putExtra("output", uri);
            }
            if (intent.resolveActivity(this.reactContext.getPackageManager()) == null) {
                this.responseHelper.m6707b(callback, "Cannot launch camera");
                return;
            }
            if (Build.VERSION.SDK_INT <= 19) {
                Iterator<ResolveInfo> it = this.reactContext.getPackageManager().queryIntentActivities(intent, 65536).iterator();
                while (it.hasNext()) {
                    this.reactContext.grantUriPermission(it.next().activityInfo.packageName, this.cameraCaptureURI, 3);
                }
            }
            try {
                currentActivity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
                this.responseHelper.m6707b(callback, "Cannot launch camera");
            }
        }
    }

    public void launchImageLibrary() {
        launchImageLibrary(this.options, this.callback);
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback) {
        int i;
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            this.responseHelper.m6707b(callback, "can't find current Activity");
            return;
        }
        this.callback = callback;
        this.options = readableMap;
        if (permissionsCheck(currentActivity, callback, REQUEST_PERMISSIONS_FOR_LIBRARY)) {
            parseOptions(this.options);
            if (this.pickVideo.booleanValue()) {
                i = REQUEST_LAUNCH_VIDEO_LIBRARY;
                intent = new Intent("android.intent.action.PICK");
                intent.setType("video/*");
            } else {
                i = REQUEST_LAUNCH_IMAGE_LIBRARY;
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }
            if (intent.resolveActivity(this.reactContext.getPackageManager()) == null) {
                this.responseHelper.m6707b(callback, "Cannot launch photo library");
                return;
            }
            try {
                currentActivity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
                this.responseHelper.m6707b(callback, "Cannot launch photo library");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b4  */
    @Override // com.facebook.react.bridge.ActivityEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(android.app.Activity r10, int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.imagepicker.ImagePickerModule.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void showImagePicker(ReadableMap readableMap, Callback callback) {
        if (getCurrentActivity() == null) {
            this.responseHelper.m6707b(callback, "can't find current Activity");
            return;
        }
        this.callback = callback;
        this.options = readableMap;
        this.imageConfig = new C1579a(null, null, 0, 0, 100, 0, false);
        C1594i.m6698a(this, readableMap, new C1580b(this)).show();
    }
}
