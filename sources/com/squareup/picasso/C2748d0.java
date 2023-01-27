package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import p385n.C6281e;
import p385n.C6282f;

/* renamed from: com.squareup.picasso.d0 */
final class C2748d0 {

    /* renamed from: a */
    static final StringBuilder f8794a = new StringBuilder();

    /* renamed from: b */
    private static final C6282f f8795b = C6282f.m25891n("RIFF");

    /* renamed from: c */
    private static final C6282f f8796c = C6282f.m25891n("WEBP");

    /* renamed from: com.squareup.picasso.d0$a */
    static class C2749a extends Handler {
        C2749a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    /* renamed from: com.squareup.picasso.d0$b */
    private static class C2750b extends Thread {
        C2750b(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.squareup.picasso.d0$c */
    static class C2751c implements ThreadFactory {
        C2751c() {
        }

        public Thread newThread(Runnable runnable) {
            return new C2750b(runnable);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    static long m12138a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = ((Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockCount() : statFs.getBlockCountLong()) * (Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: b */
    static int m12139b(Context context) {
        ActivityManager activityManager = (ActivityManager) m12151n(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7);
    }

    /* renamed from: c */
    static void m12140c() {
        if (!m12154q()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: d */
    static <T> T m12141d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    static File m12142e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    static String m12143f(C2789w wVar) {
        String g = m12144g(wVar, f8794a);
        f8794a.setLength(0);
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12144g(com.squareup.picasso.C2789w r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f8911f
            r1 = 50
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f8911f
        L_0x0010:
            r5.append(r0)
            goto L_0x002d
        L_0x0014:
            android.net.Uri r0 = r4.f8909d
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L_0x0010
        L_0x0025:
            r5.ensureCapacity(r1)
            int r0 = r4.f8910e
            r5.append(r0)
        L_0x002d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f8919n
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f8919n
            r5.append(r1)
            boolean r1 = r4.f8922q
            if (r1 == 0) goto L_0x005b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f8920o
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.f8921p
            r5.append(r1)
        L_0x005b:
            r5.append(r0)
        L_0x005e:
            boolean r1 = r4.mo10120c()
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f8913h
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f8914i
            r5.append(r1)
            r5.append(r0)
        L_0x0079:
            boolean r1 = r4.f8915j
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = "centerCrop:"
            r5.append(r1)
            int r1 = r4.f8916k
            r5.append(r1)
        L_0x0087:
            r5.append(r0)
            goto L_0x0095
        L_0x008b:
            boolean r1 = r4.f8917l
            if (r1 == 0) goto L_0x0095
            java.lang.String r1 = "centerInside"
            r5.append(r1)
            goto L_0x0087
        L_0x0095:
            java.util.List<com.squareup.picasso.c0> r1 = r4.f8912g
            if (r1 == 0) goto L_0x00b5
            r2 = 0
            int r1 = r1.size()
        L_0x009e:
            if (r2 >= r1) goto L_0x00b5
            java.util.List<com.squareup.picasso.c0> r3 = r4.f8912g
            java.lang.Object r3 = r3.get(r2)
            com.squareup.picasso.c0 r3 = (com.squareup.picasso.C2746c0) r3
            java.lang.String r3 = r3.key()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x009e
        L_0x00b5:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C2748d0.m12144g(com.squareup.picasso.w, java.lang.StringBuilder):java.lang.String");
    }

    /* renamed from: h */
    static void m12145h(Looper looper) {
        C2749a aVar = new C2749a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    /* renamed from: i */
    static int m12146i(Bitmap bitmap) {
        int allocationByteCount = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: j */
    static String m12147j(C2739c cVar) {
        return m12148k(cVar, BuildConfig.FLAVOR);
    }

    /* renamed from: k */
    static String m12148k(C2739c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C2732a h = cVar.mo10015h();
        if (h != null) {
            sb.append(h.f8720b.mo10121d());
        }
        List<C2732a> i = cVar.mo10016i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || h != null) {
                    sb.append(", ");
                }
                sb.append(i.get(i2).f8720b.mo10121d());
            }
        }
        return sb.toString();
    }

    /* renamed from: l */
    static int m12149l(Resources resources, C2789w wVar) throws FileNotFoundException {
        Uri uri;
        if (wVar.f8910e != 0 || (uri = wVar.f8909d) == null) {
            return wVar.f8910e;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f8909d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + wVar.f8909d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f8909d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + wVar.f8909d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f8909d);
        }
    }

    /* renamed from: m */
    static Resources m12150m(Context context, C2789w wVar) throws FileNotFoundException {
        Uri uri;
        if (wVar.f8910e != 0 || (uri = wVar.f8909d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f8909d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f8909d);
        }
    }

    /* renamed from: n */
    static <T> T m12151n(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: o */
    static boolean m12152o(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: p */
    static boolean m12153p(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            return Build.VERSION.SDK_INT < 17 ? Settings.System.getInt(contentResolver, "airplane_mode_on", 0) != 0 : Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: q */
    static boolean m12154q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: r */
    static boolean m12155r(C6281e eVar) throws IOException {
        return eVar.mo17816c0(0, f8795b) && eVar.mo17816c0(8, f8796c);
    }

    /* renamed from: s */
    static void m12156s(String str, String str2, String str3) {
        m12157t(str, str2, str3, BuildConfig.FLAVOR);
    }

    /* renamed from: t */
    static void m12157t(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }
}
