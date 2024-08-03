package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.reactnativecommunity.asyncstorage.l */
/* loaded from: classes.dex */
public class C1613l extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C1613l f6040a;

    /* renamed from: b */
    private Context f6041b;

    /* renamed from: c */
    private SQLiteDatabase f6042c;

    /* renamed from: d */
    private long f6043d;

    private C1613l(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f6043d = C1612k.f6039a.longValue() * 1024 * 1024;
        this.f6041b = context;
    }

    /* renamed from: a */
    public static C1613l m6734a(Context context) {
        if (f6040a == null) {
            f6040a = new C1613l(context.getApplicationContext());
        }
        return f6040a;
    }

    /* renamed from: e */
    private synchronized void m6735e() {
        if (this.f6042c != null && this.f6042c.isOpen()) {
            this.f6042c.close();
            this.f6042c = null;
        }
    }

    /* renamed from: f */
    private synchronized boolean m6736f() {
        m6735e();
        return this.f6041b.deleteDatabase("RKStorage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m6737a() {
        m6740d().delete("catalystLocalStorage", null, null);
    }

    /* renamed from: b */
    public synchronized void m6738b() {
        try {
            m6737a();
            m6735e();
            C1700a.m6997a("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (!m6736f()) {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
            }
            C1700a.m6997a("ReactNative", "Deleted Local Database RKStorage");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    public synchronized boolean m6739c() {
        if (this.f6042c != null && this.f6042c.isOpen()) {
            return true;
        }
        SQLiteException e2 = null;
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                try {
                    m6736f();
                } catch (SQLiteException e3) {
                    e2 = e3;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f6042c = getWritableDatabase();
        }
        if (this.f6042c == null) {
            throw e2;
        }
        this.f6042c.setMaximumSize(this.f6043d);
        return true;
    }

    /* renamed from: d */
    public synchronized SQLiteDatabase m6740d() {
        m6739c();
        return this.f6042c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            m6736f();
            onCreate(sQLiteDatabase);
        }
    }
}
