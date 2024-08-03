package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.i */
/* loaded from: classes.dex */
public final class C1541i implements Closeable {

    /* renamed from: a */
    private final FileOutputStream f5689a;

    /* renamed from: b */
    private final FileLock f5690b;

    private C1541i(File file) {
        this.f5689a = new FileOutputStream(file);
        try {
            FileLock lock = this.f5689a.getChannel().lock();
            if (lock == null) {
            }
            this.f5690b = lock;
        } finally {
            this.f5689a.close();
        }
    }

    /* renamed from: a */
    public static C1541i m6427a(File file) {
        return new C1541i(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.f5690b != null) {
                this.f5690b.release();
            }
        } finally {
            this.f5689a.close();
        }
    }
}
