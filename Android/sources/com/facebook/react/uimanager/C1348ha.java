package com.facebook.react.uimanager;

import android.os.SystemClock;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C1170i;
import com.facebook.react.uimanager.C1284U;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.p128b.InterfaceC1298a;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.C1552c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p209a.AbstractC2062a;
import p139d.p143b.p208m.p209a.C2065d;

/* renamed from: com.facebook.react.uimanager.ha */
/* loaded from: classes.dex */
public class C1348ha {

    /* renamed from: b */
    private final C1369s f4922b;

    /* renamed from: c */
    private final C2065d f4923c;

    /* renamed from: f */
    private final h f4926f;

    /* renamed from: g */
    private final ReactApplicationContext f4927g;

    /* renamed from: k */
    private InterfaceC1298a f4931k;

    /* renamed from: o */
    private long f4935o;

    /* renamed from: p */
    private long f4936p;

    /* renamed from: q */
    private long f4937q;

    /* renamed from: r */
    private long f4938r;

    /* renamed from: s */
    private long f4939s;

    /* renamed from: t */
    private long f4940t;

    /* renamed from: u */
    private long f4941u;

    /* renamed from: v */
    private long f4942v;

    /* renamed from: a */
    private final int[] f4921a = new int[4];

    /* renamed from: d */
    private final Object f4924d = new Object();

    /* renamed from: e */
    private final Object f4925e = new Object();

    /* renamed from: h */
    private ArrayList<u> f4928h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<Runnable> f4929i = new ArrayList<>();

    /* renamed from: j */
    private ArrayDeque<u> f4930j = new ArrayDeque<>();

    /* renamed from: l */
    private boolean f4932l = false;

    /* renamed from: m */
    private boolean f4933m = false;

    /* renamed from: n */
    private boolean f4934n = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$a */
    /* loaded from: classes.dex */
    public class a extends b {

        /* renamed from: b */
        private final int f4943b;

        /* renamed from: c */
        private final Callback f4944c;

        private a(int i, int i2, Callback callback) {
            super(i2);
            this.f4943b = i;
            this.f4944c = callback;
        }

