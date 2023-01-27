package p148g.p189d.p296d.p322y.p324c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.C5384p;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.y.c.e */
public class C5540e {

    /* renamed from: f */
    private static final C5542b f16021f = new C5542b();

    /* renamed from: a */
    private final C5412b f16022a;

    /* renamed from: b */
    private final List<C5539d> f16023b = new ArrayList();

    /* renamed from: c */
    private boolean f16024c;

    /* renamed from: d */
    private final int[] f16025d = new int[5];

    /* renamed from: e */
    private final C5384p f16026e;

    /* renamed from: g.d.d.y.c.e$b */
    private static final class C5542b implements Serializable, Comparator<C5539d> {
        private C5542b() {
        }

        /* renamed from: a */
        public int compare(C5539d dVar, C5539d dVar2) {
            return Float.compare(dVar.mo15949i(), dVar2.mo15949i());
        }
    }

    public C5540e(C5412b bVar, C5384p pVar) {
        this.f16022a = bVar;
        this.f16026e = pVar;
    }

    /* renamed from: a */
    private static float m22895a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: c */
    private boolean m22896c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] j = m22902j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f16022a.mo15665e(i2 - i6, i - i6)) {
            j[2] = j[2] + 1;
            i6++;
        }
        if (j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f16022a.mo15665e(i2 - i6, i - i6)) {
            j[1] = j[1] + 1;
            i6++;
        }
        if (j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f16022a.mo15665e(i2 - i6, i - i6)) {
            j[0] = j[0] + 1;
            i6++;
        }
        if (j[0] == 0) {
            return false;
        }
        int i7 = this.f16022a.mo15670i();
        int n = this.f16022a.mo15673n();
        int i8 = 1;
        while (true) {
            int i9 = i + i8;
            if (i9 < i7 && (i5 = i2 + i8) < n && this.f16022a.mo15665e(i5, i9)) {
                j[2] = j[2] + 1;
                i8++;
            }
        }
        while (true) {
            int i10 = i + i8;
            if (i10 < i7 && (i4 = i2 + i8) < n && !this.f16022a.mo15665e(i4, i10)) {
                j[3] = j[3] + 1;
                i8++;
            }
        }
        if (j[3] == 0) {
            return false;
        }
        while (true) {
            int i11 = i + i8;
            if (i11 < i7 && (i3 = i2 + i8) < n && this.f16022a.mo15665e(i3, i11)) {
                j[4] = j[4] + 1;
                i8++;
            }
        }
        if (j[4] == 0) {
            return false;
        }
        return m22901i(j);
    }

    /* renamed from: d */
    private float m22897d(int i, int i2, int i3, int i4) {
        C5412b bVar = this.f16022a;
        int n = bVar.mo15673n();
        int[] j = m22902j();
        int i5 = i;
        while (i5 >= 0 && bVar.mo15665e(i5, i2)) {
            j[2] = j[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo15665e(i5, i2) && j[1] <= i3) {
            j[1] = j[1] + 1;
            i5--;
        }
        if (i5 >= 0 && j[1] <= i3) {
            while (i5 >= 0 && bVar.mo15665e(i5, i2) && j[0] <= i3) {
                j[0] = j[0] + 1;
                i5--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < n && bVar.mo15665e(i6, i2)) {
                j[2] = j[2] + 1;
                i6++;
            }
            if (i6 == n) {
                return Float.NaN;
            }
            while (i6 < n && !bVar.mo15665e(i6, i2) && j[3] < i3) {
                j[3] = j[3] + 1;
                i6++;
            }
            if (i6 != n && j[3] < i3) {
                while (i6 < n && bVar.mo15665e(i6, i2) && j[4] < i3) {
                    j[4] = j[4] + 1;
                    i6++;
                }
                if (j[4] < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + j[4]) - i4) * 5 < i4 && m22900h(j)) {
                    return m22895a(j, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: e */
    private float m22898e(int i, int i2, int i3, int i4) {
        C5412b bVar = this.f16022a;
        int i5 = bVar.mo15670i();
        int[] j = m22902j();
        int i6 = i;
        while (i6 >= 0 && bVar.mo15665e(i2, i6)) {
            j[2] = j[2] + 1;
            i6--;
        }
        if (i6 < 0) {
            return Float.NaN;
        }
        while (i6 >= 0 && !bVar.mo15665e(i2, i6) && j[1] <= i3) {
            j[1] = j[1] + 1;
            i6--;
        }
        if (i6 >= 0 && j[1] <= i3) {
            while (i6 >= 0 && bVar.mo15665e(i2, i6) && j[0] <= i3) {
                j[0] = j[0] + 1;
                i6--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i7 = i + 1;
            while (i7 < i5 && bVar.mo15665e(i2, i7)) {
                j[2] = j[2] + 1;
                i7++;
            }
            if (i7 == i5) {
                return Float.NaN;
            }
            while (i7 < i5 && !bVar.mo15665e(i2, i7) && j[3] < i3) {
                j[3] = j[3] + 1;
                i7++;
            }
            if (i7 != i5 && j[3] < i3) {
                while (i7 < i5 && bVar.mo15665e(i2, i7) && j[4] < i3) {
                    j[4] = j[4] + 1;
                    i7++;
                }
                if (j[4] < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + j[4]) - i4) * 5 < i4 * 2 && m22900h(j)) {
                    return m22895a(j, i7);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: g */
    private int m22899g() {
        if (this.f16023b.size() <= 1) {
            return 0;
        }
        C5539d dVar = null;
        for (C5539d next : this.f16023b) {
            if (next.mo15948h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f16024c = true;
                    return ((int) (Math.abs(dVar.mo15618c() - next.mo15618c()) - Math.abs(dVar.mo15619d() - next.mo15619d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: h */
    protected static boolean m22900h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: i */
    protected static boolean m22901i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: j */
    private int[] m22902j() {
        mo15950b(this.f16025d);
        return this.f16025d;
    }

    /* renamed from: l */
    private boolean m22903l() {
        int size = this.f16023b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C5539d next : this.f16023b) {
            if (next.mo15948h() >= 2) {
                i++;
                f2 += next.mo15949i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C5539d i2 : this.f16023b) {
            f += Math.abs(i2.mo15949i() - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* renamed from: m */
    private C5539d[] m22904m() throws C5377i {
        if (this.f16023b.size() >= 3) {
            this.f16023b.sort(f16021f);
            double[] dArr = new double[3];
            C5539d[] dVarArr = new C5539d[3];
            int i = 0;
            double d = Double.MAX_VALUE;
            while (i < this.f16023b.size() - 2) {
                C5539d dVar = this.f16023b.get(i);
                float i2 = dVar.mo15949i();
                i++;
                int i3 = i;
                while (i3 < this.f16023b.size() - 1) {
                    C5539d dVar2 = this.f16023b.get(i3);
                    double o = m22905o(dVar, dVar2);
                    i3++;
                    for (int i4 = i3; i4 < this.f16023b.size(); i4++) {
                        C5539d dVar3 = this.f16023b.get(i4);
                        if (dVar3.mo15949i() <= 1.4f * i2) {
                            dArr[0] = o;
                            dArr[1] = m22905o(dVar2, dVar3);
                            dArr[2] = m22905o(dVar, dVar3);
                            Arrays.sort(dArr);
                            double abs = Math.abs(dArr[2] - (dArr[1] * 2.0d)) + Math.abs(dArr[2] - (dArr[0] * 2.0d));
                            if (abs < d) {
                                dVarArr[0] = dVar;
                                dVarArr[1] = dVar2;
                                dVarArr[2] = dVar3;
                                d = abs;
                            }
                        }
                    }
                }
            }
            if (d != Double.MAX_VALUE) {
                return dVarArr;
            }
            throw C5377i.m22193a();
        }
        throw C5377i.m22193a();
    }

    /* renamed from: o */
    private static double m22905o(C5539d dVar, C5539d dVar2) {
        double c = (double) (dVar.mo15618c() - dVar2.mo15618c());
        double d = (double) (dVar.mo15619d() - dVar2.mo15619d());
        Double.isNaN(c);
        Double.isNaN(c);
        Double.isNaN(d);
        Double.isNaN(d);
        return (c * c) + (d * d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15950b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C5543f mo15951f(Map<C5373e, ?> map) throws C5377i {
        boolean z = map != null && map.containsKey(C5373e.TRY_HARDER);
        int i = this.f16022a.mo15670i();
        int n = this.f16022a.mo15673n();
        int i2 = (i * 3) / 388;
        if (i2 < 3 || z) {
            i2 = 3;
        }
        int[] iArr = new int[5];
        int i3 = i2 - 1;
        boolean z2 = false;
        while (i3 < i && !z2) {
            mo15950b(iArr);
            int i4 = 0;
            int i5 = 0;
            while (i4 < n) {
                if (this.f16022a.mo15665e(i4, i3)) {
                    if ((i5 & 1) == 1) {
                        i5++;
                    }
                    iArr[i5] = iArr[i5] + 1;
                } else if ((i5 & 1) != 0) {
                    iArr[i5] = iArr[i5] + 1;
                } else if (i5 != 4) {
                    i5++;
                    iArr[i5] = iArr[i5] + 1;
                } else if (!m22900h(iArr) || !mo15952k(iArr, i3, i4)) {
                    mo15953n(iArr);
                    i5 = 3;
                } else {
                    if (this.f16024c) {
                        z2 = m22903l();
                    } else {
                        int g = m22899g();
                        if (g > iArr[2]) {
                            i3 += (g - iArr[2]) - 2;
                            i4 = n - 1;
                        }
                    }
                    mo15950b(iArr);
                    i2 = 2;
                    i5 = 0;
                }
                i4++;
            }
            if (m22900h(iArr) && mo15952k(iArr, i3, n)) {
                i2 = iArr[0];
                if (this.f16024c) {
                    z2 = m22903l();
                }
            }
            i3 += i2;
        }
        C5539d[] m = m22904m();
        C5383o.m22210e(m);
        return new C5543f(m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo15952k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m22895a(iArr, i2);
        float e = m22898e(i, a, iArr[2], i3);
        if (!Float.isNaN(e)) {
            int i4 = (int) e;
            float d = m22897d(a, i4, iArr[2], i3);
            if (!Float.isNaN(d) && m22896c(i4, (int) d)) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f16023b.size()) {
                        break;
                    }
                    C5539d dVar = this.f16023b.get(i5);
                    if (dVar.mo15946f(f, e, d)) {
                        this.f16023b.set(i5, dVar.mo15947g(e, d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C5539d dVar2 = new C5539d(d, e, f);
                    this.f16023b.add(dVar2);
                    C5384p pVar = this.f16026e;
                    if (pVar != null) {
                        pVar.mo9796a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo15953n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
