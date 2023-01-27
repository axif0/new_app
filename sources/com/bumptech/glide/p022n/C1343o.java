package com.bumptech.glide.p022n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.C0653m;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.C0979j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.n.o */
public class C1343o extends Fragment {

    /* renamed from: b0 */
    private final C1324a f4646b0;

    /* renamed from: c0 */
    private final C1341m f4647c0;

    /* renamed from: d0 */
    private final Set<C1343o> f4648d0;

    /* renamed from: e0 */
    private C1343o f4649e0;

    /* renamed from: f0 */
    private C0979j f4650f0;

    /* renamed from: g0 */
    private Fragment f4651g0;

    /* renamed from: com.bumptech.glide.n.o$a */
    private class C1344a implements C1341m {
        C1344a() {
        }

        /* renamed from: a */
        public Set<C0979j> mo5703a() {
            Set<C1343o> K1 = C1343o.this.mo5732K1();
            HashSet hashSet = new HashSet(K1.size());
            for (C1343o next : K1) {
                if (next.mo5734N1() != null) {
                    hashSet.add(next.mo5734N1());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C1343o.this + "}";
        }
    }

    public C1343o() {
        this(new C1324a());
    }

    @SuppressLint({"ValidFragment"})
    public C1343o(C1324a aVar) {
        this.f4647c0 = new C1344a();
        this.f4648d0 = new HashSet();
        this.f4646b0 = aVar;
    }

    /* renamed from: J1 */
    private void m6678J1(C1343o oVar) {
        this.f4648d0.add(oVar);
    }

    /* renamed from: M1 */
    private Fragment m6679M1() {
        Fragment J = mo3154J();
        return J != null ? J : this.f4651g0;
    }

    /* renamed from: P1 */
    private static C0653m m6680P1(Fragment fragment) {
        while (fragment.mo3154J() != null) {
            fragment = fragment.mo3154J();
        }
        return fragment.mo3138D();
    }

    /* renamed from: Q1 */
    private boolean m6681Q1(Fragment fragment) {
        Fragment M1 = m6679M1();
        while (true) {
            Fragment J = fragment.mo3154J();
            if (J == null) {
                return false;
            }
            if (J.equals(M1)) {
                return true;
            }
            fragment = fragment.mo3154J();
        }
    }

    /* renamed from: R1 */
    private void m6682R1(Context context, C0653m mVar) {
        m6684V1();
        C1343o j = C0963b.m5388c(context).mo5044k().mo5722j(context, mVar);
        this.f4649e0 = j;
        if (!equals(j)) {
            this.f4649e0.m6678J1(this);
        }
    }

    /* renamed from: S1 */
    private void m6683S1(C1343o oVar) {
        this.f4648d0.remove(oVar);
    }

    /* renamed from: V1 */
    private void m6684V1() {
        C1343o oVar = this.f4649e0;
        if (oVar != null) {
            oVar.m6683S1(this);
            this.f4649e0 = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public Set<C1343o> mo5732K1() {
        C1343o oVar = this.f4649e0;
        if (oVar == null) {
            return Collections.emptySet();
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.f4648d0);
        }
        HashSet hashSet = new HashSet();
        for (C1343o next : this.f4649e0.mo5732K1()) {
            if (m6681Q1(next.m6679M1())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public C1324a mo5733L1() {
        return this.f4646b0;
    }

    /* renamed from: M0 */
    public void mo3159M0() {
        super.mo3159M0();
        this.f4646b0.mo5698d();
    }

    /* renamed from: N0 */
    public void mo3161N0() {
        super.mo3161N0();
        this.f4646b0.mo5699e();
    }

    /* renamed from: N1 */
    public C0979j mo5734N1() {
        return this.f4650f0;
    }

    /* renamed from: O1 */
    public C1341m mo5735O1() {
        return this.f4647c0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void mo5736T1(Fragment fragment) {
        C0653m P1;
        this.f4651g0 = fragment;
        if (fragment != null && fragment.mo3242y() != null && (P1 = m6680P1(fragment)) != null) {
            m6682R1(fragment.mo3242y(), P1);
        }
    }

    /* renamed from: U1 */
    public void mo5737U1(C0979j jVar) {
        this.f4650f0 = jVar;
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        C0653m P1 = m6680P1(this);
        if (P1 != null) {
            try {
                m6682R1(mo3242y(), P1);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public String toString() {
        return super.toString() + "{parent=" + m6679M1() + "}";
    }

    /* renamed from: u0 */
    public void mo3232u0() {
        super.mo3232u0();
        this.f4646b0.mo5697c();
        m6684V1();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f4651g0 = null;
        m6684V1();
    }
}
