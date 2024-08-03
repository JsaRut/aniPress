package p031c.p032a.p051R;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* renamed from: c.a.R.j */
/* loaded from: classes.dex */
public final class C0568j implements Comparator<ScanResult> {

    /* renamed from: a */
    final /* synthetic */ C0567i f2732a;

    public C0568j(C0567i c0567i) {
        this.f2732a = c0567i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ScanResult scanResult, ScanResult scanResult2) {
        return scanResult2.level - scanResult.level;
    }
}
