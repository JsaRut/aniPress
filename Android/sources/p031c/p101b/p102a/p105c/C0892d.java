package p031c.p101b.p102a.p105c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.c.d */
/* loaded from: classes.dex */
public class C0892d extends AbstractC0895g {

    /* renamed from: l */
    private static volatile C0892d f3785l;

    /* renamed from: k */
    private static final String[] f3784k = {"_id", "ln_id", "ln_count", "ln_remove", "ln_type", "ln_extra", "ln_trigger_time", "ln_add_time"};

    /* renamed from: m */
    private static final Object f3786m = new Object();

    private C0892d(Context context) {
        super(context, "jpush_local_notification.db", null, 1);
    }

    /* renamed from: a */
    public static C0892d m4388a(Context context) {
        if (f3785l == null) {
            synchronized (f3786m) {
                if (f3785l == null) {
                    f3785l = new C0892d(context.getApplicationContext());
                }
            }
        }
        return f3785l;
    }

    /* renamed from: a */
    public static C0893e m4389a(Cursor cursor) {
        if (cursor == null || cursor.getCount() == 0) {
            C0923b.m4642a("LocalNotificationDb", "cursor is null");
            return null;
        }
        try {
            C0893e c0893e = new C0893e();
            c0893e.m4399a(cursor.getLong(1));
            c0893e.m4398a(cursor.getInt(2));
            c0893e.m4402b(cursor.getInt(3));
            c0893e.m4405c(cursor.getInt(4));
            c0893e.m4400a(cursor.getString(5));
            c0893e.m4406c(cursor.getLong(6));
            c0893e.m4403b(cursor.getLong(7));
            C0923b.m4649e("LocalNotificationDb", c0893e.toString());
            return c0893e;
        } catch (Exception e2) {
            e2.getStackTrace();
            C0923b.m4653i("LocalNotificationDb", "initLocalNotificationDBData exception:" + e2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public int m4390a(long j) {
        if (!m4413a(true)) {
            return 0;
        }
        try {
            return getWritableDatabase().delete("t_localnotification", "ln_id=" + j, null);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        } finally {
            m4414b(true);
        }
    }

    /* renamed from: a */
    public long m4391a(long j, int i, int i2, int i3, String str, long j2, long j3) {
        try {
            if (m4413a(true)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("ln_id", Long.valueOf(j));
                contentValues.put("ln_count", Integer.valueOf(i));
                contentValues.put("ln_remove", Integer.valueOf(i2));
                contentValues.put("ln_type", Integer.valueOf(i3));
                contentValues.put("ln_extra", str);
                contentValues.put("ln_trigger_time", Long.valueOf(j2));
                contentValues.put("ln_add_time", Long.valueOf(j3));
                return getWritableDatabase().insert("t_localnotification", null, contentValues);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            m4414b(true);
        }
        return 0L;
    }

    /* renamed from: a */
    public Cursor m4392a(int i, long j) {
        try {
            return getReadableDatabase().query(true, "t_localnotification", f3784k, "ln_count=" + i + " and ln_trigger_time<" + j, null, null, null, null, null);
        } catch (Exception e2) {
            C0923b.m4653i("LocalNotificationDb", "getOutDatas exception:" + e2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public Cursor m4393a(long j, long j2) {
        try {
            return getReadableDatabase().query(true, "t_localnotification", f3784k, "ln_count>0 and ln_trigger_time<" + (j2 + j) + " and ln_trigger_time>" + j, null, null, null, null, null);
        } catch (Exception e2) {
            C0923b.m4653i("LocalNotificationDb", "getRtcDatas exception:" + e2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public C0893e m4394a(long j, int i) {
        if (!m4413a(false)) {
            throw new Exception("open database failed");
        }
        Cursor cursor = null;
        try {
            cursor = getReadableDatabase().query(true, "t_localnotification", f3784k, "ln_id=" + j + " and ln_type=" + i, null, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
            }
            return m4389a(cursor);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            m4414b(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] m4395a() {
        /*
            r13 = this;
            java.lang.String r4 = "1"
            r10 = 0
            boolean r0 = r13.m4413a(r10)
            r11 = 0
            if (r0 == 0) goto L9d
            r12 = 1
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            java.lang.String r0 = "ln_id"
            r3[r10] = r0     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            android.database.sqlite.SQLiteDatabase r0 = r13.getReadableDatabase()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            r1 = 1
            java.lang.String r2 = "t_localnotification"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            if (r0 == 0) goto L45
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r1 <= 0) goto L45
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            int[] r1 = new int[r1]     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            r0.moveToFirst()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L6d
            r2 = 0
        L33:
            int r3 = r0.getInt(r10)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L6d
            r1[r2] = r3     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L6d
            int r2 = r2 + 1
            boolean r3 = r0.moveToNext()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L6d
            if (r3 != 0) goto L33
            r11 = r1
            goto L45
        L43:
            r2 = move-exception
            goto L71
        L45:
            boolean r1 = r13.m4413a(r12)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            if (r1 == 0) goto L5e
            java.lang.String r1 = "delete from t_localnotification"
            android.database.sqlite.SQLiteDatabase r2 = r13.getWritableDatabase()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r2.execSQL(r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r1 = 1
            goto L5f
        L56:
            r1 = move-exception
            r2 = 1
            goto L8f
        L59:
            r2 = move-exception
            r1 = r11
            r11 = r0
            r0 = 1
            goto L7a
        L5e:
            r1 = 0
        L5f:
            if (r0 == 0) goto L64
            r0.close()
        L64:
            r13.m4414b(r10)
            if (r1 == 0) goto L9d
            r13.m4414b(r12)
            goto L9d
        L6d:
            r1 = move-exception
            goto L75
        L6f:
            r2 = move-exception
            r1 = r11
        L71:
            r11 = r0
            goto L79
        L73:
            r1 = move-exception
            r0 = r11
        L75:
            r2 = 0
            goto L8f
        L77:
            r2 = move-exception
            r1 = r11
        L79:
            r0 = 0
        L7a:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L8c
            if (r11 == 0) goto L82
            r11.close()
        L82:
            r13.m4414b(r10)
            if (r0 == 0) goto L8a
            r13.m4414b(r12)
        L8a:
            r11 = r1
            goto L9d
        L8c:
            r1 = move-exception
            r2 = r0
            r0 = r11
        L8f:
            if (r0 == 0) goto L94
            r0.close()
        L94:
            r13.m4414b(r10)
            if (r2 == 0) goto L9c
            r13.m4414b(r12)
        L9c:
            throw r1
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p105c.C0892d.m4395a():int[]");
    }

    /* renamed from: b */
    public long m4396b(long j, int i, int i2, int i3, String str, long j2, long j3) {
        if (m4413a(true)) {
            try {
                String str2 = "ln_id=" + j;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ln_id", Long.valueOf(j));
                contentValues.put("ln_count", Integer.valueOf(i));
                contentValues.put("ln_remove", Integer.valueOf(i2));
                contentValues.put("ln_type", Integer.valueOf(i3));
                contentValues.put("ln_extra", str);
                contentValues.put("ln_trigger_time", Long.valueOf(j2));
                contentValues.put("ln_add_time", Long.valueOf(j3));
                return getWritableDatabase().update("t_localnotification", contentValues, str2, null);
            } catch (Exception e2) {
                e2.printStackTrace();
            } finally {
                m4414b(true);
            }
        }
        return 0L;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE t_localnotification (_id INTEGER PRIMARY KEY AUTOINCREMENT ,ln_id long not null,ln_count integer not null,ln_remove integer not null,ln_type integer not null,ln_extra text ,ln_trigger_time long ,ln_add_time long );");
        } catch (Exception unused) {
            C0923b.m4651g("LocalNotificationDb", "表已经存在");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS t_localnotification");
        onCreate(sQLiteDatabase);
    }
}
