package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import p275e.C2711F;
import p275e.C2719g;
import p275e.C2722j;
import p275e.InterfaceC2709D;

/* loaded from: classes.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final C2722j PREFIX_CLEAN = C2722j.m11725c("OkHttp cache v1\n");
    static final C2722j PREFIX_DIRTY = C2722j.m11725c("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final C2722j metadata;
    int sourceCount;
    InterfaceC2709D upstream;
    long upstreamPos;
    Thread upstreamReader;
    final C2719g upstreamBuffer = new C2719g();
    final C2719g buffer = new C2719g();

    /* loaded from: classes.dex */
    class RelaySource implements InterfaceC2709D {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C2711F timeout = new C2711F();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.sourceCount--;
                if (Relay.this.sourceCount == 0) {
                    RandomAccessFile randomAccessFile2 = Relay.this.file;
                    Relay.this.file = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:            if (r5 != 2) goto L26;     */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:            r2 = java.lang.Math.min(r23, r7 - r21.sourcePos);        r21.fileOperator.read(r21.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22, r2);        r21.sourcePos += r2;     */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:            return r2;     */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:            r5 = r21.this$0.upstream.read(r21.this$0.upstreamBuffer, r21.this$0.bufferMaxSize);     */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:            if (r5 != (-1)) goto L38;     */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:            r21.this$0.commit(r7);     */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:            r2 = r21.this$0;     */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:            monitor-enter(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:            r21.this$0.upstreamReader = null;        r21.this$0.notifyAll();     */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:            monitor-exit(r2);     */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:            return -1;     */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:            r2 = java.lang.Math.min(r5, r23);        r21.this$0.upstreamBuffer.m11675a(r22, 0, r2);        r21.sourcePos += r2;        r21.fileOperator.write(r7 + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r21.this$0.upstreamBuffer.m11779clone(), r5);        r7 = r21.this$0;     */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:            monitor-enter(r7);     */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:            r21.this$0.buffer.write(r21.this$0.upstreamBuffer, r5);     */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:            if (r21.this$0.buffer.size() <= r21.this$0.bufferMaxSize) goto L43;     */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:            r21.this$0.buffer.skip(r21.this$0.buffer.size() - r21.this$0.bufferMaxSize);     */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:            r21.this$0.upstreamPos += r5;     */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:            monitor-exit(r7);     */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:            r5 = r21.this$0;     */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:            monitor-enter(r5);     */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f8, code lost:            r21.this$0.upstreamReader = null;        r21.this$0.notifyAll();     */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:            monitor-exit(r5);     */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:            return r2;     */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0109, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:            monitor-enter(r21.this$0);     */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:            r21.this$0.upstreamReader = null;        r21.this$0.notifyAll();     */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0117, code lost:            throw r0;     */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p275e.InterfaceC2709D
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(p275e.C2719g r22, long r23) {
            /*
                Method dump skipped, instructions count: 323
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(e.g, long):long");
        }

        @Override // p275e.InterfaceC2709D
        public C2711F timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC2709D interfaceC2709D, long j, C2722j c2722j, long j2) {
        this.file = randomAccessFile;
        this.upstream = interfaceC2709D;
        this.complete = interfaceC2709D == null;
        this.upstreamPos = j;
        this.metadata = c2722j;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file, InterfaceC2709D interfaceC2709D, C2722j c2722j, long j) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, interfaceC2709D, 0L, c2722j, j);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        C2719g c2719g = new C2719g();
        fileOperator.read(0L, c2719g, FILE_HEADER_SIZE);
        if (!c2719g.mo11682a(PREFIX_CLEAN.mo11655h()).equals(PREFIX_CLEAN)) {
            throw new IOException("unreadable cache file");
        }
        long readLong = c2719g.readLong();
        long readLong2 = c2719g.readLong();
        C2719g c2719g2 = new C2719g();
        fileOperator.read(readLong + FILE_HEADER_SIZE, c2719g2, readLong2);
        return new Relay(randomAccessFile, null, readLong, c2719g2.m11714o(), 0L);
    }

    private void writeHeader(C2722j c2722j, long j, long j2) {
        C2719g c2719g = new C2719g();
        c2719g.mo11676a(c2722j);
        c2719g.m11710k(j);
        c2719g.m11710k(j2);
        if (c2719g.size() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException();
        }
        new FileOperator(this.file.getChannel()).write(0L, c2719g, FILE_HEADER_SIZE);
    }

    private void writeMetadata(long j) {
        C2719g c2719g = new C2719g();
        c2719g.mo11676a(this.metadata);
        new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j, c2719g, this.metadata.mo11655h());
    }

    void commit(long j) {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.mo11655h());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    boolean isClosed() {
        return this.file == null;
    }

    public C2722j metadata() {
        return this.metadata;
    }

    public InterfaceC2709D newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }
}
