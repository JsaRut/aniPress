package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.react.animated.P */
/* loaded from: classes.dex */
public class C1033P extends AbstractC1036b {

    /* renamed from: e */
    private final C1024H f4266e;

    /* renamed from: f */
    private final List<c> f4267f;

    /* renamed from: com.facebook.react.animated.P$a */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: c */
        public int f4268c;

        private a() {
            super();
        }

        /* synthetic */ a(C1033P c1033p, C1032O c1032o) {
            this();
        }
    }

    /* renamed from: com.facebook.react.animated.P$b */
    /* loaded from: classes.dex */
    public class b extends c {

        /* renamed from: c */
        public double f4270c;

        private b() {
            super();
        }

        /* synthetic */ b(C1033P c1033p, C1032O c1032o) {
            this();
        }
    }

    /* renamed from: com.facebook.react.animated.P$c */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a */
        public String f4272a;

        private c() {
        }

        /* synthetic */ c(C1033P c1033p, C1032O c1032o) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.facebook.react.animated.P$c, com.facebook.react.animated.P$b] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.react.animated.P$c, com.facebook.react.animated.P$a] */
    public C1033P(ReadableMap readableMap, C1024H c1024h) {
        ?? bVar;
        ReadableArray array = readableMap.getArray("transforms");
        this.f4267f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                bVar = new a();
                bVar.f4272a = string;
                bVar.f4268c = map.getInt("nodeTag");
            } else {
                bVar = new b();
                bVar.f4272a = string;
                bVar.f4270c = map.getDouble("value");
            }
            this.f4267f.add(bVar);
        }
        this.f4266e = c1024h;
    }

    /* renamed from: a */
    public void m5143a(JavaOnlyMap javaOnlyMap) {
        double d2;
        ArrayList arrayList = new ArrayList(this.f4267f.size());
        for (c cVar : this.f4267f) {
            if (cVar instanceof a) {
                AbstractC1036b m5126d = this.f4266e.m5126d(((a) cVar).f4268c);
                if (m5126d == null) {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                }
                if (!(m5126d instanceof C1034Q)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + m5126d.getClass());
                }
                d2 = ((C1034Q) m5126d).m5147d();
            } else {
                d2 = ((b) cVar).f4270c;
            }
            arrayList.add(JavaOnlyMap.m5161of(cVar.f4272a, Double.valueOf(d2)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
