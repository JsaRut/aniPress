package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* renamed from: com.facebook.react.uimanager.k */
/* loaded from: classes.dex */
public class C1353k extends JSApplicationCausedNativeException {

    /* renamed from: a */
    private View f5011a;

    public C1353k(String str) {
        super(str);
    }

    public C1353k(String str, View view, Throwable th) {
        super(str, th);
        this.f5011a = view;
    }
}
