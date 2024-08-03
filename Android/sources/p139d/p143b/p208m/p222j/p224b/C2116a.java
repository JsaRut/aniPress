package p139d.p143b.p208m.p222j.p224b;

import android.content.Context;
import android.net.Uri;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: d.b.m.j.b.a */
/* loaded from: classes.dex */
public class C2116a {

    /* renamed from: a */
    private Uri f7593a;

    /* renamed from: b */
    private String f7594b;

    /* renamed from: c */
    private double f7595c;

    /* renamed from: d */
    private boolean f7596d;

    public C2116a(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public C2116a(Context context, String str, double d2, double d3) {
        this.f7594b = str;
        this.f7595c = d2 * d3;
        this.f7593a = m8459b(context);
    }

    /* renamed from: a */
    private Uri m8458a(Context context) {
        this.f7596d = true;
        return C2119d.m8468a().m8471c(context, this.f7594b);
    }

    /* renamed from: b */
    private Uri m8459b(Context context) {
        try {
            Uri parse = Uri.parse(this.f7594b);
            return parse.getScheme() == null ? m8458a(context) : parse;
        } catch (Exception unused) {
            return m8458a(context);
        }
    }

    /* renamed from: a */
    public double m8460a() {
        return this.f7595c;
    }

    /* renamed from: b */
    public String m8461b() {
        return this.f7594b;
    }

    /* renamed from: c */
    public Uri m8462c() {
        Uri uri = this.f7593a;
        C2038a.m8318a(uri);
        return uri;
    }

    /* renamed from: d */
    public boolean m8463d() {
        return this.f7596d;
    }
}
