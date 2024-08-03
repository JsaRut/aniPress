package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p275e.C2719g;
import p275e.C2722j;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    private Reader reader;

    /* loaded from: classes.dex */
    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final InterfaceC2721i source;

        BomAwareReader(InterfaceC2721i interfaceC2721i, Charset charset) {
            this.source = interfaceC2721i;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.source.mo11711l(), Util.bomAwareCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final InterfaceC2721i interfaceC2721i) {
        if (interfaceC2721i != null) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody.1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public InterfaceC2721i source() {
                    return interfaceC2721i;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static ResponseBody create(MediaType mediaType, C2722j c2722j) {
        C2719g c2719g = new C2719g();
        c2719g.mo11676a(c2722j);
        return create(mediaType, c2722j.mo11655h(), c2719g);
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        C2719g c2719g = new C2719g();
        c2719g.m11680a(str, charset);
        return create(mediaType, c2719g.size(), c2719g);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        C2719g c2719g = new C2719g();
        c2719g.write(bArr);
        return create(mediaType, bArr.length, c2719g);
    }

    public final InputStream byteStream() {
        return source().mo11711l();
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        InterfaceC2721i source = source();
        try {
            byte[] mo11694c = source.mo11694c();
            Util.closeQuietly(source);
            if (contentLength == -1 || contentLength == mo11694c.length) {
                return mo11694c;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + mo11694c.length + ") disagree");
        } catch (Throwable th) {
            Util.closeQuietly(source);
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract InterfaceC2721i source();

    public final String string() {
        InterfaceC2721i source = source();
        try {
            return source.mo11684a(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }
}
