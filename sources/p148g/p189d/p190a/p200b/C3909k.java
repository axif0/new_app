package p148g.p189d.p190a.p200b;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p148g.p189d.p190a.p200b.C3844g0;
import p148g.p189d.p190a.p200b.C4317y;
import p148g.p189d.p190a.p200b.C4322z;
import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p217n0.C4146n;
import p148g.p189d.p190a.p200b.p228p0.C4229e;
import p148g.p189d.p190a.p200b.p228p0.C4231f;
import p148g.p189d.p190a.p200b.p228p0.C4232g;
import p148g.p189d.p190a.p200b.p228p0.C4234h;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4261b;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k */
final class C3909k implements C3888i {

    /* renamed from: a */
    private final C3829a0[] f11852a;

    /* renamed from: b */
    private final C4232g f11853b;

    /* renamed from: c */
    private final C4234h f11854c;

    /* renamed from: d */
    private final Handler f11855d;

    /* renamed from: e */
    private final C4040l f11856e;

    /* renamed from: f */
    private final Handler f11857f;

    /* renamed from: g */
    private final CopyOnWriteArraySet<C4317y.C4319b> f11858g;

    /* renamed from: h */
    private final C3844g0.C3847c f11859h;

    /* renamed from: i */
    private final C3844g0.C3846b f11860i;

    /* renamed from: j */
    private boolean f11861j;

    /* renamed from: k */
    private int f11862k;

    /* renamed from: l */
    private boolean f11863l;

    /* renamed from: m */
    private int f11864m;

    /* renamed from: n */
    private boolean f11865n;

    /* renamed from: o */
    private boolean f11866o;

    /* renamed from: p */
    private C4315w f11867p;

    /* renamed from: q */
    private C4314v f11868q;

    /* renamed from: r */
    private int f11869r;

    /* renamed from: s */
    private int f11870s;

    /* renamed from: t */
    private long f11871t;

    /* renamed from: g.d.a.b.k$a */
    class C3910a extends Handler {
        C3910a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C3909k.this.mo12713r(message);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C3909k(C3829a0[] a0VarArr, C4232g gVar, C4235q qVar, C4261b bVar) {
        C3829a0[] a0VarArr2 = a0VarArr;
        Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.7.3" + "] [" + C4284w.f13663e + "]");
        C4260a.m18074f(a0VarArr2.length > 0);
        C4260a.m18073e(a0VarArr);
        this.f11852a = a0VarArr2;
        C4260a.m18073e(gVar);
        this.f11853b = gVar;
        this.f11861j = false;
        this.f11862k = 0;
        this.f11863l = false;
        this.f11858g = new CopyOnWriteArraySet<>();
        this.f11854c = new C4234h(C4146n.f13159d, new boolean[a0VarArr2.length], new C4231f(new C4229e[a0VarArr2.length]), (Object) null, new C3833c0[a0VarArr2.length]);
        this.f11859h = new C3844g0.C3847c();
        this.f11860i = new C3844g0.C3846b();
        this.f11867p = C4315w.f13800d;
        this.f11855d = new C3910a(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f11868q = new C4314v(C3844g0.f11572a, 0, this.f11854c);
        this.f11856e = new C4040l(a0VarArr, gVar, this.f11854c, qVar, this.f11861j, this.f11862k, this.f11863l, this.f11855d, this, bVar);
        this.f11857f = new Handler(this.f11856e.mo12908p());
    }

    /* renamed from: B */
    private boolean m16383B() {
        return this.f11868q.f13790a.mo12546p() || this.f11864m > 0;
    }

    /* renamed from: E */
    private void m16384E(C4314v vVar, boolean z, int i, int i2, boolean z2) {
        C4314v vVar2 = this.f11868q;
        boolean z3 = false;
        boolean z4 = (vVar2.f13790a == vVar.f13790a && vVar2.f13791b == vVar.f13791b) ? false : true;
        boolean z5 = this.f11868q.f13795f != vVar.f13795f;
        boolean z6 = this.f11868q.f13796g != vVar.f13796g;
        if (this.f11868q.f13797h != vVar.f13797h) {
            z3 = true;
        }
        this.f11868q = vVar;
        if (z4 || i2 == 0) {
            Iterator<C4317y.C4319b> it = this.f11858g.iterator();
            while (it.hasNext()) {
                C4314v vVar3 = this.f11868q;
                it.next().mo6281g(vVar3.f13790a, vVar3.f13791b, i2);
            }
        }
        if (z) {
            Iterator<C4317y.C4319b> it2 = this.f11858g.iterator();
            while (it2.hasNext()) {
                it2.next().mo6242e(i);
            }
        }
        if (z3) {
            this.f11853b.mo13352b(this.f11868q.f13797h.f13535d);
            Iterator<C4317y.C4319b> it3 = this.f11858g.iterator();
            while (it3.hasNext()) {
                C4234h hVar = this.f11868q.f13797h;
                it3.next().mo6245o(hVar.f13532a, hVar.f13534c);
            }
        }
        if (z6) {
            Iterator<C4317y.C4319b> it4 = this.f11858g.iterator();
            while (it4.hasNext()) {
                it4.next().mo13592d(this.f11868q.f13796g);
            }
        }
        if (z5) {
            Iterator<C4317y.C4319b> it5 = this.f11858g.iterator();
            while (it5.hasNext()) {
                it5.next().mo6241c(this.f11861j, this.f11868q.f13795f);
            }
        }
        if (z2) {
            Iterator<C4317y.C4319b> it6 = this.f11858g.iterator();
            while (it6.hasNext()) {
                it6.next().mo13594j();
            }
        }
    }

