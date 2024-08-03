package com.imagepicker.p138c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.os.Environment;
import com.facebook.react.bridge.ReadableMap;
import com.imagepicker.C1598g;
import com.imagepicker.p136a.C1579a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.imagepicker.c.c */
/* loaded from: classes.dex */
public class C1588c {

    /* renamed from: com.imagepicker.c.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f5998a;

        /* renamed from: b */
        public final Throwable f5999b;

        public a(int i, Throwable th) {
            this.f5998a = i;
            this.f5999b = th;
        }
    }

    /* renamed from: com.imagepicker.c.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final C1579a f6000a;

        /* renamed from: b */
        public final Throwable f6001b;

        public b(C1579a c1579a, Throwable th) {
            this.f6000a = c1579a;
            this.f6001b = th;
        }
    }

    /* renamed from: a */
    public static C1579a m6679a(Context context, ReadableMap readableMap, C1579a c1579a, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        FileOutputStream fileOutputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inSampleSize = 1;
        if (c1579a.f5981c != 0 || c1579a.f5982d != 0) {
            i4 = i;
            i5 = i2;
            while (true) {
                int i7 = c1579a.f5981c;
                if ((i7 != 0 && i4 <= i7 * 2) || ((i6 = c1579a.f5982d) != 0 && i5 <= i6 * 2)) {
                    break;
                }
                options.inSampleSize *= 2;
                i5 /= 2;
                i4 /= 2;
            }
        } else {
            i4 = i;
            i5 = i2;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(c1579a.f5979a.getAbsolutePath(), options);
        if (decodeFile == null) {
            return null;
        }
        int i8 = c1579a.f5981c;
        C1579a m6664b = (i8 == 0 || i8 > i4) ? c1579a.m6664b(i4) : c1579a;
        if (c1579a.f5982d == 0 || c1579a.f5981c > i5) {
            m6664b = m6664b.m6659a(i5);
        }
        C1579a c1579a2 = m6664b;
        double d2 = c1579a2.f5981c;
        double d3 = i4;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double d5 = c1579a2.f5982d;
        double d6 = i5;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d7 = d5 / d6;
        if (d4 < d7) {
            d7 = d4;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(c1579a2.f5984f);
        float f = (float) d7;
        matrix.postScale(f, f);
        try {
            int attributeInt = new ExifInterface(c1579a2.f5979a.getAbsolutePath()).getAttributeInt("Orientation", 0);
            if (attributeInt == 3) {
                matrix.postRotate(180.0f);
            } else if (attributeInt == 6) {
                matrix.postRotate(90.0f);
            } else if (attributeInt == 8) {
                matrix.postRotate(270.0f);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, c1579a2.f5983e, byteArrayOutputStream);
        File m6682a = m6682a(context, readableMap, !(i3 == 13001));
        if (m6682a == null) {
            if (decodeFile != null) {
                decodeFile.recycle();
            }
            if (createBitmap != null) {
                createBitmap.recycle();
            }
            return c1579a;
        }
        C1579a m6665b = c1579a2.m6665b(m6682a);
        try {
            fileOutputStream = new FileOutputStream(m6665b.f5980b);
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.close();
            if (decodeFile != null) {
                decodeFile.recycle();
            }
            if (createBitmap != null) {
                createBitmap.recycle();
            }
            return m6665b;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            } else {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static a m6680a(C1598g c1598g, C1579a c1579a) {
        int i = 0;
        try {
            ExifInterface exifInterface = new ExifInterface(c1579a.f5979a.getAbsolutePath());
            float[] fArr = new float[2];
            exifInterface.getLatLong(fArr);
            float f = fArr[0];
            boolean z = true;
            float f2 = fArr[1];
            if (f != 0.0f || f2 != 0.0f) {
                c1598g.m6702a("latitude", f);
                c1598g.m6702a("longitude", f2);
            }
            String attribute = exifInterface.getAttribute("DateTime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                c1598g.m6704a("timestamp", simpleDateFormat2.format(simpleDateFormat.parse(attribute)) + "Z");
            } catch (Exception unused) {
            }
            int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
                z = false;
            } else {
                i = 180;
            }
            c1598g.m6703a("originalRotation", i);
            c1598g.m6705a("isVertical", z);
            return new a(i, null);
        } catch (IOException e2) {
            e2.printStackTrace();
            return new a(i, e2);
        }
    }

    /* renamed from: a */
    public static b m6681a(C1579a c1579a) {
        File file = c1579a.f5980b;
        if (file == null) {
            file = c1579a.f5979a;
        }
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath(), file.getName());
        try {
            m6685a(file, file2);
            return new b(c1579a.f5980b != null ? c1579a.m6665b(file2) : c1579a.m6661a(file2), null);
        } catch (IOException e2) {
            e2.printStackTrace();
            return new b(c1579a, e2);
        }
    }

    /* renamed from: a */
    public static File m6682a(Context context, ReadableMap readableMap, boolean z) {
        String str = "image-" + UUID.randomUUID().toString() + ".jpg";
        File file = (C1589d.m6688b(readableMap, "storageOptions") && C1589d.m6686a(readableMap.getMap("storageOptions"), "path")) ? new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), readableMap.getMap("storageOptions").getString("path")) : !z ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) : context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File file2 = new File(file, str);
        try {
            file.mkdirs();
            file2.createNewFile();
            return file2;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m6683a(int i, C1579a c1579a) {
        if (i != 13001) {
            return;
        }
        File file = c1579a.f5979a;
        if (file != null && file.exists()) {
            c1579a.f5979a.delete();
        }
        File file2 = c1579a.f5980b;
        if (file2 == null || !file2.exists()) {
            return;
        }
        c1579a.f5980b.delete();
    }

    /* renamed from: a */
    public static void m6684a(Context context, String str) {
        if (context == null) {
            return;
        }
        MediaScannerConnection.scanFile(context, new String[]{str}, null, new C1587b());
    }

    /* renamed from: a */
    private static void m6685a(File file, File file2) {
        FileChannel fileChannel;
        FileChannel channel;
        FileChannel fileChannel2 = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
        try {
            fileChannel.transferTo(0L, fileChannel.size(), channel);
            file.delete();
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            if (channel != null) {
                channel.close();
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel2 = channel;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                    throw th;
                }
            }
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            throw th;
        }
    }
}
