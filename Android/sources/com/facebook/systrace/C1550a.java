package com.facebook.systrace;

import android.os.Build;
import android.os.Trace;

/* renamed from: com.facebook.systrace.a */
/* loaded from: classes.dex */
public class C1550a {

    /* renamed from: com.facebook.systrace.a$a */
    /* loaded from: classes.dex */
    public enum a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');


        /* renamed from: e */
        private final char f5715e;

        a(char c2) {
            this.f5715e = c2;
        }
    }

    /* renamed from: a */
    public static void m6453a(long j) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m6454a(long j, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m6455a(long j, String str, int i) {
    }

    /* renamed from: a */
    public static void m6456a(long j, String str, int i, long j2) {
    }

    /* renamed from: a */
    public static void m6457a(long j, String str, a aVar) {
    }

    /* renamed from: a */
    public static void m6458a(TraceListener traceListener) {
    }

    /* renamed from: b */
    public static void m6459b(long j, String str, int i) {
    }

    /* renamed from: b */
    public static void m6460b(long j, String str, int i, long j2) {
    }

    /* renamed from: b */
    public static void m6461b(TraceListener traceListener) {
    }

    /* renamed from: b */
    public static boolean m6462b(long j) {
        return false;
    }

    /* renamed from: c */
    public static void m6463c(long j, String str, int i) {
    }

    /* renamed from: d */
    public static void m6464d(long j, String str, int i) {
    }

    /* renamed from: e */
    public static void m6465e(long j, String str, int i) {
    }
}
