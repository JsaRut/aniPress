package com.facebook.react.views.text;

import android.os.Build;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1271G;
import com.facebook.react.uimanager.C1374w;
import com.facebook.yoga.YogaDirection;

/* renamed from: com.facebook.react.views.text.x */
/* loaded from: classes.dex */
public class C1473x {

    /* renamed from: A */
    protected boolean f5419A;

    /* renamed from: B */
    protected float f5420B;

    /* renamed from: C */
    private final C1271G f5421C;

    /* renamed from: e */
    protected int f5426e;

    /* renamed from: g */
    protected int f5428g;

    /* renamed from: n */
    protected int f5435n;

    /* renamed from: o */
    protected int f5436o;

    /* renamed from: p */
    protected EnumC1447C f5437p;

    /* renamed from: q */
    protected float f5438q;

    /* renamed from: r */
    protected float f5439r;

    /* renamed from: s */
    protected float f5440s;

    /* renamed from: t */
    protected int f5441t;

    /* renamed from: u */
    protected boolean f5442u;

    /* renamed from: v */
    protected boolean f5443v;

    /* renamed from: w */
    protected boolean f5444w;

    /* renamed from: x */
    protected int f5445x;

    /* renamed from: y */
    protected int f5446y;

    /* renamed from: z */
    protected String f5447z;

    /* renamed from: a */
    protected float f5422a = Float.NaN;

    /* renamed from: b */
    protected float f5423b = Float.NaN;

    /* renamed from: c */
    protected boolean f5424c = false;

    /* renamed from: d */
    protected boolean f5425d = true;

    /* renamed from: f */
    protected boolean f5427f = false;

    /* renamed from: h */
    protected int f5429h = -1;

    /* renamed from: i */
    protected int f5430i = -1;

    /* renamed from: j */
    protected float f5431j = -1.0f;

    /* renamed from: k */
    protected float f5432k = -1.0f;

    /* renamed from: l */
    protected float f5433l = Float.NaN;

    /* renamed from: m */
    protected int f5434m = 0;

    public C1473x(C1271G c1271g) {
        this.f5435n = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.f5436o = 0;
        this.f5437p = EnumC1447C.UNSET;
        this.f5438q = 0.0f;
        this.f5439r = 0.0f;
        this.f5440s = 1.0f;
        this.f5441t = 1426063360;
        this.f5442u = false;
        this.f5443v = false;
        this.f5444w = true;
        this.f5445x = -1;
        this.f5446y = -1;
        this.f5447z = null;
        this.f5419A = false;
        this.f5420B = Float.NaN;
        this.f5421C = c1271g;
        m6197a(m6189a("numberOfLines", -1));
        m6209c(m6188a("lineHeight", -1.0f));
        m6203b(m6188a("letterSpacing", Float.NaN));
        m6201a(m6190a("allowFontScaling", true));
        m6213d(m6193i("textAlign"));
        m6196a(m6188a("fontSize", -1.0f));
        m6205b(c1271g.m5578e("color") ? Integer.valueOf(c1271g.m5572a("color", 0)) : null);
        m6205b(c1271g.m5578e("foregroundColor") ? Integer.valueOf(c1271g.m5572a("foregroundColor", 0)) : null);
        m6199a(c1271g.m5578e("backgroundColor") ? Integer.valueOf(c1271g.m5572a("backgroundColor", 0)) : null);
        m6200a(m6193i("fontFamily"));
        m6210c(m6193i("fontWeight"));
        m6206b(m6193i("fontStyle"));
        m6207b(m6190a("includeFontPadding", true));
        m6217f(m6193i("textDecorationLine"));
        m6215e(m6193i("textBreakStrategy"));
        m6198a(c1271g.m5578e("textShadowOffset") ? c1271g.m5576c("textShadowOffset") : null);
        m6212d(m6189a("textShadowRadius", 1));
        m6204b(m6189a("textShadowColor", 1426063360));
        m6218g(m6193i("textTransform"));
    }

    /* renamed from: a */
    private float m6188a(String str, float f) {
        return this.f5421C.m5578e(str) ? this.f5421C.m5571a(str, f) : f;
    }

    /* renamed from: a */
    private int m6189a(String str, int i) {
        return this.f5421C.m5578e(str) ? this.f5421C.m5572a(str, i) : i;
    }

    /* renamed from: a */
    private boolean m6190a(String str, boolean z) {
        return this.f5421C.m5578e(str) ? this.f5421C.m5574a(str, z) : z;
    }

    /* renamed from: g */
    private YogaDirection m6191g() {
        return YogaDirection.LTR;
    }

    /* renamed from: h */
    private float m6192h(String str) {
        return C1374w.m5959b(this.f5421C.m5578e("padding") ? m6188a("padding", 0.0f) : m6188a(str, 0.0f));
    }

    /* renamed from: i */
    private String m6193i(String str) {
        if (this.f5421C.m5578e(str)) {
            return this.f5421C.m5577d(str);
        }
        return null;
    }

