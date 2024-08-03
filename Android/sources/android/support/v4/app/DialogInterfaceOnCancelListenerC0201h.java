package android.support.v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.app.h */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0201h extends ComponentCallbacksC0205l implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Y */
    int f769Y = 0;

    /* renamed from: Z */
    int f770Z = 0;

    /* renamed from: aa */
    boolean f771aa = true;

    /* renamed from: ba */
    boolean f772ba = true;

    /* renamed from: ca */
    int f773ca = -1;

    /* renamed from: da */
    Dialog f774da;

    /* renamed from: ea */
    boolean f775ea;

    /* renamed from: fa */
    boolean f776fa;

    /* renamed from: ga */
    boolean f777ga;

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: N */
    public void mo886N() {
        super.mo886N();
        Dialog dialog = this.f774da;
        if (dialog != null) {
            this.f775ea = true;
            dialog.dismiss();
            this.f774da = null;
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: O */
    public void mo887O() {
        super.mo887O();
        if (this.f777ga || this.f776fa) {
            return;
        }
        this.f776fa = true;
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: R */
    public void mo888R() {
        super.mo888R();
        Dialog dialog = this.f774da;
        if (dialog != null) {
            this.f775ea = false;
            dialog.show();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: S */
    public void mo889S() {
        super.mo889S();
        Dialog dialog = this.f774da;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: a */
    public void m890a(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: a */
    public void mo891a(Context context) {
        super.mo891a(context);
        if (this.f777ga) {
            return;
        }
        this.f776fa = false;
    }

    /* renamed from: a */
    public void m892a(AbstractC0212s abstractC0212s, String str) {
        this.f776fa = false;
        this.f777ga = true;
        AbstractC0169H mo1056a = abstractC0212s.mo1056a();
        mo1056a.mo767a(this, str);
        mo1056a.mo763a();
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: b */
    public void mo893b(Bundle bundle) {
        Bundle bundle2;
        super.mo893b(bundle);
        if (this.f772ba) {
            View m908A = m908A();
            if (m908A != null) {
                if (m908A.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f774da.setContentView(m908A);
            }
            ActivityC0208o m968d = m968d();
            if (m968d != null) {
                this.f774da.setOwnerActivity(m968d);
            }
            this.f774da.setCancelable(this.f771aa);
            this.f774da.setOnCancelListener(this);
            this.f774da.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f774da.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: c */
    public void mo894c(Bundle bundle) {
        super.mo894c(bundle);
        this.f772ba = this.f783A == 0;
        if (bundle != null) {
            this.f769Y = bundle.getInt("android:style", 0);
            this.f770Z = bundle.getInt("android:theme", 0);
            this.f771aa = bundle.getBoolean("android:cancelable", true);
            this.f772ba = bundle.getBoolean("android:showsDialog", this.f772ba);
            this.f773ca = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: d */
    public LayoutInflater mo895d(Bundle bundle) {
        Context m1053c;
        if (!this.f772ba) {
            return super.mo895d(bundle);
        }
        this.f774da = mo901n(bundle);
        Dialog dialog = this.f774da;
        if (dialog != null) {
            m890a(dialog, this.f769Y);
            m1053c = this.f774da.getContext();
        } else {
            m1053c = this.f825u.m1053c();
        }
        return (LayoutInflater) m1053c.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.app.ComponentCallbacksC0205l
    /* renamed from: e */
    public void mo896e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo896e(bundle);
        Dialog dialog = this.f774da;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f769Y;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f770Z;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f771aa;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f772ba;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f773ca;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: ea */
    public void m897ea() {
        m899i(false);
    }

    /* renamed from: fa */
    public int m898fa() {
        return this.f770Z;
    }

    /* renamed from: i */
    void m899i(boolean z) {
        if (this.f776fa) {
            return;
        }
        this.f776fa = true;
        this.f777ga = false;
        Dialog dialog = this.f774da;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f775ea = true;
        if (this.f773ca >= 0) {
            m996p().mo1060a(this.f773ca, 1);
            this.f773ca = -1;
            return;
        }
        AbstractC0169H mo1056a = m996p().mo1056a();
        mo1056a.mo770c(this);
        if (z) {
            mo1056a.mo768b();
        } else {
            mo1056a.mo763a();
        }
    }

    /* renamed from: j */
    public void m900j(boolean z) {
        this.f771aa = z;
        Dialog dialog = this.f774da;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: n */
    public Dialog mo901n(Bundle bundle) {
        return new Dialog(m968d(), m898fa());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f775ea) {
            return;
        }
        m899i(true);
    }
}
