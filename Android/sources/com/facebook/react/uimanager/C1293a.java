package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.C1300c;
import p000a.p005b.p009c.p019h.C0089d;
import p000a.p005b.p009c.p019h.p020a.C0080a;

/* renamed from: com.facebook.react.uimanager.a */
/* loaded from: classes.dex */
public class C1293a extends C0089d {

    /* renamed from: c */
    final /* synthetic */ String f4791c;

    /* renamed from: d */
    final /* synthetic */ C1300c.a f4792d;

    /* renamed from: e */
    final /* synthetic */ View f4793e;

    public C1293a(String str, C1300c.a aVar, View view) {
        this.f4791c = str;
        this.f4792d = aVar;
        this.f4793e = view;
    }

    @Override // p000a.p005b.p009c.p019h.C0089d
    /* renamed from: a */
    public void mo321a(View view, C0080a c0080a) {
        String str;
        super.mo321a(view, c0080a);
        if (this.f4791c != null) {
            String str2 = (String) c0080a.m376c();
            if (str2 != null) {
                str = str2 + ", " + this.f4791c;
            } else {
                str = this.f4791c;
            }
            c0080a.m374b(str);
        }
        C1300c.m5674a(c0080a, this.f4792d, this.f4793e.getContext());
    }
}
