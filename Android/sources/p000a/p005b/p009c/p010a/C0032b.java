package p000a.p005b.p009c.p010a;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.b.c.a.b */
/* loaded from: classes.dex */
public class C0032b extends ContentProvider {

    /* renamed from: a */
    private static final String[] f142a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final File f143b = new File("/");

    /* renamed from: c */
    private static HashMap<String, a> f144c = new HashMap<>();

    /* renamed from: d */
    private a f145d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.c.a.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Uri mo160a(File file);

        /* renamed from: a */
        File mo161a(Uri uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.c.a.b$b */
    /* loaded from: classes.dex */
    public static class b implements a {

        /* renamed from: a */
        private final String f146a;

        /* renamed from: b */
        private final HashMap<String, File> f147b = new HashMap<>();

        b(String str) {
            this.f146a = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p000a.p005b.p009c.p010a.C0032b.a
        /* renamed from: a */
        public Uri mo160a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f147b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f146a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(path2.endsWith("/") ? path2.length() : path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // p000a.p005b.p009c.p010a.C0032b.a
        /* renamed from: a */
        public File mo161a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f147b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        /* renamed from: a */
        void m162a(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f147b.put(str, file.getCanonicalFile());
            } catch (IOException e2) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
            }
        }
    }

    /* renamed from: a */
    private static int m153a(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: a */
    private static a m154a(Context context, String str) {
        a aVar;
        synchronized (f144c) {
            aVar = f144c.get(str);
            if (aVar == null) {
                try {
                    aVar = m159b(context, str);
                    f144c.put(str, aVar);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static Uri m155a(Context context, String str, File file) {
        return m154a(context, str).mo160a(file);
    }

    /* renamed from: a */
    private static File m156a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: a */
    private static Object[] m157a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: a */
    private static String[] m158a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    private static a m159b(Context context, String str) {
        b bVar = new b(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f143b;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] m91b = C0022a.m91b(context, (String) null);
                    if (m91b.length > 0) {
                        file = m91b[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] m89a = C0022a.m89a(context);
                    if (m89a.length > 0) {
                        file = m89a[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    bVar.m162a(attributeValue, m156a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f145d = m154a(context, providerInfo.authority);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f145d.mo161a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo161a = this.f145d.mo161a(uri);
        int lastIndexOf = mo161a.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo161a.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f145d.mo161a(uri), m153a(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File mo161a = this.f145d.mo161a(uri);
        if (strArr == null) {
            strArr = f142a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = mo161a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo161a.length());
            }
            i2 = i;
        }
        String[] m158a = m158a(strArr3, i2);
        Object[] m157a = m157a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(m158a, 1);
        matrixCursor.addRow(m157a);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
