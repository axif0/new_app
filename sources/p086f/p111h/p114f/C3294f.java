package p086f.p111h.p114f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p086f.p102e.C3203g;
import p086f.p111h.p112e.p113c.C3271c;
import p086f.p111h.p119j.C3312b;

/* renamed from: f.h.f.f */
class C3294f extends C3298j {

    /* renamed from: b */
    private static final Class<?> f10533b;

    /* renamed from: c */
    private static final Constructor<?> f10534c;

    /* renamed from: d */
    private static final Method f10535d;

    /* renamed from: e */
    private static final Method f10536e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f10534c = constructor;
        f10533b = cls;
        f10535d = method;
        f10536e = method2;
    }

    C3294f() {
    }

    /* renamed from: k */
    private static boolean m14195k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f10535d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m14196l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f10533b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10536e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m14197m() {
        if (f10535d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f10535d != null;
    }

    /* renamed from: n */
    private static Object m14198n() {
        try {
            return f10534c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo11449b(Context context, C3271c.C3273b bVar, Resources resources, int i) {
        Object n = m14198n();
        if (n == null) {
            return null;
        }
        for (C3271c.C3274c cVar : bVar.mo11430a()) {
            ByteBuffer b = C3302k.m14246b(context, resources, cVar.mo11432b());
            if (b == null || !m14195k(n, b, cVar.mo11433c(), cVar.mo11435e(), cVar.mo11436f())) {
                return null;
            }
        }
        return m14196l(n);
    }

    /* renamed from: c */
    public Typeface mo11450c(Context context, CancellationSignal cancellationSignal, C3312b.C3318f[] fVarArr, int i) {
        Object n = m14198n();
        if (n == null) {
            return null;
        }
        C3203g gVar = new C3203g();
        for (C3312b.C3318f fVar : fVarArr) {
            Uri c = fVar.mo11490c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C3302k.m14250f(context, cancellationSignal, c);
                gVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m14195k(n, byteBuffer, fVar.mo11489b(), fVar.mo11491d(), fVar.mo11492e())) {
                return null;
            }
        }
        Typeface l = m14196l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
