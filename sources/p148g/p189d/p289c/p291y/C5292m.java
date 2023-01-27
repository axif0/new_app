package p148g.p189d.p289c.p291y;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: g.d.c.y.m */
public abstract class C5292m {

    /* renamed from: g.d.c.y.m$a */
    static class C5293a extends C5292m {

        /* renamed from: a */
        final /* synthetic */ Method f15370a;

        /* renamed from: b */
        final /* synthetic */ Object f15371b;

        C5293a(Method method, Object obj) {
            this.f15370a = method;
            this.f15371b = obj;
        }

        /* renamed from: c */
        public <T> T mo15489c(Class<T> cls) throws Exception {
            C5292m.m21947a(cls);
            return this.f15370a.invoke(this.f15371b, new Object[]{cls});
        }
    }

    /* renamed from: g.d.c.y.m$b */
    static class C5294b extends C5292m {

        /* renamed from: a */
        final /* synthetic */ Method f15372a;

        /* renamed from: b */
        final /* synthetic */ int f15373b;

        C5294b(Method method, int i) {
            this.f15372a = method;
            this.f15373b = i;
        }

        /* renamed from: c */
        public <T> T mo15489c(Class<T> cls) throws Exception {
            C5292m.m21947a(cls);
            return this.f15372a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f15373b)});
        }
    }

    /* renamed from: g.d.c.y.m$c */
    static class C5295c extends C5292m {

        /* renamed from: a */
        final /* synthetic */ Method f15374a;

        C5295c(Method method) {
            this.f15374a = method;
        }

        /* renamed from: c */
        public <T> T mo15489c(Class<T> cls) throws Exception {
            C5292m.m21947a(cls);
            return this.f15374a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: g.d.c.y.m$d */
    static class C5296d extends C5292m {
        C5296d() {
        }

        /* renamed from: c */
        public <T> T mo15489c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m21947a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static C5292m m21948b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C5293a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C5294b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C5295c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C5296d();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo15489c(Class<T> cls) throws Exception;
}
