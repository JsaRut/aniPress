package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import p000a.p005b.p022d.p023a.C0112a;

/* renamed from: android.support.v7.app.l */
/* loaded from: classes.dex */
public class DialogInterfaceC0333l extends DialogC0314B implements DialogInterface {

    /* renamed from: c */
    final AlertController f1571c;

    /* renamed from: android.support.v7.app.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.C0310a f1572a;

        /* renamed from: b */
        private final int f1573b;

        public a(Context context) {
            this(context, DialogInterfaceC0333l.m1810a(context, 0));
        }

        public a(Context context, int i) {
            this.f1572a = new AlertController.C0310a(new ContextThemeWrapper(context, DialogInterfaceC0333l.m1810a(context, i)));
            this.f1573b = i;
        }

        /* renamed from: a */
        public a m1811a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1572a.f1464u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public a m1812a(Drawable drawable) {
            this.f1572a.f1447d = drawable;
            return this;
        }

        /* renamed from: a */
        public a m1813a(View view) {
            this.f1572a.f1450g = view;
            return this;
        }

        /* renamed from: a */
        public a m1814a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0310a c0310a = this.f1572a;
            c0310a.f1466w = listAdapter;
            c0310a.f1467x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public a m1815a(CharSequence charSequence) {
            this.f1572a.f1451h = charSequence;
            return this;
        }

        /* renamed from: a */
        public a m1816a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0310a c0310a = this.f1572a;
            c0310a.f1455l = charSequence;
            c0310a.f1457n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public a m1817a(boolean z) {
            this.f1572a.f1461r = z;
            return this;
        }

        /* renamed from: a */
        public DialogInterfaceC0333l m1818a() {
            DialogInterfaceC0333l dialogInterfaceC0333l = new DialogInterfaceC0333l(this.f1572a.f1444a, this.f1573b);
            this.f1572a.m1722a(dialogInterfaceC0333l.f1571c);
            dialogInterfaceC0333l.setCancelable(this.f1572a.f1461r);
            if (this.f1572a.f1461r) {
                dialogInterfaceC0333l.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0333l.setOnCancelListener(this.f1572a.f1462s);
            dialogInterfaceC0333l.setOnDismissListener(this.f1572a.f1463t);
            DialogInterface.OnKeyListener onKeyListener = this.f1572a.f1464u;
            if (onKeyListener != null) {
                dialogInterfaceC0333l.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0333l;
        }

        /* renamed from: b */
        public Context m1819b() {
            return this.f1572a.f1444a;
        }

        /* renamed from: b */
        public a m1820b(CharSequence charSequence) {
            this.f1572a.f1449f = charSequence;
            return this;
        }

        /* renamed from: b */
        public a m1821b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0310a c0310a = this.f1572a;
            c0310a.f1452i = charSequence;
            c0310a.f1454k = onClickListener;
            return this;
        }
    }

    protected DialogInterfaceC0333l(Context context, int i) {
        super(context, m1810a(context, i));
        this.f1571c = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: a */
    static int m1810a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0112a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.support.v7.app.DialogC0314B, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1571c.m1708a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1571c.m1713a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1571c.m1717b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.support.v7.app.DialogC0314B, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1571c.m1716b(charSequence);
    }
}
