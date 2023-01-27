package p148g.p189d.p289c.p291y;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.d.c.y.k */
public final class C5288k {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f15366a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m21941a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m21941a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m21941a(hashMap, hashMap2, Character.TYPE, Character.class);
        m21941a(hashMap, hashMap2, Double.TYPE, Double.class);
        m21941a(hashMap, hashMap2, Float.TYPE, Float.class);
        m21941a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m21941a(hashMap, hashMap2, Long.TYPE, Long.class);
        m21941a(hashMap, hashMap2, Short.TYPE, Short.class);
        m21941a(hashMap, hashMap2, Void.TYPE, Void.class);
        f15366a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m21941a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static boolean m21942b(Type type) {
        return f15366a.containsKey(type);
    }

    /* renamed from: c */
    public static <T> Class<T> m21943c(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f15366a;
        C5253a.m21861b(cls);
        Class<T> cls2 = map.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
