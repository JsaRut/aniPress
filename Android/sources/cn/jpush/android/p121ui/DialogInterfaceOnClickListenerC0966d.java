package cn.jpush.android.p121ui;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

/* renamed from: cn.jpush.android.ui.d */
/* loaded from: classes.dex */
class DialogInterfaceOnClickListenerC0966d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SslErrorHandler f4020a;

    /* renamed from: b */
    final /* synthetic */ C0968f f4021b;

    public DialogInterfaceOnClickListenerC0966d(C0968f c0968f, SslErrorHandler sslErrorHandler) {
        this.f4021b = c0968f;
        this.f4020a = sslErrorHandler;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f4020a.cancel();
    }
}
