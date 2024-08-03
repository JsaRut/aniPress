package p139d.p143b.p145b.p147b;

import android.os.Environment;
import com.facebook.common.time.C0987c;
import com.facebook.common.time.InterfaceC0985a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p139d.p143b.p144a.C1644b;
import p139d.p143b.p144a.InterfaceC1643a;
import p139d.p143b.p145b.p146a.InterfaceC1645a;
import p139d.p143b.p145b.p146a.InterfaceC1654j;
import p139d.p143b.p145b.p147b.InterfaceC1662h;
import p139d.p143b.p148c.p151c.C1679a;
import p139d.p143b.p148c.p151c.C1681c;
import p139d.p143b.p148c.p151c.InterfaceC1680b;
import p139d.p143b.p148c.p152d.C1684c;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.b.b.b */
/* loaded from: classes.dex */
public class C1656b implements InterfaceC1662h {

    /* renamed from: a */
    private static final Class<?> f6108a = C1656b.class;

    /* renamed from: b */
    static final long f6109b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    private final File f6110c;

    /* renamed from: d */
    private final boolean f6111d;

    /* renamed from: e */
    private final File f6112e;

    /* renamed from: f */
    private final InterfaceC1645a f6113f;

    /* renamed from: g */
    private final InterfaceC0985a f6114g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.b.b.b$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC1680b {

        /* renamed from: a */
        private final List<InterfaceC1662h.a> f6115a;

        private a() {
            this.f6115a = new ArrayList();
        }

        /* renamed from: a */
        public List<InterfaceC1662h.a> m6853a() {
            return Collections.unmodifiableList(this.f6115a);
        }

        @Override // p139d.p143b.p148c.p151c.InterfaceC1680b
        /* renamed from: a */
        public void mo6854a(File file) {
            c m6834b = C1656b.this.m6834b(file);
            if (m6834b == null || m6834b.f6121a != ".cnt") {
                return;
            }
            this.f6115a.add(new b(m6834b.f6122b, file));
        }

        @Override // p139d.p143b.p148c.p151c.InterfaceC1680b
        /* renamed from: b */
        public void mo6855b(File file) {
        }

        @Override // p139d.p143b.p148c.p151c.InterfaceC1680b
        /* renamed from: c */
        public void mo6856c(File file) {
        }
    }

    /* renamed from: d.b.b.b.b$b */
    /* loaded from: classes.dex */
    static class b implements InterfaceC1662h.a {

        /* renamed from: a */
        private final String f6117a;

        /* renamed from: b */
        private final C1644b f6118b;

        /* renamed from: c */
        private long f6119c;

        /* renamed from: d */
        private long f6120d;

        private b(String str, File file) {
            C1691j.m6971a(file);
            C1691j.m6971a(str);
            this.f6117a = str;
            this.f6118b = C1644b.m6806a(file);
            this.f6119c = -1L;
            this.f6120d = -1L;
        }

        @Override // p139d.p143b.p145b.p147b.InterfaceC1662h.a
        /* renamed from: a */
        public long mo6857a() {
            if (this.f6119c < 0) {
                this.f6119c = this.f6118b.size();
            }
            return this.f6119c;
        }

        @Override // p139d.p143b.p145b.p147b.InterfaceC1662h.a
        /* renamed from: b */
        public long mo6858b() {
            if (this.f6120d < 0) {
                this.f6120d = this.f6118b.m6807b().lastModified();
            }
            return this.f6120d;
        }

        /* renamed from: c */
        public C1644b m6859c() {
            return this.f6118b;
        }

