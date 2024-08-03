package p031c.p032a.p072p.p073a.p089h;

import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.AbstractC0735c;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p088g.C0774b;
import p031c.p032a.p072p.p073a.p088g.C0776d;

/* renamed from: c.a.p.a.h.e */
/* loaded from: classes.dex */
final class C0794e extends AbstractC0735c {

    /* renamed from: b */
    final /* synthetic */ ActivityC0790a f3468b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794e(ActivityC0790a activityC0790a, WebView webView) {
        super(webView);
        this.f3468b = activityC0790a;
    }

    @Override // p031c.p032a.p072p.p073a.p080f.AbstractC0735c
    /* renamed from: a */
    public final String mo3740a() {
        String str;
        str = this.f3468b.f3464c;
        return str;
    }

    @Override // p031c.p032a.p072p.p073a.p080f.AbstractC0735c
    /* renamed from: a */
    public final void mo3741a(int i, String str) {
        C0732b.m3723f("BuryWebActivity_xxx", "onOtherResult, code=" + i + " content=" + str);
    }

    @Override // p031c.p032a.p072p.p073a.p080f.AbstractC0735c
    /* renamed from: a */
    public final void mo3742a(String str) {
        Toast.makeText(this.f3468b, str, 0).show();
    }

    @Override // p031c.p032a.p072p.p073a.p080f.AbstractC0735c
    /* renamed from: a */
    public final void mo3743a(JSONObject jSONObject) {
        C0774b c0774b = new C0774b(jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0774b);
        C0776d.m3861a(this.f3468b, arrayList);
        this.f3468b.finish();
    }

    @Override // p031c.p032a.p072p.p073a.p080f.AbstractC0735c
    /* renamed from: b */
    public final void mo3744b() {
        this.f3468b.finish();
    }
}
