package p139d.p143b.p208m;

import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.b */
/* loaded from: classes.dex */
public class C2066b implements UIManagerModule.InterfaceC1287c {

    /* renamed from: a */
    final /* synthetic */ C2068c f7510a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2066b(C2068c c2068c) {
        this.f7510a = c2068c;
    }

    @Override // com.facebook.react.uimanager.UIManagerModule.InterfaceC1287c
    /* renamed from: a */
    public ViewManager mo5669a(String str) {
        C2047G c2047g;
        c2047g = this.f7510a.f7515a;
        return c2047g.m8352a(str);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule.InterfaceC1287c
    /* renamed from: a */
    public List<String> mo5670a() {
        C2047G c2047g;
        c2047g = this.f7510a.f7515a;
        return c2047g.m8365e();
    }
}
