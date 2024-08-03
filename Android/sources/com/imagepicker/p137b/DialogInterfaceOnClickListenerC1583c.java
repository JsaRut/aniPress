package com.imagepicker.p137b;

import android.content.DialogInterface;
import com.imagepicker.p137b.C1584d;
import java.lang.ref.WeakReference;

/* renamed from: com.imagepicker.b.c */
/* loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC1583c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1584d.a f5989a;

    /* renamed from: b */
    final /* synthetic */ WeakReference f5990b;

    public DialogInterfaceOnClickListenerC1583c(C1584d.a aVar, WeakReference weakReference) {
        this.f5989a = aVar;
        this.f5990b = weakReference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5989a.mo6672a(this.f5990b, dialogInterface);
    }
}
