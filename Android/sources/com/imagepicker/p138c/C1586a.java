package com.imagepicker.p138c;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.imagepicker.c.a */
/* loaded from: classes.dex */
public class C1586a {

    /* renamed from: a */
    public final a f5992a;

    /* renamed from: b */
    public final a f5993b;

    /* renamed from: c */
    public final a f5994c;

    /* renamed from: d */
    public final List<a> f5995d;

    /* renamed from: com.imagepicker.c.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final String f5996a;

        /* renamed from: b */
        public final String f5997b;

        public a(String str, String str2) {
            this.f5996a = str;
            this.f5997b = str2;
        }
    }

    public C1586a(a aVar, a aVar2, a aVar3, LinkedList<a> linkedList) {
        this.f5992a = aVar;
        this.f5993b = aVar2;
        this.f5994c = aVar3;
        this.f5995d = linkedList;
    }

    /* renamed from: a */
    private static a m6674a(ReadableMap readableMap, String str, String str2) {
        if (C1589d.m6686a(readableMap, str)) {
            return new a(readableMap.getString(str), str2);
        }
        return null;
    }

    /* renamed from: a */
    public static C1586a m6675a(ReadableMap readableMap) {
        return new C1586a(m6674a(readableMap, "takePhotoButtonTitle", "photo"), m6674a(readableMap, "chooseFromLibraryButtonTitle", "library"), m6674a(readableMap, "cancelButtonTitle", "cancel"), m6676b(readableMap));
    }

    /* renamed from: b */
    private static LinkedList<a> m6676b(ReadableMap readableMap) {
        LinkedList<a> linkedList = new LinkedList<>();
        if (!readableMap.hasKey("customButtons")) {
            return linkedList;
        }
        ReadableArray array = readableMap.getArray("customButtons");
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            linkedList.add(new a(map.getString("title"), map.getString("name")));
        }
        return linkedList;
    }

    /* renamed from: a */
    public List<String> m6677a() {
        LinkedList linkedList = new LinkedList();
        a aVar = this.f5992a;
        if (aVar != null) {
            linkedList.add(aVar.f5997b);
        }
        a aVar2 = this.f5993b;
        if (aVar2 != null) {
            linkedList.add(aVar2.f5997b);
        }
        for (int i = 0; i < this.f5995d.size(); i++) {
            linkedList.add(this.f5995d.get(i).f5997b);
        }
        return linkedList;
    }

    /* renamed from: b */
    public List<String> m6678b() {
        LinkedList linkedList = new LinkedList();
        a aVar = this.f5992a;
        if (aVar != null) {
            linkedList.add(aVar.f5996a);
        }
        a aVar2 = this.f5993b;
        if (aVar2 != null) {
            linkedList.add(aVar2.f5996a);
        }
        for (int i = 0; i < this.f5995d.size(); i++) {
            linkedList.add(this.f5995d.get(i).f5996a);
        }
        return linkedList;
    }
}
