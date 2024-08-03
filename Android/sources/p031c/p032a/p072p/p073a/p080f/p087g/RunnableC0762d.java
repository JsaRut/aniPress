package p031c.p032a.p072p.p073a.p080f.p087g;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: c.a.p.a.f.g.d */
/* loaded from: classes.dex */
public final class RunnableC0762d extends WebChromeClient implements Runnable {
    /* renamed from: a */
    public static void m3806a(View view, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:" + str + "(");
        String str2 = "";
        int i = 0;
        while (i < objArr.length) {
            Object obj = objArr[i];
            sb.append(str2);
            boolean z = obj instanceof String;
            if (z) {
                sb.append("'");
            }
            sb.append(objArr[i]);
            if (z) {
                sb.append("'");
            }
            i++;
            str2 = ",";
        }
        sb.append(")");
        if (view instanceof WebView) {
            ((WebView) view).loadUrl(sb.toString());
        }
    }
}
