package p386o;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: o.j */
public final class C6335j {

    /* renamed from: a */
    private final Method f17858a;

    /* renamed from: b */
    private final List<?> f17859b;

    C6335j(Method method, List<?> list) {
        this.f17858a = method;
        this.f17859b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo17959a() {
        return this.f17858a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f17858a.getDeclaringClass().getName(), this.f17858a.getName(), this.f17859b});
    }
}
