package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p139d.p143b.p148c.p153e.C1700a;
import p275e.C2722j;

/* renamed from: com.facebook.react.modules.network.A */
/* loaded from: classes.dex */
class C1203A {
    /* renamed from: a */
    public static C1229u m5383a(RequestBody requestBody, InterfaceC1227s interfaceC1227s) {
        return new C1229u(requestBody, interfaceC1227s);
    }

    /* renamed from: a */
    private static InputStream m5384a(Context context, Uri uri) {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.getChannel().transferFrom(newChannel, 0L, Long.MAX_VALUE);
                    return new FileInputStream(createTempFile);
                } finally {
                    fileOutputStream.close();
                }
            } finally {
                newChannel.close();
            }
        } finally {
            openStream.close();
        }
    }

    /* renamed from: a */
    public static InputStream m5385a(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme().startsWith("http") ? m5384a(context, parse) : context.getContentResolver().openInputStream(parse);
        } catch (Exception e2) {
            C1700a.m6998a("ReactNative", "Could not retrieve file for contentUri " + str, e2);
            return null;
        }
    }

    /* renamed from: a */
    public static RequestBody m5386a(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, C2722j.f11399b);
        }
        return null;
    }

    /* renamed from: a */
    public static RequestBody m5387a(MediaType mediaType, InputStream inputStream) {
        return new C1234z(mediaType, inputStream);
    }

    /* renamed from: a */
    public static RequestBody m5388a(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m5389b(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
