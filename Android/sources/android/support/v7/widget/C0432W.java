package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.C0365k;
import android.support.v7.view.menu.C0366l;
import android.support.v7.view.menu.C0370p;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.W */
/* loaded from: classes.dex */
public class C0432W extends C0429U implements InterfaceC0430V {

    /* renamed from: K */
    private static Method f2286K;

    /* renamed from: L */
    private InterfaceC0430V f2287L;

    /* renamed from: android.support.v7.widget.W$a */
    /* loaded from: classes.dex */
    public static class a extends C0413N {

        /* renamed from: o */
        final int f2288o;

        /* renamed from: p */
        final int f2289p;

        /* renamed from: q */
        private InterfaceC0430V f2290q;

        /* renamed from: r */
        private MenuItem f2291r;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f2288o = 22;
                this.f2289p = 21;
            } else {
                this.f2288o = 21;
                this.f2289p = 22;
            }
        }

        @Override // android.support.v7.widget.C0413N
        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo2276a(int i, int i2, int i3, int i4, int i5) {
            return super.mo2276a(i, i2, i3, i4, i5);
        }

        @Override // android.support.v7.widget.C0413N
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo2277a(MotionEvent motionEvent, int i) {
            return super.mo2277a(motionEvent, i);
        }

        @Override // android.support.v7.widget.C0413N, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // android.support.v7.widget.C0413N, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // android.support.v7.widget.C0413N, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // android.support.v7.widget.C0413N, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // android.support.v7.widget.C0413N, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f2290q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0365k c0365k = (C0365k) adapter;
                C0370p c0370p = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0365k.getCount()) {
                    c0370p = c0365k.getItem(i2);
                }
                MenuItem menuItem = this.f2291r;
                if (menuItem != c0370p) {
                    C0366l m1998b = c0365k.m1998b();
                    if (menuItem != null) {
                        this.f2290q.mo1983b(m1998b, menuItem);
                    }
                    this.f2291r = c0370p;
                    if (c0370p != null) {
                        this.f2290q.mo1982a(m1998b, c0370p);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2288o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f2289p) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ((C0365k) getAdapter()).m1998b().m2020a(false);
            return true;
        }

        @Override // android.support.v7.widget.C0413N, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0430V interfaceC0430V) {
            this.f2290q = interfaceC0430V;
        }

        @Override // android.support.v7.widget.C0413N, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f2286K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0432W(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.support.v7.widget.C0429U
    /* renamed from: a */
    C0413N mo2391a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // android.support.v7.widget.InterfaceC0430V
    /* renamed from: a */
    public void mo1982a(C0366l c0366l, MenuItem menuItem) {
        InterfaceC0430V interfaceC0430V = this.f2287L;
        if (interfaceC0430V != null) {
            interfaceC0430V.mo1982a(c0366l, menuItem);
        }
    }

    /* renamed from: a */
    public void m2418a(InterfaceC0430V interfaceC0430V) {
        this.f2287L = interfaceC0430V;
    }

    /* renamed from: a */
    public void m2419a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2252J.setEnterTransition((Transition) obj);
        }
    }

    @Override // android.support.v7.widget.InterfaceC0430V
    /* renamed from: b */
    public void mo1983b(C0366l c0366l, MenuItem menuItem) {
        InterfaceC0430V interfaceC0430V = this.f2287L;
        if (interfaceC0430V != null) {
            interfaceC0430V.mo1983b(c0366l, menuItem);
        }
    }

    /* renamed from: b */
    public void m2420b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2252J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void m2421c(boolean z) {
        Method method = f2286K;
        if (method != null) {
            try {
                method.invoke(this.f2252J, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
