package p086f.p111h.p112e.p113c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p086f.p111h.p121l.C3349h;

/* renamed from: f.h.e.c.f */
public final class C3279f {

    /* renamed from: f.h.e.c.f$a */
    public static abstract class C3280a {

        /* renamed from: f.h.e.c.f$a$a */
        class C3281a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Typeface f10510f;

            C3281a(Typeface typeface) {
                this.f10510f = typeface;
            }

            public void run() {
                C3280a.this.mo2458d(this.f10510f);
            }
        }

        /* renamed from: f.h.e.c.f$a$b */
        class C3282b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f10512f;

            C3282b(int i) {
                this.f10512f = i;
            }

            public void run() {
                C3280a.this.mo2457c(this.f10512f);
            }
        }

        /* renamed from: a */
        public final void mo11440a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C3282b(i));
        }

        /* renamed from: b */
        public final void mo11441b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C3281a(typeface));
        }

        /* renamed from: c */
        public abstract void mo2457c(int i);

        /* renamed from: d */
        public abstract void mo2458d(Typeface typeface);
    }

    /* renamed from: f.h.e.c.f$b */
    public static final class C3283b {

        /* renamed from: f.h.e.c.f$b$a */
        static class C3284a {

            /* renamed from: a */
            private static final Object f10514a = new Object();

            /* renamed from: b */
            private static Method f10515b;

            /* renamed from: c */
            private static boolean f10516c;

            /* renamed from: a */
            static void m14137a(Resources.Theme theme) {
                synchronized (f10514a) {
                    if (!f10516c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f10515b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f10516c = true;
                    }
                    if (f10515b != null) {
                        try {
                            f10515b.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f10515b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: f.h.e.c.f$b$b */
        static class C3285b {
            /* renamed from: a */
            static void m14138a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m14136a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C3285b.m14138a(theme);
            } else if (i >= 23) {
                C3284a.m14137a(theme);
            }
        }
    }

    /* renamed from: a */
    public static Drawable m14126a(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: b */
    public static Typeface m14127b(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m14130e(context, i, new TypedValue(), 0, (C3280a) null, (Handler) null, false);
    }

    /* renamed from: c */
    public static Typeface m14128c(Context context, int i, TypedValue typedValue, int i2, C3280a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m14130e(context, i, typedValue, i2, aVar, (Handler) null, true);
    }

    /* renamed from: d */
    public static void m14129d(Context context, int i, C3280a aVar, Handler handler) throws Resources.NotFoundException {
        C3349h.m14361c(aVar);
        if (context.isRestricted()) {
            aVar.mo11440a(-4, handler);
            return;
        }
        m14130e(context, i, new TypedValue(), 0, aVar, handler, false);
    }

    /* renamed from: e */
    private static Typeface m14130e(Context context, int i, TypedValue typedValue, int i2, C3280a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface f = m14131f(context, resources, typedValue, i, i2, aVar, handler, z);
        if (f != null || aVar != null) {
            return f;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m14131f(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, p086f.p111h.p112e.p113c.C3279f.C3280a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x009a
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo11440a(r14, r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = p086f.p111h.p114f.C3292d.m14186f(r0, r4, r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo11441b(r1, r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            f.h.e.c.c$a r2 = p086f.p111h.p112e.p113c.C3271c.m14102b(r1, r0)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0052
            r9.mo11440a(r14, r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p086f.p111h.p114f.C3292d.m14183c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = p086f.p111h.p114f.C3292d.m14184d(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo11441b(r0, r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo11440a(r14, r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x0087
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x0087:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L_0x0099
            r9.mo11440a(r14, r10)
        L_0x0099:
            return r13
        L_0x009a:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p112e.p113c.C3279f.m14131f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, f.h.e.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
