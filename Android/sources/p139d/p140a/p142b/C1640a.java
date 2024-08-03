package p139d.p140a.p142b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: d.a.b.a */
/* loaded from: classes.dex */
public class C1640a extends BroadcastReceiver {

    /* renamed from: a */
    private final Context f6077a;

    /* renamed from: b */
    private InterfaceC1642c f6078b = InterfaceC1642c.f6079a;

    public C1640a(Context context) {
        this.f6077a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m6803a() {
        this.f6078b = InterfaceC1642c.f6079a;
        try {
            this.f6077a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m6804a(InterfaceC1642c interfaceC1642c) {
        this.f6078b = interfaceC1642c;
        this.f6077a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f6078b.mo4929b();
        }
    }
}
