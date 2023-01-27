package androidx.lifecycle;

import androidx.lifecycle.C0710e;
import java.util.Map;
import p086f.p095b.p096a.p097a.C3168a;
import p086f.p095b.p096a.p098b.C3173b;

public abstract class LiveData<T> {

    /* renamed from: i */
    static final Object f2928i = new Object();

    /* renamed from: a */
    final Object f2929a = new Object();

    /* renamed from: b */
    private C3173b<C0725o<? super T>, LiveData<T>.C0000a> f2930b = new C3173b<>();

    /* renamed from: c */
    int f2931c = 0;

    /* renamed from: d */
    private volatile Object f2932d = f2928i;

    /* renamed from: e */
    volatile Object f2933e = f2928i;

    /* renamed from: f */
    private int f2934f = -1;

    /* renamed from: g */
    private boolean f2935g;

    /* renamed from: h */
    private boolean f2936h;

    class LifecycleBoundObserver extends LiveData<T>.C0000a implements C0715g {

        /* renamed from: e */
        final C0717i f2937e;

        LifecycleBoundObserver(C0717i iVar, C0725o<? super T> oVar) {
            super(oVar);
            this.f2937e = iVar;
        }

        /* renamed from: d */
        public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
            if (this.f2937e.mo720a().mo3668b() == C0710e.C0712b.DESTROYED) {
                LiveData.this.mo3632g(this.f2939a);
            } else {
                mo3637h(mo3636k());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3634i() {
            this.f2937e.mo720a().mo3669c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3635j(C0717i iVar) {
            return this.f2937e == iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3636k() {
            return this.f2937e.mo720a().mo3668b().mo3670e(C0710e.C0712b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    private abstract class C0701a {

        /* renamed from: a */
        final C0725o<? super T> f2939a;

        /* renamed from: b */
        boolean f2940b;

        /* renamed from: c */
        int f2941c = -1;

        C0701a(C0725o<? super T> oVar) {
            this.f2939a = oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3637h(boolean z) {
            if (z != this.f2940b) {
                this.f2940b = z;
                int i = 1;
                boolean z2 = LiveData.this.f2931c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f2931c;
                if (!this.f2940b) {
                    i = -1;
                }
                liveData.f2931c = i2 + i;
                if (z2 && this.f2940b) {
                    LiveData.this.mo3630e();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f2931c == 0 && !this.f2940b) {
                    liveData2.mo3631f();
                }
                if (this.f2940b) {
                    LiveData.this.mo3628c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3634i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3635j(C0717i iVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public abstract boolean mo3636k();
    }

    /* renamed from: a */
    static void m3564a(String str) {
        if (!C3168a.m13562b().mo10972a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: b */
    private void m3565b(LiveData<T>.C0000a aVar) {
        if (aVar.f2940b) {
            if (!aVar.mo3636k()) {
                aVar.mo3637h(false);
                return;
            }
            int i = aVar.f2941c;
            int i2 = this.f2934f;
            if (i < i2) {
                aVar.f2941c = i2;
                aVar.f2939a.mo3675a(this.f2932d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3628c(LiveData<T>.C0000a aVar) {
        if (this.f2935g) {
            this.f2936h = true;
            return;
        }
        this.f2935g = true;
        do {
            this.f2936h = false;
            if (aVar == null) {
                C3173b<K, V>.d h = this.f2930b.mo10982h();
                while (h.hasNext()) {
                    m3565b((C0701a) ((Map.Entry) h.next()).getValue());
                    if (this.f2936h) {
                        break;
                    }
                }
            } else {
                m3565b(aVar);
                aVar = null;
            }
        } while (this.f2936h);
        this.f2935g = false;
    }

    /* renamed from: d */
    public void mo3629d(C0717i iVar, C0725o<? super T> oVar) {
        m3564a("observe");
        if (iVar.mo720a().mo3668b() != C0710e.C0712b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, oVar);
            C0701a m = this.f2930b.mo10976m(oVar, lifecycleBoundObserver);
            if (m != null && !m.mo3635j(iVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (m == null) {
                iVar.mo720a().mo3667a(lifecycleBoundObserver);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3630e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3631f() {
    }

    /* renamed from: g */
    public void mo3632g(C0725o<? super T> oVar) {
        m3564a("removeObserver");
        C0701a o = this.f2930b.mo10977o(oVar);
        if (o != null) {
            o.mo3634i();
            o.mo3637h(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo3633h(T t) {
        m3564a("setValue");
        this.f2934f++;
        this.f2932d = t;
        mo3628c((LiveData<T>.C0000a) null);
    }
}
