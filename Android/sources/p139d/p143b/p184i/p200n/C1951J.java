package p139d.p143b.p184i.p200n;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.J */
/* loaded from: classes.dex */
public class C1951J extends AbstractC1961S {

    /* renamed from: c */
    private final AssetManager f7153c;

    public C1951J(Executor executor, InterfaceC1711h interfaceC1711h, AssetManager assetManager) {
        super(executor, interfaceC1711h);
        this.f7153c = assetManager;
    }

    /* renamed from: b */
    private static String m7999b(C2023c c2023c) {
        return c2023c.m8249o().getPath().substring(1);
    }

    /* renamed from: c */
    private int m8000c(C2023c c2023c) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f7153c.openFd(m7999b(c2023c));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (IOException unused2) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public C1920d mo8001a(C2023c c2023c) {
        return m8031b(this.f7153c.open(m7999b(c2023c), 2), m8000c(c2023c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public String mo8002a() {
        return "LocalAssetFetchProducer";
    }
}
