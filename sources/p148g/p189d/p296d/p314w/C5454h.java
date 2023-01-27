package p148g.p189d.p296d.p314w;

import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.h */
public final class C5454h extends C5457k {

    /* renamed from: b */
    private static final int[] f15802b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f15803c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f15804d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f15805e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f15806a = -1;

    /* renamed from: i */
    private static int m22493i(int[] iArr) throws C5377i {
        int length = f15805e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = C5457k.m22506f(iArr, f15805e[i2], 0.5f);
            if (f2 < f) {
                i = i2;
                f = f2;
            } else if (f2 == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw C5377i.m22193a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = m22497m(r7, r0, f15804d[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m22494j(p148g.p189d.p296d.p304s.C5411a r7) throws p148g.p189d.p296d.C5377i {
        /*
            r6 = this;
            r7.mo15658n()
            int r0 = m22498n(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f15804d     // Catch:{ i -> 0x0012 }
            r3 = r3[r2]     // Catch:{ i -> 0x0012 }
            int[] r0 = m22497m(r7, r0, r3)     // Catch:{ i -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f15804d     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = m22497m(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.m22499o(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.mo15656i()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.mo15656i()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.mo15658n()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.mo15658n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.C5454h.m22494j(g.d.d.s.a):int[]");
    }

    /* renamed from: k */
    private static void m22495k(C5411a aVar, int i, int i2, StringBuilder sb) throws C5377i {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C5457k.m22507g(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m22493i(iArr2) + 48));
            sb.append((char) (m22493i(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: l */
    private int[] m22496l(C5411a aVar) throws C5377i {
        int[] m = m22497m(aVar, m22498n(aVar), f15803c);
        this.f15806a = (m[1] - m[0]) / 4;
        m22499o(aVar, m[0]);
        return m;
    }

    /* renamed from: m */
    private static int[] m22497m(C5411a aVar, int i, int[] iArr) throws C5377i {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = aVar.mo15656i();
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if (aVar.mo15650d(i) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (C5457k.m22506f(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i3, i};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: n */
    private static int m22498n(C5411a aVar) throws C5377i {
        int i = aVar.mo15656i();
        int f = aVar.mo15653f(0);
        if (f != i) {
            return f;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: o */
    private void m22499o(C5411a aVar, int i) throws C5377i {
        int i2 = this.f15806a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo15650d(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw C5377i.m22193a();
        }
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5374f, C5377i {
        boolean z;
        int[] l = m22496l(aVar);
        int[] j = m22494j(aVar);
        StringBuilder sb = new StringBuilder(20);
        m22495k(aVar, l[1], j[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(C5373e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f15802b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C5381m(sb2, (byte[]) null, new C5383o[]{new C5383o((float) l[1], f), new C5383o((float) j[0], f)}, C5369a.ITF);
        }
        throw C5374f.m22179a();
    }
}
