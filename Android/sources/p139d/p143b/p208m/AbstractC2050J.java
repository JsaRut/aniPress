package p139d.p143b.p208m;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InterfaceC1120f;
import com.facebook.react.uimanager.C1288V;
import java.util.Iterator;
import java.util.List;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: d.b.m.J */
/* loaded from: classes.dex */
public abstract class AbstractC2050J {

    /* renamed from: a */
    private final Application f7467a;

    /* renamed from: b */
    private C2047G f7468b;

    public AbstractC2050J(Application application) {
        this.f7467a = application;
    }

    /* renamed from: a */
    protected C2047G m8388a() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        C2048H m8326a = C2047G.m8326a();
        m8326a.m8375a(this.f7467a);
        m8326a.m8386c(mo6714e());
        m8326a.m8384a(mo6716k());
        m8326a.m8380a(m8394i());
        m8326a.m8378a(m8392f());
        m8326a.m8381a(m8395j());
        m8326a.m8377a(m8391d());
        m8326a.m8379a(LifecycleState.BEFORE_CREATE);
        Iterator<InterfaceC2051K> it = mo6715g().iterator();
        while (it.hasNext()) {
            m8326a.m8382a(it.next());
        }
        String m8390c = m8390c();
        if (m8390c != null) {
            m8326a.m8385b(m8390c);
        } else {
            String m8389b = m8389b();
            C2038a.m8318a(m8389b);
            m8326a.m8383a(m8389b);
        }
        C2047G m8374a = m8326a.m8374a();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return m8374a;
    }

    /* renamed from: b */
    protected String m8389b() {
        return "index.android.bundle";
    }

    /* renamed from: c */
    protected String m8390c() {
        return null;
    }

    /* renamed from: d */
    protected JSIModulePackage m8391d() {
        return null;
    }

    /* renamed from: e */
    protected abstract String mo6714e();

    /* renamed from: f */
    protected JavaScriptExecutorFactory m8392f() {
        return null;
    }

    /* renamed from: g */
    protected abstract List<InterfaceC2051K> mo6715g();

    /* renamed from: h */
    public C2047G m8393h() {
        if (this.f7468b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.f7468b = m8388a();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.f7468b;
    }

    /* renamed from: i */
    protected InterfaceC1120f m8394i() {
        return null;
    }

    /* renamed from: j */
    protected C1288V m8395j() {
        return new C1288V();
    }

    /* renamed from: k */
    public abstract boolean mo6716k();

    /* renamed from: l */
    public boolean m8396l() {
        return this.f7468b != null;
    }
}
