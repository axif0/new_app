package p148g.p189d.p190a.p232c.p241f.p247f;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: g.d.a.c.f.f.aa */
final class C4454aa implements PrivilegedExceptionAction<Unsafe> {
    C4454aa() {
    }

    public final /* synthetic */ Object run() throws Exception {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }
}
