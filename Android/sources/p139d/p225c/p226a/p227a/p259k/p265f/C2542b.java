package p139d.p225c.p226a.p227a.p259k.p265f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.k.f.b */
/* loaded from: classes.dex */
final class C2542b {

    /* renamed from: a */
    public final String f10507a;

    /* renamed from: b */
    public final String f10508b;

    /* renamed from: c */
    public final boolean f10509c;

    /* renamed from: d */
    public final long f10510d;

    /* renamed from: e */
    public final long f10511e;

    /* renamed from: f */
    public final C2545e f10512f;

    /* renamed from: g */
    private final String[] f10513g;

    /* renamed from: h */
    public final String f10514h;

    /* renamed from: i */
    public final String f10515i;

    /* renamed from: j */
    private final HashMap<String, Integer> f10516j;

    /* renamed from: k */
    private final HashMap<String, Integer> f10517k;

    /* renamed from: l */
    private List<C2542b> f10518l;

    private C2542b(String str, String str2, long j, long j2, C2545e c2545e, String[] strArr, String str3, String str4) {
        this.f10507a = str;
        this.f10508b = str2;
        this.f10515i = str4;
        this.f10512f = c2545e;
        this.f10513g = strArr;
        this.f10509c = str2 != null;
        this.f10510d = j;
        this.f10511e = j2;
        C2628e.m11110a(str3);
        this.f10514h = str3;
        this.f10516j = new HashMap<>();
        this.f10517k = new HashMap<>();
    }

    /* renamed from: a */
    private SpannableStringBuilder m10664a(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int i3 = 0;
        int length = spannableStringBuilder.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i4, i4 + i7);
                    length -= i7;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i8 = 0;
        while (true) {
            i = length - 1;
            if (i8 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i8) == '\n') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                    length--;
                }
            }
            i8++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
            spannableStringBuilder.delete(i, length);
            length--;
        }
        while (true) {
            i2 = length - 1;
            if (i3 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i10 = i3 + 1;
                if (spannableStringBuilder.charAt(i10) == '\n') {
                    spannableStringBuilder.delete(i3, i10);
                    length--;
                }
            }
            i3++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == '\n') {
            spannableStringBuilder.delete(i2, length);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private static SpannableStringBuilder m10665a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    /* renamed from: a */
    public static C2542b m10666a(String str) {
        return new C2542b(null, C2544d.m10680a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
    }

    /* renamed from: a */
    public static C2542b m10667a(String str, long j, long j2, C2545e c2545e, String[] strArr, String str2, String str3) {
        return new C2542b(str, null, j, j2, c2545e, strArr, str2, str3);
    }

    /* renamed from: a */
    private void m10668a(long j, String str, List<Pair<String, String>> list) {
        String str2;
        if (!"".equals(this.f10514h)) {
            str = this.f10514h;
        }
        if (m10677a(j) && "div".equals(this.f10507a) && (str2 = this.f10515i) != null) {
            list.add(new Pair<>(str, str2));
            return;
        }
        for (int i = 0; i < m10673a(); i++) {
            m10674a(i).m10668a(j, str, list);
        }
    }

    /* renamed from: a */
    private void m10669a(long j, Map<String, C2545e> map, Map<String, SpannableStringBuilder> map2) {
        int i;
        if (m10677a(j)) {
            Iterator<Map.Entry<String, Integer>> it = this.f10517k.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                i = this.f10516j.containsKey(key) ? this.f10516j.get(key).intValue() : 0;
                int intValue = next.getValue().intValue();
                if (i != intValue) {
                    m10671a(map, map2.get(key), i, intValue);
                }
            }
            while (i < m10673a()) {
                m10674a(i).m10669a(j, map, map2);
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m10670a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f10516j.clear();
        this.f10517k.clear();
        if ("metadata".equals(this.f10507a)) {
            return;
        }
        if (!"".equals(this.f10514h)) {
            str = this.f10514h;
        }
        if (this.f10509c && z) {
            m10665a(str, map).append((CharSequence) this.f10508b);
            return;
        }
        if ("br".equals(this.f10507a) && z) {
            m10665a(str, map).append('\n');
            return;
        }
        if (m10677a(j)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.f10516j.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean equals = "p".equals(this.f10507a);
            for (int i = 0; i < m10673a(); i++) {
                m10674a(i).m10670a(j, z || equals, str, map);
            }
            if (equals) {
                C2544d.m10681a(m10665a(str, map));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.f10517k.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }

    /* renamed from: a */
    private void m10671a(Map<String, C2545e> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        C2545e m10679a = C2544d.m10679a(this.f10512f, this.f10513g, map);
        if (m10679a != null) {
            C2544d.m10682a(spannableStringBuilder, i, i2, m10679a);
        }
    }

    /* renamed from: a */
    private void m10672a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f10507a);
        boolean equals2 = "div".equals(this.f10507a);
        if (z || equals || (equals2 && this.f10515i != null)) {
            long j = this.f10510d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f10511e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f10518l == null) {
            return;
        }
        for (int i = 0; i < this.f10518l.size(); i++) {
            this.f10518l.get(i).m10672a(treeSet, z || equals);
        }
    }

    /* renamed from: a */
    public int m10673a() {
        List<C2542b> list = this.f10518l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public C2542b m10674a(int i) {
        List<C2542b> list = this.f10518l;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public List<C2527b> m10675a(long j, Map<String, C2545e> map, Map<String, C2543c> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m10668a(j, this.f10514h, arrayList);
        TreeMap treeMap = new TreeMap();
        m10670a(j, false, this.f10514h, (Map<String, SpannableStringBuilder>) treeMap);
        m10669a(j, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C2543c c2543c = map2.get(pair.first);
                arrayList2.add(new C2527b(decodeByteArray, c2543c.f10520b, 1, c2543c.f10521c, c2543c.f10523e, c2543c.f10524f, Float.MIN_VALUE));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C2543c c2543c2 = map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            m10664a(spannableStringBuilder);
            arrayList2.add(new C2527b(spannableStringBuilder, (Layout.Alignment) null, c2543c2.f10521c, c2543c2.f10522d, c2543c2.f10523e, c2543c2.f10520b, Integer.MIN_VALUE, c2543c2.f10524f, c2543c2.f10525g, c2543c2.f10526h));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public void m10676a(C2542b c2542b) {
        if (this.f10518l == null) {
            this.f10518l = new ArrayList();
        }
        this.f10518l.add(c2542b);
    }

    /* renamed from: a */
    public boolean m10677a(long j) {
        return (this.f10510d == -9223372036854775807L && this.f10511e == -9223372036854775807L) || (this.f10510d <= j && this.f10511e == -9223372036854775807L) || ((this.f10510d == -9223372036854775807L && j < this.f10511e) || (this.f10510d <= j && j < this.f10511e));
    }

    /* renamed from: b */
    public long[] m10678b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m10672a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }
}
