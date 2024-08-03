package cn.jpush.android.p121ui;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

/* renamed from: cn.jpush.android.ui.e */
/* loaded from: classes.dex */
class DialogInterfaceOnClickListenerC0967e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SslErrorHandler f4022a;

    /* renamed from: b */
    final /* synthetic */ C0968f f4023b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnClickListenerC0967e(C0968f c0968f, SslErrorHandler sslErrorHandler) {
        this.f4023b = c0968f;
        this.f4022a = sslErrorHandler;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f4023b.f4026c = true;
        this.f4022a.proceed();
    }
}
