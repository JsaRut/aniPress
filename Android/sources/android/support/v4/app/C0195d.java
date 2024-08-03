package android.support.v4.app;

import android.support.v4.app.AbstractC0212s;
import android.support.v4.app.ComponentCallbacksC0205l;
import android.support.v4.app.LayoutInflaterFactory2C0219z;
import android.support.v4.util.C0261g;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.d */
/* loaded from: classes.dex */
public final class C0195d extends AbstractC0169H implements AbstractC0212s.a, LayoutInflaterFactory2C0219z.h {

    /* renamed from: a */
    final LayoutInflaterFactory2C0219z f724a;

    /* renamed from: c */
    int f726c;

    /* renamed from: d */
    int f727d;

    /* renamed from: e */
    int f728e;

    /* renamed from: f */
    int f729f;

    /* renamed from: g */
    int f730g;

    /* renamed from: h */
    int f731h;

    /* renamed from: i */
    boolean f732i;

    /* renamed from: k */
    String f734k;

    /* renamed from: l */
    boolean f735l;

    /* renamed from: n */
    int f737n;

    /* renamed from: o */
    CharSequence f738o;

    /* renamed from: p */
    int f739p;

    /* renamed from: q */
    CharSequence f740q;

    /* renamed from: r */
    ArrayList<String> f741r;

    /* renamed from: s */
    ArrayList<String> f742s;

    /* renamed from: u */
    ArrayList<Runnable> f744u;

    /* renamed from: b */
    ArrayList<a> f725b = new ArrayList<>();

    /* renamed from: j */
    boolean f733j = true;

    /* renamed from: m */
    int f736m = -1;

    /* renamed from: t */
    boolean f743t = false;

    /* renamed from: android.support.v4.app.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f745a;

        /* renamed from: b */
        ComponentCallbacksC0205l f746b;

        /* renamed from: c */
        int f747c;

        /* renamed from: d */
        int f748d;

        /* renamed from: e */
        int f749e;

        /* renamed from: f */
        int f750f;

        public a() {
        }

