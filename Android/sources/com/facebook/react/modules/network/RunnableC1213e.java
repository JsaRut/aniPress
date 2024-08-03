package com.facebook.react.modules.network;

import android.webkit.CookieManager;
import com.facebook.react.modules.network.C1217i;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.e */
/* loaded from: classes.dex */
public class RunnableC1213e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f4611a;

    /* renamed from: b */
    final /* synthetic */ CookieManager f4612b;

    /* renamed from: c */
    final /* synthetic */ String f4613c;

    /* renamed from: d */
    final /* synthetic */ C1217i f4614d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1213e(C1217i c1217i, List list, CookieManager cookieManager, String str) {
        this.f4614d = c1217i;
        this.f4611a = list;
        this.f4612b = cookieManager;
        this.f4613c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1217i.a aVar;
        Iterator it = this.f4611a.iterator();
        while (it.hasNext()) {
            this.f4612b.setCookie(this.f4613c, (String) it.next());
        }
        aVar = this.f4614d.f4621b;
        aVar.m5419a();
    }
}
