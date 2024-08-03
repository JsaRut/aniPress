package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.LayoutInflaterFactory2C0345x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.z */
/* loaded from: classes.dex */
public class C0347z extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x.d f1663a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0347z(LayoutInflaterFactory2C0345x.d dVar) {
        this.f1663a = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f1663a.m1910b();
    }
}
