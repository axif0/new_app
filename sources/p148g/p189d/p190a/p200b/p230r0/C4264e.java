package p148g.p189d.p190a.p200b.p230r0;

/* renamed from: g.d.a.b.r0.e */
public final class C4264e {

    /* renamed from: a */
    private boolean f13615a;

    /* renamed from: a */
    public synchronized void mo13414a() throws InterruptedException {
        while (!this.f13615a) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean mo13415b() {
        boolean z;
        z = this.f13615a;
        this.f13615a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo13416c() {
        if (this.f13615a) {
            return false;
        }
        this.f13615a = true;
        notifyAll();
        return true;
    }
}
