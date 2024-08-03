package com.facebook.react.uimanager;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.ka */
/* loaded from: classes.dex */
public class C1354ka implements Comparator<View> {

    /* renamed from: a */
    final /* synthetic */ C1356la f5012a;

    public C1354ka(C1356la c1356la) {
        this.f5012a = c1356la;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(View view, View view2) {
        Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
        if (viewZIndex == null) {
            viewZIndex = 0;
        }
        Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
        if (viewZIndex2 == null) {
            viewZIndex2 = 0;
        }
        return viewZIndex.intValue() - viewZIndex2.intValue();
    }
}
