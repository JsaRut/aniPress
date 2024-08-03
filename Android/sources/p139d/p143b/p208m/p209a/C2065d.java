package p139d.p143b.p208m.p209a;

import android.util.SparseArray;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: d.b.m.a.d */
/* loaded from: classes.dex */
public class C2065d {

    /* renamed from: a */
    private final SparseArray<AbstractC2062a> f7509a = new SparseArray<>();

    /* renamed from: a */
    public AbstractC2062a m8432a(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.f7509a.get(i);
    }

    /* renamed from: a */
    public void m8433a(AbstractC2062a abstractC2062a) {
        UiThreadUtil.assertOnUiThread();
        this.f7509a.put(abstractC2062a.m8429b(), abstractC2062a);
    }

    /* renamed from: b */
    public AbstractC2062a m8434b(int i) {
        UiThreadUtil.assertOnUiThread();
        AbstractC2062a abstractC2062a = this.f7509a.get(i);
        if (abstractC2062a != null) {
            this.f7509a.delete(i);
        }
        return abstractC2062a;
    }
}
