package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;

/* renamed from: com.facebook.react.views.art.f */
/* loaded from: classes.dex */
public class C1383f extends C1379b {

    /* renamed from: H */
    private ReadableMap f5103H;

    /* renamed from: I */
    private int f5104I = 0;

    /* renamed from: a */
    private void m5973a(Paint paint) {
        Paint.Align align;
        ReadableMap readableMap;
        ReadableMap map;
        int i = this.f5104I;
        int i2 = 2;
        if (i == 0) {
            align = Paint.Align.LEFT;
        } else {
            if (i != 1) {
                if (i == 2) {
                    align = Paint.Align.CENTER;
                }
                readableMap = this.f5103H;
                if (readableMap == null && readableMap.hasKey("font") && (map = this.f5103H.getMap("font")) != null) {
                    paint.setTextSize((map.hasKey("fontSize") ? (float) map.getDouble("fontSize") : 12.0f) * this.f5109z);
                    boolean z = map.hasKey("fontWeight") && "bold".equals(map.getString("fontWeight"));
                    boolean z2 = map.hasKey("fontStyle") && "italic".equals(map.getString("fontStyle"));
                    if (z && z2) {
                        i2 = 3;
                    } else if (z) {
                        i2 = 1;
                    } else if (!z2) {
                        i2 = 0;
                    }
                    paint.setTypeface(Typeface.create(map.getString("fontFamily"), i2));
                    return;
                }
                return;
            }
            align = Paint.Align.RIGHT;
        }
        paint.setTextAlign(align);
        readableMap = this.f5103H;
        if (readableMap == null) {
        }
    }

    @Override // com.facebook.react.views.art.C1379b, com.facebook.react.views.art.AbstractC1384g
    /* renamed from: a */
    public void mo5966a(Canvas canvas, Paint paint, float f) {
        ReadableArray array;
        ReadableMap readableMap = this.f5103H;
        if (readableMap == null) {
            return;
        }
        float f2 = f * this.f5107x;
        if (f2 > 0.01f && readableMap.hasKey("lines") && (array = this.f5103H.getArray("lines")) != null && array.size() != 0) {
            m5976b(canvas);
            String[] strArr = new String[array.size()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = array.getString(i);
            }
            String join = TextUtils.join("\n", strArr);
            if (m5970b(paint, f2)) {
                m5973a(paint);
                Path path = this.f5094A;
                if (path == null) {
                    canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                } else {
                    canvas.drawTextOnPath(join, path, 0.0f, 0.0f, paint);
                }
            }
            if (m5969a(paint, f2)) {
                m5973a(paint);
                Path path2 = this.f5094A;
                if (path2 == null) {
                    canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                } else {
                    canvas.drawTextOnPath(join, path2, 0.0f, 0.0f, paint);
                }
            }
            m5975a(canvas);
            mo5489b();
        }
    }

    @InterfaceC1294a(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.f5104I = i;
    }

    @InterfaceC1294a(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.f5103H = readableMap;
    }
}
