package com.bumptech.glide.p021m;

import android.graphics.Bitmap;
import com.bumptech.glide.p021m.C1318a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.m.e */
public class C1323e implements C1318a {

    /* renamed from: u */
    private static final String f4600u = "e";

    /* renamed from: a */
    private int[] f4601a;

    /* renamed from: b */
    private final int[] f4602b;

    /* renamed from: c */
    private final C1318a.C1319a f4603c;

    /* renamed from: d */
    private ByteBuffer f4604d;

    /* renamed from: e */
    private byte[] f4605e;

    /* renamed from: f */
    private short[] f4606f;

    /* renamed from: g */
    private byte[] f4607g;

    /* renamed from: h */
    private byte[] f4608h;

    /* renamed from: i */
    private byte[] f4609i;

    /* renamed from: j */
    private int[] f4610j;

    /* renamed from: k */
    private int f4611k;

    /* renamed from: l */
    private C1321c f4612l;

    /* renamed from: m */
    private Bitmap f4613m;

    /* renamed from: n */
    private boolean f4614n;

    /* renamed from: o */
    private int f4615o;

    /* renamed from: p */
    private int f4616p;

    /* renamed from: q */
    private int f4617q;

    /* renamed from: r */
    private int f4618r;

    /* renamed from: s */
    private Boolean f4619s;

    /* renamed from: t */
    private Bitmap.Config f4620t;

    public C1323e(C1318a.C1319a aVar) {
        this.f4602b = new int[256];
        this.f4620t = Bitmap.Config.ARGB_8888;
        this.f4603c = aVar;
        this.f4612l = new C1321c();
    }

    public C1323e(C1318a.C1319a aVar, C1321c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo5694r(cVar, byteBuffer, i);
    }

