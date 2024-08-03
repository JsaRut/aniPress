package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import p000a.p005b.p009c.p019h.p020a.C0080a;
import p000a.p005b.p009c.p019h.p020a.C0081b;

/* renamed from: a.b.c.h.d */
/* loaded from: classes.dex */
public class C0089d {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f378a = new View.AccessibilityDelegate();

    /* renamed from: b */
    private final View.AccessibilityDelegate f379b = new a(this);

    /* renamed from: a.b.c.h.d$a */
    /* loaded from: classes.dex */
    private static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        private final C0089d f380a;

        a(C0089d c0089d) {
            this.f380a = c0089d;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f380a.mo415a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0081b m412a = this.f380a.m412a(view);
            if (m412a != null) {
                return (AccessibilityNodeProvider) m412a.m408a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f380a.mo323b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f380a.mo321a(view, C0080a.m361a(accessibilityNodeInfo));
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f380a.m417c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f380a.mo416a(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f380a.mo322a(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f380a.m414a(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f380a.m418d(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public C0081b m412a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = f378a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0081b(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate m413a() {
        return this.f379b;
    }

    /* renamed from: a */
    public void m414a(View view, int i) {
        f378a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo321a(View view, C0080a c0080a) {
        f378a.onInitializeAccessibilityNodeInfo(view, c0080a.m406t());
    }

    /* renamed from: a */
    public boolean mo322a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f378a.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo415a(View view, AccessibilityEvent accessibilityEvent) {
        return f378a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo416a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f378a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo323b(View view, AccessibilityEvent accessibilityEvent) {
        f378a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void m417c(View view, AccessibilityEvent accessibilityEvent) {
        f378a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void m418d(View view, AccessibilityEvent accessibilityEvent) {
        f378a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
