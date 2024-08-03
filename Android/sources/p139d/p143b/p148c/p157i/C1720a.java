package p139d.p143b.p148c.p157i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p139d.p143b.p148c.p152d.C1699r;

/* renamed from: d.b.c.i.a */
/* loaded from: classes.dex */
public class C1720a {

    /* renamed from: a */
    private static C1720a f6249a;

    /* renamed from: b */
    private static final long f6250b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: d */
    private volatile File f6252d;

    /* renamed from: f */
    private volatile File f6254f;

    /* renamed from: g */
    private long f6255g;

    /* renamed from: c */
    private volatile StatFs f6251c = null;

    /* renamed from: e */
    private volatile StatFs f6253e = null;

    /* renamed from: i */
    private volatile boolean f6257i = false;

    /* renamed from: h */
    private final Lock f6256h = new ReentrantLock();

    /* renamed from: d.b.c.i.a$a */
    /* loaded from: classes.dex */
    public enum a {
        INTERNAL,
        EXTERNAL
    }

    protected C1720a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: a */
    private StatFs m7063a(StatFs statFs, File file) {
        ?? r0 = 0;
        r0 = 0;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = m7064a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            r0 = statFs;
            return r0;
        } catch (IllegalArgumentException unused) {
            return r0;
        } catch (Throwable th) {
            C1699r.m6984a(th);
            throw r0;
        }
    }

    /* renamed from: a */
    protected static StatFs m7064a(String str) {
        return new StatFs(str);
    }

    /* renamed from: a */
    public static synchronized C1720a m7065a() {
        C1720a c1720a;
        synchronized (C1720a.class) {
            if (f6249a == null) {
                f6249a = new C1720a();
            }
            c1720a = f6249a;
        }
        return c1720a;
    }

    /* renamed from: b */
    private void m7066b() {
        if (this.f6257i) {
            return;
        }
        this.f6256h.lock();
        try {
            if (!this.f6257i) {
                this.f6252d = Environment.getDataDirectory();
                this.f6254f = Environment.getExternalStorageDirectory();
                m7068d();
                this.f6257i = true;
            }
        } finally {
            this.f6256h.unlock();
        }
    }

    /* renamed from: c */
    private void m7067c() {
        if (this.f6256h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f6255g > f6250b) {
                    m7068d();
                }
            } finally {
                this.f6256h.unlock();
            }
        }
    }

    /* renamed from: d */
    private void m7068d() {
        this.f6251c = m7063a(this.f6251c, this.f6252d);
        this.f6253e = m7063a(this.f6253e, this.f6254f);
        this.f6255g = SystemClock.uptimeMillis();
    }

    @SuppressLint({"DeprecatedMethod"})
    /* renamed from: a */
    public long m7069a(a aVar) {
        long blockSize;
        long availableBlocks;
        m7066b();
        m7067c();
        StatFs statFs = aVar == a.INTERNAL ? this.f6251c : this.f6253e;
        if (statFs == null) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return blockSize * availableBlocks;
    }

    /* renamed from: a */
    public boolean m7070a(a aVar, long j) {
        m7066b();
        long m7069a = m7069a(aVar);
        return m7069a <= 0 || m7069a < j;
    }
}
