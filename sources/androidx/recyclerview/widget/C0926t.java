package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p086f.p102e.C3195d;
import p086f.p102e.C3203g;
import p086f.p111h.p121l.C3346e;
import p086f.p111h.p121l.C3347f;

/* renamed from: androidx.recyclerview.widget.t */
class C0926t {

    /* renamed from: a */
    final C3203g<RecyclerView.C0829d0, C0927a> f3692a = new C3203g<>();

    /* renamed from: b */
    final C3195d<RecyclerView.C0829d0> f3693b = new C3195d<>();

    /* renamed from: androidx.recyclerview.widget.t$a */
    static class C0927a {

        /* renamed from: d */
        static C3346e<C0927a> f3694d = new C3347f(20);

        /* renamed from: a */
        int f3695a;

        /* renamed from: b */
        RecyclerView.C0837l.C0840c f3696b;

        /* renamed from: c */
        RecyclerView.C0837l.C0840c f3697c;

        private C0927a() {
        }

        /* renamed from: a */
        static void m5210a() {
            do {
            } while (f3694d.mo5909b() != null);
        }

        /* renamed from: b */
        static C0927a m5211b() {
            C0927a b = f3694d.mo5909b();
            return b == null ? new C0927a() : b;
        }

        /* renamed from: c */
        static void m5212c(C0927a aVar) {
            aVar.f3695a = 0;
            aVar.f3696b = null;
            aVar.f3697c = null;
            f3694d.mo5908a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.t$b */
    interface C0928b {
        /* renamed from: a */
        void mo4293a(RecyclerView.C0829d0 d0Var);

        /* renamed from: b */
        void mo4294b(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar, RecyclerView.C0837l.C0840c cVar2);

        /* renamed from: c */
        void mo4295c(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar, RecyclerView.C0837l.C0840c cVar2);

        /* renamed from: d */
        void mo4296d(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar, RecyclerView.C0837l.C0840c cVar2);
    }

    C0926t() {
    }

    /* renamed from: l */
    private RecyclerView.C0837l.C0840c m5193l(RecyclerView.C0829d0 d0Var, int i) {
        C0927a m;
        RecyclerView.C0837l.C0840c cVar;
        int f = this.f3692a.mo11134f(d0Var);
        if (f >= 0 && (m = this.f3692a.mo11141m(f)) != null) {
            int i2 = m.f3695a;
            if ((i2 & i) != 0) {
                m.f3695a = (i ^ -1) & i2;
                if (i == 4) {
                    cVar = m.f3696b;
                } else if (i == 8) {
                    cVar = m.f3697c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((m.f3695a & 12) == 0) {
                    this.f3692a.mo5868k(f);
                    C0927a.m5212c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4858a(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar) {
        C0927a aVar = this.f3692a.get(d0Var);
        if (aVar == null) {
            aVar = C0927a.m5211b();
            this.f3692a.put(d0Var, aVar);
        }
        aVar.f3695a |= 2;
        aVar.f3696b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4859b(RecyclerView.C0829d0 d0Var) {
        C0927a aVar = this.f3692a.get(d0Var);
        if (aVar == null) {
            aVar = C0927a.m5211b();
            this.f3692a.put(d0Var, aVar);
        }
        aVar.f3695a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4860c(long j, RecyclerView.C0829d0 d0Var) {
        this.f3693b.mo11054l(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4861d(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar) {
        C0927a aVar = this.f3692a.get(d0Var);
        if (aVar == null) {
            aVar = C0927a.m5211b();
            this.f3692a.put(d0Var, aVar);
        }
        aVar.f3697c = cVar;
        aVar.f3695a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4862e(RecyclerView.C0829d0 d0Var, RecyclerView.C0837l.C0840c cVar) {
        C0927a aVar = this.f3692a.get(d0Var);
        if (aVar == null) {
            aVar = C0927a.m5211b();
            this.f3692a.put(d0Var, aVar);
        }
        aVar.f3696b = cVar;
        aVar.f3695a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4863f() {
        this.f3692a.clear();
        this.f3693b.mo11047c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C0829d0 mo4864g(long j) {
        return this.f3693b.mo11050f(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo4865h(RecyclerView.C0829d0 d0Var) {
        C0927a aVar = this.f3692a.get(d0Var);
        return (aVar == null || (aVar.f3695a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo4866i(RecyclerView.C0829d0 d0Var) {
        C0927a aVar = this.f3692a.get(d0Var);
        return (aVar == null || (aVar.f3695a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4867j() {
        C0927a.m5210a();
    }

    /* renamed from: k */
    public void mo4868k(RecyclerView.C0829d0 d0Var) {
        mo4872p(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C0837l.C0840c mo4869m(RecyclerView.C0829d0 d0Var) {
        return m5193l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C0837l.C0840c mo4870n(RecyclerView.C0829d0 d0Var) {
        return m5193l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4871o(C0928b bVar) {
        RecyclerView.C0837l.C0840c cVar;
        RecyclerView.C0837l.C0840c cVar2;
        for (int size = this.f3692a.size() - 1; size >= 0; size--) {
            RecyclerView.C0829d0 i = this.f3692a.mo11139i(size);
            C0927a k = this.f3692a.mo5868k(size);
            int i2 = k.f3695a;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.f3696b;
                    if (cVar != null) {
                        cVar2 = k.f3697c;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.mo4296d(i, k.f3696b, k.f3697c);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.f3696b;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        C0927a.m5212c(k);
                    }
                    bVar.mo4294b(i, k.f3696b, k.f3697c);
                    C0927a.m5212c(k);
                }
                bVar.mo4295c(i, cVar, cVar2);
                C0927a.m5212c(k);
            }
            bVar.mo4293a(i);
            C0927a.m5212c(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4872p(RecyclerView.C0829d0 d0Var) {
        C0927a aVar = this.f3692a.get(d0Var);
        if (aVar != null) {
            aVar.f3695a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4873q(RecyclerView.C0829d0 d0Var) {
        int q = this.f3693b.mo11057q() - 1;
        while (true) {
            if (q < 0) {
                break;
            } else if (d0Var == this.f3693b.mo11058r(q)) {
                this.f3693b.mo11056p(q);
                break;
            } else {
                q--;
            }
        }
        C0927a remove = this.f3692a.remove(d0Var);
        if (remove != null) {
            C0927a.m5212c(remove);
        }
    }
}
