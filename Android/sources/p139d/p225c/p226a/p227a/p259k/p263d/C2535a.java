package p139d.p225c.p226a.p227a.p259k.p263d;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2639p;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.d.a */
/* loaded from: classes.dex */
public final class C2535a extends AbstractC2531c {

    /* renamed from: o */
    private static final Pattern f10477o = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: p */
    private final boolean f10478p;

    /* renamed from: q */
    private int f10479q;

    /* renamed from: r */
    private int f10480r;

    /* renamed from: s */
    private int f10481s;

    /* renamed from: t */
    private int f10482t;

    public C2535a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f10478p = false;
            return;
        }
        this.f10478p = true;
        String m11056a = C2622I.m11056a(list.get(0));
        C2628e.m11111a(m11056a.startsWith("Format: "));
        m10646b(m11056a);
        m10643a(new C2644u(list.get(1)));
    }

    /* renamed from: a */
    public static long m10642a(String str) {
        Matcher matcher = f10477o.matcher(str);
        if (matcher.matches()) {
            return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private void m10643a(C2644u c2644u) {
        String m11228j;
        do {
            m11228j = c2644u.m11228j();
            if (m11228j == null) {
                return;
            }
        } while (!m11228j.startsWith("[Events]"));
    }

    /* renamed from: a */
    private void m10644a(C2644u c2644u, List<C2527b> list, C2639p c2639p) {
        while (true) {
            String m11228j = c2644u.m11228j();
            if (m11228j == null) {
                return;
            }
            if (!this.f10478p && m11228j.startsWith("Format: ")) {
                m10646b(m11228j);
            } else if (m11228j.startsWith("Dialogue: ")) {
                m10645a(m11228j, list, c2639p);
            }
        }
    }

    /* renamed from: a */
    private void m10645a(String str, List<C2527b> list, C2639p c2639p) {
        long j;
        StringBuilder sb;
        String str2;
        if (this.f10479q == 0) {
            sb = new StringBuilder();
            str2 = "Skipping dialogue line before complete format: ";
        } else {
            String[] split = str.substring(10).split(",", this.f10479q);
            if (split.length == this.f10479q) {
                long m10642a = m10642a(split[this.f10480r]);
                if (m10642a != -9223372036854775807L) {
                    String str3 = split[this.f10481s];
                    if (str3.trim().isEmpty()) {
                        j = -9223372036854775807L;
                    } else {
                        j = m10642a(str3);
                        if (j == -9223372036854775807L) {
                            sb = new StringBuilder();
                        }
                    }
                    list.add(new C2527b(split[this.f10482t].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                    c2639p.m11163a(m10642a);
                    if (j != -9223372036854775807L) {
                        list.add(null);
                        c2639p.m11163a(j);
                        return;
                    }
                    return;
                }
                sb = new StringBuilder();
                sb.append("Skipping invalid timing: ");
                sb.append(str);
                C2638o.m11160d("SsaDecoder", sb.toString());
            }
            sb = new StringBuilder();
            str2 = "Skipping dialogue line with fewer columns than format: ";
        }
        sb.append(str2);
        sb.append(str);
        C2638o.m11160d("SsaDecoder", sb.toString());
    }

    /* renamed from: b */
    private void m10646b(String str) {
        char c2;
        String[] split = TextUtils.split(str.substring(8), ",");
        this.f10479q = split.length;
        this.f10480r = -1;
        this.f10481s = -1;
        this.f10482t = -1;
        for (int i = 0; i < this.f10479q; i++) {
            String m11098j = C2622I.m11098j(split[i].trim());
            int hashCode = m11098j.hashCode();
            if (hashCode == 100571) {
                if (m11098j.equals("end")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else if (hashCode != 3556653) {
                if (hashCode == 109757538 && m11098j.equals("start")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (m11098j.equals("text")) {
                    c2 = 2;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                this.f10480r = i;
            } else if (c2 == 1) {
                this.f10481s = i;
            } else if (c2 == 2) {
                this.f10482t = i;
            }
        }
        if (this.f10480r == -1 || this.f10481s == -1 || this.f10482t == -1) {
            this.f10479q = 0;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    public C2536b mo10610a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C2639p c2639p = new C2639p();
        C2644u c2644u = new C2644u(bArr, i);
        if (!this.f10478p) {
            m10643a(c2644u);
        }
        m10644a(c2644u, arrayList, c2639p);
        C2527b[] c2527bArr = new C2527b[arrayList.size()];
        arrayList.toArray(c2527bArr);
        return new C2536b(c2527bArr, c2639p.m11164b());
    }
}