    /* renamed from: j */
    private static int m6194j(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    /* renamed from: a */
    public float m6195a() {
        return m6192h("paddingBottom");
    }

    /* renamed from: a */
    public void m6196a(float f) {
        this.f5431j = f;
        if (f != -1.0f) {
            f = (float) Math.ceil(this.f5425d ? C1374w.m5960c(f) : C1374w.m5959b(f));
        }
        this.f5430i = (int) f;
    }

    /* renamed from: a */
    public void m6197a(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f5429h = i;
    }

    /* renamed from: a */
    public void m6198a(ReadableMap readableMap) {
        this.f5438q = 0.0f;
        this.f5439r = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f5438q = C1374w.m5956a(readableMap.getDouble("width"));
            }
            if (!readableMap.hasKey("height") || readableMap.isNull("height")) {
                return;
            }
            this.f5439r = C1374w.m5956a(readableMap.getDouble("height"));
        }
    }

    /* renamed from: a */
    public void m6199a(Integer num) {
        this.f5427f = num != null;
        if (this.f5427f) {
            this.f5428g = num.intValue();
        }
    }

    /* renamed from: a */
    public void m6200a(String str) {
        this.f5447z = str;
    }

    /* renamed from: a */
    public void m6201a(boolean z) {
        if (z != this.f5425d) {
            this.f5425d = z;
            m6196a(this.f5431j);
            m6209c(this.f5432k);
            m6203b(this.f5433l);
        }
    }

    /* renamed from: b */
    public float m6202b() {
        return !Float.isNaN(this.f5422a) && !Float.isNaN(this.f5420B) && (this.f5420B > this.f5422a ? 1 : (this.f5420B == this.f5422a ? 0 : -1)) > 0 ? this.f5420B : this.f5422a;
    }

    /* renamed from: b */
    public void m6203b(float f) {
        this.f5433l = f;
        this.f5423b = this.f5425d ? C1374w.m5960c(this.f5433l) : C1374w.m5959b(this.f5433l);
    }

    /* renamed from: b */
    public void m6204b(int i) {
        if (i != this.f5441t) {
            this.f5441t = i;
        }
    }

    /* renamed from: b */
    public void m6205b(Integer num) {
        this.f5424c = num != null;
        if (this.f5424c) {
            this.f5426e = num.intValue();
        }
    }

    /* renamed from: b */
    public void m6206b(String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : -1;
        if (i != this.f5445x) {
            this.f5445x = i;
        }
    }

    /* renamed from: b */
    public void m6207b(boolean z) {
        this.f5444w = z;
    }

    /* renamed from: c */
    public float m6208c() {
        return m6192h("paddingEnd");
    }

    /* renamed from: c */
    public void m6209c(float f) {
        this.f5432k = f;
        this.f5422a = f == -1.0f ? Float.NaN : this.f5425d ? C1374w.m5960c(f) : C1374w.m5959b(f);
    }

    /* renamed from: c */
    public void m6210c(String str) {
        int i = -1;
        int m6194j = str != null ? m6194j(str) : -1;
        if (m6194j >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (m6194j != -1 && m6194j < 500)) {
            i = 0;
        }
        if (i != this.f5446y) {
            this.f5446y = i;
        }
    }

    /* renamed from: d */
    public float m6211d() {
        return m6192h("paddingStart");
    }

    /* renamed from: d */
    public void m6212d(float f) {
        if (f != this.f5440s) {
            this.f5440s = f;
        }
    }

    /* renamed from: d */
    public void m6213d(String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f5436o = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f5434m = 0;
                return;
            }
            if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.f5434m = 5;
                    return;
                } else {
                    if ("center".equals(str)) {
                        this.f5434m = 1;
                        return;
                    }
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f5436o = 1;
        }
        this.f5434m = 3;
    }

    /* renamed from: e */
    public int m6214e() {
        int i = this.f5434m;
        if (m6191g() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    /* renamed from: e */
    public void m6215e(String str) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "highQuality".equals(str)) {
            i = 1;
        } else if ("simple".equals(str)) {
            i = 0;
        } else {
            if (!"balanced".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
            i = 2;
        }
        this.f5435n = i;
    }

    /* renamed from: f */
    public float m6216f() {
        return m6192h("paddingTop");
    }

    /* renamed from: f */
    public void m6217f(String str) {
        this.f5442u = false;
        this.f5443v = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f5442u = true;
                } else if ("line-through".equals(str2)) {
                    this.f5443v = true;
                }
            }
        }
    }

    /* renamed from: g */
    public void m6218g(String str) {
        EnumC1447C enumC1447C;
        if (str == null || "none".equals(str)) {
            enumC1447C = EnumC1447C.NONE;
        } else if ("uppercase".equals(str)) {
            enumC1447C = EnumC1447C.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            enumC1447C = EnumC1447C.LOWERCASE;
        } else {
            if (!"capitalize".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
            }
            enumC1447C = EnumC1447C.CAPITALIZE;
        }
        this.f5437p = enumC1447C;
    }
}
