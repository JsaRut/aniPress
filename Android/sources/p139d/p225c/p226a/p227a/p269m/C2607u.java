package p139d.p225c.p226a.p227a.p269m;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: d.c.a.a.m.u */
/* loaded from: classes.dex */
public final class C2607u extends AbstractC2593g {

    /* renamed from: e */
    private RandomAccessFile f10833e;

    /* renamed from: f */
    private Uri f10834f;

    /* renamed from: g */
    private long f10835g;

    /* renamed from: h */
    private boolean f10836h;

    /* renamed from: d.c.a.a.m.u$a */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C2607u() {
        super(false);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public long mo9121a(C2600n c2600n) {
        try {
            this.f10834f = c2600n.f10782a;
            m10920b(c2600n);
            this.f10833e = new RandomAccessFile(c2600n.f10782a.getPath(), "r");
            this.f10833e.seek(c2600n.f10787f);
            this.f10835g = c2600n.f10788g == -1 ? this.f10833e.length() - c2600n.f10787f : c2600n.f10788g;
            if (this.f10835g < 0) {
                throw new EOFException();
            }
            this.f10836h = true;
            m10921c(c2600n);
            return this.f10835g;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public void close() {
        this.f10834f = null;
        try {
            try {
                if (this.f10833e != null) {
                    this.f10833e.close();
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } finally {
            this.f10833e = null;
            if (this.f10836h) {
                this.f10836h = false;
                m10919b();
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public Uri getUri() {
        return this.f10834f;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f10835g;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f10833e.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.f10835g -= read;
                m10918a(read);
            }
            return read;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }
}
