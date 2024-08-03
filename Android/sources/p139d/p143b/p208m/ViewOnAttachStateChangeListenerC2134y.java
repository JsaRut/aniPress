package p139d.p143b.p208m;

import android.view.View;
import com.facebook.react.devsupport.p124a.InterfaceC1114b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.y */
/* loaded from: classes.dex */
public class ViewOnAttachStateChangeListenerC2134y implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f7624a;

    /* renamed from: b */
    final /* synthetic */ C2047G f7625b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnAttachStateChangeListenerC2134y(C2047G c2047g, View view) {
        this.f7625b = c2047g;
        this.f7624a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        InterfaceC1114b interfaceC1114b;
        this.f7624a.removeOnAttachStateChangeListener(this);
        interfaceC1114b = this.f7625b.f7429i;
        interfaceC1114b.mo5203a(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
