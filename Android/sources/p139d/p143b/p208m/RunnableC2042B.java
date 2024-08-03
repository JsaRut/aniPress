package p139d.p143b.p208m;

import android.os.Process;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.p124a.InterfaceC1114b;
import p139d.p143b.p208m.C2047G;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.B */
/* loaded from: classes.dex */
public class RunnableC2042B implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2047G.a f7411a;

    /* renamed from: b */
    final /* synthetic */ C2047G f7412b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2042B(C2047G c2047g, C2047G.a aVar) {
        this.f7412b = c2047g;
        this.f7411a = aVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public void run() {
        Boolean bool;
        Boolean bool2;
        InterfaceC1114b interfaceC1114b;
        ReactApplicationContext m8323a;
        Boolean bool3;
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
        bool = this.f7412b.f7439s;
        synchronized (bool) {
            while (true) {
                bool2 = this.f7412b.f7439s;
                if (bool2.booleanValue()) {
                    try {
                        bool3 = this.f7412b.f7439s;
                        bool3.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        this.f7412b.f7438r = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
            m8323a = this.f7412b.m8323a(this.f7411a.m8372b().create(), this.f7411a.m8371a());
            this.f7412b.f7424d = null;
            ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
            RunnableC2135z runnableC2135z = new RunnableC2135z(this);
            m8323a.runOnNativeModulesQueueThread(new RunnableC2041A(this, m8323a));
            UiThreadUtil.runOnUiThread(runnableC2135z);
        } catch (Exception e2) {
            interfaceC1114b = this.f7412b.f7429i;
            interfaceC1114b.handleException(e2);
        }
    }
}
