package p139d.p143b.p208m.p211c;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: d.b.m.c.b */
/* loaded from: classes.dex */
public class C2070b {

    /* renamed from: a */
    private static final WeakHashMap<ReactContext, C2070b> f7521a = new WeakHashMap<>();

    /* renamed from: b */
    private final WeakReference<ReactContext> f7522b;

    /* renamed from: c */
    private final Set<InterfaceC2071c> f7523c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private final AtomicInteger f7524d = new AtomicInteger(0);

    /* renamed from: e */
    private final Handler f7525e = new Handler();

    /* renamed from: f */
    private final Set<Integer> f7526f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final SparseArray<Runnable> f7527g = new SparseArray<>();

    private C2070b(ReactContext reactContext) {
        this.f7522b = new WeakReference<>(reactContext);
    }

    /* renamed from: a */
    public static C2070b m8437a(ReactContext reactContext) {
        C2070b c2070b = f7521a.get(reactContext);
        if (c2070b != null) {
            return c2070b;
        }
        C2070b c2070b2 = new C2070b(reactContext);
        f7521a.put(reactContext, c2070b2);
        return c2070b2;
    }

    /* renamed from: a */
    public synchronized void m8439a(int i) {
        C2038a.m8321a(this.f7526f.remove(Integer.valueOf(i)), "Tried to finish non-existent task with id " + i + ".");
        Runnable runnable = this.f7527g.get(i);
        if (runnable != null) {
            this.f7525e.removeCallbacks(runnable);
            this.f7527g.remove(i);
        }
        UiThreadUtil.runOnUiThread(new RunnableC2069a(this, i));
    }

    /* renamed from: a */
    public void m8440a(InterfaceC2071c interfaceC2071c) {
        this.f7523c.add(interfaceC2071c);
    }

    /* renamed from: a */
    public boolean m8441a() {
        return this.f7526f.size() > 0;
    }

    /* renamed from: b */
    public void m8442b(InterfaceC2071c interfaceC2071c) {
        this.f7523c.remove(interfaceC2071c);
    }

    /* renamed from: b */
    public synchronized boolean m8443b(int i) {
        return this.f7526f.contains(Integer.valueOf(i));
    }
}
