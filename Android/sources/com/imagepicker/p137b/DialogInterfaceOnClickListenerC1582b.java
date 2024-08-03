package com.imagepicker.p137b;

import android.content.DialogInterface;
import com.imagepicker.p137b.C1584d;
import java.lang.ref.WeakReference;

/* renamed from: com.imagepicker.b.b */
/* loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC1582b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1584d.a f5987a;

    /* renamed from: b */
    final /* synthetic */ WeakReference f5988b;

    public DialogInterfaceOnClickListenerC1582b(C1584d.a aVar, WeakReference weakReference) {
        this.f5987a = aVar;
        this.f5988b = weakReference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5987a.mo6673b(this.f5988b, dialogInterface);
    }
}
