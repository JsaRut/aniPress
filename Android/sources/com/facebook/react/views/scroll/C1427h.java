package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1374w;
import java.util.Map;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.views.scroll.h */
/* loaded from: classes.dex */
public class C1427h {

    /* renamed from: com.facebook.react.views.scroll.h$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, b bVar);

        void scrollToEnd(T t, c cVar);
    }

    /* renamed from: com.facebook.react.views.scroll.h$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f5271a;

        /* renamed from: b */
        public final int f5272b;

        /* renamed from: c */
        public final boolean f5273c;

        b(int i, int i2, boolean z) {
            this.f5271a = i;
            this.f5272b = i2;
            this.f5273c = z;
        }
    }

    /* renamed from: com.facebook.react.views.scroll.h$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final boolean f5274a;

        c(boolean z) {
            this.f5274a = z;
        }
    }

    /* renamed from: a */
    public static Map<String, Integer> m6092a() {
        return C1104f.m5178a("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    /* renamed from: a */
    public static <T> void m6093a(a<T> aVar, T t, int i, ReadableArray readableArray) {
        C2038a.m8318a(aVar);
        C2038a.m8318a(t);
        C2038a.m8318a(readableArray);
        if (i == 1) {
            aVar.scrollTo(t, new b(Math.round(C1374w.m5956a(readableArray.getDouble(0))), Math.round(C1374w.m5956a(readableArray.getDouble(1))), readableArray.getBoolean(2)));
        } else if (i == 2) {
            aVar.scrollToEnd(t, new c(readableArray.getBoolean(0)));
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), aVar.getClass().getSimpleName()));
            }
            aVar.flashScrollIndicators(t);
        }
    }
}
