package p148g.p189d.p289c.p291y.p294o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p148g.p189d.p289c.C5234m;

/* renamed from: g.d.c.y.o.c */
final class C5367c extends C5366b {

    /* renamed from: d */
    private static Class f15503d;

    /* renamed from: b */
    private final Object f15504b = m22158d();

    /* renamed from: c */
    private final Field f15505c = m22157c();

    C5367c() {
    }

    /* renamed from: c */
    private static Field m22157c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m22158d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f15503d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo15576b(AccessibleObject accessibleObject) {
        if (!mo15577e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C5234m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo15577e(AccessibleObject accessibleObject) {
        if (!(this.f15504b == null || this.f15505c == null)) {
            try {
                long longValue = ((Long) f15503d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f15504b, new Object[]{this.f15505c})).longValue();
                f15503d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f15504b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
