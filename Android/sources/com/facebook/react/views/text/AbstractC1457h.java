package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1270F;
import com.facebook.react.uimanager.C1353k;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import java.util.ArrayList;
import java.util.List;

@TargetApi(23)
/* renamed from: com.facebook.react.views.text.h */
/* loaded from: classes.dex */
public abstract class AbstractC1457h extends C1359n {

    /* renamed from: A */
    protected int f5359A;

    /* renamed from: D */
    protected int f5362D;

    /* renamed from: E */
    protected int f5363E;

    /* renamed from: F */
    protected EnumC1447C f5364F;

    /* renamed from: G */
    protected float f5365G;

    /* renamed from: H */
    protected float f5366H;

    /* renamed from: I */
    protected float f5367I;

    /* renamed from: J */
    protected int f5368J;

    /* renamed from: K */
    protected boolean f5369K;

    /* renamed from: L */
    protected boolean f5370L;

    /* renamed from: M */
    protected boolean f5371M;

    /* renamed from: N */
    protected int f5372N;

    /* renamed from: O */
    protected int f5373O;

    /* renamed from: P */
    protected String f5374P;

    /* renamed from: Q */
    protected boolean f5375Q;

    /* renamed from: R */
    protected float f5376R;

    /* renamed from: w */
    protected C1474y f5377w;

    /* renamed from: y */
    protected int f5379y;

    /* renamed from: x */
    protected boolean f5378x = false;

    /* renamed from: z */
    protected boolean f5380z = false;

    /* renamed from: B */
    protected int f5360B = -1;

    /* renamed from: C */
    protected int f5361C = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.text.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        protected int f5381a;

        /* renamed from: b */
        protected int f5382b;

        /* renamed from: c */
        protected InterfaceC1462m f5383c;

        a(int i, int i2, InterfaceC1462m interfaceC1462m) {
            this.f5381a = i;
            this.f5382b = i2;
            this.f5383c = interfaceC1462m;
        }

