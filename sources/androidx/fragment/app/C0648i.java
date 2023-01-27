package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p086f.p102e.C3203g;

/* renamed from: androidx.fragment.app.i */
public class C0648i {

    /* renamed from: a */
    private static final C3203g<String, Class<?>> f2728a = new C3203g<>();

    /* renamed from: b */
    static boolean m3231b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m3232c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m3232c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls = f2728a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f2728a.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m3233d(ClassLoader classLoader, String str) {
        try {
            return m3232c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0626d("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0626d("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3375a(ClassLoader classLoader, String str) {
        throw null;
    }
}
