package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;

/* renamed from: android.arch.lifecycle.g */
/* loaded from: classes.dex */
/* synthetic */ class C0147g {

    /* renamed from: a */
    static final /* synthetic */ int[] f595a;

    /* renamed from: b */
    static final /* synthetic */ int[] f596b = new int[AbstractC0144d.b.values().length];

    static {
        try {
            f596b[AbstractC0144d.b.INITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f596b[AbstractC0144d.b.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f596b[AbstractC0144d.b.STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f596b[AbstractC0144d.b.RESUMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f596b[AbstractC0144d.b.DESTROYED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f595a = new int[AbstractC0144d.a.values().length];
        try {
            f595a[AbstractC0144d.a.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f595a[AbstractC0144d.a.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f595a[AbstractC0144d.a.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f595a[AbstractC0144d.a.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f595a[AbstractC0144d.a.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f595a[AbstractC0144d.a.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f595a[AbstractC0144d.a.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
