package p139d.p143b.p184i.p194h;

import java.util.Collections;
import java.util.List;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p184i.p196j.C1922f;
import p139d.p143b.p184i.p196j.InterfaceC1923g;

/* renamed from: d.b.i.h.i */
/* loaded from: classes.dex */
public class C1915i implements InterfaceC1912f {

    /* renamed from: a */
    private final b f7063a;

    /* renamed from: d.b.i.h.i$a */
    /* loaded from: classes.dex */
    private static class a implements b {
        private a() {
        }

        @Override // p139d.p143b.p184i.p194h.C1915i.b
        /* renamed from: a */
        public List<Integer> mo7889a() {
            return Collections.EMPTY_LIST;
        }

        @Override // p139d.p143b.p184i.p194h.C1915i.b
        /* renamed from: b */
        public int mo7890b() {
            return 0;
        }
    }

    /* renamed from: d.b.i.h.i$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        List<Integer> mo7889a();

        /* renamed from: b */
        int mo7890b();
    }

    public C1915i() {
        this(new a());
    }

    public C1915i(b bVar) {
        C1691j.m6971a(bVar);
        this.f7063a = bVar;
    }

    @Override // p139d.p143b.p184i.p194h.InterfaceC1912f
    /* renamed from: a */
    public InterfaceC1923g mo7880a(int i) {
        return C1922f.m7929a(i, i >= this.f7063a.mo7890b(), false);
    }

    @Override // p139d.p143b.p184i.p194h.InterfaceC1912f
    /* renamed from: b */
    public int mo7881b(int i) {
        List<Integer> mo7889a = this.f7063a.mo7889a();
        if (mo7889a == null || mo7889a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < mo7889a.size(); i2++) {
            if (mo7889a.get(i2).intValue() > i) {
                return mo7889a.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}
