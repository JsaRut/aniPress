package cn.jpush.android.p121ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: cn.jpush.android.ui.a */
/* loaded from: classes.dex */
class ViewOnClickListenerC0963a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FullScreenView f4017a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC0963a(FullScreenView fullScreenView) {
        this.f4017a = fullScreenView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context;
        Context context2;
        context = this.f4017a.f4000b;
        if (context != null) {
            context2 = this.f4017a.f4000b;
            ((Activity) context2).onBackPressed();
        }
    }
}
