package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.facebook.react.devsupport.d */
/* loaded from: classes.dex */
public class C1118d {

    /* renamed from: a */
    private boolean f4381a = false;

    /* renamed from: a */
    public boolean m5215a(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.f4381a) {
                this.f4381a = false;
                return true;
            }
            this.f4381a = true;
            new Handler().postDelayed(new RunnableC1117c(this), 200L);
        }
        return false;
    }
}
