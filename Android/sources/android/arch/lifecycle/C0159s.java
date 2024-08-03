package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: android.arch.lifecycle.s */
/* loaded from: classes.dex */
public class C0159s {

    /* renamed from: a */
    private final HashMap<String, AbstractC0157q> f613a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC0157q m749a(String str) {
        return this.f613a.get(str);
    }

    /* renamed from: a */
    public final void m750a() {
        Iterator<AbstractC0157q> it = this.f613a.values().iterator();
        while (it.hasNext()) {
            it.next().mo745a();
        }
        this.f613a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m751a(String str, AbstractC0157q abstractC0157q) {
        AbstractC0157q put = this.f613a.put(str, abstractC0157q);
        if (put != null) {
            put.mo745a();
        }
    }
}
