package com.imagepicker.p138c;

import android.app.Activity;
import android.support.v7.app.DialogInterfaceC0333l;
import android.widget.ArrayAdapter;
import com.facebook.react.bridge.ReadableMap;
import com.imagepicker.C1596e;
import com.imagepicker.ImagePickerModule;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.imagepicker.c.i */
/* loaded from: classes.dex */
public class C1594i {

    /* renamed from: com.imagepicker.c.i$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6666a(ImagePickerModule imagePickerModule);

        /* renamed from: a */
        void mo6667a(ImagePickerModule imagePickerModule, String str);

        /* renamed from: b */
        void mo6668b(ImagePickerModule imagePickerModule);

        /* renamed from: c */
        void mo6669c(ImagePickerModule imagePickerModule);
    }

    /* renamed from: a */
    public static DialogInterfaceC0333l m6698a(ImagePickerModule imagePickerModule, ReadableMap readableMap, a aVar) {
        Activity activity = imagePickerModule.getActivity();
        if (activity == null) {
            return null;
        }
        WeakReference weakReference = new WeakReference(imagePickerModule);
        C1586a m6675a = C1586a.m6675a(readableMap);
        List<String> m6678b = m6675a.m6678b();
        List<String> m6677a = m6675a.m6677a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(activity, C1596e.list_item, m6678b);
        DialogInterfaceC0333l.a aVar2 = new DialogInterfaceC0333l.a(activity, imagePickerModule.getDialogThemeId());
        if (C1589d.m6686a(readableMap, "title")) {
            aVar2.m1820b(readableMap.getString("title"));
        }
        aVar2.m1814a(arrayAdapter, new DialogInterfaceOnClickListenerC1591f(m6677a, aVar, weakReference));
        aVar2.m1816a(m6675a.f5994c.f5996a, new DialogInterfaceOnClickListenerC1592g(aVar, weakReference));
        DialogInterfaceC0333l m1818a = aVar2.m1818a();
        m1818a.setOnCancelListener(new DialogInterfaceOnCancelListenerC1593h(aVar, weakReference));
        return m1818a;
    }
}
