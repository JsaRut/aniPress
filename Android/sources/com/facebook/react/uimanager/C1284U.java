package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.i18nmanager.C1190a;
import com.facebook.react.uimanager.common.InterfaceC1321a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.p128b.InterfaceC1298a;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.C1552c;
import com.facebook.yoga.YogaDirection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p209a.AbstractC2062a;

/* renamed from: com.facebook.react.uimanager.U */
/* loaded from: classes.dex */
public class C1284U {

    /* renamed from: a */
    protected Object f4772a;

    /* renamed from: b */
    protected final C1333f f4773b;

    /* renamed from: c */
    protected final ReactApplicationContext f4774c;

    /* renamed from: d */
    protected final C1276L f4775d;

    /* renamed from: e */
    private final Set<Integer> f4776e;

    /* renamed from: f */
    private final C1362oa f4777f;

    /* renamed from: g */
    private final C1348ha f4778g;

    /* renamed from: h */
    private final C1371t f4779h;

    /* renamed from: i */
    private final int[] f4780i;

    /* renamed from: j */
    private long f4781j;

    /* renamed from: k */
    protected a f4782k;

    /* renamed from: com.facebook.react.uimanager.U$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m5667a(InterfaceC1269E interfaceC1269E);
    }

    public C1284U(ReactApplicationContext reactApplicationContext, C1362oa c1362oa, C1333f c1333f, int i) {
        this(reactApplicationContext, c1362oa, new C1348ha(reactApplicationContext, new C1369s(c1362oa), i), c1333f);
    }

    protected C1284U(ReactApplicationContext reactApplicationContext, C1362oa c1362oa, C1348ha c1348ha, C1333f c1333f) {
        this.f4772a = new Object();
        this.f4775d = new C1276L();
        this.f4776e = new HashSet();
        this.f4780i = new int[4];
        this.f4781j = 0L;
        this.f4774c = reactApplicationContext;
        this.f4777f = c1362oa;
        this.f4778g = c1348ha;
        this.f4779h = new C1371t(this.f4778g, this.f4775d);
        this.f4773b = c1333f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m5607a(int i, int i2, int[] iArr) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        InterfaceC1269E m5587a2 = this.f4775d.m5587a(i2);
        if (m5587a == null || m5587a2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (m5587a != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new C1353k(sb.toString());
        }
        if (m5587a != m5587a2) {
            for (InterfaceC1269E parent = m5587a.getParent(); parent != m5587a2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new C1353k("Tag " + i2 + " is not an ancestor of tag " + i);
                }
            }
        }
        m5610a(m5587a, m5587a2, iArr);
    }

    /* renamed from: a */
    private void m5608a(int i, String str) {
        if (this.f4775d.m5587a(i) != null) {
            return;
        }
        throw new C1353k("Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exists");
    }

