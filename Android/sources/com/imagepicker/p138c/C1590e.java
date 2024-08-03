package com.imagepicker.p138c;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.File;
import p000a.p005b.p009c.p010a.C0032b;

/* renamed from: com.imagepicker.c.e */
/* loaded from: classes.dex */
public class C1590e {
    /* renamed from: a */
    public static Uri m6689a(Context context, File file) {
        if (Build.VERSION.SDK_INT < 21) {
            return Uri.fromFile(file);
        }
        try {
            return C0032b.m155a(context, context.getApplicationContext().getPackageName() + ".provider", file);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m6690a(Context context, Uri uri) {
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), uri.getLastPathSegment());
        if (file.exists()) {
            return file.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m6691a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* renamed from: a */
    public static boolean m6692a(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static String m6693b(Context context, Uri uri) {
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            if (m6694b(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else {
                if (m6692a(uri)) {
                    return m6691a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (m6697d(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return m6691a(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return m6696c(uri) ? uri.getLastPathSegment() : m6695c(context, uri) ? m6690a(context, uri) : m6691a(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m6694b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m6695c(Context context, Uri uri) {
        return (context.getPackageName() + ".provider").equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m6696c(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: d */
    public static boolean m6697d(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
