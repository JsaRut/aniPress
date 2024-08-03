package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p275e.C2732t;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2709D;

/* loaded from: classes.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: okhttp3.internal.io.FileSystem.1
        @Override // okhttp3.internal.io.FileSystem
        public InterfaceC2708C appendingSink(File file) {
            try {
                return C2732t.m11738a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C2732t.m11738a(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public void delete(File file) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // okhttp3.internal.io.FileSystem
        public void deleteContents(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.io.FileSystem
        public void rename(File file, File file2) {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // okhttp3.internal.io.FileSystem
        public InterfaceC2708C sink(File file) {
            try {
                return C2732t.m11747b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C2732t.m11747b(file);
            }
        }

        @Override // okhttp3.internal.io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.io.FileSystem
        public InterfaceC2709D source(File file) {
            return C2732t.m11749c(file);
        }
    };

    InterfaceC2708C appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    InterfaceC2708C sink(File file);

    long size(File file);

    InterfaceC2709D source(File file);
}
