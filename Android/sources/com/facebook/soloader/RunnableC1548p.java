package com.facebook.soloader;

import android.util.Log;
import com.facebook.soloader.AbstractC1549q;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.soloader.p */
/* loaded from: classes.dex */
public class RunnableC1548p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ File f5696a;

    /* renamed from: b */
    final /* synthetic */ byte[] f5697b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1549q.b f5698c;

    /* renamed from: d */
    final /* synthetic */ File f5699d;

    /* renamed from: e */
    final /* synthetic */ C1541i f5700e;

    /* renamed from: f */
    final /* synthetic */ AbstractC1549q f5701f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1548p(AbstractC1549q abstractC1549q, File file, byte[] bArr, AbstractC1549q.b bVar, File file2, C1541i c1541i) {
        this.f5701f = abstractC1549q;
        this.f5696a = file;
        this.f5697b = bArr;
        this.f5698c = bVar;
        this.f5699d = file2;
        this.f5700e = c1541i;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                Log.v("fb-UnpackingSoSource", "starting syncer worker");
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f5696a, "rw");
                Throwable th = null;
                try {
                    randomAccessFile.write(this.f5697b);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    randomAccessFile = new RandomAccessFile(new File(this.f5701f.f5672a, "dso_manifest"), "rw");
                    try {
                        try {
                            this.f5698c.m6452a((DataOutput) randomAccessFile);
                            randomAccessFile.close();
                            SysUtil.m6405b(this.f5701f.f5672a);
                            AbstractC1549q.m6447b(this.f5699d, (byte) 1);
                        } finally {
                            if (th != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    } finally {
                    }
                } finally {
                    if (th != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } finally {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f5701f.f5672a + " (from syncer thread)");
                this.f5700e.close();
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
