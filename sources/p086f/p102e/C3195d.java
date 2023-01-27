package p086f.p102e;

/* renamed from: f.e.d */
public class C3195d<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f10140j = new Object();

    /* renamed from: f */
    private boolean f10141f;

    /* renamed from: g */
    private long[] f10142g;

    /* renamed from: h */
    private Object[] f10143h;

    /* renamed from: i */
    private int f10144i;

    public C3195d() {
        this(10);
    }

    public C3195d(int i) {
        this.f10141f = false;
        if (i == 0) {
            this.f10142g = C3194c.f10138b;
            this.f10143h = C3194c.f10139c;
            return;
        }
        int f = C3194c.m13632f(i);
        this.f10142g = new long[f];
        this.f10143h = new Object[f];
    }

    /* renamed from: e */
    private void m13633e() {
        int i = this.f10144i;
        long[] jArr = this.f10142g;
        Object[] objArr = this.f10143h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f10140j) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f10141f = false;
        this.f10144i = i2;
    }

    /* renamed from: b */
    public void mo11046b(long j, E e) {
        int i = this.f10144i;
        if (i == 0 || j > this.f10142g[i - 1]) {
            if (this.f10141f && this.f10144i >= this.f10142g.length) {
                m13633e();
            }
            int i2 = this.f10144i;
            if (i2 >= this.f10142g.length) {
                int f = C3194c.m13632f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f10142g;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f10143h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f10142g = jArr;
                this.f10143h = objArr;
            }
            this.f10142g[i2] = j;
            this.f10143h[i2] = e;
            this.f10144i = i2 + 1;
            return;
        }
        mo11054l(j, e);
    }

    /* renamed from: c */
    public void mo11047c() {
        int i = this.f10144i;
        Object[] objArr = this.f10143h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f10144i = 0;
        this.f10141f = false;
    }

    /* renamed from: d */
    public C3195d<E> clone() {
        try {
            C3195d<E> dVar = (C3195d) super.clone();
            dVar.f10142g = (long[]) this.f10142g.clone();
            dVar.f10143h = (Object[]) this.f10143h.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public E mo11050f(long j) {
        return mo11051g(j, (Object) null);
    }

    /* renamed from: g */
    public E mo11051g(long j, E e) {
        int b = C3194c.m13628b(this.f10142g, this.f10144i, j);
        if (b >= 0) {
            E[] eArr = this.f10143h;
            if (eArr[b] != f10140j) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int mo11052i(long j) {
        if (this.f10141f) {
            m13633e();
        }
        return C3194c.m13628b(this.f10142g, this.f10144i, j);
    }

    /* renamed from: k */
    public long mo11053k(int i) {
        if (this.f10141f) {
            m13633e();
        }
        return this.f10142g[i];
    }

    /* renamed from: l */
    public void mo11054l(long j, E e) {
        int b = C3194c.m13628b(this.f10142g, this.f10144i, j);
        if (b >= 0) {
            this.f10143h[b] = e;
            return;
        }
        int i = b ^ -1;
        if (i < this.f10144i) {
            Object[] objArr = this.f10143h;
            if (objArr[i] == f10140j) {
                this.f10142g[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f10141f && this.f10144i >= this.f10142g.length) {
            m13633e();
            i = C3194c.m13628b(this.f10142g, this.f10144i, j) ^ -1;
        }
        int i2 = this.f10144i;
        if (i2 >= this.f10142g.length) {
            int f = C3194c.m13632f(i2 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f10142g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f10143h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10142g = jArr;
            this.f10143h = objArr2;
        }
        int i3 = this.f10144i;
        if (i3 - i != 0) {
            long[] jArr3 = this.f10142g;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f10143h;
            System.arraycopy(objArr4, i, objArr4, i4, this.f10144i - i);
        }
        this.f10142g[i] = j;
        this.f10143h[i] = e;
        this.f10144i++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f10143h;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11055n(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f10142g
            int r1 = r2.f10144i
            int r3 = p086f.p102e.C3194c.m13628b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f10143h
            r0 = r4[r3]
            java.lang.Object r1 = f10140j
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f10141f = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p102e.C3195d.mo11055n(long):void");
    }

    /* renamed from: p */
    public void mo11056p(int i) {
        Object[] objArr = this.f10143h;
        Object obj = objArr[i];
        Object obj2 = f10140j;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f10141f = true;
        }
    }

    /* renamed from: q */
    public int mo11057q() {
        if (this.f10141f) {
            m13633e();
        }
        return this.f10144i;
    }

    /* renamed from: r */
    public E mo11058r(int i) {
        if (this.f10141f) {
            m13633e();
        }
        return this.f10143h[i];
    }

    public String toString() {
        if (mo11057q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10144i * 28);
        sb.append('{');
        for (int i = 0; i < this.f10144i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo11053k(i));
            sb.append('=');
            Object r = mo11058r(i);
            if (r != this) {
                sb.append(r);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
