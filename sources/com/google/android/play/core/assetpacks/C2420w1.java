package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import p148g.p189d.p190a.p271e.p272a.p276c.C5097d0;
import p148g.p189d.p190a.p271e.p272a.p278e.C5145a;

/* renamed from: com.google.android.play.core.assetpacks.w1 */
public final class C2420w1 {

    /* renamed from: a */
    private static C2337e f8017a;

    /* renamed from: a */
    static synchronized C2337e m11060a(Context context) {
        C2337e eVar;
        synchronized (C2420w1.class) {
            if (f8017a == null) {
                C2391p0 p0Var = new C2391p0((byte[]) null);
                p0Var.mo9226b(new C2326b3(C5145a.m21596a(context)));
                f8017a = p0Var.mo9225a();
            }
            eVar = f8017a;
        }
        return eVar;
    }

    /* renamed from: b */
    static String m11061b(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    C5097d0.m21473a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    /* renamed from: c */
    public static boolean m11062c(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: d */
    static boolean m11063d(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: e */
    static long m11064e(byte[] bArr, int i) {
        return ((long) ((m11066g(bArr, i + 2) << 16) | m11066g(bArr, i))) & 4294967295L;
    }

    /* renamed from: f */
    public static boolean m11065f(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: g */
    static int m11066g(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: h */
    public static boolean m11067h(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
