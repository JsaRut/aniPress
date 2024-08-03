package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.q */
/* loaded from: classes.dex */
public abstract class AbstractC1549q extends C1535c {

    /* renamed from: c */
    protected final Context f5702c;

    /* renamed from: d */
    protected String f5703d;

    /* renamed from: e */
    private String[] f5704e;

    /* renamed from: f */
    private final Map<String, Object> f5705f;

    /* renamed from: com.facebook.soloader.q$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final String f5706a;

        /* renamed from: b */
        public final String f5707b;

        public a(String str, String str2) {
            this.f5706a = str;
            this.f5707b = str2;
        }
    }

    /* renamed from: com.facebook.soloader.q$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final a[] f5708a;

        public b(a[] aVarArr) {
            this.f5708a = aVarArr;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        static final b m6451a(DataInput dataInput) {
            if (dataInput.readByte() != 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int readInt = dataInput.readInt();
            if (readInt < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            a[] aVarArr = new a[readInt];
            for (int i = 0; i < readInt; i++) {
                aVarArr[i] = new a(dataInput.readUTF(), dataInput.readUTF());
            }
            return new b(aVarArr);
        }

        /* renamed from: a */
        public final void m6452a(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f5708a.length);
            int i = 0;
            while (true) {
                a[] aVarArr = this.f5708a;
                if (i >= aVarArr.length) {
                    return;
                }
                dataOutput.writeUTF(aVarArr[i].f5706a);
                dataOutput.writeUTF(this.f5708a[i].f5707b);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.q$c */
    /* loaded from: classes.dex */
    public static final class c implements Closeable {

        /* renamed from: a */
        public final a f5709a;

        /* renamed from: b */
        public final InputStream f5710b;

        public c(a aVar, InputStream inputStream) {
            this.f5709a = aVar;
            this.f5710b = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5710b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.q$d */
    /* loaded from: classes.dex */
    public static abstract class d implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: m */
        public abstract boolean mo6421m();

        /* renamed from: n */
        public abstract c mo6422n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.q$e */
    /* loaded from: classes.dex */
    public static abstract class e implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: m */
        protected abstract b mo6419m();

        /* renamed from: n */
        protected abstract d mo6420n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1549q(Context context, String str) {
        super(m6441a(context, str), 1);
        this.f5705f = new HashMap();
        this.f5702c = context;
    }

    /* renamed from: a */
    public static File m6441a(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x0037, Throwable -> 0x003a, TRY_LEAVE, TryCatch #2 {, blocks: (B:63:0x0032, B:7:0x0048, B:8:0x004f, B:9:0x0059, B:11:0x005f, B:31:0x00ae, B:45:0x00a8, B:46:0x00ab, B:66:0x003f), top: B:2:0x0030, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[Catch: all -> 0x0037, Throwable -> 0x003a, SYNTHETIC, TryCatch #2 {, blocks: (B:63:0x0032, B:7:0x0048, B:8:0x004f, B:9:0x0059, B:11:0x005f, B:31:0x00ae, B:45:0x00a8, B:46:0x00ab, B:66:0x003f), top: B:2:0x0030, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048 A[Catch: all -> 0x0037, Throwable -> 0x003a, TryCatch #2 {, blocks: (B:63:0x0032, B:7:0x0048, B:8:0x004f, B:9:0x0059, B:11:0x005f, B:31:0x00ae, B:45:0x00a8, B:46:0x00ab, B:66:0x003f), top: B:2:0x0030, outer: #5 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6442a(byte r12, com.facebook.soloader.AbstractC1549q.b r13, com.facebook.soloader.AbstractC1549q.d r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC1549q.m6442a(byte, com.facebook.soloader.q$b, com.facebook.soloader.q$d):void");
    }

    /* renamed from: a */
    private void m6443a(c cVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + cVar.f5709a.f5706a);
        if (!this.f5672a.setWritable(true, true)) {
            throw new IOException("cannot make directory writable for us: " + this.f5672a);
        }
        File file = new File(this.f5672a, cVar.f5709a.f5706a);
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (IOException e2) {
            Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e2);
            SysUtil.m6402a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
        }
        try {
            try {
                int available = cVar.f5710b.available();
                if (available > 1) {
                    SysUtil.m6403a(randomAccessFile.getFD(), available);
                }
                SysUtil.m6400a(randomAccessFile, cVar.f5710b, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e3) {
                SysUtil.m6402a(file);
                throw e3;
            }
        } finally {
            randomAccessFile.close();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m6445a(a[] aVarArr) {
        String[] list = this.f5672a.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.f5672a);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < aVarArr.length; i++) {
                    if (aVarArr[i].f5706a.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.f5672a, str);
                    Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                    SysUtil.m6402a(file);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[Catch: all -> 0x00f0, Throwable -> 0x00f3, SYNTHETIC, TRY_LEAVE, TryCatch #7 {all -> 0x00f0, blocks: (B:32:0x008d, B:36:0x009a, B:48:0x00e8, B:45:0x00ec, B:46:0x00ef), top: B:31:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[Catch: all -> 0x0105, Throwable -> 0x0107, SYNTHETIC, TRY_LEAVE, TryCatch #5 {, blocks: (B:10:0x0058, B:12:0x0066, B:13:0x006c, B:15:0x0072, B:17:0x007a, B:30:0x0081, B:38:0x009f, B:64:0x0101, B:65:0x0104), top: B:9:0x0058, outer: #3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6446a(com.facebook.soloader.C1541i r13, int r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC1549q.m6446a(com.facebook.soloader.i, int, byte[]):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m6447b(File file, byte b2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b2);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            } else {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private Object m6448c(String str) {
        Object obj;
        synchronized (this.f5705f) {
            obj = this.f5705f.get(str);
            if (obj == null) {
                obj = new Object();
                this.f5705f.put(str, obj);
            }
        }
        return obj;
    }

    @Override // com.facebook.soloader.C1535c, com.facebook.soloader.AbstractC1546n
    /* renamed from: a */
    public int mo6411a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int m6417a;
        synchronized (m6448c(str)) {
            m6417a = m6417a(str, i, this.f5672a, threadPolicy);
        }
        return m6417a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC1546n
    /* renamed from: a */
    public void mo6413a(int i) {
        SysUtil.m6406c(this.f5672a);
        C1541i m6427a = C1541i.m6427a(new File(this.f5672a, "dso_lock"));
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.f5672a);
            if (m6446a(m6427a, i, mo6408a())) {
                m6427a = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f5672a);
            }
        } finally {
            if (m6427a != null) {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f5672a);
                m6427a.close();
            } else {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f5672a + " (syncer thread started)");
            }
        }
    }

    /* renamed from: a */
    public void m6449a(String[] strArr) {
        this.f5704e = strArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    protected byte[] mo6408a() {
        Parcel obtain = Parcel.obtain();
        e mo6409b = mo6409b();
        Throwable th = null;
        try {
            try {
                a[] aVarArr = mo6409b.mo6419m().f5708a;
                obtain.writeByte((byte) 1);
                obtain.writeInt(aVarArr.length);
                for (int i = 0; i < aVarArr.length; i++) {
                    obtain.writeString(aVarArr[i].f5706a);
                    obtain.writeString(aVarArr[i].f5707b);
                }
                if (mo6409b != null) {
                    mo6409b.close();
                }
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            } finally {
            }
        } catch (Throwable th2) {
            if (mo6409b != null) {
                if (th != null) {
                    try {
                        mo6409b.close();
                    } catch (Throwable unused) {
                    }
                } else {
                    mo6409b.close();
                }
            }
            throw th2;
        }
    }

    /* renamed from: b */
    protected abstract e mo6409b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void m6450b(String str) {
        synchronized (m6448c(str)) {
            this.f5703d = str;
            mo6413a(2);
        }
    }
}
