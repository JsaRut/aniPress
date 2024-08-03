package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import p275e.C2719g;

/* loaded from: classes.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void read(long j, C2719g c2719g, long j2) {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.fileChannel.transferTo(j, j2, c2719g);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void write(long j, C2719g c2719g, long j2) {
        if (j2 < 0 || j2 > c2719g.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(c2719g, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
