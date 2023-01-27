package p086f.p111h.p114f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p086f.p111h.p112e.p113c.C3271c;
import p086f.p111h.p119j.C3312b;

/* renamed from: f.h.f.e */
class C3293e extends C3298j {

    /* renamed from: b */
    private static Class<?> f10528b = null;

    /* renamed from: c */
    private static Constructor<?> f10529c = null;

    /* renamed from: d */
    private static Method f10530d = null;

    /* renamed from: e */
    private static Method f10531e = null;

    /* renamed from: f */
    private static boolean f10532f = false;

    C3293e() {
    }

    /* renamed from: k */
    private static boolean m14188k(Object obj, String str, int i, boolean z) {
        m14191n();
        try {
            return ((Boolean) f10530d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface mo11453l(Object obj) {
        m14191n();
        try {
            Object newInstance = Array.newInstance(f10528b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10531e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m14190m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m14191n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f10532f) {
            f10532f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f10529c = constructor;
            f10528b = cls;
            f10530d = method;
            f10531e = method2;
        }
    }

    /* renamed from: o */
    private static Object m14192o() {
        m14191n();
        try {
            return f10529c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo11449b(Context context, C3271c.C3273b bVar, Resources resources, int i) {
        Object o = m14192o();
        C3271c.C3274c[] a = bVar.mo11430a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C3271c.C3274c cVar = a[i2];
            File e = C3302k.m14249e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C3302k.m14247c(e, resources, cVar.mo11432b())) {
                    e.delete();
                    return null;
                } else if (!m14188k(o, e.getPath(), cVar.mo11435e(), cVar.mo11436f())) {
                    return null;
                } else {
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo11453l(o);
    }

    /* renamed from: c */
    public Typeface mo11450c(Context context, CancellationSignal cancellationSignal, C3312b.C3318f[] fVarArr, int i) {
        FileInputStream fileInputStream;
        if (fVarArr.length < 1) {
            return null;
        }
        C3312b.C3318f h = mo11461h(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo11490c(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m = m14190m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo11460d(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return d;
            } catch (Throwable th) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
