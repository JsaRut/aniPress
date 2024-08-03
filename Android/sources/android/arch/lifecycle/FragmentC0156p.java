package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.AbstractC0144d;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.p */
/* loaded from: classes.dex */
public class FragmentC0156p extends Fragment {

    /* renamed from: a */
    private a f610a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.p$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m743a();

        /* renamed from: b */
        void m744b();

        void onCreate();
    }

    /* renamed from: a */
    public static void m738a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0156p(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m739a(AbstractC0144d.a aVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof InterfaceC0149i) {
            ((InterfaceC0149i) activity).mo714a().m728b(aVar);
        } else if (activity instanceof InterfaceC0146f) {
            AbstractC0144d mo714a = ((InterfaceC0146f) activity).mo714a();
            if (mo714a instanceof C0148h) {
                ((C0148h) mo714a).m728b(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m740a(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: b */
    private void m741b(a aVar) {
        if (aVar != null) {
            aVar.m743a();
        }
    }

    /* renamed from: c */
    private void m742c(a aVar) {
        if (aVar != null) {
            aVar.m744b();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m740a(this.f610a);
        m739a(AbstractC0144d.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m739a(AbstractC0144d.a.ON_DESTROY);
        this.f610a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m739a(AbstractC0144d.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m741b(this.f610a);
        m739a(AbstractC0144d.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m742c(this.f610a);
        m739a(AbstractC0144d.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m739a(AbstractC0144d.a.ON_STOP);
    }
}
