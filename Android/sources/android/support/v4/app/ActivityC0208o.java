package android.support.v4.app;

import android.arch.lifecycle.AbstractC0144d;
import android.arch.lifecycle.C0159s;
import android.arch.lifecycle.InterfaceC0160t;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.C0191b;
import android.support.v4.util.C0270p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.o */
/* loaded from: classes.dex */
public class ActivityC0208o extends ActivityC0196da implements InterfaceC0160t, C0191b.a, C0191b.c {

    /* renamed from: e */
    private C0159s f854e;

    /* renamed from: f */
    boolean f855f;

    /* renamed from: g */
    boolean f856g;

    /* renamed from: i */
    boolean f858i;

    /* renamed from: j */
    boolean f859j;

    /* renamed from: k */
    boolean f860k;

    /* renamed from: l */
    int f861l;

    /* renamed from: m */
    C0270p<String> f862m;

    /* renamed from: c */
    final Handler f852c = new HandlerC0207n(this);

    /* renamed from: d */
    final C0210q f853d = C0210q.m1026a(new a());

    /* renamed from: h */
    boolean f857h = true;

    /* renamed from: android.support.v4.app.o$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0211r<ActivityC0208o> {
        public a() {
            super(ActivityC0208o.this);
        }

        @Override // android.support.v4.app.AbstractC0209p
        /* renamed from: a */
        public View mo903a(int i) {
            return ActivityC0208o.this.findViewById(i);
        }

        @Override // android.support.v4.app.AbstractC0211r
        /* renamed from: a */
        public void mo1019a(ComponentCallbacksC0205l componentCallbacksC0205l) {
            ActivityC0208o.this.m1013a(componentCallbacksC0205l);
        }

        @Override // android.support.v4.app.AbstractC0211r
        /* renamed from: a */
        public void mo1020a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0208o.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.v4.app.AbstractC0209p
        /* renamed from: a */
        public boolean mo904a() {
            Window window = ActivityC0208o.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // android.support.v4.app.AbstractC0211r
        /* renamed from: b */
        public boolean mo1021b(ComponentCallbacksC0205l componentCallbacksC0205l) {
            return !ActivityC0208o.this.isFinishing();
        }

        @Override // android.support.v4.app.AbstractC0211r
        /* renamed from: f */
        public LayoutInflater mo1022f() {
            return ActivityC0208o.this.getLayoutInflater().cloneInContext(ActivityC0208o.this);
        }

        @Override // android.support.v4.app.AbstractC0211r
        /* renamed from: g */
        public int mo1023g() {
            Window window = ActivityC0208o.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.AbstractC0211r
        /* renamed from: h */
        public boolean mo1024h() {
            return ActivityC0208o.this.getWindow() != null;
        }

        @Override // android.support.v4.app.AbstractC0211r
        /* renamed from: i */
        public void mo1025i() {
            ActivityC0208o.this.mo1018h();
        }
    }

    /* renamed from: android.support.v4.app.o$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        Object f864a;

        /* renamed from: b */
        C0159s f865b;

        /* renamed from: c */
        C0161A f866c;

        b() {
        }
    }

