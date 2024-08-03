package p139d.p143b.p184i.p200n;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import p139d.p143b.p148c.p150b.C1673a;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.o */
/* loaded from: classes.dex */
public class C1997o extends AbstractC1961S {
    public C1997o(InterfaceC1711h interfaceC1711h) {
        super(C1673a.m6936a(), interfaceC1711h);
    }

    /* renamed from: a */
    static byte[] m8167a(String str) {
        C1691j.m6974a(str.substring(0, 5).equals("data:"));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        return m8168b(str.substring(0, indexOf)) ? Base64.decode(substring, 0) : Uri.decode(substring).getBytes();
    }

    /* renamed from: b */
    static boolean m8168b(String str) {
        if (!str.contains(";")) {
            return false;
        }
        return str.split(";")[r2.length - 1].equals("base64");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public C1920d mo8001a(C2023c c2023c) {
        byte[] m8167a = m8167a(c2023c.m8249o().toString());
        return m8030a(new ByteArrayInputStream(m8167a), m8167a.length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public String mo8002a() {
        return "DataFetchProducer";
    }
}
