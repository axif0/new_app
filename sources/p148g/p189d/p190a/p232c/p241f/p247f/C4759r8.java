package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.r8 */
final class C4759r8<T> implements C4453a9<T> {

    /* renamed from: a */
    private final C4655l8 f14450a;

    /* renamed from: b */
    private final C4777s9<?, ?> f14451b;

    /* renamed from: c */
    private final boolean f14452c;

    /* renamed from: d */
    private final C4709o6<?> f14453d;

    private C4759r8(C4777s9<?, ?> s9Var, C4709o6<?> o6Var, C4655l8 l8Var) {
        this.f14451b = s9Var;
        this.f14452c = o6Var.mo14502e(l8Var);
        this.f14453d = o6Var;
        this.f14450a = l8Var;
    }

    /* renamed from: j */
    static <T> C4759r8<T> m20280j(C4777s9<?, ?> s9Var, C4709o6<?> o6Var, C4655l8 l8Var) {
        return new C4759r8<>(s9Var, o6Var, l8Var);
    }

    /* renamed from: a */
    public final T mo13795a() {
        return this.f14450a.mo14434f().mo14351m();
    }

    /* renamed from: b */
    public final int mo13796b(T t) {
        int hashCode = this.f14451b.mo14629f(t).hashCode();
        return this.f14452c ? (hashCode * 53) + this.f14453d.mo14499b(t).hashCode() : hashCode;
    }

    /* renamed from: c */
    public final boolean mo13797c(T t) {
        return this.f14453d.mo14499b(t).mo14616r();
    }

    /* renamed from: d */
    public final boolean mo13798d(T t, T t2) {
        if (!this.f14451b.mo14629f(t).equals(this.f14451b.mo14629f(t2))) {
            return false;
        }
        if (this.f14452c) {
            return this.f14453d.mo14499b(t).equals(this.f14453d.mo14499b(t2));
        }
        return true;
    }

    /* renamed from: e */
    public final void mo13799e(T t) {
        this.f14451b.mo14633j(t);
        this.f14453d.mo14504g(t);
    }

    /* renamed from: f */
    public final int mo13800f(T t) {
        C4777s9<?, ?> s9Var = this.f14451b;
        int k = s9Var.mo14634k(s9Var.mo14629f(t)) + 0;
        return this.f14452c ? k + this.f14453d.mo14499b(t).mo14617s() : k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: g.d.a.c.f.f.z6$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13801g(T r10, byte[] r11, int r12, int r13, p148g.p189d.p190a.p232c.p241f.p247f.C4756r5 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            g.d.a.c.f.f.z6 r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r0
            g.d.a.c.f.f.v9 r1 = r0.zzb
            g.d.a.c.f.f.v9 r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4827v9.m20502a()
            if (r1 != r2) goto L_0x0011
            g.d.a.c.f.f.v9 r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4827v9.m20505g()
            r0.zzb = r1
        L_0x0011:
            g.d.a.c.f.f.z6$d r10 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4899d) r10
            r10.mo14820B()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r11, r12, r14)
            int r2 = r14.f14444a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            g.d.a.c.f.f.o6<?> r12 = r9.f14453d
            g.d.a.c.f.f.m6 r0 = r14.f14447d
            g.d.a.c.f.f.l8 r3 = r9.f14450a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo14500c(r0, r3, r5)
            r0 = r12
            g.d.a.c.f.f.z6$f r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4901f) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20036c(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            p148g.p189d.p190a.p232c.p241f.p247f.C4842w8.m20540a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20034a(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r11, r4, r14)
            int r5 = r14.f14444a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20050q(r11, r4, r14)
            java.lang.Object r2 = r14.f14446c
            g.d.a.c.f.f.s5 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4773s5) r2
            goto L_0x0053
        L_0x0072:
            p148g.p189d.p190a.p232c.p241f.p247f.C4842w8.m20540a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20042i(r11, r4, r14)
            int r12 = r14.f14444a
            g.d.a.c.f.f.o6<?> r0 = r9.f14453d
            g.d.a.c.f.f.m6 r5 = r14.f14447d
            g.d.a.c.f.f.l8 r6 = r9.f14450a
            java.lang.Object r0 = r0.mo14500c(r5, r6, r12)
            g.d.a.c.f.f.z6$f r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4901f) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4708o5.m20034a(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.mo14684c(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            g.d.a.c.f.f.k7 r10 = p148g.p189d.p190a.p232c.p241f.p247f.C4636k7.m19827e()
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4759r8.mo13801g(java.lang.Object, byte[], int, int, g.d.a.c.f.f.r5):void");
    }

    /* renamed from: h */
    public final void mo13802h(T t, C4745qa qaVar) throws IOException {
        Iterator<Map.Entry<?, Object>> p = this.f14453d.mo14499b(t).mo14614p();
        while (p.hasNext()) {
            Map.Entry next = p.next();
            C4808u6 u6Var = (C4808u6) next.getKey();
            if (u6Var.mo14672c() != C4695na.MESSAGE || u6Var.mo14673d() || u6Var.mo14674f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            qaVar.mo14422u(u6Var.mo14670a(), next instanceof C4692n7 ? ((C4692n7) next).mo14476a().mo14535d() : next.getValue());
        }
        C4777s9<?, ?> s9Var = this.f14451b;
        s9Var.mo14630g(s9Var.mo14629f(t), qaVar);
    }

    /* renamed from: i */
    public final void mo13803i(T t, T t2) {
        C4472b9.m18867o(this.f14451b, t, t2);
        if (this.f14452c) {
            C4472b9.m18865m(this.f14453d, t, t2);
        }
    }
}