    /* renamed from: j */
    private int m6598j(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f4616p + i; i9++) {
            byte[] bArr = this.f4609i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f4601a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f4616p + i11; i12++) {
            byte[] bArr2 = this.f4609i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f4601a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: k */
    private void m6599k(C1320b bVar) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C1320b bVar2 = bVar;
        int[] iArr = this.f4610j;
        int i6 = bVar2.f4575d;
        int i7 = this.f4616p;
        int i8 = i6 / i7;
        int i9 = bVar2.f4573b / i7;
        int i10 = bVar2.f4574c / i7;
        int i11 = bVar2.f4572a / i7;
        boolean z = this.f4611k == 0;
        int i12 = this.f4616p;
        int i13 = this.f4618r;
        int i14 = this.f4617q;
        byte[] bArr = this.f4609i;
        int[] iArr2 = this.f4601a;
        Boolean bool2 = this.f4619s;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (true) {
            bool = bool2;
            if (i16 >= i8) {
                break;
            }
            if (bVar2.f4576e) {
                if (i17 >= i8) {
                    i = i8;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 != 3) {
                        i18 = i19;
                        if (i19 == 4) {
                            i17 = 1;
                            i15 = 2;
                        }
                    } else {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    }
                } else {
                    i = i8;
                }
                i2 = i17 + i15;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z2 = i12 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i2;
                int i25 = i16 * i12 * bVar2.f4574c;
                if (z2) {
                    int i26 = i22;
                    while (true) {
                        i5 = i9;
                        if (i26 >= i23) {
                            break;
                        }
                        int i27 = iArr2[bArr[i25] & 255];
                        if (i27 != 0) {
                            iArr[i26] = i27;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i25 += i12;
                        i26++;
                        i9 = i5;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i23 - i22) * i12) + i25;
                    int i29 = i22;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i23) {
                            break;
                        }
                        int j = m6598j(i25, i28, bVar2.f4574c);
                        if (j != 0) {
                            iArr[i29] = j;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i25 += i12;
                        i29++;
                        i10 = i4;
                    }
                    bool2 = bool;
                    i16++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i17 = i3;
                }
            } else {
                i3 = i2;
                i5 = i9;
            }
            i4 = i10;
            bool2 = bool;
            i16++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i17 = i3;
        }
        if (this.f4619s == null) {
            this.f4619s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: l */
    private void m6600l(C1320b bVar) {
        C1320b bVar2 = bVar;
        int[] iArr = this.f4610j;
        int i = bVar2.f4575d;
        int i2 = bVar2.f4573b;
        int i3 = bVar2.f4574c;
        int i4 = bVar2.f4572a;
        boolean z = this.f4611k == 0;
        int i5 = this.f4618r;
        byte[] bArr = this.f4609i;
        int[] iArr2 = this.f4601a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f4574c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C1320b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f4619s;
        this.f4619s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f4619s == null && z && b != -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6601m(com.bumptech.glide.p021m.C1320b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f4604d
            int r3 = r1.f4581j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.bumptech.glide.m.c r1 = r0.f4612l
            int r2 = r1.f4588f
            int r1 = r1.f4589g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f4574c
            int r1 = r1.f4575d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f4609i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            com.bumptech.glide.m.a$a r1 = r0.f4603c
            byte[] r1 = r1.mo5620c(r2)
            r0.f4609i = r1
        L_0x002b:
            byte[] r1 = r0.f4609i
            short[] r3 = r0.f4606f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f4606f = r3
        L_0x0037:
            short[] r3 = r0.f4606f
            byte[] r5 = r0.f4607g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f4607g = r5
        L_0x0041:
            byte[] r5 = r0.f4607g
            byte[] r6 = r0.f4608h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f4608h = r6
        L_0x004d:
            byte[] r6 = r0.f4608h
            int r7 = r28.m6604q()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f4605e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014c
            if (r16 != 0) goto L_0x0094
            int r16 = r28.m6603p()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f4615o = r3
            goto L_0x014c
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p021m.C1323e.m6601m(com.bumptech.glide.m.b):void");
    }

    /* renamed from: o */
    private Bitmap m6602o() {
        Boolean bool = this.f4619s;
        Bitmap a = this.f4603c.mo5618a(this.f4618r, this.f4617q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f4620t);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: p */
    private int m6603p() {
        int q = m6604q();
        if (q <= 0) {
            return q;
        }
        ByteBuffer byteBuffer = this.f4604d;
        byteBuffer.get(this.f4605e, 0, Math.min(q, byteBuffer.remaining()));
        return q;
    }

    /* renamed from: q */
    private int m6604q() {
        return this.f4604d.get() & 255;
    }

    /* renamed from: s */
    private Bitmap m6605s(C1320b bVar, C1320b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f4610j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f4613m;
            if (bitmap2 != null) {
                this.f4603c.mo5623f(bitmap2);
            }
            this.f4613m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f4578g == 3 && this.f4613m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f4578g) > 0) {
            if (i2 == 2) {
                if (!bVar.f4577f) {
                    C1321c cVar = this.f4612l;
                    int i4 = cVar.f4594l;
                    if (bVar.f4582k == null || cVar.f4592j != bVar.f4579h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f4575d;
                int i6 = this.f4616p;
                int i7 = i5 / i6;
                int i8 = bVar2.f4573b / i6;
                int i9 = bVar2.f4574c / i6;
                int i10 = bVar2.f4572a / i6;
                int i11 = this.f4618r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f4618r;
                }
            } else if (i2 == 3 && (bitmap = this.f4613m) != null) {
                int i16 = this.f4618r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f4617q);
            }
        }
        m6601m(bVar);
        if (bVar.f4576e || this.f4616p != 1) {
            m6599k(bVar);
        } else {
            m6600l(bVar);
        }
        if (this.f4614n && ((i = bVar.f4578g) == 0 || i == 1)) {
            if (this.f4613m == null) {
                this.f4613m = m6602o();
            }
            Bitmap bitmap3 = this.f4613m;
            int i17 = this.f4618r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f4617q);
        }
        Bitmap o = m6602o();
        int i18 = this.f4618r;
        o.setPixels(iArr, 0, i18, 0, 0, i18, this.f4617q);
        return o;
    }

    /* renamed from: a */
    public int mo5676a() {
        return this.f4611k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ed, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo5677b() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.m.c r0 = r8.f4612l     // Catch:{ all -> 0x00ee }
            int r0 = r0.f4585c     // Catch:{ all -> 0x00ee }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f4611k     // Catch:{ all -> 0x00ee }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = f4600u     // Catch:{ all -> 0x00ee }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = f4600u     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r3.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00ee }
            com.bumptech.glide.m.c r4 = r8.f4612l     // Catch:{ all -> 0x00ee }
            int r4 = r4.f4585c     // Catch:{ all -> 0x00ee }
            r3.append(r4)     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00ee }
            int r4 = r8.f4611k     // Catch:{ all -> 0x00ee }
            r3.append(r4)     // Catch:{ all -> 0x00ee }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ee }
        L_0x0039:
            r8.f4615o = r2     // Catch:{ all -> 0x00ee }
        L_0x003b:
            int r0 = r8.f4615o     // Catch:{ all -> 0x00ee }
            r3 = 0
            if (r0 == r2) goto L_0x00cc
            int r0 = r8.f4615o     // Catch:{ all -> 0x00ee }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00cc
        L_0x0047:
            r0 = 0
            r8.f4615o = r0     // Catch:{ all -> 0x00ee }
            byte[] r5 = r8.f4605e     // Catch:{ all -> 0x00ee }
            if (r5 != 0) goto L_0x0058
            com.bumptech.glide.m.a$a r5 = r8.f4603c     // Catch:{ all -> 0x00ee }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo5620c(r6)     // Catch:{ all -> 0x00ee }
            r8.f4605e = r5     // Catch:{ all -> 0x00ee }
        L_0x0058:
            com.bumptech.glide.m.c r5 = r8.f4612l     // Catch:{ all -> 0x00ee }
            java.util.List<com.bumptech.glide.m.b> r5 = r5.f4587e     // Catch:{ all -> 0x00ee }
            int r6 = r8.f4611k     // Catch:{ all -> 0x00ee }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00ee }
            com.bumptech.glide.m.b r5 = (com.bumptech.glide.p021m.C1320b) r5     // Catch:{ all -> 0x00ee }
            int r6 = r8.f4611k     // Catch:{ all -> 0x00ee }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0074
            com.bumptech.glide.m.c r7 = r8.f4612l     // Catch:{ all -> 0x00ee }
            java.util.List<com.bumptech.glide.m.b> r7 = r7.f4587e     // Catch:{ all -> 0x00ee }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00ee }
            com.bumptech.glide.m.b r6 = (com.bumptech.glide.p021m.C1320b) r6     // Catch:{ all -> 0x00ee }
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            int[] r7 = r5.f4582k     // Catch:{ all -> 0x00ee }
            if (r7 == 0) goto L_0x007c
            int[] r7 = r5.f4582k     // Catch:{ all -> 0x00ee }
            goto L_0x0080
        L_0x007c:
            com.bumptech.glide.m.c r7 = r8.f4612l     // Catch:{ all -> 0x00ee }
            int[] r7 = r7.f4583a     // Catch:{ all -> 0x00ee }
        L_0x0080:
            r8.f4601a = r7     // Catch:{ all -> 0x00ee }
            if (r7 != 0) goto L_0x00a8
            java.lang.String r0 = f4600u     // Catch:{ all -> 0x00ee }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = f4600u     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00ee }
            int r4 = r8.f4611k     // Catch:{ all -> 0x00ee }
            r1.append(r4)     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ee }
        L_0x00a4:
            r8.f4615o = r2     // Catch:{ all -> 0x00ee }
            monitor-exit(r8)
            return r3
        L_0x00a8:
            boolean r1 = r5.f4577f     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r8.f4602b     // Catch:{ all -> 0x00ee }
            int r2 = r7.length     // Catch:{ all -> 0x00ee }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00ee }
            int[] r1 = r8.f4602b     // Catch:{ all -> 0x00ee }
            r8.f4601a = r1     // Catch:{ all -> 0x00ee }
            int r2 = r5.f4579h     // Catch:{ all -> 0x00ee }
            r1[r2] = r0     // Catch:{ all -> 0x00ee }
            int r0 = r5.f4578g     // Catch:{ all -> 0x00ee }
            if (r0 != r4) goto L_0x00c6
            int r0 = r8.f4611k     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00c6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ee }
            r8.f4619s = r0     // Catch:{ all -> 0x00ee }
        L_0x00c6:
            android.graphics.Bitmap r0 = r8.m6605s(r5, r6)     // Catch:{ all -> 0x00ee }
            monitor-exit(r8)
            return r0
        L_0x00cc:
            java.lang.String r0 = f4600u     // Catch:{ all -> 0x00ee }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = f4600u     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00ee }
            int r2 = r8.f4615o     // Catch:{ all -> 0x00ee }
            r1.append(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r8)
            return r3
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p021m.C1323e.mo5677b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    public void mo5678c() {
        this.f4611k = (this.f4611k + 1) % this.f4612l.f4585c;
    }

    public void clear() {
        this.f4612l = null;
        byte[] bArr = this.f4609i;
        if (bArr != null) {
            this.f4603c.mo5619b(bArr);
        }
        int[] iArr = this.f4610j;
        if (iArr != null) {
            this.f4603c.mo5621d(iArr);
        }
        Bitmap bitmap = this.f4613m;
        if (bitmap != null) {
            this.f4603c.mo5623f(bitmap);
        }
        this.f4613m = null;
        this.f4604d = null;
        this.f4619s = null;
        byte[] bArr2 = this.f4605e;
        if (bArr2 != null) {
            this.f4603c.mo5619b(bArr2);
        }
    }

    /* renamed from: d */
    public int mo5680d() {
        return this.f4612l.f4585c;
    }

    /* renamed from: e */
    public int mo5681e() {
        int i;
        if (this.f4612l.f4585c <= 0 || (i = this.f4611k) < 0) {
            return 0;
        }
        return mo5693n(i);
    }

    /* renamed from: f */
    public int mo5682f() {
        return this.f4604d.limit() + this.f4609i.length + (this.f4610j.length * 4);
    }

    /* renamed from: g */
    public void mo5683g(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f4620t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: h */
    public ByteBuffer mo5684h() {
        return this.f4604d;
    }

    /* renamed from: i */
    public void mo5685i() {
        this.f4611k = -1;
    }

    /* renamed from: n */
    public int mo5693n(int i) {
        if (i >= 0) {
            C1321c cVar = this.f4612l;
            if (i < cVar.f4585c) {
                return cVar.f4587e.get(i).f4580i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public synchronized void mo5694r(C1321c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f4615o = 0;
            this.f4612l = cVar;
            this.f4611k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f4604d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f4604d.order(ByteOrder.LITTLE_ENDIAN);
            this.f4614n = false;
            Iterator<C1320b> it = cVar.f4587e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f4578g == 3) {
                        this.f4614n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f4616p = highestOneBit;
            this.f4618r = cVar.f4588f / highestOneBit;
            this.f4617q = cVar.f4589g / highestOneBit;
            this.f4609i = this.f4603c.mo5620c(cVar.f4588f * cVar.f4589g);
            this.f4610j = this.f4603c.mo5622e(this.f4618r * this.f4617q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }
}
