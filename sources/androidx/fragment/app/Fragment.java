package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0585l;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0715g;
import androidx.lifecycle.C0717i;
import androidx.lifecycle.C0718j;
import androidx.lifecycle.C0724n;
import androidx.lifecycle.C0741v;
import androidx.lifecycle.C0742w;
import androidx.savedstate.C0933a;
import androidx.savedstate.C0934b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p086f.p111h.p122m.C3389f;
import p086f.p137o.p138a.C3458a;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C0717i, C0742w, C0934b {

    /* renamed from: a0 */
    static final Object f2592a0 = new Object();

    /* renamed from: A */
    int f2593A;

    /* renamed from: B */
    int f2594B;

    /* renamed from: C */
    String f2595C;

    /* renamed from: D */
    boolean f2596D;

    /* renamed from: E */
    boolean f2597E;

    /* renamed from: F */
    boolean f2598F;

    /* renamed from: G */
    boolean f2599G;

    /* renamed from: H */
    boolean f2600H;

    /* renamed from: I */
    boolean f2601I = true;

    /* renamed from: J */
    private boolean f2602J;

    /* renamed from: K */
    ViewGroup f2603K;

    /* renamed from: L */
    View f2604L;

    /* renamed from: M */
    boolean f2605M;

    /* renamed from: N */
    boolean f2606N = true;

    /* renamed from: O */
    C0625c f2607O;

    /* renamed from: P */
    boolean f2608P;

    /* renamed from: Q */
    boolean f2609Q;

    /* renamed from: R */
    float f2610R;

    /* renamed from: S */
    LayoutInflater f2611S;

    /* renamed from: T */
    boolean f2612T;

    /* renamed from: U */
    C0710e.C0712b f2613U = C0710e.C0712b.RESUMED;

    /* renamed from: V */
    C0718j f2614V;

    /* renamed from: W */
    C0696y f2615W;

    /* renamed from: X */
    C0724n<C0717i> f2616X = new C0724n<>();

    /* renamed from: Y */
    C0933a f2617Y;

    /* renamed from: Z */
    private int f2618Z;

    /* renamed from: f */
    int f2619f = -1;

    /* renamed from: g */
    Bundle f2620g;

    /* renamed from: h */
    SparseArray<Parcelable> f2621h;

    /* renamed from: i */
    Boolean f2622i;

    /* renamed from: j */
    String f2623j = UUID.randomUUID().toString();

    /* renamed from: k */
    Bundle f2624k;

    /* renamed from: l */
    Fragment f2625l;

    /* renamed from: m */
    String f2626m = null;

    /* renamed from: n */
    int f2627n;

    /* renamed from: o */
    private Boolean f2628o = null;

    /* renamed from: p */
    boolean f2629p;

    /* renamed from: q */
    boolean f2630q;

    /* renamed from: r */
    boolean f2631r;

    /* renamed from: s */
    boolean f2632s;

    /* renamed from: t */
    boolean f2633t;

    /* renamed from: u */
    boolean f2634u;

    /* renamed from: v */
    int f2635v;

    /* renamed from: w */
    C0653m f2636w;

    /* renamed from: x */
    C0649j<?> f2637x;

    /* renamed from: y */
    C0653m f2638y = new C0664n();

    /* renamed from: z */
    Fragment f2639z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0623a implements Runnable {
        C0623a() {
        }

        public void run() {
            Fragment.this.mo3203j();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0624b extends C0645f {
        C0624b() {
        }

        /* renamed from: e */
        public View mo3249e(int i) {
            View view = Fragment.this.f2604L;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        /* renamed from: f */
        public boolean mo3250f() {
            return Fragment.this.f2604L != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    static class C0625c {

        /* renamed from: a */
        View f2643a;

        /* renamed from: b */
        Animator f2644b;

        /* renamed from: c */
        int f2645c;

        /* renamed from: d */
        int f2646d;

        /* renamed from: e */
        int f2647e;

        /* renamed from: f */
        Object f2648f = null;

        /* renamed from: g */
        Object f2649g;

        /* renamed from: h */
        Object f2650h;

        /* renamed from: i */
        Object f2651i;

        /* renamed from: j */
        Object f2652j;

        /* renamed from: k */
        Object f2653k;

        /* renamed from: l */
        Boolean f2654l;

        /* renamed from: m */
        Boolean f2655m;

        /* renamed from: n */
        C0585l f2656n;

        /* renamed from: o */
        C0585l f2657o;

        /* renamed from: p */
        boolean f2658p;

        /* renamed from: q */
        C0627e f2659q;

        /* renamed from: r */
        boolean f2660r;

        C0625c() {
            Object obj = Fragment.f2592a0;
            this.f2649g = obj;
            this.f2650h = null;
            this.f2651i = obj;
            this.f2652j = null;
            this.f2653k = obj;
            this.f2656n = null;
            this.f2657o = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public static class C0626d extends RuntimeException {
        public C0626d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    interface C0627e {
        /* renamed from: a */
        void mo3251a();

        /* renamed from: b */
        void mo3252b();
    }

    public Fragment() {
        m2990W();
    }

    /* renamed from: W */
    private void m2990W() {
        this.f2614V = new C0718j(this);
        this.f2617Y = C0933a.m5229a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2614V.mo3667a(new C0715g() {
                /* renamed from: d */
                public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
                    View view;
                    if (aVar == C0710e.C0711a.ON_STOP && (view = Fragment.this.f2604L) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: Y */
    public static Fragment m2991Y(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0648i.m3233d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3233u1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0626d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0626d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0626d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0626d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: l */
    private C0625c m2992l() {
        if (this.f2607O == null) {
            this.f2607O = new C0625c();
        }
        return this.f2607O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C0585l mo3129A() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        return cVar.f2656n;
    }

    @Deprecated
    /* renamed from: A0 */
    public void mo3130A0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2602J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void mo3131A1(C0627e eVar) {
        m2992l();
        C0627e eVar2 = this.f2607O.f2659q;
        if (eVar != eVar2) {
            if (eVar == null || eVar2 == null) {
                C0625c cVar = this.f2607O;
                if (cVar.f2658p) {
                    cVar.f2659q = eVar;
                }
                if (eVar != null) {
                    eVar.mo3252b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: B */
    public Object mo3132B() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        return cVar.f2650h;
    }

    /* renamed from: B0 */
    public void mo3133B0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2602J = true;
        C0649j<?> jVar = this.f2637x;
        Activity g = jVar == null ? null : jVar.mo3376g();
        if (g != null) {
            this.f2602J = false;
            mo3130A0(g, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo3134B1(int i) {
        m2992l().f2645c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C0585l mo3135C() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        return cVar.f2657o;
    }

    /* renamed from: C0 */
    public void mo3136C0(boolean z) {
    }

    /* renamed from: C1 */
    public void mo3137C1(Fragment fragment, int i) {
        C0653m mVar = this.f2636w;
        C0653m mVar2 = fragment != null ? fragment.f2636w : null;
        if (mVar == null || mVar2 == null || mVar == mVar2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.mo3173U();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.f2626m = null;
            } else if (this.f2636w == null || fragment.f2636w == null) {
                this.f2626m = null;
                this.f2625l = fragment;
                this.f2627n = i;
                return;
            } else {
                this.f2626m = fragment.f2623j;
            }
            this.f2625l = null;
            this.f2627n = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    /* renamed from: D */
    public final C0653m mo3138D() {
        return this.f2636w;
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    /* renamed from: D1 */
    public void mo3139D1(boolean z) {
        if (!this.f2606N && z && this.f2619f < 3 && this.f2636w != null && mo3181Z() && this.f2612T) {
            this.f2636w.mo3399C0(this);
        }
        this.f2606N = z;
        this.f2605M = this.f2619f < 3 && !z;
        if (this.f2620g != null) {
            this.f2622i = Boolean.valueOf(z);
        }
    }

    /* renamed from: E */
    public final Object mo3140E() {
        C0649j<?> jVar = this.f2637x;
        if (jVar == null) {
            return null;
        }
        return jVar.mo3319k();
    }

    /* renamed from: E0 */
    public void mo3141E0(Menu menu) {
    }

    /* renamed from: E1 */
    public void mo3142E1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo3144F1(intent, (Bundle) null);
    }

    /* renamed from: F */
    public final LayoutInflater mo3143F() {
        LayoutInflater layoutInflater = this.f2611S;
        return layoutInflater == null ? mo3184a1((Bundle) null) : layoutInflater;
    }

    /* renamed from: F0 */
    public void mo539F0() {
        this.f2602J = true;
    }

    /* renamed from: F1 */
    public void mo3144F1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0649j<?> jVar = this.f2637x;
        if (jVar != null) {
            jVar.mo3322n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    /* renamed from: G */
    public LayoutInflater mo3145G(Bundle bundle) {
        C0649j<?> jVar = this.f2637x;
        if (jVar != null) {
            LayoutInflater l = jVar.mo3320l();
            C3389f.m14553b(l, this.f2638y.mo3437g0());
            return l;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: G0 */
    public void mo3146G0(boolean z) {
    }

    /* renamed from: G1 */
    public void mo3147G1(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo3150H1(intent, i, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public int mo3148H() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return 0;
        }
        return cVar.f2646d;
    }

    /* renamed from: H0 */
    public void mo3149H0(Menu menu) {
    }

    /* renamed from: H1 */
    public void mo3150H1(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C0649j<?> jVar = this.f2637x;
        if (jVar != null) {
            jVar.mo3322n(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo3151I() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return 0;
        }
        return cVar.f2647e;
    }

    /* renamed from: I0 */
    public void mo3152I0(boolean z) {
    }

    /* renamed from: I1 */
    public void mo3153I1() {
        C0653m mVar = this.f2636w;
        if (mVar == null || mVar.f2758o == null) {
            m2992l().f2658p = false;
        } else if (Looper.myLooper() != this.f2636w.f2758o.mo3378i().getLooper()) {
            this.f2636w.f2758o.mo3378i().postAtFrontOfQueue(new C0623a());
        } else {
            mo3203j();
        }
    }

    /* renamed from: J */
    public final Fragment mo3154J() {
        return this.f2639z;
    }

    /* renamed from: J0 */
    public void mo3155J0(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: K */
    public final C0653m mo3156K() {
        C0653m mVar = this.f2636w;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: K0 */
    public void mo540K0() {
        this.f2602J = true;
    }

    /* renamed from: L */
    public Object mo3157L() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f2651i;
        return obj == f2592a0 ? mo3132B() : obj;
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
    }

    /* renamed from: M */
    public final Resources mo3158M() {
        return mo3217o1().getResources();
    }

    /* renamed from: M0 */
    public void mo3159M0() {
        this.f2602J = true;
    }

    /* renamed from: N */
    public final boolean mo3160N() {
        return this.f2598F;
    }

    /* renamed from: N0 */
    public void mo3161N0() {
        this.f2602J = true;
    }

    /* renamed from: O */
    public Object mo3162O() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f2649g;
        return obj == f2592a0 ? mo3245z() : obj;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
    }

    /* renamed from: P */
    public Object mo3163P() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        return cVar.f2652j;
    }

    /* renamed from: P0 */
    public void mo3164P0(Bundle bundle) {
        this.f2602J = true;
    }

    /* renamed from: Q */
    public Object mo3165Q() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f2653k;
        return obj == f2592a0 ? mo3163P() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3166Q0(Bundle bundle) {
        this.f2638y.mo3398B0();
        this.f2619f = 2;
        this.f2602J = false;
        mo3204j0(bundle);
        if (this.f2602J) {
            this.f2638y.mo3450r();
            return;
        }
        throw new C0629a0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public int mo3167R() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return 0;
        }
        return cVar.f2645c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3168R0() {
        this.f2638y.mo3436g(this.f2637x, new C0624b(), this);
        this.f2619f = 0;
        this.f2602J = false;
        mo358m0(this.f2637x.mo3377h());
        if (!this.f2602J) {
            throw new C0629a0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: S */
    public final String mo3169S(int i) {
        return mo3158M().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo3170S0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2638y.mo3452s(configuration);
    }

    /* renamed from: T */
    public final String mo3171T() {
        return this.f2595C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public boolean mo3172T0(MenuItem menuItem) {
        if (!this.f2596D) {
            return mo3216o0(menuItem) || this.f2638y.mo3454t(menuItem);
        }
        return false;
    }

    /* renamed from: U */
    public final Fragment mo3173U() {
        String str;
        Fragment fragment = this.f2625l;
        if (fragment != null) {
            return fragment;
        }
        C0653m mVar = this.f2636w;
        if (mVar == null || (str = this.f2626m) == null) {
            return null;
        }
        return mVar.mo3423V(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3174U0(Bundle bundle) {
        this.f2638y.mo3398B0();
        this.f2619f = 1;
        this.f2602J = false;
        this.f2617Y.mo4882c(bundle);
        mo362p0(bundle);
        this.f2612T = true;
        if (this.f2602J) {
            this.f2614V.mo3671i(C0710e.C0711a.ON_CREATE);
            return;
        }
        throw new C0629a0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: V */
    public View mo3175V() {
        return this.f2604L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public boolean mo3176V0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2596D) {
            return false;
        }
        if (this.f2600H && this.f2601I) {
            z = true;
            mo397s0(menu, menuInflater);
        }
        return z | this.f2638y.mo3459v(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3177W0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2638y.mo3398B0();
        this.f2634u = true;
        this.f2615W = new C0696y();
        View t0 = mo345t0(layoutInflater, viewGroup, bundle);
        this.f2604L = t0;
        if (t0 != null) {
            this.f2615W.mo3623e();
            this.f2616X.mo3633h(this.f2615W);
        } else if (!this.f2615W.mo3624f()) {
            this.f2615W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo3178X() {
        m2990W();
        this.f2623j = UUID.randomUUID().toString();
        this.f2629p = false;
        this.f2630q = false;
        this.f2631r = false;
        this.f2632s = false;
        this.f2633t = false;
        this.f2635v = 0;
        this.f2636w = null;
        this.f2638y = new C0664n();
        this.f2637x = null;
        this.f2593A = 0;
        this.f2594B = 0;
        this.f2595C = null;
        this.f2596D = false;
        this.f2597E = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void mo3179X0() {
        this.f2638y.mo3460w();
        this.f2614V.mo3671i(C0710e.C0711a.ON_DESTROY);
        this.f2619f = 0;
        this.f2602J = false;
        this.f2612T = false;
        mo3232u0();
        if (!this.f2602J) {
            throw new C0629a0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3180Y0() {
        this.f2638y.mo3461x();
        if (this.f2604L != null) {
            this.f2615W.mo3622b(C0710e.C0711a.ON_DESTROY);
        }
        this.f2619f = 1;
        this.f2602J = false;
        mo3238w0();
        if (this.f2602J) {
            C3458a.m14938b(this).mo11845c();
            this.f2634u = false;
            return;
        }
        throw new C0629a0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: Z */
    public final boolean mo3181Z() {
        return this.f2637x != null && this.f2629p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo3182Z0() {
        this.f2619f = -1;
        this.f2602J = false;
        mo346x0();
        this.f2611S = null;
        if (!this.f2602J) {
            throw new C0629a0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f2638y.mo3448o0()) {
            this.f2638y.mo3460w();
            this.f2638y = new C0664n();
        }
    }

    /* renamed from: a */
    public C0710e mo720a() {
        return this.f2614V;
    }

    /* renamed from: a0 */
    public final boolean mo3183a0() {
        return this.f2596D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public LayoutInflater mo3184a1(Bundle bundle) {
        LayoutInflater y0 = mo3243y0(bundle);
        this.f2611S = y0;
        return y0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo3185b0() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return false;
        }
        return cVar.f2660r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo3186b1() {
        onLowMemory();
        this.f2638y.mo3463y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final boolean mo3187c0() {
        return this.f2635v > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3188c1(boolean z) {
        mo3136C0(z);
        this.f2638y.mo3465z(z);
    }

    /* renamed from: d */
    public final SavedStateRegistry mo722d() {
        return this.f2617Y.mo4881b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public boolean mo3189d0() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return false;
        }
        return cVar.f2658p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public boolean mo3190d1(MenuItem menuItem) {
        if (!this.f2596D) {
            return (this.f2600H && this.f2601I && mo396D0(menuItem)) || this.f2638y.mo3395A(menuItem);
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean mo3191e0() {
        return this.f2630q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo3192e1(Menu menu) {
        if (!this.f2596D) {
            if (this.f2600H && this.f2601I) {
                mo3141E0(menu);
            }
            this.f2638y.mo3397B(menu);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final boolean mo3194f0() {
        Fragment J = mo3154J();
        return J != null && (J.mo3191e0() || J.mo3194f0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo3195f1() {
        this.f2638y.mo3400D();
        if (this.f2604L != null) {
            this.f2615W.mo3622b(C0710e.C0711a.ON_PAUSE);
        }
        this.f2614V.mo3671i(C0710e.C0711a.ON_PAUSE);
        this.f2619f = 3;
        this.f2602J = false;
        mo539F0();
        if (!this.f2602J) {
            throw new C0629a0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: g0 */
    public final boolean mo3196g0() {
        C0653m mVar = this.f2636w;
        if (mVar == null) {
            return false;
        }
        return mVar.mo3455t0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3197g1(boolean z) {
        mo3146G0(z);
        this.f2638y.mo3402E(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f2604L;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3198h0() {
        /*
            r1 = this;
            boolean r0 = r1.mo3181Z()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.mo3183a0()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.f2604L
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.f2604L
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3198h0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public boolean mo3199h1(Menu menu) {
        boolean z = false;
        if (this.f2596D) {
            return false;
        }
        if (this.f2600H && this.f2601I) {
            z = true;
            mo3149H0(menu);
        }
        return z | this.f2638y.mo3404F(menu);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo3201i0() {
        this.f2638y.mo3398B0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo3202i1() {
        boolean r0 = this.f2636w.mo3451r0(this);
        Boolean bool = this.f2628o;
        if (bool == null || bool.booleanValue() != r0) {
            this.f2628o = Boolean.valueOf(r0);
            mo3152I0(r0);
            this.f2638y.mo3405G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3203j() {
        C0625c cVar = this.f2607O;
        C0627e eVar = null;
        if (cVar != null) {
            cVar.f2658p = false;
            C0627e eVar2 = cVar.f2659q;
            cVar.f2659q = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.mo3251a();
        }
    }

    /* renamed from: j0 */
    public void mo3204j0(Bundle bundle) {
        this.f2602J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3205j1() {
        this.f2638y.mo3398B0();
        this.f2638y.mo3417Q(true);
        this.f2619f = 4;
        this.f2602J = false;
        mo540K0();
        if (this.f2602J) {
            this.f2614V.mo3671i(C0710e.C0711a.ON_RESUME);
            if (this.f2604L != null) {
                this.f2615W.mo3622b(C0710e.C0711a.ON_RESUME);
            }
            this.f2638y.mo3407H();
            return;
        }
        throw new C0629a0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: k */
    public void mo3206k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2593A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2594B));
        printWriter.print(" mTag=");
        printWriter.println(this.f2595C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2619f);
        printWriter.print(" mWho=");
        printWriter.print(this.f2623j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2635v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2629p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2630q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2631r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2632s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2596D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2597E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2601I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2600H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2598F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2606N);
        if (this.f2636w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2636w);
        }
        if (this.f2637x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2637x);
        }
        if (this.f2639z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2639z);
        }
        if (this.f2624k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2624k);
        }
        if (this.f2620g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2620g);
        }
        if (this.f2621h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2621h);
        }
        Fragment U = mo3173U();
        if (U != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(U);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2627n);
        }
        if (mo3148H() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo3148H());
        }
        if (this.f2603K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2603K);
        }
        if (this.f2604L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2604L);
        }
        if (mo3231u() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3231u());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo3167R());
        }
        if (mo3242y() != null) {
            C3458a.m14938b(this).mo11844a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2638y + ":");
        C0653m mVar = this.f2638y;
        mVar.mo3413M(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: k0 */
    public void mo3207k0(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo3208k1(Bundle bundle) {
        mo541L0(bundle);
        this.f2617Y.mo4883d(bundle);
        Parcelable P0 = this.f2638y.mo3416P0();
        if (P0 != null) {
            bundle.putParcelable("android:support:fragments", P0);
        }
    }

    @Deprecated
    /* renamed from: l0 */
    public void mo3209l0(Activity activity) {
        this.f2602J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo3210l1() {
        this.f2638y.mo3398B0();
        this.f2638y.mo3417Q(true);
        this.f2619f = 3;
        this.f2602J = false;
        mo3159M0();
        if (this.f2602J) {
            this.f2614V.mo3671i(C0710e.C0711a.ON_START);
            if (this.f2604L != null) {
                this.f2615W.mo3622b(C0710e.C0711a.ON_START);
            }
            this.f2638y.mo3408I();
            return;
        }
        throw new C0629a0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Fragment mo3211m(String str) {
        return str.equals(this.f2623j) ? this : this.f2638y.mo3427Y(str);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        this.f2602J = true;
        C0649j<?> jVar = this.f2637x;
        Activity g = jVar == null ? null : jVar.mo3376g();
        if (g != null) {
            this.f2602J = false;
            mo3209l0(g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo3212m1() {
        this.f2638y.mo3411K();
        if (this.f2604L != null) {
            this.f2615W.mo3622b(C0710e.C0711a.ON_STOP);
        }
        this.f2614V.mo3671i(C0710e.C0711a.ON_STOP);
        this.f2619f = 2;
        this.f2602J = false;
        mo3161N0();
        if (!this.f2602J) {
            throw new C0629a0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: n0 */
    public void mo3213n0(Fragment fragment) {
    }

    /* renamed from: n1 */
    public final C0636d mo3214n1() {
        C0636d o = mo3215o();
        if (o != null) {
            return o;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: o */
    public final C0636d mo3215o() {
        C0649j<?> jVar = this.f2637x;
        if (jVar == null) {
            return null;
        }
        return (C0636d) jVar.mo3376g();
    }

    /* renamed from: o0 */
    public boolean mo3216o0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: o1 */
    public final Context mo3217o1() {
        Context y = mo3242y();
        if (y != null) {
            return y;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2602J = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3214n1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2602J = true;
    }

    /* renamed from: p */
    public boolean mo3221p() {
        Boolean bool;
        C0625c cVar = this.f2607O;
        if (cVar == null || (bool = cVar.f2655m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        this.f2602J = true;
        mo3224q1(bundle);
        if (!this.f2638y.mo3453s0(1)) {
            this.f2638y.mo3457u();
        }
    }

    /* renamed from: p1 */
    public final View mo3222p1() {
        View V = mo3175V();
        if (V != null) {
            return V;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: q */
    public C0741v mo725q() {
        C0653m mVar = this.f2636w;
        if (mVar != null) {
            return mVar.mo3444l0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: q0 */
    public Animation mo3223q0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo3224q1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2638y.mo3414N0(parcelable);
            this.f2638y.mo3457u();
        }
    }

    /* renamed from: r0 */
    public Animator mo3225r0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final void mo3226r1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2621h;
        if (sparseArray != null) {
            this.f2604L.restoreHierarchyState(sparseArray);
            this.f2621h = null;
        }
        this.f2602J = false;
        mo3164P0(bundle);
        if (!this.f2602J) {
            throw new C0629a0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f2604L != null) {
            this.f2615W.mo3622b(C0710e.C0711a.ON_CREATE);
        }
    }

    /* renamed from: s */
    public boolean mo3227s() {
        Boolean bool;
        C0625c cVar = this.f2607O;
        if (cVar == null || (bool = cVar.f2654l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: s0 */
    public void mo397s0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo3228s1(View view) {
        m2992l().f2643a = view;
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2618Z;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo3229t1(Animator animator) {
        m2992l().f2644b = animator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2623j);
        sb.append(")");
        if (this.f2593A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2593A));
        }
        if (this.f2595C != null) {
            sb.append(" ");
            sb.append(this.f2595C);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public View mo3231u() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        return cVar.f2643a;
    }

    /* renamed from: u0 */
    public void mo3232u0() {
        this.f2602J = true;
    }

    /* renamed from: u1 */
    public void mo3233u1(Bundle bundle) {
        if (this.f2636w == null || !mo3196g0()) {
            this.f2624k = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Animator mo3234v() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        return cVar.f2644b;
    }

    /* renamed from: v0 */
    public void mo3235v0() {
    }

    /* renamed from: v1 */
    public void mo3236v1(boolean z) {
        if (this.f2600H != z) {
            this.f2600H = z;
            if (mo3181Z() && !mo3183a0()) {
                this.f2637x.mo3323o();
            }
        }
    }

    /* renamed from: w */
    public final Bundle mo3237w() {
        return this.f2624k;
    }

    /* renamed from: w0 */
    public void mo3238w0() {
        this.f2602J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public void mo3239w1(boolean z) {
        m2992l().f2660r = z;
    }

    /* renamed from: x */
    public final C0653m mo3240x() {
        if (this.f2637x != null) {
            return this.f2638y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: x0 */
    public void mo346x0() {
        this.f2602J = true;
    }

    /* renamed from: x1 */
    public void mo3241x1(boolean z) {
        if (this.f2601I != z) {
            this.f2601I = z;
            if (this.f2600H && mo3181Z() && !mo3183a0()) {
                this.f2637x.mo3323o();
            }
        }
    }

    /* renamed from: y */
    public Context mo3242y() {
        C0649j<?> jVar = this.f2637x;
        if (jVar == null) {
            return null;
        }
        return jVar.mo3377h();
    }

    /* renamed from: y0 */
    public LayoutInflater mo3243y0(Bundle bundle) {
        return mo3145G(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo3244y1(int i) {
        if (this.f2607O != null || i != 0) {
            m2992l().f2646d = i;
        }
    }

    /* renamed from: z */
    public Object mo3245z() {
        C0625c cVar = this.f2607O;
        if (cVar == null) {
            return null;
        }
        return cVar.f2648f;
    }

    /* renamed from: z0 */
    public void mo3246z0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo3247z1(int i) {
        if (this.f2607O != null || i != 0) {
            m2992l();
            this.f2607O.f2647e = i;
        }
    }
}
