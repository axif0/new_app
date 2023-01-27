package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0244b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0638e;
import androidx.fragment.app.C0677v;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0741v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p086f.p102e.C3192b;
import p086f.p111h.p118i.C3307a;
import p086f.p111h.p121l.C3343b;
import p086f.p131l.C3451b;

/* renamed from: androidx.fragment.app.m */
public abstract class C0653m {

    /* renamed from: F */
    private static boolean f2738F = false;

    /* renamed from: A */
    private ArrayList<Boolean> f2739A;

    /* renamed from: B */
    private ArrayList<Fragment> f2740B;

    /* renamed from: C */
    private ArrayList<C0663j> f2741C;

    /* renamed from: D */
    private C0667p f2742D;

    /* renamed from: E */
    private Runnable f2743E = new C0657d();

    /* renamed from: a */
    private final ArrayList<C0661h> f2744a = new ArrayList<>();

    /* renamed from: b */
    private boolean f2745b;

    /* renamed from: c */
    private final C0674t f2746c = new C0674t();

    /* renamed from: d */
    ArrayList<C0628a> f2747d;

    /* renamed from: e */
    private ArrayList<Fragment> f2748e;

    /* renamed from: f */
    private final C0650k f2749f = new C0650k(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f2750g;

    /* renamed from: h */
    private final C0244b f2751h = new C0654a(false);

    /* renamed from: i */
    private final AtomicInteger f2752i = new AtomicInteger();

    /* renamed from: j */
    private ArrayList<C0660g> f2753j;

    /* renamed from: k */
    private ConcurrentHashMap<Fragment, HashSet<C3307a>> f2754k = new ConcurrentHashMap<>();

    /* renamed from: l */
    private final C0677v.C0684g f2755l = new C0655b();

    /* renamed from: m */
    private final C0651l f2756m = new C0651l(this);

    /* renamed from: n */
    int f2757n = -1;

    /* renamed from: o */
    C0649j<?> f2758o;

    /* renamed from: p */
    C0645f f2759p;

    /* renamed from: q */
    private Fragment f2760q;

    /* renamed from: r */
    Fragment f2761r;

    /* renamed from: s */
    private C0648i f2762s = null;

    /* renamed from: t */
    private C0648i f2763t = new C0656c();

    /* renamed from: u */
    private boolean f2764u;

    /* renamed from: v */
    private boolean f2765v;

    /* renamed from: w */
    private boolean f2766w;

    /* renamed from: x */
    private boolean f2767x;

    /* renamed from: y */
    private boolean f2768y;

    /* renamed from: z */
    private ArrayList<C0628a> f2769z;

    /* renamed from: androidx.fragment.app.m$a */
    class C0654a extends C0244b {
        C0654a(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo734b() {
            C0653m.this.mo3445m0();
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    class C0655b implements C0677v.C0684g {
        C0655b() {
        }

        /* renamed from: a */
        public void mo3467a(Fragment fragment, C3307a aVar) {
            if (!aVar.mo11470b()) {
                C0653m.this.mo3409I0(fragment, aVar);
            }
        }

        /* renamed from: b */
        public void mo3468b(Fragment fragment, C3307a aVar) {
            C0653m.this.mo3430c(fragment, aVar);
        }
    }

    /* renamed from: androidx.fragment.app.m$c */
    class C0656c extends C0648i {
        C0656c() {
        }

        /* renamed from: a */
        public Fragment mo3375a(ClassLoader classLoader, String str) {
            C0649j<?> jVar = C0653m.this.f2758o;
            return jVar.mo3334b(jVar.mo3377h(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.m$d */
    class C0657d implements Runnable {
        C0657d() {
        }

        public void run() {
            C0653m.this.mo3417Q(true);
        }
    }

    /* renamed from: androidx.fragment.app.m$e */
    class C0658e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2774a;

        /* renamed from: b */
        final /* synthetic */ View f2775b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2776c;

        C0658e(C0653m mVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2774a = viewGroup;
            this.f2775b = view;
            this.f2776c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2774a.endViewTransition(this.f2775b);
            animator.removeListener(this);
            Fragment fragment = this.f2776c;
            View view = fragment.f2604L;
            if (view != null && fragment.f2596D) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m$f */
    public static abstract class C0659f {
        /* renamed from: a */
        public abstract void mo3471a(C0653m mVar, Fragment fragment, Bundle bundle);

        /* renamed from: b */
        public abstract void mo3472b(C0653m mVar, Fragment fragment, Context context);

        /* renamed from: c */
        public abstract void mo3473c(C0653m mVar, Fragment fragment, Bundle bundle);

        /* renamed from: d */
        public abstract void mo3474d(C0653m mVar, Fragment fragment);

        /* renamed from: e */
        public abstract void mo3475e(C0653m mVar, Fragment fragment);

        /* renamed from: f */
        public abstract void mo3476f(C0653m mVar, Fragment fragment);

        /* renamed from: g */
        public abstract void mo3477g(C0653m mVar, Fragment fragment, Context context);

        /* renamed from: h */
        public abstract void mo3478h(C0653m mVar, Fragment fragment, Bundle bundle);

        /* renamed from: i */
        public abstract void mo3479i(C0653m mVar, Fragment fragment);

        /* renamed from: j */
        public abstract void mo3480j(C0653m mVar, Fragment fragment, Bundle bundle);

        /* renamed from: k */
        public abstract void mo3481k(C0653m mVar, Fragment fragment);

        /* renamed from: l */
        public abstract void mo3482l(C0653m mVar, Fragment fragment);

        /* renamed from: m */
        public abstract void mo3483m(C0653m mVar, Fragment fragment, View view, Bundle bundle);

        /* renamed from: n */
        public abstract void mo3484n(C0653m mVar, Fragment fragment);
    }

    /* renamed from: androidx.fragment.app.m$g */
    public interface C0660g {
        /* renamed from: a */
        void mo3485a();
    }

    /* renamed from: androidx.fragment.app.m$h */
    interface C0661h {
        /* renamed from: a */
        boolean mo3261a(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.m$i */
    private class C0662i implements C0661h {

        /* renamed from: a */
        final String f2777a;

        /* renamed from: b */
        final int f2778b;

        /* renamed from: c */
        final int f2779c;

        C0662i(String str, int i, int i2) {
            this.f2777a = str;
            this.f2778b = i;
            this.f2779c = i2;
        }

        /* renamed from: a */
        public boolean mo3261a(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0653m.this.f2761r;
            if (fragment != null && this.f2778b < 0 && this.f2777a == null && fragment.mo3240x().mo3403E0()) {
                return false;
            }
            return C0653m.this.mo3406G0(arrayList, arrayList2, this.f2777a, this.f2778b, this.f2779c);
        }
    }

    /* renamed from: androidx.fragment.app.m$j */
    static class C0663j implements Fragment.C0627e {

        /* renamed from: a */
        final boolean f2781a;

        /* renamed from: b */
        final C0628a f2782b;

        /* renamed from: c */
        private int f2783c;

        C0663j(C0628a aVar, boolean z) {
            this.f2781a = z;
            this.f2782b = aVar;
        }

        /* renamed from: a */
        public void mo3251a() {
            int i = this.f2783c - 1;
            this.f2783c = i;
            if (i == 0) {
                this.f2782b.f2661r.mo3418Q0();
            }
        }

        /* renamed from: b */
        public void mo3252b() {
            this.f2783c++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3486c() {
            C0628a aVar = this.f2782b;
            aVar.f2661r.mo3446n(aVar, this.f2781a, false, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3487d() {
            boolean z = this.f2783c > 0;
            for (Fragment next : this.f2782b.f2661r.mo3435f0()) {
                next.mo3131A1((Fragment.C0627e) null);
                if (z && next.mo3189d0()) {
                    next.mo3153I1();
                }
            }
            C0628a aVar = this.f2782b;
            aVar.f2661r.mo3446n(aVar, this.f2781a, !z, true);
        }

        /* renamed from: e */
        public boolean mo3488e() {
            return this.f2783c == 0;
        }
    }

    /* renamed from: C */
    private void m3260C(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3423V(fragment.f2623j))) {
            fragment.mo3202i1();
        }
    }

    /* renamed from: F0 */
    private boolean m3261F0(String str, int i, int i2) {
        mo3417Q(false);
        m3269P(true);
        Fragment fragment = this.f2761r;
        if (fragment != null && i < 0 && str == null && fragment.mo3240x().mo3403E0()) {
            return true;
        }
        boolean G0 = mo3406G0(this.f2769z, this.f2739A, str, i, i2);
        if (G0) {
            this.f2745b = true;
            try {
                m3264K0(this.f2769z, this.f2739A);
            } finally {
                m3284m();
            }
        }
        m3275X0();
        m3265L();
        this.f2746c.mo3542b();
        return G0;
    }

    /* renamed from: H0 */
    private int m3262H0(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C3192b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0628a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo3257F() && !aVar.mo3256D(arrayList, i4 + 1, i2)) {
                if (this.f2741C == null) {
                    this.f2741C = new ArrayList<>();
                }
                C0663j jVar = new C0663j(aVar, booleanValue);
                this.f2741C.add(jVar);
                aVar.mo3259H(jVar);
                if (booleanValue) {
                    aVar.mo3275y();
                } else {
                    aVar.mo3276z(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m3277a(bVar);
            }
        }
        return i3;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: J */
    private void m3263J(int i) {
        try {
            this.f2745b = true;
            this.f2746c.mo3544d(i);
            mo3464y0(i, false);
            this.f2745b = false;
            mo3417Q(true);
        } catch (Throwable th) {
            this.f2745b = false;
            throw th;
        }
    }

    /* renamed from: K0 */
    private void m3264K0(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m3272U(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f2835p) {
                        if (i2 != i) {
                            m3271T(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2835p) {
                                i2++;
                            }
                        }
                        m3271T(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m3271T(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: L */
    private void m3265L() {
        if (this.f2768y) {
            this.f2768y = false;
            m3274W0();
        }
    }

    /* renamed from: M0 */
    private void m3266M0() {
        if (this.f2753j != null) {
            for (int i = 0; i < this.f2753j.size(); i++) {
                this.f2753j.get(i).mo3485a();
            }
        }
    }

    /* renamed from: N */
    private void m3267N() {
        if (!this.f2754k.isEmpty()) {
            for (Fragment next : this.f2754k.keySet()) {
                m3281j(next);
                mo3396A0(next, next.mo3167R());
            }
        }
    }

    /* renamed from: O0 */
    static int m3268O0(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: P */
    private void m3269P(boolean z) {
        if (this.f2745b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2758o == null) {
            if (this.f2767x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f2758o.mo3378i().getLooper()) {
            if (!z) {
                m3283l();
            }
            if (this.f2769z == null) {
                this.f2769z = new ArrayList<>();
                this.f2739A = new ArrayList<>();
            }
            this.f2745b = true;
            try {
                m3272U((ArrayList<C0628a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2745b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: S */
    private static void m3270S(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0628a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3271u(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo3276z(z);
            } else {
                aVar.mo3271u(1);
                aVar.mo3275y();
            }
            i++;
        }
    }

    /* renamed from: T */
    private void m3271T(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0628a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).f2835p;
        ArrayList<Fragment> arrayList5 = this.f2740B;
        if (arrayList5 == null) {
            this.f2740B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f2740B.addAll(this.f2746c.mo3553m());
        Fragment j0 = mo3442j0();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0628a aVar = arrayList3.get(i6);
            j0 = !arrayList4.get(i6).booleanValue() ? aVar.mo3253A(this.f2740B, j0) : aVar.mo3260I(this.f2740B, j0);
            z2 = z2 || aVar.f2826g;
        }
        this.f2740B.clear();
        if (!z) {
            C0677v.m3475C(this, arrayList, arrayList2, i, i2, false, this.f2755l);
        }
        m3270S(arrayList, arrayList2, i, i2);
        if (z) {
            C3192b bVar = new C3192b();
            m3277a(bVar);
            int H0 = m3262H0(arrayList, arrayList2, i, i2, bVar);
            m3290w0(bVar);
            i3 = H0;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0677v.m3475C(this, arrayList, arrayList2, i, i3, true, this.f2755l);
            mo3464y0(this.f2757n, true);
        }
        while (i4 < i5) {
            C0628a aVar2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && aVar2.f2663t >= 0) {
                aVar2.f2663t = -1;
            }
            aVar2.mo3258G();
            i4++;
        }
        if (z2) {
            m3266M0();
        }
    }

    /* renamed from: U */
    private void m3272U(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0663j> arrayList3 = this.f2741C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0663j jVar = this.f2741C.get(i);
            if (arrayList == null || jVar.f2781a || (indexOf2 = arrayList.indexOf(jVar.f2782b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (jVar.mo3488e() || (arrayList != null && jVar.f2782b.mo3256D(arrayList, 0, arrayList.size()))) {
                    this.f2741C.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || jVar.f2781a || (indexOf = arrayList.indexOf(jVar.f2782b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.mo3487d();
                    }
                }
                i++;
            } else {
                this.f2741C.remove(i);
                i--;
                size--;
            }
            jVar.mo3486c();
            i++;
        }
    }

    /* renamed from: U0 */
    private void m3273U0(Fragment fragment) {
        ViewGroup d0 = m3280d0(fragment);
        if (d0 != null) {
            if (d0.getTag(C3451b.visible_removing_fragment_view_tag) == null) {
                d0.setTag(C3451b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) d0.getTag(C3451b.visible_removing_fragment_view_tag)).mo3244y1(fragment.mo3148H());
        }
    }

    /* renamed from: W0 */
    private void m3274W0() {
        for (Fragment next : this.f2746c.mo3551k()) {
            if (next != null) {
                mo3399C0(next);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo3429b0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo3451r0(r3.f2760q) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo738f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f2751h;
     */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3275X0() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.m$h> r0 = r3.f2744a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.m$h> r1 = r3.f2744a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f2751h     // Catch:{ all -> 0x002a }
            r1.mo738f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f2751h
            int r1 = r3.mo3429b0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f2760q
            boolean r1 = r3.mo3451r0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo738f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0653m.m3275X0():void");
    }

    /* renamed from: Z */
    private void m3276Z() {
        if (this.f2741C != null) {
            while (!this.f2741C.isEmpty()) {
                this.f2741C.remove(0).mo3487d();
            }
        }
    }

    /* renamed from: a */
    private void m3277a(C3192b<Fragment> bVar) {
        int i = this.f2757n;
        if (i >= 1) {
            int min = Math.min(i, 3);
            for (Fragment next : this.f2746c.mo3553m()) {
                if (next.f2619f < min) {
                    mo3396A0(next, min);
                    if (next.f2604L != null && !next.f2596D && next.f2608P) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: a0 */
    private boolean m3278a0(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2744a) {
            if (this.f2744a.isEmpty()) {
                return false;
            }
            int size = this.f2744a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f2744a.get(i).mo3261a(arrayList, arrayList2);
            }
            this.f2744a.clear();
            this.f2758o.mo3378i().removeCallbacks(this.f2743E);
            return z;
        }
    }

    /* renamed from: c0 */
    private C0667p m3279c0(Fragment fragment) {
        return this.f2742D.mo3500h(fragment);
    }

    /* renamed from: d0 */
    private ViewGroup m3280d0(Fragment fragment) {
        if (fragment.f2594B > 0 && this.f2759p.mo3250f()) {
            View e = this.f2759p.mo3249e(fragment.f2594B);
            if (e instanceof ViewGroup) {
                return (ViewGroup) e;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m3281j(Fragment fragment) {
        HashSet hashSet = this.f2754k.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C3307a) it.next()).mo11469a();
            }
            hashSet.clear();
            m3286p(fragment);
            this.f2754k.remove(fragment);
        }
    }

    /* renamed from: k0 */
    static Fragment m3282k0(View view) {
        Object tag = view.getTag(C3451b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: l */
    private void m3283l() {
        if (mo3455t0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: m */
    private void m3284m() {
        this.f2745b = false;
        this.f2739A.clear();
        this.f2769z.clear();
    }

    /* renamed from: o */
    private void m3285o(Fragment fragment) {
        Animator animator;
        if (fragment.f2604L != null) {
            C0638e.C0643d b = C0638e.m3199b(this.f2758o.mo3377h(), this.f2759p, fragment, !fragment.f2596D);
            if (b == null || (animator = b.f2718b) == null) {
                if (b != null) {
                    fragment.f2604L.startAnimation(b.f2717a);
                    b.f2717a.start();
                }
                fragment.f2604L.setVisibility((!fragment.f2596D || fragment.mo3185b0()) ? 0 : 8);
                if (fragment.mo3185b0()) {
                    fragment.mo3239w1(false);
                }
            } else {
                animator.setTarget(fragment.f2604L);
                if (!fragment.f2596D) {
                    fragment.f2604L.setVisibility(0);
                } else if (fragment.mo3185b0()) {
                    fragment.mo3239w1(false);
                } else {
                    ViewGroup viewGroup = fragment.f2603K;
                    View view = fragment.f2604L;
                    viewGroup.startViewTransition(view);
                    b.f2718b.addListener(new C0658e(this, viewGroup, view, fragment));
                }
                b.f2718b.start();
            }
        }
        if (fragment.f2629p && m3288q0(fragment)) {
            this.f2764u = true;
        }
        fragment.f2609Q = false;
        fragment.mo3246z0(fragment.f2596D);
    }

    /* renamed from: p */
    private void m3286p(Fragment fragment) {
        fragment.mo3180Y0();
        this.f2756m.mo3394n(fragment, false);
        fragment.f2603K = null;
        fragment.f2604L = null;
        fragment.f2615W = null;
        fragment.f2616X.mo3633h(null);
        fragment.f2632s = false;
    }

    /* renamed from: p0 */
    static boolean m3287p0(int i) {
        return f2738F || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: q0 */
    private boolean m3288q0(Fragment fragment) {
        return (fragment.f2600H && fragment.f2601I) || fragment.f2638y.mo3443k();
    }

    /* renamed from: v0 */
    private void m3289v0(C0672s sVar) {
        Fragment i = sVar.mo3531i();
        if (this.f2746c.mo3543c(i.f2623j)) {
            if (m3287p0(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + i);
            }
            this.f2746c.mo3555o(sVar);
            mo3412L0(i);
        }
    }

    /* renamed from: w0 */
    private void m3290w0(C3192b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment o = bVar.mo11038o(i);
            if (!o.f2629p) {
                View p1 = o.mo3222p1();
                o.f2610R = p1.getAlpha();
                p1.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo3395A(MenuItem menuItem) {
        if (this.f2757n < 1) {
            return false;
        }
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null && next.mo3190d1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r2 != 3) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3396A0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            r12 = this;
            androidx.fragment.app.t r0 = r12.f2746c
            java.lang.String r1 = r13.f2623j
            androidx.fragment.app.s r0 = r0.mo3552l(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.s r0 = new androidx.fragment.app.s
            androidx.fragment.app.l r2 = r12.f2756m
            r0.<init>(r2, r13)
            r0.mo3538q(r1)
        L_0x0015:
            int r2 = r0.mo3525c()
            int r14 = java.lang.Math.min(r14, r2)
            int r2 = r13.f2619f
            r3 = 0
            java.lang.String r4 = "FragmentManager"
            r5 = -1
            r6 = 2
            r7 = 3
            if (r2 > r14) goto L_0x0102
            if (r2 >= r14) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<f.h.i.a>> r2 = r12.f2754k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0034
            r12.m3281j(r13)
        L_0x0034:
            int r2 = r13.f2619f
            if (r2 == r5) goto L_0x0042
            if (r2 == 0) goto L_0x00df
            if (r2 == r1) goto L_0x00e4
            if (r2 == r6) goto L_0x00f6
            if (r2 == r7) goto L_0x00fb
            goto L_0x01f5
        L_0x0042:
            if (r14 <= r5) goto L_0x00df
            boolean r2 = m3287p0(r7)
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r2.append(r8)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x005e:
            androidx.fragment.app.Fragment r2 = r13.f2625l
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            if (r2 == 0) goto L_0x00a6
            java.lang.String r11 = r2.f2623j
            androidx.fragment.app.Fragment r11 = r12.mo3423V(r11)
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0086
            androidx.fragment.app.Fragment r2 = r13.f2625l
            int r11 = r2.f2619f
            if (r11 >= r1) goto L_0x007d
            r12.mo3396A0(r2, r1)
        L_0x007d:
            androidx.fragment.app.Fragment r2 = r13.f2625l
            java.lang.String r2 = r2.f2623j
            r13.f2626m = r2
            r13.f2625l = r3
            goto L_0x00a6
        L_0x0086:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            androidx.fragment.app.Fragment r13 = r13.f2625l
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00a6:
            java.lang.String r2 = r13.f2626m
            if (r2 == 0) goto L_0x00d8
            androidx.fragment.app.Fragment r2 = r12.mo3423V(r2)
            if (r2 == 0) goto L_0x00b8
            int r3 = r2.f2619f
            if (r3 >= r1) goto L_0x00d8
            r12.mo3396A0(r2, r1)
            goto L_0x00d8
        L_0x00b8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r13 = r13.f2626m
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00d8:
            androidx.fragment.app.j<?> r2 = r12.f2758o
            androidx.fragment.app.Fragment r3 = r12.f2760q
            r0.mo3524b(r2, r12, r3)
        L_0x00df:
            if (r14 <= 0) goto L_0x00e4
            r0.mo3526d()
        L_0x00e4:
            if (r14 <= r5) goto L_0x00e9
            r0.mo3530h()
        L_0x00e9:
            if (r14 <= r1) goto L_0x00f6
            androidx.fragment.app.f r1 = r12.f2759p
            r0.mo3527e(r1)
            r0.mo3523a()
            r0.mo3534l()
        L_0x00f6:
            if (r14 <= r6) goto L_0x00fb
            r0.mo3539r()
        L_0x00fb:
            if (r14 <= r7) goto L_0x01f5
            r0.mo3535m()
            goto L_0x01f5
        L_0x0102:
            if (r2 <= r14) goto L_0x01f5
            if (r2 == 0) goto L_0x01ec
            r8 = 0
            if (r2 == r1) goto L_0x01ab
            if (r2 == r6) goto L_0x011c
            if (r2 == r7) goto L_0x0117
            r9 = 4
            if (r2 == r9) goto L_0x0112
            goto L_0x01f5
        L_0x0112:
            if (r14 >= r9) goto L_0x0117
            r0.mo3532j()
        L_0x0117:
            if (r14 >= r7) goto L_0x011c
            r0.mo3540s()
        L_0x011c:
            if (r14 >= r6) goto L_0x01ab
            boolean r2 = m3287p0(r7)
            if (r2 == 0) goto L_0x0138
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x0138:
            android.view.View r2 = r13.f2604L
            if (r2 == 0) goto L_0x014b
            androidx.fragment.app.j<?> r2 = r12.f2758o
            boolean r2 = r2.mo3321m(r13)
            if (r2 == 0) goto L_0x014b
            android.util.SparseArray<android.os.Parcelable> r2 = r13.f2621h
            if (r2 != 0) goto L_0x014b
            r0.mo3537p()
        L_0x014b:
            android.view.View r2 = r13.f2604L
            if (r2 == 0) goto L_0x019c
            android.view.ViewGroup r6 = r13.f2603K
            if (r6 == 0) goto L_0x019c
            r6.endViewTransition(r2)
            android.view.View r2 = r13.f2604L
            r2.clearAnimation()
            boolean r2 = r13.mo3194f0()
            if (r2 != 0) goto L_0x019c
            int r2 = r12.f2757n
            r6 = 0
            if (r2 <= r5) goto L_0x0184
            boolean r2 = r12.f2767x
            if (r2 != 0) goto L_0x0184
            android.view.View r2 = r13.f2604L
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0184
            float r2 = r13.f2610R
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0184
            androidx.fragment.app.j<?> r2 = r12.f2758o
            android.content.Context r2 = r2.mo3377h()
            androidx.fragment.app.f r3 = r12.f2759p
            androidx.fragment.app.e$d r3 = androidx.fragment.app.C0638e.m3199b(r2, r3, r13, r8)
        L_0x0184:
            r13.f2610R = r6
            android.view.ViewGroup r2 = r13.f2603K
            android.view.View r5 = r13.f2604L
            if (r3 == 0) goto L_0x0194
            r13.mo3134B1(r14)
            androidx.fragment.app.v$g r6 = r12.f2755l
            androidx.fragment.app.C0638e.m3198a(r13, r3, r6)
        L_0x0194:
            r2.removeView(r5)
            android.view.ViewGroup r3 = r13.f2603K
            if (r2 == r3) goto L_0x019c
            return
        L_0x019c:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<f.h.i.a>> r2 = r12.f2754k
            java.lang.Object r2 = r2.get(r13)
            if (r2 != 0) goto L_0x01a8
            r12.m3286p(r13)
            goto L_0x01ab
        L_0x01a8:
            r13.mo3134B1(r14)
        L_0x01ab:
            if (r14 >= r1) goto L_0x01ec
            boolean r2 = r13.f2630q
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r13.mo3187c0()
            if (r2 != 0) goto L_0x01b8
            r8 = 1
        L_0x01b8:
            if (r8 != 0) goto L_0x01d6
            androidx.fragment.app.p r2 = r12.f2742D
            boolean r2 = r2.mo3506n(r13)
            if (r2 == 0) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            java.lang.String r2 = r13.f2626m
            if (r2 == 0) goto L_0x01d9
            androidx.fragment.app.Fragment r2 = r12.mo3423V(r2)
            if (r2 == 0) goto L_0x01d9
            boolean r3 = r2.mo3160N()
            if (r3 == 0) goto L_0x01d9
            r13.f2625l = r2
            goto L_0x01d9
        L_0x01d6:
            r12.m3289v0(r0)
        L_0x01d9:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<f.h.i.a>> r2 = r12.f2754k
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x01e5
            r13.mo3134B1(r14)
            goto L_0x01ed
        L_0x01e5:
            androidx.fragment.app.j<?> r1 = r12.f2758o
            androidx.fragment.app.p r2 = r12.f2742D
            r0.mo3528f(r1, r2)
        L_0x01ec:
            r1 = r14
        L_0x01ed:
            if (r1 >= 0) goto L_0x01f4
            androidx.fragment.app.p r14 = r12.f2742D
            r0.mo3529g(r14)
        L_0x01f4:
            r14 = r1
        L_0x01f5:
            int r0 = r13.f2619f
            if (r0 == r14) goto L_0x0227
            boolean r0 = m3287p0(r7)
            if (r0 == 0) goto L_0x0225
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r13.f2619f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x0225:
            r13.f2619f = r14
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0653m.mo3396A0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo3397B(Menu menu) {
        if (this.f2757n >= 1) {
            for (Fragment next : this.f2746c.mo3553m()) {
                if (next != null) {
                    next.mo3192e1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo3398B0() {
        if (this.f2758o != null) {
            this.f2765v = false;
            this.f2766w = false;
            for (Fragment next : this.f2746c.mo3553m()) {
                if (next != null) {
                    next.mo3201i0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo3399C0(Fragment fragment) {
        if (!fragment.f2605M) {
            return;
        }
        if (this.f2745b) {
            this.f2768y = true;
            return;
        }
        fragment.f2605M = false;
        mo3396A0(fragment, this.f2757n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo3400D() {
        m3263J(3);
    }

    /* renamed from: D0 */
    public void mo3401D0(int i, int i2) {
        if (i >= 0) {
            mo3415O(new C0662i((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo3402E(boolean z) {
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null) {
                next.mo3197g1(z);
            }
        }
    }

    /* renamed from: E0 */
    public boolean mo3403E0() {
        return m3261F0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo3404F(Menu menu) {
        boolean z = false;
        if (this.f2757n < 1) {
            return false;
        }
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null && next.mo3199h1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3405G() {
        m3275X0();
        m3260C(this.f2761r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public boolean mo3406G0(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0628a> arrayList3 = this.f2747d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2747d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f2747d.size() - 1;
                while (size2 >= 0) {
                    C0628a aVar = this.f2747d.get(size2);
                    if ((str != null && str.equals(aVar.mo3254B())) || (i >= 0 && i == aVar.f2663t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0628a aVar2 = this.f2747d.get(size2);
                        if ((str == null || !str.equals(aVar2.mo3254B())) && (i < 0 || i != aVar2.f2663t)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f2747d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2747d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2747d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3407H() {
        this.f2765v = false;
        this.f2766w = false;
        m3263J(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3408I() {
        this.f2765v = false;
        this.f2766w = false;
        m3263J(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo3409I0(Fragment fragment, C3307a aVar) {
        HashSet hashSet = this.f2754k.get(fragment);
        if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
            this.f2754k.remove(fragment);
            if (fragment.f2619f < 3) {
                m3286p(fragment);
                mo3396A0(fragment, fragment.mo3167R());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo3410J0(Fragment fragment) {
        if (m3287p0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2635v);
        }
        boolean z = !fragment.mo3187c0();
        if (!fragment.f2597E || z) {
            this.f2746c.mo3556p(fragment);
            if (m3288q0(fragment)) {
                this.f2764u = true;
            }
            fragment.f2630q = true;
            m3273U0(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo3411K() {
        this.f2766w = true;
        m3263J(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo3412L0(Fragment fragment) {
        if (mo3455t0()) {
            if (m3287p0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f2742D.mo3505m(fragment) && m3287p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: M */
    public void mo3413M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2746c.mo3545e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2748e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f2748e.get(i).toString());
            }
        }
        ArrayList<C0628a> arrayList2 = this.f2747d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0628a aVar = this.f2747d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3273w(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2752i.get());
        synchronized (this.f2744a) {
            int size3 = this.f2744a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f2744a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2758o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2759p);
        if (this.f2760q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2760q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2757n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2765v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2766w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2767x);
        if (this.f2764u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2764u);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo3414N0(Parcelable parcelable) {
        C0672s sVar;
        if (parcelable != null) {
            C0665o oVar = (C0665o) parcelable;
            if (oVar.f2784f != null) {
                this.f2746c.mo3557q();
                Iterator<C0670r> it = oVar.f2784f.iterator();
                while (it.hasNext()) {
                    C0670r next = it.next();
                    if (next != null) {
                        Fragment g = this.f2742D.mo3499g(next.f2802g);
                        if (g != null) {
                            if (m3287p0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g);
                            }
                            sVar = new C0672s(this.f2756m, g, next);
                        } else {
                            sVar = new C0672s(this.f2756m, this.f2758o.mo3377h().getClassLoader(), mo3433e0(), next);
                        }
                        Fragment i = sVar.mo3531i();
                        i.f2636w = this;
                        if (m3287p0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + i.f2623j + "): " + i);
                        }
                        sVar.mo3533k(this.f2758o.mo3377h().getClassLoader());
                        this.f2746c.mo3554n(sVar);
                        sVar.mo3538q(this.f2757n);
                    }
                }
                for (Fragment next2 : this.f2742D.mo3502j()) {
                    if (!this.f2746c.mo3543c(next2.f2623j)) {
                        if (m3287p0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + oVar.f2784f);
                        }
                        mo3396A0(next2, 1);
                        next2.f2630q = true;
                        mo3396A0(next2, -1);
                    }
                }
                this.f2746c.mo3558r(oVar.f2785g);
                if (oVar.f2786h != null) {
                    this.f2747d = new ArrayList<>(oVar.f2786h.length);
                    int i2 = 0;
                    while (true) {
                        C0630b[] bVarArr = oVar.f2786h;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        C0628a a = bVarArr[i2].mo3277a(this);
                        if (m3287p0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a.f2663t + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new C3343b("FragmentManager"));
                            a.mo3274x("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2747d.add(a);
                        i2++;
                    }
                } else {
                    this.f2747d = null;
                }
                this.f2752i.set(oVar.f2787i);
                String str = oVar.f2788j;
                if (str != null) {
                    Fragment V = mo3423V(str);
                    this.f2761r = V;
                    m3260C(V);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3415O(C0661h hVar, boolean z) {
        if (!z) {
            if (this.f2758o != null) {
                m3283l();
            } else if (this.f2767x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f2744a) {
            if (this.f2758o != null) {
                this.f2744a.add(hVar);
                mo3418Q0();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public Parcelable mo3416P0() {
        int size;
        m3276Z();
        m3267N();
        mo3417Q(true);
        this.f2765v = true;
        ArrayList<C0670r> s = this.f2746c.mo3559s();
        C0630b[] bVarArr = null;
        if (s.isEmpty()) {
            if (m3287p0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> t = this.f2746c.mo3560t();
        ArrayList<C0628a> arrayList = this.f2747d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C0630b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = new C0630b(this.f2747d.get(i));
                if (m3287p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f2747d.get(i));
                }
            }
        }
        C0665o oVar = new C0665o();
        oVar.f2784f = s;
        oVar.f2785g = t;
        oVar.f2786h = bVarArr;
        oVar.f2787i = this.f2752i.get();
        Fragment fragment = this.f2761r;
        if (fragment != null) {
            oVar.f2788j = fragment.f2623j;
        }
        return oVar;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo3417Q(boolean z) {
        m3269P(z);
        boolean z2 = false;
        while (m3278a0(this.f2769z, this.f2739A)) {
            this.f2745b = true;
            try {
                m3264K0(this.f2769z, this.f2739A);
                m3284m();
                z2 = true;
            } catch (Throwable th) {
                m3284m();
                throw th;
            }
        }
        m3275X0();
        m3265L();
        this.f2746c.mo3542b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3418Q0() {
        synchronized (this.f2744a) {
            boolean z = false;
            boolean z2 = this.f2741C != null && !this.f2741C.isEmpty();
            if (this.f2744a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2758o.mo3378i().removeCallbacks(this.f2743E);
                this.f2758o.mo3378i().post(this.f2743E);
                m3275X0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3419R(C0661h hVar, boolean z) {
        if (!z || (this.f2758o != null && !this.f2767x)) {
            m3269P(z);
            if (hVar.mo3261a(this.f2769z, this.f2739A)) {
                this.f2745b = true;
                try {
                    m3264K0(this.f2769z, this.f2739A);
                } finally {
                    m3284m();
                }
            }
            m3275X0();
            m3265L();
            this.f2746c.mo3542b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3420R0(Fragment fragment, boolean z) {
        ViewGroup d0 = m3280d0(fragment);
        if (d0 != null && (d0 instanceof C0646g)) {
            ((C0646g) d0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo3421S0(Fragment fragment, C0710e.C0712b bVar) {
        if (!fragment.equals(mo3423V(fragment.f2623j)) || !(fragment.f2637x == null || fragment.f2636w == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f2613U = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo3422T0(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3423V(fragment.f2623j)) && (fragment.f2637x == null || fragment.f2636w == this))) {
            Fragment fragment2 = this.f2761r;
            this.f2761r = fragment;
            m3260C(fragment2);
            m3260C(this.f2761r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public Fragment mo3423V(String str) {
        return this.f2746c.mo3546f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo3424V0(Fragment fragment) {
        if (m3287p0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2596D) {
            fragment.f2596D = false;
            fragment.f2609Q = !fragment.f2609Q;
        }
    }

    /* renamed from: W */
    public Fragment mo3425W(int i) {
        return this.f2746c.mo3547g(i);
    }

    /* renamed from: X */
    public Fragment mo3426X(String str) {
        return this.f2746c.mo3548h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public Fragment mo3427Y(String str) {
        return this.f2746c.mo3549i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3428b(C0628a aVar) {
        if (this.f2747d == null) {
            this.f2747d = new ArrayList<>();
        }
        this.f2747d.add(aVar);
    }

    /* renamed from: b0 */
    public int mo3429b0() {
        ArrayList<C0628a> arrayList = this.f2747d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3430c(Fragment fragment, C3307a aVar) {
        if (this.f2754k.get(fragment) == null) {
            this.f2754k.put(fragment, new HashSet());
        }
        this.f2754k.get(fragment).add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3431d(Fragment fragment) {
        if (m3287p0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        mo3458u0(fragment);
        if (!fragment.f2597E) {
            this.f2746c.mo3541a(fragment);
            fragment.f2630q = false;
            if (fragment.f2604L == null) {
                fragment.f2609Q = false;
            }
            if (m3288q0(fragment)) {
                this.f2764u = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3432e(Fragment fragment) {
        if (mo3455t0()) {
            if (m3287p0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f2742D.mo3496e(fragment) && m3287p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* renamed from: e0 */
    public C0648i mo3433e0() {
        C0648i iVar = this.f2762s;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.f2760q;
        return fragment != null ? fragment.f2636w.mo3433e0() : this.f2763t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo3434f() {
        return this.f2752i.getAndIncrement();
    }

    /* renamed from: f0 */
    public List<Fragment> mo3435f0() {
        return this.f2746c.mo3553m();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3436g(androidx.fragment.app.C0649j<?> r3, androidx.fragment.app.C0645f r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.j<?> r0 = r2.f2758o
            if (r0 != 0) goto L_0x0048
            r2.f2758o = r3
            r2.f2759p = r4
            r2.f2760q = r5
            if (r5 == 0) goto L_0x000f
            r2.m3275X0()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.C0245c
            if (r4 == 0) goto L_0x0026
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0245c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo721c()
            r2.f2750g = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f2750g
            androidx.activity.b r1 = r2.f2751h
            r0.mo729a(r4, r1)
        L_0x0026:
            if (r5 == 0) goto L_0x0031
            androidx.fragment.app.m r3 = r5.f2636w
            androidx.fragment.app.p r3 = r3.m3279c0(r5)
        L_0x002e:
            r2.f2742D = r3
            goto L_0x0047
        L_0x0031:
            boolean r4 = r3 instanceof androidx.lifecycle.C0742w
            if (r4 == 0) goto L_0x0040
            androidx.lifecycle.w r3 = (androidx.lifecycle.C0742w) r3
            androidx.lifecycle.v r3 = r3.mo725q()
            androidx.fragment.app.p r3 = androidx.fragment.app.C0667p.m3390i(r3)
            goto L_0x002e
        L_0x0040:
            androidx.fragment.app.p r3 = new androidx.fragment.app.p
            r4 = 0
            r3.<init>(r4)
            goto L_0x002e
        L_0x0047:
            return
        L_0x0048:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            goto L_0x0051
        L_0x0050:
            throw r3
        L_0x0051:
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0653m.mo3436g(androidx.fragment.app.j, androidx.fragment.app.f, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public LayoutInflater.Factory2 mo3437g0() {
        return this.f2749f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3438h(Fragment fragment) {
        if (m3287p0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2597E) {
            fragment.f2597E = false;
            if (!fragment.f2629p) {
                this.f2746c.mo3541a(fragment);
                if (m3287p0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m3288q0(fragment)) {
                    this.f2764u = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public C0651l mo3439h0() {
        return this.f2756m;
    }

    /* renamed from: i */
    public C0675u mo3440i() {
        return new C0628a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public Fragment mo3441i0() {
        return this.f2760q;
    }

    /* renamed from: j0 */
    public Fragment mo3442j0() {
        return this.f2761r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo3443k() {
        boolean z = false;
        for (Fragment next : this.f2746c.mo3551k()) {
            if (next != null) {
                z = m3288q0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public C0741v mo3444l0(Fragment fragment) {
        return this.f2742D.mo3503k(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo3445m0() {
        mo3417Q(true);
        if (this.f2751h.mo735c()) {
            mo3403E0();
        } else {
            this.f2750g.mo731c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3446n(C0628a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo3276z(z3);
        } else {
            aVar.mo3275y();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0677v.m3475C(this, arrayList, arrayList2, 0, 1, true, this.f2755l);
        }
        if (z3) {
            mo3464y0(this.f2757n, true);
        }
        for (Fragment next : this.f2746c.mo3551k()) {
            if (next != null && next.f2604L != null && next.f2608P && aVar.mo3255C(next.f2594B)) {
                float f = next.f2610R;
                if (f > 0.0f) {
                    next.f2604L.setAlpha(f);
                }
                if (z3) {
                    next.f2610R = 0.0f;
                } else {
                    next.f2610R = -1.0f;
                    next.f2608P = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo3447n0(Fragment fragment) {
        if (m3287p0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2596D) {
            fragment.f2596D = true;
            fragment.f2609Q = true ^ fragment.f2609Q;
            m3273U0(fragment);
        }
    }

    /* renamed from: o0 */
    public boolean mo3448o0() {
        return this.f2767x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3449q(Fragment fragment) {
        if (m3287p0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2597E) {
            fragment.f2597E = true;
            if (fragment.f2629p) {
                if (m3287p0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f2746c.mo3556p(fragment);
                if (m3288q0(fragment)) {
                    this.f2764u = true;
                }
                m3273U0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3450r() {
        this.f2765v = false;
        this.f2766w = false;
        m3263J(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo3451r0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C0653m mVar = fragment.f2636w;
        return fragment.equals(mVar.mo3442j0()) && mo3451r0(mVar.f2760q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3452s(Configuration configuration) {
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null) {
                next.mo3170S0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean mo3453s0(int i) {
        return this.f2757n >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo3454t(MenuItem menuItem) {
        if (this.f2757n < 1) {
            return false;
        }
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null && next.mo3172T0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t0 */
    public boolean mo3455t0() {
        return this.f2765v || this.f2766w;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2760q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2760q;
        } else {
            C0649j<?> jVar = this.f2758o;
            if (jVar != null) {
                sb.append(jVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f2758o;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3457u() {
        this.f2765v = false;
        this.f2766w = false;
        m3263J(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo3458u0(Fragment fragment) {
        if (!this.f2746c.mo3543c(fragment.f2623j)) {
            C0672s sVar = new C0672s(this.f2756m, fragment);
            sVar.mo3533k(this.f2758o.mo3377h().getClassLoader());
            this.f2746c.mo3554n(sVar);
            if (fragment.f2599G) {
                if (fragment.f2598F) {
                    mo3432e(fragment);
                } else {
                    mo3412L0(fragment);
                }
                fragment.f2599G = false;
            }
            sVar.mo3538q(this.f2757n);
            if (m3287p0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo3459v(Menu menu, MenuInflater menuInflater) {
        if (this.f2757n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null && next.mo3176V0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f2748e != null) {
            for (int i = 0; i < this.f2748e.size(); i++) {
                Fragment fragment = this.f2748e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3235v0();
                }
            }
        }
        this.f2748e = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3460w() {
        this.f2767x = true;
        mo3417Q(true);
        m3267N();
        m3263J(-1);
        this.f2758o = null;
        this.f2759p = null;
        this.f2760q = null;
        if (this.f2750g != null) {
            this.f2751h.mo736d();
            this.f2750g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3461x() {
        m3263J(1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        r0 = r0.f2604L;
        r1 = r4.f2603K;
        r0 = r1.indexOfChild(r0);
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3462x0(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            androidx.fragment.app.t r0 = r3.f2746c
            java.lang.String r1 = r4.f2623j
            boolean r0 = r0.mo3543c(r1)
            if (r0 != 0) goto L_0x003a
            r0 = 3
            boolean r0 = m3287p0(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to state "
            r0.append(r4)
            int r4 = r3.f2757n
            r0.append(r4)
            java.lang.String r4 = "since it is not added to "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r4)
        L_0x0039:
            return
        L_0x003a:
            r3.mo3466z0(r4)
            android.view.View r0 = r4.f2604L
            if (r0 == 0) goto L_0x009f
            androidx.fragment.app.t r0 = r3.f2746c
            androidx.fragment.app.Fragment r0 = r0.mo3550j(r4)
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r0.f2604L
            android.view.ViewGroup r1 = r4.f2603K
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.f2604L
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0061
            r1.removeViewAt(r2)
            android.view.View r2 = r4.f2604L
            r1.addView(r2, r0)
        L_0x0061:
            boolean r0 = r4.f2608P
            if (r0 == 0) goto L_0x009f
            android.view.ViewGroup r0 = r4.f2603K
            if (r0 == 0) goto L_0x009f
            float r0 = r4.f2610R
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            android.view.View r2 = r4.f2604L
            r2.setAlpha(r0)
        L_0x0075:
            r4.f2610R = r1
            r0 = 0
            r4.f2608P = r0
            androidx.fragment.app.j<?> r0 = r3.f2758o
            android.content.Context r0 = r0.mo3377h()
            androidx.fragment.app.f r1 = r3.f2759p
            r2 = 1
            androidx.fragment.app.e$d r0 = androidx.fragment.app.C0638e.m3199b(r0, r1, r4, r2)
            if (r0 == 0) goto L_0x009f
            android.view.animation.Animation r1 = r0.f2717a
            if (r1 == 0) goto L_0x0093
            android.view.View r0 = r4.f2604L
            r0.startAnimation(r1)
            goto L_0x009f
        L_0x0093:
            android.animation.Animator r1 = r0.f2718b
            android.view.View r2 = r4.f2604L
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f2718b
            r0.start()
        L_0x009f:
            boolean r0 = r4.f2609Q
            if (r0 == 0) goto L_0x00a6
            r3.m3285o(r4)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0653m.mo3462x0(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3463y() {
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null) {
                next.mo3186b1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo3464y0(int i, boolean z) {
        C0649j<?> jVar;
        if (this.f2758o == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2757n) {
            this.f2757n = i;
            for (Fragment x0 : this.f2746c.mo3553m()) {
                mo3462x0(x0);
            }
            for (Fragment next : this.f2746c.mo3551k()) {
                if (next != null && !next.f2608P) {
                    mo3462x0(next);
                }
            }
            m3274W0();
            if (this.f2764u && (jVar = this.f2758o) != null && this.f2757n == 4) {
                jVar.mo3323o();
                this.f2764u = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3465z(boolean z) {
        for (Fragment next : this.f2746c.mo3553m()) {
            if (next != null) {
                next.mo3188c1(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo3466z0(Fragment fragment) {
        mo3396A0(fragment, this.f2757n);
    }
}
