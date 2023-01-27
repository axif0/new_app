package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.p029s.C1401j;

/* renamed from: com.bumptech.glide.load.o.p */
class C1132p<Z> implements C1141v<Z> {

    /* renamed from: f */
    private final boolean f4264f;

    /* renamed from: g */
    private final boolean f4265g;

    /* renamed from: h */
    private final C1141v<Z> f4266h;

    /* renamed from: i */
    private final C1133a f4267i;

    /* renamed from: j */
    private final C0998g f4268j;

    /* renamed from: k */
    private int f4269k;

    /* renamed from: l */
    private boolean f4270l;

    /* renamed from: com.bumptech.glide.load.o.p$a */
    interface C1133a {
        /* renamed from: d */
        void mo5384d(C0998g gVar, C1132p<?> pVar);
    }

    C1132p(C1141v<Z> vVar, boolean z, boolean z2, C0998g gVar, C1133a aVar) {
        C1401j.m6972d(vVar);
        this.f4266h = vVar;
        this.f4264f = z;
        this.f4265g = z2;
        this.f4268j = gVar;
        C1401j.m6972d(aVar);
        this.f4267i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo5419a() {
        if (!this.f4270l) {
            this.f4269k++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: b */
    public int mo5420b() {
        return this.f4266h.mo5420b();
    }

    /* renamed from: c */
    public Class<Z> mo5421c() {
        return this.f4266h.mo5421c();
    }

    /* renamed from: d */
    public synchronized void mo5422d() {
        if (this.f4269k > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f4270l) {
            this.f4270l = true;
            if (this.f4265g) {
                this.f4266h.mo5422d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1141v<Z> mo5423e() {
        return this.f4266h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo5424f() {
        return this.f4264f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5425g() {
        boolean z;
        synchronized (this) {
            if (this.f4269k > 0) {
                z = true;
                int i = this.f4269k - 1;
                this.f4269k = i;
                if (i != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f4267i.mo5384d(this.f4268j, this);
        }
    }

    public Z get() {
        return this.f4266h.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4264f + ", listener=" + this.f4267i + ", key=" + this.f4268j + ", acquired=" + this.f4269k + ", isRecycled=" + this.f4270l + ", resource=" + this.f4266h + '}';
    }
}
