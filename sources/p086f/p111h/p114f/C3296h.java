package p086f.p111h.p114f;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.h.f.h */
public class C3296h extends C3295g {
    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo11453l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10537g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10543m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo11457x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