    /* renamed from: c */
    private C4314v m16385c(boolean z, boolean z2, int i) {
        long j;
        if (z) {
            this.f11869r = 0;
            this.f11870s = 0;
            j = 0;
        } else {
            this.f11869r = mo12467A();
            this.f11870s = mo12712b();
            j = mo12472F();
        }
        this.f11871t = j;
        C3844g0 g0Var = z2 ? C3844g0.f11572a : this.f11868q.f13790a;
        Object obj = z2 ? null : this.f11868q.f13791b;
        C4314v vVar = this.f11868q;
        return new C4314v(g0Var, obj, vVar.f13792c, vVar.f13793d, vVar.f13794e, i, false, z2 ? this.f11854c : vVar.f13797h);
    }

    /* renamed from: s */
    private void m16386s(C4314v vVar, int i, boolean z, int i2) {
        int i3 = this.f11864m - i;
        this.f11864m = i3;
        if (i3 == 0) {
            if (vVar.f13793d == -9223372036854775807L) {
                vVar = vVar.mo13586g(vVar.f13792c, 0, vVar.f13794e);
            }
            C4314v vVar2 = vVar;
            if ((!this.f11868q.f13790a.mo12546p() || this.f11865n) && vVar2.f13790a.mo12546p()) {
                this.f11870s = 0;
                this.f11869r = 0;
                this.f11871t = 0;
            }
            int i4 = this.f11865n ? 0 : 2;
            boolean z2 = this.f11866o;
            this.f11865n = false;
            this.f11866o = false;
            m16384E(vVar2, z, i2, i4, z2);
        }
    }

    /* renamed from: t */
    private long m16387t(long j) {
        long b = C3830b.m15923b(j);
        if (this.f11868q.f13792c.mo13121b()) {
            return b;
        }
        C4314v vVar = this.f11868q;
        vVar.f13790a.mo12536f(vVar.f13792c.f13045a, this.f11860i);
        return b + this.f11860i.mo12558k();
    }

    /* renamed from: A */
    public int mo12467A() {
        if (m16383B()) {
            return this.f11869r;
        }
        C4314v vVar = this.f11868q;
        return vVar.f13790a.mo12536f(vVar.f13792c.f13045a, this.f11860i).f11575c;
    }

    /* renamed from: C */
    public C4231f mo12469C() {
        return this.f11868q.f13797h.f13534c;
    }

    /* renamed from: D */
    public int mo12470D(int i) {
        return this.f11852a[i].mo12416i();
    }

    /* renamed from: F */
    public long mo12472F() {
        return m16383B() ? this.f11871t : m16387t(this.f11868q.f13798i);
    }

    /* renamed from: H */
    public C4317y.C4320c mo12474H() {
        return null;
    }

    /* renamed from: a */
    public void mo12478a(C4126f fVar, boolean z, boolean z2) {
        C4314v c = m16385c(z, z2, 2);
        this.f11865n = true;
        this.f11864m++;
        this.f11856e.mo12898B(fVar, z, z2);
        m16384E(c, false, 4, 1, false);
    }

    /* renamed from: b */
    public int mo12712b() {
        return m16383B() ? this.f11870s : this.f11868q.f13792c.f13045a;
    }

    /* renamed from: d */
    public C4315w mo12481d() {
        return this.f11867p;
    }

    /* renamed from: e */
    public void mo12482e(boolean z) {
        if (this.f11861j != z) {
            this.f11861j = z;
            this.f11856e.mo12900W(z);
            Iterator<C4317y.C4319b> it = this.f11858g.iterator();
            while (it.hasNext()) {
                it.next().mo6241c(z, this.f11868q.f13795f);
            }
        }
    }

    /* renamed from: f */
    public C4317y.C4321d mo12483f() {
        return null;
    }

    /* renamed from: g */
    public boolean mo12484g() {
        return !m16383B() && this.f11868q.f13792c.mo13121b();
    }

    /* renamed from: h */
    public long mo12485h() {
        if (!mo12484g()) {
            return mo12472F();
        }
        C4314v vVar = this.f11868q;
        vVar.f13790a.mo12536f(vVar.f13792c.f13045a, this.f11860i);
        return this.f11860i.mo12558k() + C3830b.m15923b(this.f11868q.f13794e);
    }