        @Override // p139d.p143b.p145b.p147b.InterfaceC1662h.a
        public String getId() {
            return this.f6117a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.b.b.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final String f6121a;

        /* renamed from: b */
        public final String f6122b;

        private c(String str, String str2) {
            this.f6121a = str;
            this.f6122b = str2;
        }

        /* renamed from: b */
        public static c m6860b(File file) {
            String m6837c;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (m6837c = C1656b.m6837c(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (m6837c.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new c(m6837c, substring);
        }

        /* renamed from: a */
        public File m6861a(File file) {
            return File.createTempFile(this.f6122b + ".", ".tmp", file);
        }

        /* renamed from: a */
        public String m6862a(String str) {
            return str + File.separator + this.f6122b + this.f6121a;
        }

        public String toString() {
            return this.f6121a + "(" + this.f6122b + ")";
        }
    }

    /* renamed from: d.b.b.b.b$d */
    /* loaded from: classes.dex */
    private static class d extends IOException {

        /* renamed from: a */
        public final long f6123a;

        /* renamed from: b */
        public final long f6124b;

        public d(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.f6123a = j;
            this.f6124b = j2;
        }
    }

    /* renamed from: d.b.b.b.b$e */
    /* loaded from: classes.dex */
    class e implements InterfaceC1662h.b {

        /* renamed from: a */
        private final String f6125a;

        /* renamed from: b */
        final File f6126b;

        public e(String str, File file) {
            this.f6125a = str;
            this.f6126b = file;
        }

        @Override // p139d.p143b.p145b.p147b.InterfaceC1662h.b
        /* renamed from: a */
        public InterfaceC1643a mo6863a(Object obj) {
            InterfaceC1645a.a aVar;
            File m6847b = C1656b.this.m6847b(this.f6125a);
            try {
                C1681c.m6950a(this.f6126b, m6847b);
                if (m6847b.exists()) {
                    m6847b.setLastModified(C1656b.this.f6114g.now());
                }
                return C1644b.m6806a(m6847b);
            } catch (C1681c.d e2) {
                Throwable cause = e2.getCause();
                if (cause != null) {
                    if (cause instanceof C1681c.c) {
                        aVar = InterfaceC1645a.a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    } else if (cause instanceof FileNotFoundException) {
                        aVar = InterfaceC1645a.a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                    }
                    C1656b.this.f6113f.mo6808a(aVar, C1656b.f6108a, "commit", e2);
                    throw e2;
                }
                aVar = InterfaceC1645a.a.WRITE_RENAME_FILE_OTHER;
                C1656b.this.f6113f.mo6808a(aVar, C1656b.f6108a, "commit", e2);
                throw e2;
            }
        }

        @Override // p139d.p143b.p145b.p147b.InterfaceC1662h.b
        /* renamed from: a */
        public void mo6864a(InterfaceC1654j interfaceC1654j, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f6126b);
                try {
                    C1684c c1684c = new C1684c(fileOutputStream);
                    interfaceC1654j.mo6825a(c1684c);
                    c1684c.flush();
                    long count = c1684c.getCount();
                    fileOutputStream.close();
                    if (this.f6126b.length() != count) {
                        throw new d(count, this.f6126b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                C1656b.this.f6113f.mo6808a(InterfaceC1645a.a.WRITE_UPDATE_FILE_NOT_FOUND, C1656b.f6108a, "updateResource", e2);
                throw e2;
            }
        }

        @Override // p139d.p143b.p145b.p147b.InterfaceC1662h.b
        /* renamed from: a */
        public boolean mo6865a() {
            return !this.f6126b.exists() || this.f6126b.delete();
        }
    }

    /* renamed from: d.b.b.b.b$f */
    /* loaded from: classes.dex */
    private class f implements InterfaceC1680b {

        /* renamed from: a */
        private boolean f6128a;

        private f() {
        }

        /* renamed from: d */
        private boolean m6866d(File file) {
            c m6834b = C1656b.this.m6834b(file);
            if (m6834b == null) {
                return false;
            }
            String str = m6834b.f6121a;
            if (str == ".tmp") {
                return m6867e(file);
            }
            C1691j.m6978b(str == ".cnt");
            return true;
        }

        /* renamed from: e */
        private boolean m6867e(File file) {
            return file.lastModified() > C1656b.this.f6114g.now() - C1656b.f6109b;
        }

        @Override // p139d.p143b.p148c.p151c.InterfaceC1680b
        /* renamed from: a */
        public void mo6854a(File file) {
            if (this.f6128a && m6866d(file)) {
                return;
            }
            file.delete();
        }

        @Override // p139d.p143b.p148c.p151c.InterfaceC1680b
        /* renamed from: b */
        public void mo6855b(File file) {
            if (this.f6128a || !file.equals(C1656b.this.f6112e)) {
                return;
            }
            this.f6128a = true;
        }

        @Override // p139d.p143b.p148c.p151c.InterfaceC1680b
        /* renamed from: c */
        public void mo6856c(File file) {
            if (!C1656b.this.f6110c.equals(file) && !this.f6128a) {
                file.delete();
            }
            if (this.f6128a && file.equals(C1656b.this.f6112e)) {
                this.f6128a = false;
            }
        }
    }

    public C1656b(File file, int i, InterfaceC1645a interfaceC1645a) {
        C1691j.m6971a(file);
        this.f6110c = file;
        this.f6111d = m6832a(file, interfaceC1645a);
        this.f6112e = new File(this.f6110c, m6829a(i));
        this.f6113f = interfaceC1645a;
        m6843f();
        this.f6114g = C0987c.m4970a();
    }

    /* renamed from: a */
    private long m6826a(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* renamed from: a */
    static String m6829a(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    /* renamed from: a */
    private void m6831a(File file, String str) {
        try {
            C1681c.m6949a(file);
        } catch (C1681c.a e2) {
            this.f6113f.mo6808a(InterfaceC1645a.a.WRITE_CREATE_DIR, f6108a, str, e2);
            throw e2;
        }
    }

    /* renamed from: a */
    private static boolean m6832a(File file, InterfaceC1645a interfaceC1645a) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
                try {
                    return str.contains(file2);
                } catch (IOException e2) {
                    e = e2;
                    interfaceC1645a.mo6808a(InterfaceC1645a.a.OTHER, f6108a, "failed to read folder to check if external: " + str, e);
                    return false;
                }
            } catch (IOException e3) {
                e = e3;
                str = null;
            }
        } catch (Exception e4) {
            interfaceC1645a.mo6808a(InterfaceC1645a.a.OTHER, f6108a, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m6833a(String str, boolean z) {
        File m6847b = m6847b(str);
        boolean exists = m6847b.exists();
        if (z && exists) {
            m6847b.setLastModified(this.f6114g.now());
        }
        return exists;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public c m6834b(File file) {
        c m6860b = c.m6860b(file);
        if (m6860b != null && m6840e(m6860b.f6122b).equals(file.getParentFile())) {
            return m6860b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static String m6837c(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    /* renamed from: d */
    private String m6839d(String str) {
        c cVar = new c(".cnt", str);
        return cVar.m6862a(m6842f(cVar.f6122b));
    }

    /* renamed from: e */
    private File m6840e(String str) {
        return new File(m6842f(str));
    }

    /* renamed from: f */
    private String m6842f(String str) {
        return this.f6112e + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    /* renamed from: f */
    private void m6843f() {
        boolean z = true;
        if (this.f6110c.exists()) {
            if (this.f6112e.exists()) {
                z = false;
            } else {
                C1679a.m6948b(this.f6110c);
            }
        }
        if (z) {
            try {
                C1681c.m6949a(this.f6112e);
            } catch (C1681c.a unused) {
                this.f6113f.mo6808a(InterfaceC1645a.a.WRITE_CREATE_DIR, f6108a, "version directory could not be created: " + this.f6112e, null);
            }
        }
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: a */
    public long mo6844a(InterfaceC1662h.a aVar) {
        return m6826a(((b) aVar).m6859c().m6807b());
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: a */
    public InterfaceC1662h.b mo6845a(String str, Object obj) {
        c cVar = new c(".tmp", str);
        File m6840e = m6840e(cVar.f6122b);
        if (!m6840e.exists()) {
            m6831a(m6840e, "insert");
        }
        try {
            return new e(str, cVar.m6861a(m6840e));
        } catch (IOException e2) {
            this.f6113f.mo6808a(InterfaceC1645a.a.WRITE_CREATE_TEMPFILE, f6108a, "insert", e2);
            throw e2;
        }
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: a */
    public void mo6846a() {
        C1679a.m6947a(this.f6110c);
    }

    /* renamed from: b */
    File m6847b(String str) {
        return new File(m6839d(str));
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: b */
    public boolean mo6848b() {
        return this.f6111d;
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: b */
    public boolean mo6849b(String str, Object obj) {
        return m6833a(str, false);
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: c */
    public InterfaceC1643a mo6850c(String str, Object obj) {
        File m6847b = m6847b(str);
        if (!m6847b.exists()) {
            return null;
        }
        m6847b.setLastModified(this.f6114g.now());
        return C1644b.m6806a(m6847b);
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: c */
    public void mo6851c() {
        C1679a.m6946a(this.f6110c, new f());
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    /* renamed from: d */
    public List<InterfaceC1662h.a> mo6852d() {
        a aVar = new a();
        C1679a.m6946a(this.f6112e, aVar);
        return aVar.m6853a();
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1662h
    public long remove(String str) {
        return m6826a(m6847b(str));
    }
}
