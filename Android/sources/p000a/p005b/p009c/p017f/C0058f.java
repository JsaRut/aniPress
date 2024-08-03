package p000a.p005b.p009c.p017f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.util.C0263i;
import android.support.v4.util.C0268n;
import android.support.v4.util.C0269o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.p005b.p009c.p010a.p011a.C0025c;
import p000a.p005b.p009c.p010a.p011a.C0030h;
import p000a.p005b.p009c.p012b.C0037c;
import p000a.p005b.p009c.p012b.C0045k;
import p000a.p005b.p009c.p017f.C0063k;

/* renamed from: a.b.c.f.f */
/* loaded from: classes.dex */
public class C0058f {

    /* renamed from: a */
    static final C0263i<String, Typeface> f189a = new C0263i<>(16);

    /* renamed from: b */
    private static final C0063k f190b = new C0063k("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f191c = new Object();

    /* renamed from: d */
    static final C0269o<String, ArrayList<C0063k.a<c>>> f192d = new C0269o<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f193e = new C0057e();

    /* renamed from: a.b.c.f.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final int f194a;

        /* renamed from: b */
        private final b[] f195b;

        public a(int i, b[] bVarArr) {
            this.f194a = i;
            this.f195b = bVarArr;
        }

        /* renamed from: a */
        public b[] m252a() {
            return this.f195b;
        }

        /* renamed from: b */
        public int m253b() {
            return this.f194a;
        }
    }

    /* renamed from: a.b.c.f.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Uri f196a;

        /* renamed from: b */
        private final int f197b;

        /* renamed from: c */
        private final int f198c;

        /* renamed from: d */
        private final boolean f199d;

        /* renamed from: e */
        private final int f200e;

        public b(Uri uri, int i, int i2, boolean z, int i3) {
            C0268n.m1384a(uri);
            this.f196a = uri;
            this.f197b = i;
            this.f198c = i2;
            this.f199d = z;
            this.f200e = i3;
        }

        /* renamed from: a */
        public int m254a() {
            return this.f200e;
        }

        /* renamed from: b */
        public int m255b() {
            return this.f197b;
        }

        /* renamed from: c */
        public Uri m256c() {
            return this.f196a;
        }

        /* renamed from: d */
        public int m257d() {
            return this.f198c;
        }

        /* renamed from: e */
        public boolean m258e() {
            return this.f199d;
        }
    }

    /* renamed from: a.b.c.f.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final Typeface f201a;

        /* renamed from: b */
        final int f202b;

        c(Typeface typeface, int i) {
            this.f201a = typeface;
            this.f202b = i;
        }
    }

    /* renamed from: a */
    public static a m243a(Context context, CancellationSignal cancellationSignal, C0053a c0053a) {
        ProviderInfo m245a = m245a(context.getPackageManager(), c0053a, context.getResources());
        return m245a == null ? new a(1, null) : new a(0, m251a(context, c0053a, m245a.authority, cancellationSignal));
    }

    /* renamed from: a */
    public static c m244a(Context context, C0053a c0053a, int i) {
        try {
            a m243a = m243a(context, (CancellationSignal) null, c0053a);
            if (m243a.m253b() != 0) {
                return new c(null, m243a.m253b() == 1 ? -2 : -3);
            }
            Typeface m191a = C0037c.m191a(context, null, m243a.m252a(), i);
            return new c(m191a, m191a != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new c(null, -1);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static ProviderInfo m245a(PackageManager packageManager, C0053a c0053a, Resources resources) {
        String m238d = c0053a.m238d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m238d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m238d);
        }
        if (!resolveContentProvider.packageName.equals(c0053a.m239e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m238d + ", but package was not " + c0053a.m239e());
        }
        List<byte[]> m248a = m248a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(m248a, f193e);
        List<List<byte[]>> m247a = m247a(c0053a, resources);
        for (int i = 0; i < m247a.size(); i++) {
            ArrayList arrayList = new ArrayList(m247a.get(i));
            Collections.sort(arrayList, f193e);
            if (m250a(m248a, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Typeface m246a(Context context, C0053a c0053a, C0030h.a aVar, Handler handler, boolean z, int i, int i2) {
        String str = c0053a.m237c() + "-" + i2;
        Typeface m1371b = f189a.m1371b(str);
        if (m1371b != null) {
            if (aVar != null) {
                aVar.mo141a(m1371b);
            }
            return m1371b;
        }
        if (z && i == -1) {
            c m244a = m244a(context, c0053a, i2);
            if (aVar != null) {
                int i3 = m244a.f202b;
                if (i3 == 0) {
                    aVar.m142a(m244a.f201a, handler);
                } else {
                    aVar.m140a(i3, handler);
                }
            }
            return m244a.f201a;
        }
        CallableC0054b callableC0054b = new CallableC0054b(context, c0053a, i2, str);
        if (z) {
            try {
                return ((c) f190b.m260a(callableC0054b, i)).f201a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0055c c0055c = aVar == null ? null : new C0055c(aVar, handler);
        synchronized (f191c) {
            if (f192d.containsKey(str)) {
                if (c0055c != null) {
                    f192d.get(str).add(c0055c);
                }
                return null;
            }
            if (c0055c != null) {
                ArrayList<C0063k.a<c>> arrayList = new ArrayList<>();
                arrayList.add(c0055c);
                f192d.put(str, arrayList);
            }
            f190b.m263a(callableC0054b, new C0056d(str));
            return null;
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m247a(C0053a c0053a, Resources resources) {
        return c0053a.m235a() != null ? c0053a.m235a() : C0025c.m112a(resources, c0053a.m236b());
    }

    /* renamed from: a */
    private static List<byte[]> m248a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m249a(Context context, b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (b bVar : bVarArr) {
            if (bVar.m254a() == 0) {
                Uri m256c = bVar.m256c();
                if (!hashMap.containsKey(m256c)) {
                    hashMap.put(m256c, C0045k.m224a(context, cancellationSignal, m256c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m250a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x012b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static p000a.p005b.p009c.p017f.C0058f.b[] m251a(android.content.Context r19, p000a.p005b.p009c.p017f.C0053a r20, java.lang.String r21, android.os.CancellationSignal r22) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p017f.C0058f.m251a(android.content.Context, a.b.c.f.a, java.lang.String, android.os.CancellationSignal):a.b.c.f.f$b[]");
    }
}
