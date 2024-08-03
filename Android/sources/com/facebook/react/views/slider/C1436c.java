package com.facebook.react.views.slider;

import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: com.facebook.react.views.slider.c */
/* loaded from: classes.dex */
class C1436c implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(new C1435b(seekBar.getId(), ((C1434a) seekBar).m6113a(i), z));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(new C1437d(seekBar.getId(), ((C1434a) seekBar).m6113a(seekBar.getProgress())));
    }
}
