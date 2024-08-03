package me.listenzz.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.modal.C1409g;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: me.listenzz.modal.d */
/* loaded from: classes.dex */
public class C2742d extends C1409g {
    public C2742d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static void m11763a(Window window, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    /* renamed from: a */
    public static void m11764a(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(z ? 8192 : 0);
        }
    }

    /* renamed from: b */
    public static void m11765b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = window.getDecorView();
            decorView.setOnApplyWindowInsetsListener(z ? new ViewOnApplyWindowInsetsListenerC2741c() : null);
            C0107v.m533u(decorView);
        }
    }

    @TargetApi(23)
    /* renamed from: c */
    private boolean m11766c() {
        Activity currentActivity = ((ReactContext) getContext()).getCurrentActivity();
        return currentActivity == null || (currentActivity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // com.facebook.react.views.modal.C1409g
    /* renamed from: b */
    public void mo6032b() {
        super.mo6032b();
        Dialog dialog = getDialog();
        if (dialog != null) {
            m11765b(dialog.getWindow(), true);
            m11763a(dialog.getWindow(), 0);
            m11764a(dialog.getWindow(), m11766c());
        }
    }
}
