package p148g.p189d.p296d.p318x.p321e;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p148g.p189d.p296d.C5371c;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.x.e.a */
public final class C5512a {

    /* renamed from: a */
    private static final int[] f15949a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f15950b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f15951c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f15952d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m22806a(C5383o[] oVarArr, C5383o[] oVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            oVarArr[iArr[i]] = oVarArr2[i];
        }
    }

    /* renamed from: b */
    public static C5513b m22807b(C5371c cVar, Map<C5373e, ?> map, boolean z) throws C5377i {
        C5412b a = cVar.mo15588a();
        List<C5383o[]> c = m22808c(z, a);
        if (c.isEmpty()) {
            a = a.clone();
            a.mo15674p();
            c = m22808c(z, a);
        }
        return new C5513b(a, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (p148g.p189d.p296d.C5383o[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo15619d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo15619d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<p148g.p189d.p296d.C5383o[]> m22808c(boolean r8, p148g.p189d.p296d.p304s.C5412b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.mo15670i()
            if (r3 >= r6) goto L_0x0078
            g.d.d.o[] r4 = m22811f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0052
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0052
            if (r5 == 0) goto L_0x0078
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            g.d.d.o[] r5 = (p148g.p189d.p296d.C5383o[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.mo15619d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003f:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0023
            r5 = r5[r6]
            float r5 = r5.mo15619d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004f:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x0052:
            r0.add(r4)
            if (r8 == 0) goto L_0x0078
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0066
            r5 = r4[r3]
            float r5 = r5.mo15618c()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L_0x0070
        L_0x0066:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo15618c()
            int r5 = (int) r5
            r3 = r4[r3]
        L_0x0070:
            float r3 = r3.mo15619d()
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p318x.p321e.C5512a.m22808c(boolean, g.d.d.s.b):java.util.List");
    }

    /* renamed from: d */
    private static int[] m22809d(C5412b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo15665e(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.mo15665e(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (m22812g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m22812g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    private static C5383o[] m22810e(C5412b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        C5383o[] oVarArr = new C5383o[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i8) {
                z = false;
                break;
            }
            int[] d = m22809d(bVar, i4, i9, i2, false, iArr, iArr2);
            if (d != null) {
                int i10 = i9;
                int[] iArr3 = d;
                int i11 = i10;
                while (true) {
                    if (i11 <= 0) {
                        i7 = i11;
                        break;
                    }
                    int i12 = i11 - 1;
                    int[] d2 = m22809d(bVar, i4, i12, i2, false, iArr, iArr2);
                    if (d2 == null) {
                        i7 = i12 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i11 = i12;
                }
                float f = (float) i7;
                oVarArr[0] = new C5383o((float) iArr3[0], f);
                oVarArr[1] = new C5383o((float) iArr3[1], f);
                i9 = i7;
                z = true;
            } else {
                i9 += 5;
            }
        }
        int i13 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) oVarArr[0].mo15618c(), (int) oVarArr[1].mo15618c()};
            int i14 = i13;
            int i15 = 0;
            while (true) {
                if (i14 >= i8) {
                    i5 = i15;
                    i6 = i14;
                    break;
                }
                i5 = i15;
                i6 = i14;
                int[] d3 = m22809d(bVar, iArr4[0], i14, i2, false, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i15 = i5 + 1;
                } else {
                    iArr4 = d3;
                    i15 = 0;
                }
                i14 = i6 + 1;
            }
            i13 = i6 - (i5 + 1);
            float f2 = (float) i13;
            oVarArr[2] = new C5383o((float) iArr4[0], f2);
            oVarArr[3] = new C5383o((float) iArr4[1], f2);
        }
        if (i13 - i9 < 10) {
            Arrays.fill(oVarArr, (Object) null);
        }
        return oVarArr;
    }

    /* renamed from: f */
    private static C5383o[] m22811f(C5412b bVar, int i, int i2) {
        int i3 = bVar.mo15670i();
        int n = bVar.mo15673n();
        C5383o[] oVarArr = new C5383o[8];
        m22806a(oVarArr, m22810e(bVar, i3, n, i, i2, f15951c), f15949a);
        if (oVarArr[4] != null) {
            i2 = (int) oVarArr[4].mo15618c();
            i = (int) oVarArr[4].mo15619d();
        }
        m22806a(oVarArr, m22810e(bVar, i3, n, i, i2, f15952d), f15950b);
        return oVarArr;
    }

    /* renamed from: g */
    private static float m22812g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
