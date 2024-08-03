package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p000a.p005b.p009c.p010a.p011a.C0025c;
import p000a.p005b.p009c.p017f.C0058f;

/* renamed from: a.b.c.b.j */
/* loaded from: classes.dex */
public class C0044j {

    /* renamed from: a.b.c.b.j$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        int mo216a(T t);

        /* renamed from: b */
        boolean mo217b(T t);
    }

    /* renamed from: a */
    private C0025c.c m218a(C0025c.b bVar, int i) {
        return (C0025c.c) m219a(bVar.m118a(), i, new C0043i(this));
    }

    /* renamed from: a */
    private static <T> T m219a(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo216a(t2) - i2) * 2) + (aVar.mo217b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public C0058f.b m220a(C0058f.b[] bVarArr, int i) {
        return (C0058f.b) m219a(bVarArr, i, new C0042h(this));
    }

    /* renamed from: a */
    public Typeface mo200a(Context context, C0025c.b bVar, Resources resources, int i) {
        C0025c.c m218a = m218a(bVar, i);
        if (m218a == null) {
            return null;
        }
        return C0037c.m190a(context, resources, m218a.m120b(), m218a.m119a(), i);
    }

    /* renamed from: a */
    public Typeface mo207a(Context context, Resources resources, int i, String str, int i2) {
        File m222a = C0045k.m222a(context);
        if (m222a == null) {
            return null;
        }
        try {
            if (C0045k.m227a(m222a, resources, i)) {
                return Typeface.createFromFile(m222a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m222a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo195a(Context context, CancellationSignal cancellationSignal, C0058f.b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m220a(bVarArr, i).m256c());
            try {
                Typeface m221a = m221a(context, inputStream);
                C0045k.m226a(inputStream);
                return m221a;
            } catch (IOException unused) {
                C0045k.m226a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0045k.m226a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public Typeface m221a(Context context, InputStream inputStream) {
        File m222a = C0045k.m222a(context);
        if (m222a == null) {
            return null;
        }
        try {
            if (C0045k.m228a(m222a, inputStream)) {
                return Typeface.createFromFile(m222a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m222a.delete();
        }
    }
}
