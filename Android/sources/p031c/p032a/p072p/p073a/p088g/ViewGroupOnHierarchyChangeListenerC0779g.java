package p031c.p032a.p072p.p073a.p088g;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: c.a.p.a.g.g */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC0779g implements ViewGroup.OnHierarchyChangeListener {
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        view.post(new RunnableC0780h(this, view2));
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
