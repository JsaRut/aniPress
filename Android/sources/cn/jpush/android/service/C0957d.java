package cn.jpush.android.service;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p059c.C0596g;
import p031c.p032a.p059c.C0597h;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p092s.C0831g;

/* renamed from: cn.jpush.android.service.d */
/* loaded from: classes.dex */
public class C0957d extends ContentProvider {
    /* renamed from: a */
    private void m4792a() {
        try {
            C0831g.m4075a(true);
            C0831g.m4080c(getContext().getApplicationContext());
        } catch (Throwable unused) {
            C0601d.m3070a("DownloadProvider", "");
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        try {
            C0601d.m3072b("DownloadProvider", "method:" + str + ", arg=" + str2);
            C0596g.m3055a();
            return C0596g.m3057b(getContext(), str, str2, bundle);
        } catch (Throwable th) {
            C0601d.m3077f("DownloadProvider", "call e:" + th);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        m4792a();
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        m4792a();
        return C0597h.m3062a(getContext(), uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        m4792a();
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C0601d.m3072b("DownloadProvider", "DownloadProvider query:" + uri);
        try {
            String queryParameter = uri.getQueryParameter("from_package");
            Bundle bundle = new Bundle();
            bundle.putString("from_package", queryParameter);
            bundle.putInt("type", 4);
            bundle.putBoolean("live", C0583a.f2798e);
            C0661d.m3386a(getContext(), "waked", bundle);
            m4792a();
            return null;
        } catch (Throwable th) {
            C0601d.m3077f("DownloadProvider", "wake error:" + th.getMessage());
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        m4792a();
        return 0;
    }
}
