package p086f.p102e;

/* renamed from: f.e.h */
public class C3204h<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f10175j = new Object();

    /* renamed from: f */
    private boolean f10176f;

    /* renamed from: g */
    private int[] f10177g;

    /* renamed from: h */
    private Object[] f10178h;

    /* renamed from: i */
    private int f10179i;

    public C3204h() {
        this(10);
    }

    public C3204h(int i) {
        this.f10176f = false;
        if (i == 0) {
            this.f10177g = C3194c.f10137a;
            this.f10178h = C3194c.f10139c;
            return;
        }
        int e = C3194c.m13631e(i);
        this.f10177g = new int[e];
        this.f10178h = new Object[e];
    }

    /* renamed from: e */
    private void m13686e() {
        int i = this.f10179i;
        int[] iArr = this.f10177g;
        Object[] objArr = this.f10178h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f10175j) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f10176f = false;
        this.f10179i = i2;
    }

    /* renamed from: b */
    public void mo11149b(int i, E e) {
        int i2 = this.f10179i;
        if (i2 == 0 || i > this.f10177g[i2 - 1]) {
            if (this.f10176f && this.f10179i >= this.f10177g.length) {
                m13686e();
            }
            int i3 = this.f10179i;
            if (i3 >= this.f10177g.length) {
                int e2 = C3194c.m13631e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f10177g;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f10178h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f10177g = iArr;
                this.f10178h = objArr;
            }
            this.f10177g[i3] = i;
            this.f10178h[i3] = e;
            this.f10179i = i3 + 1;
            return;
        }
        mo11158n(i, e);
    }

    /* renamed from: c */
    public void mo11150c() {
        int i = this.f10179i;
        Object[] objArr = this.f10178h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f10179i = 0;
        this.f10176f = false;
    }

    /* renamed from: d */
    public C3204h<E> clone() {
        try {
            C3204h<E> hVar = (C3204h) super.clone();
            hVar.f10177g = (int[]) this.f10177g.clone();
            hVar.f10178h = (Object[]) this.f10178h.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public E mo11153f(int i) {
        return mo11154g(i, (Object) null);
    }

    /* renamed from: g */
    public E mo11154g(int i, E e) {
        int a = C3194c.m13627a(this.f10177g, this.f10179i, i);
        if (a >= 0) {
            E[] eArr = this.f10178h;
            if (eArr[a] != f10175j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int mo11155i(int i) {
        if (this.f10176f) {
            m13686e();
        }
        return C3194c.m13627a(this.f10177g, this.f10179i, i);
    }

    /* renamed from: k */
    public int mo11156k(E e) {
        if (this.f10176f) {
            m13686e();
        }
        for (int i = 0; i < this.f10179i; i++) {
            if (this.f10178h[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public int mo11157l(int i) {
        if (this.f10176f) {
            m13686e();
        }
        return this.f10177g[i];
    }

    /* renamed from: n */
    public void mo11158n(int i, E e) {
        int a = C3194c.m13627a(this.f10177g, this.f10179i, i);
        if (a >= 0) {
            this.f10178h[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 < this.f10179i) {
            Object[] objArr = this.f10178h;
            if (objArr[i2] == f10175j) {
                this.f10177g[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f10176f && this.f10179i >= this.f10177g.length) {
            m13686e();
            i2 = C3194c.m13627a(this.f10177g, this.f10179i, i) ^ -1;
        }
        int i3 = this.f10179i;
        if (i3 >= this.f10177g.length) {
            int e2 = C3194c.m13631e(i3 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f10177g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f10178h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10177g = iArr;
            this.f10178h = objArr2;
        }
        int i4 = this.f10179i;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f10177g;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f10178h;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f10179i - i2);
        }
        this.f10177g[i2] = i;
        this.f10178h[i2] = e;
        this.f10179i++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f10178h;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11159p(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f10177g
            int r1 = r3.f10179i
            int r4 = p086f.p102e.C3194c.m13627a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f10178h
            r1 = r0[r4]
            java.lang.Object r2 = f10175j
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f10176f = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p102e.C3204h.mo11159p(int):void");
    }

    /* renamed from: q */
    public int mo11160q() {
        if (this.f10176f) {
            m13686e();
        }
        return this.f10179i;
    }

    /* renamed from: r */
    public E mo11161r(int i) {
        if (this.f10176f) {
            m13686e();
        }
        return this.f10178h[i];
    }

    public String toString() {
        if (mo11160q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10179i * 28);
        sb.append('{');
        for (int i = 0; i < this.f10179i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo11157l(i));
            sb.append('=');
            Object r = mo11161r(i);
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
