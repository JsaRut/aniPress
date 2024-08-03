package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.p129c.C1308h;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.C1552c;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p209a.AbstractC2062a;
import p139d.p143b.p208m.p209a.C2065d;
import p139d.p143b.p208m.p217g.C2106a;

/* renamed from: com.facebook.react.uimanager.s */
/* loaded from: classes.dex */
public class C1369s {

    /* renamed from: a */
    private static final String f5062a = "s";

    /* renamed from: b */
    private final C2065d f5063b;

    /* renamed from: c */
    private final SparseArray<View> f5064c;

    /* renamed from: d */
    private final SparseArray<ViewManager> f5065d;

    /* renamed from: e */
    private final SparseBooleanArray f5066e;

    /* renamed from: f */
    private final C1362oa f5067f;

    /* renamed from: g */
    private final C2106a f5068g;

    /* renamed from: h */
    private final RootViewManager f5069h;

    /* renamed from: i */
    private final C1308h f5070i;

    /* renamed from: j */
    private boolean f5071j;

    /* renamed from: k */
    private PopupMenu f5072k;

    /* renamed from: com.facebook.react.uimanager.s$a */
    /* loaded from: classes.dex */
    private static class a implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {

        /* renamed from: a */
        final Callback f5073a;

        /* renamed from: b */
        boolean f5074b;

        private a(Callback callback) {
            this.f5074b = false;
            this.f5073a = callback;
        }

