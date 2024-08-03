package com.facebook.react.uimanager;

import com.facebook.yoga.C1553a;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.uimanager.F */
/* loaded from: classes.dex */
public class C1270F implements InterfaceC1269E<C1270F> {

    /* renamed from: a */
    private static final YogaConfig f4733a = C1272H.m5580a();

    /* renamed from: b */
    private int f4734b;

    /* renamed from: c */
    private String f4735c;

    /* renamed from: d */
    private int f4736d;

    /* renamed from: e */
    private C1278N f4737e;

    /* renamed from: f */
    private boolean f4738f;

    /* renamed from: h */
    private ArrayList<C1270F> f4740h;

    /* renamed from: i */
    private C1270F f4741i;

    /* renamed from: j */
    private boolean f4742j;

    /* renamed from: l */
    private C1270F f4744l;

    /* renamed from: m */
    private ArrayList<C1270F> f4745m;

    /* renamed from: n */
    private int f4746n;

    /* renamed from: o */
    private int f4747o;

    /* renamed from: p */
    private int f4748p;

    /* renamed from: q */
    private int f4749q;

    /* renamed from: u */
    private YogaNode f4753u;

    /* renamed from: g */
    private boolean f4739g = true;

    /* renamed from: k */
    private int f4743k = 0;

    /* renamed from: s */
    private final float[] f4751s = new float[9];

    /* renamed from: t */
    private final boolean[] f4752t = new boolean[9];

    /* renamed from: r */
    private final C1277M f4750r = new C1277M(0.0f);

    public C1270F() {
        if (mo5507j()) {
            this.f4753u = null;
            return;
        }
        YogaNode m5162a = C1370sa.m5936a().m5162a();
        this.f4753u = m5162a == null ? new YogaNode(f4733a) : m5162a;
        this.f4753u.m6498a(this);
        Arrays.fill(this.f4751s, Float.NaN);
    }

