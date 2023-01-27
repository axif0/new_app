package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import android.os.Build;
import com.squareup.picasso.C2772r;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p385n.C6281e;
import p385n.C6288l;
import p385n.C6300s;

/* renamed from: com.squareup.picasso.c */
class C2739c implements Runnable {

    /* renamed from: A */
    private static final AtomicInteger f8766A = new AtomicInteger();

    /* renamed from: B */
    private static final C2793y f8767B = new C2741b();

    /* renamed from: y */
    private static final Object f8768y = new Object();

    /* renamed from: z */
    private static final ThreadLocal<StringBuilder> f8769z = new C2740a();

    /* renamed from: f */
    final int f8770f = f8766A.incrementAndGet();

    /* renamed from: g */
    final C2776t f8771g;

    /* renamed from: h */
    final C2756i f8772h;

    /* renamed from: i */
    final C2747d f8773i;

    /* renamed from: j */
    final C2734a0 f8774j;

    /* renamed from: k */
    final String f8775k;

    /* renamed from: l */
    final C2789w f8776l;

    /* renamed from: m */
    final int f8777m;

    /* renamed from: n */
    int f8778n;

    /* renamed from: o */
    final C2793y f8779o;

    /* renamed from: p */
    C2732a f8780p;

    /* renamed from: q */
    List<C2732a> f8781q;

    /* renamed from: r */
    Bitmap f8782r;

    /* renamed from: s */
    Future<?> f8783s;

    /* renamed from: t */
    C2776t.C2782e f8784t;

    /* renamed from: u */
    Exception f8785u;

    /* renamed from: v */
    int f8786v;

    /* renamed from: w */
    int f8787w;

    /* renamed from: x */
    C2776t.C2783f f8788x;

    /* renamed from: com.squareup.picasso.c$a */
    static class C2740a extends ThreadLocal<StringBuilder> {
        C2740a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    static class C2741b extends C2793y {
        C2741b() {
        }

        /* renamed from: c */
        public boolean mo10008c(C2789w wVar) {
            return true;
        }

        /* renamed from: f */
        public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    static class C2742c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2746c0 f8789f;

        /* renamed from: g */
        final /* synthetic */ RuntimeException f8790g;

        C2742c(C2746c0 c0Var, RuntimeException runtimeException) {
            this.f8789f = c0Var;
            this.f8790g = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f8789f.key() + " crashed with exception.", this.f8790g);
        }
    }

    /* renamed from: com.squareup.picasso.c$d */
    static class C2743d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ StringBuilder f8791f;

        C2743d(StringBuilder sb) {
            this.f8791f = sb;
        }

