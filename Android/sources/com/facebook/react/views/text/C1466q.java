package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.yoga.C1553a;
import com.facebook.yoga.C1554b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import p139d.p143b.p204k.p205a.C2038a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.text.q */
/* loaded from: classes.dex */
public class C1466q implements YogaMeasureFunction {

    /* renamed from: a */
    final /* synthetic */ C1467r f5391a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1466q(C1467r c1467r) {
        this.f5391a = c1467r;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        TextPaint textPaint;
        Spannable spannable;
        int m6169O;
        StaticLayout.Builder hyphenationFrequency;
        Layout staticLayout;
        boolean z;
        int width;
        int height;
        TextPaint textPaint2;
        textPaint = C1467r.f5392S;
        textPaint.setTextSize(this.f5391a.f5377w.m6224b());
        spannable = this.f5391a.f5393T;
        C2038a.m8319a(spannable, "Spannable element has not been prepared in onBeforeLayout");
        Spannable spannable2 = spannable;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable2, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spannable2, textPaint) : Float.NaN;
        boolean z2 = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        m6169O = this.f5391a.m6169O();
        if (m6169O == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (m6169O == 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (m6169O == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (isBoring == null && (z2 || (!C1553a.m6544a(desiredWidth) && desiredWidth <= f))) {
            int ceil = (int) Math.ceil(desiredWidth);
            if (Build.VERSION.SDK_INT < 23) {
                staticLayout = new StaticLayout(spannable2, textPaint, ceil, alignment2, 1.0f, 0.0f, this.f5391a.f5371M);
            } else {
                hyphenationFrequency = StaticLayout.Builder.obtain(spannable2, 0, spannable2.length(), textPaint, ceil).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f5391a.f5371M).setBreakStrategy(this.f5391a.f5362D).setHyphenationFrequency(1);
                if (Build.VERSION.SDK_INT >= 26) {
                    hyphenationFrequency.setJustificationMode(this.f5391a.f5363E);
                }
                staticLayout = hyphenationFrequency.build();
            }
        } else if (isBoring != null && (z2 || isBoring.width <= f)) {
            staticLayout = BoringLayout.make(spannable2, textPaint, isBoring.width, alignment2, 1.0f, 0.0f, isBoring, this.f5391a.f5371M);
        } else if (Build.VERSION.SDK_INT < 23) {
            staticLayout = new StaticLayout(spannable2, textPaint, (int) f, alignment2, 1.0f, 0.0f, this.f5391a.f5371M);
        } else {
            hyphenationFrequency = StaticLayout.Builder.obtain(spannable2, 0, spannable2.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f5391a.f5371M).setBreakStrategy(this.f5391a.f5362D).setHyphenationFrequency(1);
            staticLayout = hyphenationFrequency.build();
        }
        z = this.f5391a.f5394U;
        if (z) {
            textPaint2 = C1467r.f5392S;
            WritableArray m6143a = C1452e.m6143a(spannable2, staticLayout, textPaint2, this.f5391a.mo5513p());
            WritableMap createMap = Arguments.createMap();
            createMap.putArray("lines", m6143a);
            ((RCTEventEmitter) this.f5391a.mo5513p().getJSModule(RCTEventEmitter.class)).receiveEvent(this.f5391a.mo5504g(), "topTextLayout", createMap);
        }
        int i = this.f5391a.f5360B;
        if (i == -1 || i >= staticLayout.getLineCount()) {
            width = staticLayout.getWidth();
            height = staticLayout.getHeight();
        } else {
            width = staticLayout.getWidth();
            height = staticLayout.getLineBottom(this.f5391a.f5360B - 1);
        }
        return C1554b.m6546a(width, height);
    }
}
