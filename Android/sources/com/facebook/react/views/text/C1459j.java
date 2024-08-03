package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.views.text.j */
/* loaded from: classes.dex */
public class C1459j {

    /* renamed from: a */
    private static final String[] f5384a = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: b */
    private static final String[] f5385b = {".ttf", ".otf"};

    /* renamed from: c */
    private static C1459j f5386c;

    /* renamed from: d */
    private Map<String, a> f5387d = new HashMap();

    /* renamed from: com.facebook.react.views.text.j$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        private SparseArray<Typeface> f5388a;

        private a() {
            this.f5388a = new SparseArray<>(4);
        }

        /* renamed from: a */
        public Typeface m6164a(int i) {
            return this.f5388a.get(i);
        }

        /* renamed from: a */
        public void m6165a(int i, Typeface typeface) {
            this.f5388a.put(i, typeface);
        }
    }

    private C1459j() {
    }

    /* renamed from: a */
    public static C1459j m6161a() {
        if (f5386c == null) {
            f5386c = new C1459j();
        }
        return f5386c;
    }

    /* renamed from: b */
    private static Typeface m6162b(String str, int i, AssetManager assetManager) {
        String str2 = f5384a[i];
        for (String str3 : f5385b) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i);
    }

    /* renamed from: a */
    public Typeface m6163a(String str, int i, AssetManager assetManager) {
        a aVar = this.f5387d.get(str);
        if (aVar == null) {
            aVar = new a();
            this.f5387d.put(str, aVar);
        }
        Typeface m6164a = aVar.m6164a(i);
        if (m6164a == null && (m6164a = m6162b(str, i, assetManager)) != null) {
            aVar.m6165a(i, m6164a);
        }
        return m6164a;
    }
}
