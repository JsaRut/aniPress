package p031c.p032a.p072p.p073a.p077c;

import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.p087g.C0763e;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;

/* renamed from: c.a.p.a.c.d */
/* loaded from: classes.dex */
public final class C0725d implements InterfaceC0722a {

    /* renamed from: a */
    private String f3282a;

    /* renamed from: b */
    private long f3283b;

    /* renamed from: c */
    private long f3284c;

    /* renamed from: d */
    private long f3285d;

    /* renamed from: e */
    private C0725d f3286e;

    /* renamed from: f */
    private int f3287f;

    /* renamed from: g */
    private C0724c f3288g;

    /* renamed from: h */
    private C0724c f3289h;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:            if (r5 < 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:            if (r5 < 0) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:            if (r5 < 0) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:            if (r5 < 0) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:            if (r5 < 0) goto L54;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject m3674d() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p077c.C0725d.m3674d():org.json.JSONObject");
    }

    @Override // p031c.p032a.p072p.p073a.p077c.InterfaceC0722a
    /* renamed from: a */
    public final JSONObject mo3661a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_name", this.f3282a);
            jSONObject.put("page_duration", C0766h.m3814a(((float) (this.f3285d - this.f3284c)) / 1000.0f, 2));
            jSONObject.put("page_end_time", this.f3285d / 1000);
            jSONObject.put("page_start_time", this.f3284c / 1000);
            jSONObject.put("page_seq", this.f3287f);
            if (this.f3286e != null) {
                jSONObject.put("page_last_page", this.f3286e.f3282a);
            }
            JSONObject m3674d = m3674d();
            if (!C0763e.m3809a(m3674d)) {
                jSONObject.put("extra", m3674d);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void m3675a(int i) {
        this.f3287f = i;
    }

    /* renamed from: a */
    public final void m3676a(long j) {
        this.f3284c = j;
    }

    /* renamed from: a */
    public final void m3677a(C0724c c0724c) {
        this.f3288g = c0724c;
    }

    /* renamed from: a */
    public final void m3678a(C0725d c0725d) {
        C0725d c0725d2 = c0725d;
        C0725d c0725d3 = this;
        while (true) {
            c0725d3.f3286e = c0725d2;
            if (c0725d2 == null) {
                return;
            }
            C0725d c0725d4 = c0725d2;
            c0725d2 = null;
            c0725d3 = c0725d4;
        }
    }

    /* renamed from: a */
    public final void m3679a(String str) {
        this.f3282a = str;
    }

    /* renamed from: b */
    public final String m3680b() {
        return this.f3282a;
    }

    /* renamed from: b */
    public final void m3681b(long j) {
        this.f3285d = j;
        this.f3283b = j - this.f3284c;
    }

    /* renamed from: b */
    public final void m3682b(C0724c c0724c) {
        this.f3289h = c0724c;
    }

    /* renamed from: c */
    public final int m3683c() {
        return this.f3287f;
    }

    public final String toString() {
        return "PageEntity{pageName='" + this.f3282a + "', pageDuration=" + this.f3283b + ", startTime=" + this.f3284c + ", endTime=" + this.f3285d + ", lastPage=" + this.f3286e + ", seq=" + this.f3287f + ", pageStartPageExtra=" + this.f3288g + ", pageEndPageExtra=" + this.f3289h + '}';
    }
}
