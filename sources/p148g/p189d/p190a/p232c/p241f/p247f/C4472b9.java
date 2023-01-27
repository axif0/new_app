package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.d.a.c.f.f.b9 */
final class C4472b9 {

    /* renamed from: a */
    private static final Class<?> f13999a = m18828F();

    /* renamed from: b */
    private static final C4777s9<?, ?> f14000b = m18859g(false);

    /* renamed from: c */
    private static final C4777s9<?, ?> f14001c = m18859g(true);

    /* renamed from: d */
    private static final C4777s9<?, ?> f14002d = new C4811u9();

    /* renamed from: A */
    static int m18823A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4875y7) {
            C4875y7 y7Var = (C4875y7) list;
            i = 0;
            while (i2 < size) {
                i += C4615j6.m19697o0(y7Var.mo14243g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4615j6.m19697o0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static C4777s9<?, ?> m18824B() {
        return f14002d;
    }

    /* renamed from: C */
    public static void m18825C(int i, List<Long> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14423v(i, list, z);
        }
    }

    /* renamed from: D */
    static int m18826D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18827E(list) + (size * C4615j6.m19691h0(i));
    }

    /* renamed from: E */
    static int m18827E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4488c7) {
            C4488c7 c7Var = (C4488c7) list;
            i = 0;
            while (i2 < size) {
                i += C4615j6.m19666C0(c7Var.mo13881d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4615j6.m19666C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    private static Class<?> m18828F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static void m18829G(int i, List<Long> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14415n(i, list, z);
        }
    }

    /* renamed from: H */
    static int m18830H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18831I(list) + (size * C4615j6.m19691h0(i));
    }

    /* renamed from: I */
    static int m18831I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4488c7) {
            C4488c7 c7Var = (C4488c7) list;
            i = 0;
            while (i2 < size) {
                i += C4615j6.m19694l0(c7Var.mo13881d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4615j6.m19694l0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    private static Class<?> m18832J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static void m18833K(int i, List<Long> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14410i(i, list, z);
        }
    }

    /* renamed from: L */
    static int m18834L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18835M(list) + (size * C4615j6.m19691h0(i));
    }

    /* renamed from: M */
    static int m18835M(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4488c7) {
            C4488c7 c7Var = (C4488c7) list;
            i = 0;
            while (i2 < size) {
                i += C4615j6.m19698p0(c7Var.mo13881d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4615j6.m19698p0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: N */
    public static void m18836N(int i, List<Long> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14403b(i, list, z);
        }
    }

    /* renamed from: O */
    static int m18837O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18838P(list) + (size * C4615j6.m19691h0(i));
    }

    /* renamed from: P */
    static int m18838P(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4488c7) {
            C4488c7 c7Var = (C4488c7) list;
            i = 0;
            while (i2 < size) {
                i += C4615j6.m19702t0(c7Var.mo13881d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4615j6.m19702t0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static void m18839Q(int i, List<Long> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14387A(i, list, z);
        }
    }

    /* renamed from: R */
    static int m18840R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C4615j6.m19707y0(i, 0);
    }

    /* renamed from: S */
    static int m18841S(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: T */
    public static void m18842T(int i, List<Integer> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14414m(i, list, z);
        }
    }

    /* renamed from: U */
    static int m18843U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C4615j6.m19700r0(i, 0);
    }

    /* renamed from: V */
    static int m18844V(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: W */
    public static void m18845W(int i, List<Integer> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14392F(i, list, z);
        }
    }

    /* renamed from: X */
    static int m18846X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C4615j6.m19674H(i, true);
    }

    /* renamed from: Y */
    static int m18847Y(List<?> list) {
        return list.size();
    }

    /* renamed from: Z */
    public static void m18848Z(int i, List<Integer> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14419r(i, list, z);
        }
    }

    /* renamed from: a */
    static int m18849a(int i, Object obj, C4453a9 a9Var) {
        return obj instanceof C4726p7 ? C4615j6.m19684c(i, (C4726p7) obj) : C4615j6.m19671F(i, (C4655l8) obj, a9Var);
    }

    /* renamed from: a0 */
    public static void m18850a0(int i, List<Integer> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14389C(i, list, z);
        }
    }

    /* renamed from: b */
    static int m18851b(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int h0 = C4615j6.m19691h0(i) * size;
        if (list instanceof C4758r7) {
            C4758r7 r7Var = (C4758r7) list;
            while (i2 < size) {
                Object g = r7Var.mo14576g(i2);
                h0 += g instanceof C4773s5 ? C4615j6.m19675I((C4773s5) g) : C4615j6.m19677K((String) g);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                h0 += obj instanceof C4773s5 ? C4615j6.m19675I((C4773s5) obj) : C4615j6.m19677K((String) obj);
                i2++;
            }
        }
        return h0;
    }

    /* renamed from: b0 */
    public static void m18852b0(int i, List<Integer> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14394H(i, list, z);
        }
    }

    /* renamed from: c */
    static int m18853c(int i, List<?> list, C4453a9 a9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = C4615j6.m19691h0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            h0 += obj instanceof C4726p7 ? C4615j6.m19686d((C4726p7) obj) : C4615j6.m19688e((C4655l8) obj, a9Var);
        }
        return h0;
    }

    /* renamed from: c0 */
    public static void m18854c0(int i, List<Integer> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14418q(i, list, z);
        }
    }

    /* renamed from: d */
    static int m18855d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m18857e(list) + (list.size() * C4615j6.m19691h0(i));
    }

    /* renamed from: d0 */
    public static void m18856d0(int i, List<Boolean> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14407f(i, list, z);
        }
    }

    /* renamed from: e */
    static int m18857e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4875y7) {
            C4875y7 y7Var = (C4875y7) list;
            i = 0;
            while (i2 < size) {
                i += C4615j6.m19689e0(y7Var.mo14243g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4615j6.m19689e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static C4777s9<?, ?> m18858f() {
        return f14000b;
    }

    /* renamed from: g */
    private static C4777s9<?, ?> m18859g(boolean z) {
        try {
            Class<?> J = m18832J();
            if (J == null) {
                return null;
            }
            return (C4777s9) J.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    static <UT, UB> UB m18860h(int i, int i2, UB ub, C4777s9<UT, UB> s9Var) {
        if (ub == null) {
            ub = s9Var.mo14624a();
        }
        s9Var.mo14625b(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: i */
    static <UT, UB> UB m18861i(int i, List<Integer> list, C4563g7 g7Var, UB ub, C4777s9<UT, UB> s9Var) {
        if (g7Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (g7Var.mo14197e(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m18860h(i, intValue, ub, s9Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!g7Var.mo14197e(intValue2)) {
                    ub = m18860h(i, intValue2, ub, s9Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: j */
    public static void m18862j(int i, List<String> list, C4745qa qaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14396J(i, list);
        }
    }

    /* renamed from: k */
    public static void m18863k(int i, List<?> list, C4745qa qaVar, C4453a9 a9Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14425x(i, list, a9Var);
        }
    }

    /* renamed from: l */
    public static void m18864l(int i, List<Double> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14424w(i, list, z);
        }
    }

    /* renamed from: m */
    static <T, FT extends C4808u6<FT>> void m18865m(C4709o6<FT> o6Var, T t, T t2) {
        C4774s6<FT> b = o6Var.mo14499b(t2);
        if (!b.f14477a.isEmpty()) {
            o6Var.mo14503f(t).mo14610g(b);
        }
    }

    /* renamed from: n */
    static <T> void m18866n(C4507d8 d8Var, T t, T t2, long j) {
        C4877y9.m20672j(t, j, d8Var.mo14040d(C4877y9.m20653F(t, j), C4877y9.m20653F(t2, j)));
    }

    /* renamed from: o */
    static <T, UT, UB> void m18867o(C4777s9<UT, UB> s9Var, T t, T t2) {
        s9Var.mo14628e(t, s9Var.mo14632i(s9Var.mo14629f(t), s9Var.mo14629f(t2)));
    }

    /* renamed from: p */
    public static void m18868p(Class<?> cls) {
        Class<?> cls2;
        if (!C4895z6.class.isAssignableFrom(cls) && (cls2 = f13999a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: q */
    static boolean m18869q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: r */
    static int m18870r(int i, List<C4773s5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h0 = size * C4615j6.m19691h0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            h0 += C4615j6.m19675I(list.get(i2));
        }
        return h0;
    }

    /* renamed from: s */
    static int m18871s(int i, List<C4655l8> list, C4453a9 a9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C4615j6.m19681V(i, list.get(i3), a9Var);
        }
        return i2;
    }

    /* renamed from: t */
    static int m18872t(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18873u(list) + (size * C4615j6.m19691h0(i));
    }

    /* renamed from: u */
    static int m18873u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4875y7) {
            C4875y7 y7Var = (C4875y7) list;
            i = 0;
            while (i2 < size) {
                i += C4615j6.m19693j0(y7Var.mo14243g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4615j6.m19693j0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v */
    public static C4777s9<?, ?> m18874v() {
        return f14001c;
    }

    /* renamed from: w */
    public static void m18875w(int i, List<C4773s5> list, C4745qa qaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14426y(i, list);
        }
    }

    /* renamed from: x */
    public static void m18876x(int i, List<?> list, C4745qa qaVar, C4453a9 a9Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14416o(i, list, a9Var);
        }
    }

    /* renamed from: y */
    public static void m18877y(int i, List<Float> list, C4745qa qaVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            qaVar.mo14390D(i, list, z);
        }
    }

    /* renamed from: z */
    static int m18878z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18823A(list) + (size * C4615j6.m19691h0(i));
    }
}
