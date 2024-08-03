package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.facebook.react.uimanager.la */
/* loaded from: classes.dex */
public class C1356la {

    /* renamed from: a */
    private final ViewGroup f5019a;

    /* renamed from: b */
    private int f5020b = 0;

    /* renamed from: c */
    private int[] f5021c;

    public C1356la(ViewGroup viewGroup) {
        this.f5019a = viewGroup;
    }

    /* renamed from: a */
    public int m5849a(int i, int i2) {
        if (this.f5021c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.f5019a.getChildAt(i3));
            }
            Collections.sort(arrayList, new C1354ka(this));
            this.f5021c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.f5021c[i4] = this.f5019a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.f5021c[i2];
    }

    /* renamed from: a */
    public void m5850a(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f5020b++;
        }
        this.f5021c = null;
    }

    /* renamed from: a */
    public boolean m5851a() {
        return this.f5020b > 0;
    }

    /* renamed from: b */
    public void m5852b() {
        this.f5020b = 0;
        for (int i = 0; i < this.f5019a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.f5019a.getChildAt(i)) != null) {
                this.f5020b++;
            }
        }
        this.f5021c = null;
    }

    /* renamed from: b */
    public void m5853b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f5020b--;
        }
        this.f5021c = null;
    }
}