    /* renamed from: i */
    public void mo12486i(int i, long j) {
        C3844g0 g0Var = this.f11868q.f13790a;
        if (i < 0 || (!g0Var.mo12546p() && i >= g0Var.mo12545o())) {
            throw new C4217p(g0Var, i, j);
        }
        this.f11866o = true;
        this.f11864m++;
        if (mo12484g()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f11855d.obtainMessage(0, 1, -1, this.f11868q).sendToTarget();
            return;
        }
        this.f11869r = i;
        if (g0Var.mo12546p()) {
            this.f11871t = j == -9223372036854775807L ? 0 : j;
            this.f11870s = 0;
        } else {
            long a = j == -9223372036854775807L ? g0Var.mo12542l(i, this.f11859h).mo12564a() : C3830b.m15922a(j);
            Pair<Integer, Long> i2 = g0Var.mo12539i(this.f11859h, this.f11860i, i, a);
            this.f11871t = C3830b.m15923b(a);
            this.f11870s = ((Integer) i2.first).intValue();
        }
        this.f11856e.mo12899N(g0Var, i, C3830b.m15922a(j));
        Iterator<C4317y.C4319b> it = this.f11858g.iterator();
        while (it.hasNext()) {
            it.next().mo6242e(1);
        }
    }

    /* renamed from: j */
    public int mo12487j() {
        C3844g0 g0Var = this.f11868q.f13790a;
        if (g0Var.mo12546p()) {
            return -1;
        }
        return g0Var.mo12541k(mo12467A(), this.f11862k, this.f11863l);
    }

    /* renamed from: k */
    public long mo12488k() {
        return m16383B() ? this.f11871t : m16387t(this.f11868q.f13799j);
    }

    /* renamed from: l */
    public boolean mo12489l() {
        return this.f11861j;
    }

    /* renamed from: m */
    public void mo12490m(boolean z) {
        if (this.f11863l != z) {
            this.f11863l = z;
            this.f11856e.mo12904c0(z);
            Iterator<C4317y.C4319b> it = this.f11858g.iterator();
            while (it.hasNext()) {
                it.next().mo6286p(z);
            }
        }
    }

    /* renamed from: n */
    public int mo12491n() {
        return this.f11868q.f13795f;
    }

    /* renamed from: o */
    public void mo12492o(int i) {
        if (this.f11862k != i) {
            this.f11862k = i;
            this.f11856e.mo12901Z(i);
            Iterator<C4317y.C4319b> it = this.f11858g.iterator();
            while (it.hasNext()) {
                it.next().mo6283m(i);
            }
        }
    }

    /* renamed from: p */
    public int mo12493p() {
        C3844g0 g0Var = this.f11868q.f13790a;
        if (g0Var.mo12546p()) {
            return -1;
        }
        return g0Var.mo12535e(mo12467A(), this.f11862k, this.f11863l);
    }

    /* renamed from: q */
    public void mo12494q(C4317y.C4319b bVar) {
        this.f11858g.add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo12713r(Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 0) {
            C4314v vVar = (C4314v) message.obj;
            int i2 = message.arg1;
            if (message.arg2 == -1) {
                z = false;
            }
            m16386s(vVar, i2, z, message.arg2);
        } else if (i == 1) {
            C4315w wVar = (C4315w) message.obj;
            if (!this.f11867p.equals(wVar)) {
                this.f11867p = wVar;
                Iterator<C4317y.C4319b> it = this.f11858g.iterator();
                while (it.hasNext()) {
                    it.next().mo13591b(wVar);
                }
            }
        } else if (i == 2) {
            C3848h hVar = (C3848h) message.obj;
            Iterator<C4317y.C4319b> it2 = this.f11858g.iterator();
            while (it2.hasNext()) {
                it2.next().mo13593h(hVar);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: u */
    public int mo12498u() {
        return this.f11862k;
    }

    /* renamed from: v */
    public long mo12499v() {
        C3844g0 g0Var = this.f11868q.f13790a;
        if (g0Var.mo12546p()) {
            return -9223372036854775807L;
        }
        if (!mo12484g()) {
            return g0Var.mo12542l(mo12467A(), this.f11859h).mo12565b();
        }
        C4126f.C4128b bVar = this.f11868q.f13792c;
        g0Var.mo12536f(bVar.f13045a, this.f11860i);
        return C3830b.m15923b(this.f11860i.mo12549b(bVar.f13046b, bVar.f13047c));
    }

    /* renamed from: w */
    public C3844g0 mo12500w() {
        return this.f11868q.f13790a;
    }

    /* renamed from: x */
    public C4322z mo12501x(C4322z.C4324b bVar) {
        return new C4322z(this.f11856e, bVar, this.f11868q.f13790a, mo12467A(), this.f11857f);
    }

    /* renamed from: y */
    public boolean mo12502y() {
        return this.f11863l;
    }

    /* renamed from: z */
    public void mo12503z(C4317y.C4319b bVar) {
        this.f11858g.remove(bVar);
    }
}
