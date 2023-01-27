package p148g.p189d.p190a.p200b.p204k0.p210t;

import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.g */
public final class C4007g implements C4008h {

    /* renamed from: a */
    private final List<C4031w.C4032a> f12508a;

    /* renamed from: b */
    private final C3927n[] f12509b;

    /* renamed from: c */
    private boolean f12510c;

    /* renamed from: d */
    private int f12511d;

    /* renamed from: e */
    private int f12512e;

    /* renamed from: f */
    private long f12513f;

    public C4007g(List<C4031w.C4032a> list) {
        this.f12508a = list;
        this.f12509b = new C3927n[list.size()];
    }

    /* renamed from: b */
    private boolean m16888b(C4274m mVar, int i) {
        if (mVar.mo13456a() == 0) {
            return false;
        }
        if (mVar.mo13479x() != i) {
            this.f12510c = false;
        }
        this.f12511d--;
        return this.f12510c;
    }

    /* renamed from: a */
    public void mo12847a() {
        this.f12510c = false;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        if (!this.f12510c) {
            return;
        }
        if (this.f12511d != 2 || m16888b(mVar, 32)) {
            if (this.f12511d != 1 || m16888b(mVar, 0)) {
                int c = mVar.mo13458c();
                int a = mVar.mo13456a();
                for (C3927n a2 : this.f12509b) {
                    mVar.mo13454J(c);
                    a2.mo12734a(mVar, a);
                }
                this.f12512e += a;
            }
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        if (z) {
            this.f12510c = true;
            this.f12513f = j;
            this.f12512e = 0;
            this.f12511d = 2;
        }
    }

    /* renamed from: e */
    public void mo12850e() {
        if (this.f12510c) {
            for (C3927n c : this.f12509b) {
                c.mo12736c(this.f12513f, 1, this.f12512e, 0, (C3927n.C3928a) null);
            }
            this.f12510c = false;
        }
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        for (int i = 0; i < this.f12509b.length; i++) {
            C4031w.C4032a aVar = this.f12508a.get(i);
            dVar.mo12886a();
            C3927n m = gVar.mo12745m(dVar.mo12888c(), 3);
            m.mo12737d(C4109n.m17339i(dVar.mo12887b(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.f12712b), aVar.f12711a, (C3900a) null));
            this.f12509b[i] = m;
        }
    }
}
