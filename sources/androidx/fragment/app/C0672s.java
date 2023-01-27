package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0742w;
import p086f.p131l.C3451b;

/* renamed from: androidx.fragment.app.s */
class C0672s {

    /* renamed from: a */
    private final C0651l f2814a;

    /* renamed from: b */
    private final Fragment f2815b;

    /* renamed from: c */
    private int f2816c = -1;

    /* renamed from: androidx.fragment.app.s$a */
    static /* synthetic */ class C0673a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2817a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.C0710e.C0712b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2817a = r0
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0710e.C0712b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2817a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0710e.C0712b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2817a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$b r1 = androidx.lifecycle.C0710e.C0712b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0672s.C0673a.<clinit>():void");
        }
    }

    C0672s(C0651l lVar, Fragment fragment) {
        this.f2814a = lVar;
        this.f2815b = fragment;
    }

    C0672s(C0651l lVar, Fragment fragment, C0670r rVar) {
        this.f2814a = lVar;
        this.f2815b = fragment;
        fragment.f2621h = null;
        fragment.f2635v = 0;
        fragment.f2632s = false;
        fragment.f2629p = false;
        Fragment fragment2 = fragment.f2625l;
        fragment.f2626m = fragment2 != null ? fragment2.f2623j : null;
        Fragment fragment3 = this.f2815b;
        fragment3.f2625l = null;
        Bundle bundle = rVar.f2813r;
        fragment3.f2620g = bundle == null ? new Bundle() : bundle;
    }

    C0672s(C0651l lVar, ClassLoader classLoader, C0648i iVar, C0670r rVar) {
        this.f2814a = lVar;
        this.f2815b = iVar.mo3375a(classLoader, rVar.f2801f);
        Bundle bundle = rVar.f2810o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f2815b.mo3233u1(rVar.f2810o);
        Fragment fragment = this.f2815b;
        fragment.f2623j = rVar.f2802g;
        fragment.f2631r = rVar.f2803h;
        fragment.f2633t = true;
        fragment.f2593A = rVar.f2804i;
        fragment.f2594B = rVar.f2805j;
        fragment.f2595C = rVar.f2806k;
        fragment.f2598F = rVar.f2807l;
        fragment.f2630q = rVar.f2808m;
        fragment.f2597E = rVar.f2809n;
        fragment.f2596D = rVar.f2811p;
        fragment.f2613U = C0710e.C0712b.values()[rVar.f2812q];
        Bundle bundle2 = rVar.f2813r;
        if (bundle2 != null) {
            this.f2815b.f2620g = bundle2;
        } else {
            this.f2815b.f2620g = new Bundle();
        }
        if (C0653m.m3287p0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f2815b);
        }
    }

    /* renamed from: n */
    private Bundle m3415n() {
        Bundle bundle = new Bundle();
        this.f2815b.mo3208k1(bundle);
        this.f2814a.mo3390j(this.f2815b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2815b.f2604L != null) {
            mo3537p();
        }
        if (this.f2815b.f2621h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2815b.f2621h);
        }
        if (!this.f2815b.f2606N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2815b.f2606N);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3523a() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2815b);
        }
        Fragment fragment = this.f2815b;
        fragment.mo3166Q0(fragment.f2620g);
        C0651l lVar = this.f2814a;
        Fragment fragment2 = this.f2815b;
        lVar.mo3381a(fragment2, fragment2.f2620g, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3524b(C0649j<?> jVar, C0653m mVar, Fragment fragment) {
        Fragment fragment2 = this.f2815b;
        fragment2.f2637x = jVar;
        fragment2.f2639z = fragment;
        fragment2.f2636w = mVar;
        this.f2814a.mo3387g(fragment2, jVar.mo3377h(), false);
        this.f2815b.mo3168R0();
        Fragment fragment3 = this.f2815b;
        Fragment fragment4 = fragment3.f2639z;
        if (fragment4 == null) {
            jVar.mo3318j(fragment3);
        } else {
            fragment4.mo3213n0(fragment3);
        }
        this.f2814a.mo3382b(this.f2815b, jVar.mo3377h(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3525c() {
        int i = this.f2816c;
        Fragment fragment = this.f2815b;
        if (fragment.f2631r) {
            i = fragment.f2632s ? Math.max(i, 1) : i < 2 ? Math.min(i, fragment.f2619f) : Math.min(i, 1);
        }
        if (!this.f2815b.f2629p) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f2815b;
        if (fragment2.f2630q) {
            i = fragment2.mo3187c0() ? Math.min(i, 1) : Math.min(i, -1);
        }
        Fragment fragment3 = this.f2815b;
        if (fragment3.f2605M && fragment3.f2619f < 3) {
            i = Math.min(i, 2);
        }
        int i2 = C0673a.f2817a[this.f2815b.f2613U.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(i, -1) : Math.min(i, 1) : Math.min(i, 3) : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3526d() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2815b);
        }
        Fragment fragment = this.f2815b;
        if (!fragment.f2612T) {
            this.f2814a.mo3388h(fragment, fragment.f2620g, false);
            Fragment fragment2 = this.f2815b;
            fragment2.mo3174U0(fragment2.f2620g);
            C0651l lVar = this.f2814a;
            Fragment fragment3 = this.f2815b;
            lVar.mo3383c(fragment3, fragment3.f2620g, false);
            return;
        }
        fragment.mo3224q1(fragment.f2620g);
        this.f2815b.f2619f = 1;
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3527e(androidx.fragment.app.C0645f r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.f2815b
            boolean r0 = r0.f2631r
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.C0653m.m3287p0(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f2815b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x0026:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.f2815b
            android.view.ViewGroup r2 = r1.f2603K
            if (r2 == 0) goto L_0x0030
            r0 = r2
            goto L_0x00a5
        L_0x0030:
            int r1 = r1.f2594B
            if (r1 == 0) goto L_0x00a5
            r0 = -1
            if (r1 == r0) goto L_0x0087
            android.view.View r5 = r5.mo3249e(r1)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x00a5
            androidx.fragment.app.Fragment r5 = r4.f2815b
            boolean r1 = r5.f2633t
            if (r1 == 0) goto L_0x0047
            goto L_0x00a5
        L_0x0047:
            android.content.res.Resources r5 = r5.mo3158M()     // Catch:{ NotFoundException -> 0x0054 }
            androidx.fragment.app.Fragment r0 = r4.f2815b     // Catch:{ NotFoundException -> 0x0054 }
            int r0 = r0.f2594B     // Catch:{ NotFoundException -> 0x0054 }
            java.lang.String r5 = r5.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            java.lang.String r5 = "unknown"
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No view found for id 0x"
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r4.f2815b
            int r2 = r2.f2594B
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") for fragment "
            r1.append(r5)
            androidx.fragment.app.Fragment r5 = r4.f2815b
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0087:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f2815b
            r0.append(r1)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00a5:
            androidx.fragment.app.Fragment r5 = r4.f2815b
            r5.f2603K = r0
            android.os.Bundle r1 = r5.f2620g
            android.view.LayoutInflater r1 = r5.mo3184a1(r1)
            androidx.fragment.app.Fragment r2 = r4.f2815b
            android.os.Bundle r2 = r2.f2620g
            r5.mo3177W0(r1, r0, r2)
            androidx.fragment.app.Fragment r5 = r4.f2815b
            android.view.View r5 = r5.f2604L
            if (r5 == 0) goto L_0x010d
            r1 = 0
            r5.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r5 = r4.f2815b
            android.view.View r2 = r5.f2604L
            int r3 = p086f.p131l.C3451b.fragment_container_view_tag
            r2.setTag(r3, r5)
            if (r0 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r5 = r4.f2815b
            android.view.View r5 = r5.f2604L
            r0.addView(r5)
        L_0x00d2:
            androidx.fragment.app.Fragment r5 = r4.f2815b
            boolean r0 = r5.f2596D
            if (r0 == 0) goto L_0x00df
            android.view.View r5 = r5.f2604L
            r0 = 8
            r5.setVisibility(r0)
        L_0x00df:
            androidx.fragment.app.Fragment r5 = r4.f2815b
            android.view.View r5 = r5.f2604L
            p086f.p111h.p122m.C3403t.m14637f0(r5)
            androidx.fragment.app.Fragment r5 = r4.f2815b
            android.view.View r0 = r5.f2604L
            android.os.Bundle r2 = r5.f2620g
            r5.mo341O0(r0, r2)
            androidx.fragment.app.l r5 = r4.f2814a
            androidx.fragment.app.Fragment r0 = r4.f2815b
            android.view.View r2 = r0.f2604L
            android.os.Bundle r3 = r0.f2620g
            r5.mo3393m(r0, r2, r3, r1)
            androidx.fragment.app.Fragment r5 = r4.f2815b
            android.view.View r0 = r5.f2604L
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x010b
            androidx.fragment.app.Fragment r0 = r4.f2815b
            android.view.ViewGroup r0 = r0.f2603K
            if (r0 == 0) goto L_0x010b
            r1 = 1
        L_0x010b:
            r5.f2608P = r1
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0672s.mo3527e(androidx.fragment.app.f):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3528f(C0649j<?> jVar, C0667p pVar) {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2815b);
        }
        Fragment fragment = this.f2815b;
        boolean z = true;
        boolean z2 = fragment.f2630q && !fragment.mo3187c0();
        if (z2 || pVar.mo3506n(this.f2815b)) {
            if (jVar instanceof C0742w) {
                z = pVar.mo3504l();
            } else if (jVar.mo3377h() instanceof Activity) {
                z = true ^ ((Activity) jVar.mo3377h()).isChangingConfigurations();
            }
            if (z2 || z) {
                pVar.mo3498f(this.f2815b);
            }
            this.f2815b.mo3179X0();
            this.f2814a.mo3384d(this.f2815b, false);
            return;
        }
        this.f2815b.f2619f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3529g(C0667p pVar) {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2815b);
        }
        this.f2815b.mo3182Z0();
        boolean z = false;
        this.f2814a.mo3385e(this.f2815b, false);
        Fragment fragment = this.f2815b;
        fragment.f2619f = -1;
        fragment.f2637x = null;
        fragment.f2639z = null;
        fragment.f2636w = null;
        if (fragment.f2630q && !fragment.mo3187c0()) {
            z = true;
        }
        if (z || pVar.mo3506n(this.f2815b)) {
            if (C0653m.m3287p0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2815b);
            }
            this.f2815b.mo3178X();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3530h() {
        Fragment fragment = this.f2815b;
        if (fragment.f2631r && fragment.f2632s && !fragment.f2634u) {
            if (C0653m.m3287p0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2815b);
            }
            Fragment fragment2 = this.f2815b;
            fragment2.mo3177W0(fragment2.mo3184a1(fragment2.f2620g), (ViewGroup) null, this.f2815b.f2620g);
            View view = this.f2815b.f2604L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2815b;
                fragment3.f2604L.setTag(C3451b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2815b;
                if (fragment4.f2596D) {
                    fragment4.f2604L.setVisibility(8);
                }
                Fragment fragment5 = this.f2815b;
                fragment5.mo341O0(fragment5.f2604L, fragment5.f2620g);
                C0651l lVar = this.f2814a;
                Fragment fragment6 = this.f2815b;
                lVar.mo3393m(fragment6, fragment6.f2604L, fragment6.f2620g, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3531i() {
        return this.f2815b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3532j() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2815b);
        }
        this.f2815b.mo3195f1();
        this.f2814a.mo3386f(this.f2815b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3533k(ClassLoader classLoader) {
        Bundle bundle = this.f2815b.f2620g;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f2815b;
            fragment.f2621h = fragment.f2620g.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f2815b;
            fragment2.f2626m = fragment2.f2620g.getString("android:target_state");
            Fragment fragment3 = this.f2815b;
            if (fragment3.f2626m != null) {
                fragment3.f2627n = fragment3.f2620g.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f2815b;
            Boolean bool = fragment4.f2622i;
            if (bool != null) {
                fragment4.f2606N = bool.booleanValue();
                this.f2815b.f2622i = null;
            } else {
                fragment4.f2606N = fragment4.f2620g.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.f2815b;
            if (!fragment5.f2606N) {
                fragment5.f2605M = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3534l() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f2815b);
        }
        Fragment fragment = this.f2815b;
        if (fragment.f2604L != null) {
            fragment.mo3226r1(fragment.f2620g);
        }
        this.f2815b.f2620g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3535m() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2815b);
        }
        this.f2815b.mo3205j1();
        this.f2814a.mo3389i(this.f2815b, false);
        Fragment fragment = this.f2815b;
        fragment.f2620g = null;
        fragment.f2621h = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0670r mo3536o() {
        C0670r rVar = new C0670r(this.f2815b);
        if (this.f2815b.f2619f <= -1 || rVar.f2813r != null) {
            rVar.f2813r = this.f2815b.f2620g;
        } else {
            Bundle n = m3415n();
            rVar.f2813r = n;
            if (this.f2815b.f2626m != null) {
                if (n == null) {
                    rVar.f2813r = new Bundle();
                }
                rVar.f2813r.putString("android:target_state", this.f2815b.f2626m);
                int i = this.f2815b.f2627n;
                if (i != 0) {
                    rVar.f2813r.putInt("android:target_req_state", i);
                }
            }
        }
        return rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3537p() {
        if (this.f2815b.f2604L != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2815b.f2604L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2815b.f2621h = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3538q(int i) {
        this.f2816c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3539r() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2815b);
        }
        this.f2815b.mo3210l1();
        this.f2814a.mo3391k(this.f2815b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3540s() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2815b);
        }
        this.f2815b.mo3212m1();
        this.f2814a.mo3392l(this.f2815b, false);
    }
}
