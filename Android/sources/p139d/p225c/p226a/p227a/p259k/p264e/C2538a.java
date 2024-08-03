package p139d.p225c.p226a.p227a.p259k.p264e;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2639p;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.e.a */
/* loaded from: classes.dex */
public final class C2538a extends AbstractC2531c {

    /* renamed from: o */
    private static final Pattern f10485o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: p */
    private static final Pattern f10486p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: q */
    private final StringBuilder f10487q;

    /* renamed from: r */
    private final ArrayList<String> f10488r;

    public C2538a() {
        super("SubripDecoder");
        this.f10487q = new StringBuilder();
        this.f10488r = new ArrayList<>();
    }

    /* renamed from: a */
    private static long m10647a(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private C2527b m10648a(Spanned spanned, String str) {
        char c2;
        char c3;
        if (str == null) {
            return new C2527b(spanned);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        int i = (c2 == 0 || c2 == 1 || c2 == 2) ? 0 : (c2 == 3 || c2 == 4 || c2 == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        int i2 = (c3 == 0 || c3 == 1 || c3 == 2) ? 2 : (c3 == 3 || c3 == 4 || c3 == 5) ? 0 : 1;
        return new C2527b(spanned, null, m10650b(i2), 0, i2, m10650b(i), i, Float.MIN_VALUE);
    }

    /* renamed from: a */
    private String m10649a(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f10486p.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* renamed from: b */
    static float m10650b(int i) {
        if (i != 0) {
            return i != 1 ? 0.92f : 0.5f;
        }
        return 0.08f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    public C2539b mo10610a(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        C2639p c2639p = new C2639p();
        C2644u c2644u = new C2644u(bArr, i);
        while (true) {
            String m11228j = c2644u.m11228j();
            if (m11228j == null) {
                break;
            }
            if (m11228j.length() != 0) {
                try {
                    Integer.parseInt(m11228j);
                    m11228j = c2644u.m11228j();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (m11228j == null) {
                    C2638o.m11160d("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f10485o.matcher(m11228j);
                if (matcher.matches()) {
                    boolean z2 = true;
                    c2639p.m11163a(m10647a(matcher, 1));
                    int i2 = 0;
                    if (TextUtils.isEmpty(matcher.group(6))) {
                        z2 = false;
                    } else {
                        c2639p.m11163a(m10647a(matcher, 6));
                    }
                    this.f10487q.setLength(0);
                    this.f10488r.clear();
                    while (true) {
                        String m11228j2 = c2644u.m11228j();
                        if (TextUtils.isEmpty(m11228j2)) {
                            break;
                        }
                        if (this.f10487q.length() > 0) {
                            this.f10487q.append("<br>");
                        }
                        this.f10487q.append(m10649a(m11228j2, this.f10488r));
                    }
                    Spanned fromHtml = Html.fromHtml(this.f10487q.toString());
                    while (true) {
                        if (i2 >= this.f10488r.size()) {
                            str2 = null;
                            break;
                        }
                        str2 = this.f10488r.get(i2);
                        if (str2.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        }
                        i2++;
                    }
                    arrayList.add(m10648a(fromHtml, str2));
                    if (z2) {
                        arrayList.add(null);
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb.append(str);
                    sb.append(m11228j);
                    C2638o.m11160d("SubripDecoder", sb.toString());
                }
            }
        }
        C2527b[] c2527bArr = new C2527b[arrayList.size()];
        arrayList.toArray(c2527bArr);
        return new C2539b(c2527bArr, c2639p.m11164b());
    }
}
