package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C0843o implements RecyclerView.C0860z.C0862b {

    /* renamed from: A */
    int f3208A;

    /* renamed from: B */
    int f3209B;

    /* renamed from: C */
    private boolean f3210C;

    /* renamed from: D */
    C0820d f3211D;

    /* renamed from: E */
    final C0817a f3212E;

    /* renamed from: F */
    private final C0818b f3213F;

    /* renamed from: G */
    private int f3214G;

    /* renamed from: H */
    private int[] f3215H;

    /* renamed from: s */
    int f3216s;

    /* renamed from: t */
    private C0819c f3217t;

    /* renamed from: u */
    C0913n f3218u;

    /* renamed from: v */
    private boolean f3219v;

    /* renamed from: w */
    private boolean f3220w;

    /* renamed from: x */
    boolean f3221x;

    /* renamed from: y */
    private boolean f3222y;

    /* renamed from: z */
    private boolean f3223z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0817a {

        /* renamed from: a */
        C0913n f3224a;

        /* renamed from: b */
        int f3225b;

        /* renamed from: c */
        int f3226c;

        /* renamed from: d */
        boolean f3227d;

        /* renamed from: e */
        boolean f3228e;

        C0817a() {
            mo4090e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4086a() {
            this.f3226c = this.f3227d ? this.f3224a.mo4812i() : this.f3224a.mo4816m();
        }

        /* renamed from: b */
        public void mo4087b(View view, int i) {
            this.f3226c = this.f3227d ? this.f3224a.mo4807d(view) + this.f3224a.mo4818o() : this.f3224a.mo4810g(view);
            this.f3225b = i;
        }

        /* renamed from: c */
        public void mo4088c(View view, int i) {
            int o = this.f3224a.mo4818o();
            if (o >= 0) {
                mo4087b(view, i);
                return;
            }
            this.f3225b = i;
            if (this.f3227d) {
                int i2 = (this.f3224a.mo4812i() - o) - this.f3224a.mo4807d(view);
                this.f3226c = this.f3224a.mo4812i() - i2;
                if (i2 > 0) {
                    int e = this.f3226c - this.f3224a.mo4808e(view);
                    int m = this.f3224a.mo4816m();
                    int min = e - (m + Math.min(this.f3224a.mo4810g(view) - m, 0));
                    if (min < 0) {
                        this.f3226c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f3224a.mo4810g(view);
            int m2 = g - this.f3224a.mo4816m();
            this.f3226c = g;
            if (m2 > 0) {
                int i3 = (this.f3224a.mo4812i() - Math.min(0, (this.f3224a.mo4812i() - o) - this.f3224a.mo4807d(view))) - (g + this.f3224a.mo4808e(view));
                if (i3 < 0) {
                    this.f3226c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4089d(View view, RecyclerView.C0823a0 a0Var) {
            RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
            return !pVar.mo4519c() && pVar.mo4517a() >= 0 && pVar.mo4517a() < a0Var.mo4278b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4090e() {
            this.f3225b = -1;
            this.f3226c = Integer.MIN_VALUE;
            this.f3227d = false;
            this.f3228e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3225b + ", mCoordinate=" + this.f3226c + ", mLayoutFromEnd=" + this.f3227d + ", mValid=" + this.f3228e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0818b {

        /* renamed from: a */
        public int f3229a;

        /* renamed from: b */
        public boolean f3230b;

        /* renamed from: c */
        public boolean f3231c;

        /* renamed from: d */
        public boolean f3232d;

        protected C0818b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4092a() {
            this.f3229a = 0;
            this.f3230b = false;
            this.f3231c = false;
            this.f3232d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0819c {

        /* renamed from: a */
        boolean f3233a = true;

        /* renamed from: b */
        int f3234b;

        /* renamed from: c */
        int f3235c;

        /* renamed from: d */
        int f3236d;

        /* renamed from: e */
        int f3237e;

        /* renamed from: f */
        int f3238f;

        /* renamed from: g */
        int f3239g;

        /* renamed from: h */
        int f3240h = 0;

        /* renamed from: i */
        int f3241i = 0;

        /* renamed from: j */
        boolean f3242j;

        /* renamed from: k */
        int f3243k;

        /* renamed from: l */
        List<RecyclerView.C0829d0> f3244l = null;

        /* renamed from: m */
        boolean f3245m;

        C0819c() {
        }

        /* renamed from: e */
        private View m4189e() {
            int size = this.f3244l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3244l.get(i).f3359a;
                RecyclerView.C0848p pVar = (RecyclerView.C0848p) view.getLayoutParams();
                if (!pVar.mo4519c() && this.f3236d == pVar.mo4517a()) {
                    mo4094b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo4093a() {
            mo4094b((View) null);
        }

        /* renamed from: b */
        public void mo4094b(View view) {
            View f = mo4097f(view);
            this.f3236d = f == null ? -1 : ((RecyclerView.C0848p) f.getLayoutParams()).mo4517a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4095c(RecyclerView.C0823a0 a0Var) {
            int i = this.f3236d;
            return i >= 0 && i < a0Var.mo4278b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo4096d(RecyclerView.C0855v vVar) {
            if (this.f3244l != null) {
                return m4189e();
            }
            View o = vVar.mo4565o(this.f3236d);
            this.f3236d += this.f3237e;
            return o;
        }

        /* renamed from: f */
        public View mo4097f(View view) {
            int a;
            int size = this.f3244l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3244l.get(i2).f3359a;
                RecyclerView.C0848p pVar = (RecyclerView.C0848p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo4519c() && (a = (pVar.mo4517a() - this.f3236d) * this.f3237e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0820d implements Parcelable {
        public static final Parcelable.Creator<C0820d> CREATOR = new C0821a();

        /* renamed from: f */
        int f3246f;

        /* renamed from: g */
        int f3247g;

        /* renamed from: h */
        boolean f3248h;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C0821a implements Parcelable.Creator<C0820d> {
            C0821a() {
            }

            /* renamed from: a */
            public C0820d createFromParcel(Parcel parcel) {
                return new C0820d(parcel);
            }

            /* renamed from: b */
            public C0820d[] newArray(int i) {
                return new C0820d[i];
            }
        }

        public C0820d() {
        }

        C0820d(Parcel parcel) {
            this.f3246f = parcel.readInt();
            this.f3247g = parcel.readInt();
            this.f3248h = parcel.readInt() != 1 ? false : true;
        }

        public C0820d(C0820d dVar) {
            this.f3246f = dVar.f3246f;
            this.f3247g = dVar.f3247g;
            this.f3248h = dVar.f3248h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4098a() {
            return this.f3246f >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4099b() {
            this.f3246f = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3246f);
            parcel.writeInt(this.f3247g);
            parcel.writeInt(this.f3248h ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3216s = 1;
        this.f3220w = false;
        this.f3221x = false;
        this.f3222y = false;
        this.f3223z = true;
        this.f3208A = -1;
        this.f3209B = Integer.MIN_VALUE;
        this.f3211D = null;
        this.f3212E = new C0817a();
        this.f3213F = new C0818b();
        this.f3214G = 2;
        this.f3215H = new int[2];
        mo4052C2(i);
        mo4053D2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3216s = 1;
        this.f3220w = false;
        this.f3221x = false;
        this.f3222y = false;
        this.f3223z = true;
        this.f3208A = -1;
        this.f3209B = Integer.MIN_VALUE;
        this.f3211D = null;
        this.f3212E = new C0817a();
        this.f3213F = new C0818b();
        this.f3214G = 2;
        this.f3215H = new int[2];
        RecyclerView.C0843o.C0847d i0 = RecyclerView.C0843o.m4478i0(context, attributeSet, i, i2);
        mo4052C2(i0.f3410a);
        mo4053D2(i0.f3412c);
        mo4013E2(i0.f3413d);
    }

    /* renamed from: A2 */
    private void m4102A2() {
        this.f3221x = (this.f3216s == 1 || !mo4080q2()) ? this.f3220w : !this.f3220w;
    }

    /* renamed from: F2 */
    private boolean m4103F2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, C0817a aVar) {
        boolean z = false;
        if (mo4437J() == 0) {
            return false;
        }
        View V = mo4453V();
        if (V != null && aVar.mo4089d(V, a0Var)) {
            aVar.mo4088c(V, mo4477h0(V));
            return true;
        } else if (this.f3219v != this.f3222y) {
            return false;
        } else {
            View i2 = aVar.f3227d ? m4120i2(vVar, a0Var) : m4121j2(vVar, a0Var);
            if (i2 == null) {
                return false;
            }
            aVar.mo4087b(i2, mo4477h0(i2));
            if (!a0Var.mo4281e() && mo4016L1()) {
                if (this.f3218u.mo4810g(i2) >= this.f3218u.mo4812i() || this.f3218u.mo4807d(i2) < this.f3218u.mo4816m()) {
                    z = true;
                }
                if (z) {
                    aVar.f3226c = aVar.f3227d ? this.f3218u.mo4812i() : this.f3218u.mo4816m();
                }
            }
            return true;
        }
    }

    /* renamed from: G2 */
    private boolean m4104G2(RecyclerView.C0823a0 a0Var, C0817a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo4281e() && (i = this.f3208A) != -1) {
            if (i < 0 || i >= a0Var.mo4278b()) {
                this.f3208A = -1;
                this.f3209B = Integer.MIN_VALUE;
            } else {
                aVar.f3225b = this.f3208A;
                C0820d dVar = this.f3211D;
                if (dVar != null && dVar.mo4098a()) {
                    boolean z2 = this.f3211D.f3248h;
                    aVar.f3227d = z2;
                    aVar.f3226c = z2 ? this.f3218u.mo4812i() - this.f3211D.f3247g : this.f3218u.mo4816m() + this.f3211D.f3247g;
                    return true;
                } else if (this.f3209B == Integer.MIN_VALUE) {
                    View C = mo4051C(this.f3208A);
                    if (C == null) {
                        if (mo4437J() > 0) {
                            if ((this.f3208A < mo4477h0(mo4436I(0))) == this.f3221x) {
                                z = true;
                            }
                            aVar.f3227d = z;
                        }
                        aVar.mo4086a();
                    } else if (this.f3218u.mo4808e(C) > this.f3218u.mo4817n()) {
                        aVar.mo4086a();
                        return true;
                    } else if (this.f3218u.mo4810g(C) - this.f3218u.mo4816m() < 0) {
                        aVar.f3226c = this.f3218u.mo4816m();
                        aVar.f3227d = false;
                        return true;
                    } else if (this.f3218u.mo4812i() - this.f3218u.mo4807d(C) < 0) {
                        aVar.f3226c = this.f3218u.mo4812i();
                        aVar.f3227d = true;
                        return true;
                    } else {
                        aVar.f3226c = aVar.f3227d ? this.f3218u.mo4807d(C) + this.f3218u.mo4818o() : this.f3218u.mo4810g(C);
                    }
                    return true;
                } else {
                    boolean z3 = this.f3221x;
                    aVar.f3227d = z3;
                    aVar.f3226c = z3 ? this.f3218u.mo4812i() - this.f3209B : this.f3218u.mo4816m() + this.f3209B;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: H2 */
    private void m4105H2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, C0817a aVar) {
        if (!m4104G2(a0Var, aVar) && !m4103F2(vVar, a0Var, aVar)) {
            aVar.mo4086a();
            aVar.f3225b = this.f3222y ? a0Var.mo4278b() - 1 : 0;
        }
    }

    /* renamed from: I2 */
    private void m4106I2(int i, int i2, boolean z, RecyclerView.C0823a0 a0Var) {
        int i3;
        this.f3217t.f3245m = mo4085z2();
        this.f3217t.f3238f = i;
        int[] iArr = this.f3215H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo4058M1(a0Var, iArr);
        int max = Math.max(0, this.f3215H[0]);
        int max2 = Math.max(0, this.f3215H[1]);
        if (i == 1) {
            z2 = true;
        }
        this.f3217t.f3240h = z2 ? max2 : max;
        C0819c cVar = this.f3217t;
        if (!z2) {
            max = max2;
        }
        cVar.f3241i = max;
        if (z2) {
            this.f3217t.f3240h += this.f3218u.mo4813j();
            View m2 = m4124m2();
            C0819c cVar2 = this.f3217t;
            if (this.f3221x) {
                i4 = -1;
            }
            cVar2.f3237e = i4;
            C0819c cVar3 = this.f3217t;
            int h0 = mo4477h0(m2);
            C0819c cVar4 = this.f3217t;
            cVar3.f3236d = h0 + cVar4.f3237e;
            cVar4.f3234b = this.f3218u.mo4807d(m2);
            i3 = this.f3218u.mo4807d(m2) - this.f3218u.mo4812i();
        } else {
            View n2 = m4125n2();
            this.f3217t.f3240h += this.f3218u.mo4816m();
            C0819c cVar5 = this.f3217t;
            if (!this.f3221x) {
                i4 = -1;
            }
            cVar5.f3237e = i4;
            C0819c cVar6 = this.f3217t;
            int h02 = mo4477h0(n2);
            C0819c cVar7 = this.f3217t;
            cVar6.f3236d = h02 + cVar7.f3237e;
            cVar7.f3234b = this.f3218u.mo4810g(n2);
            i3 = (-this.f3218u.mo4810g(n2)) + this.f3218u.mo4816m();
        }
        C0819c cVar8 = this.f3217t;
        cVar8.f3235c = i2;
        if (z) {
            cVar8.f3235c = i2 - i3;
        }
        this.f3217t.f3239g = i3;
    }

    /* renamed from: J2 */
    private void m4107J2(int i, int i2) {
        this.f3217t.f3235c = this.f3218u.mo4812i() - i2;
        this.f3217t.f3237e = this.f3221x ? -1 : 1;
        C0819c cVar = this.f3217t;
        cVar.f3236d = i;
        cVar.f3238f = 1;
        cVar.f3234b = i2;
        cVar.f3239g = Integer.MIN_VALUE;
    }

    /* renamed from: K2 */
    private void m4108K2(C0817a aVar) {
        m4107J2(aVar.f3225b, aVar.f3226c);
    }

    /* renamed from: L2 */
    private void m4109L2(int i, int i2) {
        this.f3217t.f3235c = i2 - this.f3218u.mo4816m();
        C0819c cVar = this.f3217t;
        cVar.f3236d = i;
        cVar.f3237e = this.f3221x ? 1 : -1;
        C0819c cVar2 = this.f3217t;
        cVar2.f3238f = -1;
        cVar2.f3234b = i2;
        cVar2.f3239g = Integer.MIN_VALUE;
    }

    /* renamed from: M2 */
    private void m4110M2(C0817a aVar) {
        m4109L2(aVar.f3225b, aVar.f3226c);
    }

    /* renamed from: O1 */
    private int m4111O1(RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0) {
            return 0;
        }
        mo4061T1();
        C0913n nVar = this.f3218u;
        View Y1 = mo4064Y1(!this.f3223z, true);
        return C0918p.m5137a(a0Var, nVar, Y1, mo4063X1(!this.f3223z, true), this, this.f3223z);
    }

    /* renamed from: P1 */
    private int m4112P1(RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0) {
            return 0;
        }
        mo4061T1();
        C0913n nVar = this.f3218u;
        View Y1 = mo4064Y1(!this.f3223z, true);
        return C0918p.m5138b(a0Var, nVar, Y1, mo4063X1(!this.f3223z, true), this, this.f3223z, this.f3221x);
    }

    /* renamed from: Q1 */
    private int m4113Q1(RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0) {
            return 0;
        }
        mo4061T1();
        C0913n nVar = this.f3218u;
        View Y1 = mo4064Y1(!this.f3223z, true);
        return C0918p.m5139c(a0Var, nVar, Y1, mo4063X1(!this.f3223z, true), this, this.f3223z);
    }

    /* renamed from: V1 */
    private View m4114V1() {
        return mo4070d2(0, mo4437J());
    }

    /* renamed from: W1 */
    private View m4115W1(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return mo4030h2(vVar, a0Var, 0, mo4437J(), a0Var.mo4278b());
    }

    /* renamed from: a2 */
    private View m4116a2() {
        return mo4070d2(mo4437J() - 1, -1);
    }

    /* renamed from: b2 */
    private View m4117b2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return mo4030h2(vVar, a0Var, mo4437J() - 1, -1, a0Var.mo4278b());
    }

    /* renamed from: f2 */
    private View m4118f2() {
        return this.f3221x ? m4114V1() : m4116a2();
    }

    /* renamed from: g2 */
    private View m4119g2() {
        return this.f3221x ? m4116a2() : m4114V1();
    }

    /* renamed from: i2 */
    private View m4120i2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return this.f3221x ? m4115W1(vVar, a0Var) : m4117b2(vVar, a0Var);
    }

    /* renamed from: j2 */
    private View m4121j2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return this.f3221x ? m4117b2(vVar, a0Var) : m4115W1(vVar, a0Var);
    }

    /* renamed from: k2 */
    private int m4122k2(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, boolean z) {
        int i2;
        int i3 = this.f3218u.mo4812i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo4050B2(-i3, vVar, a0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f3218u.mo4812i() - i5) <= 0) {
            return i4;
        }
        this.f3218u.mo4821r(i2);
        return i2 + i4;
    }

    /* renamed from: l2 */
    private int m4123l2(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.f3218u.mo4816m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo4050B2(m2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f3218u.mo4816m()) <= 0) {
            return i2;
        }
        this.f3218u.mo4821r(-m);
        return i2 - m;
    }

    /* renamed from: m2 */
    private View m4124m2() {
        return mo4436I(this.f3221x ? 0 : mo4437J() - 1);
    }

    /* renamed from: n2 */
    private View m4125n2() {
        return mo4436I(this.f3221x ? mo4437J() - 1 : 0);
    }

    /* renamed from: t2 */
    private void m4126t2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, int i, int i2) {
        RecyclerView.C0855v vVar2 = vVar;
        RecyclerView.C0823a0 a0Var2 = a0Var;
        if (a0Var.mo4283g() && mo4437J() != 0 && !a0Var.mo4281e() && mo4016L1()) {
            List<RecyclerView.C0829d0> k = vVar.mo4561k();
            int size = k.size();
            int h0 = mo4477h0(mo4436I(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C0829d0 d0Var = k.get(i5);
                if (!d0Var.mo4330v()) {
                    char c = 1;
                    if ((d0Var.mo4320m() < h0) != this.f3221x) {
                        c = 65535;
                    }
                    int e = this.f3218u.mo4808e(d0Var.f3359a);
                    if (c == 65535) {
                        i3 += e;
                    } else {
                        i4 += e;
                    }
                }
            }
            this.f3217t.f3244l = k;
            if (i3 > 0) {
                m4109L2(mo4477h0(m4125n2()), i);
                C0819c cVar = this.f3217t;
                cVar.f3240h = i3;
                cVar.f3235c = 0;
                cVar.mo4093a();
                mo4062U1(vVar2, this.f3217t, a0Var2, false);
            }
            if (i4 > 0) {
                m4107J2(mo4477h0(m4124m2()), i2);
                C0819c cVar2 = this.f3217t;
                cVar2.f3240h = i4;
                cVar2.f3235c = 0;
                cVar2.mo4093a();
                mo4062U1(vVar2, this.f3217t, a0Var2, false);
            }
            this.f3217t.f3244l = null;
        }
    }

    /* renamed from: v2 */
    private void m4127v2(RecyclerView.C0855v vVar, C0819c cVar) {
        if (cVar.f3233a && !cVar.f3245m) {
            int i = cVar.f3239g;
            int i2 = cVar.f3241i;
            if (cVar.f3238f == -1) {
                m4129x2(vVar, i, i2);
            } else {
                m4130y2(vVar, i, i2);
            }
        }
    }

    /* renamed from: w2 */
    private void m4128w2(RecyclerView.C0855v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4490n1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo4490n1(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: x2 */
    private void m4129x2(RecyclerView.C0855v vVar, int i, int i2) {
        int J = mo4437J();
        if (i >= 0) {
            int h = (this.f3218u.mo4811h() - i) + i2;
            if (this.f3221x) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I = mo4436I(i3);
                    if (this.f3218u.mo4810g(I) < h || this.f3218u.mo4820q(I) < h) {
                        m4128w2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = J - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View I2 = mo4436I(i5);
                if (this.f3218u.mo4810g(I2) < h || this.f3218u.mo4820q(I2) < h) {
                    m4128w2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: y2 */
    private void m4130y2(RecyclerView.C0855v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int J = mo4437J();
            if (this.f3221x) {
                int i4 = J - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View I = mo4436I(i5);
                    if (this.f3218u.mo4807d(I) > i3 || this.f3218u.mo4819p(I) > i3) {
                        m4128w2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < J; i6++) {
                View I2 = mo4436I(i6);
                if (this.f3218u.mo4807d(I2) > i3 || this.f3218u.mo4819p(I2) > i3) {
                    m4128w2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public int mo4050B2(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0 || i == 0) {
            return 0;
        }
        mo4061T1();
        this.f3217t.f3233a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m4106I2(i2, abs, true, a0Var);
        C0819c cVar = this.f3217t;
        int U1 = cVar.f3239g + mo4062U1(vVar, cVar, a0Var, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i = i2 * U1;
        }
        this.f3218u.mo4821r(-i);
        this.f3217t.f3243k = i;
        return i;
    }

    /* renamed from: C */
    public View mo4051C(int i) {
        int J = mo4437J();
        if (J == 0) {
            return null;
        }
        int h0 = i - mo4477h0(mo4436I(0));
        if (h0 >= 0 && h0 < J) {
            View I = mo4436I(h0);
            if (mo4477h0(I) == i) {
                return I;
            }
        }
        return super.mo4051C(i);
    }

    /* renamed from: C2 */
    public void mo4052C2(int i) {
        if (i == 0 || i == 1) {
            mo4072g((String) null);
            if (i != this.f3216s || this.f3218u == null) {
                C0913n b = C0913n.m5075b(this, i);
                this.f3218u = b;
                this.f3212E.f3224a = b;
                this.f3216s = i;
                mo4500t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: D */
    public RecyclerView.C0848p mo4011D() {
        return new RecyclerView.C0848p(-2, -2);
    }

    /* renamed from: D2 */
    public void mo4053D2(boolean z) {
        mo4072g((String) null);
        if (z != this.f3220w) {
            this.f3220w = z;
            mo4500t1();
        }
    }

    /* renamed from: E2 */
    public void mo4013E2(boolean z) {
        mo4072g((String) null);
        if (this.f3222y != z) {
            this.f3222y = z;
            mo4500t1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public boolean mo4054G1() {
        return (mo4456X() == 1073741824 || mo4493p0() == 1073741824 || !mo4495q0()) ? false : true;
    }

    /* renamed from: I0 */
    public void mo4055I0(RecyclerView recyclerView, RecyclerView.C0855v vVar) {
        super.mo4055I0(recyclerView, vVar);
        if (this.f3210C) {
            mo4484k1(vVar);
            vVar.mo4553c();
        }
    }

    /* renamed from: I1 */
    public void mo4056I1(RecyclerView recyclerView, RecyclerView.C0823a0 a0Var, int i) {
        C0908j jVar = new C0908j(recyclerView.getContext());
        jVar.mo4599p(i);
        mo4438J1(jVar);
    }

    /* renamed from: J0 */
    public View mo4015J0(View view, int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        int R1;
        m4102A2();
        if (mo4437J() == 0 || (R1 = mo4059R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo4061T1();
        m4106I2(R1, (int) (((float) this.f3218u.mo4817n()) * 0.33333334f), false, a0Var);
        C0819c cVar = this.f3217t;
        cVar.f3239g = Integer.MIN_VALUE;
        cVar.f3233a = false;
        mo4062U1(vVar, cVar, a0Var, true);
        View g2 = R1 == -1 ? m4119g2() : m4118f2();
        View n2 = R1 == -1 ? m4125n2() : m4124m2();
        if (!n2.hasFocusable()) {
            return g2;
        }
        if (g2 == null) {
            return null;
        }
        return n2;
    }

    /* renamed from: K0 */
    public void mo4057K0(AccessibilityEvent accessibilityEvent) {
        super.mo4057K0(accessibilityEvent);
        if (mo4437J() > 0) {
            accessibilityEvent.setFromIndex(mo4065Z1());
            accessibilityEvent.setToIndex(mo4068c2());
        }
    }

    /* renamed from: L1 */
    public boolean mo4016L1() {
        return this.f3211D == null && this.f3219v == this.f3222y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public void mo4058M1(RecyclerView.C0823a0 a0Var, int[] iArr) {
        int i;
        int o2 = mo4076o2(a0Var);
        if (this.f3217t.f3238f == -1) {
            i = 0;
        } else {
            i = o2;
            o2 = 0;
        }
        iArr[0] = o2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo4018N1(RecyclerView.C0823a0 a0Var, C0819c cVar, RecyclerView.C0843o.C0846c cVar2) {
        int i = cVar.f3236d;
        if (i >= 0 && i < a0Var.mo4278b()) {
            cVar2.mo4516a(i, Math.max(0, cVar.f3239g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public int mo4059R1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3216s == 1) ? 1 : Integer.MIN_VALUE : this.f3216s == 0 ? 1 : Integer.MIN_VALUE : this.f3216s == 1 ? -1 : Integer.MIN_VALUE : this.f3216s == 0 ? -1 : Integer.MIN_VALUE : (this.f3216s != 1 && mo4080q2()) ? -1 : 1 : (this.f3216s != 1 && mo4080q2()) ? 1 : -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public C0819c mo4060S1() {
        return new C0819c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void mo4061T1() {
        if (this.f3217t == null) {
            this.f3217t = mo4060S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public int mo4062U1(RecyclerView.C0855v vVar, C0819c cVar, RecyclerView.C0823a0 a0Var, boolean z) {
        int i = cVar.f3235c;
        int i2 = cVar.f3239g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3239g = i2 + i;
            }
            m4127v2(vVar, cVar);
        }
        int i3 = cVar.f3235c + cVar.f3240h;
        C0818b bVar = this.f3213F;
        while (true) {
            if ((!cVar.f3245m && i3 <= 0) || !cVar.mo4095c(a0Var)) {
                break;
            }
            bVar.mo4092a();
            mo4035s2(vVar, a0Var, cVar, bVar);
            if (!bVar.f3230b) {
                cVar.f3234b += bVar.f3229a * cVar.f3238f;
                if (!bVar.f3231c || cVar.f3244l != null || !a0Var.mo4281e()) {
                    int i4 = cVar.f3235c;
                    int i5 = bVar.f3229a;
                    cVar.f3235c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3239g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f3229a;
                    cVar.f3239g = i7;
                    int i8 = cVar.f3235c;
                    if (i8 < 0) {
                        cVar.f3239g = i7 + i8;
                    }
                    m4127v2(vVar, cVar);
                }
                if (z && bVar.f3232d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3235c;
    }

    /* renamed from: X0 */
    public void mo4026X0(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View C;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3211D == null && this.f3208A == -1) && a0Var.mo4278b() == 0) {
            mo4484k1(vVar);
            return;
        }
        C0820d dVar = this.f3211D;
        if (dVar != null && dVar.mo4098a()) {
            this.f3208A = this.f3211D.f3246f;
        }
        mo4061T1();
        this.f3217t.f3233a = false;
        m4102A2();
        View V = mo4453V();
        if (!this.f3212E.f3228e || this.f3208A != -1 || this.f3211D != null) {
            this.f3212E.mo4090e();
            C0817a aVar = this.f3212E;
            aVar.f3227d = this.f3221x ^ this.f3222y;
            m4105H2(vVar, a0Var, aVar);
            this.f3212E.f3228e = true;
        } else if (V != null && (this.f3218u.mo4810g(V) >= this.f3218u.mo4812i() || this.f3218u.mo4807d(V) <= this.f3218u.mo4816m())) {
            this.f3212E.mo4088c(V, mo4477h0(V));
        }
        C0819c cVar = this.f3217t;
        cVar.f3238f = cVar.f3243k >= 0 ? 1 : -1;
        int[] iArr = this.f3215H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4058M1(a0Var, iArr);
        int max = Math.max(0, this.f3215H[0]) + this.f3218u.mo4816m();
        int max2 = Math.max(0, this.f3215H[1]) + this.f3218u.mo4813j();
        if (!(!a0Var.mo4281e() || (i6 = this.f3208A) == -1 || this.f3209B == Integer.MIN_VALUE || (C = mo4051C(i6)) == null)) {
            if (this.f3221x) {
                i7 = this.f3218u.mo4812i() - this.f3218u.mo4807d(C);
                i8 = this.f3209B;
            } else {
                i8 = this.f3218u.mo4810g(C) - this.f3218u.mo4816m();
                i7 = this.f3209B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        if (!this.f3212E.f3227d ? !this.f3221x : this.f3221x) {
            i9 = 1;
        }
        mo4037u2(vVar, a0Var, this.f3212E, i9);
        mo4504w(vVar);
        this.f3217t.f3245m = mo4085z2();
        this.f3217t.f3242j = a0Var.mo4281e();
        this.f3217t.f3241i = 0;
        C0817a aVar2 = this.f3212E;
        if (aVar2.f3227d) {
            m4110M2(aVar2);
            C0819c cVar2 = this.f3217t;
            cVar2.f3240h = max;
            mo4062U1(vVar, cVar2, a0Var, false);
            C0819c cVar3 = this.f3217t;
            i2 = cVar3.f3234b;
            int i11 = cVar3.f3236d;
            int i12 = cVar3.f3235c;
            if (i12 > 0) {
                max2 += i12;
            }
            m4108K2(this.f3212E);
            C0819c cVar4 = this.f3217t;
            cVar4.f3240h = max2;
            cVar4.f3236d += cVar4.f3237e;
            mo4062U1(vVar, cVar4, a0Var, false);
            C0819c cVar5 = this.f3217t;
            i = cVar5.f3234b;
            int i13 = cVar5.f3235c;
            if (i13 > 0) {
                m4109L2(i11, i2);
                C0819c cVar6 = this.f3217t;
                cVar6.f3240h = i13;
                mo4062U1(vVar, cVar6, a0Var, false);
                i2 = this.f3217t.f3234b;
            }
        } else {
            m4108K2(aVar2);
            C0819c cVar7 = this.f3217t;
            cVar7.f3240h = max2;
            mo4062U1(vVar, cVar7, a0Var, false);
            C0819c cVar8 = this.f3217t;
            i = cVar8.f3234b;
            int i14 = cVar8.f3236d;
            int i15 = cVar8.f3235c;
            if (i15 > 0) {
                max += i15;
            }
            m4110M2(this.f3212E);
            C0819c cVar9 = this.f3217t;
            cVar9.f3240h = max;
            cVar9.f3236d += cVar9.f3237e;
            mo4062U1(vVar, cVar9, a0Var, false);
            C0819c cVar10 = this.f3217t;
            i2 = cVar10.f3234b;
            int i16 = cVar10.f3235c;
            if (i16 > 0) {
                m4107J2(i14, i);
                C0819c cVar11 = this.f3217t;
                cVar11.f3240h = i16;
                mo4062U1(vVar, cVar11, a0Var, false);
                i = this.f3217t.f3234b;
            }
        }
        if (mo4437J() > 0) {
            if (this.f3221x ^ this.f3222y) {
                int k2 = m4122k2(i, vVar, a0Var, true);
                i4 = i2 + k2;
                i3 = i + k2;
                i5 = m4123l2(i4, vVar, a0Var, false);
            } else {
                int l2 = m4123l2(i2, vVar, a0Var, true);
                i4 = i2 + l2;
                i3 = i + l2;
                i5 = m4122k2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m4126t2(vVar, a0Var, i2, i);
        if (!a0Var.mo4281e()) {
            this.f3218u.mo4822s();
        } else {
            this.f3212E.mo4090e();
        }
        this.f3219v = this.f3222y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View mo4063X1(boolean z, boolean z2) {
        int J;
        int i;
        if (this.f3221x) {
            J = 0;
            i = mo4437J();
        } else {
            J = mo4437J() - 1;
            i = -1;
        }
        return mo4071e2(J, i, z, z2);
    }

    /* renamed from: Y0 */
    public void mo4028Y0(RecyclerView.C0823a0 a0Var) {
        super.mo4028Y0(a0Var);
        this.f3211D = null;
        this.f3208A = -1;
        this.f3209B = Integer.MIN_VALUE;
        this.f3212E.mo4090e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public View mo4064Y1(boolean z, boolean z2) {
        int i;
        int J;
        if (this.f3221x) {
            i = mo4437J() - 1;
            J = -1;
        } else {
            i = 0;
            J = mo4437J();
        }
        return mo4071e2(i, J, z, z2);
    }

    /* renamed from: Z1 */
    public int mo4065Z1() {
        View e2 = mo4071e2(0, mo4437J(), false, true);
        if (e2 == null) {
            return -1;
        }
        return mo4477h0(e2);
    }

    /* renamed from: a */
    public PointF mo4066a(int i) {
        if (mo4437J() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4477h0(mo4436I(0))) {
            z = true;
        }
        if (z != this.f3221x) {
            i2 = -1;
        }
        return this.f3216s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: c1 */
    public void mo4067c1(Parcelable parcelable) {
        if (parcelable instanceof C0820d) {
            this.f3211D = (C0820d) parcelable;
            mo4500t1();
        }
    }

    /* renamed from: c2 */
    public int mo4068c2() {
        View e2 = mo4071e2(mo4437J() - 1, -1, false, true);
        if (e2 == null) {
            return -1;
        }
        return mo4477h0(e2);
    }

    /* renamed from: d1 */
    public Parcelable mo4069d1() {
        if (this.f3211D != null) {
            return new C0820d(this.f3211D);
        }
        C0820d dVar = new C0820d();
        if (mo4437J() > 0) {
            mo4061T1();
            boolean z = this.f3219v ^ this.f3221x;
            dVar.f3248h = z;
            if (z) {
                View m2 = m4124m2();
                dVar.f3247g = this.f3218u.mo4812i() - this.f3218u.mo4807d(m2);
                dVar.f3246f = mo4477h0(m2);
            } else {
                View n2 = m4125n2();
                dVar.f3246f = mo4477h0(n2);
                dVar.f3247g = this.f3218u.mo4810g(n2) - this.f3218u.mo4816m();
            }
        } else {
            dVar.mo4099b();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo4070d2(int i, int i2) {
        int i3;
        int i4;
        mo4061T1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4436I(i);
        }
        if (this.f3218u.mo4810g(mo4436I(i)) < this.f3218u.mo4816m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f3216s == 0 ? this.f3394e : this.f3395f).mo4851a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo4071e2(int i, int i2, boolean z, boolean z2) {
        mo4061T1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f3216s == 0 ? this.f3394e : this.f3395f).mo4851a(i, i2, i4, i3);
    }

    /* renamed from: g */
    public void mo4072g(String str) {
        if (this.f3211D == null) {
            super.mo4072g(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View mo4030h2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, int i, int i2, int i3) {
        mo4061T1();
        int m = this.f3218u.mo4816m();
        int i4 = this.f3218u.mo4812i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = mo4436I(i);
            int h0 = mo4477h0(I);
            if (h0 >= 0 && h0 < i3) {
                if (((RecyclerView.C0848p) I.getLayoutParams()).mo4519c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f3218u.mo4810g(I) < i4 && this.f3218u.mo4807d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    /* renamed from: k */
    public boolean mo4073k() {
        return this.f3216s == 0;
    }

    /* renamed from: l */
    public boolean mo4074l() {
        return this.f3216s == 1;
    }

    /* renamed from: o */
    public void mo4075o(int i, int i2, RecyclerView.C0823a0 a0Var, RecyclerView.C0843o.C0846c cVar) {
        if (this.f3216s != 0) {
            i = i2;
        }
        if (mo4437J() != 0 && i != 0) {
            mo4061T1();
            m4106I2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo4018N1(a0Var, this.f3217t, cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: o2 */
    public int mo4076o2(RecyclerView.C0823a0 a0Var) {
        if (a0Var.mo4280d()) {
            return this.f3218u.mo4817n();
        }
        return 0;
    }

    /* renamed from: p */
    public void mo4077p(int i, RecyclerView.C0843o.C0846c cVar) {
        boolean z;
        int i2;
        C0820d dVar = this.f3211D;
        int i3 = -1;
        if (dVar == null || !dVar.mo4098a()) {
            m4102A2();
            z = this.f3221x;
            i2 = this.f3208A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0820d dVar2 = this.f3211D;
            z = dVar2.f3248h;
            i2 = dVar2.f3246f;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f3214G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo4516a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: p2 */
    public int mo4078p2() {
        return this.f3216s;
    }

    /* renamed from: q */
    public int mo4079q(RecyclerView.C0823a0 a0Var) {
        return m4111O1(a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public boolean mo4080q2() {
        return mo4458Z() == 1;
    }

    /* renamed from: r */
    public int mo4033r(RecyclerView.C0823a0 a0Var) {
        return m4112P1(a0Var);
    }

    /* renamed from: r2 */
    public boolean mo4081r2() {
        return this.f3223z;
    }

    /* renamed from: s */
    public int mo4034s(RecyclerView.C0823a0 a0Var) {
        return m4113Q1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo4082s0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public void mo4035s2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, C0819c cVar, C0818b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo4096d(vVar);
        if (d == null) {
            bVar.f3230b = true;
            return;
        }
        RecyclerView.C0848p pVar = (RecyclerView.C0848p) d.getLayoutParams();
        if (cVar.f3244l == null) {
            if (this.f3221x == (cVar.f3238f == -1)) {
                mo4467d(d);
            } else {
                mo4469e(d, 0);
            }
        } else {
            if (this.f3221x == (cVar.f3238f == -1)) {
                mo4462b(d);
            } else {
                mo4465c(d, 0);
            }
        }
        mo4419A0(d, 0, 0);
        bVar.f3229a = this.f3218u.mo4808e(d);
        if (this.f3216s == 1) {
            if (mo4080q2()) {
                i5 = mo4491o0() - mo4472f0();
                i4 = i5 - this.f3218u.mo4809f(d);
            } else {
                i4 = mo4470e0();
                i5 = this.f3218u.mo4809f(d) + i4;
            }
            int i6 = cVar.f3238f;
            int i7 = cVar.f3234b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f3229a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f3229a + i7;
            }
        } else {
            int g0 = mo4474g0();
            int f = this.f3218u.mo4809f(d) + g0;
            int i8 = cVar.f3238f;
            int i9 = cVar.f3234b;
            if (i8 == -1) {
                i2 = i9;
                i3 = g0;
                i = f;
                i4 = i9 - bVar.f3229a;
            } else {
                i3 = g0;
                i2 = bVar.f3229a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo4509z0(d, i4, i3, i2, i);
        if (pVar.mo4519c() || pVar.mo4518b()) {
            bVar.f3231c = true;
        }
        bVar.f3232d = d.hasFocusable();
    }

    /* renamed from: t */
    public int mo4083t(RecyclerView.C0823a0 a0Var) {
        return m4111O1(a0Var);
    }

    /* renamed from: u */
    public int mo4036u(RecyclerView.C0823a0 a0Var) {
        return m4112P1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u2 */
    public void mo4037u2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, C0817a aVar, int i) {
    }

    /* renamed from: v */
    public int mo4038v(RecyclerView.C0823a0 a0Var) {
        return m4113Q1(a0Var);
    }

    /* renamed from: w1 */
    public int mo4039w1(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        if (this.f3216s == 1) {
            return 0;
        }
        return mo4050B2(i, vVar, a0Var);
    }

    /* renamed from: x1 */
    public void mo4084x1(int i) {
        this.f3208A = i;
        this.f3209B = Integer.MIN_VALUE;
        C0820d dVar = this.f3211D;
        if (dVar != null) {
            dVar.mo4099b();
        }
        mo4500t1();
    }

    /* renamed from: y1 */
    public int mo4040y1(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        if (this.f3216s == 0) {
            return 0;
        }
        return mo4050B2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public boolean mo4085z2() {
        return this.f3218u.mo4814k() == 0 && this.f3218u.mo4811h() == 0;
    }
}
