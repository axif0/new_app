package com.bumptech.glide.load.p012p;

import com.bumptech.glide.p029s.C1398g;
import com.bumptech.glide.p029s.C1402k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.p.m */
public class C1185m<A, B> {

    /* renamed from: a */
    private final C1398g<C1187b<A>, B> f4355a;

    /* renamed from: com.bumptech.glide.load.p.m$a */
    class C1186a extends C1398g<C1187b<A>, B> {
        C1186a(C1185m mVar, long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo5292j(C1187b<A> bVar, B b) {
            bVar.mo5501c();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.m$b */
    static final class C1187b<A> {

        /* renamed from: d */
        private static final Queue<C1187b<?>> f4356d = C1402k.m6978e(0);

        /* renamed from: a */
        private int f4357a;

        /* renamed from: b */
        private int f4358b;

        /* renamed from: c */
        private A f4359c;

        private C1187b() {
        }

        /* renamed from: a */
        static <A> C1187b<A> m6146a(A a, int i, int i2) {
            C1187b<A> poll;
            synchronized (f4356d) {
                poll = f4356d.poll();
            }
            if (poll == null) {
                poll = new C1187b<>();
            }
            poll.m6147b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        private void m6147b(A a, int i, int i2) {
            this.f4359c = a;
            this.f4358b = i;
            this.f4357a = i2;
        }

        /* renamed from: c */
        public void mo5501c() {
            synchronized (f4356d) {
                f4356d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1187b)) {
                return false;
            }
            C1187b bVar = (C1187b) obj;
            return this.f4358b == bVar.f4358b && this.f4357a == bVar.f4357a && this.f4359c.equals(bVar.f4359c);
        }

        public int hashCode() {
            return (((this.f4357a * 31) + this.f4358b) * 31) + this.f4359c.hashCode();
        }
    }

    public C1185m(long j) {
        this.f4355a = new C1186a(this, j);
    }

    /* renamed from: a */
    public B mo5498a(A a, int i, int i2) {
        C1187b a2 = C1187b.m6146a(a, i, i2);
        B g = this.f4355a.mo5890g(a2);
        a2.mo5501c();
        return g;
    }

    /* renamed from: b */
    public void mo5499b(A a, int i, int i2, B b) {
        this.f4355a.mo5892k(C1187b.m6146a(a, i, i2), b);
    }
}
