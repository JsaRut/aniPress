package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import java.util.Collections;
import java.util.List;

/* renamed from: d.c.a.a.j.c.a.f */
/* loaded from: classes.dex */
public class C2440f {

    /* renamed from: a */
    public final String f9622a;

    /* renamed from: b */
    public final long f9623b;

    /* renamed from: c */
    public final List<C2435a> f9624c;

    /* renamed from: d */
    public final List<C2439e> f9625d;

    public C2440f(String str, long j, List<C2435a> list, List<C2439e> list2) {
        this.f9622a = str;
        this.f9623b = j;
        this.f9624c = Collections.unmodifiableList(list);
        this.f9625d = Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    public int m10097a(int i) {
        int size = this.f9624c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f9624c.get(i2).f9586b == i) {
                return i2;
            }
        }
        return -1;
    }
}
