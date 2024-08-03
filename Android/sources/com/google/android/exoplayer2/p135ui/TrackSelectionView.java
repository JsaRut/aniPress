package com.google.android.exoplayer2.p135ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p268l.AbstractC2575i;
import p139d.p225c.p226a.p227a.p268l.C2571e;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a */
    private final int f5881a;

    /* renamed from: b */
    private final LayoutInflater f5882b;

    /* renamed from: c */
    private final CheckedTextView f5883c;

    /* renamed from: d */
    private final CheckedTextView f5884d;

    /* renamed from: e */
    private final ViewOnClickListenerC1561a f5885e;

    /* renamed from: f */
    private boolean f5886f;

    /* renamed from: g */
    private InterfaceC1576o f5887g;

    /* renamed from: h */
    private CheckedTextView[][] f5888h;

    /* renamed from: i */
    private C2571e f5889i;

    /* renamed from: j */
    private int f5890j;

    /* renamed from: k */
    private C2413N f5891k;

    /* renamed from: l */
    private boolean f5892l;

    /* renamed from: m */
    private C2571e.e f5893m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC1561a implements View.OnClickListener {
        private ViewOnClickListenerC1561a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m6579a(view);
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        this.f5881a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.f5882b = LayoutInflater.from(context);
        this.f5885e = new ViewOnClickListenerC1561a();
        this.f5887g = new C1566e(getResources());
        this.f5883c = (CheckedTextView) this.f5882b.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f5883c.setBackgroundResource(this.f5881a);
        this.f5883c.setText(C1572k.exo_track_selection_none);
        this.f5883c.setEnabled(false);
        this.f5883c.setFocusable(true);
        this.f5883c.setOnClickListener(this.f5885e);
        this.f5883c.setVisibility(8);
        addView(this.f5883c);
        addView(this.f5882b.inflate(C1571j.exo_list_divider, (ViewGroup) this, false));
        this.f5884d = (CheckedTextView) this.f5882b.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f5884d.setBackgroundResource(this.f5881a);
        this.f5884d.setText(C1572k.exo_track_selection_auto);
        this.f5884d.setEnabled(false);
        this.f5884d.setFocusable(true);
        this.f5884d.setOnClickListener(this.f5885e);
        addView(this.f5884d);
    }

    /* renamed from: a */
    private void m6578a() {
        this.f5892l = false;
        this.f5893m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6579a(View view) {
        if (view == this.f5883c) {
            m6582b();
        } else if (view == this.f5884d) {
            m6578a();
        } else {
            m6583b(view);
        }
        m6585c();
    }

    /* renamed from: a */
    private static int[] m6581a(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    /* renamed from: b */
    private void m6582b() {
        this.f5892l = true;
        this.f5893m = null;
    }

    /* renamed from: b */
    private void m6583b(View view) {
        C2571e.e eVar;
        this.f5892l = false;
        Pair pair = (Pair) view.getTag();
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        C2571e.e eVar2 = this.f5893m;
        if (eVar2 == null || eVar2.f10713a != intValue || !this.f5886f) {
            this.f5893m = new C2571e.e(intValue, intValue2);
            return;
        }
        int i = eVar2.f10715c;
        int[] iArr = eVar2.f10714b;
        if (!((CheckedTextView) view).isChecked()) {
            eVar = new C2571e.e(intValue, m6581a(iArr, intValue2));
        } else {
            if (i == 1) {
                this.f5893m = null;
                this.f5892l = true;
                return;
            }
            eVar = new C2571e.e(intValue, m6584b(iArr, intValue2));
        }
        this.f5893m = eVar;
    }

    /* renamed from: b */
    private static int[] m6584b(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m6585c() {
        this.f5883c.setChecked(this.f5892l);
        this.f5884d.setChecked(!this.f5892l && this.f5893m == null);
        int i = 0;
        while (i < this.f5888h.length) {
            int i2 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f5888h;
                if (i2 < checkedTextViewArr[i].length) {
                    CheckedTextView checkedTextView = checkedTextViewArr[i][i2];
                    C2571e.e eVar = this.f5893m;
                    checkedTextView.setChecked(eVar != null && eVar.f10713a == i && eVar.m10872a(i2));
                    i2++;
                }
            }
            i++;
        }
    }

    /* renamed from: d */
    private void m6586d() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        C2571e c2571e = this.f5889i;
        AbstractC2575i.a m10878c = c2571e == null ? null : c2571e.m10878c();
        if (this.f5889i == null || m10878c == null) {
            this.f5883c.setEnabled(false);
            this.f5884d.setEnabled(false);
            return;
        }
        this.f5883c.setEnabled(true);
        this.f5884d.setEnabled(true);
        this.f5891k = m10878c.m10884b(this.f5890j);
        C2571e.c m10854e = this.f5889i.m10854e();
        this.f5892l = m10854e.m10865a(this.f5890j);
        this.f5893m = m10854e.m10864a(this.f5890j, this.f5891k);
        this.f5888h = new CheckedTextView[this.f5891k.f9485b];
        int i = 0;
        while (true) {
            C2413N c2413n = this.f5891k;
            if (i >= c2413n.f9485b) {
                m6585c();
                return;
            }
            C2411L m9978a = c2413n.m9978a(i);
            boolean z = this.f5886f && this.f5891k.m9978a(i).f9481a > 1 && m10878c.m10882a(this.f5890j, i, false) != 0;
            this.f5888h[i] = new CheckedTextView[m9978a.f9481a];
            for (int i2 = 0; i2 < m9978a.f9481a; i2++) {
                if (i2 == 0) {
                    addView(this.f5882b.inflate(C1571j.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f5882b.inflate(z ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f5881a);
                checkedTextView.setText(this.f5887g.mo6594a(m9978a.m9976a(i2)));
                if (m10878c.m10881a(this.f5890j, i, i2) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i), Integer.valueOf(i2)));
                    checkedTextView.setOnClickListener(this.f5885e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f5888h[i][i2] = checkedTextView;
                addView(checkedTextView);
            }
            i++;
        }
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f5886f != z) {
            this.f5886f = z;
            m6586d();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f5883c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC1576o interfaceC1576o) {
        C2628e.m11110a(interfaceC1576o);
        this.f5887g = interfaceC1576o;
        m6586d();
    }
}
