package com.imagepicker.p138c;

import android.content.DialogInterface;
import com.imagepicker.ImagePickerModule;
import com.imagepicker.p138c.C1594i;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.imagepicker.c.f */
/* loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC1591f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ List f6002a;

    /* renamed from: b */
    final /* synthetic */ C1594i.a f6003b;

    /* renamed from: c */
    final /* synthetic */ WeakReference f6004c;

    public DialogInterfaceOnClickListenerC1591f(List list, C1594i.a aVar, WeakReference weakReference) {
        this.f6002a = list;
        this.f6003b = aVar;
        this.f6004c = weakReference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        char c2;
        String str = (String) this.f6002a.get(i);
        int hashCode = str.hashCode();
        if (hashCode == -1367724422) {
            if (str.equals("cancel")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 106642994) {
            if (hashCode == 166208699 && str.equals("library")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("photo")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            this.f6003b.mo6669c((ImagePickerModule) this.f6004c.get());
            return;
        }
        if (c2 == 1) {
            this.f6003b.mo6668b((ImagePickerModule) this.f6004c.get());
        } else if (c2 != 2) {
            this.f6003b.mo6667a((ImagePickerModule) this.f6004c.get(), str);
        } else {
            this.f6003b.mo6666a((ImagePickerModule) this.f6004c.get());
        }
    }
}
