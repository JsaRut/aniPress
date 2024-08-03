package p000a.p005b.p009c.p019h.p020a;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: a.b.c.h.a.c */
/* loaded from: classes.dex */
public class C0082c {
    /* renamed from: a */
    public static void m409a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m410b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }
}
