package p031c.p101b.p102a.p114l;

import android.view.View;
import android.widget.TextView;
import p031c.p101b.p102a.p114l.C0934m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.b.a.l.l */
/* loaded from: classes.dex */
public class C0933l implements C0934m.a {
    @Override // p031c.p101b.p102a.p114l.C0934m.a
    /* renamed from: a */
    public void mo4684a(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if ("title".equals(textView.getText().toString())) {
                i3 = C0934m.f3956a;
                if (i3 == -1) {
                    int unused = C0934m.f3956a = textView.getCurrentTextColor();
                    float unused2 = C0934m.f3958c = textView.getTextSize();
                    StringBuilder sb = new StringBuilder();
                    sb.append("title color is :");
                    i4 = C0934m.f3956a;
                    sb.append(i4);
                    C0923b.m4642a("NotificationStyleHelper", sb.toString());
                }
            }
            if ("content".equals(textView.getText().toString())) {
                i = C0934m.f3957b;
                if (i == -1) {
                    int unused3 = C0934m.f3957b = textView.getCurrentTextColor();
                    float unused4 = C0934m.f3959d = textView.getTextSize();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("content color is :");
                    i2 = C0934m.f3957b;
                    sb2.append(i2);
                    C0923b.m4642a("NotificationStyleHelper", sb2.toString());
                }
            }
        }
    }
}
