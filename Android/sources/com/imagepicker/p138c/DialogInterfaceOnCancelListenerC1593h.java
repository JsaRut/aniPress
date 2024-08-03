package com.imagepicker.p138c;

import android.content.DialogInterface;
import com.imagepicker.ImagePickerModule;
import com.imagepicker.p138c.C1594i;
import java.lang.ref.WeakReference;

/* renamed from: com.imagepicker.c.h */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1593h implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C1594i.a f6007a;

    /* renamed from: b */
    final /* synthetic */ WeakReference f6008b;

    public DialogInterfaceOnCancelListenerC1593h(C1594i.a aVar, WeakReference weakReference) {
        this.f6007a = aVar;
        this.f6008b = weakReference;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f6007a.mo6666a((ImagePickerModule) this.f6008b.get());
        dialogInterface.dismiss();
    }
}
