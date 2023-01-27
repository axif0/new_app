package androidx.lifecycle;

import androidx.lifecycle.C0710e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
class C0704a {

    /* renamed from: c */
    static C0704a f2950c = new C0704a();

    /* renamed from: a */
    private final Map<Class<?>, C0705a> f2951a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f2952b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    static class C0705a {

        /* renamed from: a */
        final Map<C0710e.C0711a, List<C0706b>> f2953a = new HashMap();

        /* renamed from: b */
        final Map<C0706b, C0710e.C0711a> f2954b;

        C0705a(Map<C0706b, C0710e.C0711a> map) {
            this.f2954b = map;
            for (Map.Entry next : map.entrySet()) {
                C0710e.C0711a aVar = (C0710e.C0711a) next.getValue();
                List list = this.f2953a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2953a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: b */
        private static void m3593b(List<C0706b> list, C0717i iVar, C0710e.C0711a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo3650a(iVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3649a(C0717i iVar, C0710e.C0711a aVar, Object obj) {
            m3593b(this.f2953a.get(aVar), iVar, aVar, obj);
            m3593b(this.f2953a.get(C0710e.C0711a.ON_ANY), iVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    static class C0706b {

        /* renamed from: a */
        final int f2955a;

        /* renamed from: b */
        final Method f2956b;

        C0706b(int i, Method method) {
            this.f2955a = i;
            this.f2956b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3650a(C0717i iVar, C0710e.C0711a aVar, Object obj) {
            try {
                int i = this.f2955a;
                if (i == 0) {
                    this.f2956b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2956b.invoke(obj, new Object[]{iVar});
                } else if (i == 2) {
                    this.f2956b.invoke(obj, new Object[]{iVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0706b.class != obj.getClass()) {
                return false;
            }
            C0706b bVar = (C0706b) obj;
            return this.f2955a == bVar.f2955a && this.f2956b.getName().equals(bVar.f2956b.getName());
        }

        public int hashCode() {
            return (this.f2955a * 31) + this.f2956b.getName().hashCode();
        }
    }

    C0704a() {
    }

    /* renamed from: a */
    private C0705a m3588a(Class<?> cls, Method[] methodArr) {
        int i;
        C0705a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo3647c(superclass)) == null)) {
            hashMap.putAll(c.f2954b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo3647c(c2).f2954b.entrySet()) {
                m3590e(hashMap, (C0706b) next.getKey(), (C0710e.C0711a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3589b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0726p pVar = (C0726p) method.getAnnotation(C0726p.class);
            if (pVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0717i.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0710e.C0711a value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0710e.C0711a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0710e.C0711a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m3590e(hashMap, new C0706b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0705a aVar = new C0705a(hashMap);
        this.f2951a.put(cls, aVar);
        this.f2952b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m3589b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m3590e(Map<C0706b, C0710e.C0711a> map, C0706b bVar, C0710e.C0711a aVar, Class<?> cls) {
        C0710e.C0711a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2956b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0705a mo3647c(Class<?> cls) {
        C0705a aVar = this.f2951a.get(cls);
        return aVar != null ? aVar : m3588a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3648d(Class<?> cls) {
        Boolean bool = this.f2952b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m3589b(cls);
        for (Method annotation : b) {
            if (((C0726p) annotation.getAnnotation(C0726p.class)) != null) {
                m3588a(cls, b);
                return true;
            }
        }
        this.f2952b.put(cls, Boolean.FALSE);
        return false;
    }
}
