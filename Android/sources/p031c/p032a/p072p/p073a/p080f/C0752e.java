package p031c.p032a.p072p.p073a.p080f;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: c.a.p.a.f.e */
/* loaded from: classes.dex */
public final class C0752e {
    /* renamed from: a */
    private static File m3774a(File file) {
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                file.createNewFile();
            } catch (Exception unused) {
            }
        }
        return file;
    }

    /* renamed from: a */
    public static String m3775a(Bitmap bitmap, String str) {
        File file = new File(str + ".jpg");
        FileOutputStream fileOutputStream = null;
        try {
            m3774a(file);
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream2);
                fileOutputStream2.flush();
                C0754f.m3778a(fileOutputStream2);
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                C0754f.m3778a(fileOutputStream);
                return file.getAbsolutePath();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C0754f.m3778a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return file.getAbsolutePath();
    }
}
