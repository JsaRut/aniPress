package p031c.p032a.p064h;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: c.a.h.l */
/* loaded from: classes.dex */
public class C0652l {

    /* renamed from: a */
    private static C0652l f3036a;

    /* renamed from: b */
    private String[] f3037b = null;

    /* renamed from: c */
    private C0648h[] f3038c = null;

    /* renamed from: d */
    private int f3039d = -1;

    static {
        C0652l c0652l = new C0652l();
        synchronized (C0652l.class) {
            f3036a = c0652l;
        }
    }

    public C0652l() {
        if (m3354c() || m3355d()) {
            return;
        }
        if (this.f3037b == null || this.f3038c == null) {
            if (System.getProperty("java.vendor").indexOf("Android") != -1) {
                m3356e();
            } else {
                m3352b("/etc/resolv.conf");
            }
        }
    }

    /* renamed from: a */
    private static int m3348a(String str) {
        try {
            int parseInt = Integer.parseInt(str.substring(6));
            if (parseInt >= 0) {
                return parseInt;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static void m3349a(String str, List list) {
        if (list.contains(str)) {
            return;
        }
        list.add(str);
    }

    /* renamed from: a */
    private void m3350a(List list, List list2) {
        if (this.f3037b == null && list.size() > 0) {
            this.f3037b = (String[]) list.toArray(new String[0]);
        }
        if (this.f3038c != null || list2.size() <= 0) {
            return;
        }
        this.f3038c = (C0648h[]) list2.toArray(new C0648h[0]);
    }

    /* renamed from: b */
    public static synchronized C0652l m3351b() {
        C0652l c0652l;
        synchronized (C0652l.class) {
            c0652l = f3036a;
        }
        return c0652l;
    }

    /* renamed from: b */
    private void m3352b(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            ArrayList arrayList = new ArrayList(0);
            ArrayList arrayList2 = new ArrayList(0);
            int i = -1;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("nameserver")) {
                        StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                        stringTokenizer.nextToken();
                        m3349a(stringTokenizer.nextToken(), arrayList);
                    } else if (readLine.startsWith("domain")) {
                        StringTokenizer stringTokenizer2 = new StringTokenizer(readLine);
                        stringTokenizer2.nextToken();
                        if (stringTokenizer2.hasMoreTokens() && arrayList2.isEmpty()) {
                            m3353b(stringTokenizer2.nextToken(), arrayList2);
                        }
                    } else if (readLine.startsWith("search")) {
                        if (!arrayList2.isEmpty()) {
                            arrayList2.clear();
                        }
                        StringTokenizer stringTokenizer3 = new StringTokenizer(readLine);
                        stringTokenizer3.nextToken();
                        while (stringTokenizer3.hasMoreTokens()) {
                            m3353b(stringTokenizer3.nextToken(), arrayList2);
                        }
                    } else if (readLine.startsWith("options")) {
                        StringTokenizer stringTokenizer4 = new StringTokenizer(readLine);
                        stringTokenizer4.nextToken();
                        while (stringTokenizer4.hasMoreTokens()) {
                            String nextToken = stringTokenizer4.nextToken();
                            if (nextToken.startsWith("ndots:")) {
                                i = m3348a(nextToken);
                            }
                        }
                    }
                } catch (IOException unused) {
                }
            }
            bufferedReader.close();
            m3350a(arrayList, arrayList2);
            if (this.f3039d >= 0 || i <= 0) {
                return;
            }
            this.f3039d = i;
        } catch (FileNotFoundException unused2) {
        }
    }

    /* renamed from: b */
    private static void m3353b(String str, List list) {
        try {
            C0648h m3311a = C0648h.m3311a(str, C0648h.f3020c);
            if (list.contains(m3311a)) {
                return;
            }
            list.add(m3311a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private boolean m3354c() {
        ArrayList arrayList = new ArrayList(0);
        ArrayList arrayList2 = new ArrayList(0);
        String property = System.getProperty("dns.server");
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                m3349a(stringTokenizer.nextToken(), arrayList);
            }
        }
        String property2 = System.getProperty("dns.search");
        if (property2 != null) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(property2, ",");
            while (stringTokenizer2.hasMoreTokens()) {
                m3353b(stringTokenizer2.nextToken(), arrayList2);
            }
        }
        m3350a(arrayList, arrayList2);
        return (this.f3037b == null || this.f3038c == null) ? false : true;
    }

    /* renamed from: d */
    private boolean m3355d() {
        ArrayList arrayList = new ArrayList(0);
        ArrayList arrayList2 = new ArrayList(0);
        try {
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            Class<?> cls = Class.forName("sun.net.dns.ResolverConfiguration");
            Object invoke = cls.getDeclaredMethod("open", clsArr).invoke(null, objArr);
            List list = (List) cls.getMethod("nameservers", clsArr).invoke(invoke, objArr);
            List list2 = (List) cls.getMethod("searchlist", clsArr).invoke(invoke, objArr);
            if (list.size() == 0) {
                return false;
            }
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m3349a((String) it.next(), arrayList);
                }
            }
            if (list2.size() > 0) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    m3353b((String) it2.next(), arrayList2);
                }
            }
            m3350a(arrayList, arrayList2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private void m3356e() {
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i = 0; i < 4; i++) {
                String str = (String) method.invoke(null, strArr[i]);
                if (str != null && ((str.matches("^\\d+(\\.\\d+){3}$") || str.matches("^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$")) && !arrayList.contains(str))) {
                    arrayList.add(str);
                }
            }
        } catch (Exception unused) {
        }
        m3350a(arrayList, arrayList2);
    }

    /* renamed from: a */
    public final String[] m3357a() {
        return this.f3037b;
    }
}
