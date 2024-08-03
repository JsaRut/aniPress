package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1333f;

/* renamed from: com.facebook.react.views.textinput.e */
/* loaded from: classes.dex */
class C1484e extends InputConnectionWrapper {

    /* renamed from: a */
    private C1483d f5501a;

    /* renamed from: b */
    private C1333f f5502b;

    /* renamed from: c */
    private boolean f5503c;

    /* renamed from: d */
    private String f5504d;

    public C1484e(InputConnection inputConnection, ReactContext reactContext, C1483d c1483d) {
        super(inputConnection, false);
        this.f5504d = null;
        this.f5502b = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.f5501a = c1483d;
    }

    /* renamed from: a */
    private void m6266a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f5502b.m5753a(new C1490k(this.f5501a.getId(), str));
    }

    /* renamed from: b */
    private void m6267b(String str) {
        if (this.f5503c) {
            this.f5504d = str;
        } else {
            m6266a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f5503c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 1) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            m6267b(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        m6266a("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f5503c = false;
        String str = this.f5504d;
        if (str != null) {
            m6266a(str);
            this.f5504d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        String str;
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() != 67) {
                str = keyEvent.getKeyCode() == 66 ? "Enter" : "Backspace";
            }
            m6266a(str);
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.f5501a.getSelectionStart();
        int selectionEnd = this.f5501a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.f5501a.getSelectionStart();
        m6267b(((selectionStart2 < selectionStart || selectionStart2 <= 0) || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.f5501a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
