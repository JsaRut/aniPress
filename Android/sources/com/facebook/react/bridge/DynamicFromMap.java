package com.facebook.react.bridge;

import android.support.v4.util.Pools$SimplePool;

/* loaded from: classes.dex */
public class DynamicFromMap implements Dynamic {
    private static final ThreadLocal<Pools$SimplePool<DynamicFromMap>> sPool = new ThreadLocal<Pools$SimplePool<DynamicFromMap>>() { // from class: com.facebook.react.bridge.DynamicFromMap.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Pools$SimplePool<DynamicFromMap> initialValue() {
            return new Pools$SimplePool<>(10);
        }
    };
    private ReadableMap mMap;
    private String mName;

    private DynamicFromMap() {
    }

    public static DynamicFromMap create(ReadableMap readableMap, String str) {
        DynamicFromMap mo1326a = sPool.get().mo1326a();
        if (mo1326a == null) {
            mo1326a = new DynamicFromMap();
        }
        mo1326a.mMap = readableMap;
        mo1326a.mName = str;
        return mo1326a;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getArray(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getBoolean(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getDouble(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getInt(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getMap(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getString(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getType(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap == null || (str = this.mName) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.isNull(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.mMap = null;
        this.mName = null;
        sPool.get().mo1327a(this);
    }
}
