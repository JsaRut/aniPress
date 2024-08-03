package com.imagepicker.p136a;

import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;

/* renamed from: com.imagepicker.a.a */
/* loaded from: classes.dex */
public class C1579a {

    /* renamed from: a */
    public final File f5979a;

    /* renamed from: b */
    public final File f5980b;

    /* renamed from: c */
    public final int f5981c;

    /* renamed from: d */
    public final int f5982d;

    /* renamed from: e */
    public final int f5983e;

    /* renamed from: f */
    public final int f5984f;

    /* renamed from: g */
    public final boolean f5985g;

    public C1579a(File file, File file2, int i, int i2, int i3, int i4, boolean z) {
        this.f5979a = file;
        this.f5980b = file2;
        this.f5981c = i;
        this.f5982d = i2;
        this.f5983e = i3;
        this.f5984f = i4;
        this.f5985g = z;
    }

    /* renamed from: a */
    public C1579a m6659a(int i) {
        return new C1579a(this.f5979a, this.f5980b, this.f5981c, i, this.f5983e, this.f5984f, this.f5985g);
    }

    /* renamed from: a */
    public C1579a m6660a(ReadableMap readableMap) {
        boolean z;
        int i = readableMap.hasKey("maxWidth") ? (int) readableMap.getDouble("maxWidth") : 0;
        int i2 = readableMap.hasKey("maxHeight") ? (int) readableMap.getDouble("maxHeight") : 0;
        int i3 = readableMap.hasKey("quality") ? (int) (readableMap.getDouble("quality") * 100.0d) : 100;
        int i4 = readableMap.hasKey("rotation") ? (int) readableMap.getDouble("rotation") : 0;
        if (readableMap.hasKey("storageOptions")) {
            ReadableMap map = readableMap.getMap("storageOptions");
            if (map.hasKey("cameraRoll")) {
                z = map.getBoolean("cameraRoll");
                return new C1579a(this.f5979a, this.f5980b, i, i2, i3, i4, z);
            }
        }
        z = false;
        return new C1579a(this.f5979a, this.f5980b, i, i2, i3, i4, z);
    }

    /* renamed from: a */
    public C1579a m6661a(File file) {
        if (file != null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath());
            int i = this.f5983e;
            fileExtensionFromUrl.contains("gif");
        }
        return new C1579a(file, this.f5980b, this.f5981c, this.f5982d, this.f5983e, this.f5984f, this.f5985g);
    }

    /* renamed from: a */
    public File m6662a() {
        File file = this.f5980b;
        return file != null ? file : this.f5979a;
    }

    /* renamed from: a */
    public boolean m6663a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.f5981c;
        return ((i < i6 && i6 > 0) || this.f5981c == 0) && ((i2 < (i4 = this.f5982d) && i4 > 0) || this.f5982d == 0) && this.f5983e == 100 && ((i5 = this.f5984f) == 0 || i3 == i5);
    }

    /* renamed from: b */
    public C1579a m6664b(int i) {
        return new C1579a(this.f5979a, this.f5980b, i, this.f5982d, this.f5983e, this.f5984f, this.f5985g);
    }

    /* renamed from: b */
    public C1579a m6665b(File file) {
        return new C1579a(this.f5979a, file, this.f5981c, this.f5982d, this.f5983e, this.f5984f, this.f5985g);
    }
}
