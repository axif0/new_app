package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.l6 */
final class C4653l6 implements C4745qa {

    /* renamed from: a */
    private final C4615j6 f14249a;

    private C4653l6(C4615j6 j6Var) {
        C4470b7.m18818f(j6Var, "output");
        C4615j6 j6Var2 = j6Var;
        this.f14249a = j6Var2;
        j6Var2.f14196a = this;
    }

    /* renamed from: P */
    public static C4653l6 m19874P(C4615j6 j6Var) {
        C4653l6 l6Var = j6Var.f14196a;
        return l6Var != null ? l6Var : new C4653l6(j6Var);
    }

    /* renamed from: A */
    public final void mo14387A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19705w0(list.get(i4).longValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14281a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14280Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo14388B(int i, long j) throws IOException {
        this.f14249a.mo14280Z(i, j);
    }

    /* renamed from: C */
    public final void mo14389C(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19706x0(list.get(i4).intValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14283f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14290k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo14390D(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19661A(list.get(i4).floatValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14287i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14291l(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo14391E(int i, String str) throws IOException {
        this.f14249a.mo14297r(i, str);
    }

    /* renamed from: F */
    public final void mo14392F(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19698p0(list.get(i4).intValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14272O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14279Y(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo14393G(int i, int i2) throws IOException {
        this.f14249a.mo14279Y(i, i2);
    }

    /* renamed from: H */
    public final void mo14394H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19662A0(list.get(i4).intValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14283f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14290k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo14395I(int i, long j) throws IOException {
        this.f14249a.mo14274Q(i, j);
    }

    /* renamed from: J */
    public final void mo14396J(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C4758r7) {
            C4758r7 r7Var = (C4758r7) list;
            while (i2 < list.size()) {
                Object g = r7Var.mo14576g(i2);
                if (g instanceof String) {
                    this.f14249a.mo14297r(i, (String) g);
                } else {
                    this.f14249a.mo14294o(i, (C4773s5) g);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14297r(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: K */
    public final void mo14397K(int i, int i2) throws IOException {
        this.f14249a.mo14290k0(i, i2);
    }

    /* renamed from: L */
    public final void mo14398L(int i, long j) throws IOException {
        this.f14249a.mo14293n(i, j);
    }

    /* renamed from: M */
    public final void mo14399M(int i, double d) throws IOException {
        this.f14249a.mo14289k(i, d);
    }

    /* renamed from: N */
    public final void mo14400N(int i, float f) throws IOException {
        this.f14249a.mo14291l(i, f);
    }

    /* renamed from: O */
    public final void mo14401O(int i, Object obj, C4453a9 a9Var) throws IOException {
        this.f14249a.mo14296q(i, (C4655l8) obj, a9Var);
    }

    /* renamed from: a */
    public final int mo14402a() {
        return C4895z6.C4900e.f14690k;
    }

    /* renamed from: b */
    public final void mo14403b(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19701s0(list.get(i4).longValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14281a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14280Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final <K, V> void mo14404c(int i, C4471b8<K, V> b8Var, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f14249a.mo14292m(i, 2);
            this.f14249a.mo14272O(C4489c8.m18959a(b8Var, next.getKey(), next.getValue()));
            C4489c8.m18960b(this.f14249a, b8Var, next.getKey(), next.getValue());
        }
    }

    /* renamed from: d */
    public final void mo14405d(int i, boolean z) throws IOException {
        this.f14249a.mo14298s(i, z);
    }

    /* renamed from: e */
    public final void mo14406e(int i) throws IOException {
        this.f14249a.mo14292m(i, 3);
    }

    /* renamed from: f */
    public final void mo14407f(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19678L(list.get(i4).booleanValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14304y(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14298s(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo14408g(int i) throws IOException {
        this.f14249a.mo14292m(i, 4);
    }

    /* renamed from: h */
    public final void mo14409h(int i, int i2) throws IOException {
        this.f14249a.mo14285g0(i, i2);
    }

    /* renamed from: i */
    public final void mo14410i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19697o0(list.get(i4).longValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14276S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14274Q(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo14411j(int i, long j) throws IOException {
        this.f14249a.mo14280Z(i, j);
    }

    /* renamed from: k */
    public final void mo14412k(int i, Object obj, C4453a9 a9Var) throws IOException {
        C4615j6 j6Var = this.f14249a;
        j6Var.mo14292m(i, 3);
        a9Var.mo13802h((C4655l8) obj, j6Var.f14196a);
        j6Var.mo14292m(i, 4);
    }

    /* renamed from: l */
    public final void mo14413l(int i, int i2) throws IOException {
        this.f14249a.mo14273P(i, i2);
    }

    /* renamed from: m */
    public final void mo14414m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19694l0(list.get(i4).intValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14288j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14273P(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo14415n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19693j0(list.get(i4).longValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14299t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14293n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo14416o(int i, List<?> list, C4453a9 a9Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo14412k(i, list.get(i2), a9Var);
        }
    }

    /* renamed from: p */
    public final void mo14417p(int i, C4773s5 s5Var) throws IOException {
        this.f14249a.mo14294o(i, s5Var);
    }

    /* renamed from: q */
    public final void mo14418q(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19666C0(list.get(i4).intValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14288j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14273P(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo14419r(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19702t0(list.get(i4).intValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14278X(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14285g0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo14420s(int i, int i2) throws IOException {
        this.f14249a.mo14273P(i, i2);
    }

    /* renamed from: t */
    public final void mo14421t(int i, long j) throws IOException {
        this.f14249a.mo14293n(i, j);
    }

    /* renamed from: u */
    public final void mo14422u(int i, Object obj) throws IOException {
        if (obj instanceof C4773s5) {
            this.f14249a.mo14275R(i, (C4773s5) obj);
        } else {
            this.f14249a.mo14295p(i, (C4655l8) obj);
        }
    }

    /* renamed from: v */
    public final void mo14423v(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19689e0(list.get(i4).longValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14299t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14293n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void mo14424w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14249a.mo14292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4615j6.m19708z(list.get(i4).doubleValue());
            }
            this.f14249a.mo14272O(i3);
            while (i2 < list.size()) {
                this.f14249a.mo14286h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14249a.mo14289k(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo14425x(int i, List<?> list, C4453a9 a9Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo14401O(i, list.get(i2), a9Var);
        }
    }

    /* renamed from: y */
    public final void mo14426y(int i, List<C4773s5> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f14249a.mo14294o(i, list.get(i2));
        }
    }

    /* renamed from: z */
    public final void mo14427z(int i, int i2) throws IOException {
        this.f14249a.mo14290k0(i, i2);
    }
}
