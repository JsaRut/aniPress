package p139d.p143b.p148c.p153e;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: d.b.c.e.b */
/* loaded from: classes.dex */
public class C1701b implements InterfaceC1702c {

    /* renamed from: a */
    public static final C1701b f6222a = new C1701b();

    /* renamed from: b */
    private String f6223b = "unknown";

    /* renamed from: c */
    private int f6224c = 5;

    private C1701b() {
    }

    /* renamed from: a */
    public static C1701b m7018a() {
        return f6222a;
    }

    /* renamed from: a */
    private String m7019a(String str) {
        if (this.f6223b == null) {
            return str;
        }
        return this.f6223b + ":" + str;
    }

    /* renamed from: a */
    private static String m7020a(String str, Throwable th) {
        return str + '\n' + m7021a(th);
    }

    /* renamed from: a */
    private static String m7021a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    private void m7022a(int i, String str, String str2) {
        Log.println(i, m7019a(str), str2);
    }

    /* renamed from: a */
    private void m7023a(int i, String str, String str2, Throwable th) {
        Log.println(i, m7019a(str), m7020a(str2, th));
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: a */
    public void mo7024a(String str, String str2) {
        m7022a(5, str, str2);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: a */
    public void mo7025a(String str, String str2, Throwable th) {
        m7023a(6, str, str2, th);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: a */
    public boolean mo7026a(int i) {
        return this.f6224c <= i;
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: b */
    public void mo7027b(String str, String str2) {
        m7022a(6, str, str2);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: b */
    public void mo7028b(String str, String str2, Throwable th) {
        m7023a(5, str, str2, th);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: c */
    public void mo7029c(String str, String str2) {
        m7022a(2, str, str2);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: c */
    public void mo7030c(String str, String str2, Throwable th) {
        m7023a(6, str, str2, th);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: d */
    public void mo7031d(String str, String str2) {
        m7022a(6, str, str2);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: e */
    public void mo7032e(String str, String str2) {
        m7022a(3, str, str2);
    }

    @Override // p139d.p143b.p148c.p153e.InterfaceC1702c
    /* renamed from: f */
    public void mo7033f(String str, String str2) {
        m7022a(4, str, str2);
    }
}
