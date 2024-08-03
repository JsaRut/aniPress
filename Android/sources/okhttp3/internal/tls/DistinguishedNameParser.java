package okhttp3.internal.tls;

import javax.security.auth.x500.X500Principal;
import p000a.p005b.p022d.p023a.C0121j;

/* loaded from: classes.dex */
final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;

    /* renamed from: dn */
    private final String f11449dn;
    private int end;
    private final int length;
    private int pos;

    DistinguishedNameParser(X500Principal x500Principal) {
        this.f11449dn = x500Principal.getName("RFC2253");
        this.length = this.f11449dn.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:            return new java.lang.String(r1, r2, r8.cur - r2);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String escapedAV() {
        /*
            r8 = this;
            int r0 = r8.pos
            r8.beg = r0
            r8.end = r0
        L6:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.chars
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L4f
            r5 = 92
            if (r2 == r5) goto L40
            if (r2 == r4) goto L4f
            if (r2 == r3) goto L4f
            int r2 = r8.end
            int r3 = r2 + 1
            r8.end = r3
            char r3 = r1[r0]
            r1[r2] = r3
        L3b:
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L40:
            int r0 = r8.end
            int r2 = r0 + 1
            r8.end = r2
            char r2 = r8.getEscaped()
            r1[r0] = r2
            int r0 = r8.pos
            goto L3b
        L4f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.end
            r8.cur = r2
            int r0 = r0 + 1
            r8.pos = r0
            int r0 = r2 + 1
            r8.end = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 >= r1) goto L83
            char[] r1 = r8.chars
            char r2 = r1[r0]
            if (r2 != r6) goto L83
            int r2 = r8.end
            int r7 = r2 + 1
            r8.end = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.pos = r0
            goto L6a
        L83:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 == r1) goto L97
            char[] r1 = r8.chars
            char r2 = r1[r0]
            if (r2 == r3) goto L97
            char r2 = r1[r0]
            if (r2 == r4) goto L97
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L97:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.cur
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.DistinguishedNameParser.escapedAV():java.lang.String");
    }

    private int getByte(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.length) {
            throw new IllegalStateException("Malformed DN: " + this.f11449dn);
        }
        char c2 = this.chars[i];
        if (c2 >= '0' && c2 <= '9') {
            i2 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i2 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f11449dn);
            }
            i2 = c2 - '7';
        }
        char c3 = this.chars[i4];
        if (c3 >= '0' && c3 <= '9') {
            i3 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i3 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f11449dn);
            }
            i3 = c3 - '7';
        }
        return (i2 << 4) + i3;
    }

    private char getEscaped() {
        this.pos++;
        int i = this.pos;
        if (i == this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f11449dn);
        }
        char c2 = this.chars[i];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
            switch (c2) {
                case C0121j.AppCompatTheme_buttonBarPositiveButtonStyle /* 42 */:
                case C0121j.AppCompatTheme_buttonBarStyle /* 43 */:
                case C0121j.AppCompatTheme_buttonStyle /* 44 */:
                    break;
                default:
                    switch (c2) {
                        case C0121j.AppCompatTheme_dialogCornerRadius /* 59 */:
                        case C0121j.AppCompatTheme_dialogPreferredPadding /* 60 */:
                        case C0121j.AppCompatTheme_dialogTheme /* 61 */:
                        case C0121j.AppCompatTheme_dividerHorizontal /* 62 */:
                            break;
                        default:
                            return getUTF8();
                    }
            }
        }
        return this.chars[this.pos];
    }

    private char getUTF8() {
        int i;
        int i2;
        int i3 = getByte(this.pos);
        this.pos++;
        if (i3 < 128) {
            return (char) i3;
        }
        if (i3 < 192 || i3 > 247) {
            return '?';
        }
        if (i3 <= 223) {
            i2 = i3 & 31;
            i = 1;
        } else if (i3 <= 239) {
            i = 2;
            i2 = i3 & 15;
        } else {
            i = 3;
            i2 = i3 & 7;
        }
        for (int i4 = 0; i4 < i; i4++) {
            this.pos++;
            int i5 = this.pos;
            if (i5 == this.length || this.chars[i5] != '\\') {
                return '?';
            }
            this.pos = i5 + 1;
            int i6 = getByte(this.pos);
            this.pos++;
            if ((i6 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (i6 & 63);
        }
        return (char) i2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private String hexAV() {
        int i = this.pos;
        if (i + 4 >= this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f11449dn);
        }
        this.beg = i;
        while (true) {
            this.pos = i + 1;
            int i2 = this.pos;
            if (i2 == this.length) {
                break;
            }
            char[] cArr = this.chars;
            if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                break;
            }
            if (cArr[i2] == ' ') {
                this.end = i2;
                do {
                    this.pos = i2 + 1;
                    i2 = this.pos;
                    if (i2 >= this.length) {
                        break;
                    }
                } while (this.chars[i2] == ' ');
            } else {
                if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                    cArr[i2] = (char) (cArr[i2] + ' ');
                }
                i = this.pos;
            }
        }
        this.end = this.pos;
        int i3 = this.end;
        int i4 = this.beg;
        int i5 = i3 - i4;
        if (i5 < 5 || (i5 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f11449dn);
        }
        byte[] bArr = new byte[i5 / 2];
        int i6 = i4 + 1;
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr[i7] = (byte) getByte(i6);
            i6 += 2;
        }
        return new String(this.chars, this.beg, i5);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private String nextAT() {
        char[] cArr;
        while (true) {
            int i = this.pos;
            if (i >= this.length || this.chars[i] != ' ') {
                break;
            }
            this.pos = i + 1;
        }
        int i2 = this.pos;
        if (i2 == this.length) {
            return null;
        }
        this.beg = i2;
        do {
            this.pos = i2 + 1;
            i2 = this.pos;
            if (i2 >= this.length) {
                break;
            }
            cArr = this.chars;
            if (cArr[i2] == '=') {
                break;
            }
        } while (cArr[i2] != ' ');
        int i3 = this.pos;
        if (i3 >= this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f11449dn);
        }
        this.end = i3;
        if (this.chars[i3] == ' ') {
            while (true) {
                int i4 = this.pos;
                if (i4 >= this.length) {
                    break;
                }
                char[] cArr2 = this.chars;
                if (cArr2[i4] == '=' || cArr2[i4] != ' ') {
                    break;
                }
                this.pos = i4 + 1;
            }
            char[] cArr3 = this.chars;
            int i5 = this.pos;
            if (cArr3[i5] != '=' || i5 == this.length) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f11449dn);
            }
        }
        int i6 = this.pos;
        do {
            this.pos = i6 + 1;
            i6 = this.pos;
            if (i6 >= this.length) {
                break;
            }
        } while (this.chars[i6] == ' ');
        int i7 = this.end;
        int i8 = this.beg;
        if (i7 - i8 > 4) {
            char[] cArr4 = this.chars;
            if (cArr4[i8 + 3] == '.' && (cArr4[i8] == 'O' || cArr4[i8] == 'o')) {
                char[] cArr5 = this.chars;
                int i9 = this.beg;
                if (cArr5[i9 + 1] == 'I' || cArr5[i9 + 1] == 'i') {
                    char[] cArr6 = this.chars;
                    int i10 = this.beg;
                    if (cArr6[i10 + 2] == 'D' || cArr6[i10 + 2] == 'd') {
                        this.beg += 4;
                    }
                }
            }
        }
        char[] cArr7 = this.chars;
        int i11 = this.beg;
        return new String(cArr7, i11, this.end - i11);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private String quotedAV() {
        this.pos++;
        this.beg = this.pos;
        int i = this.beg;
        while (true) {
            this.end = i;
            int i2 = this.pos;
            if (i2 == this.length) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f11449dn);
            }
            char[] cArr = this.chars;
            if (cArr[i2] == '\"') {
                do {
                    this.pos = i2 + 1;
                    i2 = this.pos;
                    if (i2 >= this.length) {
                        break;
                    }
                } while (this.chars[i2] == ' ');
                char[] cArr2 = this.chars;
                int i3 = this.beg;
                return new String(cArr2, i3, this.end - i3);
            }
            if (cArr[i2] == '\\') {
                cArr[this.end] = getEscaped();
            } else {
                cArr[this.end] = cArr[i2];
            }
            this.pos++;
            i = this.end + 1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public String findMostSpecific(String str) {
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.f11449dn.toCharArray();
        String nextAT = nextAT();
        if (nextAT == null) {
            return null;
        }
        do {
            int i = this.pos;
            if (i == this.length) {
                return null;
            }
            char c2 = this.chars[i];
            String escapedAV = c2 != '\"' ? c2 != '#' ? (c2 == '+' || c2 == ',' || c2 == ';') ? "" : escapedAV() : hexAV() : quotedAV();
            if (str.equalsIgnoreCase(nextAT)) {
                return escapedAV;
            }
            int i2 = this.pos;
            if (i2 >= this.length) {
                return null;
            }
            char[] cArr = this.chars;
            if (cArr[i2] != ',' && cArr[i2] != ';' && cArr[i2] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f11449dn);
            }
            this.pos++;
            nextAT = nextAT();
        } while (nextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.f11449dn);
    }
}
