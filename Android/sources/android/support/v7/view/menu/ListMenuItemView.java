package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.InterfaceC0377w;
import android.support.v7.widget.C0479va;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0118g;
import p000a.p005b.p022d.p023a.C0121j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0377w.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0370p f1704a;

    /* renamed from: b */
    private ImageView f1705b;

    /* renamed from: c */
    private RadioButton f1706c;

    /* renamed from: d */
    private TextView f1707d;

    /* renamed from: e */
    private CheckBox f1708e;

    /* renamed from: f */
    private TextView f1709f;

    /* renamed from: g */
    private ImageView f1710g;

    /* renamed from: h */
    private ImageView f1711h;

    /* renamed from: i */
    private LinearLayout f1712i;

    /* renamed from: j */
    private Drawable f1713j;

    /* renamed from: k */
    private int f1714k;

    /* renamed from: l */
    private Context f1715l;

    /* renamed from: m */
    private boolean f1716m;

    /* renamed from: n */
    private Drawable f1717n;

    /* renamed from: o */
    private boolean f1718o;

    /* renamed from: p */
    private int f1719p;

    /* renamed from: q */
    private LayoutInflater f1720q;

    /* renamed from: r */
    private boolean f1721r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0479va m2571a = C0479va.m2571a(getContext(), attributeSet, C0121j.MenuView, i, 0);
        this.f1713j = m2571a.m2579b(C0121j.MenuView_android_itemBackground);
        this.f1714k = m2571a.m2588g(C0121j.MenuView_android_itemTextAppearance, -1);
        this.f1716m = m2571a.m2577a(C0121j.MenuView_preserveIconSpacing, false);
        this.f1715l = context;
        this.f1717n = m2571a.m2579b(C0121j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C0112a.dropDownListViewStyle, 0);
        this.f1718o = obtainStyledAttributes.hasValue(0);
        m2571a.m2576a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m1958a() {
        this.f1708e = (CheckBox) getInflater().inflate(C0118g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        m1959a(this.f1708e);
    }

    /* renamed from: a */
    private void m1959a(View view) {
        m1960a(view, -1);
    }

    /* renamed from: a */
    private void m1960a(View view, int i) {
        LinearLayout linearLayout = this.f1712i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: b */
    private void m1961b() {
        this.f1705b = (ImageView) getInflater().inflate(C0118g.abc_list_menu_item_icon, (ViewGroup) this, false);
        m1960a(this.f1705b, 0);
    }

    /* renamed from: d */
    private void m1962d() {
        this.f1706c = (RadioButton) getInflater().inflate(C0118g.abc_list_menu_item_radio, (ViewGroup) this, false);
        m1959a(this.f1706c);
    }

    private LayoutInflater getInflater() {
        if (this.f1720q == null) {
            this.f1720q = LayoutInflater.from(getContext());
        }
        return this.f1720q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1710g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w.a
    /* renamed from: a */
    public void mo1920a(C0370p c0370p, int i) {
        this.f1704a = c0370p;
        this.f1719p = i;
        setVisibility(c0370p.isVisible() ? 0 : 8);
        setTitle(c0370p.m2050a(this));
        setCheckable(c0370p.isCheckable());
        m1963a(c0370p.m2069m(), c0370p.m2058d());
        setIcon(c0370p.getIcon());
        setEnabled(c0370p.isEnabled());
        setSubMenuArrowVisible(c0370p.hasSubMenu());
        setContentDescription(c0370p.getContentDescription());
    }

    /* renamed from: a */
    public void m1963a(boolean z, char c2) {
        int i = (z && this.f1704a.m2069m()) ? 0 : 8;
        if (i == 0) {
            this.f1709f.setText(this.f1704a.m2060e());
        }
        if (this.f1709f.getVisibility() != i) {
            this.f1709f.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1711h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1711h.getLayoutParams();
        rect.top += this.f1711h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w.a
    /* renamed from: c */
    public boolean mo1923c() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w.a
    public C0370p getItemData() {
        return this.f1704a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0107v.m500a(this, this.f1713j);
        this.f1707d = (TextView) findViewById(C0117f.title);
        int i = this.f1714k;
        if (i != -1) {
            this.f1707d.setTextAppearance(this.f1715l, i);
        }
        this.f1709f = (TextView) findViewById(C0117f.shortcut);
        this.f1710g = (ImageView) findViewById(C0117f.submenuarrow);
        ImageView imageView = this.f1710g;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1717n);
        }
        this.f1711h = (ImageView) findViewById(C0117f.group_divider);
        this.f1712i = (LinearLayout) findViewById(C0117f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1705b != null && this.f1716m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1705b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f1706c == null && this.f1708e == null) {
            return;
        }
        if (this.f1704a.m2065i()) {
            if (this.f1706c == null) {
                m1962d();
            }
            compoundButton = this.f1706c;
            compoundButton2 = this.f1708e;
        } else {
            if (this.f1708e == null) {
                m1958a();
            }
            compoundButton = this.f1708e;
            compoundButton2 = this.f1706c;
        }
        if (z) {
            compoundButton.setChecked(this.f1704a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1708e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1706c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1704a.m2065i()) {
            if (this.f1706c == null) {
                m1962d();
            }
            compoundButton = this.f1706c;
        } else {
            if (this.f1708e == null) {
                m1958a();
            }
            compoundButton = this.f1708e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1721r = z;
        this.f1716m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1711h;
        if (imageView != null) {
            imageView.setVisibility((this.f1718o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1704a.m2068l() || this.f1721r;
        if (z || this.f1716m) {
            if (this.f1705b == null && drawable == null && !this.f1716m) {
                return;
            }
            if (this.f1705b == null) {
                m1961b();
            }
            if (drawable == null && !this.f1716m) {
                this.f1705b.setVisibility(8);
                return;
            }
            ImageView imageView = this.f1705b;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f1705b.getVisibility() != 0) {
                this.f1705b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f1707d.setText(charSequence);
            if (this.f1707d.getVisibility() == 0) {
                return;
            }
            textView = this.f1707d;
            i = 0;
        } else {
            i = 8;
            if (this.f1707d.getVisibility() == 8) {
                return;
            } else {
                textView = this.f1707d;
            }
        }
        textView.setVisibility(i);
    }
}
