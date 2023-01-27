package p148g.p189d.p190a.p200b.p219o0.p220m;

import java.util.LinkedList;
import java.util.PriorityQueue;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p219o0.C4156f;
import p148g.p189d.p190a.p200b.p219o0.C4157g;
import p148g.p189d.p190a.p200b.p219o0.C4160i;
import p148g.p189d.p190a.p200b.p219o0.C4161j;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.o0.m.d */
abstract class C4171d implements C4156f {

    /* renamed from: a */
    private final LinkedList<C4173b> f13288a = new LinkedList<>();

    /* renamed from: b */
    private final LinkedList<C4161j> f13289b;

    /* renamed from: c */
    private final PriorityQueue<C4173b> f13290c;

    /* renamed from: d */
    private C4173b f13291d;

    /* renamed from: e */
    private long f13292e;

    /* renamed from: f */
    private long f13293f;

    /* renamed from: g.d.a.b.o0.m.d$b */
    private static final class C4173b extends C4160i implements Comparable<C4173b> {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public long f13294l;

        private C4173b() {
        }

        /* renamed from: z */
        public int compareTo(C4173b bVar) {
            if (mo12659o() != bVar.mo12659o()) {
                return mo12659o() ? 1 : -1;
            }
            long j = this.f11823i - bVar.f11823i;
            if (j == 0) {
                j = this.f13294l - bVar.f13294l;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* renamed from: g.d.a.b.o0.m.d$c */
    private final class C4174c extends C4161j {
        private C4174c() {
        }

        /* renamed from: s */
        public final void mo13193s() {
            C4171d.this.mo13241m(this);
        }
    }

    public C4171d() {
        for (int i = 0; i < 10; i++) {
            this.f13288a.add(new C4173b());
        }
        this.f13289b = new LinkedList<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f13289b.add(new C4174c());
        }
        this.f13290c = new PriorityQueue<>();
    }

    /* renamed from: l */
    private void m17684l(C4173b bVar) {
        bVar.mo12655k();
        this.f13288a.add(bVar);
    }

    /* renamed from: a */
    public void mo12664a() {
    }

    /* renamed from: b */
    public void mo13188b(long j) {
        this.f13292e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C4155e mo13202f();

    public void flush() {
        this.f13293f = 0;
        this.f13292e = 0;
        while (!this.f13290c.isEmpty()) {
            m17684l(this.f13290c.poll());
        }
        C4173b bVar = this.f13291d;
        if (bVar != null) {
            m17684l(bVar);
            this.f13291d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo13203g(C4160i iVar);

    /* renamed from: h */
    public C4160i mo12667e() throws C4157g {
        C4260a.m18074f(this.f13291d == null);
        if (this.f13288a.isEmpty()) {
            return null;
        }
        C4173b pollFirst = this.f13288a.pollFirst();
        this.f13291d = pollFirst;
        return pollFirst;
    }

    /* renamed from: i */
    public C4161j mo12666d() throws C4157g {
        C4161j pollFirst;
        if (this.f13289b.isEmpty()) {
            return null;
        }
        while (!this.f13290c.isEmpty() && this.f13290c.peek().f11823i <= this.f13292e) {
            C4173b poll = this.f13290c.poll();
            if (poll.mo12659o()) {
                pollFirst = this.f13289b.pollFirst();
                pollFirst.mo12654j(4);
            } else {
                mo13203g(poll);
                if (mo13204j()) {
                    C4155e f = mo13202f();
                    if (!poll.mo12658n()) {
                        pollFirst = this.f13289b.pollFirst();
                        pollFirst.mo13200t(poll.f11823i, f, Long.MAX_VALUE);
                    }
                }
                m17684l(poll);
            }
            m17684l(poll);
            return pollFirst;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo13204j();

    /* renamed from: k */
    public void mo12665c(C4160i iVar) throws C4157g {
        C4260a.m18069a(iVar == this.f13291d);
        if (iVar.mo12658n()) {
            m17684l(this.f13291d);
        } else {
            C4173b bVar = this.f13291d;
            long j = this.f13293f;
            this.f13293f = 1 + j;
            long unused = bVar.f13294l = j;
            this.f13290c.add(this.f13291d);
        }
        this.f13291d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo13241m(C4161j jVar) {
        jVar.mo12655k();
        this.f13289b.add(jVar);
    }
}
