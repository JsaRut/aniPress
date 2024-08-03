package p139d.p143b.p208m;

import android.os.Process;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.D */
/* loaded from: classes.dex */
public class RunnableC2044D implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2047G f7416a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2044D(C2047G c2047g) {
        this.f7416a = c2047g;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }
}
