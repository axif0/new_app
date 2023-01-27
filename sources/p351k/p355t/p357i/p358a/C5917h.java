package p351k.p355t.p357i.p358a;

import java.lang.reflect.Method;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.t.i.a.h */
final class C5917h {

    /* renamed from: a */
    private static final C5918a f16906a = new C5918a((Method) null, (Method) null, (Method) null);

    /* renamed from: b */
    public static C5918a f16907b;

    /* renamed from: c */
    public static final C5917h f16908c = new C5917h();

    /* renamed from: k.t.i.a.h$a */
    private static final class C5918a {

        /* renamed from: a */
        public final Method f16909a;

        /* renamed from: b */
        public final Method f16910b;

        /* renamed from: c */
        public final Method f16911c;

        public C5918a(Method method, Method method2, Method method3) {
            this.f16909a = method;
            this.f16910b = method2;
            this.f16911c = method3;
        }
    }

    private C5917h() {
    }

    /* renamed from: a */
    private final C5918a m24471a(C5910a aVar) {
        try {
            C5918a aVar2 = new C5918a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f16907b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C5918a aVar3 = f16906a;
            f16907b = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo16987b(C5910a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        C5956g.m24500e(aVar, "continuation");
        C5918a aVar2 = f16907b;
        if (aVar2 == null) {
            aVar2 = m24471a(aVar);
        }
        Object obj = null;
        if (aVar2 == f16906a || (method = aVar2.f16909a) == null || (invoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = aVar2.f16910b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar2.f16911c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            obj = invoke3;
        }
        return (String) obj;
    }
}
