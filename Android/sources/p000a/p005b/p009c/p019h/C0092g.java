package p000a.p005b.p009c.p019h;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.c.h.g */
/* loaded from: classes.dex */
public class C0092g {

    /* renamed from: a */
    private static boolean f384a = false;

    /* renamed from: b */
    private static Method f385b = null;

    /* renamed from: c */
    private static boolean f386c = false;

    /* renamed from: d */
    private static Field f387d;

    /* renamed from: a.b.c.h.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo436a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m430a(Dialog dialog) {
        if (!f386c) {
            try {
                f387d = Dialog.class.getDeclaredField("mOnKeyListener");
                f387d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f386c = true;
        }
        Field field = f387d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m431a(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo436a(keyEvent) : callback instanceof Activity ? m433a((Activity) callback, keyEvent) : callback instanceof Dialog ? m434a((Dialog) callback, keyEvent) : (view != null && C0107v.m505a(view, keyEvent)) || aVar.mo436a(keyEvent);
    }

    /* renamed from: a */
    private static boolean m432a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f384a) {
            try {
                f385b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f384a = true;
        }
        Method method = f385b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m433a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m432a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0107v.m505a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static boolean m434a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m430a = m430a(dialog);
        if (m430a != null && m430a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0107v.m505a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: a */
    public static boolean m435a(View view, KeyEvent keyEvent) {
        return C0107v.m509b(view, keyEvent);
    }
}
