package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.HashMap;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;
import p139d.p143b.p208m.p210b.C2067a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static int mJniCallCounter;
    private String[] mKeys;
    private HashMap<String, Object> mLocalMap;
    private HashMap<String, ReadableType> mLocalTypeMap;

    /* renamed from: com.facebook.react.bridge.ReadableNativeMap$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10911 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType = new int[ReadableType.values().length];

        static {
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @InterfaceC2039a
    /* loaded from: classes.dex */
    public static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {

        @InterfaceC2039a
        private final HybridData mHybridData;

        @InterfaceC2039a
        private final ReadableNativeMap mMap;

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mMap = readableNativeMap;
            this.mHybridData = initHybrid(readableNativeMap);
        }

        private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public native boolean hasNextKey();

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public native String nextKey();
    }

    static {
        ReactBridge.staticInit();
    }

    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    private void checkInstance(String str, Object obj, Class cls) {
        if (obj == null || cls.isInstance(obj)) {
            return;
        }
        throw new ClassCastException("Value for " + str + " cannot be cast from " + obj.getClass().getSimpleName() + " to " + cls.getSimpleName());
    }

    private native ReadableNativeArray getArrayNative(String str);

    private native boolean getBooleanNative(String str);

    private native double getDoubleNative(String str);

    private native int getIntNative(String str);

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private HashMap<String, Object> getLocalMap() {
        HashMap<String, Object> hashMap = this.mLocalMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                String[] importKeys = importKeys();
                C2038a.m8318a(importKeys);
                this.mKeys = importKeys;
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] importValues = importValues();
                C2038a.m8318a(importValues);
                Object[] objArr = importValues;
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private HashMap<String, ReadableType> getLocalTypeMap() {
        HashMap<String, ReadableType> hashMap = this.mLocalTypeMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                String[] importKeys = importKeys();
                C2038a.m8318a(importKeys);
                this.mKeys = importKeys;
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] importTypes = importTypes();
                C2038a.m8318a(importTypes);
                Object[] objArr = importTypes;
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalTypeMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    private native ReadableNativeMap getMapNative(String str);

    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    private <T> T getNullableValue(String str, Class<T> cls) {
        T t = (T) getNullableValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    private native String getStringNative(String str);

    private native ReadableType getTypeNative(String str);

    private Object getValue(String str) {
        if (!hasKey(str) || isNull(str)) {
            throw new NoSuchKeyException(str);
        }
        Object obj = getLocalMap().get(str);
        C2038a.m8318a(obj);
        return obj;
    }

    private <T> T getValue(String str, Class<T> cls) {
        T t = (T) getValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    private native boolean hasKeyNative(String str);

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    private native boolean isNullNative(String str);

    public static void setUseNativeAccessor(boolean z) {
        C2067a.f7513c = z;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String str) {
        if (!C2067a.f7513c) {
            return (ReadableArray) getNullableValue(str, ReadableArray.class);
        }
        mJniCallCounter++;
        return getArrayNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        if (!C2067a.f7513c) {
            return ((Boolean) getValue(str, Boolean.class)).booleanValue();
        }
        mJniCallCounter++;
        return getBooleanNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String str) {
        if (!C2067a.f7513c) {
            return ((Double) getValue(str, Double.class)).doubleValue();
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String str) {
        if (!C2067a.f7513c) {
            return ((Double) getValue(str, Double.class)).intValue();
        }
        mJniCallCounter++;
        return getIntNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableNativeMap getMap(String str) {
        if (!C2067a.f7513c) {
            return (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
        }
        mJniCallCounter++;
        return getMapNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String str) {
        if (!C2067a.f7513c) {
            return (String) getNullableValue(str, String.class);
        }
        mJniCallCounter++;
        return getStringNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String str) {
        if (C2067a.f7513c) {
            mJniCallCounter++;
            return getTypeNative(str);
        }
        if (!getLocalTypeMap().containsKey(str)) {
            throw new NoSuchKeyException(str);
        }
        ReadableType readableType = getLocalTypeMap().get(str);
        C2038a.m8318a(readableType);
        return readableType;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        if (!C2067a.f7513c) {
            return getLocalMap().containsKey(str);
        }
        mJniCallCounter++;
        return hasKeyNative(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String str) {
        if (C2067a.f7513c) {
            mJniCallCounter++;
            return isNullNative(str);
        }
        if (getLocalMap().containsKey(str)) {
            return getLocalMap().get(str) == null;
        }
        throw new NoSuchKeyException(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00b0. Please report as an issue. */
    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        Object hashMap;
        Object obj;
        if (!C2067a.f7513c) {
            HashMap<String, Object> hashMap2 = new HashMap<>(getLocalMap());
            for (String str : hashMap2.keySet()) {
                switch (C10911.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(str).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        ReadableNativeMap map = getMap(str);
                        C2038a.m8318a(map);
                        hashMap = map.toHashMap();
                        hashMap2.put(str, hashMap);
                    case 6:
                        ReadableArray array = getArray(str);
                        C2038a.m8318a(array);
                        hashMap = array.toArrayList();
                        hashMap2.put(str, hashMap);
                    default:
                        throw new IllegalArgumentException("Could not convert object with key: " + str + ".");
                }
            }
            return hashMap2;
        }
        ReadableMapKeySetIterator keySetIterator = keySetIterator();
        HashMap<String, Object> hashMap3 = new HashMap<>();
        while (keySetIterator.hasNextKey()) {
            mJniCallCounter++;
            String nextKey = keySetIterator.nextKey();
            mJniCallCounter++;
            switch (C10911.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(nextKey).ordinal()]) {
                case 1:
                    obj = null;
                    break;
                case 2:
                    obj = Boolean.valueOf(getBoolean(nextKey));
                    break;
                case 3:
                    obj = Double.valueOf(getDouble(nextKey));
                    break;
                case 4:
                    obj = getString(nextKey);
                    break;
                case 5:
                    ReadableNativeMap map2 = getMap(nextKey);
                    C2038a.m8318a(map2);
                    obj = map2.toHashMap();
                    break;
                case 6:
                    ReadableArray array2 = getArray(nextKey);
                    C2038a.m8318a(array2);
                    obj = array2.toArrayList();
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
            hashMap3.put(nextKey, obj);
        }
        return hashMap3;
    }
}
