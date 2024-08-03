package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Arrays;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;
import p139d.p143b.p208m.p210b.C2067a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter;
    private Object[] mLocalArray;
    private ReadableType[] mLocalTypeArray;

    /* renamed from: com.facebook.react.bridge.ReadableNativeArray$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C10901 {
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

    static {
        ReactBridge.staticInit();
        jniPassCounter = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    private native ReadableNativeArray getArrayNative(int i);

    private native boolean getBooleanNative(int i);

    private native double getDoubleNative(int i);

    private native int getIntNative(int i);

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                Object[] importArray = importArray();
                C2038a.m8318a(importArray);
                this.mLocalArray = importArray;
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr != null) {
            return readableTypeArr;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] importTypeArray = importTypeArray();
                C2038a.m8318a(importTypeArray);
                Object[] objArr = importTypeArray;
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    private native ReadableNativeMap getMapNative(int i);

    private native String getStringNative(int i);

    private native ReadableType getTypeNative(int i);

    private native Object[] importArray();

    private native Object[] importTypeArray();

    private native boolean isNullNative(int i);

    public static void setUseNativeAccessor(boolean z) {
        C2067a.f7512b = z;
    }

    private native int sizeNative();

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeArray getArray(int i) {
        if (!C2067a.f7512b) {
            return (ReadableNativeArray) getLocalArray()[i];
        }
        jniPassCounter++;
        return getArrayNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        if (!C2067a.f7512b) {
            return ((Boolean) getLocalArray()[i]).booleanValue();
        }
        jniPassCounter++;
        return getBooleanNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i) {
        if (!C2067a.f7512b) {
            return ((Double) getLocalArray()[i]).doubleValue();
        }
        jniPassCounter++;
        return getDoubleNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i) {
        if (!C2067a.f7512b) {
            return ((Double) getLocalArray()[i]).intValue();
        }
        jniPassCounter++;
        return getIntNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeMap getMap(int i) {
        if (!C2067a.f7512b) {
            return (ReadableNativeMap) getLocalArray()[i];
        }
        jniPassCounter++;
        return getMapNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public String getString(int i) {
        if (!C2067a.f7512b) {
            return (String) getLocalArray()[i];
        }
        jniPassCounter++;
        return getStringNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableType getType(int i) {
        if (!C2067a.f7512b) {
            return getLocalTypeArray()[i];
        }
        jniPassCounter++;
        return getTypeNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i) {
        if (!C2067a.f7512b) {
            return getLocalArray()[i] == null;
        }
        jniPassCounter++;
        return isNullNative(i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        if (!C2067a.f7512b) {
            return getLocalArray().length;
        }
        jniPassCounter++;
        return sizeNative();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (C10901.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(i).ordinal()]) {
                case 1:
                    obj = null;
                    break;
                case 2:
                    obj = Boolean.valueOf(getBoolean(i));
                    break;
                case 3:
                    obj = Double.valueOf(getDouble(i));
                    break;
                case 4:
                    obj = getString(i);
                    break;
                case 5:
                    obj = getMap(i).toHashMap();
                    break;
                case 6:
                    obj = getArray(i).toArrayList();
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i + ".");
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
