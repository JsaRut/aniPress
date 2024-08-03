package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

/* renamed from: com.facebook.soloader.b */
/* loaded from: classes.dex */
public class C1534b extends AbstractC1546n {

    /* renamed from: a */
    private Context f5669a;

    /* renamed from: b */
    private int f5670b;

    /* renamed from: c */
    private C1535c f5671c;

    public C1534b(Context context, int i) {
        this.f5669a = context.getApplicationContext();
        if (this.f5669a == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f5669a = context;
        }
        this.f5670b = i;
        this.f5671c = new C1535c(new File(this.f5669a.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // com.facebook.soloader.AbstractC1546n
    /* renamed from: a */
    public int mo6411a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f5671c.mo6411a(str, i, threadPolicy);
    }

    @Override // com.facebook.soloader.AbstractC1546n
    /* renamed from: a */
    public File mo6412a(String str) {
        return this.f5671c.mo6412a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC1546n
    /* renamed from: a */
    public void mo6413a(int i) {
        this.f5671c.mo6413a(i);
    }

    /* renamed from: a */
    public boolean m6414a() {
        try {
            File file = this.f5671c.f5672a;
            Context createPackageContext = this.f5669a.createPackageContext(this.f5669a.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            Log.d("SoLoader", "Native library directory updated from " + file + " to " + file2);
            this.f5670b = this.f5670b | 1;
            this.f5671c = new C1535c(file2, this.f5670b);
            this.f5671c.mo6413a(this.f5670b);
            this.f5669a = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.soloader.AbstractC1546n
    public String toString() {
        return this.f5671c.toString();
    }
}
