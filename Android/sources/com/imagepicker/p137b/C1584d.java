package com.imagepicker.p137b;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.DialogInterfaceC0333l;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.imagepicker.ImagePickerModule;
import java.lang.ref.WeakReference;

/* renamed from: com.imagepicker.b.d */
/* loaded from: classes.dex */
public class C1584d {

    /* renamed from: com.imagepicker.b.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6672a(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface);

        /* renamed from: b */
        void mo6673b(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface);
    }

    /* renamed from: a */
    public static DialogInterfaceC0333l m6671a(ImagePickerModule imagePickerModule, ReadableMap readableMap, a aVar) {
        if (imagePickerModule.getContext() == null || !readableMap.hasKey("permissionDenied")) {
            return null;
        }
        ReadableMap map = readableMap.getMap("permissionDenied");
        if (((ReadableNativeMap) map).toHashMap().size() == 0) {
            return null;
        }
        String string = map.getString("title");
        String string2 = map.getString("text");
        String string3 = map.getString("reTryTitle");
        String string4 = map.getString("okTitle");
        WeakReference weakReference = new WeakReference(imagePickerModule);
        Activity activity = imagePickerModule.getActivity();
        if (activity == null) {
            return null;
        }
        DialogInterfaceC0333l.a aVar2 = new DialogInterfaceC0333l.a(activity, imagePickerModule.getDialogThemeId());
        aVar2.m1820b(string);
        aVar2.m1815a(string2);
        aVar2.m1817a(false);
        aVar2.m1816a(string4, new DialogInterfaceOnClickListenerC1583c(aVar, weakReference));
        aVar2.m1821b(string3, new DialogInterfaceOnClickListenerC1582b(aVar, weakReference));
        return aVar2.m1818a();
    }
}
