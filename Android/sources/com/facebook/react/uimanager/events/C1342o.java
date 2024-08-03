package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1374w;

/* renamed from: com.facebook.react.uimanager.events.o */
/* loaded from: classes.dex */
public class C1342o {
    /* renamed from: a */
    private static WritableArray m5774a(int i, C1338k c1338k) {
        WritableArray createArray = Arguments.createArray();
        MotionEvent m5765j = c1338k.m5765j();
        float x = m5765j.getX() - c1338k.m5766k();
        float y = m5765j.getY() - c1338k.m5767l();
        for (int i2 = 0; i2 < m5765j.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", C1374w.m5957a(m5765j.getX(i2)));
            createMap.putDouble("pageY", C1374w.m5957a(m5765j.getY(i2)));
            float x2 = m5765j.getX(i2) - x;
            float y2 = m5765j.getY(i2) - y;
            createMap.putDouble("locationX", C1374w.m5957a(x2));
            createMap.putDouble("locationY", C1374w.m5957a(y2));
            createMap.putInt("target", i);
            createMap.putDouble("timestamp", c1338k.m5721e());
            createMap.putDouble("identifier", m5765j.getPointerId(i2));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    /* renamed from: a */
    public static void m5775a(RCTEventEmitter rCTEventEmitter, EnumC1341n enumC1341n, int i, C1338k c1338k) {
        WritableArray m5774a = m5774a(i, c1338k);
        MotionEvent m5765j = c1338k.m5765j();
        WritableArray createArray = Arguments.createArray();
        if (enumC1341n == EnumC1341n.MOVE || enumC1341n == EnumC1341n.CANCEL) {
            for (int i2 = 0; i2 < m5765j.getPointerCount(); i2++) {
                createArray.pushInt(i2);
            }
        } else {
            if (enumC1341n != EnumC1341n.START && enumC1341n != EnumC1341n.END) {
                throw new RuntimeException("Unknown touch type: " + enumC1341n);
            }
            createArray.pushInt(m5765j.getActionIndex());
        }
        rCTEventEmitter.receiveTouches(EnumC1341n.m5773a(enumC1341n), m5774a, createArray);
    }
}
