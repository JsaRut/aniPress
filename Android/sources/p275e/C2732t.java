package p275e;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: e.t */
/* loaded from: classes.dex */
public final class C2732t {

    /* renamed from: a */
    static final Logger f11418a = Logger.getLogger(C2732t.class.getName());

    private C2732t() {
    }

    /* renamed from: a */
    public static InterfaceC2708C m11737a() {
        return new C2730r();
    }

    /* renamed from: a */
    public static InterfaceC2708C m11738a(File file) {
        if (file != null) {
            return m11739a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static InterfaceC2708C m11739a(OutputStream outputStream) {
        return m11740a(outputStream, new C2711F());
    }

    /* renamed from: a */
    private static InterfaceC2708C m11740a(OutputStream outputStream, C2711F c2711f) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (c2711f != null) {
            return new C2728p(c2711f, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: a */
    public static InterfaceC2708C m11741a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C2715c m11750c = m11750c(socket);
        return m11750c.sink(m11740a(socket.getOutputStream(), m11750c));
    }

    /* renamed from: a */
    public static InterfaceC2709D m11742a(InputStream inputStream) {
        return m11743a(inputStream, new C2711F());
    }

    /* renamed from: a */
    private static InterfaceC2709D m11743a(InputStream inputStream, C2711F c2711f) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (c2711f != null) {
            return new C2729q(c2711f, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: a */
    public static InterfaceC2720h m11744a(InterfaceC2708C interfaceC2708C) {
        return new C2735w(interfaceC2708C);
    }

    /* renamed from: a */
    public static InterfaceC2721i m11745a(InterfaceC2709D interfaceC2709D) {
        return new C2737y(interfaceC2709D);
    }

    /* renamed from: a */
    public static boolean m11746a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: b */
    public static InterfaceC2708C m11747b(File file) {
        if (file != null) {
            return m11739a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static InterfaceC2709D m11748b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C2715c m11750c = m11750c(socket);
        return m11750c.source(m11743a(socket.getInputStream(), m11750c));
    }

    /* renamed from: c */
    public static InterfaceC2709D m11749c(File file) {
        if (file != null) {
            return m11742a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    private static C2715c m11750c(Socket socket) {
        return new C2731s(socket);
    }
}
