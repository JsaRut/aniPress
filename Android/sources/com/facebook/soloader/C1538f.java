package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.AbstractC1549q;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.facebook.soloader.f */
/* loaded from: classes.dex */
public final class C1538f extends AbstractC1549q {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.soloader.f$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC1549q.e {

        /* renamed from: a */
        private final b[] f5674a;

        /* renamed from: com.facebook.soloader.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private final class C2798a extends AbstractC1549q.d {

            /* renamed from: a */
            private int f5676a;

            private C2798a() {
            }

            @Override // com.facebook.soloader.AbstractC1549q.d
            /* renamed from: m */
            public boolean mo6421m() {
                return this.f5676a < a.this.f5674a.length;
            }

            @Override // com.facebook.soloader.AbstractC1549q.d
            /* renamed from: n */
            public AbstractC1549q.c mo6422n() {
                b[] bVarArr = a.this.f5674a;
                int i = this.f5676a;
                this.f5676a = i + 1;
                b bVar = bVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(bVar.f5678c);
                try {
                    return new AbstractC1549q.c(bVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r12 + "]");     */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[Catch: all -> 0x00ff, Throwable -> 0x0103, TRY_ENTER, TryCatch #4 {Throwable -> 0x0103, blocks: (B:9:0x0063, B:41:0x00e3, B:48:0x00fb, B:49:0x00fe), top: B:8:0x0063 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        a(com.facebook.soloader.AbstractC1549q r20) {
            /*
                Method dump skipped, instructions count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1538f.a.<init>(com.facebook.soloader.f, com.facebook.soloader.q):void");
        }

        @Override // com.facebook.soloader.AbstractC1549q.e
        /* renamed from: m */
        protected AbstractC1549q.b mo6419m() {
            return new AbstractC1549q.b(this.f5674a);
        }

        @Override // com.facebook.soloader.AbstractC1549q.e
        /* renamed from: n */
        protected AbstractC1549q.d mo6420n() {
            return new C2798a();
        }
    }

    /* renamed from: com.facebook.soloader.f$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC1549q.a {

        /* renamed from: c */
        final File f5678c;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f5678c = file;
        }
    }

    public C1538f(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.AbstractC1549q
    /* renamed from: b */
    protected AbstractC1549q.e mo6409b() {
        return new a(this, this);
    }
}
