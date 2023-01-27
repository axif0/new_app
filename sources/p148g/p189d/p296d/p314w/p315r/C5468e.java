package p148g.p189d.p296d.p314w.p315r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.C5384p;
import p148g.p189d.p296d.p304s.C5411a;
import p148g.p189d.p296d.p304s.p305m.C5423a;
import p148g.p189d.p296d.p314w.C5457k;

/* renamed from: g.d.d.w.r.e */
public final class C5468e extends C5464a {

    /* renamed from: i */
    private static final int[] f15843i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f15844j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f15845k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f15846l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f15847m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f15848n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f15849o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C5467d> f15850g = new ArrayList();

    /* renamed from: h */
    private final List<C5467d> f15851h = new ArrayList();

    /* renamed from: s */
    private static void m22566s(Collection<C5467d> collection, C5467d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C5467d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5467d next = it.next();
                if (next.mo15769b() == dVar.mo15769b()) {
                    next.mo15780e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22567t(boolean r10, int r11) throws p148g.p189d.p296d.C5377i {
        /*
            r9 = this;
            int[] r0 = r9.mo15766n()
            int r0 = p148g.p189d.p296d.p304s.p305m.C5423a.m22359d(r0)
            int[] r1 = r9.mo15764l()
            int r1 = p148g.p189d.p296d.p304s.p305m.C5423a.m22359d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            r11 = -1
            if (r8 == r11) goto L_0x008c
            if (r8 == 0) goto L_0x0074
            if (r8 != r4) goto L_0x006f
            if (r10 == 0) goto L_0x0065
            if (r3 != 0) goto L_0x0060
            r4 = r6
        L_0x005e:
            r7 = 1
            goto L_0x009a
        L_0x0060:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x0065:
            if (r3 == 0) goto L_0x006a
            r4 = r6
        L_0x0068:
            r5 = 1
            goto L_0x009a
        L_0x006a:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x006f:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x0074:
            if (r10 == 0) goto L_0x0083
            if (r3 == 0) goto L_0x007e
            if (r0 >= r1) goto L_0x007b
            goto L_0x0068
        L_0x007b:
            r4 = r6
            r2 = 1
            goto L_0x005e
        L_0x007e:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x0083:
            if (r3 != 0) goto L_0x0087
            r4 = r6
            goto L_0x009a
        L_0x0087:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x008c:
            if (r10 == 0) goto L_0x0096
            if (r3 != 0) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x0096:
            if (r3 == 0) goto L_0x00df
            r4 = r6
            r2 = 1
        L_0x009a:
            if (r4 == 0) goto L_0x00af
            if (r7 != 0) goto L_0x00aa
            int[] r10 = r9.mo15766n()
            float[] r11 = r9.mo15767o()
            p148g.p189d.p296d.p314w.p315r.C5464a.m22549p(r10, r11)
            goto L_0x00af
        L_0x00aa:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x00af:
            if (r7 == 0) goto L_0x00bc
            int[] r10 = r9.mo15766n()
            float[] r11 = r9.mo15767o()
            p148g.p189d.p296d.p314w.p315r.C5464a.m22548i(r10, r11)
        L_0x00bc:
            if (r2 == 0) goto L_0x00d1
            if (r5 != 0) goto L_0x00cc
            int[] r10 = r9.mo15764l()
            float[] r11 = r9.mo15767o()
            p148g.p189d.p296d.p314w.p315r.C5464a.m22549p(r10, r11)
            goto L_0x00d1
        L_0x00cc:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            throw r10
        L_0x00d1:
            if (r5 == 0) goto L_0x00de
            int[] r10 = r9.mo15764l()
            float[] r11 = r9.mo15765m()
            p148g.p189d.p296d.p314w.p315r.C5464a.m22548i(r10, r11)
        L_0x00de:
            return
        L_0x00df:
            g.d.d.i r10 = p148g.p189d.p296d.C5377i.m22193a()
            goto L_0x00e5
        L_0x00e4:
            throw r10
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.p315r.C5468e.m22567t(boolean, int):void");
    }

    /* renamed from: u */
    private static boolean m22568u(C5467d dVar, C5467d dVar2) {
        int a = (dVar.mo15768a() + (dVar2.mo15768a() * 16)) % 79;
        int c = (dVar.mo15779d().mo15775c() * 9) + dVar2.mo15779d().mo15775c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: v */
    private static C5381m m22569v(C5467d dVar, C5467d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo15769b()) * 4537077) + ((long) dVar2.mo15769b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C5383o[] a = dVar.mo15779d().mo15773a();
        C5383o[] a2 = dVar2.mo15779d().mo15773a();
        return new C5381m(sb.toString(), (byte[]) null, new C5383o[]{a[0], a[1], a2[0], a2[1]}, C5369a.RSS_14);
    }

    /* renamed from: w */
    private C5465b m22570w(C5411a aVar, C5466c cVar, boolean z) throws C5377i {
        int[] j = mo15762j();
        for (int i = 0; i < j.length; i++) {
            j[i] = 0;
        }
        int[] b = cVar.mo15774b();
        if (z) {
            C5457k.m22508h(aVar, b[0], j);
        } else {
            C5457k.m22507g(aVar, b[1] + 1, j);
            int i2 = 0;
            for (int length = j.length - 1; i2 < length; length--) {
                int i3 = j[i2];
                j[i2] = j[length];
                j[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float d = ((float) C5423a.m22359d(j)) / ((float) i4);
        int[] n = mo15766n();
        int[] l = mo15764l();
        float[] o = mo15767o();
        float[] m = mo15765m();
        for (int i5 = 0; i5 < j.length; i5++) {
            float f = ((float) j[i5]) / d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                n[i7] = i6;
                o[i7] = f - ((float) i6);
            } else {
                l[i7] = i6;
                m[i7] = f - ((float) i6);
            }
        }
        m22567t(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = n.length - 1; length2 >= 0; length2--) {
            i8 = (i8 * 9) + n[length2];
            i9 += n[length2];
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = l.length - 1; length3 >= 0; length3--) {
            i10 = (i10 * 9) + l[length3];
            i11 += l[length3];
        }
        int i12 = i8 + (i10 * 3);
        if (z) {
            if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
                throw C5377i.m22193a();
            }
            int i13 = (12 - i9) / 2;
            int i14 = f15847m[i13];
            return new C5465b((C5469f.m22577b(n, i14, false) * f15843i[i13]) + C5469f.m22577b(l, 9 - i14, true) + f15845k[i13], i12);
        } else if ((i11 & 1) != 0 || i11 > 10 || i11 < 4) {
            throw C5377i.m22193a();
        } else {
            int i15 = (10 - i11) / 2;
            int i16 = f15848n[i15];
            return new C5465b((C5469f.m22577b(l, 9 - i16, false) * f15844j[i15]) + C5469f.m22577b(n, i16, true) + f15846l[i15], i12);
        }
    }

    /* renamed from: x */
    private C5467d m22571x(C5411a aVar, boolean z, int i, Map<C5373e, ?> map) {
        try {
            int[] y = m22572y(aVar, z);
            C5466c z2 = m22573z(aVar, i, z, y);
            C5384p pVar = map == null ? null : (C5384p) map.get(C5373e.NEED_RESULT_POINT_CALLBACK);
            if (pVar != null) {
                float f = ((float) (y[0] + y[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo15656i() - 1)) - f;
                }
                pVar.mo9796a(new C5383o(f, (float) i));
            }
            C5465b w = m22570w(aVar, z2, true);
            C5465b w2 = m22570w(aVar, z2, false);
            return new C5467d((w.mo15769b() * 1597) + w2.mo15769b(), w.mo15768a() + (w2.mo15768a() * 4), z2);
        } catch (C5377i unused) {
            return null;
        }
    }

    /* renamed from: y */
    private int[] m22572y(C5411a aVar, boolean z) throws C5377i {
        int[] k = mo15763k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int i = aVar.mo15656i();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            z2 = !aVar.mo15650d(i2);
            if (z == z2) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        int i4 = 0;
        while (i2 < i) {
            if (aVar.mo15650d(i2) != z2) {
                k[i4] = k[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (C5464a.m22550q(k)) {
                    return new int[]{i3, i2};
                } else {
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i4--;
                }
                k[i4] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: z */
    private C5466c m22573z(C5411a aVar, int i, boolean z, int[] iArr) throws C5377i {
        int i2;
        int i3;
        boolean d = aVar.mo15650d(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && d != aVar.mo15650d(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] k = mo15763k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = iArr[0] - i5;
        int r = C5464a.m22551r(k, f15849o);
        int i6 = iArr[1];
        if (z) {
            i2 = (aVar.mo15656i() - 1) - i6;
            i3 = (aVar.mo15656i() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C5466c(r, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: b */
    public void mo15604b() {
        this.f15850g.clear();
        this.f15851h.clear();
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i {
        m22566s(this.f15850g, m22571x(aVar, false, i, map));
        aVar.mo15658n();
        m22566s(this.f15851h, m22571x(aVar, true, i, map));
        aVar.mo15658n();
        for (C5467d next : this.f15850g) {
            if (next.mo15778c() > 1) {
                for (C5467d next2 : this.f15851h) {
                    if (next2.mo15778c() > 1 && m22568u(next, next2)) {
                        return m22569v(next, next2);
                    }
                }
                continue;
            }
        }
        throw C5377i.m22193a();
    }
}
