package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.modules.storage.j */
/* loaded from: classes.dex */
public class C1253j extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C1253j f4703a;

    /* renamed from: b */
    private Context f4704b;

    /* renamed from: c */
    private SQLiteDatabase f4705c;

    /* renamed from: d */
    private long f4706d;

    private C1253j(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f4706d = 6291456L;
        this.f4704b = context;
    }

    /* renamed from: a */
    public static C1253j m5460a(Context context) {
        if (f4703a == null) {
            f4703a = new C1253j(context.getApplicationContext());
        }
        return f4703a;
    }

    /* renamed from: e */
    private synchronized void m5461e() {
        if (this.f4705c != null && this.f4705c.isOpen()) {
            this.f4705c.close();
            this.f4705c = null;
        }
    }

    /* renamed from: f */
    private synchronized boolean m5462f() {
        m5461e();
        return this.f4704b.deleteDatabase("RKStorage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m5463a() {
        m5466d().delete("catalystLocalStorage", null, null);
    }

    /* renamed from: b */
    public synchronized void m5464b() {
        try {
            m5463a();
            m5461e();
            C1700a.m6997a("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (!m5462f()) {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
            C1700a.m6997a("ReactNative", "Deleted Local Database RKStorage");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    public synchronized boolean m5465c() {
        if (this.f4705c != null && this.f4705c.isOpen()) {
            return true;
        }
        SQLiteException e2 = null;
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                try {
                    m5462f();
                } catch (SQLiteException e3) {
                    e2 = e3;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f4705c = getWritableDatabase();
        }
        if (this.f4705c == null) {
            throw e2;
        }
        this.f4705c.setMaximumSize(this.f4706d);
        return true;
    }

    /* renamed from: d */
    public synchronized SQLiteDatabase m5466d() {
        m5465c();
        return this.f4705c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            m5462f();
            onCreate(sQLiteDatabase);
        }
    }
}
