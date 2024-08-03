package p139d.p225c.p226a.p227a.p259k.p267h;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.k.h.j */
/* loaded from: classes.dex */
final class C2560j implements InterfaceC2537e {

    /* renamed from: a */
    private final List<C2556f> f10611a;

    /* renamed from: b */
    private final int f10612b;

    /* renamed from: c */
    private final long[] f10613c;

    /* renamed from: d */
    private final long[] f10614d;

    public C2560j(List<C2556f> list) {
        this.f10611a = list;
        this.f10612b = list.size();
        this.f10613c = new long[this.f10612b * 2];
        for (int i = 0; i < this.f10612b; i++) {
            C2556f c2556f = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f10613c;
            jArr[i2] = c2556f.f10583o;
            jArr[i2 + 1] = c2556f.f10584p;
        }
        long[] jArr2 = this.f10613c;
        this.f10614d = Arrays.copyOf(jArr2, jArr2.length);
        Arrays.sort(this.f10614d);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10603a() {
        return this.f10614d.length;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10604a(long j) {
        int m11042a = C2622I.m11042a(this.f10614d, j, false, false);
        if (m11042a < this.f10614d.length) {
            return m11042a;
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public long mo10605a(int i) {
        C2628e.m11111a(i >= 0);
        C2628e.m11111a(i < this.f10614d.length);
        return this.f10614d[i];
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: b */
    public List<C2527b> mo10606b(long j) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = null;
        C2556f c2556f = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.f10612b; i++) {
            long[] jArr = this.f10613c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C2556f c2556f2 = this.f10611a.get(i);
                if (!c2556f2.m10755a()) {
                    arrayList.add(c2556f2);
                } else if (c2556f == null) {
                    c2556f = c2556f2;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        append = spannableStringBuilder.append(c2556f.f10389a).append((CharSequence) "\n");
                    } else {
                        append = spannableStringBuilder.append((CharSequence) "\n");
                    }
                    append.append(c2556f2.f10389a);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new C2556f(spannableStringBuilder));
        } else if (c2556f != null) {
            arrayList.add(c2556f);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }
}
