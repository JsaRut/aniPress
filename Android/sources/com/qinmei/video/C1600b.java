package com.qinmei.video;

import android.app.Application;
import cn.jiguang.plugins.push.C0952b;
import cn.jpush.reactnativejanalytics.C0970b;
import com.github.yamill.orientation.C1558b;
import com.imagepicker.C1595d;
import com.p122BV.LinearGradient.C0972a;
import com.reactnativecommunity.asyncstorage.C1611j;
import com.swmansion.gesturehandler.react.C1629g;
import java.util.Arrays;
import java.util.List;
import me.listenzz.modal.C2743e;
import org.devio.p276rn.splashscreen.C2794f;
import p139d.p140a.p141a.C1639c;
import p139d.p143b.p208m.AbstractC2050J;
import p139d.p143b.p208m.InterfaceC2051K;
import p139d.p143b.p208m.p216f.C2078B;

/* renamed from: com.qinmei.video.b */
/* loaded from: classes.dex */
class C1600b extends AbstractC2050J {

    /* renamed from: c */
    final /* synthetic */ MainApplication f6016c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600b(MainApplication mainApplication, Application application) {
        super(application);
        this.f6016c = mainApplication;
    }

    @Override // p139d.p143b.p208m.AbstractC2050J
    /* renamed from: e */
    protected String mo6714e() {
        return "index";
    }

    @Override // p139d.p143b.p208m.AbstractC2050J
    /* renamed from: g */
    protected List<InterfaceC2051K> mo6715g() {
        boolean z;
        boolean z2;
        z = MainApplication.f6013b;
        z2 = MainApplication.f6012a;
        return Arrays.asList(new C2078B(), new C0970b(z, z2), new C1558b(), new C0972a(), new C1639c(), new C1595d(), new C2743e(), new C2794f(), new C1611j(), new C1629g(), new C0952b());
    }

    @Override // p139d.p143b.p208m.AbstractC2050J
    /* renamed from: k */
    public boolean mo6716k() {
        return false;
    }
}
