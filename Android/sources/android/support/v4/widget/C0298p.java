package android.support.v4.widget;

import android.widget.ListView;

/* renamed from: android.support.v4.widget.p */
/* loaded from: classes.dex */
public class C0298p extends AbstractViewOnTouchListenerC0283a {

    /* renamed from: s */
    private final ListView f1364s;

    public C0298p(ListView listView) {
        super(listView);
        this.f1364s = listView;
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerC0283a
    /* renamed from: a */
    public void mo1547a(int i, int i2) {
        C0299q.m1691b(this.f1364s, i2);
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerC0283a
    /* renamed from: a */
    public boolean mo1548a(int i) {
        return false;
    }

    @Override // android.support.v4.widget.AbstractViewOnTouchListenerC0283a
    /* renamed from: b */
    public boolean mo1551b(int i) {
        ListView listView = this.f1364s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
