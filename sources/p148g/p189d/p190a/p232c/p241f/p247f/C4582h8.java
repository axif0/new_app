package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.h8 */
final class C4582h8 implements C4507d8 {
    C4582h8() {
    }

    /* renamed from: b */
    public final Map<?, ?> mo14038b(Object obj) {
        return (C4544f8) obj;
    }

    /* renamed from: c */
    public final Object mo14039c(Object obj) {
        ((C4544f8) obj).mo14114f();
        return obj;
    }

    /* renamed from: d */
    public final Object mo14040d(Object obj, Object obj2) {
        C4544f8 f8Var = (C4544f8) obj;
        C4544f8 f8Var2 = (C4544f8) obj2;
        if (!f8Var2.isEmpty()) {
            if (!f8Var.mo14115g()) {
                f8Var = f8Var.mo14111e();
            }
            f8Var.mo14110d(f8Var2);
        }
        return f8Var;
    }

    /* renamed from: e */
    public final boolean mo14041e(Object obj) {
        return !((C4544f8) obj).mo14115g();
    }

    /* renamed from: f */
    public final Map<?, ?> mo14042f(Object obj) {
        return (C4544f8) obj;
    }

    /* renamed from: g */
    public final C4471b8<?, ?> mo14043g(Object obj) {
        C4489c8 c8Var = (C4489c8) obj;
        throw new NoSuchMethodError();
    }

    /* renamed from: h */
    public final Object mo14044h(Object obj) {
        return C4544f8.m19407c().mo14111e();
    }

    /* renamed from: i */
    public final int mo14045i(int i, Object obj, Object obj2) {
        C4544f8 f8Var = (C4544f8) obj;
        C4489c8 c8Var = (C4489c8) obj2;
        if (f8Var.isEmpty()) {
            return 0;
        }
        Iterator it = f8Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
