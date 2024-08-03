package p031c.p101b.p102a.p110h;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import p031c.p101b.p102a.p108f.C0903a;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p115m.C0938a;
import p031c.p101b.p102a.p115m.C0940c;

/* renamed from: c.b.a.h.e */
/* loaded from: classes.dex */
public class C0909e {
    /* renamed from: a */
    public static boolean m4533a(ArrayList<String> arrayList, Context context, String str, String str2, boolean z) {
        String str3;
        StringBuilder sb;
        C0923b.m4651g("RichHelper", "action:loadHtmlImageResources - urlPrefix:" + str);
        boolean z2 = true;
        if (C0938a.m4718a(str) && context != null && arrayList.size() > 0 && !TextUtils.isEmpty(str2)) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null || next.startsWith("http://")) {
                    str3 = next;
                } else {
                    str3 = str + next;
                }
                byte[] m4472b = C0903a.m4472b(str3, 5, 5000L);
                if (m4472b != null) {
                    try {
                        if (next.startsWith("http://")) {
                            next = C0940c.m4740b(next);
                        }
                        if (z) {
                            sb = new StringBuilder();
                            sb.append(C0940c.m4744c(context, str2));
                            sb.append(next);
                        } else {
                            sb = new StringBuilder();
                            sb.append(C0940c.m4739b(context, str2));
                            sb.append(next);
                        }
                        String sb2 = sb.toString();
                        C0940c.m4738a(sb2, m4472b);
                        C0923b.m4651g("RichHelper", "Succeed to load image - " + sb2);
                    } catch (Exception e2) {
                        C0923b.m4647c("RichHelper", "Write storage error,  create img file fail.", e2);
                    }
                } else {
                    C0930i.m4675a(str2, 1020, null, context);
                }
                z2 = false;
            }
        }
        return z2;
    }
}
