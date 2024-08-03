package p139d.p225c.p226a.p227a.p231d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.p231d.C2207g;
import p139d.p225c.p226a.p227a.p231d.C2210j;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2214n;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2217q;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2635l;
import p139d.p225c.p226a.p227a.p270n.C2638o;

@TargetApi(18)
/* renamed from: d.c.a.a.d.j */
/* loaded from: classes.dex */
public class C2210j<T extends InterfaceC2217q> implements InterfaceC2215o<T>, C2207g.c<T> {

    /* renamed from: a */
    private final UUID f8092a;

    /* renamed from: b */
    private final InterfaceC2218r<T> f8093b;

    /* renamed from: c */
    private final InterfaceC2221u f8094c;

    /* renamed from: d */
    private final HashMap<String, String> f8095d;

    /* renamed from: e */
    private final C2635l<InterfaceC2208h> f8096e;

    /* renamed from: f */
    private final boolean f8097f;

    /* renamed from: g */
    private final int f8098g;

    /* renamed from: h */
    private final List<C2207g<T>> f8099h;

    /* renamed from: i */
    private final List<C2207g<T>> f8100i;

    /* renamed from: j */
    private Looper f8101j;

    /* renamed from: k */
    private int f8102k;

    /* renamed from: l */
    private byte[] f8103l;

    /* renamed from: m */
    volatile C2210j<T>.a f8104m;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: d.c.a.a.d.j$a */
    /* loaded from: classes.dex */
    private class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (C2207g c2207g : C2210j.this.f8099h) {
                if (c2207g.m9068a(bArr)) {
                    c2207g.m9066a(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: d.c.a.a.d.j$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {
        private b(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: a */
    private static List<C2213m.a> m9082a(C2213m c2213m, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c2213m.f8109d);
        for (int i = 0; i < c2213m.f8109d; i++) {
            C2213m.a m9091a = c2213m.m9091a(i);
            if ((m9091a.m9096a(uuid) || (C2200d.f8061c.equals(uuid) && m9091a.m9096a(C2200d.f8060b))) && (m9091a.f8114e != null || z)) {
                arrayList.add(m9091a);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [d.c.a.a.d.g] */
    /* JADX WARN: Type inference failed for: r15v11, types: [d.c.a.a.d.g] */
    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2215o
    /* renamed from: a */
    public InterfaceC2214n<T> mo9084a(Looper looper, C2213m c2213m) {
        List<C2213m.a> list;
        C2207g c2207g;
        Looper looper2 = this.f8101j;
        C2628e.m11113b(looper2 == null || looper2 == looper);
        if (this.f8099h.isEmpty()) {
            this.f8101j = looper;
            if (this.f8104m == null) {
                this.f8104m = new a(looper);
            }
        }
        C2209i c2209i = null;
        if (this.f8103l == null) {
            List<C2213m.a> m9082a = m9082a(c2213m, this.f8092a, false);
            if (m9082a.isEmpty()) {
                final b bVar = new b(this.f8092a);
                this.f8096e.m11146a(new C2635l.a() { // from class: d.c.a.a.d.c
                    @Override // p139d.p225c.p226a.p227a.p270n.C2635l.a
                    /* renamed from: a */
                    public final void mo9049a(Object obj) {
                        ((InterfaceC2208h) obj).mo8688a(C2210j.b.this);
                    }
                });
                return new C2216p(new InterfaceC2214n.a(bVar));
            }
            list = m9082a;
        } else {
            list = null;
        }
        if (this.f8097f) {
            Iterator<C2207g<T>> it = this.f8099h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2207g<T> next = it.next();
                if (C2622I.m11067a(next.f8070a, list)) {
                    c2209i = next;
                    break;
                }
            }
        } else if (!this.f8099h.isEmpty()) {
            c2209i = this.f8099h.get(0);
        }
        if (c2209i == null) {
            c2207g = new C2207g(this.f8092a, this.f8093b, this, list, this.f8102k, this.f8103l, this.f8095d, this.f8094c, looper, this.f8096e, this.f8098g);
            this.f8099h.add(c2207g);
        } else {
            c2207g = (InterfaceC2214n<T>) c2209i;
        }
        c2207g.m9071d();
        return c2207g;
    }

    @Override // p139d.p225c.p226a.p227a.p231d.C2207g.c
    /* renamed from: a */
    public void mo9078a() {
        Iterator<C2207g<T>> it = this.f8100i.iterator();
        while (it.hasNext()) {
            it.next().m9072e();
        }
        this.f8100i.clear();
    }

    /* renamed from: a */
    public final void m9085a(Handler handler, InterfaceC2208h interfaceC2208h) {
        this.f8096e.m11145a(handler, interfaceC2208h);
    }

    @Override // p139d.p225c.p226a.p227a.p231d.C2207g.c
    /* renamed from: a */
    public void mo9079a(C2207g<T> c2207g) {
        this.f8100i.add(c2207g);
        if (this.f8100i.size() == 1) {
            c2207g.m9073f();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2215o
    /* renamed from: a */
    public void mo9086a(InterfaceC2214n<T> interfaceC2214n) {
        if (interfaceC2214n instanceof C2216p) {
            return;
        }
        C2207g<T> c2207g = (C2207g) interfaceC2214n;
        if (c2207g.m9074g()) {
            this.f8099h.remove(c2207g);
            if (this.f8100i.size() > 1 && this.f8100i.get(0) == c2207g) {
                this.f8100i.get(1).m9073f();
            }
            this.f8100i.remove(c2207g);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p231d.C2207g.c
    /* renamed from: a */
    public void mo9080a(Exception exc) {
        Iterator<C2207g<T>> it = this.f8100i.iterator();
        while (it.hasNext()) {
            it.next().m9067a(exc);
        }
        this.f8100i.clear();
    }

    @Override // p139d.p225c.p226a.p227a.p231d.InterfaceC2215o
    /* renamed from: a */
    public boolean mo9087a(C2213m c2213m) {
        if (this.f8103l != null) {
            return true;
        }
        if (m9082a(c2213m, this.f8092a, true).isEmpty()) {
            if (c2213m.f8109d != 1 || !c2213m.m9091a(0).m9096a(C2200d.f8060b)) {
                return false;
            }
            C2638o.m11160d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f8092a);
        }
        String str = c2213m.f8108c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || C2622I.f10916a >= 25;
    }
}
