package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.AbstractC1549q;
import com.facebook.soloader.C1540h;
import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.a */
/* loaded from: classes.dex */
public class C1533a extends C1540h {

    /* renamed from: i */
    private final int f5665i;

    /* renamed from: com.facebook.soloader.a$a */
    /* loaded from: classes.dex */
    protected class a extends C1540h.b {

        /* renamed from: e */
        private File f5666e;

        /* renamed from: f */
        private final int f5667f;

        a(C1540h c1540h) {
            super(c1540h);
            this.f5666e = new File(C1533a.this.f5702c.getApplicationInfo().nativeLibraryDir);
            this.f5667f = C1533a.this.f5665i;
        }

        @Override // com.facebook.soloader.C1540h.b
        /* renamed from: a */
        protected boolean mo6410a(ZipEntry zipEntry, String str) {
            String str2;
            Object[] objArr;
            String str3;
            String name = zipEntry.getName();
            boolean z = true;
            if (!str.equals(C1533a.this.f5703d)) {
                if ((this.f5667f & 1) == 0) {
                    str2 = "allowing consideration of " + name + ": self-extraction preferred";
                } else {
                    File file = new File(this.f5666e, str);
                    if (file.isFile()) {
                        long length = file.length();
                        long size = zipEntry.getSize();
                        if (length != size) {
                            str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                        } else {
                            str2 = "not allowing consideration of " + name + ": deferring to libdir";
                            z = false;
                        }
                    } else {
                        objArr = new Object[]{name, str};
                        str3 = "allowing considering of %s: %s not in system lib dir";
                    }
                }
                Log.d("ApkSoSource", str2);
                return z;
            }
            C1533a.this.f5703d = null;
            objArr = new Object[]{str};
            str3 = "allowing consideration of corrupted lib %s";
            str2 = String.format(str3, objArr);
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    public C1533a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f5665i = i;
    }

    @Override // com.facebook.soloader.AbstractC1549q
    /* renamed from: a */
    protected byte[] mo6408a() {
        File canonicalFile = this.f5679g.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.m6399a(this.f5702c));
            if ((this.f5665i & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f5702c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.AbstractC1549q
    /* renamed from: b */
    protected AbstractC1549q.e mo6409b() {
        return new a(this);
    }
}
