package p031c.p101b.p102a.p105c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/* renamed from: c.b.a.c.g */
/* loaded from: classes.dex */
public abstract class AbstractC0895g extends SQLiteOpenHelper {

    /* renamed from: a */
    private volatile int f3794a;

    /* renamed from: b */
    private volatile int f3795b;

    /* renamed from: c */
    private volatile SQLiteDatabase f3796c;

    /* renamed from: d */
    private volatile SQLiteDatabase f3797d;

    /* renamed from: e */
    private final Object f3798e;

    /* renamed from: f */
    private final Object f3799f;

    /* renamed from: g */
    private final Context f3800g;

    /* renamed from: h */
    private final String f3801h;

    /* renamed from: i */
    private final int f3802i;

    /* renamed from: j */
    private final SQLiteDatabase.CursorFactory f3803j;

    public AbstractC0895g(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f3794a = 0;
        this.f3795b = 0;
        this.f3798e = new Object();
        this.f3799f = new Object();
        this.f3800g = context;
        this.f3801h = str;
        this.f3802i = i;
        this.f3803j = cursorFactory;
    }

    /* renamed from: a */
    public boolean m4413a(boolean z) {
        try {
            if (z) {
                synchronized (this.f3798e) {
                    getWritableDatabase();
                    this.f3795b++;
                }
                return true;
            }
            synchronized (this.f3799f) {
                getReadableDatabase();
                this.f3794a++;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m4414b(boolean z) {
        boolean z2 = true;
        if (z) {
            synchronized (this.f3798e) {
                if (this.f3797d != null && this.f3797d.isOpen()) {
                    int i = this.f3795b - 1;
                    this.f3795b = i;
                    if (i > 0) {
                        z2 = false;
                    }
                }
                if (z2) {
                    this.f3795b = 0;
                    if (this.f3797d != null) {
                        this.f3797d.close();
                    }
                    this.f3797d = null;
                }
            }
            return;
        }
        synchronized (this.f3799f) {
            if (this.f3796c != null && this.f3796c.isOpen()) {
                int i2 = this.f3794a - 1;
                this.f3794a = i2;
                if (i2 > 0) {
                    z2 = false;
                }
            }
            if (z2) {
                this.f3794a = 0;
                if (this.f3796c != null) {
                    this.f3796c.close();
                }
                this.f3796c = null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    @Deprecated
    public void close() {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        if (this.f3796c == null || !this.f3796c.isOpen()) {
            synchronized (this.f3799f) {
                if (this.f3796c == null || !this.f3796c.isOpen()) {
                    try {
                        getWritableDatabase();
                    } catch (SQLiteException unused) {
                    }
                    String path = this.f3800g.getDatabasePath(this.f3801h).getPath();
                    this.f3796c = SQLiteDatabase.openDatabase(path, this.f3803j, 1);
                    if (this.f3796c.getVersion() != this.f3802i) {
                        throw new SQLiteException("Can't upgrade read-only database from version " + this.f3796c.getVersion() + " to " + this.f3802i + ": " + path);
                    }
                    this.f3794a = 0;
                    onOpen(this.f3796c);
                }
            }
        }
        return this.f3796c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        if (this.f3797d == null || !this.f3797d.isOpen()) {
            synchronized (this.f3798e) {
                if (this.f3797d == null || !this.f3797d.isOpen()) {
                    this.f3795b = 0;
                    this.f3797d = super.getWritableDatabase();
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.f3797d.enableWriteAheadLogging();
                    }
                }
            }
        }
        return this.f3797d;
    }
}
