package com.imagepicker.p138c;

import android.content.DialogInterface;
import com.imagepicker.ImagePickerModule;
import com.imagepicker.p138c.C1594i;
import java.lang.ref.WeakReference;

/* renamed from: com.imagepicker.c.g */
/* loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC1592g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1594i.a f6005a;

    /* renamed from: b */
    final /* synthetic */ WeakReference f6006b;

    public DialogInterfaceOnClickListenerC1592g(C1594i.a aVar, WeakReference weakReference) {
        this.f6005a = aVar;
        this.f6006b = weakReference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f6005a.mo6666a((ImagePickerModule) this.f6006b.get());
        dialogInterface.dismiss();
    }
}
