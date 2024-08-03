package p139d.p225c.p226a.p227a.p269m;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: d.c.a.a.m.h */
/* loaded from: classes.dex */
public final class C2594h extends AbstractC2593g {

    /* renamed from: e */
    private final ContentResolver f10766e;

    /* renamed from: f */
    private Uri f10767f;

    /* renamed from: g */
    private AssetFileDescriptor f10768g;

    /* renamed from: h */
    private FileInputStream f10769h;

    /* renamed from: i */
    private long f10770i;

    /* renamed from: j */
    private boolean f10771j;

    /* renamed from: d.c.a.a.m.h$a */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C2594h(Context context) {
        super(false);
        this.f10766e = context.getContentResolver();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        try {
            this.f10767f = c2600n.f10782a;
            m10920b(c2600n);
            this.f10768g = this.f10766e.openAssetFileDescriptor(this.f10767f, "r");
            if (this.f10768g == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f10767f);
            }
            this.f10769h = new FileInputStream(this.f10768g.getFileDescriptor());
            long startOffset = this.f10768g.getStartOffset();
            long skip = this.f10769h.skip(c2600n.f10787f + startOffset) - startOffset;
            if (skip != c2600n.f10787f) {
                throw new EOFException();
            }
            if (c2600n.f10788g != -1) {
                this.f10770i = c2600n.f10788g;
            } else {
                long length = this.f10768g.getLength();
                if (length == -1) {
                    FileChannel channel = this.f10769h.getChannel();
                    long size = channel.size();
                    this.f10770i = size == 0 ? -1L : size - channel.position();
                } else {
                    this.f10770i = length - skip;
                }
            }
            this.f10771j = true;
            m10921c(c2600n);
            return this.f10770i;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        this.f10767f = null;
        try {
            try {
                if (this.f10769h != null) {
                    this.f10769h.close();
                }
                this.f10769h = null;
                try {
                    try {
                        if (this.f10768g != null) {
                            this.f10768g.close();
                        }
                    } catch (IOException e2) {
                        throw new a(e2);
                    }
                } finally {
                    this.f10768g = null;
                    if (this.f10771j) {
                        this.f10771j = false;
                        m10919b();
                    }
                }
            } catch (IOException e3) {
                throw new a(e3);
            }
        } catch (Throwable th) {
            this.f10769h = null;
            try {
                try {
                    if (this.f10768g != null) {
                        this.f10768g.close();
                    }
                    this.f10768g = null;
                    if (this.f10771j) {
                        this.f10771j = false;
                        m10919b();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new a(e4);
                }
            } finally {
                this.f10768g = null;
                if (this.f10771j) {
                    this.f10771j = false;
                    m10919b();
                }
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        return this.f10767f;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f10770i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
        int read = this.f10769h.read(bArr, i, i2);
        if (read == -1) {
            if (this.f10770i == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f10770i;
        if (j2 != -1) {
            this.f10770i = j2 - read;
        }
        m10918a(read);
        return read;
    }
}
