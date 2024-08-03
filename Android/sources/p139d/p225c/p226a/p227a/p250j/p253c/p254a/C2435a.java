package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import java.util.Collections;
import java.util.List;

/* renamed from: d.c.a.a.j.c.a.a */
/* loaded from: classes.dex */
public class C2435a {

    /* renamed from: a */
    public final int f9585a;

    /* renamed from: b */
    public final int f9586b;

    /* renamed from: c */
    public final List<AbstractC2444j> f9587c;

    /* renamed from: d */
    public final List<C2438d> f9588d;

    /* renamed from: e */
    public final List<C2438d> f9589e;

    public C2435a(int i, int i2, List<AbstractC2444j> list, List<C2438d> list2, List<C2438d> list3) {
        this.f9585a = i;
        this.f9586b = i2;
        this.f9587c = Collections.unmodifiableList(list);
        this.f9588d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f9589e = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
    }
}
