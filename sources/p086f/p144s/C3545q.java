package p086f.p144s;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p086f.p144s.C3532m;

/* renamed from: f.s.q */
public class C3545q extends C3532m {

    /* renamed from: O */
    private ArrayList<C3532m> f11032O = new ArrayList<>();

    /* renamed from: P */
    private boolean f11033P = true;

    /* renamed from: Q */
    int f11034Q;

    /* renamed from: R */
    boolean f11035R = false;

    /* renamed from: S */
    private int f11036S = 0;

    /* renamed from: f.s.q$a */
    class C3546a extends C3540n {

        /* renamed from: a */
        final /* synthetic */ C3532m f11037a;

        C3546a(C3545q qVar, C3532m mVar) {
            this.f11037a = mVar;
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            this.f11037a.mo11966c0();
            mVar.mo11961Y(this);
        }
    }

    /* renamed from: f.s.q$b */
    static class C3547b extends C3540n {

        /* renamed from: a */
        C3545q f11038a;

        C3547b(C3545q qVar) {
            this.f11038a = qVar;
        }

        /* renamed from: a */
        public void mo11925a(C3532m mVar) {
            C3545q qVar = this.f11038a;
            if (!qVar.f11035R) {
                qVar.mo11976j0();
                this.f11038a.f11035R = true;
            }
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            C3545q qVar = this.f11038a;
            int i = qVar.f11034Q - 1;
            qVar.f11034Q = i;
            if (i == 0) {
                qVar.f11035R = false;
                qVar.mo11983t();
            }
            mVar.mo11961Y(this);
        }
    }

    /* renamed from: o0 */
    private void m15206o0(C3532m mVar) {
        this.f11032O.add(mVar);
        mVar.f11013w = this;
    }

    /* renamed from: x0 */
    private void m15207x0() {
        C3547b bVar = new C3547b(this);
        Iterator<C3532m> it = this.f11032O.iterator();
        while (it.hasNext()) {
            it.next().mo11964b(bVar);
        }
        this.f11034Q = this.f11032O.size();
    }

