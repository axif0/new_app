package p148g.p189d.p190a.p200b.p219o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C3828a;
import p148g.p189d.p190a.p200b.C3848h;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4150o;
import p148g.p189d.p190a.p200b.p203j0.C3906c;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4269j;

/* renamed from: g.d.a.b.o0.l */
public final class C4163l extends C3828a implements Handler.Callback {

    /* renamed from: n */
    private final Handler f13196n;

    /* renamed from: o */
    private final C4162k f13197o;

    /* renamed from: p */
    private final C4158h f13198p;

    /* renamed from: q */
    private final C4150o f13199q;

    /* renamed from: r */
    private boolean f13200r;

    /* renamed from: s */
    private boolean f13201s;

    /* renamed from: t */
    private int f13202t;

    /* renamed from: u */
    private C4109n f13203u;

    /* renamed from: v */
    private C4156f f13204v;

    /* renamed from: w */
    private C4160i f13205w;

    /* renamed from: x */
    private C4161j f13206x;

    /* renamed from: y */
    private C4161j f13207y;

    /* renamed from: z */
    private int f13208z;

    public C4163l(C4162k kVar, Looper looper) {
        this(kVar, looper, C4158h.f13192a);
    }

    public C4163l(C4162k kVar, Looper looper, C4158h hVar) {
        super(3);
        C4260a.m18073e(kVar);
        this.f13197o = kVar;
        this.f13196n = looper == null ? null : new Handler(looper, this);
        this.f13198p = hVar;
        this.f13199q = new C4150o();
    }

    /* renamed from: I */
    private void m17596I() {
        m17602O(Collections.emptyList());
    }

    /* renamed from: J */
    private long m17597J() {
        int i = this.f13208z;
        if (i == -1 || i >= this.f13206x.mo13197i()) {
            return Long.MAX_VALUE;
        }
        return this.f13206x.mo13195g(this.f13208z);
    }

    /* renamed from: K */
    private void m17598K(List<C4152b> list) {
        this.f13197o.mo6244k(list);
    }

    /* renamed from: L */
    private void m17599L() {
        this.f13205w = null;
        this.f13208z = -1;
        C4161j jVar = this.f13206x;
        if (jVar != null) {
            jVar.mo13193s();
            this.f13206x = null;
        }
        C4161j jVar2 = this.f13207y;
        if (jVar2 != null) {
            jVar2.mo13193s();
            this.f13207y = null;
        }
    }

    /* renamed from: M */
    private void m17600M() {
        m17599L();
        this.f13204v.mo12664a();
        this.f13204v = null;
        this.f13202t = 0;
    }

    /* renamed from: N */
    private void m17601N() {
        m17600M();
        this.f13204v = this.f13198p.mo13199b(this.f13203u);
    }

    /* renamed from: O */
    private void m17602O(List<C4152b> list) {
        Handler handler = this.f13196n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m17598K(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo12406B(long j, boolean z) {
        m17596I();
        this.f13200r = false;
        this.f13201s = false;
        if (this.f13202t != 0) {
            m17601N();
            return;
        }
        m17599L();
        this.f13204v.flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo12409E(C4109n[] nVarArr, long j) throws C3848h {
        C4109n nVar = nVarArr[0];
        this.f13203u = nVar;
        if (this.f13204v != null) {
            this.f13202t = 1;
        } else {
            this.f13204v = this.f13198p.mo13199b(nVar);
        }
    }

    /* renamed from: a */
    public int mo12437a(C4109n nVar) {
        return this.f13198p.mo13198a(nVar) ? C3828a.m15879H((C3906c<?>) null, nVar.f12952n) ? 4 : 2 : C4269j.m18116g(nVar.f12949k) ? 1 : 0;
    }

    /* renamed from: c */
    public boolean mo12434c() {
        return this.f13201s;
    }

    /* renamed from: g */
    public boolean mo12435g() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m17598K((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public void mo12436l(long j, long j2) throws C3848h {
        boolean z;
        if (!this.f13201s) {
            if (this.f13207y == null) {
                this.f13204v.mo13188b(j);
                try {
                    this.f13207y = (C4161j) this.f13204v.mo12666d();
                } catch (C4157g e) {
                    throw C3848h.m16074a(e, mo12431x());
                }
            }
            if (getState() == 2) {
                if (this.f13206x != null) {
                    long J = m17597J();
                    z = false;
                    while (J <= j) {
                        this.f13208z++;
                        J = m17597J();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C4161j jVar = this.f13207y;
                if (jVar != null) {
                    if (jVar.mo12659o()) {
                        if (!z && m17597J() == Long.MAX_VALUE) {
                            if (this.f13202t == 2) {
                                m17601N();
                            } else {
                                m17599L();
                                this.f13201s = true;
                            }
                        }
                    } else if (this.f13207y.f11825g <= j) {
                        C4161j jVar2 = this.f13206x;
                        if (jVar2 != null) {
                            jVar2.mo13193s();
                        }
                        C4161j jVar3 = this.f13207y;
                        this.f13206x = jVar3;
                        this.f13207y = null;
                        this.f13208z = jVar3.mo13194e(j);
                        z = true;
                    }
                }
                if (z) {
                    m17602O(this.f13206x.mo13196h(j));
                }
                if (this.f13202t != 2) {
                    while (!this.f13200r) {
                        try {
                            if (this.f13205w == null) {
                                C4160i iVar = (C4160i) this.f13204v.mo12667e();
                                this.f13205w = iVar;
                                if (iVar == null) {
                                    return;
                                }
                            }
                            if (this.f13202t == 1) {
                                this.f13205w.mo12661r(4);
                                this.f13204v.mo12665c(this.f13205w);
                                this.f13205w = null;
                                this.f13202t = 2;
                                return;
                            }
                            int F = mo12410F(this.f13199q, this.f13205w, false);
                            if (F == -4) {
                                if (this.f13205w.mo12659o()) {
                                    this.f13200r = true;
                                } else {
                                    this.f13205w.f13193k = this.f13199q.f13171a.f12939B;
                                    this.f13205w.mo12671u();
                                }
                                this.f13204v.mo12665c(this.f13205w);
                                this.f13205w = null;
                            } else if (F == -3) {
                                return;
                            }
                        } catch (C4157g e2) {
                            throw C3848h.m16074a(e2, mo12431x());
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo12433z() {
        this.f13203u = null;
        m17596I();
        m17600M();
    }
}
