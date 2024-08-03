package com.facebook.react.bridge;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Arguments {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.bridge.Arguments$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10622 {
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

    private static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
            return;
        }
        if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
            return;
        }
        if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) makeNativeObject).intValue());
            return;
        }
        if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
            return;
        }
        if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
            return;
        }
        if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (WritableNativeArray) makeNativeObject);
        } else {
            if (makeNativeObject instanceof WritableNativeMap) {
                writableNativeMap.putMap(str, (WritableNativeMap) makeNativeObject);
                return;
            }
            throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
        }
    }

    public static WritableArray createArray() {
        return new WritableNativeArray();
    }

    public static WritableMap createMap() {
        return new WritableNativeMap();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static WritableArray fromArray(Object obj) {
        WritableArray createArray = createArray();
        int i = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                createArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                createArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                createArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            int length4 = ((float[]) obj).length;
            while (i < length4) {
                createArray.pushDouble(r5[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                createArray.pushDouble(dArr[i]);
                i++;
            }
        } else {
            if (!(obj instanceof boolean[])) {
                throw new IllegalArgumentException("Unknown array type " + obj.getClass());
            }
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                createArray.pushBoolean(zArr[i]);
                i++;
            }
        }
        return createArray;
    }

    public static WritableMap fromBundle(Bundle bundle) {
        WritableArray fromArray;
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                createMap.putNull(str);
            } else {
                if (obj.getClass().isArray()) {
                    fromArray = fromArray(obj);
                } else if (obj instanceof String) {
                    createMap.putString(str, (String) obj);
                } else if (obj instanceof Number) {
                    if (obj instanceof Integer) {
                        createMap.putInt(str, ((Integer) obj).intValue());
                    } else {
                        createMap.putDouble(str, ((Number) obj).doubleValue());
                    }
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Bundle) {
                    createMap.putMap(str, fromBundle((Bundle) obj));
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("Could not convert " + obj.getClass());
                    }
                    fromArray = fromList((List) obj);
                }
                createMap.putArray(str, fromArray);
            }
        }
        return createMap;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        double doubleValue;
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else {
                    if (cls == Integer.class) {
                        doubleValue = ((Integer) obj).doubleValue();
                    } else if (cls == Double.class) {
                        doubleValue = ((Double) obj).doubleValue();
                    } else if (cls == Float.class) {
                        doubleValue = ((Float) obj).doubleValue();
                    } else if (cls == String.class) {
                        writableNativeArray.pushString(obj.toString());
                    } else if (cls == WritableNativeMap.class) {
                        writableNativeArray.pushMap((WritableNativeMap) obj);
                    } else {
                        if (cls != WritableNativeArray.class) {
                            throw new RuntimeException("Cannot convert argument of type " + cls);
                        }
                        writableNativeArray.pushArray((WritableNativeArray) obj);
                    }
                    writableNativeArray.pushDouble(doubleValue);
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableArray fromList(List list) {
        WritableArray fromArray;
        WritableArray createArray = createArray();
        for (Object obj : list) {
            if (obj == null) {
                createArray.pushNull();
            } else {
                if (obj.getClass().isArray()) {
                    fromArray = fromArray(obj);
                } else if (obj instanceof Bundle) {
                    createArray.pushMap(fromBundle((Bundle) obj));
                } else if (obj instanceof List) {
                    fromArray = fromList((List) obj);
                } else if (obj instanceof String) {
                    createArray.pushString((String) obj);
                } else if (obj instanceof Integer) {
                    createArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Number) {
                    createArray.pushDouble(((Number) obj).doubleValue());
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Unknown value type " + obj.getClass());
                    }
                    createArray.pushBoolean(((Boolean) obj).booleanValue());
                }
                createArray.pushArray(fromArray);
            }
        }
        return createArray;
    }

    public static <T> WritableNativeArray makeNativeArray(final Object obj) {
        return obj == null ? new WritableNativeArray() : makeNativeArray((List) new AbstractList() { // from class: com.facebook.react.bridge.Arguments.1
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                return Array.get(obj, i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return Array.getLength(obj);
            }
        });
    }

    public static WritableNativeArray makeNativeArray(List list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list == null) {
            return writableNativeArray;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object makeNativeObject = makeNativeObject(it.next());
            if (makeNativeObject == null) {
                writableNativeArray.pushNull();
            } else if (makeNativeObject instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) makeNativeObject).booleanValue());
            } else if (makeNativeObject instanceof Integer) {
                writableNativeArray.pushInt(((Integer) makeNativeObject).intValue());
            } else if (makeNativeObject instanceof Double) {
                writableNativeArray.pushDouble(((Double) makeNativeObject).doubleValue());
            } else if (makeNativeObject instanceof String) {
                writableNativeArray.pushString((String) makeNativeObject);
            } else if (makeNativeObject instanceof WritableNativeArray) {
                writableNativeArray.pushArray((WritableNativeArray) makeNativeObject);
            } else {
                if (!(makeNativeObject instanceof WritableNativeMap)) {
                    throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
                }
                writableNativeArray.pushMap((WritableNativeMap) makeNativeObject);
            }
        }
        return writableNativeArray;
    }

    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle == null) {
            return writableNativeMap;
        }
        for (String str : bundle.keySet()) {
            addEntry(writableNativeMap, str, bundle.get(str));
        }
        return writableNativeMap;
    }

    public static WritableNativeMap makeNativeMap(Map<String, Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map == null) {
            return writableNativeMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            addEntry(writableNativeMap, entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    private static Object makeNativeObject(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) ? Double.valueOf(((Number) obj).doubleValue()) : obj.getClass().isArray() ? makeNativeArray(obj) : obj instanceof List ? makeNativeArray((List) obj) : obj instanceof Map ? makeNativeMap((Map<String, Object>) obj) : obj instanceof Bundle ? makeNativeMap((Bundle) obj) : obj;
    }

    public static Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (C10622.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    bundle.putString(nextKey, null);
                    break;
                case 2:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
        }
        return bundle;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001c. Please report as an issue. */
    public static ArrayList toList(ReadableArray readableArray) {
        Object valueOf;
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (C10622.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(null);
                case 2:
                    valueOf = Boolean.valueOf(readableArray.getBoolean(i));
                    arrayList.add(valueOf);
                case 3:
                    double d2 = readableArray.getDouble(i);
                    valueOf = d2 == Math.rint(d2) ? Integer.valueOf((int) d2) : Double.valueOf(d2);
                    arrayList.add(valueOf);
                case 4:
                    valueOf = readableArray.getString(i);
                    arrayList.add(valueOf);
                case 5:
                    valueOf = toBundle(readableArray.getMap(i));
                    arrayList.add(valueOf);
                case 6:
                    valueOf = toList(readableArray.getArray(i));
                    arrayList.add(valueOf);
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }
}
