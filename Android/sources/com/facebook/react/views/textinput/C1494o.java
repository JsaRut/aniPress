package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.widget.TextView;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: com.facebook.react.views.textinput.o */
/* loaded from: classes.dex */
public class C1494o implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ C1483d f5525a;

    /* renamed from: b */
    final /* synthetic */ C1278N f5526b;

    /* renamed from: c */
    final /* synthetic */ ReactTextInputManager f5527c;

    public C1494o(ReactTextInputManager reactTextInputManager, C1483d c1483d, C1278N c1278n) {
        this.f5527c = reactTextInputManager;
        this.f5525a = c1483d;
        this.f5526b = c1278n;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if ((i & 255) <= 0 && i != 0) {
            if (i == 5) {
                return (textView.focusSearch(2) == null || textView.requestFocus(2)) ? false : true;
            }
            return true;
        }
        boolean blurOnSubmit = this.f5525a.getBlurOnSubmit();
        boolean z = (this.f5525a.getInputType() & 131072) != 0;
        ((UIManagerModule) this.f5526b.getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(new C1497r(this.f5525a.getId(), this.f5525a.getText().toString()));
        if (blurOnSubmit) {
            this.f5525a.clearFocus();
        }
        return blurOnSubmit || !z;
    }
}
