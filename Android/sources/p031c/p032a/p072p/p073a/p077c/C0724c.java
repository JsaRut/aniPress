package p031c.p032a.p072p.p073a.p077c;

import android.app.ActivityManager;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import java.io.Serializable;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.c.c */
/* loaded from: classes.dex */
public final class C0724c implements Serializable {

    /* renamed from: a */
    private long f3271a;

    /* renamed from: b */
    private long f3272b;

    /* renamed from: c */
    private boolean f3273c;

    /* renamed from: d */
    private long f3274d;

    /* renamed from: e */
    private long f3275e;

    /* renamed from: f */
    private long f3276f;

    /* renamed from: g */
    private long f3277g;

    /* renamed from: h */
    private long f3278h;

    /* renamed from: i */
    private long f3279i;

    /* renamed from: j */
    private long f3280j;

    /* renamed from: k */
    private long f3281k;

    /* renamed from: a */
    public static long m3665a() {
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        if (totalRxBytes == -1) {
            return -1L;
        }
        return totalRxBytes;
    }

    /* renamed from: b */
    public static long m3666b() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        if (totalTxBytes == -1) {
            return -1L;
        }
        return totalTxBytes;
    }

    /* renamed from: c */
    public static long m3667c() {
        long mobileRxBytes = TrafficStats.getMobileRxBytes();
        if (mobileRxBytes == -1) {
            return -1L;
        }
        return mobileRxBytes;
    }

    /* renamed from: d */
    public static long m3668d() {
        long mobileTxBytes = TrafficStats.getMobileTxBytes();
        if (mobileTxBytes == -1) {
            return -1L;
        }
        return mobileTxBytes;
    }

    /* renamed from: a */
    public final void m3669a(Context context) {
        this.f3276f = m3665a();
        this.f3277g = m3666b();
        this.f3278h = m3667c();
        this.f3279i = m3668d();
        if (context == null) {
            C0732b.m3724g("PageExtra", "init failed .context is null");
            return;
        }
        int i = context.getApplicationInfo().uid;
        long uidTxBytes = TrafficStats.getUidTxBytes(i);
        if (uidTxBytes == -1) {
            uidTxBytes = -1;
        }
        this.f3280j = uidTxBytes;
        long uidRxBytes = TrafficStats.getUidRxBytes(i);
        if (uidRxBytes == -1) {
            uidRxBytes = -1;
        }
        this.f3281k = uidRxBytes;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        activityManager.getProcessMemoryInfo(new int[]{0});
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        this.f3272b = memoryInfo.availMem;
        this.f3274d = -1L;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3274d = memoryInfo.totalMem;
        }
        this.f3275e = memoryInfo.threshold;
        this.f3273c = memoryInfo.lowMemory;
        this.f3271a = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPrivateDirty();
    }

    /* renamed from: e */
    public final long m3670e() {
        return this.f3272b;
    }

    /* renamed from: f */
    public final long m3671f() {
        return this.f3274d;
    }

    /* renamed from: g */
    public final long m3672g() {
        return this.f3280j;
    }

    /* renamed from: h */
    public final long m3673h() {
        return this.f3281k;
    }

    public final String toString() {
        return "PageExtraEntity{currentMemory=" + this.f3271a + ", availMem=" + this.f3272b + ", lowMemory=" + this.f3273c + ", totalMem=" + this.f3274d + ", threshold=" + this.f3275e + ", totalRxBytes=" + this.f3276f + ", totalTxBytes=" + this.f3277g + ", currentMobileRxBytes=" + this.f3278h + ", currentMobileTxBytes=" + this.f3279i + ", appTxBytes=" + this.f3280j + ", appRxBytes=" + this.f3281k + '}';
    }
}
