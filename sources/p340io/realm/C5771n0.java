package p340io.realm;

import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;

/* renamed from: io.realm.n0 */
public abstract class C5771n0 implements C5763l0 {
    /* renamed from: S */
    public static <E extends C5763l0> boolean m24127S(E e) {
        return e instanceof C5720n;
    }

    /* renamed from: T */
    public static <E extends C5763l0> boolean m24128T(E e) {
        if (!(e instanceof C5720n)) {
            return e != null;
        }
        C5722p f = ((C5720n) e).mo16212L().mo16259f();
        return f != null && f.mo16582A();
    }
}
