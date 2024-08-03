package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.image.b */
/* loaded from: classes.dex */
public class C1396b extends AbstractC1330c<C1396b> {

    /* renamed from: f */
    private final int f5118f;

    /* renamed from: g */
    private final String f5119g;

    /* renamed from: h */
    private final int f5120h;

    /* renamed from: i */
    private final int f5121i;

    /* renamed from: j */
    private final String f5122j;

    public C1396b(int i, int i2) {
        this(i, i2, null);
    }

    public C1396b(int i, int i2, String str) {
        this(i, i2, str, 0, 0, null);
    }

    public C1396b(int i, int i2, String str, int i3, int i4) {
        this(i, i2, str, i3, i4, null);
    }

    public C1396b(int i, int i2, String str, int i3, int i4, String str2) {
        super(i);
        this.f5118f = i2;
        this.f5119g = str;
        this.f5120h = i3;
        this.f5121i = i4;
        this.f5122j = str2;
    }

    public C1396b(int i, int i2, boolean z, String str) {
        this(i, i2, null, 0, 0, str);
    }

    /* renamed from: b */
    public static String m5993b(int i) {
        if (i == 1) {
            return "topError";
        }
        if (i == 2) {
            return "topLoad";
        }
        if (i == 3) {
            return "topLoadEnd";
        }
        if (i == 4) {
            return "topLoadStart";
        }
        if (i == 5) {
            return "topProgress";
        }
        throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap;
        int i;
        if (this.f5119g != null || (i = this.f5118f) == 2 || i == 1) {
            createMap = Arguments.createMap();
            String str = this.f5119g;
            if (str != null) {
                createMap.putString("uri", str);
            }
            int i2 = this.f5118f;
            if (i2 == 2) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putDouble("width", this.f5120h);
                createMap2.putDouble("height", this.f5121i);
                String str2 = this.f5119g;
                if (str2 != null) {
                    createMap2.putString("url", str2);
                }
                createMap.putMap("source", createMap2);
            } else if (i2 == 1) {
                createMap.putString("error", this.f5122j);
            }
        } else {
            createMap = null;
        }
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return (short) this.f5118f;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return m5993b(this.f5118f);
    }
}
