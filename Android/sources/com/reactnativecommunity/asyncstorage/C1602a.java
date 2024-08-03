package com.reactnativecommunity.asyncstorage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.reactnativecommunity.asyncstorage.a */
/* loaded from: classes.dex */
public class C1602a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6718a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    /* renamed from: a */
    public static String m6719a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (query.moveToFirst()) {
                return query.getString(0);
            }
            return null;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    private static void m6720a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject == null || optJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                m6720a(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m6721a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String m6719a = m6719a(sQLiteDatabase, str);
        if (m6719a != null) {
            JSONObject jSONObject = new JSONObject(m6719a);
            m6720a(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return m6723b(sQLiteDatabase, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String[] m6722a(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    /* renamed from: b */
    static boolean m6723b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }
}