        a(int i, ComponentCallbacksC0205l componentCallbacksC0205l) {
            this.f745a = i;
            this.f746b = componentCallbacksC0205l;
        }
    }

    public C0195d(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z) {
        this.f724a = layoutInflaterFactory2C0219z;
    }

    /* renamed from: a */
    private void m857a(int i, ComponentCallbacksC0205l componentCallbacksC0205l, String str, int i2) {
        Class<?> cls = componentCallbacksC0205l.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        componentCallbacksC0205l.f824t = this.f724a;
        if (str != null) {
            String str2 = componentCallbacksC0205l.f784B;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0205l + ": was " + componentCallbacksC0205l.f784B + " now " + str);
            }
            componentCallbacksC0205l.f784B = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0205l + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC0205l.f830z;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0205l + ": was " + componentCallbacksC0205l.f830z + " now " + i);
            }
            componentCallbacksC0205l.f830z = i;
            componentCallbacksC0205l.f783A = i;
        }
        m862a(new a(i2, componentCallbacksC0205l));
    }

    /* renamed from: b */
    private static boolean m858b(a aVar) {
        ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f746b;
        return (componentCallbacksC0205l == null || !componentCallbacksC0205l.f817m || componentCallbacksC0205l.f793K == null || componentCallbacksC0205l.f786D || componentCallbacksC0205l.f785C || !componentCallbacksC0205l.m915H()) ? false : true;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: a */
    public int mo763a() {
        return m859a(false);
    }

    /* renamed from: a */
    int m859a(boolean z) {
        if (this.f735l) {
            throw new IllegalStateException("commit already called");
        }
        if (LayoutInflaterFactory2C0219z.f887a) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0261g("FragmentManager"));
            m864a("  ", (FileDescriptor) null, printWriter, (String[]) null);
            printWriter.close();
        }
        this.f735l = true;
        this.f736m = this.f732i ? this.f724a.m1129b(this) : -1;
        this.f724a.m1123a(this, z);
        return this.f736m;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: a */
    public AbstractC0169H mo764a(int i, ComponentCallbacksC0205l componentCallbacksC0205l) {
        m857a(i, componentCallbacksC0205l, (String) null, 1);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: a */
    public AbstractC0169H mo765a(int i, ComponentCallbacksC0205l componentCallbacksC0205l, String str) {
        m857a(i, componentCallbacksC0205l, str, 1);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: a */
    public AbstractC0169H mo766a(ComponentCallbacksC0205l componentCallbacksC0205l) {
        m862a(new a(7, componentCallbacksC0205l));
        return this;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: a */
    public AbstractC0169H mo767a(ComponentCallbacksC0205l componentCallbacksC0205l, String str) {
        m857a(0, componentCallbacksC0205l, str, 1);
        return this;
    }

    /* renamed from: a */
    public ComponentCallbacksC0205l m860a(ArrayList<ComponentCallbacksC0205l> arrayList, ComponentCallbacksC0205l componentCallbacksC0205l) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = componentCallbacksC0205l;
        int i = 0;
        while (i < this.f725b.size()) {
            a aVar = this.f725b.get(i);
            int i2 = aVar.f745a;
            if (i2 != 1) {
                if (i2 == 2) {
                    ComponentCallbacksC0205l componentCallbacksC0205l3 = aVar.f746b;
                    int i3 = componentCallbacksC0205l3.f783A;
                    ComponentCallbacksC0205l componentCallbacksC0205l4 = componentCallbacksC0205l2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ComponentCallbacksC0205l componentCallbacksC0205l5 = arrayList.get(size);
                        if (componentCallbacksC0205l5.f783A == i3) {
                            if (componentCallbacksC0205l5 == componentCallbacksC0205l3) {
                                z = true;
                            } else {
                                if (componentCallbacksC0205l5 == componentCallbacksC0205l4) {
                                    this.f725b.add(i4, new a(9, componentCallbacksC0205l5));
                                    i4++;
                                    componentCallbacksC0205l4 = null;
                                }
                                a aVar2 = new a(3, componentCallbacksC0205l5);
                                aVar2.f747c = aVar.f747c;
                                aVar2.f749e = aVar.f749e;
                                aVar2.f748d = aVar.f748d;
                                aVar2.f750f = aVar.f750f;
                                this.f725b.add(i4, aVar2);
                                arrayList.remove(componentCallbacksC0205l5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f725b.remove(i4);
                        i4--;
                    } else {
                        aVar.f745a = 1;
                        arrayList.add(componentCallbacksC0205l3);
                    }
                    i = i4;
                    componentCallbacksC0205l2 = componentCallbacksC0205l4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f746b);
                    ComponentCallbacksC0205l componentCallbacksC0205l6 = aVar.f746b;
                    if (componentCallbacksC0205l6 == componentCallbacksC0205l2) {
                        this.f725b.add(i, new a(9, componentCallbacksC0205l6));
                        i++;
                        componentCallbacksC0205l2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f725b.add(i, new a(9, componentCallbacksC0205l2));
                        i++;
                        componentCallbacksC0205l2 = aVar.f746b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f746b);
            i++;
        }
        return componentCallbacksC0205l2;
    }

    /* renamed from: a */
    public void m861a(int i) {
        if (this.f732i) {
            if (LayoutInflaterFactory2C0219z.f887a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f725b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f725b.get(i2);
                ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f746b;
                if (componentCallbacksC0205l != null) {
                    componentCallbacksC0205l.f823s += i;
                    if (LayoutInflaterFactory2C0219z.f887a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f746b + " to " + aVar.f746b.f823s);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m862a(a aVar) {
        this.f725b.add(aVar);
        aVar.f747c = this.f726c;
        aVar.f748d = this.f727d;
        aVar.f749e = this.f728e;
        aVar.f750f = this.f729f;
    }

    /* renamed from: a */
    public void m863a(ComponentCallbacksC0205l.c cVar) {
        for (int i = 0; i < this.f725b.size(); i++) {
            a aVar = this.f725b.get(i);
            if (m858b(aVar)) {
                aVar.f746b.m944a(cVar);
            }
        }
    }

    /* renamed from: a */
    public void m864a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m865a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m865a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f734k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f736m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f735l);
            if (this.f730g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f730g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f731h));
            }
            if (this.f726c != 0 || this.f727d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f726c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f727d));
            }
            if (this.f728e != 0 || this.f729f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f728e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f729f));
            }
            if (this.f737n != 0 || this.f738o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f737n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f738o);
            }
            if (this.f739p != 0 || this.f740q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f739p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f740q);
            }
        }
        if (this.f725b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        String str3 = str + "    ";
        int size = this.f725b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f725b.get(i);
            switch (aVar.f745a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    str2 = "cmd=" + aVar.f745a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f746b);
            if (z) {
                if (aVar.f747c != 0 || aVar.f748d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f747c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f748d));
                }
                if (aVar.f749e != 0 || aVar.f750f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f749e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f750f));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m866a(ArrayList<C0195d> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f725b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f725b.get(i4).f746b;
            int i5 = componentCallbacksC0205l != null ? componentCallbacksC0205l.f783A : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0195d c0195d = arrayList.get(i6);
                    int size2 = c0195d.f725b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ComponentCallbacksC0205l componentCallbacksC0205l2 = c0195d.f725b.get(i7).f746b;
                        if ((componentCallbacksC0205l2 != null ? componentCallbacksC0205l2.f783A : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // android.support.v4.app.LayoutInflaterFactory2C0219z.h
    /* renamed from: a */
    public boolean mo867a(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflaterFactory2C0219z.f887a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f732i) {
            return true;
        }
        this.f724a.m1115a(this);
        return true;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: b */
    public int mo768b() {
        return m859a(true);
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: b */
    public AbstractC0169H mo769b(ComponentCallbacksC0205l componentCallbacksC0205l) {
        m862a(new a(6, componentCallbacksC0205l));
        return this;
    }

    /* renamed from: b */
    public ComponentCallbacksC0205l m868b(ArrayList<ComponentCallbacksC0205l> arrayList, ComponentCallbacksC0205l componentCallbacksC0205l) {
        for (int i = 0; i < this.f725b.size(); i++) {
            a aVar = this.f725b.get(i);
            int i2 = aVar.f745a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            componentCallbacksC0205l = null;
                            break;
                        case 9:
                            componentCallbacksC0205l = aVar.f746b;
                            break;
                    }
                }
                arrayList.add(aVar.f746b);
            }
            arrayList.remove(aVar.f746b);
        }
        return componentCallbacksC0205l;
    }

    /* renamed from: b */
    public void m869b(boolean z) {
        for (int size = this.f725b.size() - 1; size >= 0; size--) {
            a aVar = this.f725b.get(size);
            ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f746b;
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m935a(LayoutInflaterFactory2C0219z.m1104d(this.f730g), this.f731h);
            }
            switch (aVar.f745a) {
                case 1:
                    componentCallbacksC0205l.m934a(aVar.f750f);
                    this.f724a.m1166l(componentCallbacksC0205l);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f745a);
                case 3:
                    componentCallbacksC0205l.m934a(aVar.f749e);
                    this.f724a.m1121a(componentCallbacksC0205l, false);
                    break;
                case 4:
                    componentCallbacksC0205l.m934a(aVar.f749e);
                    this.f724a.m1174p(componentCallbacksC0205l);
                    break;
                case 5:
                    componentCallbacksC0205l.m934a(aVar.f750f);
                    this.f724a.m1151f(componentCallbacksC0205l);
                    break;
                case 6:
                    componentCallbacksC0205l.m934a(aVar.f749e);
                    this.f724a.m1132b(componentCallbacksC0205l);
                    break;
                case 7:
                    componentCallbacksC0205l.m934a(aVar.f750f);
                    this.f724a.m1144d(componentCallbacksC0205l);
                    break;
                case 8:
                    this.f724a.m1171o(null);
                    break;
                case 9:
                    this.f724a.m1171o(componentCallbacksC0205l);
                    break;
            }
            if (!this.f743t && aVar.f745a != 3 && componentCallbacksC0205l != null) {
                this.f724a.m1160i(componentCallbacksC0205l);
            }
        }
        if (this.f743t || !z) {
            return;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f724a;
        layoutInflaterFactory2C0219z.m1112a(layoutInflaterFactory2C0219z.f914r, true);
    }

    /* renamed from: b */
    public boolean m870b(int i) {
        int size = this.f725b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f725b.get(i2).f746b;
            int i3 = componentCallbacksC0205l != null ? componentCallbacksC0205l.f783A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: c */
    public AbstractC0169H mo770c(ComponentCallbacksC0205l componentCallbacksC0205l) {
        m862a(new a(3, componentCallbacksC0205l));
        return this;
    }

    @Override // android.support.v4.app.AbstractC0169H
    /* renamed from: c */
    public void mo771c() {
        m871d();
        this.f724a.m1136b((LayoutInflaterFactory2C0219z.h) this, true);
    }

    /* renamed from: d */
    public AbstractC0169H m871d() {
        if (this.f732i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f733j = false;
        return this;
    }

    /* renamed from: e */
    public void m872e() {
        int size = this.f725b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f725b.get(i);
            ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f746b;
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m935a(this.f730g, this.f731h);
            }
            switch (aVar.f745a) {
                case 1:
                    componentCallbacksC0205l.m934a(aVar.f747c);
                    this.f724a.m1121a(componentCallbacksC0205l, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f745a);
                case 3:
                    componentCallbacksC0205l.m934a(aVar.f748d);
                    this.f724a.m1166l(componentCallbacksC0205l);
                    break;
                case 4:
                    componentCallbacksC0205l.m934a(aVar.f748d);
                    this.f724a.m1151f(componentCallbacksC0205l);
                    break;
                case 5:
                    componentCallbacksC0205l.m934a(aVar.f747c);
                    this.f724a.m1174p(componentCallbacksC0205l);
                    break;
                case 6:
                    componentCallbacksC0205l.m934a(aVar.f748d);
                    this.f724a.m1144d(componentCallbacksC0205l);
                    break;
                case 7:
                    componentCallbacksC0205l.m934a(aVar.f747c);
                    this.f724a.m1132b(componentCallbacksC0205l);
                    break;
                case 8:
                    this.f724a.m1171o(componentCallbacksC0205l);
                    break;
                case 9:
                    this.f724a.m1171o(null);
                    break;
            }
            if (!this.f743t && aVar.f745a != 1 && componentCallbacksC0205l != null) {
                this.f724a.m1160i(componentCallbacksC0205l);
            }
        }
        if (this.f743t) {
            return;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f724a;
        layoutInflaterFactory2C0219z.m1112a(layoutInflaterFactory2C0219z.f914r, true);
    }

    /* renamed from: f */
    public String m873f() {
        return this.f734k;
    }

    /* renamed from: g */
    public boolean m874g() {
        for (int i = 0; i < this.f725b.size(); i++) {
            if (m858b(this.f725b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public void m875h() {
        ArrayList<Runnable> arrayList = this.f744u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f744u.get(i).run();
            }
            this.f744u = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f736m >= 0) {
            sb.append(" #");
            sb.append(this.f736m);
        }
        if (this.f734k != null) {
            sb.append(" ");
            sb.append(this.f734k);
        }
        sb.append("}");
        return sb.toString();
    }
}
