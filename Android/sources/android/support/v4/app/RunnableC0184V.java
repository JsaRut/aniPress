package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.V */
/* loaded from: classes.dex */
public class RunnableC0184V implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f714a;

    /* renamed from: b */
    final /* synthetic */ Map f715b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0185W f716c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0184V(AbstractC0185W abstractC0185W, ArrayList arrayList, Map map) {
        this.f716c = abstractC0185W;
        this.f714a = arrayList;
        this.f715b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f714a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f714a.get(i);
            C0107v.m503a(view, (String) this.f715b.get(C0107v.m524l(view)));
        }
    }
}
