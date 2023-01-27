package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.m */
public class C2596m {

    /* renamed from: a */
    private static final byte f8360a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f8361b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m11538b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m11539c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String mo9503a() {
        byte[] c = m11539c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f8361b & c[0]) | f8360a);
        return m11538b(c);
    }
}