    /* renamed from: a */
    private void m5609a(int i, int[] iArr) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a == null) {
            throw new C1353k("No native view for tag " + i + " exists!");
        }
        InterfaceC1269E parent = m5587a.getParent();
        if (parent != null) {
            m5610a(m5587a, parent, iArr);
            return;
        }
        throw new C1353k("View with tag " + i + " doesn't have a parent!");
    }

    /* renamed from: a */
    private void m5610a(InterfaceC1269E interfaceC1269E, InterfaceC1269E interfaceC1269E2, int[] iArr) {
        int i;
        int i2;
        if (interfaceC1269E != interfaceC1269E2) {
            i = Math.round(interfaceC1269E.mo5521x());
            i2 = Math.round(interfaceC1269E.mo5518u());
            for (InterfaceC1269E parent = interfaceC1269E.getParent(); parent != interfaceC1269E2; parent = parent.getParent()) {
                C2038a.m8318a(parent);
                m5611c(parent);
                i += Math.round(parent.mo5521x());
                i2 += Math.round(parent.mo5518u());
            }
            m5611c(interfaceC1269E2);
        } else {
            i = 0;
            i2 = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = interfaceC1269E.mo5509l();
        iArr[3] = interfaceC1269E.mo5476a();
    }

    /* renamed from: c */
    private void m5611c(InterfaceC1269E interfaceC1269E) {
        ViewManager m5891a = this.f4777f.m5891a(interfaceC1269E.mo5517t());
        C2038a.m8318a(m5891a);
        ViewManager viewManager = m5891a;
        if (!(viewManager instanceof ViewGroupManager)) {
            throw new C1353k("Trying to use view " + interfaceC1269E.mo5517t() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
        if (viewGroupManager == null || !viewGroupManager.needsCustomLayoutForChildren()) {
            return;
        }
        throw new C1353k("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + interfaceC1269E.mo5517t() + "). Use measure instead.");
    }

    /* renamed from: d */
    private void m5612d(InterfaceC1269E interfaceC1269E) {
        if (interfaceC1269E.mo5499d()) {
            for (int i = 0; i < interfaceC1269E.mo5501e(); i++) {
                m5612d(interfaceC1269E.mo5502e(i));
            }
            interfaceC1269E.mo5510m();
        }
    }

    /* renamed from: e */
    private void m5613e(InterfaceC1269E interfaceC1269E) {
        C1371t.m5938a(interfaceC1269E);
        this.f4775d.m5592d(interfaceC1269E.mo5504g());
        this.f4776e.remove(Integer.valueOf(interfaceC1269E.mo5504g()));
        for (int mo5501e = interfaceC1269E.mo5501e() - 1; mo5501e >= 0; mo5501e--) {
            m5613e(interfaceC1269E.mo5502e(mo5501e));
        }
        interfaceC1269E.mo5503f();
    }

    /* renamed from: j */
    private void m5614j() {
        if (this.f4778g.m5837e()) {
            m5617a(-1);
        }
    }

    /* renamed from: a */
    protected InterfaceC1269E m5615a(String str) {
        return this.f4777f.m5891a(str).createShadowNodeInstance(this.f4774c);
    }

    /* renamed from: a */
    public void m5616a() {
        this.f4778g.m5809a();
    }

    /* renamed from: a */
    public void m5617a(int i) {
        C1552c.a m6467a = C1552c.m6467a(0L, "UIImplementation.dispatchViewUpdates");
        m6467a.mo6468a("batchId", i);
        m6467a.mo6470a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            m5666i();
            this.f4779h.m5948a();
            this.f4778g.m5817a(i, uptimeMillis, this.f4781j);
        } finally {
            C1550a.m6453a(0L);
        }
    }

    /* renamed from: a */
    public void m5618a(int i, float f, float f2, Callback callback) {
        this.f4778g.m5811a(i, f, f2, callback);
    }

    /* renamed from: a */
    public void m5619a(int i, int i2) {
        m5608a(i, "removeAnimation");
        this.f4778g.m5810a(i2);
    }

    /* renamed from: a */
    public void m5620a(int i, int i2, int i3) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a != null) {
            m5587a.mo5498d(i2);
            m5587a.mo5490b(i3);
            m5614j();
        } else {
            C1700a.m7015d("ReactNative", "Tried to update size of non-existent tag: " + i);
        }
    }

    /* renamed from: a */
    public void m5621a(int i, int i2, Callback callback) {
        m5608a(i, "addAnimation");
        this.f4778g.m5814a(i, i2, callback);
    }

    /* renamed from: a */
    public void m5622a(int i, int i2, Callback callback, Callback callback2) {
        try {
            m5607a(i, i2, this.f4780i);
            callback2.invoke(Float.valueOf(C1374w.m5957a(this.f4780i[0])), Float.valueOf(C1374w.m5957a(this.f4780i[1])), Float.valueOf(C1374w.m5957a(this.f4780i[2])), Float.valueOf(C1374w.m5957a(this.f4780i[3])));
        } catch (C1353k e2) {
            callback.invoke(e2.getMessage());
        }
    }

    /* renamed from: a */
    public void m5623a(int i, int i2, ReadableArray readableArray) {
        m5608a(i, "dispatchViewManagerCommand");
        this.f4778g.m5815a(i, i2, readableArray);
    }

    /* renamed from: a */
    public void m5624a(int i, Callback callback) {
        this.f4778g.m5818a(i, callback);
    }

    /* renamed from: a */
    public void m5625a(int i, Callback callback, Callback callback2) {
        try {
            m5609a(i, this.f4780i);
            callback2.invoke(Float.valueOf(C1374w.m5957a(this.f4780i[0])), Float.valueOf(C1374w.m5957a(this.f4780i[1])), Float.valueOf(C1374w.m5957a(this.f4780i[2])), Float.valueOf(C1374w.m5957a(this.f4780i[3])));
        } catch (C1353k e2) {
            callback.invoke(e2.getMessage());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m5626a(int i, ReadableArray readableArray) {
        synchronized (this.f4772a) {
            InterfaceC1269E m5587a = this.f4775d.m5587a(i);
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                InterfaceC1269E m5587a2 = this.f4775d.m5587a(readableArray.getInt(i2));
                if (m5587a2 == null) {
                    throw new C1353k("Trying to add unknown view tag: " + readableArray.getInt(i2));
                }
                m5587a.mo5492b(m5587a2, i2);
            }
            if (!m5587a.mo5507j() && !m5587a.mo5520w()) {
                this.f4779h.m5949a(m5587a, readableArray);
            }
        }
    }

    /* renamed from: a */
    public void m5627a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        m5608a(i, "showPopupMenu");
        this.f4778g.m5819a(i, readableArray, callback, callback2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:            if (r23 == null) goto L204;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:            if (r11 != r23.size()) goto L204;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:            throw new com.facebook.react.uimanager.C1353k("Size of addChildTags != size of addAtIndices!");     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5628a(int r19, com.facebook.react.bridge.ReadableArray r20, com.facebook.react.bridge.ReadableArray r21, com.facebook.react.bridge.ReadableArray r22, com.facebook.react.bridge.ReadableArray r23, com.facebook.react.bridge.ReadableArray r24) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1284U.m5628a(int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray):void");
    }

    /* renamed from: a */
    public void m5629a(int i, C1271G c1271g) {
        UiThreadUtil.assertOnUiThread();
        this.f4778g.m5835c().m5920a(i, c1271g);
    }

    /* renamed from: a */
    public void m5630a(int i, Object obj) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a != null) {
            m5587a.mo5484a(obj);
            m5614j();
        } else {
            C1700a.m7015d("ReactNative", "Attempt to set local data for view with unknown tag: " + i);
        }
    }

    /* renamed from: a */
    public void m5631a(int i, String str, int i2, ReadableMap readableMap) {
        synchronized (this.f4772a) {
            InterfaceC1269E m5615a = m5615a(str);
            InterfaceC1269E m5587a = this.f4775d.m5587a(i2);
            C2038a.m8319a(m5587a, "Root node with tag " + i2 + " doesn't exist");
            m5615a.mo5496c(i);
            m5615a.mo5485a(str);
            m5615a.mo5491b(m5587a.mo5504g());
            m5615a.mo5482a(m5587a.mo5513p());
            this.f4775d.m5588a(m5615a);
            C1271G c1271g = null;
            if (readableMap != null) {
                c1271g = new C1271G(readableMap);
                m5615a.mo5481a(c1271g);
            }
            m5638a(m5615a, i2, c1271g);
        }
    }

    /* renamed from: a */
    public void m5632a(int i, String str, ReadableMap readableMap) {
        if (this.f4777f.m5891a(str) == null) {
            throw new C1353k("Got unknown view type: " + str);
        }
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a == null) {
            throw new C1353k("Trying to update non-existent view with tag " + i);
        }
        if (readableMap != null) {
            C1271G c1271g = new C1271G(readableMap);
            m5587a.mo5481a(c1271g);
            m5639a(m5587a, str, c1271g);
        }
    }

    /* renamed from: a */
    public void m5633a(int i, boolean z) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a == null) {
            return;
        }
        while (true) {
            if (!m5587a.mo5507j() && !m5587a.mo5475A()) {
                this.f4778g.m5816a(m5587a.mo5504g(), i, z);
                return;
            }
            m5587a = m5587a.getParent();
        }
    }

    /* renamed from: a */
    public void m5634a(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.f4778g.m5824a(readableMap, callback, callback2);
    }

    /* renamed from: a */
    protected void m5635a(InterfaceC1269E interfaceC1269E) {
        C1552c.a m6467a = C1552c.m6467a(0L, "cssRoot.calculateLayout");
        m6467a.mo6468a("rootTag", interfaceC1269E.mo5504g());
        m6467a.mo6470a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            interfaceC1269E.mo5506i();
        } finally {
            C1550a.m6453a(0L);
            this.f4781j = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    /* renamed from: a */
    protected void m5636a(InterfaceC1269E interfaceC1269E, float f, float f2) {
        if (interfaceC1269E.mo5499d()) {
            if (!interfaceC1269E.mo5520w()) {
                for (int i = 0; i < interfaceC1269E.mo5501e(); i++) {
                    m5636a(interfaceC1269E.mo5502e(i), interfaceC1269E.mo5521x() + f, interfaceC1269E.mo5518u() + f2);
                }
            }
            int mo5504g = interfaceC1269E.mo5504g();
            if (!this.f4775d.m5591c(mo5504g) && interfaceC1269E.mo5487a(f, f2, this.f4778g, this.f4779h) && interfaceC1269E.mo5515r()) {
                this.f4773b.m5753a(C1373v.m5954b(mo5504g, interfaceC1269E.mo5519v(), interfaceC1269E.mo5512o(), interfaceC1269E.mo5509l(), interfaceC1269E.mo5476a()));
            }
            interfaceC1269E.mo5489b();
        }
    }

    /* renamed from: a */
    public void m5637a(InterfaceC1269E interfaceC1269E, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            interfaceC1269E.mo5479a(size);
        } else if (mode == 0) {
            interfaceC1269E.mo5522y();
        } else if (mode == 1073741824) {
            interfaceC1269E.mo5498d(size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            interfaceC1269E.mo5495c(size2);
        } else if (mode2 == 0) {
            interfaceC1269E.mo5516s();
        } else {
            if (mode2 != 1073741824) {
                return;
            }
            interfaceC1269E.mo5490b(size2);
        }
    }

    /* renamed from: a */
    protected void m5638a(InterfaceC1269E interfaceC1269E, int i, C1271G c1271g) {
        if (interfaceC1269E.mo5507j()) {
            return;
        }
        this.f4779h.m5950a(interfaceC1269E, interfaceC1269E.mo5513p(), c1271g);
    }

    /* renamed from: a */
    protected void m5639a(InterfaceC1269E interfaceC1269E, String str, C1271G c1271g) {
        if (interfaceC1269E.mo5507j()) {
            return;
        }
        this.f4779h.m5951a(interfaceC1269E, str, c1271g);
    }

    /* renamed from: a */
    public void m5640a(InterfaceC1282S interfaceC1282S) {
        this.f4778g.m5827a(interfaceC1282S);
    }

    /* renamed from: a */
    public void m5641a(InterfaceC1298a interfaceC1298a) {
        this.f4778g.m5828a(interfaceC1298a);
    }

    /* renamed from: a */
    public <T extends SizeMonitoringFrameLayout & InterfaceC1321a> void m5642a(T t, int i, C1278N c1278n) {
        synchronized (this.f4772a) {
            InterfaceC1269E m5645b = m5645b();
            m5645b.mo5496c(i);
            m5645b.mo5482a(c1278n);
            m5637a(m5645b, t.getWidthMeasureSpec(), t.getHeightMeasureSpec());
            c1278n.runOnNativeModulesQueueThread(new RunnableC1283T(this, m5645b));
            this.f4778g.m5820a(i, t, c1278n);
        }
    }

    /* renamed from: a */
    public void m5643a(AbstractC2062a abstractC2062a) {
        this.f4778g.m5829a(abstractC2062a);
    }

    /* renamed from: a */
    public void m5644a(boolean z) {
        this.f4778g.m5830a(z);
    }

    /* renamed from: b */
    protected InterfaceC1269E m5645b() {
        C1270F c1270f = new C1270F();
        if (C1190a.m5346a().m5355b(this.f4774c)) {
            c1270f.mo5483a(YogaDirection.RTL);
        }
        c1270f.mo5485a("Root");
        return c1270f;
    }

    /* renamed from: b */
    public final ViewManager m5646b(String str) {
        return this.f4777f.m5891a(str);
    }

    /* renamed from: b */
    public void m5647b(int i) {
        this.f4776e.add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void m5648b(int i, int i2) {
        if (this.f4775d.m5591c(i) || this.f4775d.m5591c(i2)) {
            throw new C1353k("Trying to add or replace a root tag!");
        }
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a == null) {
            throw new C1353k("Trying to replace unknown view tag: " + i);
        }
        InterfaceC1269E parent = m5587a.getParent();
        if (parent == null) {
            throw new C1353k("Node is not attached to a parent: " + i);
        }
        int mo5493c = parent.mo5493c(m5587a);
        if (mo5493c < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i2);
        WritableArray createArray2 = Arguments.createArray();
        createArray2.pushInt(mo5493c);
        WritableArray createArray3 = Arguments.createArray();
        createArray3.pushInt(mo5493c);
        m5628a(parent.mo5504g(), null, null, createArray, createArray2, createArray3);
    }

    /* renamed from: b */
    public void m5649b(int i, int i2, int i3) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a != null) {
            m5637a(m5587a, i2, i3);
            return;
        }
        C1700a.m7015d("ReactNative", "Tried to update non-existent root tag: " + i);
    }

    /* renamed from: b */
    public void m5650b(int i, int i2, Callback callback) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        InterfaceC1269E m5587a2 = this.f4775d.m5587a(i2);
        if (m5587a == null || m5587a2 == null) {
            callback.invoke(false);
        } else {
            callback.invoke(Boolean.valueOf(m5587a.mo5500d(m5587a2)));
        }
    }

    /* renamed from: b */
    public void m5651b(int i, Callback callback) {
        this.f4778g.m5833b(i, callback);
    }

    /* renamed from: b */
    protected final void m5652b(InterfaceC1269E interfaceC1269E) {
        m5613e(interfaceC1269E);
        interfaceC1269E.mo5511n();
    }

    /* renamed from: b */
    public void m5653b(InterfaceC1282S interfaceC1282S) {
        this.f4778g.m5834b(interfaceC1282S);
    }

    /* renamed from: c */
    public void m5654c() {
        this.f4778g.m5831b();
    }

    /* renamed from: c */
    public void m5655c(int i) {
        synchronized (this.f4772a) {
            this.f4775d.m5593e(i);
        }
    }

    /* renamed from: c */
    public void m5656c(int i, int i2) {
        this.f4778g.m5812a(i, i2);
    }

    /* renamed from: d */
    public Map<String, Long> m5657d() {
        return this.f4778g.m5836d();
    }

    /* renamed from: d */
    public void m5658d(int i) {
        m5655c(i);
        this.f4778g.m5832b(i);
    }

    /* renamed from: e */
    public void m5659e() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: e */
    public void m5660e(int i) {
        InterfaceC1269E m5587a = this.f4775d.m5587a(i);
        if (m5587a == null) {
            throw new C1353k("Trying to remove subviews of an unknown view tag: " + i);
        }
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < m5587a.mo5501e(); i2++) {
            createArray.pushInt(i2);
        }
        m5628a(i, null, null, null, null, createArray);
    }

    /* renamed from: f */
    public int m5661f(int i) {
        if (this.f4775d.m5591c(i)) {
            return i;
        }
        InterfaceC1269E m5663g = m5663g(i);
        if (m5663g != null) {
            return m5663g.mo5514q();
        }
        C1700a.m7015d("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
        return 0;
    }

    /* renamed from: f */
    public void m5662f() {
        this.f4778g.m5838f();
    }

    /* renamed from: g */
    public final InterfaceC1269E m5663g(int i) {
        return this.f4775d.m5587a(i);
    }

    /* renamed from: g */
    public void m5664g() {
        this.f4778g.m5840h();
    }

    /* renamed from: h */
    public void m5665h() {
        this.f4778g.m5839g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:            throw r0;     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m5666i() {
        /*
            r7 = this;
            java.lang.String r0 = "rootTag"
            r1 = 0
            java.lang.String r3 = "UIImplementation.updateViewHierarchy"
            com.facebook.systrace.C1550a.m6454a(r1, r3)
            r3 = 0
        La:
            com.facebook.react.uimanager.L r4 = r7.f4775d     // Catch: java.lang.Throwable -> L77
            int r4 = r4.m5586a()     // Catch: java.lang.Throwable -> L77
            if (r3 >= r4) goto L73
            com.facebook.react.uimanager.L r4 = r7.f4775d     // Catch: java.lang.Throwable -> L77
            int r4 = r4.m5589b(r3)     // Catch: java.lang.Throwable -> L77
            com.facebook.react.uimanager.L r5 = r7.f4775d     // Catch: java.lang.Throwable -> L77
            com.facebook.react.uimanager.E r5 = r5.m5587a(r4)     // Catch: java.lang.Throwable -> L77
            java.util.Set<java.lang.Integer> r6 = r7.f4776e     // Catch: java.lang.Throwable -> L77
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L77
            boolean r4 = r6.contains(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L70
            java.lang.String r4 = "UIImplementation.notifyOnBeforeLayoutRecursive"
            com.facebook.systrace.c$a r4 = com.facebook.systrace.C1552c.m6467a(r1, r4)     // Catch: java.lang.Throwable -> L77
            int r6 = r5.mo5504g()     // Catch: java.lang.Throwable -> L77
            r4.mo6468a(r0, r6)     // Catch: java.lang.Throwable -> L77
            r4.mo6470a()     // Catch: java.lang.Throwable -> L77
            r7.m5612d(r5)     // Catch: java.lang.Throwable -> L6b
            com.facebook.systrace.C1550a.m6453a(r1)     // Catch: java.lang.Throwable -> L77
            r7.m5635a(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "UIImplementation.applyUpdatesRecursive"
            com.facebook.systrace.c$a r4 = com.facebook.systrace.C1552c.m6467a(r1, r4)     // Catch: java.lang.Throwable -> L77
            int r6 = r5.mo5504g()     // Catch: java.lang.Throwable -> L77
            r4.mo6468a(r0, r6)     // Catch: java.lang.Throwable -> L77
            r4.mo6470a()     // Catch: java.lang.Throwable -> L77
            r4 = 0
            r7.m5636a(r5, r4, r4)     // Catch: java.lang.Throwable -> L66
            com.facebook.systrace.C1550a.m6453a(r1)     // Catch: java.lang.Throwable -> L77
            com.facebook.react.uimanager.U$a r4 = r7.f4782k     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L70
            com.facebook.react.uimanager.ha r4 = r7.f4778g     // Catch: java.lang.Throwable -> L77
            com.facebook.react.uimanager.U$a r6 = r7.f4782k     // Catch: java.lang.Throwable -> L77
            r4.m5825a(r5, r6)     // Catch: java.lang.Throwable -> L77
            goto L70
        L66:
            r0 = move-exception
            com.facebook.systrace.C1550a.m6453a(r1)     // Catch: java.lang.Throwable -> L77
            throw r0     // Catch: java.lang.Throwable -> L77
        L6b:
            r0 = move-exception
            com.facebook.systrace.C1550a.m6453a(r1)     // Catch: java.lang.Throwable -> L77
            throw r0     // Catch: java.lang.Throwable -> L77
        L70:
            int r3 = r3 + 1
            goto La
        L73:
            com.facebook.systrace.C1550a.m6453a(r1)
            return
        L77:
            r0 = move-exception
            com.facebook.systrace.C1550a.m6453a(r1)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1284U.m5666i():void");
    }
}
