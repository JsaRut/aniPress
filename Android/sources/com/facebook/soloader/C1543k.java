package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.k */
/* loaded from: classes.dex */
public final class C1543k {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.soloader.k$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static long m6430a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m6431a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private static void m6431a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += read;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    /* renamed from: a */
    public static String[] m6432a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return m6433a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static String[] m6433a(FileChannel fileChannel) {
        long j;
        boolean z;
        long m6430a;
        long j2;
        long j3;
        long j4;
        long m6430a2;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m6436d(fileChannel, allocate, 0L) != 1179403647) {
            throw new a("file is not ELF");
        }
        boolean z2 = m6437e(fileChannel, allocate, 4L) == 1;
        if (m6437e(fileChannel, allocate, 5L) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        long m6436d = z2 ? m6436d(fileChannel, allocate, 28L) : m6430a(fileChannel, allocate, 32L);
        long m6435c = z2 ? m6435c(fileChannel, allocate, 44L) : m6435c(fileChannel, allocate, 56L);
        int m6435c2 = m6435c(fileChannel, allocate, z2 ? 42L : 54L);
        if (m6435c == 65535) {
            long m6436d2 = z2 ? m6436d(fileChannel, allocate, 32L) : m6430a(fileChannel, allocate, 40L);
            m6435c = m6436d(fileChannel, allocate, z2 ? m6436d2 + 28 : m6436d2 + 44);
        }
        long j5 = m6436d;
        long j6 = 0;
        while (true) {
            if (j6 >= m6435c) {
                j = 0;
                break;
            }
            if (m6436d(fileChannel, allocate, j5 + 0) == 2) {
                j = z2 ? m6436d(fileChannel, allocate, j5 + 4) : m6430a(fileChannel, allocate, j5 + 8);
            } else {
                j5 += m6435c2;
                j6++;
            }
        }
        long j7 = 0;
        if (j == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j8 = j;
        long j9 = 0;
        int i = 0;
        while (true) {
            if (z2) {
                z = z2;
                m6430a = m6436d(fileChannel, allocate, j8 + j7);
            } else {
                z = z2;
                m6430a = m6430a(fileChannel, allocate, j8 + j7);
            }
            if (m6430a == 1) {
                j2 = j;
                if (i == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i++;
            } else {
                j2 = j;
                if (m6430a == 5) {
                    j9 = z ? m6436d(fileChannel, allocate, j8 + 4) : m6430a(fileChannel, allocate, j8 + 8);
                }
            }
            long j10 = 16;
            j8 += z ? 8L : 16L;
            j7 = 0;
            if (m6430a != 0) {
                z2 = z;
                j = j2;
            } else {
                if (j9 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= m6435c) {
                        j3 = 0;
                        break;
                    }
                    if (m6436d(fileChannel, allocate, m6436d + j7) == 1) {
                        long m6436d3 = z ? m6436d(fileChannel, allocate, m6436d + 8) : m6430a(fileChannel, allocate, m6436d + j10);
                        if (z) {
                            j4 = m6435c;
                            m6430a2 = m6436d(fileChannel, allocate, m6436d + 20);
                        } else {
                            j4 = m6435c;
                            m6430a2 = m6430a(fileChannel, allocate, m6436d + 40);
                        }
                        if (m6436d3 <= j9 && j9 < m6430a2 + m6436d3) {
                            j3 = (z ? m6436d(fileChannel, allocate, m6436d + 4) : m6430a(fileChannel, allocate, m6436d + 8)) + (j9 - m6436d3);
                        }
                    } else {
                        j4 = m6435c;
                    }
                    m6436d += m6435c2;
                    i2++;
                    m6435c = j4;
                    j10 = 16;
                    j7 = 0;
                }
                long j11 = 0;
                if (j3 == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i];
                int i3 = 0;
                while (true) {
                    long m6436d4 = z ? m6436d(fileChannel, allocate, j2 + j11) : m6430a(fileChannel, allocate, j2 + j11);
                    if (m6436d4 == 1) {
                        strArr[i3] = m6434b(fileChannel, allocate, (z ? m6436d(fileChannel, allocate, j2 + 4) : m6430a(fileChannel, allocate, j2 + 8)) + j3);
                        if (i3 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i3++;
                    }
                    j2 += z ? 8L : 16L;
                    if (m6436d4 == 0) {
                        if (i3 == strArr.length) {
                            return strArr;
                        }
                        throw new a("malformed DT_NEEDED section");
                    }
                    j11 = 0;
                }
            }
        }
    }

    /* renamed from: b */
    private static String m6434b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short m6437e = m6437e(fileChannel, byteBuffer, j);
            if (m6437e == 0) {
                return sb.toString();
            }
            sb.append((char) m6437e);
            j = j2;
        }
    }

    /* renamed from: c */
    private static int m6435c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m6431a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private static long m6436d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m6431a(fileChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    /* renamed from: e */
    private static short m6437e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m6431a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }
}
