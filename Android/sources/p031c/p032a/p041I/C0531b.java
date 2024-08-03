package p031c.p032a.p041I;

import android.content.Context;
import android.text.TextUtils;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p092s.InterfaceC0836l;

/* renamed from: c.a.I.b */
/* loaded from: classes.dex */
final class C0531b implements InterfaceC0836l {

    /* renamed from: a */
    final /* synthetic */ Context f2637a;

    /* renamed from: b */
    final /* synthetic */ String f2638b;

    /* renamed from: c */
    final /* synthetic */ C0530a f2639c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0531b(C0530a c0530a, Context context, String str) {
        this.f2639c = c0530a;
        this.f2637a = context;
        this.f2638b = str;
    }

    @Override // p031c.p032a.p092s.InterfaceC0836l
    /* renamed from: a */
    public final void mo2758a(int i) {
        String str;
        String str2;
        if (i != 0) {
            return;
        }
        C0511f.m2704e(this.f2637a, this.f2638b);
        str = this.f2639c.f2636d;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.f2637a;
        str2 = this.f2639c.f2636d;
        C0511f.m2716o(context, str2);
        super/*c.a.A.a*/.mo2683d(this.f2637a, this.f2638b);
    }
}
