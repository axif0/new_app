package p148g.p189d.p296d.p318x.p319d;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5412b;
import p148g.p189d.p296d.p304s.C5415e;
import p148g.p189d.p296d.p318x.C5494a;
import p148g.p189d.p296d.p318x.p319d.p320k.C5509a;

/* renamed from: g.d.d.x.d.j */
public final class C5508j {

    /* renamed from: a */
    private static final C5509a f15939a = new C5509a();

    /* renamed from: a */
    private static C5499c m22759a(C5506h hVar) throws C5377i {
        int[] j;
        if (hVar == null || (j = hVar.mo15885j()) == null) {
            return null;
        }
        int p = m22774p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C5500d[] d = hVar.mo15879d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return hVar.mo15876a().mo15847a(i2, i, hVar.mo15886k());
    }

    /* renamed from: b */
    private static void m22760b(C5504f fVar, C5498b[][] bVarArr) throws C5377i {
        C5498b bVar = bVarArr[0][1];
        int[] a = bVar.mo15845a();
        int j = (fVar.mo15867j() * fVar.mo15869l()) - m22776r(fVar.mo15868k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw C5377i.m22193a();
            }
            bVar.mo15846b(j);
        } else if (a[0] != j) {
            bVar.mo15846b(j);
        }
    }

    /* renamed from: c */
    private static int m22761c(C5412b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.mo15665e(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    private static boolean m22762d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m22763e(int[] iArr, int[] iArr2, int i) throws C5372d {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f15939a.mo15887a(iArr, i, iArr2);
        }
        throw C5372d.m22177a();
    }

    /* renamed from: f */
    private static C5498b[][] m22764f(C5504f fVar) {
        int c;
        int l = fVar.mo15869l();
        int[] iArr = new int[2];
        iArr[1] = fVar.mo15867j() + 2;
        iArr[0] = l;
        C5498b[][] bVarArr = (C5498b[][]) Array.newInstance(C5498b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C5498b();
            }
        }
        int i3 = 0;
        for (C5505g gVar : fVar.mo15872o()) {
            if (gVar != null) {
                for (C5500d dVar : gVar.mo15879d()) {
                    if (dVar != null && (c = dVar.mo15858c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i3].mo15846b(dVar.mo15860e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C5415e m22765g(C5504f fVar) throws C5374f, C5372d, C5377i {
        C5498b[][] f = m22764f(fVar);
        m22760b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo15869l() * fVar.mo15867j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo15869l(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo15867j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo15845a();
                int j = (fVar.mo15867j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m22766h(fVar.mo15868k(), iArr, C5494a.m22669b(arrayList), C5494a.m22669b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C5415e m22766h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws C5374f, C5372d {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m22768j(iArr, i, iArr2);
                } catch (C5372d unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw C5372d.m22177a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C5372d.m22177a();
                    }
                }
            } else {
                throw C5372d.m22177a();
            }
        }
    }

    /* renamed from: i */
    public static C5415e m22767i(C5412b bVar, C5383o oVar, C5383o oVar2, C5383o oVar3, C5383o oVar4, int i, int i2) throws C5377i, C5374f, C5372d {
        C5504f v;
        C5505g gVar;
        int i3;
        int i4;
        int i5;
        C5506h hVar = null;
        C5506h hVar2 = null;
        C5499c cVar = new C5499c(bVar, oVar, oVar2, oVar3, oVar4);
        boolean z = true;
        while (true) {
            if (oVar != null) {
                hVar = m22777s(bVar, cVar, oVar, true, i, i2);
            }
            if (oVar3 != null) {
                hVar2 = m22777s(bVar, cVar, oVar3, false, i, i2);
            }
            v = m22780v(hVar, hVar2);
            if (v != null) {
                C5499c m = v.mo15870m();
                if (!z || m == null || (m.mo15853g() >= cVar.mo15853g() && m.mo15851e() <= cVar.mo15851e())) {
                    v.mo15873p(cVar);
                    int j = v.mo15867j() + 1;
                    v.mo15874q(0, hVar);
                    v.mo15874q(j, hVar2);
                } else {
                    cVar = m;
                    z = false;
                }
            } else {
                throw C5377i.m22193a();
            }
        }
        v.mo15873p(cVar);
        int j2 = v.mo15867j() + 1;
        v.mo15874q(0, hVar);
        v.mo15874q(j2, hVar2);
        boolean z2 = hVar != null;
        int i6 = i;
        int i7 = i2;
        for (int i8 = 1; i8 <= j2; i8++) {
            int i9 = z2 ? i8 : j2 - i8;
            if (v.mo15871n(i9) == null) {
                if (i9 == 0 || i9 == j2) {
                    gVar = new C5506h(cVar, i9 == 0);
                } else {
                    gVar = new C5505g(cVar);
                }
                v.mo15874q(i9, gVar);
                int i10 = -1;
                int g = cVar.mo15853g();
                int i11 = -1;
                while (g <= cVar.mo15851e()) {
                    int t = m22778t(v, i9, g, z2);
                    if (t >= 0 && t <= cVar.mo15850d()) {
                        i5 = t;
                    } else if (i11 != i10) {
                        i5 = i11;
                    } else {
                        i4 = i11;
                        i3 = g;
                        i11 = i4;
                        g = i3 + 1;
                        i10 = -1;
                    }
                    i4 = i11;
                    int i12 = g;
                    C5500d k = m22769k(bVar, cVar.mo15852f(), cVar.mo15850d(), z2, i5, i12, i6, i7);
                    i3 = i12;
                    if (k != null) {
                        gVar.mo15881f(i3, k);
                        i6 = Math.min(i6, k.mo15861f());
                        i7 = Math.max(i7, k.mo15861f());
                        i11 = i5;
                        g = i3 + 1;
                        i10 = -1;
                    }
                    i11 = i4;
                    g = i3 + 1;
                    i10 = -1;
                }
            }
        }
        return m22765g(v);
    }

    /* renamed from: j */
    private static C5415e m22768j(int[] iArr, int i, int[] iArr2) throws C5374f, C5372d {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m22763e(iArr, iArr2, i2);
            m22781w(iArr, i2);
            C5415e b = C5501e.m22718b(iArr, String.valueOf(i));
            b.mo15694k(Integer.valueOf(e));
            b.mo15693j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw C5374f.m22179a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = p148g.p189d.p296d.p318x.p319d.C5507i.m22757d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p148g.p189d.p296d.p318x.p319d.C5500d m22769k(p148g.p189d.p296d.p304s.C5412b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m22761c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m22775q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p148g.p189d.p296d.p304s.p305m.C5423a.m22359d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m22762d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = p148g.p189d.p296d.p318x.p319d.C5507i.m22757d(r7)
            int r9 = p148g.p189d.p296d.p318x.C5494a.m22668a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            g.d.d.x.d.d r8 = new g.d.d.x.d.d
            int r7 = m22772n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p318x.p319d.C5508j.m22769k(g.d.d.s.b, int, int, boolean, int, int, int, int):g.d.d.x.d.d");
    }

    /* renamed from: l */
    private static C5497a m22770l(C5506h hVar, C5506h hVar2) {
        C5497a i;
        C5497a i2;
        if (hVar == null || (i = hVar.mo15884i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.mo15884i();
        } else if (hVar2 == null || (i2 = hVar2.mo15884i()) == null || i.mo15840a() == i2.mo15840a() || i.mo15841b() == i2.mo15841b() || i.mo15842c() == i2.mo15842c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m22771m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m22772n(int i) {
        return m22773o(m22771m(i));
    }

    /* renamed from: o */
    private static int m22773o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m22774p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    private static int[] m22775q(C5412b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo15665e(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    private static int m22776r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C5506h m22777s(C5412b bVar, C5499c cVar, C5383o oVar, boolean z, int i, int i2) {
        boolean z2 = z;
        C5506h hVar = new C5506h(cVar, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int c = (int) oVar.mo15618c();
            int d = (int) oVar.mo15619d();
            while (d <= cVar.mo15851e() && d >= cVar.mo15853g()) {
                C5500d k = m22769k(bVar, 0, bVar.mo15673n(), z, c, d, i, i2);
                if (k != null) {
                    hVar.mo15881f(d, k);
                    c = z2 ? k.mo15859d() : k.mo15857b();
                }
                d += i4;
            }
            i3++;
        }
        return hVar;
    }

    /* renamed from: t */
    private static int m22778t(C5504f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C5500d dVar = null;
        int i4 = i - i3;
        if (m22779u(fVar, i4)) {
            dVar = fVar.mo15871n(i4).mo15877b(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo15857b() : dVar.mo15859d();
        }
        C5500d c = fVar.mo15871n(i).mo15878c(i2);
        if (c != null) {
            return z ? c.mo15859d() : c.mo15857b();
        }
        if (m22779u(fVar, i4)) {
            c = fVar.mo15871n(i4).mo15878c(i2);
        }
        if (c != null) {
            return z ? c.mo15857b() : c.mo15859d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m22779u(fVar, i)) {
                for (C5500d dVar2 : fVar.mo15871n(i).mo15879d()) {
                    if (dVar2 != null) {
                        return (z ? dVar2.mo15857b() : dVar2.mo15859d()) + (i3 * i5 * (dVar2.mo15857b() - dVar2.mo15859d()));
                    }
                }
                i5++;
            } else {
                C5499c m = fVar.mo15870m();
                return z ? m.mo15852f() : m.mo15850d();
            }
        }
    }

    /* renamed from: u */
    private static boolean m22779u(C5504f fVar, int i) {
        return i >= 0 && i <= fVar.mo15867j() + 1;
    }

    /* renamed from: v */
    private static C5504f m22780v(C5506h hVar, C5506h hVar2) throws C5377i {
        C5497a l;
        if ((hVar == null && hVar2 == null) || (l = m22770l(hVar, hVar2)) == null) {
            return null;
        }
        return new C5504f(l, C5499c.m22697j(m22759a(hVar), m22759a(hVar2)));
    }

    /* renamed from: w */
    private static void m22781w(int[] iArr, int i) throws C5374f {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C5374f.m22179a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C5374f.m22179a();
            }
        } else {
            throw C5374f.m22179a();
        }
    }
}
