package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.v7 */
final class C4825v7 extends C4809u7 {
    private C4825v7() {
        super();
    }

    /* renamed from: e */
    private static <E> C4581h7<E> m20496e(Object obj, long j) {
        return (C4581h7) C4877y9.m20653F(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo14676b(Object obj, Object obj2, long j) {
        C4581h7 e = m20496e(obj, j);
        C4581h7 e2 = m20496e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.mo14223a()) {
                e = e.mo13882e(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        C4877y9.m20672j(obj, j, e2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14677d(Object obj, long j) {
        m20496e(obj, j).mo14224y();
    }
}
