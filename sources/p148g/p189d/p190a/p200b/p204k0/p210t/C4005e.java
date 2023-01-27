package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.e */
public final class C4005e implements C4031w.C4034c {

    /* renamed from: a */
    private final int f12495a;

    /* renamed from: b */
    private final List<C4109n> f12496b;

    public C4005e(int i) {
        this(i, Collections.emptyList());
    }

    public C4005e(int i, List<C4109n> list) {
        this.f12495a = i;
        if (!m16877d(32) && list.isEmpty()) {
            list = Collections.singletonList(C4109n.m17342l((String) null, "application/cea-608", 0, (String) null));
        }
        this.f12496b = list;
    }

    /* renamed from: c */
    private C4026t m16876c(C4031w.C4033b bVar) {
        int i;
        String str;
        if (m16877d(32)) {
            return new C4026t(this.f12496b);
        }
        C4274m mVar = new C4274m(bVar.f12716d);
        List<C4109n> list = this.f12496b;
        while (mVar.mo13456a() > 0) {
            int x = mVar.mo13479x();
            int c = mVar.mo13458c() + mVar.mo13479x();
            if (x == 134) {
                list = new ArrayList<>();
                int x2 = mVar.mo13479x() & 31;
                for (int i2 = 0; i2 < x2; i2++) {
                    String u = mVar.mo13476u(3);
                    int x3 = mVar.mo13479x();
                    if ((x3 & 128) != 0) {
                        i = x3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    list.add(C4109n.m17344n((String) null, str, (String) null, -1, 0, u, i, (C3900a) null));
                    mVar.mo13455K(2);
                }
            }
            mVar.mo13454J(c);
        }
        return new C4026t(list);
    }

    /* renamed from: d */
    private boolean m16877d(int i) {
        return (i & this.f12495a) != 0;
    }

    /* renamed from: a */
    public SparseArray<C4031w> mo12852a() {
        return new SparseArray<>();
    }

    /* renamed from: b */
    public C4031w mo12853b(int i, C4031w.C4033b bVar) {
        if (i == 2) {
            return new C4021p(new C4009i());
        }
        if (i == 3 || i == 4) {
            return new C4021p(new C4019n(bVar.f12714b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new C4021p(new C4017l());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new C4021p(new C4015k(m16876c(bVar)));
                    }
                    if (i == 89) {
                        return new C4021p(new C4007g(bVar.f12715c));
                    }
                    if (i != 138) {
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (m16877d(16)) {
                                    return null;
                                } else {
                                    return new C4025s(new C4027u());
                                }
                            }
                        }
                        return new C4021p(new C4002b(bVar.f12714b));
                    }
                    return new C4021p(new C4006f(bVar.f12714b));
                } else if (m16877d(4)) {
                    return null;
                } else {
                    return new C4021p(new C4011j(m16876c(bVar), m16877d(1), m16877d(8)));
                }
            } else if (m16877d(2)) {
                return null;
            } else {
                return new C4021p(new C4018m(bVar.f12714b));
            }
        } else if (m16877d(2)) {
            return null;
        } else {
            return new C4021p(new C4004d(false, bVar.f12714b));
        }
    }
}
