package p148g.p189d.p190a.p200b.p219o0.p221n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.n.b */
final class C4178b {

    /* renamed from: h */
    private static final byte[] f13300h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f13301i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f13302j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f13303a;

    /* renamed from: b */
    private final Paint f13304b;

    /* renamed from: c */
    private final Canvas f13305c = new Canvas();

    /* renamed from: d */
    private final C4180b f13306d = new C4180b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    private final C4179a f13307e = new C4179a(0, m17709c(), m17710d(), m17711e());

    /* renamed from: f */
    private final C4186h f13308f;

    /* renamed from: g */
    private Bitmap f13309g;

    /* renamed from: g.d.a.b.o0.n.b$a */
    private static final class C4179a {

        /* renamed from: a */
        public final int f13310a;

        /* renamed from: b */
        public final int[] f13311b;

        /* renamed from: c */
        public final int[] f13312c;

        /* renamed from: d */
        public final int[] f13313d;

        public C4179a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f13310a = i;
            this.f13311b = iArr;
            this.f13312c = iArr2;
            this.f13313d = iArr3;
        }
    }

    /* renamed from: g.d.a.b.o0.n.b$b */
    private static final class C4180b {

        /* renamed from: a */
        public final int f13314a;

        /* renamed from: b */
        public final int f13315b;

        /* renamed from: c */
        public final int f13316c;

        /* renamed from: d */
        public final int f13317d;

        /* renamed from: e */
        public final int f13318e;

        /* renamed from: f */
        public final int f13319f;

        public C4180b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f13314a = i;
            this.f13315b = i2;
            this.f13316c = i3;
            this.f13317d = i4;
            this.f13318e = i5;
            this.f13319f = i6;
        }
    }

    /* renamed from: g.d.a.b.o0.n.b$c */
    private static final class C4181c {

        /* renamed from: a */
        public final int f13320a;

        /* renamed from: b */
        public final boolean f13321b;

        /* renamed from: c */
        public final byte[] f13322c;

        /* renamed from: d */
        public final byte[] f13323d;

        public C4181c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f13320a = i;
            this.f13321b = z;
            this.f13322c = bArr;
            this.f13323d = bArr2;
        }
    }

    /* renamed from: g.d.a.b.o0.n.b$d */
    private static final class C4182d {

        /* renamed from: a */
        public final int f13324a;

        /* renamed from: b */
        public final int f13325b;

        /* renamed from: c */
        public final SparseArray<C4183e> f13326c;

        public C4182d(int i, int i2, int i3, SparseArray<C4183e> sparseArray) {
            this.f13324a = i2;
            this.f13325b = i3;
            this.f13326c = sparseArray;
        }
    }

    /* renamed from: g.d.a.b.o0.n.b$e */
    private static final class C4183e {

        /* renamed from: a */
        public final int f13327a;

        /* renamed from: b */
        public final int f13328b;

        public C4183e(int i, int i2) {
            this.f13327a = i;
            this.f13328b = i2;
        }
    }

    /* renamed from: g.d.a.b.o0.n.b$f */
    private static final class C4184f {

        /* renamed from: a */
        public final int f13329a;

        /* renamed from: b */
        public final boolean f13330b;

        /* renamed from: c */
        public final int f13331c;

        /* renamed from: d */
        public final int f13332d;

        /* renamed from: e */
        public final int f13333e;

        /* renamed from: f */
        public final int f13334f;

        /* renamed from: g */
        public final int f13335g;

        /* renamed from: h */
        public final int f13336h;

        /* renamed from: i */
        public final int f13337i;

        /* renamed from: j */
        public final SparseArray<C4185g> f13338j;

        public C4184f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C4185g> sparseArray) {
            this.f13329a = i;
            this.f13330b = z;
            this.f13331c = i2;
            this.f13332d = i3;
            this.f13333e = i5;
            this.f13334f = i6;
            this.f13335g = i7;
            this.f13336h = i8;
            this.f13337i = i9;
            this.f13338j = sparseArray;
        }

        /* renamed from: a */
        public void mo13247a(C4184f fVar) {
            if (fVar != null) {
                SparseArray<C4185g> sparseArray = fVar.f13338j;
                for (int i = 0; i < sparseArray.size(); i++) {
                    this.f13338j.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                }
            }
        }
    }

    /* renamed from: g.d.a.b.o0.n.b$g */
    private static final class C4185g {

        /* renamed from: a */
        public final int f13339a;

        /* renamed from: b */
        public final int f13340b;

        public C4185g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f13339a = i3;
            this.f13340b = i4;
        }
    }

    /* renamed from: g.d.a.b.o0.n.b$h */
    private static final class C4186h {

        /* renamed from: a */
        public final int f13341a;

        /* renamed from: b */
        public final int f13342b;

        /* renamed from: c */
        public final SparseArray<C4184f> f13343c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C4179a> f13344d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C4181c> f13345e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C4179a> f13346f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C4181c> f13347g = new SparseArray<>();

        /* renamed from: h */
        public C4180b f13348h;

        /* renamed from: i */
        public C4182d f13349i;

        public C4186h(int i, int i2) {
            this.f13341a = i;
            this.f13342b = i2;
        }

        /* renamed from: a */
        public void mo13248a() {
            this.f13343c.clear();
            this.f13344d.clear();
            this.f13345e.clear();
            this.f13346f.clear();
            this.f13347g.clear();
            this.f13348h = null;
            this.f13349i = null;
        }
    }

    public C4178b(int i, int i2) {
        Paint paint = new Paint();
        this.f13303a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f13303a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f13303a.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f13304b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f13304b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f13304b.setPathEffect((PathEffect) null);
        this.f13308f = new C4186h(i, i2);
    }

    /* renamed from: a */
    private static byte[] m17708a(int i, int i2, C4273l lVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) lVar.mo13436h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    private static int[] m17709c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    private static int[] m17710d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m17712f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m17712f(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static int[] m17711e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m17712f(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m17712f(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m17712f(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m17712f(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m17712f(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    private static int m17712f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[LOOP:0: B:1:0x0009->B:31:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m17713g(p148g.p189d.p190a.p200b.p230r0.C4273l r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.mo13436h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0059
        L_0x0014:
            boolean r4 = r13.mo13435g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.mo13436h(r6)
            int r4 = r4 + r6
        L_0x0020:
            int r3 = r13.mo13436h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0059
        L_0x0028:
            boolean r4 = r13.mo13435g()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.mo13436h(r3)
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x0052
            if (r4 == r3) goto L_0x004a
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0059
        L_0x0041:
            r4 = 8
            int r4 = r13.mo13436h(r4)
            int r4 = r4 + 29
            goto L_0x0020
        L_0x004a:
            r4 = 4
            int r4 = r13.mo13436h(r4)
            int r4 = r4 + 12
            goto L_0x0020
        L_0x0052:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0059
        L_0x0056:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0059:
            if (r12 == 0) goto L_0x0077
            if (r8 == 0) goto L_0x0077
            if (r15 == 0) goto L_0x0061
            byte r4 = r15[r4]
        L_0x0061:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0077:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x007b
            return r10
        L_0x007b:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p221n.C4178b.m17713g(g.d.a.b.r0.l, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[LOOP:0: B:1:0x0009->B:34:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m17714h(p148g.p189d.p190a.p200b.p230r0.C4273l r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.mo13436h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x0065
        L_0x0015:
            boolean r4 = r13.mo13435g()
            r7 = 3
            if (r4 != 0) goto L_0x002b
            int r3 = r13.mo13436h(r7)
            if (r3 == 0) goto L_0x0028
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x0065
        L_0x0028:
            r4 = 0
            r11 = 1
            goto L_0x004c
        L_0x002b:
            boolean r4 = r13.mo13435g()
            if (r4 != 0) goto L_0x003e
            int r4 = r13.mo13436h(r5)
            int r5 = r4 + 4
        L_0x0037:
            int r4 = r13.mo13436h(r3)
            r11 = r2
            r12 = r5
            goto L_0x0065
        L_0x003e:
            int r4 = r13.mo13436h(r5)
            if (r4 == 0) goto L_0x0062
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x0057
            if (r4 == r7) goto L_0x004e
            r11 = r2
            r4 = 0
        L_0x004c:
            r12 = 0
            goto L_0x0065
        L_0x004e:
            r4 = 8
            int r4 = r13.mo13436h(r4)
            int r5 = r4 + 25
            goto L_0x0037
        L_0x0057:
            int r4 = r13.mo13436h(r3)
            int r5 = r4 + 9
            goto L_0x0037
        L_0x005e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0065
        L_0x0062:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x0065:
            if (r12 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            if (r15 == 0) goto L_0x006d
            byte r4 = r15[r4]
        L_0x006d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0081:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0085
            return r10
        L_0x0085:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p221n.C4178b.m17714h(g.d.a.b.r0.l, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m17715i(p148g.p189d.p190a.p200b.p230r0.C4273l r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.mo13436h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.mo13435g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.mo13436h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.mo13436h(r6)
            int r3 = r13.mo13436h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p221n.C4178b.m17715i(g.d.a.b.r0.l, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: j */
    private static void m17716j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4 = i;
        byte[] bArr4 = bArr;
        C4273l lVar = new C4273l(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (lVar.mo13430b() != 0) {
            int h = lVar.mo13436h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                i5 = m17713g(lVar, iArr, bArr2, i5, i6, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr6 == null ? f13300h : bArr6;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f13301i : bArr5;
                        }
                        bArr2 = bArr3;
                        i5 = m17713g(lVar, iArr, bArr2, i5, i6, paint, canvas);
                    case 17:
                        i5 = m17714h(lVar, iArr, i4 == 3 ? f13302j : null, i5, i6, paint, canvas);
                        break;
                    case 18:
                        i5 = m17715i(lVar, iArr, (byte[]) null, i5, i6, paint, canvas);
                        continue;
                    default:
                        switch (h) {
                            case 32:
                                bArr6 = m17708a(4, 4, lVar);
                                break;
                            case 33:
                                bArr5 = m17708a(4, 8, lVar);
                                break;
                            case 34:
                                bArr5 = m17708a(16, 8, lVar);
                                break;
                            default:
                                continue;
                        }
                }
                lVar.mo13431c();
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: k */
    private static void m17717k(C4181c cVar, C4179a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? aVar.f13313d : i == 2 ? aVar.f13312c : aVar.f13311b;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m17716j(cVar.f13322c, iArr, i4, i5, i3, paint2, canvas2);
        m17716j(cVar.f13323d, iArr, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: l */
    private static C4179a m17718l(C4273l lVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C4273l lVar2 = lVar;
        int i7 = 8;
        int h = lVar2.mo13436h(8);
        lVar2.mo13443o(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m17709c();
        int[] d = m17710d();
        int[] e = m17711e();
        while (i9 > 0) {
            int h2 = lVar2.mo13436h(i7);
            int h3 = lVar2.mo13436h(i7);
            int i10 = i9 - 2;
            int[] iArr = (h3 & 128) != 0 ? c : (h3 & 64) != 0 ? d : e;
            if ((h3 & 1) != 0) {
                i5 = lVar2.mo13436h(i7);
                i4 = lVar2.mo13436h(i7);
                i3 = lVar2.mo13436h(i7);
                i2 = lVar2.mo13436h(i7);
                i6 = i10 - 4;
            } else {
                i3 = lVar2.mo13436h(4) << 4;
                i6 = i10 - 2;
                int h4 = lVar2.mo13436h(4) << 4;
                i2 = lVar2.mo13436h(i8) << 6;
                i5 = lVar2.mo13436h(6) << i8;
                i4 = h4;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            double d2 = (double) i5;
            double d3 = (double) (i4 - 128);
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d4 = (double) (i3 - 128);
            Double.isNaN(d4);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d2);
            iArr[h2] = m17712f((byte) (255 - (i2 & 255)), C4284w.m18243i((int) (d2 + (1.402d * d3)), 0, 255), C4284w.m18243i((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C4284w.m18243i((int) (d2 + (d4 * 1.772d)), 0, 255));
            i9 = i6;
            h = h;
            i7 = 8;
            i8 = 2;
        }
        return new C4179a(h, c, d, e);
    }

    /* renamed from: m */
    private static C4180b m17719m(C4273l lVar) {
        int i;
        int i2;
        int i3;
        int i4;
        lVar.mo13443o(4);
        boolean g = lVar.mo13435g();
        lVar.mo13443o(3);
        int h = lVar.mo13436h(16);
        int h2 = lVar.mo13436h(16);
        if (g) {
            int h3 = lVar.mo13436h(16);
            int h4 = lVar.mo13436h(16);
            int h5 = lVar.mo13436h(16);
            i = lVar.mo13436h(16);
            i3 = h4;
            i2 = h5;
            i4 = h3;
        } else {
            i3 = h;
            i = h2;
            i4 = 0;
            i2 = 0;
        }
        return new C4180b(h, h2, i4, i3, i2, i);
    }

    /* renamed from: n */
    private static C4181c m17720n(C4273l lVar) {
        byte[] bArr;
        int h = lVar.mo13436h(16);
        lVar.mo13443o(4);
        int h2 = lVar.mo13436h(2);
        boolean g = lVar.mo13435g();
        lVar.mo13443o(1);
        byte[] bArr2 = null;
        if (h2 == 1) {
            lVar.mo13443o(lVar.mo13436h(8) * 16);
        } else if (h2 == 0) {
            int h3 = lVar.mo13436h(16);
            int h4 = lVar.mo13436h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                lVar.mo13438j(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                lVar.mo13438j(bArr, 0, h4);
                return new C4181c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C4181c(h, g, bArr2, bArr);
    }

    /* renamed from: o */
    private static C4182d m17721o(C4273l lVar, int i) {
        int h = lVar.mo13436h(8);
        int h2 = lVar.mo13436h(4);
        int h3 = lVar.mo13436h(2);
        lVar.mo13443o(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = lVar.mo13436h(8);
            lVar.mo13443o(8);
            i2 -= 6;
            sparseArray.put(h4, new C4183e(lVar.mo13436h(16), lVar.mo13436h(16)));
        }
        return new C4182d(h, h2, h3, sparseArray);
    }

    /* renamed from: p */
    private static C4184f m17722p(C4273l lVar, int i) {
        int i2;
        int i3;
        C4273l lVar2 = lVar;
        int h = lVar2.mo13436h(8);
        lVar2.mo13443o(4);
        boolean g = lVar.mo13435g();
        lVar2.mo13443o(3);
        int i4 = 16;
        int h2 = lVar2.mo13436h(16);
        int h3 = lVar2.mo13436h(16);
        int h4 = lVar2.mo13436h(3);
        int h5 = lVar2.mo13436h(3);
        int i5 = 2;
        lVar2.mo13443o(2);
        int h6 = lVar2.mo13436h(8);
        int h7 = lVar2.mo13436h(8);
        int h8 = lVar2.mo13436h(4);
        int h9 = lVar2.mo13436h(2);
        lVar2.mo13443o(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = lVar2.mo13436h(i4);
            int h11 = lVar2.mo13436h(i5);
            int h12 = lVar2.mo13436h(i5);
            int h13 = lVar2.mo13436h(12);
            int i7 = h9;
            lVar2.mo13443o(4);
            int h14 = lVar2.mo13436h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = lVar2.mo13436h(8);
                i2 = lVar2.mo13436h(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            sparseArray.put(h10, new C4185g(h11, h12, h13, h14, i3, i2));
            h9 = i7;
            i5 = 2;
            i4 = 16;
        }
        return new C4184f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r7.put(r1, r0);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m17723q(p148g.p189d.p190a.p200b.p230r0.C4273l r6, p148g.p189d.p190a.p200b.p219o0.p221n.C4178b.C4186h r7) {
        /*
            r0 = 8
            int r0 = r6.mo13436h(r0)
            r1 = 16
            int r2 = r6.mo13436h(r1)
            int r1 = r6.mo13436h(r1)
            int r3 = r6.mo13432d()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.mo13430b()
            if (r4 <= r5) goto L_0x002c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            android.util.Log.w(r7, r0)
            int r7 = r6.mo13430b()
            r6.mo13443o(r7)
            return
        L_0x002c:
            switch(r0) {
                case 16: goto L_0x0095;
                case 17: goto L_0x0070;
                case 18: goto L_0x0055;
                case 19: goto L_0x003d;
                case 20: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00bf
        L_0x0031:
            int r0 = r7.f13341a
            if (r2 != r0) goto L_0x00bf
            g.d.a.b.o0.n.b$b r0 = m17719m(r6)
            r7.f13348h = r0
            goto L_0x00bf
        L_0x003d:
            int r0 = r7.f13341a
            if (r2 != r0) goto L_0x004a
            g.d.a.b.o0.n.b$c r0 = m17720n(r6)
            android.util.SparseArray<g.d.a.b.o0.n.b$c> r7 = r7.f13345e
        L_0x0047:
            int r1 = r0.f13320a
            goto L_0x0061
        L_0x004a:
            int r0 = r7.f13342b
            if (r2 != r0) goto L_0x00bf
            g.d.a.b.o0.n.b$c r0 = m17720n(r6)
            android.util.SparseArray<g.d.a.b.o0.n.b$c> r7 = r7.f13347g
            goto L_0x0047
        L_0x0055:
            int r0 = r7.f13341a
            if (r2 != r0) goto L_0x0065
            g.d.a.b.o0.n.b$a r0 = m17718l(r6, r1)
            android.util.SparseArray<g.d.a.b.o0.n.b$a> r7 = r7.f13344d
        L_0x005f:
            int r1 = r0.f13310a
        L_0x0061:
            r7.put(r1, r0)
            goto L_0x00bf
        L_0x0065:
            int r0 = r7.f13342b
            if (r2 != r0) goto L_0x00bf
            g.d.a.b.o0.n.b$a r0 = m17718l(r6, r1)
            android.util.SparseArray<g.d.a.b.o0.n.b$a> r7 = r7.f13346f
            goto L_0x005f
        L_0x0070:
            g.d.a.b.o0.n.b$d r0 = r7.f13349i
            int r4 = r7.f13341a
            if (r2 != r4) goto L_0x00bf
            if (r0 == 0) goto L_0x00bf
            g.d.a.b.o0.n.b$f r1 = m17722p(r6, r1)
            int r0 = r0.f13325b
            if (r0 != 0) goto L_0x008d
            android.util.SparseArray<g.d.a.b.o0.n.b$f> r0 = r7.f13343c
            int r2 = r1.f13329a
            java.lang.Object r0 = r0.get(r2)
            g.d.a.b.o0.n.b$f r0 = (p148g.p189d.p190a.p200b.p219o0.p221n.C4178b.C4184f) r0
            r1.mo13247a(r0)
        L_0x008d:
            android.util.SparseArray<g.d.a.b.o0.n.b$f> r7 = r7.f13343c
            int r0 = r1.f13329a
            r7.put(r0, r1)
            goto L_0x00bf
        L_0x0095:
            int r0 = r7.f13341a
            if (r2 != r0) goto L_0x00bf
            g.d.a.b.o0.n.b$d r0 = r7.f13349i
            g.d.a.b.o0.n.b$d r1 = m17721o(r6, r1)
            int r2 = r1.f13325b
            if (r2 == 0) goto L_0x00b5
            r7.f13349i = r1
            android.util.SparseArray<g.d.a.b.o0.n.b$f> r0 = r7.f13343c
            r0.clear()
            android.util.SparseArray<g.d.a.b.o0.n.b$a> r0 = r7.f13344d
            r0.clear()
            android.util.SparseArray<g.d.a.b.o0.n.b$c> r7 = r7.f13345e
            r7.clear()
            goto L_0x00bf
        L_0x00b5:
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.f13324a
            int r2 = r1.f13324a
            if (r0 == r2) goto L_0x00bf
            r7.f13349i = r1
        L_0x00bf:
            int r7 = r6.mo13432d()
            int r3 = r3 - r7
            r6.mo13444p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p219o0.p221n.C4178b.m17723q(g.d.a.b.r0.l, g.d.a.b.o0.n.b$h):void");
    }

    /* renamed from: b */
    public List<C4152b> mo13245b(byte[] bArr, int i) {
        int i2;
        SparseArray<C4185g> sparseArray;
        C4273l lVar = new C4273l(bArr, i);
        while (lVar.mo13430b() >= 48 && lVar.mo13436h(8) == 15) {
            m17723q(lVar, this.f13308f);
        }
        C4186h hVar = this.f13308f;
        if (hVar.f13349i == null) {
            return Collections.emptyList();
        }
        C4180b bVar = hVar.f13348h;
        if (bVar == null) {
            bVar = this.f13306d;
        }
        Bitmap bitmap = this.f13309g;
        if (!(bitmap != null && bVar.f13314a + 1 == bitmap.getWidth() && bVar.f13315b + 1 == this.f13309g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f13314a + 1, bVar.f13315b + 1, Bitmap.Config.ARGB_8888);
            this.f13309g = createBitmap;
            this.f13305c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C4183e> sparseArray2 = this.f13308f.f13349i.f13326c;
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            C4183e valueAt = sparseArray2.valueAt(i3);
            C4184f fVar = this.f13308f.f13343c.get(sparseArray2.keyAt(i3));
            int i4 = valueAt.f13327a + bVar.f13316c;
            int i5 = valueAt.f13328b + bVar.f13318e;
            float f = (float) i4;
            float f2 = (float) i5;
            float f3 = f2;
            float f4 = f;
            this.f13305c.clipRect(f, f2, (float) Math.min(fVar.f13331c + i4, bVar.f13317d), (float) Math.min(fVar.f13332d + i5, bVar.f13319f), Region.Op.REPLACE);
            C4179a aVar = this.f13308f.f13344d.get(fVar.f13334f);
            if (aVar == null && (aVar = this.f13308f.f13346f.get(fVar.f13334f)) == null) {
                aVar = this.f13307e;
            }
            SparseArray<C4185g> sparseArray3 = fVar.f13338j;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i6);
                C4185g valueAt2 = sparseArray3.valueAt(i6);
                C4181c cVar = this.f13308f.f13345e.get(keyAt);
                C4181c cVar2 = cVar == null ? this.f13308f.f13347g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i2 = i6;
                    sparseArray = sparseArray3;
                    m17717k(cVar2, aVar, fVar.f13333e, valueAt2.f13339a + i4, i5 + valueAt2.f13340b, cVar2.f13321b ? null : this.f13303a, this.f13305c);
                } else {
                    i2 = i6;
                    sparseArray = sparseArray3;
                }
                i6 = i2 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f13330b) {
                int i7 = fVar.f13333e;
                this.f13304b.setColor(i7 == 3 ? aVar.f13313d[fVar.f13335g] : i7 == 2 ? aVar.f13312c[fVar.f13336h] : aVar.f13311b[fVar.f13337i]);
                this.f13305c.drawRect(f4, f3, (float) (fVar.f13331c + i4), (float) (fVar.f13332d + i5), this.f13304b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f13309g, i4, i5, fVar.f13331c, fVar.f13332d);
            int i8 = bVar.f13314a;
            int i9 = bVar.f13315b;
            arrayList.add(new C4152b(createBitmap2, f4 / ((float) i8), 0, f3 / ((float) i9), 0, ((float) fVar.f13331c) / ((float) i8), ((float) fVar.f13332d) / ((float) i9)));
            this.f13305c.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    /* renamed from: r */
    public void mo13246r() {
        this.f13308f.mo13248a();
    }
}
