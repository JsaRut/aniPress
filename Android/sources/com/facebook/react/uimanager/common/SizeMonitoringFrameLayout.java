package com.facebook.react.uimanager.common;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class SizeMonitoringFrameLayout extends FrameLayout {

    /* renamed from: a */
    private InterfaceC1320a f4860a;

    /* renamed from: com.facebook.react.uimanager.common.SizeMonitoringFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1320a {
        /* renamed from: a */
        void mo5673a(int i, int i2, int i3, int i4);
    }

    public SizeMonitoringFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC1320a interfaceC1320a = this.f4860a;
        if (interfaceC1320a != null) {
            interfaceC1320a.mo5673a(i, i2, i3, i4);
        }
    }

    public void setOnSizeChangedListener(InterfaceC1320a interfaceC1320a) {
        this.f4860a = interfaceC1320a;
    }
}
