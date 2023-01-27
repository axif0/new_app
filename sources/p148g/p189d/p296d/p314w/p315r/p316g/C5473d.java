package p148g.p189d.p296d.p314w.p315r.p316g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5411a;
import p148g.p189d.p296d.p304s.p305m.C5423a;
import p148g.p189d.p296d.p314w.C5457k;
import p148g.p189d.p296d.p314w.p315r.C5464a;
import p148g.p189d.p296d.p314w.p315r.C5465b;
import p148g.p189d.p296d.p314w.p315r.C5466c;
import p148g.p189d.p296d.p314w.p315r.C5469f;
import p148g.p189d.p296d.p314w.p315r.p316g.p317e.C5483j;

/* renamed from: g.d.d.w.r.g.d */
public final class C5473d extends C5464a {

    /* renamed from: k */
    private static final int[] f15858k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f15859l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f15860m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f15861n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f15862o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f15863p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C5471b> f15864g = new ArrayList(11);

    /* renamed from: h */
    private final List<C5472c> f15865h = new ArrayList();

    /* renamed from: i */
    private final int[] f15866i = new int[2];

    /* renamed from: j */
    private boolean f15867j;

    /* renamed from: A */
    private static int m22586A(C5411a aVar, int i) {
        return aVar.mo15650d(i) ? aVar.mo15653f(aVar.mo15654g(i)) : aVar.mo15654g(aVar.mo15653f(i));
    }

    /* renamed from: B */
    private static boolean m22587B(C5466c cVar, boolean z, boolean z2) {
        return cVar.mo15775c() != 0 || !z || !z2;
    }

