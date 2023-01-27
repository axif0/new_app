package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.util.m */
public class C1690m {

    /* renamed from: a */
    private static String f5571a;

    /* renamed from: b */
    private static int f5572b;

    /* renamed from: a */
    public static String m7968a() {
        if (f5571a == null) {
            if (f5572b == 0) {
                f5572b = Process.myPid();
            }
            f5571a = m7969b(f5572b);
        }
        return f5571a;
    }

    /* renamed from: b */
    private static String m7969b(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = m7970c(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
                C1688k.m7957a(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            C1688k.m7957a(bufferedReader);
            throw th;
        }
        C1688k.m7957a(bufferedReader);
        return str;
    }

    /* renamed from: c */
    private static BufferedReader m7970c(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
