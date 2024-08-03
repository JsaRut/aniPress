package p139d.p225c.p226a.p227a.p269m;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d.c.a.a.m.e */
/* loaded from: classes.dex */
public final class C2591e extends AbstractC2593g {

    /* renamed from: e */
    private final AssetManager f10757e;

    /* renamed from: f */
    private Uri f10758f;

    /* renamed from: g */
    private InputStream f10759g;

    /* renamed from: h */
    private long f10760h;

    /* renamed from: i */
    private boolean f10761i;

    /* renamed from: d.c.a.a.m.e$a */
    /* loaded from: classes.dex */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C2591e(Context context) {
        super(false);
        this.f10757e = context.getAssets();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        try {
            this.f10758f = c2600n.f10782a;
            String path = this.f10758f.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m10920b(c2600n);
            this.f10759g = this.f10757e.open(path, 1);
            if (this.f10759g.skip(c2600n.f10787f) < c2600n.f10787f) {
                throw new EOFException();
            }
            if (c2600n.f10788g != -1) {
                this.f10760h = c2600n.f10788g;
            } else {
                this.f10760h = this.f10759g.available();
                if (this.f10760h == 2147483647L) {
                    this.f10760h = -1L;
                }
            }
            this.f10761i = true;
            m10921c(c2600n);
            return this.f10760h;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        this.f10758f = null;
        try {
            try {
                if (this.f10759g != null) {
                    this.f10759g.close();
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } finally {
            this.f10759g = null;
            if (this.f10761i) {
                this.f10761i = false;
                m10919b();
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        return this.f10758f;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f10760h;
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
        int read = this.f10759g.read(bArr, i, i2);
        if (read == -1) {
            if (this.f10760h == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f10760h;
        if (j2 != -1) {
            this.f10760h = j2 - read;
        }
        m10918a(read);
        return read;
    }
}
