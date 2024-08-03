package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import p139d.p143b.p169g.p178e.C1804t;

/* renamed from: com.facebook.react.views.image.d */
/* loaded from: classes.dex */
public class C1398d {
    /* renamed from: a */
    public static Shader.TileMode m5994a() {
        return Shader.TileMode.CLAMP;
    }

    /* renamed from: a */
    public static C1804t.b m5995a(String str) {
        if ("contain".equals(str)) {
            return C1804t.b.f6646c;
        }
        if ("cover".equals(str)) {
            return C1804t.b.f6650g;
        }
        if ("stretch".equals(str)) {
            return C1804t.b.f6644a;
        }
        if ("center".equals(str)) {
            return C1804t.b.f6649f;
        }
        if ("repeat".equals(str)) {
            return C1402h.f5163a;
        }
        if (str == null) {
            return m5997b();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    /* renamed from: b */
    public static Shader.TileMode m5996b(String str) {
        if ("contain".equals(str) || "cover".equals(str) || "stretch".equals(str) || "center".equals(str)) {
            return Shader.TileMode.CLAMP;
        }
        if ("repeat".equals(str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str == null) {
            return m5994a();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    /* renamed from: b */
    public static C1804t.b m5997b() {
        return C1804t.b.f6650g;
    }
}
