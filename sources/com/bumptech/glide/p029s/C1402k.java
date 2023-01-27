package com.bumptech.glide.p029s;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import com.bumptech.glide.load.p012p.C1184l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.s.k */
public final class C1402k {

    /* renamed from: a */
    private static final char[] f4798a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f4799b = new char[64];

    /* renamed from: com.bumptech.glide.s.k$a */
    static /* synthetic */ class C1403a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4800a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4800a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4800a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4800a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4800a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4800a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p029s.C1402k.C1403a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m6974a() {
        if (!m6989p()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m6975b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof C1184l ? ((C1184l) obj).mo5497a(obj2) : obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m6976c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    private static String m6977d(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f4798a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static <T> Queue<T> m6978e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m6979f(int i, int i2, Bitmap.Config config) {
        return i * i2 * m6981h(config);
    }

    @TargetApi(19)
    /* renamed from: g */
    public static int m6980g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: h */
    private static int m6981h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C1403a.f4800a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: i */
    public static <T> List<T> m6982i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m6983j(float f) {
        return m6984k(f, 17);
    }

    /* renamed from: k */
    public static int m6984k(float f, int i) {
        return m6985l(Float.floatToIntBits(f), i);
    }

    /* renamed from: l */
    public static int m6985l(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: m */
    public static int m6986m(Object obj, int i) {
        return m6985l(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: n */
    public static int m6987n(boolean z, int i) {
        return m6985l(z ? 1 : 0, i);
    }

    /* renamed from: o */
    public static boolean m6988o() {
        return !m6989p();
    }

    /* renamed from: p */
    public static boolean m6989p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    private static boolean m6990q(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public static boolean m6991r(int i, int i2) {
        return m6990q(i) && m6990q(i2);
    }

    /* renamed from: s */
    public static String m6992s(byte[] bArr) {
        String d;
        synchronized (f4799b) {
            d = m6977d(bArr, f4799b);
        }
        return d;
    }
}
