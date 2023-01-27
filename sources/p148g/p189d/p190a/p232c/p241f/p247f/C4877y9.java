package p148g.p189d.p190a.p232c.p241f.p247f;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: g.d.a.c.f.f.y9 */
final class C4877y9 {

    /* renamed from: a */
    private static final Logger f14654a = Logger.getLogger(C4877y9.class.getName());

    /* renamed from: b */
    private static final Unsafe f14655b = m20682t();

    /* renamed from: c */
    private static final Class<?> f14656c = C4724p5.m20111c();

    /* renamed from: d */
    private static final boolean f14657d = m20649B(Long.TYPE);

    /* renamed from: e */
    private static final boolean f14658e = m20649B(Integer.TYPE);

    /* renamed from: f */
    private static final C4881d f14659f;

    /* renamed from: g */
    private static final boolean f14660g = m20652E();

    /* renamed from: h */
    private static final boolean f14661h = m20648A();

    /* renamed from: i */
    private static final long f14662i = ((long) m20676n(byte[].class));

    /* renamed from: j */
    static final boolean f14663j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: g.d.a.c.f.f.y9$a */
    static final class C4878a extends C4881d {
        C4878a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14769a(Object obj, long j) {
            return C4877y9.f14663j ? C4877y9.m20659L(obj, j) : C4877y9.m20660M(obj, j);
        }

        /* renamed from: b */
        public final void mo14770b(Object obj, long j, byte b) {
            if (C4877y9.f14663j) {
                C4877y9.m20683u(obj, j, b);
            } else {
                C4877y9.m20687y(obj, j, b);
            }
        }

