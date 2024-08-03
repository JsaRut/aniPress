package p139d.p225c.p226a.p227a.p269m;

import android.text.TextUtils;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.m.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C2608v {
    /* renamed from: a */
    public static /* synthetic */ boolean m10951a(String str) {
        String m11098j = C2622I.m11098j(str);
        return (TextUtils.isEmpty(m11098j) || (m11098j.contains("text") && !m11098j.contains("text/vtt")) || m11098j.contains("html") || m11098j.contains("xml")) ? false : true;
    }
}
