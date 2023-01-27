package p086f.p111h.p114f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p086f.p111h.p112e.p113c.C3271c;
import p086f.p111h.p119j.C3312b;

/* renamed from: f.h.f.g */
public class C3295g extends C3293e {

    /* renamed from: g */
    protected final Class<?> f10537g;

    /* renamed from: h */
    protected final Constructor<?> f10538h;

    /* renamed from: i */
    protected final Method f10539i;

    /* renamed from: j */
    protected final Method f10540j;

    /* renamed from: k */
    protected final Method f10541k;

    /* renamed from: l */
    protected final Method f10542l;

    /* renamed from: m */
    protected final Method f10543m;

    public C3295g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo11458y();
            constructor = mo11459z(y);
            method4 = mo11455v(y);
            method3 = mo11456w(y);
            method2 = mo11451A(y);
            method = mo11454u(y);
            Class<?> cls2 = y;
            method5 = mo11457x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f10537g = cls;
        this.f10538h = constructor;
        this.f10539i = method4;
        this.f10540j = method3;
        this.f10541k = method2;
        this.f10542l = method;
        this.f10543m = method5;
    }

    /* renamed from: o */
    private Object m14201o() {
        try {
            return this.f10538h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m14202p(Object obj) {
        try {
            this.f10542l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m14203q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10539i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m14204r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f10540j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m14205s(Object obj) {
        try {
            return ((Boolean) this.f10541k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m14206t() {
        if (this.f10539i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f10539i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Method mo11451A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: b */
    public Typeface mo11449b(Context context, C3271c.C3273b bVar, Resources resources, int i) {
        if (!m14206t()) {
            return super.mo11449b(context, bVar, resources, i);
        }
        Object o = m14201o();
        if (o == null) {
            return null;
        }
        for (C3271c.C3274c cVar : bVar.mo11430a()) {
            if (!m14203q(context, o, cVar.mo11431a(), cVar.mo11433c(), cVar.mo11435e(), cVar.mo11436f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo11434d()))) {
                m14202p(o);
                return null;
            }
        }
        if (!m14205s(o)) {
            return null;
        }
        return mo11453l(o);
    }

    /* renamed from: c */
    public Typeface mo11450c(Context context, CancellationSignal cancellationSignal, C3312b.C3318f[] fVarArr, int i) {
        Typeface l;
        ParcelFileDescriptor openFileDescriptor;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!m14206t()) {
            C3312b.C3318f h = mo11461h(fVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo11490c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo11491d()).setItalic(h.mo11492e()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> i2 = C3312b.m14278i(context, fVarArr, cancellationSignal);
            Object o = m14201o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C3312b.C3318f fVar : fVarArr) {
                ByteBuffer byteBuffer = i2.get(fVar.mo11490c());
                if (byteBuffer != null) {
                    if (!m14204r(o, byteBuffer, fVar.mo11489b(), fVar.mo11491d(), fVar.mo11492e() ? 1 : 0)) {
                        m14202p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m14202p(o);
                return null;
            } else if (m14205s(o) && (l = mo11453l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: e */
    public Typeface mo11452e(Context context, Resources resources, int i, String str, int i2) {
        if (!m14206t()) {
            return super.mo11452e(context, resources, i, str, i2);
        }
        Object o = m14201o();
        if (o == null) {
            return null;
        }
        if (!m14203q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m14202p(o);
            return null;
        } else if (!m14205s(o)) {
            return null;
        } else {
            return mo11453l(o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo11453l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10537g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10543m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo11454u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo11455v(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo11456w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo11457x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Class<?> mo11458y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Constructor<?> mo11459z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
