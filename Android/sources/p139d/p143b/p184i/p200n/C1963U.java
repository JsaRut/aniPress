package p139d.p143b.p184i.p200n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.U */
/* loaded from: classes.dex */
public class C1963U extends AbstractC1961S {

    /* renamed from: c */
    private final Resources f7185c;

    public C1963U(Executor executor, InterfaceC1711h interfaceC1711h, Resources resources) {
        super(executor, interfaceC1711h);
        this.f7185c = resources;
    }

    /* renamed from: b */
    private int m8032b(C2023c c2023c) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f7185c.openRawResourceFd(m8033c(c2023c));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    private static int m8033c(C2023c c2023c) {
        return Integer.parseInt(c2023c.m8249o().getPath().substring(1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public C1920d mo8001a(C2023c c2023c) {
        return m8031b(this.f7185c.openRawResource(m8033c(c2023c)), m8032b(c2023c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public String mo8002a() {
        return "LocalResourceFetchProducer";
    }
}
