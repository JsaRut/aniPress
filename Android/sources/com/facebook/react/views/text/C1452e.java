package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.views.text.e */
/* loaded from: classes.dex */
public class C1452e {
    /* renamed from: a */
    public static WritableArray m6143a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        textPaint2.getTextBounds("T", 0, 1, new Rect());
        double height = (r13.height() / 100.0f) / displayMetrics.density;
        textPaint2.getTextBounds("x", 0, 1, new Rect());
        double height2 = (r13.height() / 100.0f) / displayMetrics.density;
        for (int i = 0; i < layout.getLineCount(); i++) {
            layout.getLineBounds(i, new Rect());
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", layout.getLineLeft(i) / displayMetrics.density);
            createMap.putDouble("y", r13.top / displayMetrics.density);
            createMap.putDouble("width", layout.getLineWidth(i) / displayMetrics.density);
            createMap.putDouble("height", r13.height() / displayMetrics.density);
            createMap.putDouble("descender", layout.getLineDescent(i) / displayMetrics.density);
            createMap.putDouble("ascender", (-layout.getLineAscent(i)) / displayMetrics.density);
            createMap.putDouble("baseline", layout.getLineBaseline(i) / displayMetrics.density);
            createMap.putDouble("capHeight", height);
            createMap.putDouble("xHeight", height2);
            createMap.putString("text", charSequence.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
