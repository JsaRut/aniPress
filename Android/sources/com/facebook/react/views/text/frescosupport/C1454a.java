package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.views.text.AbstractC1465p;
import com.facebook.react.views.text.AbstractC1475z;
import java.util.Locale;
import p139d.p143b.p169g.p175c.AbstractC1777e;

/* renamed from: com.facebook.react.views.text.frescosupport.a */
/* loaded from: classes.dex */
public class C1454a extends AbstractC1465p {

    /* renamed from: A */
    private float f5342A = Float.NaN;

    /* renamed from: B */
    private float f5343B = Float.NaN;

    /* renamed from: C */
    private int f5344C = 0;

    /* renamed from: w */
    private Uri f5345w;

    /* renamed from: x */
    private ReadableMap f5346x;

    /* renamed from: y */
    private final AbstractC1777e f5347y;

    /* renamed from: z */
    private final Object f5348z;

    public C1454a(AbstractC1777e abstractC1777e, Object obj) {
        this.f5347y = abstractC1777e;
        this.f5348z = obj;
    }

    /* renamed from: a */
    private static Uri m6144a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    @Override // com.facebook.react.views.text.AbstractC1465p
    /* renamed from: N */
    public AbstractC1475z mo6145N() {
        return new C1455b(mo5513p().getResources(), (int) Math.ceil(this.f5343B), (int) Math.ceil(this.f5342A), this.f5344C, m6149R(), m6148Q(), m6147P(), m6146O());
    }

    /* renamed from: O */
    public Object m6146O() {
        return this.f5348z;
    }

    /* renamed from: P */
    public AbstractC1777e m6147P() {
        return this.f5347y;
    }

    /* renamed from: Q */
    public ReadableMap m6148Q() {
        return this.f5346x;
    }

    /* renamed from: R */
    public Uri m6149R() {
        return this.f5345w;
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: j */
    public boolean mo5507j() {
        return true;
    }

    @InterfaceC1294a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f5346x = readableMap;
    }

    @Override // com.facebook.react.uimanager.C1359n
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Number) {
            throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
        }
        this.f5343B = (float) dynamic.asDouble();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:            if (r1.getScheme() == null) goto L15;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @com.facebook.react.uimanager.p127a.InterfaceC1294a(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L16
        La:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L17
        L16:
            r4 = r0
        L17:
            if (r4 == 0) goto L2f
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L24
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L2f
            com.facebook.react.uimanager.N r0 = r3.mo5513p()
            android.net.Uri r0 = m6144a(r0, r4)
        L2f:
            android.net.Uri r4 = r3.f5345w
            if (r0 == r4) goto L36
            r3.mo5535K()
        L36:
            r3.f5345w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.C1454a.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @InterfaceC1294a(name = "tintColor")
    public void setTintColor(int i) {
        this.f5344C = i;
    }

    @Override // com.facebook.react.uimanager.C1359n
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Number) {
            throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
        }
        this.f5342A = (float) dynamic.asDouble();
    }
}