        /* synthetic */ a(C1348ha c1348ha, int i, int i2, Callback callback, RunnableC1344fa runnableC1344fa) {
            this(i, i2, callback);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            AbstractC2062a m8432a = C1348ha.this.f4923c.m8432a(this.f4946a);
            if (m8432a != null) {
                C1348ha.this.f4922b.m5922a(this.f4943b, m8432a, this.f4944c);
                return;
            }
            throw new C1353k("Animation with id " + this.f4946a + " was not found");
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$b */
    /* loaded from: classes.dex */
    private static abstract class b implements u {

        /* renamed from: a */
        protected final int f4946a;

        public b(int i) {
            this.f4946a = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$c */
    /* loaded from: classes.dex */
    public final class c extends y {

        /* renamed from: c */
        private final int f4947c;

        /* renamed from: d */
        private final boolean f4948d;

        /* renamed from: e */
        private final boolean f4949e;

        public c(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.f4947c = i2;
            this.f4949e = z;
            this.f4948d = z2;
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            if (this.f4949e) {
                C1348ha.this.f4922b.m5912a();
            } else {
                C1348ha.this.f4922b.m5917a(this.f5005a, this.f4947c, this.f4948d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$d */
    /* loaded from: classes.dex */
    public class d implements u {

        /* renamed from: a */
        private final ReadableMap f4951a;

        private d(ReadableMap readableMap) {
            this.f4951a = readableMap;
        }

        /* synthetic */ d(C1348ha c1348ha, ReadableMap readableMap, RunnableC1344fa runnableC1344fa) {
            this(readableMap);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5927a(this.f4951a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$e */
    /* loaded from: classes.dex */
    private final class e extends y {

        /* renamed from: c */
        private final C1278N f4953c;

        /* renamed from: d */
        private final String f4954d;

        /* renamed from: e */
        private final C1271G f4955e;

        public e(C1278N c1278n, int i, String str, C1271G c1271g) {
            super(i);
            this.f4953c = c1278n;
            this.f4954d = str;
            this.f4955e = c1271g;
            C1550a.m6464d(0L, "createView", this.f5005a);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1550a.m6459b(0L, "createView", this.f5005a);
            C1348ha.this.f4922b.m5928a(this.f4953c, this.f5005a, this.f4954d, this.f4955e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$f */
    /* loaded from: classes.dex */
    public final class f implements u {
        private f() {
        }

        /* synthetic */ f(C1348ha c1348ha, RunnableC1344fa runnableC1344fa) {
            this();
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5934c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$g */
    /* loaded from: classes.dex */
    public final class g extends y {

        /* renamed from: c */
        private final int f4958c;

        /* renamed from: d */
        private final ReadableArray f4959d;

        public g(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.f4958c = i2;
            this.f4959d = readableArray;
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5916a(this.f5005a, this.f4958c, this.f4959d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$h */
    /* loaded from: classes.dex */
    public class h extends AbstractC1351j {

        /* renamed from: c */
        private final int f4961c;

        private h(ReactContext reactContext, int i) {
            super(reactContext);
            this.f4961c = i;
        }

        /* synthetic */ h(C1348ha c1348ha, ReactContext reactContext, int i, RunnableC1344fa runnableC1344fa) {
            this(reactContext, i);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: c */
        private void m5841c(long j) {
            u uVar;
            while (16 - ((System.nanoTime() - j) / 1000000) >= this.f4961c) {
                synchronized (C1348ha.this.f4925e) {
                    if (C1348ha.this.f4930j.isEmpty()) {
                        return;
                    } else {
                        uVar = (u) C1348ha.this.f4930j.pollFirst();
                    }
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    uVar.execute();
                    C1348ha.this.f4935o += SystemClock.uptimeMillis() - uptimeMillis;
                } catch (Exception e2) {
                    C1348ha.this.f4933m = true;
                    throw e2;
                }
            }
        }

        @Override // com.facebook.react.uimanager.AbstractC1351j
        /* renamed from: b */
        public void mo5158b(long j) {
            if (C1348ha.this.f4933m) {
                C1700a.m7015d("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            C1550a.m6454a(0L, "dispatchNonBatchedUIOperations");
            try {
                m5841c(j);
                C1550a.m6453a(0L);
                C1348ha.this.m5803i();
                C1170i.m5289a().m5296a(C1170i.a.DISPATCH_UI, this);
            } catch (Throwable th) {
                C1550a.m6453a(0L);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$i */
    /* loaded from: classes.dex */
    public final class i implements u {

        /* renamed from: a */
        private final int f4963a;

        /* renamed from: b */
        private final float f4964b;

        /* renamed from: c */
        private final float f4965c;

        /* renamed from: d */
        private final Callback f4966d;

        private i(int i, float f, float f2, Callback callback) {
            this.f4963a = i;
            this.f4964b = f;
            this.f4965c = f2;
            this.f4966d = callback;
        }

        /* synthetic */ i(C1348ha c1348ha, int i, float f, float f2, Callback callback, RunnableC1344fa runnableC1344fa) {
            this(i, f, f2, callback);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            try {
                C1348ha.this.f4922b.m5924a(this.f4963a, C1348ha.this.f4921a);
                float f = C1348ha.this.f4921a[0];
                float f2 = C1348ha.this.f4921a[1];
                int m5911a = C1348ha.this.f4922b.m5911a(this.f4963a, this.f4964b, this.f4965c);
                try {
                    C1348ha.this.f4922b.m5924a(m5911a, C1348ha.this.f4921a);
                    this.f4966d.invoke(Integer.valueOf(m5911a), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[0] - f)), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[1] - f2)), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[2])), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[3])));
                } catch (C1353k unused) {
                    this.f4966d.invoke(new Object[0]);
                }
            } catch (C1353k unused2) {
                this.f4966d.invoke(new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$j */
    /* loaded from: classes.dex */
    public final class j implements u {

        /* renamed from: a */
        private final InterfaceC1269E f4968a;

        /* renamed from: b */
        private final C1284U.a f4969b;

        private j(InterfaceC1269E interfaceC1269E, C1284U.a aVar) {
            this.f4968a = interfaceC1269E;
            this.f4969b = aVar;
        }

        /* synthetic */ j(C1348ha c1348ha, InterfaceC1269E interfaceC1269E, C1284U.a aVar, RunnableC1344fa runnableC1344fa) {
            this(interfaceC1269E, aVar);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            this.f4969b.m5667a(this.f4968a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$k */
    /* loaded from: classes.dex */
    private final class k extends y {

        /* renamed from: c */
        private final int[] f4971c;

        /* renamed from: d */
        private final C1352ja[] f4972d;

        /* renamed from: e */
        private final int[] f4973e;

        public k(int i, int[] iArr, C1352ja[] c1352jaArr, int[] iArr2) {
            super(i);
            this.f4971c = iArr;
            this.f4972d = c1352jaArr;
            this.f4973e = iArr2;
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5925a(this.f5005a, this.f4971c, this.f4972d, this.f4973e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$l */
    /* loaded from: classes.dex */
    public final class l implements u {

        /* renamed from: a */
        private final int f4975a;

        /* renamed from: b */
        private final Callback f4976b;

        private l(int i, Callback callback) {
            this.f4975a = i;
            this.f4976b = callback;
        }

        /* synthetic */ l(C1348ha c1348ha, int i, Callback callback, RunnableC1344fa runnableC1344fa) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            try {
                C1348ha.this.f4922b.m5932b(this.f4975a, C1348ha.this.f4921a);
                this.f4976b.invoke(Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[0])), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[1])), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[2])), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[3])));
            } catch (C1372u unused) {
                this.f4976b.invoke(new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$m */
    /* loaded from: classes.dex */
    public final class m implements u {

        /* renamed from: a */
        private final int f4978a;

        /* renamed from: b */
        private final Callback f4979b;

        private m(int i, Callback callback) {
            this.f4978a = i;
            this.f4979b = callback;
        }

        /* synthetic */ m(C1348ha c1348ha, int i, Callback callback, RunnableC1344fa runnableC1344fa) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            try {
                C1348ha.this.f4922b.m5924a(this.f4978a, C1348ha.this.f4921a);
                this.f4979b.invoke(0, 0, Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[2])), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[3])), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[0])), Float.valueOf(C1374w.m5957a(C1348ha.this.f4921a[1])));
            } catch (C1372u unused) {
                this.f4979b.invoke(new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$n */
    /* loaded from: classes.dex */
    public class n extends b {

        /* renamed from: b */
        private final AbstractC2062a f4981b;

        private n(AbstractC2062a abstractC2062a) {
            super(abstractC2062a.m8429b());
            this.f4981b = abstractC2062a;
        }

        /* synthetic */ n(C1348ha c1348ha, AbstractC2062a abstractC2062a, RunnableC1344fa runnableC1344fa) {
            this(abstractC2062a);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4923c.m8433a(this.f4981b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$o */
    /* loaded from: classes.dex */
    public final class o extends b {
        private o(int i) {
            super(i);
        }

        /* synthetic */ o(C1348ha c1348ha, int i, RunnableC1344fa runnableC1344fa) {
            this(i);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            AbstractC2062a m8432a = C1348ha.this.f4923c.m8432a(this.f4946a);
            if (m8432a != null) {
                m8432a.m8426a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$p */
    /* loaded from: classes.dex */
    public final class p extends y {
        public p(int i) {
            super(i);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5913a(this.f5005a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$q */
    /* loaded from: classes.dex */
    public final class q extends y {

        /* renamed from: c */
        private final int f4985c;

        private q(int i, int i2) {
            super(i);
            this.f4985c = i2;
        }

        /* synthetic */ q(C1348ha c1348ha, int i, int i2, RunnableC1344fa runnableC1344fa) {
            this(i, i2);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5914a(this.f5005a, this.f4985c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$r */
    /* loaded from: classes.dex */
    public class r implements u {

        /* renamed from: a */
        private final boolean f4987a;

        private r(boolean z) {
            this.f4987a = z;
        }

        /* synthetic */ r(C1348ha c1348ha, boolean z, RunnableC1344fa runnableC1344fa) {
            this(z);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5929a(this.f4987a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$s */
    /* loaded from: classes.dex */
    public final class s extends y {

        /* renamed from: c */
        private final ReadableArray f4989c;

        /* renamed from: d */
        private final Callback f4990d;

        /* renamed from: e */
        private final Callback f4991e;

        public s(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.f4989c = readableArray;
            this.f4990d = callback;
            this.f4991e = callback2;
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5919a(this.f5005a, this.f4989c, this.f4991e, this.f4990d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$t */
    /* loaded from: classes.dex */
    public class t implements u {

        /* renamed from: a */
        private final InterfaceC1282S f4993a;

        public t(InterfaceC1282S interfaceC1282S) {
            this.f4993a = interfaceC1282S;
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            this.f4993a.mo5159a(C1348ha.this.f4922b);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$u */
    /* loaded from: classes.dex */
    public interface u {
        void execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$v */
    /* loaded from: classes.dex */
    public final class v extends y {

        /* renamed from: c */
        private final int f4995c;

        /* renamed from: d */
        private final int f4996d;

        /* renamed from: e */
        private final int f4997e;

        /* renamed from: f */
        private final int f4998f;

        /* renamed from: g */
        private final int f4999g;

        public v(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.f4995c = i;
            this.f4996d = i3;
            this.f4997e = i4;
            this.f4998f = i5;
            this.f4999g = i6;
            C1550a.m6464d(0L, "updateLayout", this.f5005a);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1550a.m6459b(0L, "updateLayout", this.f5005a);
            C1348ha.this.f4922b.m5915a(this.f4995c, this.f5005a, this.f4996d, this.f4997e, this.f4998f, this.f4999g);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$w */
    /* loaded from: classes.dex */
    private final class w extends y {

        /* renamed from: c */
        private final C1271G f5001c;

        private w(int i, C1271G c1271g) {
            super(i);
            this.f5001c = c1271g;
        }

        /* synthetic */ w(C1348ha c1348ha, int i, C1271G c1271g, RunnableC1344fa runnableC1344fa) {
            this(i, c1271g);
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5920a(this.f5005a, this.f5001c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.ha$x */
    /* loaded from: classes.dex */
    public final class x extends y {

        /* renamed from: c */
        private final Object f5003c;

        public x(int i, Object obj) {
            super(i);
            this.f5003c = obj;
        }

        @Override // com.facebook.react.uimanager.C1348ha.u
        public void execute() {
            C1348ha.this.f4922b.m5923a(this.f5005a, this.f5003c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$y */
    /* loaded from: classes.dex */
    private abstract class y implements u {

        /* renamed from: a */
        public int f5005a;

        public y(int i) {
            this.f5005a = i;
        }
    }

    public C1348ha(ReactApplicationContext reactApplicationContext, C1369s c1369s, int i2) {
        this.f4922b = c1369s;
        this.f4923c = c1369s.m5935d();
        this.f4926f = new h(this, reactApplicationContext, i2 == -1 ? 8 : i2, null);
        this.f4927g = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: i */
    public void m5803i() {
        if (this.f4933m) {
            C1700a.m7015d("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f4924d) {
            if (this.f4929i.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.f4929i;
            this.f4929i = new ArrayList<>();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.f4934n) {
                this.f4940t = SystemClock.uptimeMillis() - uptimeMillis;
                this.f4941u = this.f4935o;
                this.f4934n = false;
                C1550a.m6456a(0L, "batchedExecutionTime", 0, 1000000 * uptimeMillis);
                C1550a.m6463c(0L, "batchedExecutionTime", 0);
            }
            this.f4935o = 0L;
        }
    }

    /* renamed from: a */
    public void m5809a() {
        this.f4928h.add(new c(0, 0, true, false));
    }

    /* renamed from: a */
    public void m5810a(int i2) {
        this.f4928h.add(new o(this, i2, null));
    }

    /* renamed from: a */
    public void m5811a(int i2, float f2, float f3, Callback callback) {
        this.f4928h.add(new i(this, i2, f2, f3, callback, null));
    }

    /* renamed from: a */
    public void m5812a(int i2, int i3) {
        this.f4928h.add(new q(this, i2, i3, null));
    }

    /* renamed from: a */
    public void m5813a(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f4928h.add(new v(i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: a */
    public void m5814a(int i2, int i3, Callback callback) {
        this.f4928h.add(new a(this, i2, i3, callback, null));
    }

    /* renamed from: a */
    public void m5815a(int i2, int i3, ReadableArray readableArray) {
        this.f4928h.add(new g(i2, i3, readableArray));
    }

    /* renamed from: a */
    public void m5816a(int i2, int i3, boolean z) {
        this.f4928h.add(new c(i2, i3, false, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m5817a(int i2, long j2, long j3) {
        long j4;
        ArrayList<u> arrayList;
        ArrayDeque arrayDeque;
        C1552c.a m6467a = C1552c.m6467a(0L, "UIViewOperationQueue.dispatchViewUpdates");
        m6467a.mo6468a("batchId", i2);
        m6467a.mo6470a();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            j4 = 0;
            j4 = 0;
            if (this.f4928h.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList<u> arrayList2 = this.f4928h;
                this.f4928h = new ArrayList<>();
                arrayList = arrayList2;
            }
            synchronized (this.f4925e) {
                try {
                    try {
                        if (!this.f4930j.isEmpty()) {
                            ArrayDeque<u> arrayDeque2 = this.f4930j;
                            this.f4930j = new ArrayDeque<>();
                            j4 = arrayDeque2;
                        }
                        arrayDeque = j4;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C1550a.m6453a(j4);
                    throw th;
                }
            }
            if (this.f4931k != null) {
                this.f4931k.mo5309a();
            }
            try {
                RunnableC1344fa runnableC1344fa = new RunnableC1344fa(this, i2, arrayDeque, arrayList, j2, j3, uptimeMillis, currentThreadTimeMillis);
                j4 = 0;
                j4 = 0;
                C1552c.a m6467a2 = C1552c.m6467a(0L, "acquiring mDispatchRunnablesLock");
                m6467a2.mo6468a("batchId", i2);
                m6467a2.mo6470a();
                synchronized (this.f4924d) {
                    C1550a.m6453a(0L);
                    this.f4929i.add(runnableC1344fa);
                }
                if (!this.f4932l) {
                    UiThreadUtil.runOnUiThread(new C1346ga(this, this.f4927g));
                }
                C1550a.m6453a(0L);
            } catch (Throwable th4) {
                th = th4;
                j4 = 0;
                C1550a.m6453a(j4);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            j4 = 0;
        }
    }

    /* renamed from: a */
    public void m5818a(int i2, Callback callback) {
        this.f4928h.add(new m(this, i2, callback, null));
    }

    /* renamed from: a */
    public void m5819a(int i2, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.f4928h.add(new s(i2, readableArray, callback, callback2));
    }

    /* renamed from: a */
    public void m5820a(int i2, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, C1278N c1278n) {
        this.f4922b.m5921a(i2, sizeMonitoringFrameLayout, c1278n);
    }

    /* renamed from: a */
    public void m5821a(int i2, Object obj) {
        this.f4928h.add(new x(i2, obj));
    }

    /* renamed from: a */
    public void m5822a(int i2, String str, C1271G c1271g) {
        this.f4928h.add(new w(this, i2, c1271g, null));
    }

    /* renamed from: a */
    public void m5823a(int i2, int[] iArr, C1352ja[] c1352jaArr, int[] iArr2) {
        this.f4928h.add(new k(i2, iArr, c1352jaArr, iArr2));
    }

    /* renamed from: a */
    public void m5824a(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.f4928h.add(new d(this, readableMap, null));
    }

    /* renamed from: a */
    public void m5825a(InterfaceC1269E interfaceC1269E, C1284U.a aVar) {
        this.f4928h.add(new j(this, interfaceC1269E, aVar, null));
    }

    /* renamed from: a */
    public void m5826a(C1278N c1278n, int i2, String str, C1271G c1271g) {
        synchronized (this.f4925e) {
            this.f4930j.addLast(new e(c1278n, i2, str, c1271g));
        }
    }

    /* renamed from: a */
    public void m5827a(InterfaceC1282S interfaceC1282S) {
        this.f4928h.add(new t(interfaceC1282S));
    }

    /* renamed from: a */
    public void m5828a(InterfaceC1298a interfaceC1298a) {
        this.f4931k = interfaceC1298a;
    }

    /* renamed from: a */
    public void m5829a(AbstractC2062a abstractC2062a) {
        this.f4928h.add(new n(this, abstractC2062a, null));
    }

    /* renamed from: a */
    public void m5830a(boolean z) {
        this.f4928h.add(new r(this, z, null));
    }

    /* renamed from: b */
    public void m5831b() {
        this.f4928h.add(new f(this, null));
    }

    /* renamed from: b */
    public void m5832b(int i2) {
        this.f4928h.add(new p(i2));
    }

    /* renamed from: b */
    public void m5833b(int i2, Callback callback) {
        this.f4928h.add(new l(this, i2, callback, null));
    }

    /* renamed from: b */
    public void m5834b(InterfaceC1282S interfaceC1282S) {
        this.f4928h.add(0, new t(interfaceC1282S));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C1369s m5835c() {
        return this.f4922b;
    }

    /* renamed from: d */
    public Map<String, Long> m5836d() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f4936p));
        hashMap.put("LayoutTime", Long.valueOf(this.f4937q));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f4938r));
        hashMap.put("RunStartTime", Long.valueOf(this.f4939s));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f4940t));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f4941u));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.f4942v));
        return hashMap;
    }

    /* renamed from: e */
    public boolean m5837e() {
        return this.f4928h.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m5838f() {
        this.f4932l = false;
        C1170i.m5289a().m5298b(C1170i.a.DISPATCH_UI, this.f4926f);
        m5803i();
    }

    /* renamed from: g */
    public void m5839g() {
        this.f4934n = true;
        this.f4936p = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m5840h() {
        this.f4932l = true;
        C1170i.m5289a().m5296a(C1170i.a.DISPATCH_UI, this.f4926f);
    }
}