        /* renamed from: c */
        public final void mo14771c(Object obj, long j, double d) {
            mo14778f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo14772d(Object obj, long j, float f) {
            mo14777e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo14773g(Object obj, long j, boolean z) {
            if (C4877y9.f14663j) {
                C4877y9.m20688z(obj, j, z);
            } else {
                C4877y9.m20651D(obj, j, z);
            }
        }

        /* renamed from: h */
        public final boolean mo14774h(Object obj, long j) {
            return C4877y9.f14663j ? C4877y9.m20661N(obj, j) : C4877y9.m20662O(obj, j);
        }

        /* renamed from: i */
        public final float mo14775i(Object obj, long j) {
            return Float.intBitsToFloat(mo14779k(obj, j));
        }

        /* renamed from: j */
        public final double mo14776j(Object obj, long j) {
            return Double.longBitsToDouble(mo14780l(obj, j));
        }
    }

    /* renamed from: g.d.a.c.f.f.y9$b */
    static final class C4879b extends C4881d {
        C4879b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14769a(Object obj, long j) {
            return this.f14664a.getByte(obj, j);
        }

        /* renamed from: b */
        public final void mo14770b(Object obj, long j, byte b) {
            this.f14664a.putByte(obj, j, b);
        }

        /* renamed from: c */
        public final void mo14771c(Object obj, long j, double d) {
            this.f14664a.putDouble(obj, j, d);
        }

        /* renamed from: d */
        public final void mo14772d(Object obj, long j, float f) {
            this.f14664a.putFloat(obj, j, f);
        }

        /* renamed from: g */
        public final void mo14773g(Object obj, long j, boolean z) {
            this.f14664a.putBoolean(obj, j, z);
        }

        /* renamed from: h */
        public final boolean mo14774h(Object obj, long j) {
            return this.f14664a.getBoolean(obj, j);
        }

        /* renamed from: i */
        public final float mo14775i(Object obj, long j) {
            return this.f14664a.getFloat(obj, j);
        }

        /* renamed from: j */
        public final double mo14776j(Object obj, long j) {
            return this.f14664a.getDouble(obj, j);
        }
    }

    /* renamed from: g.d.a.c.f.f.y9$c */
    static final class C4880c extends C4881d {
        C4880c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14769a(Object obj, long j) {
            return C4877y9.f14663j ? C4877y9.m20659L(obj, j) : C4877y9.m20660M(obj, j);
        }

        /* renamed from: b */
        public final void mo14770b(Object obj, long j, byte b) {
            if (C4877y9.f14663j) {
                C4877y9.m20683u(obj, j, b);
            } else {
                C4877y9.m20687y(obj, j, b);
            }
        }

        /* renamed from: c */
        public final void mo14771c(Object obj, long j, double d) {
            mo14778f(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: d */
        public final void mo14772d(Object obj, long j, float f) {
            mo14777e(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: g */
        public final void mo14773g(Object obj, long j, boolean z) {
            if (C4877y9.f14663j) {
                C4877y9.m20688z(obj, j, z);
            } else {
                C4877y9.m20651D(obj, j, z);
            }
        }

        /* renamed from: h */
        public final boolean mo14774h(Object obj, long j) {
            return C4877y9.f14663j ? C4877y9.m20661N(obj, j) : C4877y9.m20662O(obj, j);
        }

        /* renamed from: i */
        public final float mo14775i(Object obj, long j) {
            return Float.intBitsToFloat(mo14779k(obj, j));
        }

        /* renamed from: j */
        public final double mo14776j(Object obj, long j) {
            return Double.longBitsToDouble(mo14780l(obj, j));
        }
    }

    /* renamed from: g.d.a.c.f.f.y9$d */
    static abstract class C4881d {

        /* renamed from: a */
        Unsafe f14664a;

        C4881d(Unsafe unsafe) {
            this.f14664a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo14769a(Object obj, long j);

        /* renamed from: b */
        public abstract void mo14770b(Object obj, long j, byte b);

        /* renamed from: c */
        public abstract void mo14771c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo14772d(Object obj, long j, float f);

        /* renamed from: e */
        public final void mo14777e(Object obj, long j, int i) {
            this.f14664a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void mo14778f(Object obj, long j, long j2) {
            this.f14664a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo14773g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract boolean mo14774h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo14775i(Object obj, long j);

        /* renamed from: j */
        public abstract double mo14776j(Object obj, long j);

        /* renamed from: k */
        public final int mo14779k(Object obj, long j) {
            return this.f14664a.getInt(obj, j);
        }

        /* renamed from: l */
        public final long mo14780l(Object obj, long j) {
            return this.f14664a.getLong(obj, j);
        }
    }

    static {
        C4881d dVar;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        C4881d dVar2 = null;
        if (f14655b != null) {
            if (!C4724p5.m20110b()) {
                dVar2 = new C4879b(f14655b);
            } else if (f14657d) {
                dVar2 = new C4880c(f14655b);
            } else if (f14658e) {
                dVar2 = new C4878a(f14655b);
            }
        }
        f14659f = dVar2;
        m20676n(cls6);
        m20681s(cls6);
        m20676n(cls5);
        m20681s(cls5);
        m20676n(cls4);
        m20681s(cls4);
        m20676n(cls3);
        m20681s(cls3);
        m20676n(cls2);
        m20681s(cls2);
        m20676n(cls);
        m20681s(cls);
        Field G = m20654G();
        if (!(G == null || (dVar = f14659f) == null)) {
            dVar.f14664a.objectFieldOffset(G);
        }
    }

    private C4877y9() {
    }

    /* renamed from: A */
    private static boolean m20648A() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f14655b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (C4724p5.m20110b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f14654a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: B */
    private static boolean m20649B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C4724p5.m20110b()) {
            return false;
        }
        try {
            Class<?> cls3 = f14656c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: C */
    static double m20650C(Object obj, long j) {
        return f14659f.mo14776j(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static void m20651D(Object obj, long j, boolean z) {
        m20687y(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: E */
    private static boolean m20652E() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f14655b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (m20654G() == null) {
                return false;
            }
            if (C4724p5.m20110b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f14654a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: F */
    static Object m20653F(Object obj, long j) {
        return f14659f.f14664a.getObject(obj, j);
    }

    /* renamed from: G */
    private static Field m20654G() {
        Field d;
        if (C4724p5.m20110b() && (d = m20666d(Buffer.class, "effectiveDirectAddress")) != null) {
            return d;
        }
        Field d2 = m20666d(Buffer.class, "address");
        if (d2 == null || d2.getType() != Long.TYPE) {
            return null;
        }
        return d2;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static byte m20659L(Object obj, long j) {
        return (byte) (m20664b(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static byte m20660M(Object obj, long j) {
        return (byte) (m20664b(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static boolean m20661N(Object obj, long j) {
        return m20659L(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static boolean m20662O(Object obj, long j) {
        return m20660M(obj, j) != 0;
    }

    /* renamed from: a */
    static byte m20663a(byte[] bArr, long j) {
        return f14659f.mo14769a(bArr, f14662i + j);
    }

    /* renamed from: b */
    static int m20664b(Object obj, long j) {
        return f14659f.mo14779k(obj, j);
    }

    /* renamed from: c */
    static <T> T m20665c(Class<T> cls) {
        try {
            return f14655b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    private static Field m20666d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    static void m20668f(Object obj, long j, double d) {
        f14659f.mo14771c(obj, j, d);
    }

    /* renamed from: g */
    static void m20669g(Object obj, long j, float f) {
        f14659f.mo14772d(obj, j, f);
    }

    /* renamed from: h */
    static void m20670h(Object obj, long j, int i) {
        f14659f.mo14777e(obj, j, i);
    }

    /* renamed from: i */
    static void m20671i(Object obj, long j, long j2) {
        f14659f.mo14778f(obj, j, j2);
    }

    /* renamed from: j */
    static void m20672j(Object obj, long j, Object obj2) {
        f14659f.f14664a.putObject(obj, j, obj2);
    }

    /* renamed from: k */
    static void m20673k(Object obj, long j, boolean z) {
        f14659f.mo14773g(obj, j, z);
    }

    /* renamed from: l */
    static void m20674l(byte[] bArr, long j, byte b) {
        f14659f.mo14770b(bArr, f14662i + j, b);
    }

    /* renamed from: m */
    static boolean m20675m() {
        return f14661h;
    }

    /* renamed from: n */
    private static int m20676n(Class<?> cls) {
        if (f14661h) {
            return f14659f.f14664a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: o */
    static long m20677o(Object obj, long j) {
        return f14659f.mo14780l(obj, j);
    }

    /* renamed from: r */
    static boolean m20680r() {
        return f14660g;
    }

    /* renamed from: s */
    private static int m20681s(Class<?> cls) {
        if (f14661h) {
            return f14659f.f14664a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: t */
    static Unsafe m20682t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4454aa());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static void m20683u(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m20670h(obj, j2, ((255 & b) << i) | (m20664b(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: w */
    static boolean m20685w(Object obj, long j) {
        return f14659f.mo14774h(obj, j);
    }

    /* renamed from: x */
    static float m20686x(Object obj, long j) {
        return f14659f.mo14775i(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static void m20687y(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m20670h(obj, j2, ((255 & b) << i) | (m20664b(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static void m20688z(Object obj, long j, boolean z) {
        m20683u(obj, j, z ? (byte) 1 : 0);
    }
}