        /* renamed from: a */
        public void m6160a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.f5383c, this.f5381a, this.f5382b, ((i << 16) & 16711680) | ((this.f5381a == 0 ? 18 : 34) & (-16711681)));
        }
    }

    public AbstractC1457h() {
        this.f5362D = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.f5363E = 0;
        this.f5364F = EnumC1447C.UNSET;
        this.f5365G = 0.0f;
        this.f5366H = 0.0f;
        this.f5367I = 0.0f;
        this.f5368J = 1426063360;
        this.f5369K = false;
        this.f5370L = false;
        this.f5371M = true;
        this.f5372N = -1;
        this.f5373O = -1;
        this.f5374P = null;
        this.f5375Q = false;
        this.f5376R = Float.NaN;
        this.f5377w = new C1474y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static Spannable m6157a(AbstractC1457h abstractC1457h, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        if (str != null) {
            spannableStringBuilder.append((CharSequence) EnumC1447C.m6136a(str, abstractC1457h.f5377w.m6237k()));
        }
        int i = 0;
        m6158a(abstractC1457h, spannableStringBuilder, arrayList, null, 0);
        abstractC1457h.f5375Q = false;
        float f = Float.NaN;
        for (a aVar : arrayList) {
            InterfaceC1462m interfaceC1462m = aVar.f5383c;
            if (interfaceC1462m instanceof AbstractC1475z) {
                int mo6152b = ((AbstractC1475z) interfaceC1462m).mo6152b();
                abstractC1457h.f5375Q = true;
                if (Float.isNaN(f) || mo6152b > f) {
                    f = mo6152b;
                }
            }
            aVar.m6160a(spannableStringBuilder, i);
            i++;
        }
        abstractC1457h.f5377w.m6225b(f);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private static void m6158a(AbstractC1457h abstractC1457h, SpannableStringBuilder spannableStringBuilder, List<a> list, C1474y c1474y, int i) {
        C1474y m6219a = c1474y != null ? c1474y.m6219a(abstractC1457h.f5377w) : abstractC1457h.f5377w;
        int mo5501e = abstractC1457h.mo5501e();
        for (int i2 = 0; i2 < mo5501e; i2++) {
            C1270F mo5502e = abstractC1457h.mo5502e(i2);
            if (mo5502e instanceof C1461l) {
                spannableStringBuilder.append((CharSequence) EnumC1447C.m6136a(((C1461l) mo5502e).m6166N(), m6219a.m6237k()));
            } else if (mo5502e instanceof AbstractC1457h) {
                m6158a((AbstractC1457h) mo5502e, spannableStringBuilder, list, m6219a, spannableStringBuilder.length());
            } else {
                if (!(mo5502e instanceof AbstractC1465p)) {
                    throw new C1353k("Unexpected view type nested under text node: " + mo5502e.getClass());
                }
                spannableStringBuilder.append("I");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((AbstractC1465p) mo5502e).mo6145N()));
            }
            mo5502e.mo5489b();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (abstractC1457h.f5378x) {
                list.add(new a(i, length, new C1460k(abstractC1457h.f5379y)));
            }
            if (abstractC1457h.f5380z) {
                list.add(new a(i, length, new C1456g(abstractC1457h.f5359A)));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                float m6226c = m6219a.m6226c();
                if (!Float.isNaN(m6226c) && (c1474y == null || c1474y.m6226c() != m6226c)) {
                    list.add(new a(i, length, new C1448a(m6226c)));
                }
            }
            int m6224b = m6219a.m6224b();
            if (c1474y == null || c1474y.m6224b() != m6224b) {
                list.add(new a(i, length, new C1453f(m6224b)));
            }
            if (abstractC1457h.f5372N != -1 || abstractC1457h.f5373O != -1 || abstractC1457h.f5374P != null) {
                list.add(new a(i, length, new C1450c(abstractC1457h.f5372N, abstractC1457h.f5373O, abstractC1457h.f5374P, abstractC1457h.mo5513p().getAssets())));
            }
            if (abstractC1457h.f5369K) {
                list.add(new a(i, length, new C1470u()));
            }
            if (abstractC1457h.f5370L) {
                list.add(new a(i, length, new C1463n()));
            }
            if ((abstractC1457h.f5365G != 0.0f || abstractC1457h.f5366H != 0.0f || abstractC1457h.f5367I != 0.0f) && Color.alpha(abstractC1457h.f5368J) != 0) {
                list.add(new a(i, length, new C1472w(abstractC1457h.f5365G, abstractC1457h.f5366H, abstractC1457h.f5367I, abstractC1457h.f5368J)));
            }
            float m6228d = m6219a.m6228d();
            if (!Float.isNaN(m6228d) && (c1474y == null || c1474y.m6228d() != m6228d)) {
                list.add(new a(i, length, new C1449b(m6228d)));
            }
            list.add(new a(i, length, new C1464o(abstractC1457h.mo5504g())));
        }
    }

    /* renamed from: b */
    private static int m6159b(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    @InterfaceC1294a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.f5377w.m6223a()) {
            this.f5377w.m6222a(z);
            mo5535K();
        }
    }

    @InterfaceC1294a(name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (mo5520w()) {
            return;
        }
        this.f5380z = num != null;
        if (this.f5380z) {
            this.f5359A = num.intValue();
        }
        mo5535K();
    }

    @InterfaceC1294a(name = "color")
    public void setColor(Integer num) {
        this.f5378x = num != null;
        if (this.f5378x) {
            this.f5379y = num.intValue();
        }
        mo5535K();
    }

    @InterfaceC1294a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f5374P = str;
        mo5535K();
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.f5377w.m6220a(f);
        mo5535K();
    }

    @InterfaceC1294a(name = "fontStyle")
    public void setFontStyle(String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : -1;
        if (i != this.f5372N) {
            this.f5372N = i;
            mo5535K();
        }
    }

    @InterfaceC1294a(name = "fontWeight")
    public void setFontWeight(String str) {
        int i = -1;
        int m6159b = str != null ? m6159b(str) : -1;
        if (m6159b >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (m6159b != -1 && m6159b < 500)) {
            i = 0;
        }
        if (i != this.f5373O) {
            this.f5373O = i;
            mo5535K();
        }
    }

    @InterfaceC1294a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.f5371M = z;
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.f5377w.m6227c(f);
        mo5535K();
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.f5377w.m6229d(f);
        mo5535K();
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.f5377w.m6236j()) {
            this.f5377w.m6231e(f);
            mo5535K();
        }
    }

    @InterfaceC1294a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f5360B = i;
        mo5535K();
    }

    @InterfaceC1294a(name = "textAlign")
    public void setTextAlign(String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f5363E = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f5361C = 0;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.f5361C = 5;
                } else {
                    if (!"center".equals(str)) {
                        throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                    }
                    this.f5361C = 1;
                }
            }
            mo5535K();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5363E = 1;
        }
        this.f5361C = 3;
        mo5535K();
    }

    @InterfaceC1294a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
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
        this.f5362D = i;
        mo5535K();
    }

    @InterfaceC1294a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f5369K = false;
        this.f5370L = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f5369K = true;
                } else if ("line-through".equals(str2)) {
                    this.f5370L = true;
                }
            }
        }
        mo5535K();
    }

    @InterfaceC1294a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.f5368J) {
            this.f5368J = i;
            mo5535K();
        }
    }

    @InterfaceC1294a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f5365G = 0.0f;
        this.f5366H = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f5365G = C1374w.m5956a(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f5366H = C1374w.m5956a(readableMap.getDouble("height"));
            }
        }
        mo5535K();
    }

    @InterfaceC1294a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.f5367I) {
            this.f5367I = f;
            mo5535K();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @InterfaceC1294a(name = "textTransform")
    public void setTextTransform(String str) {
        C1474y c1474y;
        EnumC1447C enumC1447C;
        if (str == null) {
            c1474y = this.f5377w;
            enumC1447C = EnumC1447C.UNSET;
        } else if ("none".equals(str)) {
            c1474y = this.f5377w;
            enumC1447C = EnumC1447C.NONE;
        } else if ("uppercase".equals(str)) {
            c1474y = this.f5377w;
            enumC1447C = EnumC1447C.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            c1474y = this.f5377w;
            enumC1447C = EnumC1447C.LOWERCASE;
        } else {
            if (!"capitalize".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
            }
            c1474y = this.f5377w;
            enumC1447C = EnumC1447C.CAPITALIZE;
        }
        c1474y.m6221a(enumC1447C);
        mo5535K();
    }
}
