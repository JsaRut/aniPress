package p139d.p143b.p184i.p200n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.K */
/* loaded from: classes.dex */
public class C1953K extends AbstractC1961S {

    /* renamed from: c */
    private static final String[] f7156c = {"_id", "_data"};

    /* renamed from: d */
    private final ContentResolver f7157d;

    public C1953K(Executor executor, InterfaceC1711h interfaceC1711h, ContentResolver contentResolver) {
        super(executor, interfaceC1711h);
        this.f7157d = contentResolver;
    }

    /* renamed from: a */
    private static int m8005a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: a */
    private C1920d m8006a(Uri uri) {
        Cursor query = this.f7157d.query(uri, f7156c, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                return m8031b(new FileInputStream(string), m8005a(string));
            }
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public C1920d mo8001a(C2023c c2023c) {
        C1920d m8006a;
        InputStream createInputStream;
        Uri m8249o = c2023c.m8249o();
        if (!C1728f.m7085e(m8249o)) {
            return (!C1728f.m7084d(m8249o) || (m8006a = m8006a(m8249o)) == null) ? m8031b(this.f7157d.openInputStream(m8249o), -1) : m8006a;
        }
        if (m8249o.toString().endsWith("/photo")) {
            createInputStream = this.f7157d.openInputStream(m8249o);
        } else if (m8249o.toString().endsWith("/display_photo")) {
            try {
                createInputStream = this.f7157d.openAssetFileDescriptor(m8249o, "r").createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + m8249o);
            }
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f7157d, m8249o);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + m8249o);
            }
            createInputStream = openContactPhotoInputStream;
        }
        return m8031b(createInputStream, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC1961S
    /* renamed from: a */
    public String mo8002a() {
        return "LocalContentUriFetchProducer";
    }
}
