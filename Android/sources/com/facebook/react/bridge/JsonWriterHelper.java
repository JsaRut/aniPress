package com.facebook.react.bridge;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class JsonWriterHelper {
    JsonWriterHelper() {
    }

    private static void listValue(JsonWriter jsonWriter, List<?> list) {
        jsonWriter.beginArray();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            objectValue(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }

    private static void mapValue(JsonWriter jsonWriter, Map<?, ?> map) {
        jsonWriter.beginObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            jsonWriter.name(entry.getKey().toString());
            value(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }

    private static void objectValue(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else {
            if (obj instanceof Boolean) {
                jsonWriter.value(((Boolean) obj).booleanValue());
                return;
            }
            throw new IllegalArgumentException("Unknown value: " + obj);
        }
    }

    public static void value(JsonWriter jsonWriter, Object obj) {
        if (obj instanceof Map) {
            mapValue(jsonWriter, (Map) obj);
        } else if (obj instanceof List) {
            listValue(jsonWriter, (List) obj);
        } else {
            objectValue(jsonWriter, obj);
        }
    }
}
