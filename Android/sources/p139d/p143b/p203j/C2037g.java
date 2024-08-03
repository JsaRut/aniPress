package p139d.p143b.p203j;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d.b.j.g */
/* loaded from: classes.dex */
public class C2037g {
    /* renamed from: a */
    public static int m8307a(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: a */
    private static String m8308a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append((char) b2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m8309a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static Pair<Integer, Integer> m8310b(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (!m8309a(bArr, "RIFF")) {
                return null;
            }
            m8312d(inputStream);
            inputStream.read(bArr);
            if (!m8309a(bArr, "WEBP")) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return null;
            }
            inputStream.read(bArr);
            String m8308a = m8308a(bArr);
            if ("VP8 ".equals(m8308a)) {
                Pair<Integer, Integer> m8314f = m8314f(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return m8314f;
            }
            if ("VP8L".equals(m8308a)) {
                Pair<Integer, Integer> m8315g = m8315g(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return m8315g;
            }
            if (!"VP8X".equals(m8308a)) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return null;
            }
            Pair<Integer, Integer> m8316h = m8316h(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            return m8316h;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    private static byte m8311c(InputStream inputStream) {
        return (byte) (inputStream.read() & 255);
    }

    /* renamed from: d */
    private static int m8312d(InputStream inputStream) {
        byte read = (byte) inputStream.read();
        byte read2 = (byte) inputStream.read();
        return ((((byte) inputStream.read()) << 24) & (-16777216)) | ((((byte) inputStream.read()) << 16) & 16711680) | ((read2 << 8) & 65280) | (read & 255);
    }

    /* renamed from: e */
    private static short m8313e(InputStream inputStream) {
        return (short) (inputStream.read() & 255);
    }

    /* renamed from: f */
    private static Pair<Integer, Integer> m8314f(InputStream inputStream) {
        inputStream.skip(7L);
        short m8313e = m8313e(inputStream);
        short m8313e2 = m8313e(inputStream);
        short m8313e3 = m8313e(inputStream);
        if (m8313e == 157 && m8313e2 == 1 && m8313e3 == 42) {
            return new Pair<>(Integer.valueOf(m8307a(inputStream)), Integer.valueOf(m8307a(inputStream)));
        }
        return null;
    }

    /* renamed from: g */
    private static Pair<Integer, Integer> m8315g(InputStream inputStream) {
        m8312d(inputStream);
        if (m8311c(inputStream) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        int read2 = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read2 & 192) >> 6)) + 1));
    }

    /* renamed from: h */
    private static Pair<Integer, Integer> m8316h(InputStream inputStream) {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(m8317i(inputStream) + 1), Integer.valueOf(m8317i(inputStream) + 1));
    }

    /* renamed from: i */
    private static int m8317i(InputStream inputStream) {
        byte m8311c = m8311c(inputStream);
        return ((m8311c(inputStream) << 16) & 16711680) | ((m8311c(inputStream) << 8) & 65280) | (m8311c & 255);
    }
}
