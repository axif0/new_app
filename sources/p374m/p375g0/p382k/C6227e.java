package p374m.p375g0.p382k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m.g0.k.e */
class C6227e<T> {

    /* renamed from: a */
    private final Class<?> f17566a;

    /* renamed from: b */
    private final String f17567b;

    /* renamed from: c */
    private final Class[] f17568c;

    C6227e(Class<?> cls, String str, Class... clsArr) {
        this.f17566a = cls;
        this.f17567b = str;
        this.f17568c = clsArr;
    }

    /* renamed from: a */
    private Method m25504a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f17567b;
        if (str == null) {
            return null;
        }
        Method b = m25505b(cls, str, this.f17568c);
        if (b == null || (cls2 = this.f17566a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m25505b(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo17595c(T t, Object... objArr) throws InvocationTargetException {
        Method a = m25504a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f17567b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo17596d(T t, Object... objArr) throws InvocationTargetException {
        Method a = m25504a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object mo17597e(T t, Object... objArr) {
        try {
            return mo17596d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object mo17598f(T t, Object... objArr) {
        try {
            return mo17595c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean mo17599g(T t) {
        return m25504a(t.getClass()) != null;
    }
}
