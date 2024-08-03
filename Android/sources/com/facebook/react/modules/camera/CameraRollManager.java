package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = CameraRollManager.NAME)
/* loaded from: classes.dex */
public class CameraRollManager extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final String NAME = "CameraRollManager";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";

    /* renamed from: com.facebook.react.modules.camera.CameraRollManager$a */
    /* loaded from: classes.dex */
    private static class AsyncTaskC1148a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f4454a;

        /* renamed from: b */
        private final int f4455b;

        /* renamed from: c */
        private final String f4456c;

        /* renamed from: d */
        private final String f4457d;

        /* renamed from: e */
        private final ReadableArray f4458e;

        /* renamed from: f */
        private final Promise f4459f;

        /* renamed from: g */
        private final String f4460g;

        private AsyncTaskC1148a(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Promise promise) {
            super(reactContext);
            this.f4454a = reactContext;
            this.f4455b = i;
            this.f4456c = str;
            this.f4457d = str2;
            this.f4458e = readableArray;
            this.f4459f = promise;
            this.f4460g = str3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str;
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f4456c)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.f4456c);
            }
            if (!TextUtils.isEmpty(this.f4457d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.f4457d);
            }
            if (this.f4460g.equals(CameraRollManager.ASSET_TYPE_PHOTOS)) {
                str = " AND media_type = 1";
            } else if (this.f4460g.equals(CameraRollManager.ASSET_TYPE_VIDEOS)) {
                str = " AND media_type = 3";
            } else {
                if (!this.f4460g.equals(CameraRollManager.ASSET_TYPE_ALL)) {
                    this.f4459f.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.f4460g + "'. Expected one of '" + CameraRollManager.ASSET_TYPE_PHOTOS + "', '" + CameraRollManager.ASSET_TYPE_VIDEOS + "' or '" + CameraRollManager.ASSET_TYPE_ALL + "'.");
                    return;
                }
                str = " AND media_type IN (3,1)";
            }
            sb.append(str);
            ReadableArray readableArray = this.f4458e;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.f4458e.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.f4458e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f4454a.getContentResolver();
            try {
                Cursor query = contentResolver.query(MediaStore.Files.getContentUri("external"), CameraRollManager.PROJECTION, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), "datetaken DESC, date_modified DESC LIMIT " + (this.f4455b + 1));
                if (query == null) {
                    this.f4459f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get media");
                    return;
                }
                try {
                    CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.f4455b);
                    CameraRollManager.putPageInfo(query, writableNativeMap, this.f4455b);
                    query.close();
                    this.f4459f.resolve(writableNativeMap);
                } catch (Throwable th) {
                    query.close();
                    this.f4459f.resolve(writableNativeMap);
                    throw th;
                }
            } catch (SecurityException e2) {
                this.f4459f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.camera.CameraRollManager$b */
    /* loaded from: classes.dex */
    public static class AsyncTaskC1149b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f4461a;

        /* renamed from: b */
        private final Uri f4462b;

        /* renamed from: c */
        private final Promise f4463c;

        public AsyncTaskC1149b(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.f4461a = reactContext;
            this.f4462b = uri;
            this.f4463c = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void doInBackgroundGuarded(java.lang.Void... r20) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.camera.CameraRollManager.AsyncTaskC1149b.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        double d2 = cursor.getLong(i3);
        Double.isNaN(d2);
        writableMap.putDouble("timestamp", d2 / 1000.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeArray writableNativeArray;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("width");
        int columnIndex6 = cursor.getColumnIndex("height");
        int columnIndex7 = cursor.getColumnIndex("longitude");
        int columnIndex8 = cursor.getColumnIndex("latitude");
        int columnIndex9 = cursor.getColumnIndex("_data");
        int i2 = i;
        int i3 = 0;
        while (i3 < i2 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            int i4 = columnIndex;
            int i5 = i3;
            int i6 = columnIndex;
            int i7 = columnIndex8;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, i4, columnIndex5, columnIndex6, columnIndex9)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, columnIndex7, i7);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.pushMap(writableNativeMap);
            } else {
                writableNativeArray = writableNativeArray3;
                i5--;
            }
            cursor.moveToNext();
            i3 = i5 + 1;
            i2 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = i7;
            columnIndex = i6;
        }
        writableMap.putArray("edges", writableNativeArray2);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4) {
        StringBuilder sb;
        String str;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString("uri", parse.toString());
        float f = (float) cursor.getInt(i2);
        float f2 = (float) cursor.getInt(i3);
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(parse.toString());
        if (guessContentTypeFromName != null && guessContentTypeFromName.startsWith("video")) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f <= 0.0f || f2 <= 0.0f) {
                    try {
                        try {
                            f = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            f2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        } finally {
                            mediaMetadataRetriever.release();
                            openAssetFileDescriptor.close();
                        }
                    } catch (NumberFormatException e2) {
                        C1700a.m6998a("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + parse.toString(), e2);
                        return false;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Could not get video metadata for ";
                sb.append(str);
                sb.append(parse.toString());
                C1700a.m6998a("ReactNative", sb.toString(), e);
                return false;
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                f = options.outWidth;
                f2 = options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e4) {
                e = e4;
                sb = new StringBuilder();
                str = "Could not get width/height for ";
                sb.append(str);
                sb.append(parse.toString());
                C1700a.m6998a("ReactNative", sb.toString(), e);
                return false;
            }
        }
        writableNativeMap.putDouble("width", f);
        writableNativeMap.putDouble("height", f2);
        writableMap.putMap("image", writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d2 = cursor.getDouble(i);
        double d3 = cursor.getDouble(i2);
        if (d2 > 0.0d || d3 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d2);
            writableNativeMap.putDouble("latitude", d3);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        int i = readableMap.getInt("first");
        String string = readableMap.hasKey("after") ? readableMap.getString("after") : null;
        String string2 = readableMap.hasKey("groupName") ? readableMap.getString("groupName") : null;
        String string3 = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_PHOTOS;
        ReadableArray array = readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null;
        if (readableMap.hasKey("groupTypes")) {
            throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
        }
        new AsyncTaskC1148a(getReactApplicationContext(), i, string, string2, array, string3, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new AsyncTaskC1149b(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
