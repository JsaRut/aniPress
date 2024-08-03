package p000a.p005b.p022d.p029e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v7.view.menu.C0370p;
import android.support.v7.view.menu.MenuItemC0371q;
import android.support.v7.widget.C0412M;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuC0046a;
import p000a.p005b.p009c.p019h.AbstractC0090e;
import p000a.p005b.p009c.p019h.C0095j;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: a.b.d.e.g */
/* loaded from: classes.dex */
public class C0136g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f509a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f510b = f509a;

    /* renamed from: c */
    final Object[] f511c;

    /* renamed from: d */
    final Object[] f512d;

    /* renamed from: e */
    Context f513e;

    /* renamed from: f */
    private Object f514f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.d.e.g$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f515a = {MenuItem.class};

        /* renamed from: b */
        private Object f516b;

        /* renamed from: c */
        private Method f517c;

        public a(Object obj, String str) {
            this.f516b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f517c = cls.getMethod(str, f515a);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f517c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f517c.invoke(this.f516b, menuItem)).booleanValue();
                }
                this.f517c.invoke(this.f516b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.d.e.g$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: A */
        AbstractC0090e f518A;

        /* renamed from: B */
        private CharSequence f519B;

        /* renamed from: C */
        private CharSequence f520C;

        /* renamed from: D */
        private ColorStateList f521D = null;

        /* renamed from: E */
        private PorterDuff.Mode f522E = null;

        /* renamed from: a */
        private Menu f524a;

        /* renamed from: b */
        private int f525b;

        /* renamed from: c */
        private int f526c;

        /* renamed from: d */
        private int f527d;

        /* renamed from: e */
        private int f528e;

        /* renamed from: f */
        private boolean f529f;

        /* renamed from: g */
        private boolean f530g;

        /* renamed from: h */
        private boolean f531h;

        /* renamed from: i */
        private int f532i;

        /* renamed from: j */
        private int f533j;

        /* renamed from: k */
        private CharSequence f534k;

        /* renamed from: l */
        private CharSequence f535l;

        /* renamed from: m */
        private int f536m;

        /* renamed from: n */
        private char f537n;

        /* renamed from: o */
        private int f538o;

        /* renamed from: p */
        private char f539p;

        /* renamed from: q */
        private int f540q;

        /* renamed from: r */
        private int f541r;

        /* renamed from: s */
        private boolean f542s;

        /* renamed from: t */
        private boolean f543t;

        /* renamed from: u */
        private boolean f544u;

        /* renamed from: v */
        private int f545v;

        /* renamed from: w */
        private int f546w;

        /* renamed from: x */
        private String f547x;

        /* renamed from: y */
        private String f548y;

        /* renamed from: z */
        private String f549z;

        public b(Menu menu) {
            this.f524a = menu;
            m665d();
        }

        /* renamed from: a */
        private char m657a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m658a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0136g.this.f513e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        /* renamed from: a */
        private void m659a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f542s).setVisible(this.f543t).setEnabled(this.f544u).setCheckable(this.f541r >= 1).setTitleCondensed(this.f535l).setIcon(this.f536m);
            int i = this.f545v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f549z != null) {
                if (C0136g.this.f513e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C0136g.this.m656a(), this.f549z));
            }
            boolean z2 = menuItem instanceof C0370p;
            if (z2) {
            }
            if (this.f541r >= 2) {
                if (z2) {
                    ((C0370p) menuItem).m2057c(true);
                } else if (menuItem instanceof MenuItemC0371q) {
                    ((MenuItemC0371q) menuItem).m2072a(true);
                }
            }
            String str = this.f547x;
            if (str != null) {
                menuItem.setActionView((View) m658a(str, C0136g.f509a, C0136g.this.f511c));
                z = true;
            }
            int i2 = this.f546w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC0090e abstractC0090e = this.f518A;
            if (abstractC0090e != null) {
                C0095j.m441a(menuItem, abstractC0090e);
            }
            C0095j.m445a(menuItem, this.f519B);
            C0095j.m447b(menuItem, this.f520C);
            C0095j.m442a(menuItem, this.f537n, this.f538o);
            C0095j.m446b(menuItem, this.f539p, this.f540q);
            PorterDuff.Mode mode = this.f522E;
            if (mode != null) {
                C0095j.m444a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f521D;
            if (colorStateList != null) {
                C0095j.m443a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m660a() {
            this.f531h = true;
            m659a(this.f524a.add(this.f525b, this.f532i, this.f533j, this.f534k));
        }

        /* renamed from: a */
        public void m661a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0136g.this.f513e.obtainStyledAttributes(attributeSet, C0121j.MenuGroup);
            this.f525b = obtainStyledAttributes.getResourceId(C0121j.MenuGroup_android_id, 0);
            this.f526c = obtainStyledAttributes.getInt(C0121j.MenuGroup_android_menuCategory, 0);
            this.f527d = obtainStyledAttributes.getInt(C0121j.MenuGroup_android_orderInCategory, 0);
            this.f528e = obtainStyledAttributes.getInt(C0121j.MenuGroup_android_checkableBehavior, 0);
            this.f529f = obtainStyledAttributes.getBoolean(C0121j.MenuGroup_android_visible, true);
            this.f530g = obtainStyledAttributes.getBoolean(C0121j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public SubMenu m662b() {
            this.f531h = true;
            SubMenu addSubMenu = this.f524a.addSubMenu(this.f525b, this.f532i, this.f533j, this.f534k);
            m659a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m663b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0136g.this.f513e.obtainStyledAttributes(attributeSet, C0121j.MenuItem);
            this.f532i = obtainStyledAttributes.getResourceId(C0121j.MenuItem_android_id, 0);
            this.f533j = (obtainStyledAttributes.getInt(C0121j.MenuItem_android_menuCategory, this.f526c) & (-65536)) | (obtainStyledAttributes.getInt(C0121j.MenuItem_android_orderInCategory, this.f527d) & 65535);
            this.f534k = obtainStyledAttributes.getText(C0121j.MenuItem_android_title);
            this.f535l = obtainStyledAttributes.getText(C0121j.MenuItem_android_titleCondensed);
            this.f536m = obtainStyledAttributes.getResourceId(C0121j.MenuItem_android_icon, 0);
            this.f537n = m657a(obtainStyledAttributes.getString(C0121j.MenuItem_android_alphabeticShortcut));
            this.f538o = obtainStyledAttributes.getInt(C0121j.MenuItem_alphabeticModifiers, 4096);
            this.f539p = m657a(obtainStyledAttributes.getString(C0121j.MenuItem_android_numericShortcut));
            this.f540q = obtainStyledAttributes.getInt(C0121j.MenuItem_numericModifiers, 4096);
            this.f541r = obtainStyledAttributes.hasValue(C0121j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0121j.MenuItem_android_checkable, false) : this.f528e;
            this.f542s = obtainStyledAttributes.getBoolean(C0121j.MenuItem_android_checked, false);
            this.f543t = obtainStyledAttributes.getBoolean(C0121j.MenuItem_android_visible, this.f529f);
            this.f544u = obtainStyledAttributes.getBoolean(C0121j.MenuItem_android_enabled, this.f530g);
            this.f545v = obtainStyledAttributes.getInt(C0121j.MenuItem_showAsAction, -1);
            this.f549z = obtainStyledAttributes.getString(C0121j.MenuItem_android_onClick);
            this.f546w = obtainStyledAttributes.getResourceId(C0121j.MenuItem_actionLayout, 0);
            this.f547x = obtainStyledAttributes.getString(C0121j.MenuItem_actionViewClass);
            this.f548y = obtainStyledAttributes.getString(C0121j.MenuItem_actionProviderClass);
            boolean z = this.f548y != null;
            if (z && this.f546w == 0 && this.f547x == null) {
                this.f518A = (AbstractC0090e) m658a(this.f548y, C0136g.f510b, C0136g.this.f512d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f518A = null;
            }
            this.f519B = obtainStyledAttributes.getText(C0121j.MenuItem_contentDescription);
            this.f520C = obtainStyledAttributes.getText(C0121j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0121j.MenuItem_iconTintMode)) {
                this.f522E = C0412M.m2262a(obtainStyledAttributes.getInt(C0121j.MenuItem_iconTintMode, -1), this.f522E);
            } else {
                this.f522E = null;
            }
            if (obtainStyledAttributes.hasValue(C0121j.MenuItem_iconTint)) {
                this.f521D = obtainStyledAttributes.getColorStateList(C0121j.MenuItem_iconTint);
            } else {
                this.f521D = null;
            }
            obtainStyledAttributes.recycle();
            this.f531h = false;
        }

        /* renamed from: c */
        public boolean m664c() {
            return this.f531h;
        }

        /* renamed from: d */
        public void m665d() {
            this.f525b = 0;
            this.f526c = 0;
            this.f527d = 0;
            this.f528e = 0;
            this.f529f = true;
            this.f530g = true;
        }
    }

    public C0136g(Context context) {
        super(context);
        this.f513e = context;
        this.f511c = new Object[]{context};
        this.f512d = this.f511c;
    }

    /* renamed from: a */
    private Object m654a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m654a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:            if (r6 == 2) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:            if (r6 == 3) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:            r6 = r13.getName();     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:            if (r7 == false) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:            if (r6.equals(r8) == false) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:            r8 = null;        r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:            r6 = r13.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:            if (r6.equals("group") == false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:            r0.m665d();     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:            if (r6.equals("item") == false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:            if (r0.m664c() != false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:            r6 = r0.f518A;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:            if (r6 == null) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:            if (r6.mo423a() == false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:            r0.m662b();     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:            r0.m660a();     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:            if (r6.equals("menu") == false) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:            r15 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:            if (r7 == false) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:            r6 = r13.getName();     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:            if (r6.equals("group") == false) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:            r0.m661a(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:            if (r6.equals("item") == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:            r0.m663b(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:            if (r6.equals("menu") == false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:            m655a(r13, r14, r0.m662b());     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:            r8 = r6;        r7 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c6, code lost:            throw new java.lang.RuntimeException("Unexpected end of document");     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:            r6 = r15;        r8 = null;        r15 = false;        r7 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:            if (r15 != false) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:            if (r6 == 1) goto L61;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m655a(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            a.b.d.e.g$b r0 = new a.b.d.e.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r15
            r8 = r4
            r15 = 0
            r7 = 0
        L41:
            if (r15 != 0) goto Lc7
            if (r6 == r3) goto Lbf
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r6 == r1) goto L8f
            r11 = 3
            if (r6 == r11) goto L50
            goto Lba
        L50:
            java.lang.String r6 = r13.getName()
            if (r7 == 0) goto L5f
            boolean r11 = r6.equals(r8)
            if (r11 == 0) goto L5f
            r8 = r4
            r7 = 0
            goto Lba
        L5f:
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L69
            r0.m665d()
            goto Lba
        L69:
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L87
            boolean r6 = r0.m664c()
            if (r6 != 0) goto Lba
            a.b.c.h.e r6 = r0.f518A
            if (r6 == 0) goto L83
            boolean r6 = r6.mo423a()
            if (r6 == 0) goto L83
            r0.m662b()
            goto Lba
        L83:
            r0.m660a()
            goto Lba
        L87:
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Lba
            r15 = 1
            goto Lba
        L8f:
            if (r7 == 0) goto L92
            goto Lba
        L92:
            java.lang.String r6 = r13.getName()
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto La0
            r0.m661a(r14)
            goto Lba
        La0:
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto Laa
            r0.m663b(r14)
            goto Lba
        Laa:
            boolean r9 = r6.equals(r2)
            if (r9 == 0) goto Lb8
            android.view.SubMenu r6 = r0.m662b()
            r12.m655a(r13, r14, r6)
            goto Lba
        Lb8:
            r8 = r6
            r7 = 1
        Lba:
            int r6 = r13.next()
            goto L41
        Lbf:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p022d.p029e.C0136g.m655a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: a */
    Object m656a() {
        if (this.f514f == null) {
            this.f514f = m654a(this.f513e);
        }
        return this.f514f;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0046a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f513e.getResources().getLayout(i);
                    m655a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
