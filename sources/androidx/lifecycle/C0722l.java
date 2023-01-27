package androidx.lifecycle;

import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.l */
public class C0722l {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f2975a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C0709d>>> f2976b = new HashMap();

    /* renamed from: a */
    private static C0709d m3630a(Constructor<? extends C0709d> constructor, Object obj) {
        try {
            return (C0709d) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends C0709d> m3631b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : BuildConfig.FLAVOR;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m3632c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m3632c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m3633d(Class<?> cls) {
        Integer num = f2975a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m3636g(cls);
        f2975a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m3634e(Class<?> cls) {
        return cls != null && C0716h.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static C0715g m3635f(Object obj) {
        boolean z = obj instanceof C0715g;
        boolean z2 = obj instanceof C0708c;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0708c) obj, (C0715g) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0708c) obj, (C0715g) null);
        }
        if (z) {
            return (C0715g) obj;
        }
        Class<?> cls = obj.getClass();
        if (m3633d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f2976b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m3630a((Constructor) list.get(0), obj));
        }
        C0709d[] dVarArr = new C0709d[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dVarArr[i] = m3630a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    /* renamed from: g */
    private static int m3636g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0709d> b = m3631b(cls);
        if (b != null) {
            f2976b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C0704a.f2950c.mo3648d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m3634e(superclass)) {
                if (m3633d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f2976b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m3634e(cls2)) {
                    if (m3633d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f2976b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2976b.put(cls, arrayList);
            return 2;
        }
    }
}
