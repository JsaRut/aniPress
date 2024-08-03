package p031c.p032a.p040H;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p031c.p032a.p039G.C0526a;
import p031c.p032a.p047O.C0554d;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.H.a */
/* loaded from: classes.dex */
public final class C0527a {
    /* renamed from: a */
    public static String m2759a(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i & 255);
        stringBuffer.append('.');
        stringBuffer.append((i >> 8) & 255);
        stringBuffer.append('.');
        stringBuffer.append((i >> 16) & 255);
        stringBuffer.append('.');
        stringBuffer.append((i >> 24) & 255);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static /* synthetic */ String m2760a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bArr[0] & 255);
        stringBuffer.append('.');
        stringBuffer.append(bArr[1] & 255);
        stringBuffer.append('.');
        stringBuffer.append(bArr[2] & 255);
        stringBuffer.append('.');
        stringBuffer.append(bArr[3] & 255);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static List<C0526a> m2761a(String str) {
        C0526a m2763b;
        List<String> m2883a = C0554d.m2883a(new String[]{"cat /proc/net/arp"}, 1);
        if (m2883a == null || m2883a.isEmpty()) {
            C0675a.m3475g("JArpHelper", "execute command failed");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : m2883a) {
            if (!TextUtils.isEmpty(str2) && (m2763b = m2763b(str2)) != null && m2763b.f2626c.equals("0x2") && !str.equals(m2763b.f2624a) && !m2763b.f2627d.equals("00:00:00:00:00:00")) {
                arrayList.add(m2763b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m2762a(String str, byte[] bArr) {
        new C0528b(str, 300).m2764a(bArr, 0, 255);
    }

    /* renamed from: b */
    private static C0526a m2763b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes();
        C0526a c0526a = new C0526a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= bytes.length - 1) {
                break;
            }
            i++;
            if (bytes[i] == 32) {
                int i4 = i - i2;
                if (i4 > 1) {
                    String str2 = new String(bytes, i2, i4);
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    c0526a.f2627d = str2;
                                    break;
                                }
                            } else {
                                c0526a.f2626c = str2;
                            }
                        } else {
                            c0526a.f2625b = str2;
                        }
                    } else {
                        c0526a.f2624a = str2;
                    }
                    i3++;
                }
                i2 = i + 1;
            }
        }
        return c0526a;
    }
}
