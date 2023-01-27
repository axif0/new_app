package p148g.p189d.p190a.p232c.p240e;

import android.os.IBinder;
import java.lang.reflect.Field;
import p148g.p189d.p190a.p232c.p240e.C4400a;

/* renamed from: g.d.a.c.e.b */
public final class C4403b<T> extends C4400a.C4401a {

    /* renamed from: a */
    private final T f13944a;

    private C4403b(T t) {
        this.f13944a = t;
    }

    /* renamed from: S0 */
    public static <T> C4400a m18643S0(T t) {
        return new C4403b(t);
    }

    /* renamed from: w */
    public static <T> T m18644w(C4400a aVar) {
        if (aVar instanceof C4403b) {
            return ((C4403b) aVar).f13944a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
