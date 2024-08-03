package p031c.p032a.p038F;

import android.content.Context;
import android.text.TextUtils;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p092s.InterfaceC0836l;

/* renamed from: c.a.F.b */
/* loaded from: classes.dex */
final class C0525b implements InterfaceC0836l {

    /* renamed from: a */
    final /* synthetic */ Context f2621a;

    /* renamed from: b */
    final /* synthetic */ String f2622b;

    /* renamed from: c */
    final /* synthetic */ C0524a f2623c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0525b(C0524a c0524a, Context context, String str) {
        this.f2623c = c0524a;
        this.f2621a = context;
        this.f2622b = str;
    }

    @Override // p031c.p032a.p092s.InterfaceC0836l
    /* renamed from: a */
    public final void mo2758a(int i) {
        String str;
        String str2;
        String str3;
        str = this.f2623c.f2619d;
        if (TextUtils.isEmpty(str)) {
            this.f2623c.f2619d = "";
        }
        Context context = this.f2621a;
        StringBuilder sb = new StringBuilder("JArp");
        str2 = this.f2623c.f2619d;
        sb.append(str2);
        C0511f.m2704e(context, sb.toString());
        if (C0511f.m2707g(this.f2621a, "JArp") == 0) {
            Context context2 = this.f2621a;
            str3 = this.f2623c.f2619d;
            C0511f.m2712k(context2, str3);
        }
        super/*c.a.A.a*/.mo2683d(this.f2621a, this.f2622b);
    }
}
