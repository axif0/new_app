package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Collections;
import java.util.List;

/* renamed from: g.d.a.c.f.f.w7 */
final class C4841w7 extends C4809u7 {

    /* renamed from: c */
    private static final Class<?> f14611c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C4841w7() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: g.d.a.c.f.f.s7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: g.d.a.c.f.f.s7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: g.d.a.c.f.f.s7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m20536e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m20537f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4758r7
            if (r1 == 0) goto L_0x0014
            g.d.a.c.f.f.s7 r0 = new g.d.a.c.f.f.s7
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4859x8
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4581h7
            if (r1 == 0) goto L_0x0024
            g.d.a.c.f.f.h7 r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4581h7) r0
            g.d.a.c.f.f.h7 r6 = r0.mo13882e(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20672j(r3, r4, r0)
            goto L_0x007a
        L_0x002d:
            java.lang.Class<?> r1 = f14611c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0046:
            p148g.p189d.p190a.p232c.p241f.p247f.C4877y9.m20672j(r3, r4, r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4860x9
            if (r1 == 0) goto L_0x005f
            g.d.a.c.f.f.s7 r1 = new g.d.a.c.f.f.s7
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            g.d.a.c.f.f.x9 r0 = (p148g.p189d.p190a.p232c.p241f.p247f.C4860x9) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4859x8
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof p148g.p189d.p190a.p232c.p241f.p247f.C4581h7
            if (r1 == 0) goto L_0x007a
            r1 = r0
            g.d.a.c.f.f.h7 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4581h7) r1
            boolean r2 = r1.mo14223a()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            g.d.a.c.f.f.h7 r0 = r1.mo13882e(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4841w7.m20536e(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: f */
    private static <E> List<E> m20537f(Object obj, long j) {
        return (List) C4877y9.m20653F(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo14676b(Object obj, Object obj2, long j) {
        List f = m20537f(obj2, j);
        List e = m20536e(obj, j, f.size());
        int size = e.size();
        int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        C4877y9.m20672j(obj, j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14677d(Object obj, long j) {
        Object obj2;
        List list = (List) C4877y9.m20653F(obj, j);
        if (list instanceof C4758r7) {
            obj2 = ((C4758r7) list).mo14578v();
        } else if (!f14611c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C4859x8) || !(list instanceof C4581h7)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C4581h7 h7Var = (C4581h7) list;
                if (h7Var.mo14223a()) {
                    h7Var.mo14224y();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C4877y9.m20672j(obj, j, obj2);
    }
}
