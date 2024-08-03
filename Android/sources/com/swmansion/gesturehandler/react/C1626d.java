package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import p139d.p273d.p274a.C2686c;
import p139d.p273d.p274a.InterfaceC2687d;

/* renamed from: com.swmansion.gesturehandler.react.d */
/* loaded from: classes.dex */
public class C1626d implements InterfaceC2687d {

    /* renamed from: a */
    private SparseArray<int[]> f6056a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<int[]> f6057b = new SparseArray<>();

    /* renamed from: a */
    private int[] m6766a(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int[] iArr = new int[array.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    /* renamed from: a */
    public void m6767a() {
        this.f6056a.clear();
        this.f6057b.clear();
    }

    /* renamed from: a */
    public void m6768a(int i) {
        this.f6056a.remove(i);
        this.f6057b.remove(i);
    }

    /* renamed from: a */
    public void m6769a(C2686c c2686c, ReadableMap readableMap) {
        c2686c.m11509a(this);
        if (readableMap.hasKey("waitFor")) {
            this.f6056a.put(c2686c.m11538l(), m6766a(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f6057b.put(c2686c.m11538l(), m6766a(readableMap, "simultaneousHandlers"));
        }
    }

    @Override // p139d.p273d.p274a.InterfaceC2687d
    /* renamed from: a */
    public boolean mo6770a(C2686c c2686c, C2686c c2686c2) {
        return false;
    }

    @Override // p139d.p273d.p274a.InterfaceC2687d
    /* renamed from: b */
    public boolean mo6771b(C2686c c2686c, C2686c c2686c2) {
        int[] iArr = this.f6057b.get(c2686c.m11538l());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == c2686c2.m11538l()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p139d.p273d.p274a.InterfaceC2687d
    /* renamed from: c */
    public boolean mo6772c(C2686c c2686c, C2686c c2686c2) {
        int[] iArr = this.f6056a.get(c2686c.m11538l());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == c2686c2.m11538l()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p139d.p273d.p274a.InterfaceC2687d
    /* renamed from: d */
    public boolean mo6773d(C2686c c2686c, C2686c c2686c2) {
        return false;
    }
}