    /* renamed from: C */
    private static boolean m22588C(Iterable<C5471b> iterable, Iterable<C5472c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C5472c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C5472c next = it.next();
                Iterator<C5471b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C5471b next2 = it2.next();
                    Iterator<C5471b> it3 = next.mo15788a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: D */
    private static boolean m22589D(List<C5471b> list) {
        boolean z;
        for (int[] iArr : f15863p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo15781a().mo15775c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    private C5466c m22590E(C5411a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f15866i[0] - 1;
            while (i5 >= 0 && !aVar.mo15650d(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f15866i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f15866i;
            int i7 = iArr2[0];
            int g = aVar.mo15654g(iArr2[1] + 1);
            i2 = g;
            i3 = i7;
            i4 = g - this.f15866i[1];
        }
        int[] k = mo15763k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = i4;
        try {
            return new C5466c(C5464a.m22551r(k, f15861n), new int[]{i3, i2}, i3, i2, i);
        } catch (C5377i unused) {
            return null;
        }
    }

    /* renamed from: F */
    private static void m22591F(Collection<C5471b> collection, Collection<C5472c> collection2) {
        Iterator<C5472c> it = collection2.iterator();
        while (it.hasNext()) {
            C5472c next = it.next();
            if (next.mo15788a().size() != collection.size()) {
                boolean z = true;
                Iterator<C5471b> it2 = next.mo15788a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: H */
    private static void m22592H(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: I */
    private void m22593I(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f15865h.size()) {
                break;
            }
            C5472c cVar = this.f15865h.get(i2);
            if (cVar.mo15789b() > i) {
                z2 = cVar.mo15790c(this.f15864g);
                break;
            } else {
                z3 = cVar.mo15790c(this.f15864g);
                i2++;
            }
        }
        if (!z2 && !z3 && !m22588C(this.f15864g, this.f15865h)) {
            this.f15865h.add(i2, new C5472c(this.f15864g, i, z));
            m22591F(this.f15864g, this.f15865h);
        }
    }

    /* renamed from: s */
    private void m22594s(int i) throws C5377i {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int d = C5423a.m22359d(mo15766n());
        int d2 = C5423a.m22359d(mo15764l());
        boolean z5 = false;
        boolean z6 = true;
        if (d > 13) {
            z2 = false;
            z = true;
        } else {
            z2 = d < 4;
            z = false;
        }
        if (d2 > 13) {
            z4 = false;
            z3 = true;
        } else {
            z4 = d2 < 4;
            z3 = false;
        }
        int i2 = (d + d2) - i;
        boolean z7 = (d & 1) == 1;
        if ((d2 & 1) == 0) {
            z5 = true;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw C5377i.m22193a();
                } else if (z7) {
                    if (!z5) {
                        z6 = z2;
                    } else {
                        throw C5377i.m22193a();
                    }
                } else if (z5) {
                    z6 = z2;
                    z3 = true;
                } else {
                    throw C5377i.m22193a();
                }
            } else if (z7) {
                if (z5) {
                    if (d >= d2) {
                        z6 = z2;
                        z4 = true;
                    }
                    z3 = true;
                } else {
                    throw C5377i.m22193a();
                }
            } else if (!z5) {
                z6 = z2;
            } else {
                throw C5377i.m22193a();
            }
            z = true;
        } else if (z7) {
            if (z5) {
                throw C5377i.m22193a();
            }
        } else if (z5) {
            z6 = z2;
            z4 = true;
        } else {
            throw C5377i.m22193a();
        }
        if (z6) {
            if (!z) {
                C5464a.m22549p(mo15766n(), mo15767o());
            } else {
                throw C5377i.m22193a();
            }
        }
        if (z) {
            C5464a.m22548i(mo15766n(), mo15767o());
        }
        if (z4) {
            if (!z3) {
                C5464a.m22549p(mo15764l(), mo15767o());
            } else {
                throw C5377i.m22193a();
            }
        }
        if (z3) {
            C5464a.m22548i(mo15764l(), mo15765m());
        }
    }

    /* renamed from: t */
    private boolean m22595t() {
        C5471b bVar = this.f15864g.get(0);
        C5465b b = bVar.mo15782b();
        C5465b c = bVar.mo15783c();
        if (c == null) {
            return false;
        }
        int a = c.mo15768a();
        int i = 2;
        for (int i2 = 1; i2 < this.f15864g.size(); i2++) {
            C5471b bVar2 = this.f15864g.get(i2);
            a += bVar2.mo15782b().mo15768a();
            i++;
            C5465b c2 = bVar2.mo15783c();
            if (c2 != null) {
                a += c2.mo15768a();
                i++;
            }
        }
        return ((i + -4) * 211) + (a % 211) == b.mo15769b();
    }

    /* renamed from: u */
    private List<C5471b> m22596u(List<C5472c> list, int i) throws C5377i {
        while (i < this.f15865h.size()) {
            C5472c cVar = this.f15865h.get(i);
            this.f15864g.clear();
            for (C5472c a : list) {
                this.f15864g.addAll(a.mo15788a());
            }
            this.f15864g.addAll(cVar.mo15788a());
            if (!m22589D(this.f15864g)) {
                i++;
            } else if (m22595t()) {
                return this.f15864g;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return m22596u(arrayList, i + 1);
                } catch (C5377i unused) {
                }
            }
        }
        throw C5377i.m22193a();
    }

    /* renamed from: v */
    private List<C5471b> m22597v(boolean z) {
        List<C5471b> list = null;
        if (this.f15865h.size() > 25) {
            this.f15865h.clear();
            return null;
        }
        this.f15864g.clear();
        if (z) {
            Collections.reverse(this.f15865h);
        }
        try {
            list = m22596u(new ArrayList(), 0);
        } catch (C5377i unused) {
        }
        if (z) {
            Collections.reverse(this.f15865h);
        }
        return list;
    }

    /* renamed from: w */
    static C5381m m22598w(List<C5471b> list) throws C5377i, C5374f {
        String d = C5483j.m22623a(C5470a.m22578a(list)).mo15799d();
        C5383o[] a = list.get(0).mo15781a().mo15773a();
        C5383o[] a2 = list.get(list.size() - 1).mo15781a().mo15773a();
        return new C5381m(d, (byte[]) null, new C5383o[]{a[0], a[1], a2[0], a2[1]}, C5369a.RSS_EXPANDED);
    }

    /* renamed from: z */
    private void m22599z(C5411a aVar, List<C5471b> list, int i) throws C5377i {
        int[] k = mo15763k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int i2 = aVar.mo15656i();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).mo15781a().mo15774b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f15867j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < i2) {
            z2 = !aVar.mo15650d(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i3 = 0;
        int i4 = i;
        while (i < i2) {
            if (aVar.mo15650d(i) != z3) {
                k[i3] = k[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z) {
                        m22592H(k);
                    }
                    if (C5464a.m22550q(k)) {
                        int[] iArr = this.f15866i;
                        iArr[0] = i4;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m22592H(k);
                    }
                    i4 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                k[i3] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw C5377i.m22193a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C5471b mo15794G(C5411a aVar, List<C5471b> list, int i) throws C5377i {
        C5466c E;
        C5465b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f15867j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m22599z(aVar, list, i2);
            E = m22590E(aVar, i, z);
            if (E == null) {
                i2 = m22586A(aVar, this.f15866i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C5465b x = mo15795x(aVar, E, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo15784d()) {
            try {
                bVar = mo15795x(aVar, E, z, false);
            } catch (C5377i unused) {
                bVar = null;
            }
            return new C5471b(x, bVar, E);
        }
        throw C5377i.m22193a();
    }

    /* renamed from: b */
    public void mo15604b() {
        this.f15864g.clear();
        this.f15865h.clear();
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i, C5374f {
        this.f15864g.clear();
        this.f15867j = false;
        try {
            return m22598w(mo15796y(i, aVar));
        } catch (C5377i unused) {
            this.f15864g.clear();
            this.f15867j = true;
            return m22598w(mo15796y(i, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C5465b mo15795x(C5411a aVar, C5466c cVar, boolean z, boolean z2) throws C5377i {
        C5411a aVar2 = aVar;
        int[] j = mo15762j();
        for (int i = 0; i < j.length; i++) {
            j[i] = 0;
        }
        int[] b = cVar.mo15774b();
        if (z2) {
            C5457k.m22508h(aVar, b[0], j);
        } else {
            C5457k.m22507g(aVar, b[1], j);
            int i2 = 0;
            for (int length = j.length - 1; i2 < length; length--) {
                int i3 = j[i2];
                j[i2] = j[length];
                j[length] = i3;
                i2++;
            }
        }
        float d = ((float) C5423a.m22359d(j)) / 17.0f;
        float f = ((float) (cVar.mo15774b()[1] - cVar.mo15774b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] n = mo15766n();
            int[] l = mo15764l();
            float[] o = mo15767o();
            float[] m = mo15765m();
            for (int i4 = 0; i4 < j.length; i4++) {
                float f2 = (((float) j[i4]) * 1.0f) / d;
                int i5 = (int) (0.5f + f2);
                if (i5 <= 0) {
                    if (f2 >= 0.3f) {
                        i5 = 1;
                    } else {
                        throw C5377i.m22193a();
                    }
                } else if (i5 > 8) {
                    if (f2 <= 8.7f) {
                        i5 = 8;
                    } else {
                        throw C5377i.m22193a();
                    }
                }
                int i6 = i4 / 2;
                if ((i4 & 1) == 0) {
                    n[i6] = i5;
                    o[i6] = f2 - ((float) i5);
                } else {
                    l[i6] = i5;
                    m[i6] = f2 - ((float) i5);
                }
            }
            m22594s(17);
            int c = (((cVar.mo15775c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i7 = 0;
            int i8 = 0;
            for (int length2 = n.length - 1; length2 >= 0; length2--) {
                if (m22587B(cVar, z, z2)) {
                    i7 += n[length2] * f15862o[c][length2 * 2];
                }
                i8 += n[length2];
            }
            int i9 = 0;
            for (int length3 = l.length - 1; length3 >= 0; length3--) {
                if (m22587B(cVar, z, z2)) {
                    i9 += l[length3] * f15862o[c][(length3 * 2) + 1];
                }
            }
            int i10 = i7 + i9;
            if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
                throw C5377i.m22193a();
            }
            int i11 = (13 - i8) / 2;
            int i12 = f15858k[i11];
            return new C5465b((C5469f.m22577b(n, i12, true) * f15859l[i11]) + C5469f.m22577b(l, 9 - i12, false) + f15860m[i11], i10);
        }
        throw C5377i.m22193a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public List<C5471b> mo15796y(int i, C5411a aVar) throws C5377i {
        boolean z = false;
        while (!z) {
            try {
                this.f15864g.add(mo15794G(aVar, this.f15864g, i));
            } catch (C5377i e) {
                if (!this.f15864g.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (m22595t()) {
            return this.f15864g;
        }
        boolean z2 = !this.f15865h.isEmpty();
        m22593I(i, false);
        if (z2) {
            List<C5471b> v = m22597v(false);
            if (v != null) {
                return v;
            }
            List<C5471b> v2 = m22597v(true);
            if (v2 != null) {
                return v2;
            }
        }
        throw C5377i.m22193a();
    }
}
