package com.bumptech.glide.load.p008o;

import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.p030l.C1404a;
import com.bumptech.glide.p029s.p030l.C1413c;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.o.u */
final class C1139u<Z> implements C1141v<Z>, C1404a.C1410f {

    /* renamed from: j */
    private static final C3346e<C1139u<?>> f4284j = C1404a.m6996d(20, new C1140a());

    /* renamed from: f */
    private final C1413c f4285f = C1413c.m7013a();

    /* renamed from: g */
    private C1141v<Z> f4286g;

    /* renamed from: h */
    private boolean f4287h;

    /* renamed from: i */
    private boolean f4288i;

    /* renamed from: com.bumptech.glide.load.o.u$a */
    class C1140a implements C1404a.C1408d<C1139u<?>> {
        C1140a() {
        }

        /* renamed from: b */
        public C1139u<?> mo5304a() {
            return new C1139u<>();
        }
    }

    C1139u() {
    }

    /* renamed from: a */
    private void m6014a(C1141v<Z> vVar) {
        this.f4288i = false;
        this.f4287h = true;
        this.f4286g = vVar;
    }

    /* renamed from: e */
    static <Z> C1139u<Z> m6015e(C1141v<Z> vVar) {
        C1139u<Z> b = f4284j.mo5909b();
        C1401j.m6972d(b);
        C1139u<Z> uVar = b;
        uVar.m6014a(vVar);
        return uVar;
    }

    /* renamed from: f */
    private void m6016f() {
        this.f4286g = null;
        f4284j.mo5908a(this);
    }

    /* renamed from: b */
    public int mo5420b() {
        return this.f4286g.mo5420b();
    }

    /* renamed from: c */
    public Class<Z> mo5421c() {
        return this.f4286g.mo5421c();
    }

    /* renamed from: d */
    public synchronized void mo5422d() {
        this.f4285f.mo5911c();
        this.f4288i = true;
        if (!this.f4287h) {
            this.f4286g.mo5422d();
            m6016f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo5448g() {
        this.f4285f.mo5911c();
        if (this.f4287h) {
            this.f4287h = false;
            if (this.f4288i) {
                mo5422d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.f4286g.get();
    }

    /* renamed from: i */
    public C1413c mo5306i() {
        return this.f4285f;
    }
}
