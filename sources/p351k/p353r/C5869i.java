package p351k.p353r;

import java.util.List;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.r.i */
class C5869i extends C5868h {
    /* renamed from: b */
    public static final <T> List<T> m24389b() {
        return C5879s.f16888f;
    }

    /* renamed from: c */
    public static <T> List<T> m24390c(T... tArr) {
        C5956g.m24500e(tArr, "elements");
        return tArr.length > 0 ? C5864d.m24375a(tArr) : m24389b();
    }

    /* renamed from: d */
    public static <T> List<T> m24391d(List<? extends T> list) {
        C5956g.m24500e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C5868h.m24388a(list.get(0)) : m24389b();
    }

    /* renamed from: e */
    public static void m24392e() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
