package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.systrace.C1550a;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p184i.p197k.C1924a;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: com.facebook.react.modules.fresco.c */
/* loaded from: classes.dex */
public class C1189c extends C1924a {

    /* renamed from: a */
    int f4570a = 0;

    /* renamed from: b */
    Map<String, Pair<Integer, String>> f4571b = new HashMap();

    /* renamed from: c */
    Map<String, Pair<Integer, String>> f4572c = new HashMap();

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5336a(C2023c c2023c, Object obj, String str, boolean z) {
        if (C1550a.m6462b(0L)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f4570a), "FRESCO_REQUEST_" + c2023c.m8249o().toString().replace(':', '_'));
            C1550a.m6455a(0L, (String) create.second, this.f4570a);
            this.f4572c.put(str, create);
            this.f4570a = this.f4570a + 1;
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5337a(C2023c c2023c, String str, Throwable th, boolean z) {
        if (C1550a.m6462b(0L) && this.f4572c.containsKey(str)) {
            Pair<Integer, String> pair = this.f4572c.get(str);
            C1550a.m6463c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4572c.remove(str);
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5338a(C2023c c2023c, String str, boolean z) {
        if (C1550a.m6462b(0L) && this.f4572c.containsKey(str)) {
            Pair<Integer, String> pair = this.f4572c.get(str);
            C1550a.m6463c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4572c.remove(str);
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5339a(String str, String str2) {
        if (C1550a.m6462b(0L)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f4570a), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
            C1550a.m6455a(0L, (String) create.second, this.f4570a);
            this.f4571b.put(str, create);
            this.f4570a = this.f4570a + 1;
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5340a(String str, String str2, String str3) {
        if (C1550a.m6462b(0L)) {
            C1550a.m6457a(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + "_" + str2.replace(':', '_') + "_" + str3.replace(':', '_'), C1550a.a.THREAD);
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5341a(String str, String str2, Throwable th, Map<String, String> map) {
        if (C1550a.m6462b(0L) && this.f4571b.containsKey(str)) {
            Pair<Integer, String> pair = this.f4571b.get(str);
            C1550a.m6463c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4571b.remove(str);
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5342a(String str, String str2, Map<String, String> map) {
        if (C1550a.m6462b(0L) && this.f4571b.containsKey(str)) {
            Pair<Integer, String> pair = this.f4571b.get(str);
            C1550a.m6463c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4571b.remove(str);
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public boolean mo5343a(String str) {
        return false;
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: b */
    public void mo5344b(String str) {
        if (C1550a.m6462b(0L) && this.f4572c.containsKey(str)) {
            Pair<Integer, String> pair = this.f4572c.get(str);
            C1550a.m6463c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4572c.remove(str);
        }
    }

    @Override // p139d.p143b.p184i.p197k.C1924a, p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: b */
    public void mo5345b(String str, String str2, Map<String, String> map) {
        if (C1550a.m6462b(0L) && this.f4571b.containsKey(str)) {
            Pair<Integer, String> pair = this.f4571b.get(str);
            C1550a.m6463c(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4571b.remove(str);
        }
    }
}
