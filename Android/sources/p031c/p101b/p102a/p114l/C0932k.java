package p031c.p101b.p102a.p114l;

import android.view.View;
import android.widget.TextView;
import p031c.p101b.p102a.p114l.C0934m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.b.a.l.k */
/* loaded from: classes.dex */
public class C0932k implements C0934m.a {
    @Override // p031c.p101b.p102a.p114l.C0934m.a
    /* renamed from: a */
    public void mo4684a(View view) {
        int i;
        int i2;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if ("title".equals(textView.getText().toString())) {
                i2 = C0934m.f3956a;
                if (i2 == -1) {
                    int unused = C0934m.f3956a = textView.getCurrentTextColor();
                    float unused2 = C0934m.f3958c = textView.getTextSize();
                }
            }
            if ("content".equals(textView.getText().toString())) {
                i = C0934m.f3957b;
                if (i == -1) {
                    int unused3 = C0934m.f3957b = textView.getCurrentTextColor();
                    float unused4 = C0934m.f3959d = textView.getTextSize();
                }
            }
        }
    }
}
