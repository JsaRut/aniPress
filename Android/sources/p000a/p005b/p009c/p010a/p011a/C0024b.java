package p000a.p005b.p009c.p010a.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.b.c.a.a.b */
/* loaded from: classes.dex */
public final class C0024b {

    /* renamed from: a */
    private final Shader f123a;

    /* renamed from: b */
    private final ColorStateList f124b;

    /* renamed from: c */
    private int f125c;

    private C0024b(Shader shader, ColorStateList colorStateList, int i) {
        this.f123a = shader;
        this.f124b = colorStateList;
        this.f125c = i;
    }

    /* renamed from: a */
    public static C0024b m98a(int i) {
        return new C0024b(null, null, i);
    }

    /* renamed from: a */
    static C0024b m99a(ColorStateList colorStateList) {
        return new C0024b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    public static C0024b m100a(Resources resources, int i, Resources.Theme theme) {
        try {
            return m102b(resources, i, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    /* renamed from: a */
    static C0024b m101a(Shader shader) {
        return new C0024b(shader, null, 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    private static C0024b m102b(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        char c2 = 65535;
        int hashCode = name.hashCode();
        if (hashCode != 89650992) {
            if (hashCode == 1191572447 && name.equals("selector")) {
                c2 = 0;
            }
        } else if (name.equals("gradient")) {
            c2 = 1;
        }
        if (c2 == 0) {
            return m99a(C0023a.m95a(resources, xml, asAttributeSet, theme));
        }
        if (c2 == 1) {
            return m101a(C0026d.m130a(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: a */
    public int m103a() {
        return this.f125c;
    }

    /* renamed from: a */
    public boolean m104a(int[] iArr) {
        if (m108d()) {
            ColorStateList colorStateList = this.f124b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f125c) {
                this.f125c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Shader m105b() {
        return this.f123a;
    }

    /* renamed from: b */
    public void m106b(int i) {
        this.f125c = i;
    }

    /* renamed from: c */
    public boolean m107c() {
        return this.f123a != null;
    }

    /* renamed from: d */
    public boolean m108d() {
        ColorStateList colorStateList;
        return this.f123a == null && (colorStateList = this.f124b) != null && colorStateList.isStateful();
    }

    /* renamed from: e */
    public boolean m109e() {
        return m107c() || this.f125c != 0;
    }
}
