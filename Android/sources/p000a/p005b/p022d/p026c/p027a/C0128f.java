package p000a.p005b.p022d.p026c.p027a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p000a.p005b.p022d.p026c.p027a.C0126d;

/* renamed from: a.b.d.c.a.f */
/* loaded from: classes.dex */
class C0128f extends C0126d {

    /* renamed from: n */
    private a f484n;

    /* renamed from: o */
    private boolean f485o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.d.c.a.f$a */
    /* loaded from: classes.dex */
    public static class a extends C0126d.b {

        /* renamed from: J */
        int[][] f486J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, C0128f c0128f, Resources resources) {
            super(aVar, c0128f, resources);
            this.f486J = aVar != null ? aVar.f486J : new int[m601c()];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m615a(int[] iArr) {
            int[][] iArr2 = this.f486J;
            int m603d = m603d();
            for (int i = 0; i < m603d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m616a(int[] iArr, Drawable drawable) {
            int m590a = m590a(drawable);
            this.f486J[m590a] = iArr;
            return m590a;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0126d.b
        /* renamed from: a */
        public void mo592a(int i, int i2) {
            super.mo592a(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f486J, 0, iArr, 0, i);
            this.f486J = iArr;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0126d.b
        /* renamed from: m */
        void mo574m() {
            int[][] iArr = this.f486J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f486J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f486J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0128f(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0128f(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0128f(a aVar) {
        if (aVar != null) {
            mo562a(aVar);
        }
    }

    C0128f(a aVar, Resources resources) {
        mo562a(new a(aVar, this, resources));
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p005b.p022d.p026c.p027a.C0126d
    /* renamed from: a */
    public a mo561a() {
        return new a(this.f484n, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p005b.p022d.p026c.p027a.C0126d
    /* renamed from: a */
    public void mo562a(C0126d.b bVar) {
        super.mo562a(bVar);
        if (bVar instanceof a) {
            this.f484n = (a) bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m614a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f485o) {
            super.mutate();
            if (this == this) {
                this.f484n.mo574m();
                this.f485o = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m615a = this.f484n.m615a(iArr);
        if (m615a < 0) {
            m615a = this.f484n.m615a(StateSet.WILD_CARD);
        }
        return m584a(m615a) || onStateChange;
    }
}
