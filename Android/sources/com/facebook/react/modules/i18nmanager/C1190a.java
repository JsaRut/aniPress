package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import p000a.p005b.p009c.p018g.C0066c;

/* renamed from: com.facebook.react.modules.i18nmanager.a */
/* loaded from: classes.dex */
public class C1190a {

    /* renamed from: a */
    private static C1190a f4573a;

    private C1190a() {
    }

    /* renamed from: a */
    public static C1190a m5346a() {
        if (f4573a == null) {
            f4573a = new C1190a();
        }
        return f4573a;
    }

    /* renamed from: a */
    private boolean m5347a(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    /* renamed from: b */
    private void m5348b(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: b */
    private boolean m5349b() {
        return C0066c.m277a(Locale.getDefault()) == 1;
    }

    /* renamed from: c */
    private boolean m5350c(Context context) {
        return m5347a(context, "RCTI18nUtil_allowRTL", true);
    }

    /* renamed from: d */
    private boolean m5351d(Context context) {
        return m5347a(context, "RCTI18nUtil_forceRTL", false);
    }

    /* renamed from: a */
    public void m5352a(Context context, boolean z) {
        m5348b(context, "RCTI18nUtil_allowRTL", z);
    }

    /* renamed from: a */
    public boolean m5353a(Context context) {
        return m5347a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    /* renamed from: b */
    public void m5354b(Context context, boolean z) {
        m5348b(context, "RCTI18nUtil_forceRTL", z);
    }

    /* renamed from: b */
    public boolean m5355b(Context context) {
        if (m5351d(context)) {
            return true;
        }
        return m5350c(context) && m5349b();
    }

    /* renamed from: c */
    public void m5356c(Context context, boolean z) {
        m5348b(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}
