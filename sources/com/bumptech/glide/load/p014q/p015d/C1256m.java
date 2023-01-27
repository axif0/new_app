package com.bumptech.glide.load.p014q.p015d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C0993b;
import com.bumptech.glide.load.C0997f;
import com.bumptech.glide.load.C0999h;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1003j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p014q.p015d.C1250l;
import com.bumptech.glide.p029s.C1397f;
import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.C1402k;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.q.d.m */
public final class C1256m {

    /* renamed from: f */
    public static final C0999h<C0993b> f4452f = C0999h.m5546f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C0993b.f3948h);

    /* renamed from: g */
    public static final C0999h<C1003j> f4453g = C0999h.m5546f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", C1003j.SRGB);

    /* renamed from: h */
    public static final C0999h<Boolean> f4454h = C0999h.m5546f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);

    /* renamed from: i */
    public static final C0999h<Boolean> f4455i = C0999h.m5546f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);

    /* renamed from: j */
    private static final Set<String> f4456j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k */
    private static final C1258b f4457k = new C1257a();

    /* renamed from: l */
    private static final Set<ImageHeaderParser.ImageType> f4458l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m */
    private static final Queue<BitmapFactory.Options> f4459m = C1402k.m6978e(0);

    /* renamed from: a */
    private final C1047e f4460a;

    /* renamed from: b */
    private final DisplayMetrics f4461b;

    /* renamed from: c */
    private final C1042b f4462c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f4463d;

    /* renamed from: e */
    private final C1264r f4464e = C1264r.m6373a();

    /* renamed from: com.bumptech.glide.load.q.d.m$a */
    class C1257a implements C1258b {
        C1257a() {
        }

        /* renamed from: a */
        public void mo5566a(C1047e eVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo5567b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$b */
    public interface C1258b {
        /* renamed from: a */
        void mo5566a(C1047e eVar, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo5567b();
    }

    static {
        C0999h<C1250l> hVar = C1250l.f4447f;
    }

    public C1256m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C1047e eVar, C1042b bVar) {
        this.f4463d = list;
        C1401j.m6972d(displayMetrics);
        this.f4461b = displayMetrics;
        C1401j.m6972d(eVar);
        this.f4460a = eVar;
        C1401j.m6972d(bVar);
        this.f4462c = bVar;
    }

    /* renamed from: a */
    private static int m6334a(double d) {
        int j = m6341j(d);
        double d2 = (double) j;
        Double.isNaN(d2);
        int u = m6350u(d2 * d);
        double d3 = (double) (((float) u) / ((float) j));
        Double.isNaN(d3);
        double d4 = (double) u;
        Double.isNaN(d4);
        return m6350u((d / d3) * d4);
    }

    /* renamed from: b */
    private void m6335b(InputStream inputStream, C0993b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f4464e.mo5570e(i, i2, options, z, z2)) {
            if (bVar == C0993b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = C0997f.m5539b(this.f4463d, inputStream, this.f4462c).hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: c */
    private static void m6336c(ImageHeaderParser.ImageType imageType, InputStream inputStream, C1258b bVar, C1047e eVar, C1250l lVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ImageHeaderParser.ImageType imageType2 = imageType;
        C1250l lVar2 = lVar;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 <= 0 || i12 <= 0) {
            String str = "x";
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType2 + " with target [" + i13 + str + i14 + "]");
                return;
            }
            return;
        }
        if (m6344o(i)) {
            i6 = i11;
            i7 = i12;
        } else {
            i7 = i11;
            i6 = i12;
        }
        float b = lVar2.mo5561b(i7, i6, i13, i14);
        if (b > 0.0f) {
            C1250l.C1255e a = lVar2.mo5560a(i7, i6, i13, i14);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int u = i7 / m6350u((double) (b * f));
                int u2 = i6 / m6350u((double) (b * f2));
                int max = a == C1250l.C1255e.MEMORY ? Math.max(u, u2) : Math.min(u, u2);
                String str2 = "x";
                if (Build.VERSION.SDK_INT > 23 || !f4456j.contains(options2.outMimeType)) {
                    i8 = Math.max(1, Integer.highestOneBit(max));
                    if (a == C1250l.C1255e.MEMORY && ((float) i8) < 1.0f / b) {
                        i8 <<= 1;
                    }
                } else {
                    i8 = 1;
                }
                options2.inSampleSize = i8;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i8, 8);
                    i9 = (int) Math.ceil((double) (f / min));
                    i10 = (int) Math.ceil((double) (f2 / min));
                    int i15 = i8 / 8;
                    if (i15 > 0) {
                        i9 /= i15;
                        i10 /= i15;
                    }
                } else {
                    if (!(imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A)) {
                        if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                float f3 = (float) i8;
                                i9 = Math.round(f / f3);
                                i10 = Math.round(f2 / f3);
                            }
                        } else if (i7 % i8 == 0 && i6 % i8 == 0) {
                            i9 = i7 / i8;
                            i10 = i6 / i8;
                        } else {
                            int[] k = m6342k(inputStream, options2, bVar, eVar);
                            i9 = k[0];
                            i10 = k[1];
                        }
                    }
                    float f4 = (float) i8;
                    i9 = (int) Math.floor((double) (f / f4));
                    i10 = (int) Math.floor((double) (f2 / f4));
                }
                double b2 = (double) lVar2.mo5561b(i9, i10, i13, i14);
                if (Build.VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = m6334a(b2);
                    options2.inDensity = m6341j(b2);
                }
                if (m6345p(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i2);
                    String str3 = str2;
                    sb.append(str3);
                    sb.append(i3);
                    sb.append("], degreesToRotate: ");
                    sb.append(i);
                    sb.append(", target: [");
                    sb.append(i13);
                    sb.append(str3);
                    sb.append(i14);
                    sb.append("], power of two scaled: [");
                    sb.append(i9);
                    sb.append(str3);
                    sb.append(i10);
                    sb.append("], exact scale factor: ");
                    sb.append(b);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i8);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b2);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    Log.v("Downsampler", sb.toString());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        String str4 = "x";
        int i16 = i11;
        throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + lVar2 + ", source: [" + i16 + str4 + i12 + "], target: [" + i13 + str4 + i14 + "]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0175, code lost:
        if (r3 >= 26) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a5  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m6337f(java.io.InputStream r28, android.graphics.BitmapFactory.Options r29, com.bumptech.glide.load.p014q.p015d.C1250l r30, com.bumptech.glide.load.C0993b r31, com.bumptech.glide.load.C1003j r32, boolean r33, int r34, int r35, boolean r36, com.bumptech.glide.load.p014q.p015d.C1256m.C1258b r37) throws java.io.IOException {
        /*
            r27 = this;
            r8 = r27
            r7 = r28
            r6 = r29
            r5 = r37
            long r20 = com.bumptech.glide.p029s.C1397f.m6956b()
            com.bumptech.glide.load.o.a0.e r0 = r8.f4460a
            int[] r0 = m6342k(r7, r6, r5, r0)
            r22 = 0
            r4 = r0[r22]
            r3 = 1
            r2 = r0[r3]
            java.lang.String r1 = r6.outMimeType
            r0 = -1
            if (r4 == r0) goto L_0x0024
            if (r2 != r0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r23 = r33
            goto L_0x0026
        L_0x0024:
            r23 = 0
        L_0x0026:
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r8.f4463d
            com.bumptech.glide.load.o.a0.b r9 = r8.f4462c
            int r0 = com.bumptech.glide.load.C0997f.m5538a(r0, r7, r9)
            int r14 = com.bumptech.glide.load.p014q.p015d.C1272x.m6408g(r0)
            boolean r24 = com.bumptech.glide.load.p014q.p015d.C1272x.m6411j(r0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r34
            if (r15 != r9) goto L_0x004a
            boolean r10 = m6344o(r14)
            r13 = r35
            if (r10 == 0) goto L_0x0047
            r25 = r2
            goto L_0x004e
        L_0x0047:
            r25 = r4
            goto L_0x004e
        L_0x004a:
            r13 = r35
            r25 = r15
        L_0x004e:
            if (r13 != r9) goto L_0x005c
            boolean r9 = m6344o(r14)
            if (r9 == 0) goto L_0x0059
            r26 = r4
            goto L_0x005e
        L_0x0059:
            r26 = r2
            goto L_0x005e
        L_0x005c:
            r26 = r13
        L_0x005e:
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r9 = r8.f4463d
            com.bumptech.glide.load.o.a0.b r10 = r8.f4462c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r12 = com.bumptech.glide.load.C0997f.m5539b(r9, r7, r10)
            com.bumptech.glide.load.o.a0.e r11 = r8.f4460a
            r9 = r12
            r10 = r28
            r16 = r11
            r11 = r37
            r8 = r12
            r12 = r16
            r13 = r30
            r15 = r4
            r16 = r2
            r17 = r25
            r18 = r26
            r19 = r29
            m6336c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r0
            r0 = r27
            r11 = r1
            r1 = r28
            r10 = r2
            r2 = r31
            r9 = 1
            r3 = r23
            r12 = r4
            r4 = r24
            r13 = r5
            r5 = r29
            r14 = r6
            r6 = r25
            r7 = r26
            r0.m6335b(r1, r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x00a2
            r3 = 1
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            int r0 = r14.inSampleSize
            r1 = 2
            java.lang.String r2 = "Downsampler"
            if (r0 == r9) goto L_0x00b1
            if (r3 == 0) goto L_0x00ad
            goto L_0x00b1
        L_0x00ad:
            r0 = r27
            goto L_0x0156
        L_0x00b1:
            r0 = r27
            r4 = r8
            boolean r4 = r0.m6352w(r4)
            if (r4 == 0) goto L_0x0156
            if (r12 < 0) goto L_0x00c8
            if (r10 < 0) goto L_0x00c8
            if (r36 == 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00c8
            r5 = r25
            r6 = r26
            goto L_0x014d
        L_0x00c8:
            boolean r3 = m6345p(r29)
            if (r3 == 0) goto L_0x00d6
            int r3 = r14.inTargetDensity
            float r3 = (float) r3
            int r4 = r14.inDensity
            float r4 = (float) r4
            float r3 = r3 / r4
            goto L_0x00d8
        L_0x00d6:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00d8:
            int r4 = r14.inSampleSize
            float r5 = (float) r12
            float r6 = (float) r4
            float r5 = r5 / r6
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
            int r5 = (int) r7
            float r7 = (float) r10
            float r7 = r7 / r6
            double r6 = (double) r7
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r3
            int r6 = java.lang.Math.round(r6)
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L_0x014d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Calculated target ["
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = "x"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r9 = "] for source ["
            r7.append(r9)
            r7.append(r12)
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = "], sampleSize: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = ", targetDensity: "
            r7.append(r4)
            int r4 = r14.inTargetDensity
            r7.append(r4)
            java.lang.String r4 = ", density: "
            r7.append(r4)
            int r4 = r14.inDensity
            r7.append(r4)
            java.lang.String r4 = ", density multiplier: "
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.util.Log.v(r2, r3)
        L_0x014d:
            if (r5 <= 0) goto L_0x0156
            if (r6 <= 0) goto L_0x0156
            com.bumptech.glide.load.o.a0.e r3 = r0.f4460a
            m6351v(r14, r3, r5, r6)
        L_0x0156:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x0173
            com.bumptech.glide.load.j r3 = com.bumptech.glide.load.C1003j.DISPLAY_P3
            r4 = r32
            if (r4 != r3) goto L_0x016e
            android.graphics.ColorSpace r3 = r14.outColorSpace
            if (r3 == 0) goto L_0x016e
            boolean r3 = r3.isWideGamut()
            if (r3 == 0) goto L_0x016e
            r22 = 1
        L_0x016e:
            if (r22 == 0) goto L_0x0177
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0179
        L_0x0173:
            r4 = 26
            if (r3 < r4) goto L_0x017f
        L_0x0177:
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.SRGB
        L_0x0179:
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            r14.inPreferredColorSpace = r3
        L_0x017f:
            com.bumptech.glide.load.o.a0.e r3 = r0.f4460a
            r4 = r28
            android.graphics.Bitmap r3 = m6338g(r4, r14, r13, r3)
            com.bumptech.glide.load.o.a0.e r4 = r0.f4460a
            r13.mo5566a(r4, r3)
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x01a1
            r9 = r12
            r12 = r29
            r13 = r3
            r14 = r34
            r1 = r15
            r15 = r35
            r16 = r20
            m6346q(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01a2
        L_0x01a1:
            r1 = r15
        L_0x01a2:
            r2 = 0
            if (r3 == 0) goto L_0x01bd
            android.util.DisplayMetrics r2 = r0.f4461b
            int r2 = r2.densityDpi
            r3.setDensity(r2)
            com.bumptech.glide.load.o.a0.e r2 = r0.f4460a
            android.graphics.Bitmap r2 = com.bumptech.glide.load.p014q.p015d.C1272x.m6412k(r2, r3, r1)
            boolean r1 = r3.equals(r2)
            if (r1 != 0) goto L_0x01bd
            com.bumptech.glide.load.o.a0.e r1 = r0.f4460a
            r1.mo5249d(r3)
        L_0x01bd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p014q.p015d.C1256m.m6337f(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.q.d.l, com.bumptech.glide.load.b, com.bumptech.glide.load.j, boolean, int, int, boolean, com.bumptech.glide.load.q.d.m$b):android.graphics.Bitmap");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m6338g(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, com.bumptech.glide.load.p014q.p015d.C1256m.C1258b r8, com.bumptech.glide.load.p008o.p009a0.C1047e r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto L_0x000c
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto L_0x000f
        L_0x000c:
            r8.mo5567b()
        L_0x000f:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p014q.p015d.C1272x.m6407f()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch:{ IllegalArgumentException -> 0x0032 }
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.p014q.p015d.C1272x.m6407f()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L_0x002f
            r6.reset()
        L_0x002f:
            return r8
        L_0x0030:
            r6 = move-exception
            goto L_0x005f
        L_0x0032:
            r5 = move-exception
            java.io.IOException r1 = m6347r(r5, r1, r2, r3, r7)     // Catch:{ all -> 0x0030 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x005e
            r6.reset()     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ IOException -> 0x005d }
            r9.mo5249d(r0)     // Catch:{ IOException -> 0x005d }
            r7.inBitmap = r4     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r6 = m6338g(r6, r7, r8, r9)     // Catch:{ IOException -> 0x005d }
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p014q.p015d.C1272x.m6407f()
            r7.unlock()
            return r6
        L_0x005d:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005e:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005f:
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p014q.p015d.C1272x.m6407f()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p014q.p015d.C1256m.m6338g(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.q.d.m$b, com.bumptech.glide.load.o.a0.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: h */
    private static String m6339h(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = BuildConfig.FLAVOR;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: i */
    private static synchronized BitmapFactory.Options m6340i() {
        BitmapFactory.Options poll;
        synchronized (C1256m.class) {
            synchronized (f4459m) {
                poll = f4459m.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m6349t(poll);
            }
        }
        return poll;
    }

    /* renamed from: j */
    private static int m6341j(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: k */
    private static int[] m6342k(InputStream inputStream, BitmapFactory.Options options, C1258b bVar, C1047e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m6338g(inputStream, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: l */
    private static String m6343l(BitmapFactory.Options options) {
        return m6339h(options.inBitmap);
    }

    /* renamed from: o */
    private static boolean m6344o(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m6345p(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p014q.p015d.C1256m.m6345p(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: q */
    private static void m6346q(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m6339h(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m6343l(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C1397f.m6955a(j));
    }

    /* renamed from: r */
    private static IOException m6347r(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m6343l(options), illegalArgumentException);
    }

    /* renamed from: s */
    private static void m6348s(BitmapFactory.Options options) {
        m6349t(options);
        synchronized (f4459m) {
            f4459m.offer(options);
        }
    }

    /* renamed from: t */
    private static void m6349t(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: u */
    private static int m6350u(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: v */
    private static void m6351v(BitmapFactory.Options options, C1047e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo5250e(i, i2, config);
    }

    /* renamed from: w */
    private boolean m6352w(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f4458l.contains(imageType);
    }

    /* renamed from: d */
    public C1141v<Bitmap> mo5562d(InputStream inputStream, int i, int i2, C1002i iVar) throws IOException {
        return mo5563e(inputStream, i, i2, iVar, f4457k);
    }

    /* renamed from: e */
    public C1141v<Bitmap> mo5563e(InputStream inputStream, int i, int i2, C1002i iVar, C1258b bVar) throws IOException {
        C1002i iVar2 = iVar;
        C1401j.m6969a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f4462c.mo5228e(65536, byte[].class);
        BitmapFactory.Options i3 = m6340i();
        i3.inTempStorage = bArr;
        C0993b bVar2 = (C0993b) iVar2.mo5154c(f4452f);
        C1003j jVar = (C1003j) iVar2.mo5154c(f4453g);
        try {
            return C1239e.m6273f(m6337f(inputStream, i3, (C1250l) iVar2.mo5154c(C1250l.f4447f), bVar2, jVar, iVar2.mo5154c(f4455i) != null && ((Boolean) iVar2.mo5154c(f4455i)).booleanValue(), i, i2, ((Boolean) iVar2.mo5154c(f4454h)).booleanValue(), bVar), this.f4460a);
        } finally {
            m6348s(i3);
            this.f4462c.mo5227d(bArr);
        }
    }

    /* renamed from: m */
    public boolean mo5564m(InputStream inputStream) {
        return true;
    }

    /* renamed from: n */
    public boolean mo5565n(ByteBuffer byteBuffer) {
        return true;
    }
}
