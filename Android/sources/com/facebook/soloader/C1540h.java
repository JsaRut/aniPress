package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.AbstractC1549q;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.h */
/* loaded from: classes.dex */
public class C1540h extends AbstractC1549q {

    /* renamed from: g */
    protected final File f5679g;

    /* renamed from: h */
    protected final String f5680h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.soloader.h$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1549q.a implements Comparable {

        /* renamed from: c */
        final ZipEntry f5681c;

        /* renamed from: d */
        final int f5682d;

        a(String str, ZipEntry zipEntry, int i) {
            super(str, m6423a(zipEntry));
            this.f5681c = zipEntry;
            this.f5682d = i;
        }

        /* renamed from: a */
        private static String m6423a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f5706a.compareTo(((a) obj).f5706a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.h$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC1549q.e {

        /* renamed from: a */
        private a[] f5683a;

        /* renamed from: b */
        private final ZipFile f5684b;

        /* renamed from: c */
        private final AbstractC1549q f5685c;

        /* renamed from: com.facebook.soloader.h$b$a */
        /* loaded from: classes.dex */
        private final class a extends AbstractC1549q.d {

            /* renamed from: a */
            private int f5687a;

            private a() {
            }

            @Override // com.facebook.soloader.AbstractC1549q.d
            /* renamed from: m */
            public boolean mo6421m() {
                b.this.m6426o();
                return this.f5687a < b.this.f5683a.length;
            }

            @Override // com.facebook.soloader.AbstractC1549q.d
            /* renamed from: n */
            public AbstractC1549q.c mo6422n() {
                b.this.m6426o();
                a[] aVarArr = b.this.f5683a;
                int i = this.f5687a;
                this.f5687a = i + 1;
                a aVar = aVarArr[i];
                InputStream inputStream = b.this.f5684b.getInputStream(aVar.f5681c);
                try {
                    return new AbstractC1549q.c(aVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(AbstractC1549q abstractC1549q) {
            this.f5684b = new ZipFile(C1540h.this.f5679g);
            this.f5685c = abstractC1549q;
        }

        /* renamed from: a */
        protected boolean mo6410a(ZipEntry zipEntry, String str) {
            throw null;
        }

        @Override // com.facebook.soloader.AbstractC1549q.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5684b.close();
        }

        @Override // com.facebook.soloader.AbstractC1549q.e
        /* renamed from: m */
        protected final AbstractC1549q.b mo6419m() {
            return new AbstractC1549q.b(m6426o());
        }

        @Override // com.facebook.soloader.AbstractC1549q.e
        /* renamed from: n */
        protected final AbstractC1549q.d mo6420n() {
            return new a();
        }

        /* renamed from: o */
        final a[] m6426o() {
            if (this.f5683a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C1540h.this.f5680h);
                String[] m6404a = SysUtil.m6404a();
                Enumeration<? extends ZipEntry> entries = this.f5684b.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int m6401a = SysUtil.m6401a(m6404a, group);
                        if (m6401a >= 0) {
                            linkedHashSet.add(group);
                            a aVar = (a) hashMap.get(group2);
                            if (aVar == null || m6401a < aVar.f5682d) {
                                hashMap.put(group2, new a(group2, nextElement, m6401a));
                            }
                        }
                    }
                }
                this.f5685c.m6449a((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    a aVar2 = aVarArr[i2];
                    if (mo6410a(aVar2.f5681c, aVar2.f5706a)) {
                        i++;
                    } else {
                        aVarArr[i2] = null;
                    }
                }
                a[] aVarArr2 = new a[i];
                int i3 = 0;
                for (a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        aVarArr2[i3] = aVar3;
                        i3++;
                    }
                }
                this.f5683a = aVarArr2;
            }
            return this.f5683a;
        }
    }

    public C1540h(Context context, String str, File file, String str2) {
        super(context, str);
        this.f5679g = file;
        this.f5680h = str2;
    }
}