    /* renamed from: a */
    private static boolean m1009a(AbstractC0212s abstractC0212s, AbstractC0144d.b bVar) {
        boolean z = false;
        for (ComponentCallbacksC0205l componentCallbacksC0205l : abstractC0212s.mo1063b()) {
            if (componentCallbacksC0205l != null) {
                if (componentCallbacksC0205l.mo714a().mo710a().m713a(AbstractC0144d.b.STARTED)) {
                    componentCallbacksC0205l.f803U.m727a(bVar);
                    z = true;
                }
                AbstractC0212s m923T = componentCallbacksC0205l.m923T();
                if (m923T != null) {
                    z |= m1009a(m923T, bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    static void m1010b(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: i */
    private void m1011i() {
        do {
        } while (m1009a(m1015e(), AbstractC0144d.b.CREATED));
    }

    @Override // android.support.v4.app.ActivityC0196da, android.arch.lifecycle.InterfaceC0146f
    /* renamed from: a */
    public AbstractC0144d mo714a() {
        return super.mo714a();
    }

    /* renamed from: a */
    final View m1012a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f853d.m1028a(view, str, context, attributeSet);
    }

    @Override // android.support.v4.app.C0191b.c
    /* renamed from: a */
    public final void mo851a(int i) {
        if (this.f858i || i == -1) {
            return;
        }
        m1010b(i);
    }

    /* renamed from: a */
    public void m1013a(ComponentCallbacksC0205l componentCallbacksC0205l) {
    }

    /* renamed from: a */
    protected boolean m1014a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.arch.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public C0159s mo752c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f854e == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f854e = bVar.f865b;
            }
            if (this.f854e == null) {
                this.f854e = new C0159s();
            }
        }
        return this.f854e;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f855f);
        printWriter.print(" mResumed=");
        printWriter.print(this.f856g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f857h);
        if (getApplication() != null) {
            AbstractC0186X.m837a(this).mo773a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f853d.m1048j().mo1062a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public AbstractC0212s m1015e() {
        return this.f853d.m1048j();
    }

    /* renamed from: f */
    public void m1016f() {
        this.f853d.m1044f();
    }

    /* renamed from: g */
    public Object m1017g() {
        return null;
    }

    @Deprecated
    /* renamed from: h */
    public void mo1018h() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f853d.m1049k();
        int i3 = i >> 16;
        if (i3 == 0) {
            C0191b.b m846a = C0191b.m846a();
            if (m846a == null || !m846a.onActivityResult(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String m1403b = this.f862m.m1403b(i4);
        this.f862m.m1407d(i4);
        if (m1403b == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        ComponentCallbacksC0205l m1027a = this.f853d.m1027a(m1403b);
        if (m1027a != null) {
            m1027a.m936a(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m1403b);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC0212s m1048j = this.f853d.m1048j();
        boolean mo1064c = m1048j.mo1064c();
        if (!mo1064c || Build.VERSION.SDK_INT > 25) {
            if (mo1064c || !m1048j.mo1065d()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f853d.m1049k();
        this.f853d.m1030a(configuration);
    }

    @Override // android.support.v4.app.ActivityC0196da, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0159s c0159s;
        this.f853d.m1032a((ComponentCallbacksC0205l) null);
        super.onCreate(bundle);
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null && (c0159s = bVar.f865b) != null && this.f854e == null) {
            this.f854e = c0159s;
        }
        if (bundle != null) {
            this.f853d.m1031a(bundle.getParcelable("android:support:fragments"), bVar != null ? bVar.f866c : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f861l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f862m = new C0270p<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f862m.m1406c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f862m == null) {
            this.f862m = new C0270p<>();
            this.f861l = 0;
        }
        this.f853d.m1037b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f853d.m1035a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m1012a = m1012a(view, str, context, attributeSet);
        return m1012a == null ? super.onCreateView(view, str, context, attributeSet) : m1012a;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m1012a = m1012a(null, str, context, attributeSet);
        return m1012a == null ? super.onCreateView(str, context, attributeSet) : m1012a;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f854e != null && !isChangingConfigurations()) {
            this.f854e.m750a();
        }
        this.f853d.m1041c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f853d.m1042d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f853d.m1040b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f853d.m1036a(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f853d.m1034a(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f853d.m1049k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f853d.m1033a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f856g = false;
        if (this.f852c.hasMessages(2)) {
            this.f852c.removeMessages(2);
            m1016f();
        }
        this.f853d.m1043e();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f853d.m1038b(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f852c.removeMessages(2);
        m1016f();
        this.f853d.m1047i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : m1014a(view, menu) | this.f853d.m1039b(menu);
    }

    @Override // android.app.Activity, android.support.v4.app.C0191b.a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f853d.m1049k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m1403b = this.f862m.m1403b(i3);
            this.f862m.m1407d(i3);
            if (m1403b == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0205l m1027a = this.f853d.m1027a(m1403b);
            if (m1027a != null) {
                m1027a.m938a(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m1403b);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f852c.sendEmptyMessage(2);
        this.f856g = true;
        this.f853d.m1047i();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object m1017g = m1017g();
        C0161A m1050l = this.f853d.m1050l();
        if (m1050l == null && this.f854e == null && m1017g == null) {
            return null;
        }
        b bVar = new b();
        bVar.f864a = m1017g;
        bVar.f865b = this.f854e;
        bVar.f866c = m1050l;
        return bVar;
    }

    @Override // android.support.v4.app.ActivityC0196da, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m1011i();
        Parcelable m1051m = this.f853d.m1051m();
        if (m1051m != null) {
            bundle.putParcelable("android:support:fragments", m1051m);
        }
        if (this.f862m.m1402b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f861l);
            int[] iArr = new int[this.f862m.m1402b()];
            String[] strArr = new String[this.f862m.m1402b()];
            for (int i = 0; i < this.f862m.m1402b(); i++) {
                iArr[i] = this.f862m.m1405c(i);
                strArr[i] = this.f862m.m1408e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f857h = false;
        if (!this.f855f) {
            this.f855f = true;
            this.f853d.m1029a();
        }
        this.f853d.m1049k();
        this.f853d.m1047i();
        this.f853d.m1045g();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f853d.m1049k();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f857h = true;
        m1011i();
        this.f853d.m1046h();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f860k && i != -1) {
            m1010b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f860k && i != -1) {
            m1010b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f859j && i != -1) {
            m1010b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f859j && i != -1) {
            m1010b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
