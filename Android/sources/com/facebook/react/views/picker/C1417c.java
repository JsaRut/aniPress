package com.facebook.react.views.picker;

import android.content.Context;
import android.support.v7.widget.C0392C;
import android.widget.AdapterView;

/* renamed from: com.facebook.react.views.picker.c */
/* loaded from: classes.dex */
public class C1417c extends C0392C {

    /* renamed from: j */
    private int f5194j;

    /* renamed from: k */
    private Integer f5195k;

    /* renamed from: l */
    private a f5196l;

    /* renamed from: m */
    private Integer f5197m;

    /* renamed from: n */
    private final AdapterView.OnItemSelectedListener f5198n;

    /* renamed from: o */
    private final Runnable f5199o;

    /* renamed from: com.facebook.react.views.picker.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo6036a(int i);
    }

    public C1417c(Context context, int i) {
        super(context, i);
        this.f5194j = 0;
        this.f5198n = new C1414a(this);
        this.f5199o = new RunnableC1416b(this);
        this.f5194j = i;
    }

    private void setSelectionWithSuppressEvent(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i, false);
            setOnItemSelectedListener(this.f5198n);
        }
    }

    /* renamed from: a */
    public void m6041a() {
        Integer num = this.f5197m;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.f5197m = null;
        }
    }

    public int getMode() {
        return this.f5194j;
    }

    public a getOnSelectListener() {
        return this.f5196l;
    }

    public Integer getPrimaryColor() {
        return this.f5195k;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.f5198n);
        }
    }

    @Override // android.widget.AbsSpinner, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f5199o);
    }

    public void setOnSelectListener(a aVar) {
        this.f5196l = aVar;
    }

    public void setPrimaryColor(Integer num) {
        this.f5195k = num;
    }

    public void setStagedSelection(int i) {
        this.f5197m = Integer.valueOf(i);
    }
}
