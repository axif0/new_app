package p148g.p325e.p326a;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p148g.p325e.p327b.C5590c;
import p148g.p325e.p328c.p329b.C5593a;

/* renamed from: g.e.a.i */
public final class C5560i extends C5580m {

    /* renamed from: I */
    private static final Map<String, C5590c> f16072I;

    /* renamed from: F */
    private Object f16073F;

    /* renamed from: G */
    private String f16074G;

    /* renamed from: H */
    private C5590c f16075H;

    static {
        HashMap hashMap = new HashMap();
        f16072I = hashMap;
        hashMap.put("alpha", C5561j.f16076a);
        f16072I.put("pivotX", C5561j.f16077b);
        f16072I.put("pivotY", C5561j.f16078c);
        f16072I.put("translationX", C5561j.f16079d);
        f16072I.put("translationY", C5561j.f16080e);
        f16072I.put("rotation", C5561j.f16081f);
        f16072I.put("rotationX", C5561j.f16082g);
        f16072I.put("rotationY", C5561j.f16083h);
        f16072I.put("scaleX", C5561j.f16084i);
        f16072I.put("scaleY", C5561j.f16085j);
        f16072I.put("scrollX", C5561j.f16086k);
        f16072I.put("scrollY", C5561j.f16087l);
        f16072I.put("x", C5561j.f16088m);
        f16072I.put("y", C5561j.f16089n);
    }

    public C5560i() {
    }

    private <T> C5560i(T t, C5590c<T, ?> cVar) {
        this.f16073F = t;
        mo16001U(cVar);
    }

    private C5560i(Object obj, String str) {
        this.f16073F = obj;
        mo16002V(str);
    }

    /* renamed from: P */
    public static <T> C5560i m22976P(T t, C5590c<T, Float> cVar, float... fArr) {
        C5560i iVar = new C5560i(t, cVar);
        iVar.mo15998K(fArr);
        return iVar;
    }

    /* renamed from: R */
    public static C5560i m22977R(Object obj, String str, float... fArr) {
        C5560i iVar = new C5560i(obj, str);
        iVar.mo15998K(fArr);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo15996E() {
        if (!this.f16126o) {
            if (this.f16075H == null && C5593a.f16136v && (this.f16073F instanceof View) && f16072I.containsKey(this.f16074G)) {
                mo16001U(f16072I.get(this.f16074G));
            }
            for (C5576k v : this.f16133v) {
                v.mo16046v(this.f16073F);
            }
            super.mo15996E();
        }
    }

    /* renamed from: I */
    public /* bridge */ /* synthetic */ C5580m mo15997I(long j) {
        mo16000T(j);
        return this;
    }

    /* renamed from: K */
    public void mo15998K(float... fArr) {
        C5576k[] kVarArr = this.f16133v;
        if (kVarArr == null || kVarArr.length == 0) {
            C5590c cVar = this.f16075H;
            if (cVar != null) {
                mo16051L(C5576k.m23044k(cVar, fArr));
                return;
            }
            mo16051L(C5576k.m23045l(this.f16074G, fArr));
            return;
        }
        super.mo15998K(fArr);
    }

    /* renamed from: O */
    public C5560i clone() {
        return (C5560i) super.clone();
    }

    /* renamed from: T */
    public C5560i mo16000T(long j) {
        super.mo15964f(j);
        return this;
    }

    /* renamed from: U */
    public void mo16001U(C5590c cVar) {
        C5576k[] kVarArr = this.f16133v;
        if (kVarArr != null) {
            C5576k kVar = kVarArr[0];
            String g = kVar.mo16037g();
            kVar.mo16042r(cVar);
            this.f16134w.remove(g);
            this.f16134w.put(this.f16074G, kVar);
        }
        if (this.f16075H != null) {
            this.f16074G = cVar.mo16068b();
        }
        this.f16075H = cVar;
        this.f16126o = false;
    }

    /* renamed from: V */
    public void mo16002V(String str) {
        C5576k[] kVarArr = this.f16133v;
        if (kVarArr != null) {
            C5576k kVar = kVarArr[0];
            String g = kVar.mo16037g();
            kVar.mo16043s(str);
            this.f16134w.remove(g);
            this.f16134w.put(str, kVar);
        }
        this.f16074G = str;
        this.f16126o = false;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ C5544a mo15964f(long j) {
        mo16000T(j);
        return this;
    }

    /* renamed from: i */
    public void mo15966i() {
        super.mo15966i();
    }

    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f16073F;
        if (this.f16133v != null) {
            for (int i = 0; i < this.f16133v.length; i++) {
                str = str + "\n    " + this.f16133v[i].toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo16004y(float f) {
        super.mo16004y(f);
        for (C5576k n : this.f16133v) {
            n.mo16039n(this.f16073F);
        }
    }
}
