package p086f.p111h.p114f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p086f.p111h.p112e.p113c.C3271c;
import p086f.p111h.p119j.C3312b;

/* renamed from: f.h.f.j */
class C3298j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C3271c.C3273b> f10544a = new ConcurrentHashMap<>();

    /* renamed from: f.h.f.j$a */
    class C3299a implements C3301c<C3312b.C3318f> {
        C3299a(C3298j jVar) {
        }

        /* renamed from: c */
        public int mo11463a(C3312b.C3318f fVar) {
            return fVar.mo11491d();
        }

        /* renamed from: d */
        public boolean mo11464b(C3312b.C3318f fVar) {
            return fVar.mo11492e();
        }
    }

    /* renamed from: f.h.f.j$b */
    class C3300b implements C3301c<C3271c.C3274c> {
        C3300b(C3298j jVar) {
        }

        /* renamed from: c */
        public int mo11463a(C3271c.C3274c cVar) {
            return cVar.mo11435e();
        }

        /* renamed from: d */
        public boolean mo11464b(C3271c.C3274c cVar) {
            return cVar.mo11436f();
        }
    }

    /* renamed from: f.h.f.j$c */
    private interface C3301c<T> {
        /* renamed from: a */
        int mo11463a(T t);

        /* renamed from: b */
        boolean mo11464b(T t);
    }

    C3298j() {
    }

    /* renamed from: a */
    private void m14225a(Typeface typeface, C3271c.C3273b bVar) {
        long j = m14228j(typeface);
        if (j != 0) {
            this.f10544a.put(Long.valueOf(j), bVar);
        }
    }

    /* renamed from: f */
    private C3271c.C3274c m14226f(C3271c.C3273b bVar, int i) {
        return (C3271c.C3274c) m14227g(bVar.mo11430a(), i, new C3300b(this));
    }

    /* renamed from: g */
    private static <T> T m14227g(T[] tArr, int i, C3301c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo11463a(t2) - i2) * 2) + (cVar.mo11464b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m14228j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo11449b(Context context, C3271c.C3273b bVar, Resources resources, int i) {
        C3271c.C3274c f = m14226f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C3292d.m14184d(context, resources, f.mo11432b(), f.mo11431a(), i);
        m14225a(d, bVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo11450c(Context context, CancellationSignal cancellationSignal, C3312b.C3318f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo11461h(fVarArr, i).mo11490c());
            try {
                Typeface d = mo11460d(context, inputStream);
                C3302k.m14245a(inputStream);
                return d;
            } catch (IOException unused) {
                C3302k.m14245a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C3302k.m14245a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C3302k.m14245a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C3302k.m14245a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo11460d(Context context, InputStream inputStream) {
        File e = C3302k.m14249e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C3302k.m14248d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo11452e(Context context, Resources resources, int i, String str, int i2) {
        File e = C3302k.m14249e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C3302k.m14247c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C3312b.C3318f mo11461h(C3312b.C3318f[] fVarArr, int i) {
        return (C3312b.C3318f) m14227g(fVarArr, i, new C3299a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C3271c.C3273b mo11462i(Typeface typeface) {
        long j = m14228j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f10544a.get(Long.valueOf(j));
    }
}