        /* synthetic */ a(Callback callback, C1365q c1365q) {
            this(callback);
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (this.f5074b) {
                return;
            }
            this.f5073a.invoke("dismissed");
            this.f5074b = true;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f5074b) {
                return false;
            }
            this.f5073a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.f5074b = true;
            return true;
        }
    }

    public C1369s(C1362oa c1362oa) {
        this(c1362oa, new RootViewManager());
    }

    public C1369s(C1362oa c1362oa, RootViewManager rootViewManager) {
        this.f5068g = new C2106a();
        this.f5070i = new C1308h();
        this.f5063b = new C2065d();
        this.f5067f = c1362oa;
        this.f5064c = new SparseArray<>();
        this.f5065d = new SparseArray<>();
        this.f5066e = new SparseBooleanArray();
        this.f5069h = rootViewManager;
    }

    /* renamed from: a */
    private static String m5907a(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, C1352ja[] c1352jaArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 < viewGroupManager.getChildCount(viewGroup) && i2 < 16) {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + ",");
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 < iArr.length && i5 < 16) {
                        sb.append(iArr[i6] + ",");
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (c1352jaArr != null) {
            sb.append("  viewsToAdd(" + c1352jaArr.length + "): [\n");
            for (int i7 = 0; i7 < c1352jaArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 < c1352jaArr.length && i8 < 16) {
                        sb.append("[" + c1352jaArr[i9].f5010c + "," + c1352jaArr[i9].f5009b + "],");
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 < iArr2.length && i11 < 16) {
                        sb.append(iArr2[i12] + ",");
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m5908a(View view, int i, int i2, int i3, int i4) {
        if (this.f5071j && this.f5070i.m5693a(view)) {
            this.f5070i.m5690a(view, i, i2, i3, i4);
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    /* renamed from: a */
    private boolean m5909a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private C1278N m5910d(int i) {
        View view = this.f5064c.get(i);
        if (view != null) {
            return (C1278N) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    /* renamed from: a */
    public synchronized int m5911a(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.f5064c.get(i);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return C1279O.m5598a(f, f2, (ViewGroup) view);
    }

    /* renamed from: a */
    public void m5912a() {
        this.f5068g.m8449a();
    }

    /* renamed from: a */
    public synchronized void m5913a(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.f5066e.get(i)) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
            throw null;
        }
        m5926a(this.f5064c.get(i));
        this.f5066e.delete(i);
    }

    /* renamed from: a */
    public void m5914a(int i, int i2) {
        View view = this.f5064c.get(i);
        if (view != null) {
            C1345g.m5776a(view, i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:            if (r1.needsCustomLayoutForChildren() == false) goto L16;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m5915a(int r11, int r12, int r13, int r14, int r15, int r16) {
        /*
            r10 = this;
            r7 = r10
            r0 = r11
            r1 = r12
            monitor-enter(r10)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "NativeViewHierarchyManager_updateLayout"
            r8 = 0
            com.facebook.systrace.c$a r2 = com.facebook.systrace.C1552c.m6467a(r8, r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "parentTag"
            r2.mo6468a(r3, r11)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "tag"
            r2.mo6468a(r3, r12)     // Catch: java.lang.Throwable -> L89
            r2.mo6470a()     // Catch: java.lang.Throwable -> L89
            android.view.View r2 = r10.m5930b(r12)     // Catch: java.lang.Throwable -> L84
            r1 = 1073741824(0x40000000, float:2.0)
            r5 = r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r1)     // Catch: java.lang.Throwable -> L84
            r6 = r16
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)     // Catch: java.lang.Throwable -> L84
            r2.measure(r3, r1)     // Catch: java.lang.Throwable -> L84
            android.view.ViewParent r1 = r2.getParent()     // Catch: java.lang.Throwable -> L84
            boolean r3 = r1 instanceof com.facebook.react.uimanager.InterfaceC1274J     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L3b
            r1.requestLayout()     // Catch: java.lang.Throwable -> L84
        L3b:
            android.util.SparseBooleanArray r1 = r7.f5066e     // Catch: java.lang.Throwable -> L84
            boolean r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L59
            android.util.SparseArray<com.facebook.react.uimanager.ViewManager> r1 = r7.f5065d     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L84
            com.facebook.react.uimanager.ViewManager r1 = (com.facebook.react.uimanager.ViewManager) r1     // Catch: java.lang.Throwable -> L84
            boolean r3 = r1 instanceof com.facebook.react.uimanager.ViewGroupManager     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L63
            com.facebook.react.uimanager.ViewGroupManager r1 = (com.facebook.react.uimanager.ViewGroupManager) r1     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7f
            boolean r0 = r1.needsCustomLayoutForChildren()     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L7f
        L59:
            r1 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1.m5908a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L84
            goto L7f
        L63:
            com.facebook.react.uimanager.k r1 = new com.facebook.react.uimanager.k     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "Trying to use view with tag "
            r2.append(r3)     // Catch: java.lang.Throwable -> L84
            r2.append(r11)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = " as a parent, but its Manager doesn't extends ViewGroupManager"
            r2.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L7f:
            com.facebook.systrace.C1550a.m6453a(r8)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r10)
            return
        L84:
            r0 = move-exception
            com.facebook.systrace.C1550a.m6453a(r8)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1369s.m5915a(int, int, int, int, int, int):void");
    }

    /* renamed from: a */
    public synchronized void m5916a(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f5064c.get(i);
        if (view == null) {
            throw new C1353k("Trying to send command to a non-existing view with tag " + i);
        }
        m5933c(i).receiveCommand(view, i2, readableArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public synchronized void m5917a(int i, int i2, boolean z) {
        if (!z) {
            this.f5068g.m8450a(i2, (ViewParent) null);
            return;
        }
        View view = this.f5064c.get(i);
        if (i2 != i && (view instanceof ViewParent)) {
            this.f5068g.m8450a(i2, (ViewParent) view);
            return;
        }
        if (!this.f5066e.get(i)) {
            this.f5068g.m8450a(i2, view.getParent());
            return;
        }
        SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
        throw null;
    }

    /* renamed from: a */
    protected final synchronized void m5918a(int i, ViewGroup viewGroup, C1278N c1278n) {
        if (viewGroup.getId() != -1) {
            C1700a.m7006b(f5062a, "Trying to add a root view with an explicit id (" + viewGroup.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.f5064c.put(i, viewGroup);
        this.f5065d.put(i, this.f5069h);
        this.f5066e.put(i, true);
        viewGroup.setId(i);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized void m5919a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f5064c.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        this.f5072k = new PopupMenu(m5910d(i), view);
        Menu menu = this.f5072k.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        a aVar = new a(callback, null);
        this.f5072k.setOnMenuItemClickListener(aVar);
        this.f5072k.setOnDismissListener(aVar);
        this.f5072k.show();
    }

    /* renamed from: a */
    public synchronized void m5920a(int i, C1271G c1271g) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager m5933c = m5933c(i);
            View m5930b = m5930b(i);
            if (c1271g != null) {
                m5933c.updateProperties(m5930b, c1271g);
            }
        } catch (C1353k e2) {
            C1700a.m6998a(f5062a, "Unable to update properties for view tag " + i, e2);
        }
    }

    /* renamed from: a */
    public synchronized void m5921a(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, C1278N c1278n) {
        m5918a(i, (ViewGroup) sizeMonitoringFrameLayout, c1278n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m5922a(int i, AbstractC2062a abstractC2062a, Callback callback) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f5064c.get(i);
        int m8429b = abstractC2062a.m8429b();
        if (view == null) {
            throw new C1353k("View with tag " + i + " not found");
        }
        abstractC2062a.m8428a(new C1367r(this, m8429b, callback));
        abstractC2062a.m8427a(view);
    }

    /* renamed from: a */
    public synchronized void m5923a(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        m5933c(i).updateExtraData(m5930b(i), obj);
    }

    /* renamed from: a */
    public synchronized void m5924a(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f5064c.get(i);
        if (view == null) {
            throw new C1372u("No native view for " + i + " currently exists");
        }
        View view2 = (View) C1275K.m5585a(view);
        if (view2 == null) {
            throw new C1372u("Native view " + i + " is no longer on screen");
        }
        view2.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized void m5925a(int i, int[] iArr, C1352ja[] c1352jaArr, int[] iArr2) {
        UiThreadUtil.assertOnUiThread();
        ViewGroup viewGroup = (ViewGroup) this.f5064c.get(i);
        ViewGroupManager viewGroupManager = (ViewGroupManager) m5933c(i);
        if (viewGroup == null) {
            throw new C1353k("Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + m5907a(viewGroup, viewGroupManager, iArr, c1352jaArr, iArr2));
        }
        int childCount = viewGroupManager.getChildCount(viewGroup);
        if (iArr != null) {
            int length = iArr.length - 1;
            while (length >= 0) {
                int i2 = iArr[length];
                if (i2 < 0) {
                    throw new C1353k("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + m5907a(viewGroup, viewGroupManager, iArr, c1352jaArr, iArr2));
                }
                if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                    if (this.f5066e.get(i) && viewGroupManager.getChildCount(viewGroup) == 0) {
                        return;
                    }
                    throw new C1353k("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + m5907a(viewGroup, viewGroupManager, iArr, c1352jaArr, iArr2));
                }
                if (i2 >= childCount) {
                    throw new C1353k("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + m5907a(viewGroup, viewGroupManager, iArr, c1352jaArr, iArr2));
                }
                View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                if (!this.f5071j || !this.f5070i.m5693a(childAt) || !m5909a(iArr2, childAt.getId())) {
                    viewGroupManager.removeViewAt(viewGroup, i2);
                }
                length--;
                childCount = i2;
            }
        }
        if (c1352jaArr != null) {
            for (C1352ja c1352ja : c1352jaArr) {
                View view = this.f5064c.get(c1352ja.f5009b);
                if (view == null) {
                    throw new C1353k("Trying to add unknown view tag: " + c1352ja.f5009b + "\n detail: " + m5907a(viewGroup, viewGroupManager, iArr, c1352jaArr, iArr2));
                }
                viewGroupManager.addView(viewGroup, view, c1352ja.f5010c);
            }
        }
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                View view2 = this.f5064c.get(i3);
                if (view2 == null) {
                    throw new C1353k("Trying to destroy unknown view tag: " + i3 + "\n detail: " + m5907a(viewGroup, viewGroupManager, iArr, c1352jaArr, iArr2));
                }
                if (this.f5071j && this.f5070i.m5693a(view2)) {
                    this.f5070i.m5691a(view2, new C1365q(this, viewGroupManager, viewGroup, view2));
                } else {
                    m5926a(view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized void m5926a(View view) {
        UiThreadUtil.assertOnUiThread();
        if (this.f5065d.get(view.getId()) == null) {
            return;
        }
        if (!this.f5066e.get(view.getId())) {
            m5933c(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = this.f5065d.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (childAt == null) {
                    C1700a.m7006b(f5062a, "Unable to drop null child view");
                } else if (this.f5064c.get(childAt.getId()) != null) {
                    m5926a(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.f5064c.remove(view.getId());
        this.f5065d.remove(view.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5927a(ReadableMap readableMap) {
        this.f5070i.m5692a(readableMap);
    }

    /* renamed from: a */
    public synchronized void m5928a(C1278N c1278n, int i, String str, C1271G c1271g) {
        UiThreadUtil.assertOnUiThread();
        C1552c.a m6467a = C1552c.m6467a(0L, "NativeViewHierarchyManager_createView");
        m6467a.mo6468a("tag", i);
        m6467a.mo6469a("className", str);
        m6467a.mo6470a();
        try {
            ViewManager m5891a = this.f5067f.m5891a(str);
            View createView = m5891a.createView(c1278n, this.f5068g);
            this.f5064c.put(i, createView);
            this.f5065d.put(i, m5891a);
            createView.setId(i);
            if (c1271g != null) {
                m5891a.updateProperties(createView, c1271g);
            }
        } finally {
            C1550a.m6453a(0L);
        }
    }

    /* renamed from: a */
    public void m5929a(boolean z) {
        this.f5071j = z;
    }

    /* renamed from: b */
    public final synchronized View m5930b(int i) {
        View view;
        view = this.f5064c.get(i);
        if (view == null) {
            throw new C1353k("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5931b() {
        this.f5070i.m5689a();
    }

    /* renamed from: b */
    public synchronized void m5932b(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f5064c.get(i);
        if (view == null) {
            throw new C1372u("No native view for " + i + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        Resources resources = view.getContext().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
        }
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    /* renamed from: c */
    public final synchronized ViewManager m5933c(int i) {
        ViewManager viewManager;
        viewManager = this.f5065d.get(i);
        if (viewManager == null) {
            throw new C1353k("ViewManager for tag " + i + " could not be found");
        }
        return viewManager;
    }

    /* renamed from: c */
    public void m5934c() {
        PopupMenu popupMenu = this.f5072k;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    /* renamed from: d */
    public C2065d m5935d() {
        return this.f5063b;
    }
}
