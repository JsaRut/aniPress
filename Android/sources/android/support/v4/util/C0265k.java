package android.support.v4.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: android.support.v4.util.k */
/* loaded from: classes.dex */
public class C0265k {
    /* renamed from: a */
    public static int m1382a(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }
}
