package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.uimanager.C1271G;
import com.facebook.react.uimanager.C1374w;
import com.facebook.yoga.C1553a;
import com.facebook.yoga.C1554b;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.react.views.text.A */
/* loaded from: classes.dex */
public class C1445A {

    /* renamed from: a */
    private static final TextPaint f5323a = new TextPaint(1);

    /* renamed from: b */
    private static final Object f5324b = new Object();

    /* renamed from: c */
    private static LruCache<String, Spannable> f5325c = new LruCache<>(100);

    /* renamed from: com.facebook.react.views.text.A$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        protected int f5326a;

        /* renamed from: b */
        protected int f5327b;

        /* renamed from: c */
        protected InterfaceC1462m f5328c;

        a(int i, int i2, InterfaceC1462m interfaceC1462m) {
            this.f5326a = i;
            this.f5327b = i2;
            this.f5328c = interfaceC1462m;
        }

        /* renamed from: a */
        public void m6134a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.f5328c, this.f5326a, this.f5327b, ((i << 16) & 16711680) | ((this.f5326a == 0 ? 18 : 34) & (-16711681)));
        }
    }

    /* renamed from: a */
    public static long m6130a(ReactContext reactContext, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        StaticLayout.Builder obtain;
        Layout staticLayout;
        TextPaint textPaint = f5323a;
        Spannable m6131a = m6131a(reactContext, readableNativeMap);
        if (m6131a == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(m6131a, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(m6131a, textPaint) : Float.NaN;
        boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
        if (isBoring == null && (z || (!C1553a.m6544a(desiredWidth) && desiredWidth <= f))) {
            int ceil = (int) Math.ceil(desiredWidth);
            if (Build.VERSION.SDK_INT < 23) {
                staticLayout = new StaticLayout(m6131a, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            } else {
                obtain = StaticLayout.Builder.obtain(m6131a, 0, m6131a.length(), textPaint, ceil);
                staticLayout = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
            }
        } else if (isBoring != null && (z || isBoring.width <= f)) {
            staticLayout = BoringLayout.make(m6131a, textPaint, isBoring.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, isBoring, true);
        } else if (Build.VERSION.SDK_INT < 23) {
            staticLayout = new StaticLayout(m6131a, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        } else {
            obtain = StaticLayout.Builder.obtain(m6131a, 0, m6131a.length(), textPaint, (int) f);
            staticLayout = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
        }
        int i = readableNativeMap2.hasKey("maximumNumberOfLines") ? readableNativeMap2.getInt("maximumNumberOfLines") : -1;
        return C1554b.m6545a(C1374w.m5961d(staticLayout.getWidth()), C1374w.m5961d((i == -1 || i == 0 || i >= staticLayout.getLineCount()) ? staticLayout.getHeight() : staticLayout.getLineBottom(i - 1)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static Spannable m6131a(Context context, ReadableMap readableMap) {
        String obj = readableMap.toString();
        synchronized (f5324b) {
            Spannable spannable = f5325c.get(obj);
            if (spannable != null) {
                return spannable;
            }
            Spannable m6133b = m6133b(context, readableMap);
            synchronized (f5324b) {
                f5325c.put(obj, m6133b);
            }
            return m6133b;
        }
    }

    /* renamed from: a */
    private static void m6132a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            int length = spannableStringBuilder.length();
            C1473x c1473x = new C1473x(new C1271G(map.getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) EnumC1447C.m6136a(map.getString("string"), c1473x.f5437p));
            int length2 = spannableStringBuilder.length();
            if (length2 >= length) {
                if (c1473x.f5424c) {
                    list.add(new a(length, length2, new C1460k(c1473x.f5426e)));
                }
                if (c1473x.f5427f) {
                    list.add(new a(length, length2, new C1456g(c1473x.f5428g)));
                }
                if (Build.VERSION.SDK_INT >= 21 && !Float.isNaN(c1473x.f5423b)) {
                    list.add(new a(length, length2, new C1448a(c1473x.f5423b)));
                }
                list.add(new a(length, length2, new C1453f(c1473x.f5430i)));
                if (c1473x.f5445x != -1 || c1473x.f5446y != -1 || c1473x.f5447z != null) {
                    list.add(new a(length, length2, new C1450c(c1473x.f5445x, c1473x.f5446y, c1473x.f5447z, context.getAssets())));
                }
                if (c1473x.f5442u) {
                    list.add(new a(length, length2, new C1470u()));
                }
                if (c1473x.f5443v) {
                    list.add(new a(length, length2, new C1463n()));
                }
                if (c1473x.f5438q != 0.0f || c1473x.f5439r != 0.0f) {
                    list.add(new a(length, length2, new C1472w(c1473x.f5438q, c1473x.f5439r, c1473x.f5440s, c1473x.f5441t)));
                }
                if (!Float.isNaN(c1473x.m6202b())) {
                    list.add(new a(length, length2, new C1449b(c1473x.m6202b())));
                }
                list.add(new a(length, length2, new C1464o(map.getInt("reactTag"))));
            }
        }
    }

    /* renamed from: b */
    private static Spannable m6133b(Context context, ReadableMap readableMap) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        m6132a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((a) it.next()).m6134a(spannableStringBuilder, i);
            i++;
        }
        return spannableStringBuilder;
    }
}
