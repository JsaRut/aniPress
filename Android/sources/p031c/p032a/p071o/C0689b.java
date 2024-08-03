package p031c.p032a.p071o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import p000a.p005b.p022d.p023a.C0121j;
import p031c.p032a.p065i.C0663f;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0822k;

/* renamed from: c.a.o.b */
/* loaded from: classes.dex */
public final class C0689b extends AbstractC0688a {

    /* renamed from: g */
    private final int f3190g;

    /* renamed from: h */
    private ByteBuffer f3191h = ByteBuffer.allocate(8192);

    public C0689b(int i, int i2) {
        this.f3190g = i;
        this.f3189f = i2;
    }

    /* renamed from: b */
    private boolean m3560b(byte[] bArr) {
        try {
            if (!m3558m()) {
                C0675a.m3469c("NioSocketClient", "send error - connect was invalid");
                return false;
            }
            if (bArr != null && bArr.length > 0) {
                int write = this.f3185b.write(ByteBuffer.wrap(bArr));
                if (write > 0) {
                    C0675a.m3465a("NioSocketClient", "isWritable has send len:" + write);
                    return true;
                }
                if (write >= 0) {
                    return true;
                }
                C0675a.m3465a("NioSocketClient", "isWritable error:" + write);
                return false;
            }
            C0675a.m3469c("NioSocketClient", "send error - invalide buffer");
            return false;
        } catch (Exception e2) {
            C0675a.m3476h("NioSocketClient", "send data error:" + e2);
            close();
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p031c.p032a.p071o.AbstractC0688a
    /* renamed from: a */
    public final synchronized int mo3554a(String str, int i) {
        super.mo3554a(str, i);
        try {
            this.f3185b = SocketChannel.open();
            this.f3187d = Selector.open();
            this.f3185b.configureBlocking(false);
            this.f3185b.connect(new InetSocketAddress(str, i));
            C0675a.m3469c("NioSocketClient", "tcp connecting...");
            long currentTimeMillis = System.currentTimeMillis();
            while (!this.f3185b.finishConnect()) {
                if (!this.f3188e) {
                    C0675a.m3469c("NioSocketClient", "has close channel when connect...");
                    return -991;
                }
                Thread.sleep(10L);
                if (System.currentTimeMillis() - currentTimeMillis > 3000) {
                    close();
                    return -994;
                }
            }
            if (!this.f3188e) {
                C0675a.m3469c("NioSocketClient", "has close channel when connected...");
                return -991;
            }
            C0675a.m3469c("NioSocketClient", "tcp connected");
            this.f3185b.register(this.f3187d, 1);
            return 0;
        } catch (Throwable th) {
            C0675a.m3476h("NioSocketClient", "tcp connect has failed:" + th);
            close();
            return th instanceof SocketTimeoutException ? -994 : -1000;
        }
    }

    @Override // p031c.p032a.p071o.AbstractC0688a
    /* renamed from: a */
    public final int mo3555a(byte[] bArr) {
        if (bArr == null) {
            C0675a.m3469c("NioSocketClient", "sendData failed, send data was null");
            return C0121j.AppCompatTheme_textAppearanceSmallPopupMenu;
        }
        C0675a.m3469c("NioSocketClient", "send data length:" + bArr.length);
        if (bArr.length < this.f3190g) {
            if (m3560b(bArr)) {
                return 0;
            }
            return C0121j.AppCompatTheme_textAppearanceSmallPopupMenu;
        }
        C0675a.m3469c("NioSocketClient", "sendData failed, data length must less than " + this.f3190g);
        return 6026;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p031c.p032a.p071o.AbstractC0688a
    /* renamed from: b */
    public final ByteBuffer mo3556b(int i) {
        ByteBuffer m3557c;
        try {
            if (!m3558m()) {
                throw new C0663f(-991, "recv error,the connect is invalid");
            }
            int m3559n = m3559n();
            if (m3559n > 0 && (m3557c = m3557c(m3559n)) != null) {
                return m3557c;
            }
            int i2 = 1048576;
            int i3 = 0;
            while (m3558m() && this.f3186c < i2) {
                int select = i > 0 ? this.f3187d.select(i) : this.f3187d.select();
                if (select == 0) {
                    C0675a.m3469c("NioSocketClient", "readSelect:" + select + ",time out:" + i);
                    if (i > 0) {
                        throw new C0663f(-994, "recv time out");
                    }
                } else {
                    Iterator<SelectionKey> it = this.f3187d.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        SocketChannel socketChannel = (SocketChannel) next.channel();
                        if (next.isReadable()) {
                            int read = socketChannel.read(this.f3191h);
                            if (read < 0) {
                                throw new C0663f(-996, "read len < 0:" + read);
                            }
                            this.f3191h.flip();
                            int limit = this.f3191h.limit();
                            if (this.f3184a.remaining() < limit) {
                                throw new C0663f(-996, "the total buf remaining less than readLen,remaining:" + this.f3184a.remaining() + ",readLen:" + limit);
                            }
                            this.f3184a.put(this.f3191h);
                            this.f3186c += limit;
                            this.f3191h.compact();
                            if (this.f3186c < this.f3189f) {
                                C0675a.m3469c("NioSocketClient", "totalbuf can not parse head:" + this.f3186c + ",peerNetData len:" + limit + ",read:" + read);
                            } else {
                                i2 = m3559n();
                            }
                            i3 = limit;
                        } else {
                            next.isWritable();
                        }
                        it.remove();
                    }
                }
            }
            if (i2 == 1048576) {
                throw new C0663f(-997, "recv empty data or tcp has close");
            }
            C0675a.m3469c("NioSocketClient", "read len:" + i3 + ",recvTotalLen:" + this.f3186c + ",shouldLen:" + i2);
            ByteBuffer m3557c2 = m3557c(i2);
            if (m3557c2 != null) {
                return m3557c2;
            }
            throw new C0663f(-1001, "parse error");
        } catch (Throwable th) {
            if (th instanceof SocketTimeoutException) {
                throw new C0663f(-994, th.getMessage());
            }
            if (th instanceof C0663f) {
                throw ((C0663f) th);
            }
            throw new C0663f(-997, th.getMessage());
        }
    }

    @Override // p031c.p032a.p071o.AbstractC0688a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0675a.m3469c("NioSocketClient", "close this connect");
        super.close();
        Selector selector = this.f3187d;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException unused) {
            }
        }
        C0822k.m4013a(this.f3185b);
        this.f3185b = null;
    }
}