    /* renamed from: N */
    private void m5524N() {
        YogaNode yogaNode;
        YogaEdge m6477a;
        float m5597b;
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5 ? C1553a.m6544a(this.f4751s[i]) && C1553a.m6544a(this.f4751s[6]) && C1553a.m6544a(this.f4751s[8]) : !(i == 1 || i == 3 ? !(C1553a.m6544a(this.f4751s[i]) && C1553a.m6544a(this.f4751s[7]) && C1553a.m6544a(this.f4751s[8])) : !C1553a.m6544a(this.f4751s[i]))) {
                yogaNode = this.f4753u;
                m6477a = YogaEdge.m6477a(i);
                m5597b = this.f4750r.m5597b(i);
            } else if (this.f4752t[i]) {
                this.f4753u.m6513e(YogaEdge.m6477a(i), this.f4751s[i]);
            } else {
                yogaNode = this.f4753u;
                m6477a = YogaEdge.m6477a(i);
                m5597b = this.f4751s[i];
            }
            yogaNode.m6510d(m6477a, m5597b);
        }
    }

    /* renamed from: h */
    private void m5525h(int i) {
        if (this.f4742j) {
            for (C1270F parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f4743k += i;
                if (!parent.mo5475A()) {
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: A */
    public final boolean mo5475A() {
        return this.f4742j;
    }

    /* renamed from: B */
    public final YogaDirection m5526B() {
        return this.f4753u.m6504c();
    }

    /* renamed from: C */
    public final float m5527C() {
        return this.f4753u.m6508d();
    }

    /* renamed from: D */
    public final float m5528D() {
        return this.f4753u.m6511e();
    }

    /* renamed from: E */
    public final int m5529E() {
        return this.f4743k;
    }

    /* renamed from: F */
    public final boolean m5530F() {
        YogaNode yogaNode = this.f4753u;
        return yogaNode != null && yogaNode.m6521h();
    }

    /* renamed from: G */
    public final boolean m5531G() {
        YogaNode yogaNode = this.f4753u;
        return yogaNode != null && yogaNode.m6523i();
    }

    /* renamed from: H */
    public boolean m5532H() {
        return this.f4753u.m6525j();
    }

    /* renamed from: I */
    public boolean mo5533I() {
        return m5532H();
    }

    /* renamed from: J */
    public final void m5534J() {
        YogaNode yogaNode = this.f4753u;
        if (yogaNode != null) {
            yogaNode.m6526k();
        }
    }

    /* renamed from: K */
    public void mo5535K() {
        if (this.f4739g) {
            return;
        }
        this.f4739g = true;
        C1270F parent = getParent();
        if (parent != null) {
            parent.mo5535K();
        }
    }

    /* renamed from: L */
    public void m5536L() {
    }

    /* renamed from: M */
    public void m5537M() {
        this.f4753u.m6530m();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public int mo5476a() {
        return this.f4749q;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public final int mo5477a(C1270F c1270f) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= mo5501e()) {
                break;
            }
            C1270F mo5502e = mo5502e(i);
            if (c1270f == mo5502e) {
                z = true;
                break;
            }
            if (mo5502e.mo5475A()) {
                i3 = mo5502e.m5529E();
            }
            i2 += i3;
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException("Child " + c1270f.mo5504g() + " was not a child of " + this.f4734b);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public C1270F mo5478a(int i) {
        ArrayList<C1270F> arrayList = this.f4740h;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        C1270F remove = arrayList.remove(i);
        remove.f4741i = null;
        if (this.f4753u != null && !mo5533I()) {
            this.f4753u.m6483a(i);
        }
        mo5535K();
        int m5529E = remove.mo5475A() ? remove.m5529E() : 1;
        this.f4743k -= m5529E;
        m5525h(-m5529E);
        return remove;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public void mo5479a(float f) {
        this.f4753u.m6527k(f);
    }

    /* renamed from: a */
    public void m5538a(int i, float f) {
        this.f4753u.m6490a(YogaEdge.m6477a(i), f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public void mo5492b(C1270F c1270f, int i) {
        if (this.f4740h == null) {
            this.f4740h = new ArrayList<>(4);
        }
        this.f4740h.add(i, c1270f);
        c1270f.f4741i = this;
        if (this.f4753u != null && !mo5533I()) {
            YogaNode yogaNode = c1270f.f4753u;
            if (yogaNode == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + c1270f.toString() + "' to a '" + toString() + "')");
            }
            this.f4753u.m6494a(yogaNode, i);
        }
        mo5535K();
        int m5529E = c1270f.mo5475A() ? c1270f.m5529E() : 1;
        this.f4743k += m5529E;
        m5525h(m5529E);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public final void mo5481a(C1271G c1271g) {
        C1360na.m5859a(this, c1271g);
        m5536L();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public void mo5482a(C1278N c1278n) {
        this.f4737e = c1278n;
    }

    /* renamed from: a */
    public void mo5539a(C1348ha c1348ha) {
    }

    /* renamed from: a */
    public void m5540a(YogaAlign yogaAlign) {
        this.f4753u.m6487a(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public void mo5483a(YogaDirection yogaDirection) {
        this.f4753u.m6488a(yogaDirection);
    }

    /* renamed from: a */
    public void m5541a(YogaDisplay yogaDisplay) {
        this.f4753u.m6489a(yogaDisplay);
    }

    /* renamed from: a */
    public void m5542a(YogaFlexDirection yogaFlexDirection) {
        this.f4753u.m6491a(yogaFlexDirection);
    }

    /* renamed from: a */
    public void m5543a(YogaJustify yogaJustify) {
        this.f4753u.m6492a(yogaJustify);
    }

    /* renamed from: a */
    public void m5544a(YogaMeasureFunction yogaMeasureFunction) {
        this.f4753u.m6493a(yogaMeasureFunction);
    }

    /* renamed from: a */
    public void m5545a(YogaOverflow yogaOverflow) {
        this.f4753u.m6495a(yogaOverflow);
    }

    /* renamed from: a */
    public void m5546a(YogaPositionType yogaPositionType) {
        this.f4753u.m6496a(yogaPositionType);
    }

    /* renamed from: a */
    public void m5547a(YogaWrap yogaWrap) {
        this.f4753u.m6497a(yogaWrap);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public void mo5484a(Object obj) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public final void mo5485a(String str) {
        this.f4735c = str;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public final void mo5486a(boolean z) {
        C2038a.m8321a(getParent() == null, "Must remove from no opt parent first");
        C2038a.m8321a(this.f4744l == null, "Must remove from native parent first");
        C2038a.m8321a(mo5508k() == 0, "Must remove all native children first");
        this.f4742j = z;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public boolean mo5487a(float f, float f2, C1348ha c1348ha, C1371t c1371t) {
        if (this.f4739g) {
            mo5539a(c1348ha);
        }
        if (m5530F()) {
            float mo5521x = mo5521x();
            float mo5518u = mo5518u();
            float f3 = f + mo5521x;
            int round = Math.round(f3);
            float f4 = f2 + mo5518u;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + m5528D());
            int round4 = Math.round(f4 + m5527C());
            int round5 = Math.round(mo5521x);
            int round6 = Math.round(mo5518u);
            int i = round3 - round;
            int i2 = round4 - round2;
            r1 = (round5 == this.f4746n && round6 == this.f4747o && i == this.f4748p && i2 == this.f4749q) ? false : true;
            this.f4746n = round5;
            this.f4747o = round6;
            this.f4748p = i;
            this.f4749q = i2;
            if (r1) {
                if (c1371t != null) {
                    c1371t.m5953b(this);
                } else {
                    c1348ha.m5813a(getParent().mo5504g(), mo5504g(), mo5519v(), mo5512o(), mo5509l(), mo5476a());
                }
            }
        }
        return r1;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: b */
    public final int mo5493c(C1270F c1270f) {
        ArrayList<C1270F> arrayList = this.f4740h;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(c1270f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: b */
    public final void mo5489b() {
        this.f4739g = false;
        if (m5530F()) {
            m5534J();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: b */
    public void mo5490b(float f) {
        this.f4753u.m6518g(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: b */
    public final void mo5491b(int i) {
        this.f4736d = i;
    }

    /* renamed from: b */
    public void m5548b(int i, float f) {
        this.f4750r.m5596a(i, f);
        m5524N();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: b */
    public final void mo5480a(C1270F c1270f, int i) {
        C2038a.m8320a(!this.f4742j);
        C2038a.m8320a(!c1270f.f4742j);
        if (this.f4745m == null) {
            this.f4745m = new ArrayList<>(4);
        }
        this.f4745m.add(i, c1270f);
        c1270f.f4744l = this;
    }

    /* renamed from: b */
    public void m5549b(YogaAlign yogaAlign) {
        this.f4753u.m6501b(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: c */
    public final int mo5488b(C1270F c1270f) {
        C2038a.m8318a(this.f4745m);
        return this.f4745m.indexOf(c1270f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: c */
    public void mo5494c() {
        if (mo5507j()) {
            return;
        }
        this.f4753u.m6484a();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: c */
    public void mo5495c(float f) {
        this.f4753u.m6522i(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: c */
    public void mo5496c(int i) {
        this.f4734b = i;
    }

    /* renamed from: c */
    public void m5550c(int i, float f) {
        this.f4753u.m6503b(YogaEdge.m6477a(i), f);
    }

    /* renamed from: c */
    public void m5551c(YogaAlign yogaAlign) {
        this.f4753u.m6506c(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: d */
    public final C1270F mo5497d(int i) {
        C2038a.m8318a(this.f4745m);
        C1270F remove = this.f4745m.remove(i);
        remove.f4744l = null;
        return remove;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: d */
    public void mo5498d(float f) {
        this.f4753u.m6537q(f);
    }

    /* renamed from: d */
    public void m5552d(int i, float f) {
        this.f4753u.m6507c(YogaEdge.m6477a(i), f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: d */
    public final boolean mo5499d() {
        return this.f4739g || m5530F() || m5531G();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: d */
    public boolean mo5500d(C1270F c1270f) {
        for (C1270F parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == c1270f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: e */
    public final int mo5501e() {
        ArrayList<C1270F> arrayList = this.f4740h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: e */
    public final C1270F mo5502e(int i) {
        ArrayList<C1270F> arrayList = this.f4740h;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    /* renamed from: e */
    public void m5553e(float f) {
        this.f4753u.m6505c(f);
    }

    /* renamed from: e */
    public void mo5554e(int i, float f) {
        this.f4751s[i] = f;
        this.f4752t[i] = false;
        m5524N();
    }

    /* renamed from: f */
    public final float m5555f(int i) {
        return this.f4753u.m6482a(YogaEdge.m6477a(i));
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: f */
    public void mo5503f() {
        if (mo5501e() == 0) {
            return;
        }
        int i = 0;
        for (int mo5501e = mo5501e() - 1; mo5501e >= 0; mo5501e--) {
            if (this.f4753u != null && !mo5533I()) {
                this.f4753u.m6483a(mo5501e);
            }
            C1270F mo5502e = mo5502e(mo5501e);
            mo5502e.f4741i = null;
            mo5502e.mo5511n();
            i += mo5502e.mo5475A() ? mo5502e.m5529E() : 1;
        }
        ArrayList<C1270F> arrayList = this.f4740h;
        C2038a.m8318a(arrayList);
        arrayList.clear();
        mo5535K();
        this.f4743k -= i;
        m5525h(-i);
    }

    /* renamed from: f */
    public void m5556f(float f) {
        this.f4753u.m6509d(f);
    }

    /* renamed from: f */
    public void m5557f(int i, float f) {
        this.f4751s[i] = f;
        this.f4752t[i] = !C1553a.m6544a(f);
        m5524N();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: g */
    public final int mo5504g() {
        return this.f4734b;
    }

    /* renamed from: g */
    public void m5558g(float f) {
        this.f4753u.m6485a(f);
    }

    /* renamed from: g */
    public void m5559g(int i) {
        this.f4753u.m6502b(YogaEdge.m6477a(i));
    }

    /* renamed from: g */
    public void m5560g(int i, float f) {
        this.f4753u.m6516f(YogaEdge.m6477a(i), f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    public final C1270F getParent() {
        return this.f4741i;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: h */
    public final void mo5505h() {
        ArrayList<C1270F> arrayList = this.f4745m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f4745m.get(size).f4744l = null;
            }
            this.f4745m.clear();
        }
    }

    /* renamed from: h */
    public void m5561h(float f) {
        this.f4753u.m6520h(f);
    }

    /* renamed from: h */
    public void m5562h(int i, float f) {
        this.f4753u.m6519g(YogaEdge.m6477a(i), f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: i */
    public void mo5506i() {
        this.f4753u.m6486a(Float.NaN, Float.NaN);
    }

    /* renamed from: i */
    public void m5563i(float f) {
        this.f4753u.m6524j(f);
    }

    /* renamed from: j */
    public void m5564j(float f) {
        this.f4753u.m6529l(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: j */
    public boolean mo5507j() {
        return false;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: k */
    public final int mo5508k() {
        ArrayList<C1270F> arrayList = this.f4745m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: k */
    public void m5565k(float f) {
        this.f4753u.m6531m(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: l */
    public int mo5509l() {
        return this.f4748p;
    }

    /* renamed from: l */
    public void m5566l(float f) {
        this.f4753u.m6533n(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: m */
    public void mo5510m() {
    }

    /* renamed from: m */
    public void m5567m(float f) {
        this.f4753u.m6535o(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: n */
    public void mo5511n() {
        YogaNode yogaNode = this.f4753u;
        if (yogaNode != null) {
            yogaNode.m6528l();
            C1370sa.m5936a().m5163a(this.f4753u);
        }
    }

    /* renamed from: n */
    public void m5568n(float f) {
        this.f4753u.m6536p(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: o */
    public int mo5512o() {
        return this.f4747o;
    }

    /* renamed from: o */
    public void m5569o(float f) {
        this.f4753u.m6538r(f);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: p */
    public final C1278N mo5513p() {
        C1278N c1278n = this.f4737e;
        C2038a.m8318a(c1278n);
        return c1278n;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: q */
    public final int mo5514q() {
        C2038a.m8320a(this.f4736d != 0);
        return this.f4736d;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: r */
    public final boolean mo5515r() {
        return this.f4738f;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: s */
    public void mo5516s() {
        this.f4753u.m6532n();
    }

    public void setFlex(float f) {
        this.f4753u.m6500b(f);
    }

    public void setFlexGrow(float f) {
        this.f4753u.m6512e(f);
    }

    public void setFlexShrink(float f) {
        this.f4753u.m6515f(f);
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.f4738f = z;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: t */
    public final String mo5517t() {
        String str = this.f4735c;
        C2038a.m8318a(str);
        return str;
    }

    public String toString() {
        return "[" + this.f4735c + " " + mo5504g() + "]";
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: u */
    public final float mo5518u() {
        return this.f4753u.m6517g();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: v */
    public int mo5519v() {
        return this.f4746n;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: w */
    public boolean mo5520w() {
        return false;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: x */
    public final float mo5521x() {
        return this.f4753u.m6514f();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: y */
    public void mo5522y() {
        this.f4753u.m6534o();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: z */
    public final C1270F mo5523z() {
        return this.f4744l;
    }
}
