package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.modules.network.x */
/* loaded from: classes.dex */
public class C1232x {

    /* renamed from: a */
    private final CharsetDecoder f4654a;

    /* renamed from: b */
    private byte[] f4655b = null;

    public C1232x(Charset charset) {
        this.f4654a = charset.newDecoder();
    }

    /* renamed from: a */
    public String m5442a(byte[] bArr, int i) {
        byte[] bArr2 = this.f4655b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f4655b.length, i);
            i += this.f4655b.length;
            bArr = bArr3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        CharBuffer charBuffer = null;
        boolean z = false;
        int i2 = 0;
        while (!z && i2 < 4) {
            try {
                charBuffer = this.f4654a.decode(wrap);
                z = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (z && i2 > 0) {
            this.f4655b = new byte[i2];
            System.arraycopy(bArr, i - i2, this.f4655b, 0, i2);
        } else {
            this.f4655b = null;
        }
        if (z) {
            return new String(charBuffer.array(), 0, charBuffer.length());
        }
        C1700a.m7015d("ReactNative", "failed to decode string from byte array");
        return "";
    }
}
