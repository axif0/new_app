package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p148g.p189d.p190a.p232c.p241f.p247f.C4808u6;

/* renamed from: g.d.a.c.f.f.s6 */
final class C4774s6<T extends C4808u6<T>> {

    /* renamed from: d */
    private static final C4774s6 f14476d = new C4774s6(true);

    /* renamed from: a */
    final C4545f9<T, Object> f14477a;

    /* renamed from: b */
    private boolean f14478b;

    /* renamed from: c */
    private boolean f14479c;

    private C4774s6() {
        this.f14477a = C4545f9.m19414b(16);
    }

    private C4774s6(C4545f9<T, Object> f9Var) {
        this.f14477a = f9Var;
        mo14612k();
    }

    private C4774s6(boolean z) {
        this(C4545f9.m19414b(0));
        mo14612k();
    }

    /* renamed from: a */
    public static int m20351a(C4808u6<?> u6Var, Object obj) {
        C4639ka b = u6Var.mo14671b();
        int a = u6Var.mo14670a();
        if (!u6Var.mo14673d()) {
            return m20352b(b, a, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (u6Var.mo14674f()) {
            for (Object j : list) {
                i += m20359j(b, j);
            }
            return C4615j6.m19691h0(a) + i + C4615j6.m19670E0(i);
        }
        for (Object b2 : list) {
            i += m20352b(b, a, b2);
        }
        return i;
    }

    /* renamed from: b */
    static int m20352b(C4639ka kaVar, int i, Object obj) {
        int h0 = C4615j6.m19691h0(i);
        if (kaVar == C4639ka.GROUP) {
            C4470b7.m18819g((C4655l8) obj);
            h0 <<= 1;
        }
        return h0 + m20359j(kaVar, obj);
    }

    /* renamed from: c */
    public static <T extends C4808u6<T>> C4774s6<T> m20353c() {
        return f14476d;
    }

    /* renamed from: d */
    private final Object m20354d(T t) {
        Object obj = this.f14477a.get(t);
        if (!(obj instanceof C4654l7)) {
            return obj;
        }
        C4654l7 l7Var = (C4654l7) obj;
        C4654l7.m19916e();
        throw null;
    }

    /* renamed from: e */
    private static Object m20355e(Object obj) {
        if (obj instanceof C4743q8) {
            return ((C4743q8) obj).mo14336a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: f */
    static void m20356f(C4615j6 j6Var, C4639ka kaVar, int i, Object obj) throws IOException {
        if (kaVar == C4639ka.GROUP) {
            C4655l8 l8Var = (C4655l8) obj;
            C4470b7.m18819g(l8Var);
            j6Var.mo14292m(i, 3);
            l8Var.mo14433e(j6Var);
            j6Var.mo14292m(i, 4);
            return;
        }
        j6Var.mo14292m(i, kaVar.mo14360g());
        switch (C4757r6.f14449b[kaVar.ordinal()]) {
            case 1:
                j6Var.mo14286h(((Double) obj).doubleValue());
                return;
            case 2:
                j6Var.mo14287i(((Float) obj).floatValue());
                return;
            case 3:
                j6Var.mo14299t(((Long) obj).longValue());
                return;
            case 4:
                j6Var.mo14299t(((Long) obj).longValue());
                return;
            case 5:
                j6Var.mo14288j(((Integer) obj).intValue());
                return;
            case 6:
                j6Var.mo14281a0(((Long) obj).longValue());
                return;
            case 7:
                j6Var.mo14283f0(((Integer) obj).intValue());
                return;
            case 8:
                j6Var.mo14304y(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C4655l8) obj).mo14433e(j6Var);
                return;
            case 10:
                j6Var.mo14301v((C4655l8) obj);
                return;
            case 11:
                if (obj instanceof C4773s5) {
                    j6Var.mo14300u((C4773s5) obj);
                    return;
                } else {
                    j6Var.mo14302w((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C4773s5) {
                    j6Var.mo14300u((C4773s5) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                j6Var.mo14277T(bArr, 0, bArr.length);
                return;
            case 13:
                j6Var.mo14272O(((Integer) obj).intValue());
                return;
            case 14:
                j6Var.mo14283f0(((Integer) obj).intValue());
                return;
            case 15:
                j6Var.mo14281a0(((Long) obj).longValue());
                return;
            case 16:
                j6Var.mo14278X(((Integer) obj).intValue());
                return;
            case 17:
                j6Var.mo14276S(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C4525e7) {
                    j6Var.mo14288j(((C4525e7) obj).mo14085a());
                    return;
                } else {
                    j6Var.mo14288j(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4525e7) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4654l7) == false) goto L_0x0014;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m20357h(p148g.p189d.p190a.p232c.p241f.p247f.C4639ka r2, java.lang.Object r3) {
        /*
            p148g.p189d.p190a.p232c.p241f.p247f.C4470b7.m18816d(r3)
            int[] r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4757r6.f14448a
            g.d.a.c.f.f.na r2 = r2.mo14359e()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4655l8
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4654l7
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4525e7
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4773s5
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004e
        L_0x004d:
            throw r2
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4774s6.m20357h(g.d.a.c.f.f.ka, java.lang.Object):void");
    }

    /* renamed from: i */
    private static <T extends C4808u6<T>> boolean m20358i(Map.Entry<T, Object> entry) {
        C4808u6 u6Var = (C4808u6) entry.getKey();
        if (u6Var.mo14672c() == C4695na.MESSAGE) {
            boolean d = u6Var.mo14673d();
            Object value = entry.getValue();
            if (d) {
                for (C4655l8 g : (List) value) {
                    if (!g.mo14480g()) {
                        return false;
                    }
                }
            } else if (value instanceof C4655l8) {
                if (!((C4655l8) value).mo14480g()) {
                    return false;
                }
            } else if (value instanceof C4654l7) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: j */
    private static int m20359j(C4639ka kaVar, Object obj) {
        switch (C4757r6.f14449b[kaVar.ordinal()]) {
            case 1:
                return C4615j6.m19708z(((Double) obj).doubleValue());
            case 2:
                return C4615j6.m19661A(((Float) obj).floatValue());
            case 3:
                return C4615j6.m19689e0(((Long) obj).longValue());
            case 4:
                return C4615j6.m19693j0(((Long) obj).longValue());
            case 5:
                return C4615j6.m19694l0(((Integer) obj).intValue());
            case 6:
                return C4615j6.m19701s0(((Long) obj).longValue());
            case 7:
                return C4615j6.m19706x0(((Integer) obj).intValue());
            case 8:
                return C4615j6.m19678L(((Boolean) obj).booleanValue());
            case 9:
                return C4615j6.m19682W((C4655l8) obj);
            case 10:
                return obj instanceof C4654l7 ? C4615j6.m19686d((C4654l7) obj) : C4615j6.m19676J((C4655l8) obj);
            case 11:
                return obj instanceof C4773s5 ? C4615j6.m19675I((C4773s5) obj) : C4615j6.m19677K((String) obj);
            case 12:
                return obj instanceof C4773s5 ? C4615j6.m19675I((C4773s5) obj) : C4615j6.m19679M((byte[]) obj);
            case 13:
                return C4615j6.m19698p0(((Integer) obj).intValue());
            case 14:
                return C4615j6.m19662A0(((Integer) obj).intValue());
            case 15:
                return C4615j6.m19705w0(((Long) obj).longValue());
            case 16:
                return C4615j6.m19702t0(((Integer) obj).intValue());
            case 17:
                return C4615j6.m19697o0(((Long) obj).longValue());
            case 18:
                return obj instanceof C4525e7 ? C4615j6.m19666C0(((C4525e7) obj).mo14085a()) : C4615j6.m19666C0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: l */
    private final void m20360l(T t, Object obj) {
        if (!t.mo14673d()) {
            m20357h(t.mo14671b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m20357h(t.mo14671b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C4654l7) {
            this.f14479c = true;
        }
        this.f14477a.put(t, obj);
    }

    /* renamed from: m */
    private final void m20361m(Map.Entry<T, Object> entry) {
        C4808u6 u6Var = (C4808u6) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C4654l7) {
            C4654l7 l7Var = (C4654l7) value;
            C4654l7.m19916e();
            throw null;
        } else if (u6Var.mo14673d()) {
            Object d = m20354d(u6Var);
            if (d == null) {
                d = new ArrayList();
            }
            for (Object e : (List) value) {
                ((List) d).add(m20355e(e));
            }
            this.f14477a.put(u6Var, d);
        } else if (u6Var.mo14672c() == C4695na.MESSAGE) {
            Object d2 = m20354d(u6Var);
            if (d2 == null) {
                this.f14477a.put(u6Var, m20355e(value));
            } else {
                this.f14477a.put(u6Var, d2 instanceof C4743q8 ? u6Var.mo14675p((C4743q8) d2, (C4743q8) value) : u6Var.mo14669I(((C4655l8) d2).mo14432d(), (C4655l8) value).mo14350h());
            }
        } else {
            this.f14477a.put(u6Var, m20355e(value));
        }
    }

    /* renamed from: n */
    private static int m20362n(Map.Entry<T, Object> entry) {
        C4808u6 u6Var = (C4808u6) entry.getKey();
        Object value = entry.getValue();
        if (u6Var.mo14672c() != C4695na.MESSAGE || u6Var.mo14673d() || u6Var.mo14674f()) {
            return m20351a(u6Var, value);
        }
        boolean z = value instanceof C4654l7;
        int a = ((C4808u6) entry.getKey()).mo14670a();
        return z ? C4615j6.m19667D(a, (C4654l7) value) : C4615j6.m19669E(a, (C4655l8) value);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C4774s6 s6Var = new C4774s6();
        for (int i = 0; i < this.f14477a.mo14129j(); i++) {
            Map.Entry<T, Object> h = this.f14477a.mo14126h(i);
            s6Var.m20360l((C4808u6) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f14477a.mo14130m()) {
            s6Var.m20360l((C4808u6) next.getKey(), next.getValue());
        }
        s6Var.f14479c = this.f14479c;
        return s6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4774s6)) {
            return false;
        }
        return this.f14477a.equals(((C4774s6) obj).f14477a);
    }

    /* renamed from: g */
    public final void mo14610g(C4774s6<T> s6Var) {
        for (int i = 0; i < s6Var.f14477a.mo14129j(); i++) {
            m20361m(s6Var.f14477a.mo14126h(i));
        }
        for (Map.Entry<T, Object> m : s6Var.f14477a.mo14130m()) {
            m20361m(m);
        }
    }

    public final int hashCode() {
        return this.f14477a.hashCode();
    }

    /* renamed from: k */
    public final void mo14612k() {
        if (!this.f14478b) {
            this.f14477a.mo14046e();
            this.f14478b = true;
        }
    }

    /* renamed from: o */
    public final boolean mo14613o() {
        return this.f14478b;
    }

    /* renamed from: p */
    public final Iterator<Map.Entry<T, Object>> mo14614p() {
        return this.f14479c ? new C4742q7(this.f14477a.entrySet().iterator()) : this.f14477a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Iterator<Map.Entry<T, Object>> mo14615q() {
        return this.f14479c ? new C4742q7(this.f14477a.mo14131o().iterator()) : this.f14477a.mo14131o().iterator();
    }

    /* renamed from: r */
    public final boolean mo14616r() {
        for (int i = 0; i < this.f14477a.mo14129j(); i++) {
            if (!m20358i(this.f14477a.mo14126h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> i2 : this.f14477a.mo14130m()) {
            if (!m20358i(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final int mo14617s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f14477a.mo14129j(); i2++) {
            i += m20362n(this.f14477a.mo14126h(i2));
        }
        for (Map.Entry<T, Object> n : this.f14477a.mo14130m()) {
            i += m20362n(n);
        }
        return i;
    }
}
