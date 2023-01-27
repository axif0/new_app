package com.bumptech.glide.load.p014q.p015d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: com.bumptech.glide.load.q.d.r */
public final class C1264r {

    /* renamed from: d */
    private static final File f4469d = new File("/proc/self/fd");

    /* renamed from: e */
    private static volatile int f4470e = 700;

    /* renamed from: f */
    private static volatile int f4471f = 128;

    /* renamed from: g */
    private static volatile C1264r f4472g;

    /* renamed from: a */
    private final boolean f4473a = m6375d();

    /* renamed from: b */
    private int f4474b;

    /* renamed from: c */
    private boolean f4475c = true;

    C1264r() {
    }

    /* renamed from: a */
    public static C1264r m6373a() {
        if (f4472g == null) {
            synchronized (C1264r.class) {
                if (f4472g == null) {
                    f4472g = new C1264r();
                }
            }
        }
        return f4472g;
    }

    /* renamed from: b */
    private synchronized boolean m6374b() {
        boolean z = true;
        int i = this.f4474b + 1;
        this.f4474b = i;
        if (i >= 50) {
            this.f4474b = 0;
            int length = f4469d.list().length;
            if (length >= f4470e) {
                z = false;
            }
            this.f4475c = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + f4470e);
            }
        }
        return this.f4475c;
    }

    /* renamed from: d */
    private static boolean m6375d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = Build.MODEL.substring(0, 7);
        char c = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c = 6;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c = 5;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c = 4;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c = 2;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c = 3;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c = 1;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public boolean mo5569c(int i, int i2, boolean z, boolean z2) {
        return z && this.f4473a && Build.VERSION.SDK_INT >= 26 && !z2 && i >= f4471f && i2 >= f4471f && m6374b();
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: e */
    public boolean mo5570e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean c = mo5569c(i, i2, z, z2);
        if (c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c;
    }
}
