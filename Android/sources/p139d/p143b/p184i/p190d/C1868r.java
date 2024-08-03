package p139d.p143b.p184i.p190d;

import android.app.ActivityManager;
import android.os.Build;
import p139d.p143b.p148c.p152d.InterfaceC1694m;

/* renamed from: d.b.i.d.r */
/* loaded from: classes.dex */
public class C1868r implements InterfaceC1694m<C1845B> {

    /* renamed from: a */
    private final ActivityManager f6838a;

    public C1868r(ActivityManager activityManager) {
        this.f6838a = activityManager;
    }

    /* renamed from: a */
    private int m7637a() {
        int min = Math.min(this.f6838a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p143b.p148c.p152d.InterfaceC1694m
    public C1845B get() {
        return new C1845B(m7637a(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
