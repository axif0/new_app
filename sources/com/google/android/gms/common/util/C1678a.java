package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: com.google.android.gms.common.util.a */
public class C1678a {
    /* renamed from: a */
    public static byte[] m7932a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo e = C4389c.m18627a(context).mo13717e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m7933b("SHA1")) == null) {
            return null;
        }
        return b.digest(e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m7933b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
