package p139d.p225c.p226a.p227a.p269m;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d.c.a.a.m.C */
/* loaded from: classes.dex */
public final class C2584C extends AbstractC2593g {

    /* renamed from: e */
    private final Resources f10741e;

    /* renamed from: f */
    private Uri f10742f;

    /* renamed from: g */
    private AssetFileDescriptor f10743g;

    /* renamed from: h */
    private InputStream f10744h;

    /* renamed from: i */
    private long f10745i;

    /* renamed from: j */
    private boolean f10746j;

    /* renamed from: d.c.a.a.m.C$a */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }

        public a(String str) {
            super(str);
        }
    }

    public C2584C(Context context) {
        super(false);
        this.f10741e = context.getResources();
    }

    /* renamed from: b */
    public static Uri m10900b(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        try {
            this.f10742f = c2600n.f10782a;
            if (!TextUtils.equals("rawresource", this.f10742f.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                int parseInt = Integer.parseInt(this.f10742f.getLastPathSegment());
                m10920b(c2600n);
                this.f10743g = this.f10741e.openRawResourceFd(parseInt);
                this.f10744h = new FileInputStream(this.f10743g.getFileDescriptor());
                this.f10744h.skip(this.f10743g.getStartOffset());
                if (this.f10744h.skip(c2600n.f10787f) < c2600n.f10787f) {
                    throw new EOFException();
                }
                long j = -1;
                if (c2600n.f10788g != -1) {
                    this.f10745i = c2600n.f10788g;
                } else {
                    long length = this.f10743g.getLength();
                    if (length != -1) {
                        j = length - c2600n.f10787f;
                    }
                    this.f10745i = j;
                }
                this.f10746j = true;
                m10921c(c2600n);
                return this.f10745i;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        this.f10742f = null;
        try {
            try {
                if (this.f10744h != null) {
                    this.f10744h.close();
                }
                this.f10744h = null;
                try {
                    try {
                        if (this.f10743g != null) {
                            this.f10743g.close();
                        }
                    } catch (IOException e2) {
                        throw new a(e2);
                    }
                } finally {
                    this.f10743g = null;
                    if (this.f10746j) {
                        this.f10746j = false;
                        m10919b();
                    }
                }
            } catch (IOException e3) {
                throw new a(e3);
            }
        } catch (Throwable th) {
            this.f10744h = null;
            try {
                try {
                    if (this.f10743g != null) {
                        this.f10743g.close();
                    }
                    this.f10743g = null;
                    if (this.f10746j) {
                        this.f10746j = false;
                        m10919b();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new a(e4);
                }
            } finally {
                this.f10743g = null;
                if (this.f10746j) {
                    this.f10746j = false;
                    m10919b();
                }
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        return this.f10742f;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f10745i;
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
        int read = this.f10744h.read(bArr, i, i2);
        if (read == -1) {
            if (this.f10745i == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f10745i;
        if (j2 != -1) {
            this.f10745i = j2 - read;
        }
        m10918a(read);
        return read;
    }
}
