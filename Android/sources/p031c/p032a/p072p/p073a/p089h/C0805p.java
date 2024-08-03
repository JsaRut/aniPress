package p031c.p032a.p072p.p073a.p089h;

import android.app.AlertDialog;
import p031c.p032a.p072p.p073a.p080f.C0730a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.p.a.h.p */
/* loaded from: classes.dex */
public final class C0805p implements InterfaceC0798i {
    @Override // p031c.p032a.p072p.p073a.p089h.InterfaceC0798i
    /* renamed from: a */
    public final void mo3909a() {
        C0797h c0797h;
        c0797h = C0804o.f3511d;
        c0797h.setVisibility(8);
        AlertDialog.Builder builder = new AlertDialog.Builder(C0730a.m3703a().m3711c());
        builder.setMessage("是否退出圈选？");
        builder.setNegativeButton("继续圈选", new DialogInterfaceOnClickListenerC0806q(this));
        builder.setCancelable(false);
        builder.setPositiveButton("退出圈选", new DialogInterfaceOnClickListenerC0807r(this));
        builder.show();
    }
}
