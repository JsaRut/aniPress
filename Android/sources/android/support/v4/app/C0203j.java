package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.j */
/* loaded from: classes.dex */
public class C0203j extends AbstractC0209p {

    /* renamed from: a */
    final /* synthetic */ ComponentCallbacksC0205l f779a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0203j(ComponentCallbacksC0205l componentCallbacksC0205l) {
        this.f779a = componentCallbacksC0205l;
    }

    @Override // android.support.v4.app.AbstractC0209p
    /* renamed from: a */
    public ComponentCallbacksC0205l mo902a(Context context, String str, Bundle bundle) {
        return this.f779a.f825u.mo902a(context, str, bundle);
    }

    @Override // android.support.v4.app.AbstractC0209p
    /* renamed from: a */
    public View mo903a(int i) {
        View view = this.f779a.f793K;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    @Override // android.support.v4.app.AbstractC0209p
    /* renamed from: a */
    public boolean mo904a() {
        return this.f779a.f793K != null;
    }
}
