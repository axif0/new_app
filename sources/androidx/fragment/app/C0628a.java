package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0653m;
import androidx.fragment.app.C0675u;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0710e;
import java.io.PrintWriter;
import java.util.ArrayList;
import p086f.p111h.p121l.C3343b;

/* renamed from: androidx.fragment.app.a */
final class C0628a extends C0675u implements C0653m.C0661h {

    /* renamed from: r */
    final C0653m f2661r;

    /* renamed from: s */
    boolean f2662s;

    /* renamed from: t */
    int f2663t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0628a(androidx.fragment.app.C0653m r3) {
        /*
            r2 = this;
            androidx.fragment.app.i r0 = r3.mo3433e0()
            androidx.fragment.app.j<?> r1 = r3.f2758o
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.mo3377h()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f2663t = r0
            r2.f2661r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0628a.<init>(androidx.fragment.app.m):void");
    }

    /* renamed from: E */
    private static boolean m3124E(C0675u.C0676a aVar) {
        Fragment fragment = aVar.f2838b;
        return fragment != null && fragment.f2629p && fragment.f2604L != null && !fragment.f2597E && !fragment.f2596D && fragment.mo3189d0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Fragment mo3253A(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2820a.size()) {
            C0675u.C0676a aVar = this.f2820a.get(i);
            int i2 = aVar.f2837a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f2838b;
                    int i3 = fragment3.f2594B;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f2594B == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2820a.add(i, new C0675u.C0676a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0675u.C0676a aVar2 = new C0675u.C0676a(3, fragment4);
                                aVar2.f2839c = aVar.f2839c;
                                aVar2.f2841e = aVar.f2841e;
                                aVar2.f2840d = aVar.f2840d;
                                aVar2.f2842f = aVar.f2842f;
                                this.f2820a.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f2820a.remove(i);
                        i--;
                    } else {
                        aVar.f2837a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f2838b);
                    Fragment fragment5 = aVar.f2838b;
                    if (fragment5 == fragment2) {
                        this.f2820a.add(i, new C0675u.C0676a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2820a.add(i, new C0675u.C0676a(9, fragment2));
                        i++;
                        fragment2 = aVar.f2838b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f2838b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: B */
    public String mo3254B() {
        return this.f2828i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo3255C(int i) {
        int size = this.f2820a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2820a.get(i2).f2838b;
            int i3 = fragment != null ? fragment.f2594B : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3256D(ArrayList<C0628a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2820a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f2820a.get(i4).f2838b;
            int i5 = fragment != null ? fragment.f2594B : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0628a aVar = arrayList.get(i6);
                    int size2 = aVar.f2820a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f2820a.get(i7).f2838b;
                        if ((fragment2 != null ? fragment2.f2594B : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo3257F() {
        for (int i = 0; i < this.f2820a.size(); i++) {
            if (m3124E(this.f2820a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public void mo3258G() {
        if (this.f2836q != null) {
            for (int i = 0; i < this.f2836q.size(); i++) {
                this.f2836q.get(i).run();
            }
            this.f2836q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3259H(Fragment.C0627e eVar) {
        for (int i = 0; i < this.f2820a.size(); i++) {
            C0675u.C0676a aVar = this.f2820a.get(i);
            if (m3124E(aVar)) {
                aVar.f2838b.mo3131A1(eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Fragment mo3260I(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2820a.size() - 1; size >= 0; size--) {
            C0675u.C0676a aVar = this.f2820a.get(size);
            int i = aVar.f2837a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2838b;
                            break;
                        case 10:
                            aVar.f2844h = aVar.f2843g;
                            break;
                    }
                }
                arrayList.add(aVar.f2838b);
            }
            arrayList.remove(aVar.f2838b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo3261a(ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0653m.m3287p0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2826g) {
            return true;
        }
        this.f2661r.mo3428b(this);
        return true;
    }

    /* renamed from: i */
    public int mo3262i() {
        return mo3272v(false);
    }

    /* renamed from: j */
    public int mo3263j() {
        return mo3272v(true);
    }

    /* renamed from: k */
    public void mo3264k() {
        mo3568n();
        this.f2661r.mo3419R(this, false);
    }

    /* renamed from: l */
    public void mo3265l() {
        mo3568n();
        this.f2661r.mo3419R(this, true);
    }

    /* renamed from: m */
    public C0675u mo3266m(Fragment fragment) {
        C0653m mVar = fragment.f2636w;
        if (mVar == null || mVar == this.f2661r) {
            super.mo3266m(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3267o(int i, Fragment fragment, String str, int i2) {
        super.mo3267o(i, fragment, str, i2);
        fragment.f2636w = this.f2661r;
    }

    /* renamed from: p */
    public C0675u mo3268p(Fragment fragment) {
        C0653m mVar = fragment.f2636w;
        if (mVar == null || mVar == this.f2661r) {
            super.mo3268p(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: s */
    public C0675u mo3269s(Fragment fragment, C0710e.C0712b bVar) {
        if (fragment.f2636w != this.f2661r) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f2661r);
        } else if (bVar.mo3670e(C0710e.C0712b.CREATED)) {
            super.mo3269s(fragment, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + C0710e.C0712b.CREATED);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2663t >= 0) {
            sb.append(" #");
            sb.append(this.f2663t);
        }
        if (this.f2828i != null) {
            sb.append(" ");
            sb.append(this.f2828i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3271u(int i) {
        if (this.f2826g) {
            if (C0653m.m3287p0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f2820a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0675u.C0676a aVar = this.f2820a.get(i2);
                Fragment fragment = aVar.f2838b;
                if (fragment != null) {
                    fragment.f2635v += i;
                    if (C0653m.m3287p0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2838b + " to " + aVar.f2838b.f2635v);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public int mo3272v(boolean z) {
        if (!this.f2662s) {
            if (C0653m.m3287p0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C3343b("FragmentManager"));
                mo3273w("  ", printWriter);
                printWriter.close();
            }
            this.f2662s = true;
            this.f2663t = this.f2826g ? this.f2661r.mo3434f() : -1;
            this.f2661r.mo3415O(this, z);
            return this.f2663t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: w */
    public void mo3273w(String str, PrintWriter printWriter) {
        mo3274x(str, printWriter, true);
    }

    /* renamed from: x */
    public void mo3274x(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2828i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2663t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2662s);
            if (this.f2825f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2825f));
            }
            if (!(this.f2821b == 0 && this.f2822c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2821b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2822c));
            }
            if (!(this.f2823d == 0 && this.f2824e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2823d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2824e));
            }
            if (!(this.f2829j == 0 && this.f2830k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2829j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2830k);
            }
            if (!(this.f2831l == 0 && this.f2832m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2831l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2832m);
            }
        }
        if (!this.f2820a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2820a.size();
            for (int i = 0; i < size; i++) {
                C0675u.C0676a aVar = this.f2820a.get(i);
                switch (aVar.f2837a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2837a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2838b);
                if (z) {
                    if (!(aVar.f2839c == 0 && aVar.f2840d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2839c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2840d));
                    }
                    if (aVar.f2841e != 0 || aVar.f2842f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2841e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2842f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3275y() {
        int size = this.f2820a.size();
        for (int i = 0; i < size; i++) {
            C0675u.C0676a aVar = this.f2820a.get(i);
            Fragment fragment = aVar.f2838b;
            if (fragment != null) {
                fragment.mo3247z1(this.f2825f);
            }
            switch (aVar.f2837a) {
                case 1:
                    fragment.mo3244y1(aVar.f2839c);
                    this.f2661r.mo3420R0(fragment, false);
                    this.f2661r.mo3431d(fragment);
                    break;
                case 3:
                    fragment.mo3244y1(aVar.f2840d);
                    this.f2661r.mo3410J0(fragment);
                    break;
                case 4:
                    fragment.mo3244y1(aVar.f2840d);
                    this.f2661r.mo3447n0(fragment);
                    break;
                case 5:
                    fragment.mo3244y1(aVar.f2839c);
                    this.f2661r.mo3420R0(fragment, false);
                    this.f2661r.mo3424V0(fragment);
                    break;
                case 6:
                    fragment.mo3244y1(aVar.f2840d);
                    this.f2661r.mo3449q(fragment);
                    break;
                case 7:
                    fragment.mo3244y1(aVar.f2839c);
                    this.f2661r.mo3420R0(fragment, false);
                    this.f2661r.mo3438h(fragment);
                    break;
                case 8:
                    this.f2661r.mo3422T0(fragment);
                    break;
                case 9:
                    this.f2661r.mo3422T0((Fragment) null);
                    break;
                case 10:
                    this.f2661r.mo3421S0(fragment, aVar.f2844h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2837a);
            }
            if (!(this.f2835p || aVar.f2837a == 1 || fragment == null)) {
                this.f2661r.mo3462x0(fragment);
            }
        }
        if (!this.f2835p) {
            C0653m mVar = this.f2661r;
            mVar.mo3464y0(mVar.f2757n, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3276z(boolean z) {
        for (int size = this.f2820a.size() - 1; size >= 0; size--) {
            C0675u.C0676a aVar = this.f2820a.get(size);
            Fragment fragment = aVar.f2838b;
            if (fragment != null) {
                fragment.mo3247z1(C0653m.m3268O0(this.f2825f));
            }
            switch (aVar.f2837a) {
                case 1:
                    fragment.mo3244y1(aVar.f2842f);
                    this.f2661r.mo3420R0(fragment, true);
                    this.f2661r.mo3410J0(fragment);
                    break;
                case 3:
                    fragment.mo3244y1(aVar.f2841e);
                    this.f2661r.mo3431d(fragment);
                    break;
                case 4:
                    fragment.mo3244y1(aVar.f2841e);
                    this.f2661r.mo3424V0(fragment);
                    break;
                case 5:
                    fragment.mo3244y1(aVar.f2842f);
                    this.f2661r.mo3420R0(fragment, true);
                    this.f2661r.mo3447n0(fragment);
                    break;
                case 6:
                    fragment.mo3244y1(aVar.f2841e);
                    this.f2661r.mo3438h(fragment);
                    break;
                case 7:
                    fragment.mo3244y1(aVar.f2842f);
                    this.f2661r.mo3420R0(fragment, true);
                    this.f2661r.mo3449q(fragment);
                    break;
                case 8:
                    this.f2661r.mo3422T0((Fragment) null);
                    break;
                case 9:
                    this.f2661r.mo3422T0(fragment);
                    break;
                case 10:
                    this.f2661r.mo3421S0(fragment, aVar.f2843g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2837a);
            }
            if (!(this.f2835p || aVar.f2837a == 3 || fragment == null)) {
                this.f2661r.mo3462x0(fragment);
            }
        }
        if (!this.f2835p && z) {
            C0653m mVar = this.f2661r;
            mVar.mo3464y0(mVar.f2757n, true);
        }
    }
}
