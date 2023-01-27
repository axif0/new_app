package p086f.p111h.p114f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p086f.p102e.C3196e;
import p086f.p111h.p112e.p113c.C3271c;
import p086f.p111h.p112e.p113c.C3279f;
import p086f.p111h.p119j.C3312b;

@SuppressLint({"NewApi"})
/* renamed from: f.h.f.d */
public class C3292d {

    /* renamed from: a */
    private static final C3298j f10526a;

    /* renamed from: b */
    private static final C3196e<String, Typeface> f10527b = new C3196e<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        f10526a = i >= 29 ? new C3297i() : i >= 28 ? new C3296h() : i >= 26 ? new C3295g() : (i < 24 || !C3294f.m14197m()) ? Build.VERSION.SDK_INT >= 21 ? new C3293e() : new C3298j() : new C3294f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = m14187g(r2, r3, r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m14181a(android.content.Context r2, android.graphics.Typeface r3, int r4) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000f
            android.graphics.Typeface r2 = m14187g(r2, r3, r4)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r4)
            return r2
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Context cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p114f.C3292d.m14181a(android.content.Context, android.graphics.Typeface, int):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static Typeface m14182b(Context context, CancellationSignal cancellationSignal, C3312b.C3318f[] fVarArr, int i) {
        return f10526a.mo11450c(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m14183c(Context context, C3271c.C3272a aVar, Resources resources, int i, int i2, C3279f.C3280a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C3271c.C3275d) {
            C3271c.C3275d dVar = (C3271c.C3275d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo11437a() == 0) {
                z2 = true;
            }
            typeface = C3312b.m14276g(context, dVar.mo11438b(), aVar2, handler, z2, z ? dVar.mo11439c() : -1, i2);
        } else {
            typeface = f10526a.mo11449b(context, (C3271c.C3273b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo11441b(typeface, handler);
                } else {
                    aVar2.mo11440a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f10527b.mo11063d(m14185e(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m14184d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f10526a.mo11452e(context, resources, i, str, i2);
        if (e != null) {
            f10527b.mo11063d(m14185e(resources, i, i2), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m14185e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: f */
    public static Typeface m14186f(Resources resources, int i, int i2) {
        return f10527b.mo11062c(m14185e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m14187g(Context context, Typeface typeface, int i) {
        C3271c.C3273b i2 = f10526a.mo11462i(typeface);
        if (i2 == null) {
            return null;
        }
        return f10526a.mo11449b(context, i2, context.getResources(), i);
    }
}
