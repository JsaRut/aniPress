package com.swmansion.gesturehandler.react;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.EnumC1375x;
import com.facebook.react.uimanager.InterfaceC1267C;
import com.facebook.react.views.view.C1516h;
import p139d.p273d.p274a.EnumC2699p;
import p139d.p273d.p274a.InterfaceC2705v;

/* renamed from: com.swmansion.gesturehandler.react.n */
/* loaded from: classes.dex */
public class C1636n implements InterfaceC2705v {
    @Override // p139d.p273d.p274a.InterfaceC2705v
    /* renamed from: a */
    public View mo6800a(ViewGroup viewGroup, int i) {
        return viewGroup instanceof C1516h ? viewGroup.getChildAt(((C1516h) viewGroup).mo5581a(i)) : viewGroup.getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p139d.p273d.p274a.InterfaceC2705v
    /* renamed from: a */
    public EnumC2699p mo6801a(View view) {
        EnumC1375x pointerEvents = view instanceof InterfaceC1267C ? ((InterfaceC1267C) view).getPointerEvents() : EnumC1375x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == EnumC1375x.AUTO) {
                return EnumC2699p.BOX_NONE;
            }
            if (pointerEvents == EnumC1375x.BOX_ONLY) {
                return EnumC2699p.NONE;
            }
        }
        int i = C1635m.f6075a[pointerEvents.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? EnumC2699p.AUTO : EnumC2699p.NONE : EnumC2699p.BOX_NONE : EnumC2699p.BOX_ONLY;
    }

    @Override // p139d.p273d.p274a.InterfaceC2705v
    /* renamed from: a */
    public boolean mo6802a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 18 || viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof C1516h) {
            return "hidden".equals(((C1516h) viewGroup).getOverflow());
        }
        return false;
    }
}