        public void run() {
            throw new NullPointerException(this.f8791f.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$e */
    static class C2744e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2746c0 f8792f;

        C2744e(C2746c0 c0Var) {
            this.f8792f = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f8792f.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: com.squareup.picasso.c$f */
    static class C2745f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2746c0 f8793f;

        C2745f(C2746c0 c0Var) {
            this.f8793f = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f8793f.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    C2739c(C2776t tVar, C2756i iVar, C2747d dVar, C2734a0 a0Var, C2732a aVar, C2793y yVar) {
        this.f8771g = tVar;
        this.f8772h = iVar;
        this.f8773i = dVar;
        this.f8774j = a0Var;
        this.f8780p = aVar;
        this.f8775k = aVar.mo9985d();
        this.f8776l = aVar.mo9990i();
        this.f8788x = aVar.mo9989h();
        this.f8777m = aVar.mo9986e();
        this.f8778n = aVar.mo9987f();
        this.f8779o = yVar;
        this.f8787w = yVar.mo10089e();
    }

    /* renamed from: a */
    static Bitmap m12105a(List<C2746c0> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            C2746c0 c0Var = list.get(i);
            try {
                Bitmap a = c0Var.mo10036a(bitmap);
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(c0Var.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C2746c0 key : list) {
                        sb.append(key.key());
                        sb.append(10);
                    }
                    C2776t.f8856p.post(new C2743d(sb));
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    C2776t.f8856p.post(new C2744e(c0Var));
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    C2776t.f8856p.post(new C2745f(c0Var));
                    return null;
                }
            } catch (RuntimeException e) {
                C2776t.f8856p.post(new C2742c(c0Var, e));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    private C2776t.C2783f m12106d() {
        C2776t.C2783f fVar = C2776t.C2783f.LOW;
        List<C2732a> list = this.f8781q;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (this.f8780p == null && !z2) {
            z = false;
        }
        if (!z) {
            return fVar;
        }
        C2732a aVar = this.f8780p;
        if (aVar != null) {
            fVar = aVar.mo9989h();
        }
        if (z2) {
            int size = this.f8781q.size();
            for (int i = 0; i < size; i++) {
                C2776t.C2783f h = this.f8781q.get(i).mo9989h();
                if (h.ordinal() > fVar.ordinal()) {
                    fVar = h;
                }
            }
        }
        return fVar;
    }

    /* renamed from: e */
    static Bitmap m12107e(C6300s sVar, C2789w wVar) throws IOException {
        C6281e d = C6288l.m25933d(sVar);
        boolean r = C2748d0.m12155r(d);
        boolean z = wVar.f8923r && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options d2 = C2793y.m12269d(wVar);
        boolean g = C2793y.m12270g(d2);
        if (r || z) {
            byte[] v = d.mo17856v();
            if (g) {
                BitmapFactory.decodeByteArray(v, 0, v.length, d2);
                C2793y.m12268b(wVar.f8913h, wVar.f8914i, d2, wVar);
            }
            return BitmapFactory.decodeByteArray(v, 0, v.length, d2);
        }
        InputStream inputStream = d.inputStream();
        if (g) {
            C2767n nVar = new C2767n(inputStream);
            nVar.mo10077a(false);
            long j = nVar.mo10081j(1024);
            BitmapFactory.decodeStream(nVar, (Rect) null, d2);
            C2793y.m12268b(wVar.f8913h, wVar.f8914i, d2, wVar);
            nVar.mo10080h(j);
            nVar.mo10077a(true);
            inputStream = nVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, d2);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: g */
    static C2739c m12108g(C2776t tVar, C2756i iVar, C2747d dVar, C2734a0 a0Var, C2732a aVar) {
        C2789w i = aVar.mo9990i();
        List<C2793y> h = tVar.mo10097h();
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2793y yVar = h.get(i2);
            if (yVar.mo10008c(i)) {
                return new C2739c(tVar, iVar, dVar, a0Var, aVar, yVar);
            }
        }
        return new C2739c(tVar, iVar, dVar, a0Var, aVar, f8767B);
    }

    /* renamed from: l */
    static int m12109l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static int m12110m(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    /* renamed from: v */
    private static boolean m12111v(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02a0  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m12112y(com.squareup.picasso.C2789w r26, android.graphics.Bitmap r27, int r28) {
        /*
            r0 = r26
            int r1 = r27.getWidth()
            int r2 = r27.getHeight()
            boolean r3 = r0.f8918m
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            boolean r4 = r26.mo10122e()
            if (r4 != 0) goto L_0x001f
            if (r28 == 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r3 = r1
            r5 = r2
            r0 = r9
            goto L_0x028c
        L_0x001f:
            int r4 = r0.f8913h
            int r6 = r0.f8914i
            float r7 = r0.f8919n
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x017f
            double r10 = (double) r7
            double r12 = java.lang.Math.toRadians(r10)
            double r12 = java.lang.Math.cos(r12)
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = java.lang.Math.sin(r10)
            boolean r4 = r0.f8922q
            if (r4 == 0) goto L_0x00f8
            float r4 = r0.f8920o
            float r6 = r0.f8921p
            r9.setRotate(r7, r4, r6)
            float r4 = r0.f8920o
            double r6 = (double) r4
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 - r12
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r14
            float r8 = r0.f8921p
            r17 = r6
            double r5 = (double) r8
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r10
            double r6 = r17 + r5
            r5 = r2
            r17 = r3
            double r2 = (double) r8
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r14
            double r14 = (double) r4
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r10
            double r2 = r2 - r14
            int r4 = r0.f8913h
            double r14 = (double) r4
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r12
            double r14 = r14 + r6
            r18 = r9
            double r8 = (double) r4
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r10
            double r8 = r8 + r2
            r19 = r8
            double r8 = (double) r4
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r12
            double r8 = r8 + r6
            r21 = r5
            int r5 = r0.f8914i
            r22 = r1
            double r0 = (double) r5
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r10
            double r8 = r8 - r0
            double r0 = (double) r4
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r10
            double r0 = r0 + r2
            r23 = r8
            double r8 = (double) r5
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r12
            double r0 = r0 + r8
            double r8 = (double) r5
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r10
            double r8 = r6 - r8
            double r4 = (double) r5
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r12
            double r4 = r4 + r2
            double r10 = java.lang.Math.max(r6, r14)
            r12 = r23
            double r10 = java.lang.Math.max(r12, r10)
            double r10 = java.lang.Math.max(r8, r10)
            double r6 = java.lang.Math.min(r6, r14)
            double r6 = java.lang.Math.min(r12, r6)
            double r6 = java.lang.Math.min(r8, r6)
            r8 = r19
            double r12 = java.lang.Math.max(r2, r8)
            double r12 = java.lang.Math.max(r0, r12)
            double r12 = java.lang.Math.max(r4, r12)
            double r2 = java.lang.Math.min(r2, r8)
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r4, r0)
            double r10 = r10 - r6
            double r2 = java.lang.Math.floor(r10)
            int r4 = (int) r2
            double r12 = r12 - r0
            double r0 = java.lang.Math.floor(r12)
            int r6 = (int) r0
            r0 = r18
            goto L_0x0186
        L_0x00f8:
            r22 = r1
            r21 = r2
            r17 = r3
            r0 = r9
            r0.setRotate(r7)
            r1 = r26
            int r2 = r1.f8913h
            double r3 = (double) r2
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r12
            double r5 = (double) r2
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r10
            double r7 = (double) r2
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r12
            int r9 = r1.f8914i
            double r14 = (double) r9
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r10
            double r7 = r7 - r14
            double r14 = (double) r2
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r10
            double r1 = (double) r9
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r12
            double r14 = r14 + r1
            double r1 = (double) r9
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r10
            double r1 = -r1
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r12
            r11 = 0
            r18 = r9
            double r9 = java.lang.Math.max(r11, r3)
            double r9 = java.lang.Math.max(r7, r9)
            double r9 = java.lang.Math.max(r1, r9)
            double r3 = java.lang.Math.min(r11, r3)
            double r3 = java.lang.Math.min(r7, r3)
            double r1 = java.lang.Math.min(r1, r3)
            double r3 = java.lang.Math.max(r11, r5)
            double r3 = java.lang.Math.max(r14, r3)
            r7 = r18
            double r3 = java.lang.Math.max(r7, r3)
            double r5 = java.lang.Math.min(r11, r5)
            double r5 = java.lang.Math.min(r14, r5)
            double r5 = java.lang.Math.min(r7, r5)
            double r9 = r9 - r1
            double r1 = java.lang.Math.floor(r9)
            int r1 = (int) r1
            double r3 = r3 - r5
            double r2 = java.lang.Math.floor(r3)
            int r6 = (int) r2
            r4 = r1
            goto L_0x0186
        L_0x017f:
            r22 = r1
            r21 = r2
            r17 = r3
            r0 = r9
        L_0x0186:
            if (r28 == 0) goto L_0x01ac
            int r1 = m12109l(r28)
            int r2 = m12110m(r28)
            if (r1 == 0) goto L_0x01a3
            float r3 = (float) r1
            r0.preRotate(r3)
            r3 = 90
            if (r1 == r3) goto L_0x019e
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L_0x01a3
        L_0x019e:
            r25 = r6
            r6 = r4
            r4 = r25
        L_0x01a3:
            r1 = 1
            if (r2 == r1) goto L_0x01ac
            float r1 = (float) r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r1, r2)
        L_0x01ac:
            r1 = r26
            boolean r2 = r1.f8915j
            if (r2 == 0) goto L_0x0241
            if (r4 == 0) goto L_0x01bc
            float r2 = (float) r4
            r3 = r22
            float r5 = (float) r3
            float r2 = r2 / r5
            r5 = r21
            goto L_0x01c3
        L_0x01bc:
            r3 = r22
            float r2 = (float) r6
            r5 = r21
            float r7 = (float) r5
            float r2 = r2 / r7
        L_0x01c3:
            if (r6 == 0) goto L_0x01c8
            float r7 = (float) r6
            float r8 = (float) r5
            goto L_0x01ca
        L_0x01c8:
            float r7 = (float) r4
            float r8 = (float) r3
        L_0x01ca:
            float r7 = r7 / r8
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x01fa
            float r8 = (float) r5
            float r7 = r7 / r2
            float r8 = r8 * r7
            double r7 = (double) r8
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            int r1 = r1.f8916k
            r8 = r1 & 48
            r9 = 48
            if (r8 != r9) goto L_0x01e3
            r1 = 0
            goto L_0x01ef
        L_0x01e3:
            r8 = 80
            r1 = r1 & r8
            if (r1 != r8) goto L_0x01eb
            int r1 = r5 - r7
            goto L_0x01ef
        L_0x01eb:
            int r1 = r5 - r7
            int r1 = r1 / 2
        L_0x01ef:
            float r8 = (float) r6
            float r9 = (float) r7
            float r8 = r8 / r9
            r9 = r7
            r10 = r17
            r16 = 0
            r7 = r1
            r1 = r3
            goto L_0x0232
        L_0x01fa:
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x0229
            float r8 = (float) r3
            float r2 = r2 / r7
            float r8 = r8 * r2
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r2 = (int) r8
            int r1 = r1.f8916k
            r8 = r1 & 3
            r9 = 3
            if (r8 != r9) goto L_0x0211
            r1 = 0
            goto L_0x021c
        L_0x0211:
            r8 = 5
            r1 = r1 & r8
            if (r1 != r8) goto L_0x0218
            int r1 = r3 - r2
            goto L_0x021c
        L_0x0218:
            int r1 = r3 - r2
            int r1 = r1 / 2
        L_0x021c:
            float r8 = (float) r4
            float r9 = (float) r2
            float r8 = r8 / r9
            r16 = r1
            r1 = r2
            r9 = r5
            r2 = r8
            r10 = r17
            r8 = r7
            r7 = 0
            goto L_0x0232
        L_0x0229:
            r1 = r3
            r9 = r5
            r2 = r7
            r8 = r2
            r10 = r17
            r7 = 0
            r16 = 0
        L_0x0232:
            boolean r3 = m12111v(r10, r3, r5, r4, r6)
            if (r3 == 0) goto L_0x023b
            r0.preScale(r2, r8)
        L_0x023b:
            r6 = r7
            r8 = r9
            r5 = r16
            r7 = r1
            goto L_0x0290
        L_0x0241:
            r10 = r17
            r5 = r21
            r3 = r22
            boolean r1 = r1.f8917l
            if (r1 == 0) goto L_0x026b
            if (r4 == 0) goto L_0x0250
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x0252
        L_0x0250:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x0252:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x0258
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x025a
        L_0x0258:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x025a:
            float r2 = r2 / r7
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            r1 = r2
        L_0x0261:
            boolean r2 = m12111v(r10, r3, r5, r4, r6)
            if (r2 == 0) goto L_0x028c
            r0.preScale(r1, r1)
            goto L_0x028c
        L_0x026b:
            if (r4 != 0) goto L_0x026f
            if (r6 == 0) goto L_0x028c
        L_0x026f:
            if (r4 != r3) goto L_0x0273
            if (r6 == r5) goto L_0x028c
        L_0x0273:
            if (r4 == 0) goto L_0x0278
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x027a
        L_0x0278:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x027a:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x0280
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x0282
        L_0x0280:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x0282:
            float r2 = r2 / r7
            boolean r4 = m12111v(r10, r3, r5, r4, r6)
            if (r4 == 0) goto L_0x028c
            r0.preScale(r1, r2)
        L_0x028c:
            r7 = r3
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x0290:
            r10 = 1
            r4 = r27
            r9 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            r1 = r27
            if (r0 == r1) goto L_0x02a0
            r27.recycle()
            goto L_0x02a1
        L_0x02a0:
            r0 = r1
        L_0x02a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C2739c.m12112y(com.squareup.picasso.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: z */
    static void m12113z(C2789w wVar) {
        String a = wVar.mo10118a();
        StringBuilder sb = f8769z.get();
        sb.ensureCapacity(a.length() + 8);
        sb.replace(8, sb.length(), a);
        Thread.currentThread().setName(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10012b(C2732a aVar) {
        String str;
        String str2;
        boolean z = this.f8771g.f8871n;
        C2789w wVar = aVar.f8720b;
        if (this.f8780p == null) {
            this.f8780p = aVar;
            if (z) {
                List<C2732a> list = this.f8781q;
                if (list == null || list.isEmpty()) {
                    str = wVar.mo10121d();
                    str2 = "to empty hunter";
                } else {
                    str = wVar.mo10121d();
                    str2 = C2748d0.m12148k(this, "to ");
                }
                C2748d0.m12157t("Hunter", "joined", str, str2);
                return;
            }
            return;
        }
        if (this.f8781q == null) {
            this.f8781q = new ArrayList(3);
        }
        this.f8781q.add(aVar);
        if (z) {
            C2748d0.m12157t("Hunter", "joined", wVar.mo10121d(), C2748d0.m12148k(this, "to "));
        }
        C2776t.C2783f h = aVar.mo9989h();
        if (h.ordinal() > this.f8788x.ordinal()) {
            this.f8788x = h;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f8783s;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10013c() {
        /*
            r2 = this;
            com.squareup.picasso.a r0 = r2.f8780p
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.List<com.squareup.picasso.a> r0 = r2.f8781q
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.f8783s
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C2739c.mo10013c():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10014f(C2732a aVar) {
        boolean z;
        if (this.f8780p == aVar) {
            this.f8780p = null;
            z = true;
        } else {
            List<C2732a> list = this.f8781q;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.mo9989h() == this.f8788x) {
            this.f8788x = m12106d();
        }
        if (this.f8771g.f8871n) {
            C2748d0.m12157t("Hunter", "removed", aVar.f8720b.mo10121d(), C2748d0.m12148k(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2732a mo10015h() {
        return this.f8780p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public List<C2732a> mo10016i() {
        return this.f8781q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C2789w mo10017j() {
        return this.f8776l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Exception mo10018k() {
        return this.f8785u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo10019n() {
        return this.f8775k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C2776t.C2782e mo10020o() {
        return this.f8784t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo10021p() {
        return this.f8777m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C2776t mo10022q() {
        return this.f8771g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C2776t.C2783f mo10023r() {
        return this.f8788x;
    }

    public void run() {
        C2756i iVar;
        try {
            m12113z(this.f8776l);
            if (this.f8771g.f8871n) {
                C2748d0.m12156s("Hunter", "executing", C2748d0.m12147j(this));
            }
            Bitmap t = mo10026t();
            this.f8782r = t;
            if (t == null) {
                this.f8772h.mo10055e(this);
            } else {
                this.f8772h.mo10054d(this);
            }
        } catch (C2772r.C2774b e) {
            if (!C2771q.m12213e(e.f8853g) || e.f8852f != 504) {
                this.f8785u = e;
            }
            iVar = this.f8772h;
        } catch (IOException e2) {
            this.f8785u = e2;
            this.f8772h.mo10057g(this);
        } catch (OutOfMemoryError e3) {
            StringWriter stringWriter = new StringWriter();
            this.f8774j.mo9995a().mo10010a(new PrintWriter(stringWriter));
            this.f8785u = new RuntimeException(stringWriter.toString(), e3);
            iVar = this.f8772h;
        } catch (Exception e4) {
            this.f8785u = e4;
            iVar = this.f8772h;
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
        iVar.mo10055e(this);
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Bitmap mo10025s() {
        return this.f8782r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Bitmap mo10026t() throws IOException {
        Bitmap bitmap;
        if (C2770p.m12211e(this.f8777m)) {
            bitmap = this.f8773i.mo10038a(this.f8775k);
            if (bitmap != null) {
                this.f8774j.mo9998d();
                this.f8784t = C2776t.C2782e.MEMORY;
                if (this.f8771g.f8871n) {
                    C2748d0.m12157t("Hunter", "decoded", this.f8776l.mo10121d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i = this.f8787w == 0 ? C2771q.OFFLINE.f8849f : this.f8778n;
        this.f8778n = i;
        C2793y.C2794a f = this.f8779o.mo10009f(this.f8776l, i);
        if (f != null) {
            this.f8784t = f.mo10138c();
            this.f8786v = f.mo10137b();
            bitmap = f.mo10136a();
            if (bitmap == null) {
                C6300s d = f.mo10139d();
                try {
                    bitmap = m12107e(d, this.f8776l);
                } finally {
                    try {
                        d.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f8771g.f8871n) {
                C2748d0.m12156s("Hunter", "decoded", this.f8776l.mo10121d());
            }
            this.f8774j.mo9996b(bitmap);
            if (this.f8776l.mo10123f() || this.f8786v != 0) {
                synchronized (f8768y) {
                    if (this.f8776l.mo10122e() || this.f8786v != 0) {
                        bitmap = m12112y(this.f8776l, bitmap, this.f8786v);
                        if (this.f8771g.f8871n) {
                            C2748d0.m12156s("Hunter", "transformed", this.f8776l.mo10121d());
                        }
                    }
                    if (this.f8776l.mo10119b()) {
                        bitmap = m12105a(this.f8776l.f8912g, bitmap);
                        if (this.f8771g.f8871n) {
                            C2748d0.m12157t("Hunter", "transformed", this.f8776l.mo10121d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f8774j.mo9997c(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo10027u() {
        Future<?> future = this.f8783s;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo10028w(boolean z, NetworkInfo networkInfo) {
        if (!(this.f8787w > 0)) {
            return false;
        }
        this.f8787w--;
        return this.f8779o.mo10090h(z, networkInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo10029x() {
        return this.f8779o.mo10091i();
    }
}
