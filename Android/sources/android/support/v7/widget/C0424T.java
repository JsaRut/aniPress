package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.T */
/* loaded from: classes.dex */
public class C0424T implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C0429U f2192a;

    public C0424T(C0429U c0429u) {
        this.f2192a = c0429u;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0413N c0413n;
        if (i == -1 || (c0413n = this.f2192a.f2255f) == null) {
            return;
        }
        c0413n.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
