package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p005b.p022d.p023a.C0121j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.J */
/* loaded from: classes.dex */
public class C0407J {

    /* renamed from: a */
    private static final RectF f2067a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f2068b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f2069c = 0;

    /* renamed from: d */
    private boolean f2070d = false;

    /* renamed from: e */
    private float f2071e = -1.0f;

    /* renamed from: f */
    private float f2072f = -1.0f;

    /* renamed from: g */
    private float f2073g = -1.0f;

    /* renamed from: h */
    private int[] f2074h = new int[0];

    /* renamed from: i */
    private boolean f2075i = false;

    /* renamed from: j */
    private TextPaint f2076j;

    /* renamed from: k */
    private final TextView f2077k;

    /* renamed from: l */
    private final Context f2078l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0407J(TextView textView) {
        this.f2077k = textView;
        this.f2078l = this.f2077k.getContext();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private int m2232a(RectF rectF) {
        int length = this.f2074h.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            if (m2240a(this.f2074h[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i2;
                i2 = i5;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f2074h[i3];
    }

    /* renamed from: a */
    private StaticLayout m2233a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            floatValue = this.f2077k.getLineSpacingMultiplier();
            floatValue2 = this.f2077k.getLineSpacingExtra();
            booleanValue = this.f2077k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m2235a((Object) this.f2077k, "getLineSpacingMultiplier", (String) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m2235a((Object) this.f2077k, "getLineSpacingExtra", (String) Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m2235a((Object) this.f2077k, "getIncludeFontPadding", (String) true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f2076j, i, alignment, floatValue, floatValue2, booleanValue);
    }

    /* renamed from: a */
    private StaticLayout m2234a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m2235a((Object) this.f2077k, "getTextDirectionHeuristic", (String) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2076j, i).setAlignment(alignment).setLineSpacing(this.f2077k.getLineSpacingExtra(), this.f2077k.getLineSpacingMultiplier()).setIncludePad(this.f2077k.getIncludeFontPadding()).setBreakStrategy(this.f2077k.getBreakStrategy()).setHyphenationFrequency(this.f2077k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m2235a(Object obj, String str, T t) {
        try {
            return (T) m2236a(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    /* renamed from: a */
    private Method m2236a(String str) {
        try {
            Method method = f2068b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2068b.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* renamed from: a */
    private void m2237a(float f) {
        if (f != this.f2077k.getPaint().getTextSize()) {
            this.f2077k.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f2077k.isInLayout() : false;
            if (this.f2077k.getLayout() != null) {
                this.f2070d = false;
                try {
                    Method m2236a = m2236a("nullLayouts");
                    if (m2236a != null) {
                        m2236a.invoke(this.f2077k, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.f2077k.forceLayout();
                } else {
                    this.f2077k.requestLayout();
                }
                this.f2077k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m2238a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f2069c = 1;
        this.f2072f = f;
        this.f2073g = f2;
        this.f2071e = f3;
        this.f2075i = false;
    }

    /* renamed from: a */
    private void m2239a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2074h = m2241a(iArr);
            m2244j();
        }
    }

    /* renamed from: a */
    private boolean m2240a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2077k.getText();
        TransformationMethod transformationMethod = this.f2077k.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f2077k)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f2077k.getMaxLines() : -1;
        TextPaint textPaint = this.f2076j;
        if (textPaint == null) {
            this.f2076j = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2076j.set(this.f2077k.getPaint());
        this.f2076j.setTextSize(i);
        Layout.Alignment alignment = (Layout.Alignment) m2235a((Object) this.f2077k, "getLayoutAlignment", (String) Layout.Alignment.ALIGN_NORMAL);
        StaticLayout m2234a = Build.VERSION.SDK_INT >= 23 ? m2234a(text, alignment, Math.round(rectF.right), maxLines) : m2233a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (m2234a.getLineCount() <= maxLines && m2234a.getLineEnd(m2234a.getLineCount() - 1) == text.length())) && ((float) m2234a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m2241a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private void m2242h() {
        this.f2069c = 0;
        this.f2072f = -1.0f;
        this.f2073g = -1.0f;
        this.f2071e = -1.0f;
        this.f2074h = new int[0];
        this.f2070d = false;
    }

    /* renamed from: i */
    private boolean m2243i() {
        if (m2245k() && this.f2069c == 1) {
            if (!this.f2075i || this.f2074h.length == 0) {
                float round = Math.round(this.f2072f);
                int i = 1;
                while (Math.round(this.f2071e + round) <= Math.round(this.f2073g)) {
                    i++;
                    round += this.f2071e;
                }
                int[] iArr = new int[i];
                float f = this.f2072f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f2071e;
                }
                this.f2074h = m2241a(iArr);
            }
            this.f2070d = true;
        } else {
            this.f2070d = false;
        }
        return this.f2070d;
    }

    /* renamed from: j */
    private boolean m2244j() {
        this.f2075i = this.f2074h.length > 0;
        if (this.f2075i) {
            this.f2069c = 1;
            int[] iArr = this.f2074h;
            this.f2072f = iArr[0];
            this.f2073g = iArr[r0 - 1];
            this.f2071e = -1.0f;
        }
        return this.f2075i;
    }

    /* renamed from: k */
    private boolean m2245k() {
        return !(this.f2077k instanceof C0466p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2246a() {
        if (m2257g()) {
            if (this.f2070d) {
                if (this.f2077k.getMeasuredHeight() <= 0 || this.f2077k.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) m2235a((Object) this.f2077k, "getHorizontallyScrolling", (String) false)).booleanValue() ? 1048576 : (this.f2077k.getMeasuredWidth() - this.f2077k.getTotalPaddingLeft()) - this.f2077k.getTotalPaddingRight();
                int height = (this.f2077k.getHeight() - this.f2077k.getCompoundPaddingBottom()) - this.f2077k.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f2067a) {
                    f2067a.setEmpty();
                    f2067a.right = measuredWidth;
                    f2067a.bottom = height;
                    float m2232a = m2232a(f2067a);
                    if (m2232a != this.f2077k.getTextSize()) {
                        m2248a(0, m2232a);
                    }
                }
            }
            this.f2070d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2247a(int i) {
        if (m2245k()) {
            if (i == 0) {
                m2242h();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.f2078l.getResources().getDisplayMetrics();
            m2238a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m2243i()) {
                m2246a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2248a(int i, float f) {
        Context context = this.f2078l;
        m2237a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2249a(int i, int i2, int i3, int i4) {
        if (m2245k()) {
            DisplayMetrics displayMetrics = this.f2078l.getResources().getDisplayMetrics();
            m2238a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m2243i()) {
                m2246a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2250a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2078l.obtainStyledAttributes(attributeSet, C0121j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0121j.AppCompatTextView_autoSizeTextType)) {
            this.f2069c = obtainStyledAttributes.getInt(C0121j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0121j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0121j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0121j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0121j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0121j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0121j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0121j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0121j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m2239a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m2245k()) {
            this.f2069c = 0;
            return;
        }
        if (this.f2069c == 1) {
            if (!this.f2075i) {
                DisplayMetrics displayMetrics = this.f2078l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m2238a(dimension2, dimension3, dimension);
            }
            m2243i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2251a(int[] iArr, int i) {
        if (m2245k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2078l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f2074h = m2241a(iArr2);
                if (!m2244j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2075i = false;
            }
            if (m2243i()) {
                m2246a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m2252b() {
        return Math.round(this.f2073g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m2253c() {
        return Math.round(this.f2072f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m2254d() {
        return Math.round(this.f2071e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m2255e() {
        return this.f2074h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m2256f() {
        return this.f2069c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m2257g() {
        return m2245k() && this.f2069c != 0;
    }
}
