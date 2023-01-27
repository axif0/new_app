package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0263b;
import androidx.appcompat.widget.C0508z0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p086f.p102e.C3192b;

/* renamed from: androidx.appcompat.app.g */
public abstract class C0275g {

    /* renamed from: f */
    private static int f908f = -100;

    /* renamed from: g */
    private static final C3192b<WeakReference<C0275g>> f909g = new C3192b<>();

    /* renamed from: h */
    private static final Object f910h = new Object();

    C0275g() {
    }

    /* renamed from: A */
    static void m1029A(C0275g gVar) {
        synchronized (f910h) {
            m1030B(gVar);
        }
    }

    /* renamed from: B */
    private static void m1030B(C0275g gVar) {
        synchronized (f910h) {
            Iterator<WeakReference<C0275g>> it = f909g.iterator();
            while (it.hasNext()) {
                C0275g gVar2 = (C0275g) it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: D */
    public static void m1031D(boolean z) {
        C0508z0.m2331b(z);
    }

    /* renamed from: H */
    public static void m1032H(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f908f != i) {
            f908f = i;
            m1034f();
        }
    }

    /* renamed from: c */
    static void m1033c(C0275g gVar) {
        synchronized (f910h) {
            m1030B(gVar);
            f909g.add(new WeakReference(gVar));
        }
    }

    /* renamed from: f */
    private static void m1034f() {
        synchronized (f910h) {
            Iterator<WeakReference<C0275g>> it = f909g.iterator();
            while (it.hasNext()) {
                C0275g gVar = (C0275g) it.next().get();
                if (gVar != null) {
                    gVar.mo871e();
                }
            }
        }
    }

    /* renamed from: i */
    public static C0275g m1035i(Activity activity, C0274f fVar) {
        return new C0276h(activity, fVar);
    }

    /* renamed from: j */
    public static C0275g m1036j(Dialog dialog, C0274f fVar) {
        return new C0276h(dialog, fVar);
    }

    /* renamed from: l */
    public static int m1037l() {
        return f908f;
    }

    /* renamed from: C */
    public abstract boolean mo863C(int i);

    /* renamed from: E */
    public abstract void mo864E(int i);

    /* renamed from: F */
    public abstract void mo865F(View view);

    /* renamed from: G */
    public abstract void mo866G(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: I */
    public abstract void mo867I(Toolbar toolbar);

    /* renamed from: J */
    public void mo868J(int i) {
    }

    /* renamed from: K */
    public abstract void mo869K(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo870d(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: e */
    public abstract boolean mo871e();

    @Deprecated
    /* renamed from: g */
    public void mo872g(Context context) {
    }

    /* renamed from: h */
    public Context mo873h(Context context) {
        mo872g(context);
        return context;
    }

    /* renamed from: k */
    public abstract <T extends View> T mo874k(int i);

    /* renamed from: m */
    public abstract C0263b.C0265b mo875m();

    /* renamed from: n */
    public int mo876n() {
        return -100;
    }

    /* renamed from: o */
    public abstract MenuInflater mo877o();

    /* renamed from: p */
    public abstract C0259a mo878p();

    /* renamed from: q */
    public abstract void mo879q();

    /* renamed from: r */
    public abstract void mo880r();

    /* renamed from: s */
    public abstract void mo881s(Configuration configuration);

    /* renamed from: t */
    public abstract void mo882t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo883u();

    /* renamed from: v */
    public abstract void mo884v(Bundle bundle);

    /* renamed from: w */
    public abstract void mo885w();

    /* renamed from: x */
    public abstract void mo886x(Bundle bundle);

    /* renamed from: y */
    public abstract void mo887y();

    /* renamed from: z */
    public abstract void mo888z();
}
