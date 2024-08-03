package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuC0046a;
import p000a.p005b.p009c.p019h.C0108w;

/* renamed from: android.support.v7.view.menu.l */
/* loaded from: classes.dex */
public class C0366l implements InterfaceMenuC0046a {

    /* renamed from: a */
    private static final int[] f1812a = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f1813A;

    /* renamed from: b */
    private final Context f1814b;

    /* renamed from: c */
    private final Resources f1815c;

    /* renamed from: d */
    private boolean f1816d;

    /* renamed from: e */
    private boolean f1817e;

    /* renamed from: f */
    private a f1818f;

    /* renamed from: n */
    private ContextMenu.ContextMenuInfo f1826n;

    /* renamed from: o */
    CharSequence f1827o;

    /* renamed from: p */
    Drawable f1828p;

    /* renamed from: q */
    View f1829q;

    /* renamed from: y */
    private C0370p f1837y;

    /* renamed from: m */
    private int f1825m = 0;

    /* renamed from: r */
    private boolean f1830r = false;

    /* renamed from: s */
    private boolean f1831s = false;

    /* renamed from: t */
    private boolean f1832t = false;

    /* renamed from: u */
    private boolean f1833u = false;

    /* renamed from: v */
    private boolean f1834v = false;

    /* renamed from: w */
    private ArrayList<C0370p> f1835w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0376v>> f1836x = new CopyOnWriteArrayList<>();

    /* renamed from: z */
    private boolean f1838z = false;

    /* renamed from: g */
    private ArrayList<C0370p> f1819g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<C0370p> f1820h = new ArrayList<>();

    /* renamed from: i */
    private boolean f1821i = true;

    /* renamed from: j */
    private ArrayList<C0370p> f1822j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0370p> f1823k = new ArrayList<>();

    /* renamed from: l */
    private boolean f1824l = true;

    /* renamed from: android.support.v7.view.menu.l$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo650a(C0366l c0366l);

        /* renamed from: a */
        boolean mo651a(C0366l c0366l, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo1957a(C0370p c0370p);
    }

    public C0366l(Context context) {
        this.f1814b = context;
        this.f1815c = context.getResources();
        m2005e(true);
    }

    /* renamed from: a */
    private static int m1999a(ArrayList<C0370p> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m2056c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0370p m2000a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0370p(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m2001a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m2042l = m2042l();
        if (view != null) {
            this.f1829q = view;
            this.f1827o = null;
            this.f1828p = null;
        } else {
            if (i > 0) {
                this.f1827o = m2042l.getText(i);
            } else if (charSequence != null) {
                this.f1827o = charSequence;
            }
            if (i2 > 0) {
                this.f1828p = C0022a.m92c(m2034e(), i2);
            } else if (drawable != null) {
                this.f1828p = drawable;
            }
            this.f1829q = null;
        }
        m2027b(false);
    }

    /* renamed from: a */
    private void m2002a(int i, boolean z) {
        if (i < 0 || i >= this.f1819g.size()) {
            return;
        }
        this.f1819g.remove(i);
        if (z) {
            m2027b(true);
        }
    }

    /* renamed from: a */
    private boolean m2003a(SubMenuC0353D subMenuC0353D, InterfaceC0376v interfaceC0376v) {
        if (this.f1836x.isEmpty()) {
            return false;
        }
        boolean mo1937a = interfaceC0376v != null ? interfaceC0376v.mo1937a(subMenuC0353D) : false;
        Iterator<WeakReference<InterfaceC0376v>> it = this.f1836x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0376v> next = it.next();
            InterfaceC0376v interfaceC0376v2 = next.get();
            if (interfaceC0376v2 == null) {
                this.f1836x.remove(next);
            } else if (!mo1937a) {
                mo1937a = interfaceC0376v2.mo1937a(subMenuC0353D);
            }
        }
        return mo1937a;
    }

