package com.bumptech.glide.load.p008o.p011c0;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.o.c0.b */
final class C1094b {

    /* renamed from: com.bumptech.glide.load.o.c0.b$a */
    class C1095a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f4112a;

        C1095a(Pattern pattern) {
            this.f4112a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f4112a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m5843a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m5844b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m5844b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C1095a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