    /* renamed from: V */
    public void mo11959V(View view) {
        super.mo11959V(view);
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            this.f11032O.get(i).mo11959V(view);
        }
    }

    /* renamed from: a0 */
    public void mo11963a0(View view) {
        super.mo11963a0(view);
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            this.f11032O.get(i).mo11963a0(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo11966c0() {
        if (this.f11032O.isEmpty()) {
            mo11976j0();
            mo11983t();
            return;
        }
        m15207x0();
        if (!this.f11033P) {
            for (int i = 1; i < this.f11032O.size(); i++) {
                this.f11032O.get(i - 1).mo11964b(new C3546a(this, this.f11032O.get(i)));
            }
            C3532m mVar = this.f11032O.get(0);
            if (mVar != null) {
                mVar.mo11966c0();
                return;
            }
            return;
        }
        Iterator<C3532m> it = this.f11032O.iterator();
        while (it.hasNext()) {
            it.next().mo11966c0();
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            this.f11032O.get(i).cancel();
        }
    }

    /* renamed from: d0 */
    public /* bridge */ /* synthetic */ C3532m mo11969d0(long j) {
        mo12006t0(j);
        return this;
    }

    /* renamed from: e0 */
    public void mo11970e0(C3532m.C3537e eVar) {
        super.mo11970e0(eVar);
        this.f11036S |= 8;
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            this.f11032O.get(i).mo11970e0(eVar);
        }
    }

    /* renamed from: g */
    public void mo11873g(C3549s sVar) {
        if (mo11958M(sVar.f11043b)) {
            Iterator<C3532m> it = this.f11032O.iterator();
            while (it.hasNext()) {
                C3532m next = it.next();
                if (next.mo11958M(sVar.f11043b)) {
                    next.mo11873g(sVar);
                    sVar.f11044c.add(next);
                }
            }
        }
    }

    /* renamed from: g0 */
    public void mo11973g0(C3517g gVar) {
        super.mo11973g0(gVar);
        this.f11036S |= 4;
        if (this.f11032O != null) {
            for (int i = 0; i < this.f11032O.size(); i++) {
                this.f11032O.get(i).mo11973g0(gVar);
            }
        }
    }

    /* renamed from: h0 */
    public void mo11974h0(C3544p pVar) {
        super.mo11974h0(pVar);
        this.f11036S |= 2;
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            this.f11032O.get(i).mo11974h0(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo11977k(C3549s sVar) {
        super.mo11977k(sVar);
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            this.f11032O.get(i).mo11977k(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public String mo11978k0(String str) {
        String k0 = super.mo11978k0(str);
        for (int i = 0; i < this.f11032O.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(k0);
            sb.append("\n");
            sb.append(this.f11032O.get(i).mo11978k0(str + "  "));
            k0 = sb.toString();
        }
        return k0;
    }

    /* renamed from: l */
    public void mo11874l(C3549s sVar) {
        if (mo11958M(sVar.f11043b)) {
            Iterator<C3532m> it = this.f11032O.iterator();
            while (it.hasNext()) {
                C3532m next = it.next();
                if (next.mo11958M(sVar.f11043b)) {
                    next.mo11874l(sVar);
                    sVar.f11044c.add(next);
                }
            }
        }
    }

    /* renamed from: l0 */
    public C3545q mo11964b(C3532m.C3538f fVar) {
        super.mo11964b(fVar);
        return this;
    }

    /* renamed from: m0 */
    public C3545q mo11965c(View view) {
        for (int i = 0; i < this.f11032O.size(); i++) {
            this.f11032O.get(i).mo11965c(view);
        }
        super.mo11965c(view);
        return this;
    }

    /* renamed from: n0 */
    public C3545q mo12001n0(C3532m mVar) {
        m15206o0(mVar);
        long j = this.f10998h;
        if (j >= 0) {
            mVar.mo11969d0(j);
        }
        if ((this.f11036S & 1) != 0) {
            mVar.mo11972f0(mo11987x());
        }
        if ((this.f11036S & 2) != 0) {
            mVar.mo11974h0(mo11951B());
        }
        if ((this.f11036S & 4) != 0) {
            mVar.mo11973g0(mo11950A());
        }
        if ((this.f11036S & 8) != 0) {
            mVar.mo11970e0(mo11986v());
        }
        return this;
    }

    /* renamed from: p0 */
    public C3532m mo12002p0(int i) {
        if (i < 0 || i >= this.f11032O.size()) {
            return null;
        }
        return this.f11032O.get(i);
    }

    /* renamed from: q */
    public C3532m clone() {
        C3545q qVar = (C3545q) super.clone();
        qVar.f11032O = new ArrayList<>();
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            qVar.m15206o0(this.f11032O.get(i).clone());
        }
        return qVar;
    }

    /* renamed from: q0 */
    public int mo12003q0() {
        return this.f11032O.size();
    }

    /* renamed from: r0 */
    public C3545q mo11961Y(C3532m.C3538f fVar) {
        super.mo11961Y(fVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo11982s(ViewGroup viewGroup, C3550t tVar, C3550t tVar2, ArrayList<C3549s> arrayList, ArrayList<C3549s> arrayList2) {
        long D = mo11952D();
        int size = this.f11032O.size();
        for (int i = 0; i < size; i++) {
            C3532m mVar = this.f11032O.get(i);
            if (D > 0 && (this.f11033P || i == 0)) {
                long D2 = mVar.mo11952D();
                if (D2 > 0) {
                    mVar.mo11975i0(D2 + D);
                } else {
                    mVar.mo11975i0(D);
                }
            }
            mVar.mo11982s(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: s0 */
    public C3545q mo11962Z(View view) {
        for (int i = 0; i < this.f11032O.size(); i++) {
            this.f11032O.get(i).mo11962Z(view);
        }
        super.mo11962Z(view);
        return this;
    }

    /* renamed from: t0 */
    public C3545q mo12006t0(long j) {
        ArrayList<C3532m> arrayList;
        super.mo11969d0(j);
        if (this.f10998h >= 0 && (arrayList = this.f11032O) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f11032O.get(i).mo11969d0(j);
            }
        }
        return this;
    }

    /* renamed from: u0 */
    public C3545q mo11972f0(TimeInterpolator timeInterpolator) {
        this.f11036S |= 1;
        ArrayList<C3532m> arrayList = this.f11032O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f11032O.get(i).mo11972f0(timeInterpolator);
            }
        }
        super.mo11972f0(timeInterpolator);
        return this;
    }

    /* renamed from: v0 */
    public C3545q mo12008v0(int i) {
        if (i == 0) {
            this.f11033P = true;
        } else if (i == 1) {
            this.f11033P = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: w0 */
    public C3545q mo11975i0(long j) {
        super.mo11975i0(j);
        return this;
    }
}
