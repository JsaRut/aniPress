package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: android.support.v7.widget.q */
/* loaded from: classes.dex */
class C0468q {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InputConnection m2548a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC0410Ka) {
                    editorInfo.hintText = ((InterfaceC0410Ka) parent).m2261a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
