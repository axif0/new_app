package com.bumptech.glide.load.p014q.p017f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p087a.p094o.C3158d;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p112e.p113c.C3279f;

/* renamed from: com.bumptech.glide.load.q.f.a */
public final class C1286a {

    /* renamed from: a */
    private static volatile boolean f4506a = true;

    /* renamed from: a */
    public static Drawable m6449a(Context context, int i, Resources.Theme theme) {
        return m6451c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m6450b(Context context, Context context2, int i) {
        return m6451c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    private static Drawable m6451c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f4506a) {
                return m6453e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f4506a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C3267a.m14076f(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m6452d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m6452d(Context context, int i, Resources.Theme theme) {
        return C3279f.m14126a(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m6453e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C3158d(context, theme);
        }
        return C3133a.m13388d(context, i);
    }
}
