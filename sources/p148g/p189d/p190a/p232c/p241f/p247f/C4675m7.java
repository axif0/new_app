package p148g.p189d.p190a.p232c.p241f.p247f;

import com.karumi.dexter.BuildConfig;

/* renamed from: g.d.a.c.f.f.m7 */
public enum C4675m7 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(C4773s5.class, C4773s5.class, C4773s5.f14473g),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: f */
    private final Class<?> f14293f;

    /* renamed from: g */
    private final Object f14294g;

    private C4675m7(Class<?> cls, Class<?> cls2, Object obj) {
        this.f14293f = cls2;
        this.f14294g = obj;
    }

    /* renamed from: e */
    public final Class<?> mo14459e() {
        return this.f14293f;
    }
}
