package p148g.p189d.p190a.p232c.p241f.p247f;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: g.d.a.c.f.f.s3 */
abstract class C4771s3<T> implements Iterator<T> {

    /* renamed from: f */
    private int f14466f;

    /* renamed from: g */
    private int f14467g;

    /* renamed from: h */
    private int f14468h;

    /* renamed from: i */
    private final /* synthetic */ C4722p3 f14469i;

    private C4771s3(C4722p3 p3Var) {
        this.f14469i = p3Var;
        this.f14466f = this.f14469i.f14371j;
        this.f14467g = this.f14469i.mo14525q();
        this.f14468h = -1;
    }

    /* synthetic */ C4771s3(C4722p3 p3Var, C4706o3 o3Var) {
        this(p3Var);
    }

    /* renamed from: c */
    private final void m20329c() {
        if (this.f14469i.f14371j != this.f14466f) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo14497b(int i);

    public boolean hasNext() {
        return this.f14467g >= 0;
    }

    public T next() {
        m20329c();
        if (hasNext()) {
            int i = this.f14467g;
            this.f14468h = i;
            T b = mo14497b(i);
            this.f14467g = this.f14469i.mo14512a(this.f14467g);
            return b;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        m20329c();
        C4447a3.m18707h(this.f14468h >= 0, "no calls to next() since the last call to remove()");
        this.f14466f += 32;
        C4722p3 p3Var = this.f14469i;
        p3Var.remove(p3Var.f14369h[this.f14468h]);
        this.f14467g = C4722p3.m20086h(this.f14467g, this.f14468h);
        this.f14468h = -1;
    }
}
