package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1284U;
import com.facebook.react.uimanager.C1353k;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.InterfaceC1335h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.animated.H */
/* loaded from: classes.dex */
public class C1024H implements InterfaceC1335h {

    /* renamed from: e */
    private final UIManagerModule.InterfaceC1285a f4229e;

    /* renamed from: f */
    private final C1284U f4230f;

    /* renamed from: a */
    private final SparseArray<AbstractC1036b> f4225a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<AbstractC1038d> f4226b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<AbstractC1036b> f4227c = new SparseArray<>();

    /* renamed from: d */
    private final Map<String, List<EventAnimationDriver>> f4228d = new HashMap();

    /* renamed from: g */
    private int f4231g = 0;

    /* renamed from: h */
    private final List<AbstractC1036b> f4232h = new LinkedList();

    public C1024H(UIManagerModule uIManagerModule) {
        this.f4230f = uIManagerModule.getUIImplementation();
        uIManagerModule.getEventDispatcher().m5754a(this);
        this.f4229e = uIManagerModule.getDirectEventNamesResolver();
    }

    /* renamed from: a */
    private void m5107a(AbstractC1036b abstractC1036b) {
        int i = 0;
        while (i < this.f4226b.size()) {
            AbstractC1038d valueAt = this.f4226b.valueAt(i);
            if (abstractC1036b.equals(valueAt.f4284b)) {
                if (valueAt.f4285c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f4285c.invoke(createMap);
                }
                this.f4226b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m5108a(List<AbstractC1036b> list) {
        this.f4231g++;
        int i = this.f4231g;
        if (i == 0) {
            this.f4231g = i + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        for (AbstractC1036b abstractC1036b : list) {
            int i3 = abstractC1036b.f4281c;
            int i4 = this.f4231g;
            if (i3 != i4) {
                abstractC1036b.f4281c = i4;
                i2++;
                arrayDeque.add(abstractC1036b);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AbstractC1036b abstractC1036b2 = (AbstractC1036b) arrayDeque.poll();
            if (abstractC1036b2.f4279a != null) {
                int i5 = i2;
                for (int i6 = 0; i6 < abstractC1036b2.f4279a.size(); i6++) {
                    AbstractC1036b abstractC1036b3 = abstractC1036b2.f4279a.get(i6);
                    abstractC1036b3.f4280b++;
                    int i7 = abstractC1036b3.f4281c;
                    int i8 = this.f4231g;
                    if (i7 != i8) {
                        abstractC1036b3.f4281c = i8;
                        i5++;
                        arrayDeque.add(abstractC1036b3);
                    }
                }
                i2 = i5;
            }
        }
        this.f4231g++;
        int i9 = this.f4231g;
        if (i9 == 0) {
            this.f4231g = i9 + 1;
        }
        int i10 = 0;
        for (AbstractC1036b abstractC1036b4 : list) {
            if (abstractC1036b4.f4280b == 0) {
                int i11 = abstractC1036b4.f4281c;
                int i12 = this.f4231g;
                if (i11 != i12) {
                    abstractC1036b4.f4281c = i12;
                    i10++;
                    arrayDeque.add(abstractC1036b4);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            AbstractC1036b abstractC1036b5 = (AbstractC1036b) arrayDeque.poll();
            abstractC1036b5.mo5142a();
            if (abstractC1036b5 instanceof C1025I) {
                try {
                    ((C1025I) abstractC1036b5).m5134c();
                } catch (C1353k e2) {
                    C1700a.m6998a("ReactNative", "Native animation workaround, frame lost as result of race condition", e2);
                }
            }
            if (abstractC1036b5 instanceof C1034Q) {
                ((C1034Q) abstractC1036b5).m5148e();
            }
            if (abstractC1036b5.f4279a != null) {
                int i13 = i10;
                for (int i14 = 0; i14 < abstractC1036b5.f4279a.size(); i14++) {
                    AbstractC1036b abstractC1036b6 = abstractC1036b5.f4279a.get(i14);
                    abstractC1036b6.f4280b--;
                    int i15 = abstractC1036b6.f4281c;
                    int i16 = this.f4231g;
                    if (i15 != i16 && abstractC1036b6.f4280b == 0) {
                        abstractC1036b6.f4281c = i16;
                        i13++;
                        arrayDeque.add(abstractC1036b6);
                    }
                }
                i10 = i13;
            }
        }
        if (i2 == i10) {
            return;
        }
        throw new IllegalStateException("Looks like animated nodes graph has cycles, there are " + i2 + " but toposort visited only " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5109b(AbstractC1330c abstractC1330c) {
        if (this.f4228d.isEmpty()) {
            return;
        }
        String mo5668a = this.f4229e.mo5668a(abstractC1330c.mo5715d());
        List<EventAnimationDriver> list = this.f4228d.get(abstractC1330c.m5723g() + mo5668a);
        if (list != null) {
            for (EventAnimationDriver eventAnimationDriver : list) {
                m5107a(eventAnimationDriver.mValueNode);
                abstractC1330c.mo5714a(eventAnimationDriver);
                this.f4232h.add(eventAnimationDriver.mValueNode);
            }
            m5108a(this.f4232h);
            this.f4232h.clear();
        }
    }

    /* renamed from: a */
    public void m5110a(int i) {
        this.f4225a.remove(i);
        this.f4227c.remove(i);
    }

    /* renamed from: a */
    public void m5111a(int i, double d2) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b != null && (abstractC1036b instanceof C1034Q)) {
            ((C1034Q) abstractC1036b).f4275f = d2;
            this.f4227c.put(i, abstractC1036b);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
    }

    /* renamed from: a */
    public void m5112a(int i, int i2) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        if (abstractC1036b instanceof C1025I) {
            ((C1025I) abstractC1036b).m5131a(i2);
            this.f4227c.put(i, abstractC1036b);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + C1025I.class.getName());
        }
    }

    /* renamed from: a */
    public void m5113a(int i, int i2, ReadableMap readableMap, Callback callback) {
        AbstractC1038d c1039e;
        AbstractC1036b abstractC1036b = this.f4225a.get(i2);
        if (abstractC1036b == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
        if (!(abstractC1036b instanceof C1034Q)) {
            throw new JSApplicationIllegalArgumentException("Animated node should be of type " + C1034Q.class.getName());
        }
        AbstractC1038d abstractC1038d = this.f4226b.get(i);
        if (abstractC1038d != null) {
            abstractC1038d.mo5140a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if ("frames".equals(string)) {
            c1039e = new C1042h(readableMap);
        } else if ("spring".equals(string)) {
            c1039e = new C1027K(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported animation type: " + string);
            }
            c1039e = new C1039e(readableMap);
        }
        c1039e.f4286d = i;
        c1039e.f4285c = callback;
        c1039e.f4284b = (C1034Q) abstractC1036b;
        this.f4226b.put(i, c1039e);
    }

    /* renamed from: a */
    public void m5114a(int i, InterfaceC1037c interfaceC1037c) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b != null && (abstractC1036b instanceof C1034Q)) {
            ((C1034Q) abstractC1036b).m5144a(interfaceC1037c);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    /* renamed from: a */
    public void m5115a(int i, ReadableMap readableMap) {
        AbstractC1036b c1030n;
        if (this.f4225a.get(i) != null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " already exists");
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            c1030n = new C1028L(readableMap, this);
        } else if ("value".equals(string)) {
            c1030n = new C1034Q(readableMap);
        } else if ("props".equals(string)) {
            c1030n = new C1025I(readableMap, this, this.f4230f);
        } else if ("interpolation".equals(string)) {
            c1030n = new C1043i(readableMap);
        } else if ("addition".equals(string)) {
            c1030n = new C1035a(readableMap, this);
        } else if ("subtraction".equals(string)) {
            c1030n = new C1029M(readableMap, this);
        } else if ("division".equals(string)) {
            c1030n = new C1041g(readableMap, this);
        } else if ("multiplication".equals(string)) {
            c1030n = new C1045k(readableMap, this);
        } else if ("modulus".equals(string)) {
            c1030n = new C1044j(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            c1030n = new C1040f(readableMap, this);
        } else if ("transform".equals(string)) {
            c1030n = new C1033P(readableMap, this);
        } else {
            if (!"tracking".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            c1030n = new C1030N(readableMap, this);
        }
        c1030n.f4282d = i;
        this.f4225a.put(i, c1030n);
        this.f4227c.put(i, c1030n);
    }

    /* renamed from: a */
    public void m5116a(int i, String str, int i2) {
        String str2 = i + str;
        if (this.f4228d.containsKey(str2)) {
            List<EventAnimationDriver> list = this.f4228d.get(str2);
            if (list.size() == 1) {
                this.f4228d.remove(i + str);
                return;
            }
            ListIterator<EventAnimationDriver> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.f4282d == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m5117a(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        AbstractC1036b abstractC1036b = this.f4225a.get(i2);
        if (abstractC1036b == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
        if (!(abstractC1036b instanceof C1034Q)) {
            throw new JSApplicationIllegalArgumentException("Animated node connected to event should beof type " + C1034Q.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i3 = 0; i3 < array.size(); i3++) {
            arrayList.add(array.getString(i3));
        }
        EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (C1034Q) abstractC1036b);
        String str2 = i + str;
        if (this.f4228d.containsKey(str2)) {
            this.f4228d.get(str2).add(eventAnimationDriver);
            return;
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(eventAnimationDriver);
        this.f4228d.put(str2, arrayList2);
    }

    /* renamed from: a */
    public void m5118a(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.f4227c.size(); i++) {
            this.f4232h.add(this.f4227c.valueAt(i));
        }
        this.f4227c.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.f4226b.size(); i2++) {
            AbstractC1038d valueAt = this.f4226b.valueAt(i2);
            valueAt.mo5139a(j);
            this.f4232h.add(valueAt.f4284b);
            if (valueAt.f4283a) {
                z = true;
            }
        }
        m5108a(this.f4232h);
        this.f4232h.clear();
        if (z) {
            for (int size = this.f4226b.size() - 1; size >= 0; size--) {
                AbstractC1038d valueAt2 = this.f4226b.valueAt(size);
                if (valueAt2.f4283a) {
                    if (valueAt2.f4285c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        valueAt2.f4285c.invoke(createMap);
                    }
                    this.f4226b.removeAt(size);
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.InterfaceC1335h
    /* renamed from: a */
    public void mo5119a(AbstractC1330c abstractC1330c) {
        if (UiThreadUtil.isOnUiThread()) {
            m5109b(abstractC1330c);
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC1023G(this, abstractC1330c));
        }
    }

    /* renamed from: a */
    public boolean m5120a() {
        return this.f4226b.size() > 0 || this.f4227c.size() > 0;
    }

    /* renamed from: b */
    public void m5121b(int i) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b != null && (abstractC1036b instanceof C1034Q)) {
            ((C1034Q) abstractC1036b).m5145b();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    /* renamed from: b */
    public void m5122b(int i, double d2) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b != null && (abstractC1036b instanceof C1034Q)) {
            m5107a(abstractC1036b);
            ((C1034Q) abstractC1036b).f4274e = d2;
            this.f4227c.put(i, abstractC1036b);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
    }

    /* renamed from: b */
    public void m5123b(int i, int i2) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        AbstractC1036b abstractC1036b2 = this.f4225a.get(i2);
        if (abstractC1036b2 != null) {
            abstractC1036b.m5149a(abstractC1036b2);
            this.f4227c.put(i2, abstractC1036b2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
    }

    /* renamed from: c */
    public void m5124c(int i) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b != null && (abstractC1036b instanceof C1034Q)) {
            ((C1034Q) abstractC1036b).m5146c();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    /* renamed from: c */
    public void m5125c(int i, int i2) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        if (abstractC1036b instanceof C1025I) {
            ((C1025I) abstractC1036b).m5133b(i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + C1025I.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC1036b m5126d(int i) {
        return this.f4225a.get(i);
    }

    /* renamed from: d */
    public void m5127d(int i, int i2) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        AbstractC1036b abstractC1036b2 = this.f4225a.get(i2);
        if (abstractC1036b2 != null) {
            abstractC1036b.m5152d(abstractC1036b2);
            this.f4227c.put(i2, abstractC1036b2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        }
    }

    /* renamed from: e */
    public void m5128e(int i) {
        for (int i2 = 0; i2 < this.f4226b.size(); i2++) {
            AbstractC1038d valueAt = this.f4226b.valueAt(i2);
            if (valueAt.f4286d == i) {
                if (valueAt.f4285c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f4285c.invoke(createMap);
                }
                this.f4226b.removeAt(i2);
                return;
            }
        }
    }

    /* renamed from: e */
    public void m5129e(int i, int i2) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b == null) {
            return;
        }
        if (abstractC1036b instanceof C1025I) {
            ((C1025I) abstractC1036b).m5132b();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + C1025I.class.getName());
    }

    /* renamed from: f */
    public void m5130f(int i) {
        AbstractC1036b abstractC1036b = this.f4225a.get(i);
        if (abstractC1036b != null && (abstractC1036b instanceof C1034Q)) {
            ((C1034Q) abstractC1036b).m5144a((InterfaceC1037c) null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }
}
