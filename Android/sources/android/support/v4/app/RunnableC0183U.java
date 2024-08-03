package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.U */
/* loaded from: classes.dex */
public class RunnableC0183U implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f711a;

    /* renamed from: b */
    final /* synthetic */ Map f712b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0185W f713c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0183U(AbstractC0185W abstractC0185W, ArrayList arrayList, Map map) {
        this.f713c = abstractC0185W;
        this.f711a = arrayList;
        this.f712b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f711a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f711a.get(i);
            String m524l = C0107v.m524l(view);
            if (m524l != null) {
                C0107v.m503a(view, AbstractC0185W.m826a((Map<String, String>) this.f712b, m524l));
            }
        }
    }
}
