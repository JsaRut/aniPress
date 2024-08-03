package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.yoga.C1554b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.react.views.progressbar.b */
/* loaded from: classes.dex */
public class C1419b extends C1359n implements YogaMeasureFunction {

    /* renamed from: w */
    private String f5205w = "Normal";

    /* renamed from: x */
    private final SparseIntArray f5206x = new SparseIntArray();

    /* renamed from: y */
    private final SparseIntArray f5207y = new SparseIntArray();

    /* renamed from: z */
    private final Set<Integer> f5208z = new HashSet();

    public C1419b() {
        m6049O();
    }

    /* renamed from: O */
    private void m6049O() {
        m5544a((YogaMeasureFunction) this);
    }

    /* renamed from: N */
    public String m6050N() {
        return this.f5205w;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(m6050N());
        if (!this.f5208z.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(mo5513p(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.f5206x.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.f5207y.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.f5208z.add(Integer.valueOf(styleFromString));
        }
        return C1554b.m6546a(this.f5207y.get(styleFromString), this.f5206x.get(styleFromString));
    }

    @InterfaceC1294a(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f5205w = str;
    }
}
