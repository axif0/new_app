package p048d.p049a.p050a.p051a.p067n.p068a;

import androidx.recyclerview.widget.RecyclerView;
import p340io.realm.C5657f0;
import p340io.realm.C5771n0;

/* renamed from: d.a.a.a.n.a.d */
public abstract class C2992d<T extends C5771n0> extends RecyclerView.C0832g {

    /* renamed from: h */
    private C5657f0<T> f9546h;

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public T mo10331B(int i) {
        return (C5771n0) this.f9546h.getItem(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C5657f0<T> mo10332C() {
        return this.f9546h;
    }

    /* renamed from: D */
    public void mo10333D(C5657f0<T> f0Var) {
        this.f9546h = f0Var;
    }
}
