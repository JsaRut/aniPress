package p139d.p143b.p208m;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: d.b.m.k */
/* loaded from: classes.dex */
public class ComponentCallbacks2C2120k implements ComponentCallbacks2 {

    /* renamed from: a */
    private final Set<MemoryPressureListener> f7601a = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentCallbacks2C2120k(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    /* renamed from: a */
    private void m8472a(int i) {
        Set<MemoryPressureListener> set = this.f7601a;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i);
        }
    }

    /* renamed from: a */
    public void m8473a(MemoryPressureListener memoryPressureListener) {
        this.f7601a.add(memoryPressureListener);
    }

    /* renamed from: b */
    public void m8474b(MemoryPressureListener memoryPressureListener) {
        this.f7601a.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m8472a(i);
    }
}
