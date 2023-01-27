package p386o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: o.t */
abstract class C6376t<T> {
    C6376t() {
    }

    /* renamed from: b */
    static <T> C6376t<T> m26205b(C6373s sVar, Method method) {
        C6370q b = C6370q.m26171b(sVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C6379w.m26218k(genericReturnType)) {
            throw C6379w.m26221n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return C6331i.m26077f(sVar, method, b);
        } else {
            throw C6379w.m26221n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo17957a(Object[] objArr);
}