    /* renamed from: d */
    private void m2004d(boolean z) {
        if (this.f1836x.isEmpty()) {
            return;
        }
        m2045s();
        Iterator<WeakReference<InterfaceC0376v>> it = this.f1836x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0376v> next = it.next();
            InterfaceC0376v interfaceC0376v = next.get();
            if (interfaceC0376v == null) {
                this.f1836x.remove(next);
            } else {
                interfaceC0376v.mo1935a(z);
            }
        }
        m2044r();
    }

    /* renamed from: e */
    private void m2005e(boolean z) {
        this.f1817e = z && this.f1815c.getConfiguration().keyboard != 1 && C0108w.m544a(ViewConfiguration.get(this.f1814b), this.f1814b);
    }

    /* renamed from: f */
    private static int m2006f(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1812a;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public int m2007a(int i) {
        return m2008a(i, 0);
    }

    /* renamed from: a */
    public int m2008a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1819g.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public C0366l m2009a(Drawable drawable) {
        m2001a(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: a */
    public C0366l m2010a(View view) {
        m2001a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    public C0366l m2011a(CharSequence charSequence) {
        m2001a(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: a */
    C0370p m2012a(int i, KeyEvent keyEvent) {
        ArrayList<C0370p> arrayList = this.f1835w;
        arrayList.clear();
        m2019a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo1952p = mo1952p();
        for (int i2 = 0; i2 < size; i2++) {
            C0370p c0370p = arrayList.get(i2);
            char alphabeticShortcut = mo1952p ? c0370p.getAlphabeticShortcut() : c0370p.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (mo1952p && alphabeticShortcut == '\b' && i == 67))) {
                return c0370p;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected MenuItem m2013a(int i, int i2, int i3, CharSequence charSequence) {
        int m2006f = m2006f(i3);
        C0370p m2000a = m2000a(i, i2, i3, m2006f, charSequence, this.f1825m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1826n;
        if (contextMenuInfo != null) {
            m2000a.m2052a(contextMenuInfo);
        }
        ArrayList<C0370p> arrayList = this.f1819g;
        arrayList.add(m1999a(arrayList, m2006f), m2000a);
        m2027b(true);
        return m2000a;
    }

    /* renamed from: a */
    public void m2014a() {
        a aVar = this.f1818f;
        if (aVar != null) {
            aVar.mo650a(this);
        }
    }

    /* renamed from: a */
    public void m2015a(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1949d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0353D) item.getSubMenu()).m2015a(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: a */
    public void mo1945a(a aVar) {
        this.f1818f = aVar;
    }

    /* renamed from: a */
    public void m2016a(InterfaceC0376v interfaceC0376v) {
        m2017a(interfaceC0376v, this.f1814b);
    }

    /* renamed from: a */
    public void m2017a(InterfaceC0376v interfaceC0376v, Context context) {
        this.f1836x.add(new WeakReference<>(interfaceC0376v));
        interfaceC0376v.mo1968a(context, this);
        this.f1824l = true;
    }

    /* renamed from: a */
    public void m2018a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1819g.size();
        m2045s();
        for (int i = 0; i < size; i++) {
            C0370p c0370p = this.f1819g.get(i);
            if (c0370p.getGroupId() == groupId && c0370p.m2065i() && c0370p.isCheckable()) {
                c0370p.m2055b(c0370p == menuItem);
            }
        }
        m2044r();
    }

    /* renamed from: a */
    void m2019a(List<C0370p> list, int i, KeyEvent keyEvent) {
        boolean mo1952p = mo1952p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1819g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0370p c0370p = this.f1819g.get(i2);
                if (c0370p.hasSubMenu()) {
                    ((C0366l) c0370p.getSubMenu()).m2019a(list, i, keyEvent);
                }
                char alphabeticShortcut = mo1952p ? c0370p.getAlphabeticShortcut() : c0370p.getNumericShortcut();
                if (((modifiers & 69647) == ((mo1952p ? c0370p.getAlphabeticModifiers() : c0370p.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo1952p && alphabeticShortcut == '\b' && i == 67)) && c0370p.isEnabled()) {
                        list.add(c0370p);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2020a(boolean z) {
        if (this.f1834v) {
            return;
        }
        this.f1834v = true;
        Iterator<WeakReference<InterfaceC0376v>> it = this.f1836x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0376v> next = it.next();
            InterfaceC0376v interfaceC0376v = next.get();
            if (interfaceC0376v == null) {
                this.f1836x.remove(next);
            } else {
                interfaceC0376v.mo1931a(this, z);
            }
        }
        this.f1834v = false;
    }

    /* renamed from: a */
    public boolean mo1946a(C0366l c0366l, MenuItem menuItem) {
        a aVar = this.f1818f;
        return aVar != null && aVar.mo651a(c0366l, menuItem);
    }

    /* renamed from: a */
    public boolean mo1947a(C0370p c0370p) {
        boolean z = false;
        if (!this.f1836x.isEmpty() && this.f1837y == c0370p) {
            m2045s();
            Iterator<WeakReference<InterfaceC0376v>> it = this.f1836x.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0376v> next = it.next();
                InterfaceC0376v interfaceC0376v = next.get();
                if (interfaceC0376v == null) {
                    this.f1836x.remove(next);
                } else {
                    z = interfaceC0376v.mo1976b(this, c0370p);
                    if (z) {
                        break;
                    }
                }
            }
            m2044r();
            if (z) {
                this.f1837y = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m2021a(MenuItem menuItem, int i) {
        return m2022a(menuItem, (InterfaceC0376v) null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:            if (r1 != false) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:            m2020a(true);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:            if ((r9 & 1) == 0) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:            if (r1 == false) goto L95;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m2022a(android.view.MenuItem r7, android.support.v7.view.menu.InterfaceC0376v r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.p r7 = (android.support.v7.view.menu.C0370p) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.m2063g()
            a.b.c.h.e r2 = r7.mo230a()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.mo423a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.m2062f()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.m2020a(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.m2020a(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            android.support.v7.view.menu.D r9 = new android.support.v7.view.menu.D
            android.content.Context r0 = r6.m2034e()
            r9.<init>(r0, r6, r7)
            r7.m2051a(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.D r7 = (android.support.v7.view.menu.SubMenuC0353D) r7
            if (r4 == 0) goto L63
            r2.mo422a(r7)
        L63:
            boolean r7 = r6.m2003a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.C0366l.m2022a(android.view.MenuItem, android.support.v7.view.menu.v, int):boolean");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m2013a(0, 0, 0, this.f1815c.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2013a(i, i2, i3, this.f1815c.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2013a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m2013a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1814b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1815c.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1815c.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0370p c0370p = (C0370p) m2013a(i, i2, i3, charSequence);
        SubMenuC0353D subMenuC0353D = new SubMenuC0353D(this.f1814b, this, c0370p);
        c0370p.m2051a(subMenuC0353D);
        return subMenuC0353D;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int m2023b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1819g.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m2024b() {
        ArrayList<C0370p> m2043n = m2043n();
        if (this.f1824l) {
            Iterator<WeakReference<InterfaceC0376v>> it = this.f1836x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0376v> next = it.next();
                InterfaceC0376v interfaceC0376v = next.get();
                if (interfaceC0376v == null) {
                    this.f1836x.remove(next);
                } else {
                    z |= interfaceC0376v.mo1936a();
                }
            }
            if (z) {
                this.f1822j.clear();
                this.f1823k.clear();
                int size = m2043n.size();
                for (int i = 0; i < size; i++) {
                    C0370p c0370p = m2043n.get(i);
                    (c0370p.m2064h() ? this.f1822j : this.f1823k).add(c0370p);
                }
            } else {
                this.f1822j.clear();
                this.f1823k.clear();
                this.f1823k.addAll(m2043n());
            }
            this.f1824l = false;
        }
    }

    /* renamed from: b */
    public void m2025b(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0353D) item.getSubMenu()).m2025b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1949d(), sparseArray);
        }
    }

    /* renamed from: b */
    public void m2026b(InterfaceC0376v interfaceC0376v) {
        Iterator<WeakReference<InterfaceC0376v>> it = this.f1836x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0376v> next = it.next();
            InterfaceC0376v interfaceC0376v2 = next.get();
            if (interfaceC0376v2 == null || interfaceC0376v2 == interfaceC0376v) {
                this.f1836x.remove(next);
            }
        }
    }

    /* renamed from: b */
    public void m2027b(boolean z) {
        if (this.f1830r) {
            this.f1831s = true;
            if (z) {
                this.f1832t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f1821i = true;
            this.f1824l = true;
        }
        m2004d(z);
    }

    /* renamed from: b */
    public boolean mo1948b(C0370p c0370p) {
        boolean z = false;
        if (this.f1836x.isEmpty()) {
            return false;
        }
        m2045s();
        Iterator<WeakReference<InterfaceC0376v>> it = this.f1836x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0376v> next = it.next();
            InterfaceC0376v interfaceC0376v = next.get();
            if (interfaceC0376v == null) {
                this.f1836x.remove(next);
            } else {
                z = interfaceC0376v.mo1972a(this, c0370p);
                if (z) {
                    break;
                }
            }
        }
        m2044r();
        if (z) {
            this.f1837y = c0370p;
        }
        return z;
    }

    /* renamed from: c */
    public C0366l m2028c(int i) {
        this.f1825m = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0370p> m2029c() {
        m2024b();
        return this.f1822j;
    }

    /* renamed from: c */
    public void m2030c(C0370p c0370p) {
        this.f1824l = true;
        m2027b(true);
    }

    /* renamed from: c */
    public void m2031c(boolean z) {
        this.f1813A = z;
    }

    @Override // android.view.Menu
    public void clear() {
        C0370p c0370p = this.f1837y;
        if (c0370p != null) {
            mo1947a(c0370p);
        }
        this.f1819g.clear();
        m2027b(true);
    }

    public void clearHeader() {
        this.f1828p = null;
        this.f1827o = null;
        this.f1829q = null;
        m2027b(false);
    }

    @Override // android.view.Menu
    public void close() {
        m2020a(true);
    }

    /* renamed from: d */
    public C0366l m2032d(int i) {
        m2001a(0, null, i, null, null);
        return this;
    }

    /* renamed from: d */
    public String mo1949d() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: d */
    public void m2033d(C0370p c0370p) {
        this.f1821i = true;
        m2027b(true);
    }

    /* renamed from: e */
    public Context m2034e() {
        return this.f1814b;
    }

    /* renamed from: e */
    public C0366l m2035e(int i) {
        m2001a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: f */
    public C0370p m2036f() {
        return this.f1837y;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0370p c0370p = this.f1819g.get(i2);
            if (c0370p.getItemId() == i) {
                return c0370p;
            }
            if (c0370p.hasSubMenu() && (findItem = c0370p.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable m2037g() {
        return this.f1828p;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1819g.get(i);
    }

    /* renamed from: h */
    public CharSequence m2038h() {
        return this.f1827o;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1813A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1819g.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View m2039i() {
        return this.f1829q;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2012a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0370p> m2040j() {
        m2024b();
        return this.f1823k;
    }

    /* renamed from: k */
    public boolean m2041k() {
        return this.f1833u;
    }

    /* renamed from: l */
    Resources m2042l() {
        return this.f1815c;
    }

    /* renamed from: m */
    public C0366l mo1950m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0370p> m2043n() {
        if (!this.f1821i) {
            return this.f1820h;
        }
        this.f1820h.clear();
        int size = this.f1819g.size();
        for (int i = 0; i < size; i++) {
            C0370p c0370p = this.f1819g.get(i);
            if (c0370p.isVisible()) {
                this.f1820h.add(c0370p);
            }
        }
        this.f1821i = false;
        this.f1824l = true;
        return this.f1820h;
    }

    /* renamed from: o */
    public boolean mo1951o() {
        return this.f1838z;
    }

    /* renamed from: p */
    public boolean mo1952p() {
        return this.f1816d;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m2021a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0370p m2012a = m2012a(i, keyEvent);
        boolean m2021a = m2012a != null ? m2021a(m2012a, i2) : false;
        if ((i2 & 2) != 0) {
            m2020a(true);
        }
        return m2021a;
    }

    /* renamed from: q */
    public boolean mo1953q() {
        return this.f1817e;
    }

    /* renamed from: r */
    public void m2044r() {
        this.f1830r = false;
        if (this.f1831s) {
            this.f1831s = false;
            m2027b(this.f1832t);
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m2007a = m2007a(i);
        if (m2007a >= 0) {
            int size = this.f1819g.size() - m2007a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1819g.get(m2007a).getGroupId() != i) {
                    break;
                }
                m2002a(m2007a, false);
                i2 = i3;
            }
            m2027b(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m2002a(m2023b(i), true);
    }

    /* renamed from: s */
    public void m2045s() {
        if (this.f1830r) {
            return;
        }
        this.f1830r = true;
        this.f1831s = false;
        this.f1832t = false;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1819g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0370p c0370p = this.f1819g.get(i2);
            if (c0370p.getGroupId() == i) {
                c0370p.m2057c(z2);
                c0370p.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1838z = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1819g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0370p c0370p = this.f1819g.get(i2);
            if (c0370p.getGroupId() == i) {
                c0370p.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1819g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0370p c0370p = this.f1819g.get(i2);
            if (c0370p.getGroupId() == i && c0370p.m2061e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m2027b(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1816d = z;
        m2027b(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1819g.size();
    }
}
