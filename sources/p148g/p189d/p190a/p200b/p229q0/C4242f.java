package p148g.p189d.p190a.p200b.p229q0;

import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.q0.f */
public final class C4242f implements C4237b {

    /* renamed from: a */
    private final boolean f13546a;

    /* renamed from: b */
    private final int f13547b;

    /* renamed from: c */
    private final byte[] f13548c;

    /* renamed from: d */
    private final C4236a[] f13549d;

    /* renamed from: e */
    private int f13550e;

    /* renamed from: f */
    private int f13551f;

    /* renamed from: g */
    private int f13552g;

    /* renamed from: h */
    private C4236a[] f13553h;

    public C4242f(boolean z, int i) {
        this(z, i, 0);
    }

    public C4242f(boolean z, int i, int i2) {
        C4260a.m18069a(i > 0);
        C4260a.m18069a(i2 >= 0);
        this.f13546a = z;
        this.f13547b = i;
        this.f13552g = i2;
        this.f13553h = new C4236a[(i2 + 100)];
        if (i2 > 0) {
            this.f13548c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f13553h[i3] = new C4236a(this.f13548c, i3 * i);
            }
        } else {
            this.f13548c = null;
        }
        this.f13549d = new C4236a[1];
    }

    /* renamed from: a */
    public synchronized void mo13364a() {
        int i = 0;
        int max = Math.max(0, C4284w.m18239e(this.f13550e, this.f13547b) - this.f13551f);
        if (max < this.f13552g) {
            if (this.f13548c != null) {
                int i2 = this.f13552g - 1;
                while (i <= i2) {
                    C4236a aVar = this.f13553h[i];
                    if (aVar.f13537a == this.f13548c) {
                        i++;
                    } else {
                        C4236a aVar2 = this.f13553h[i2];
                        if (aVar2.f13537a != this.f13548c) {
                            i2--;
                        } else {
                            this.f13553h[i] = aVar2;
                            this.f13553h[i2] = aVar;
                            i2--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f13552g) {
                    return;
                }
            }
            Arrays.fill(this.f13553h, max, this.f13552g, (Object) null);
            this.f13552g = max;
        }
    }

    /* renamed from: b */
    public synchronized void mo13365b(C4236a aVar) {
        this.f13549d[0] = aVar;
        mo13366c(this.f13549d);
    }

    /* renamed from: c */
    public synchronized void mo13366c(C4236a[] aVarArr) {
        boolean z;
        if (this.f13552g + aVarArr.length >= this.f13553h.length) {
            this.f13553h = (C4236a[]) Arrays.copyOf(this.f13553h, Math.max(this.f13553h.length * 2, this.f13552g + aVarArr.length));
        }
        for (C4236a aVar : aVarArr) {
            if (aVar.f13537a != this.f13548c) {
                if (aVar.f13537a.length != this.f13547b) {
                    z = false;
                    C4260a.m18069a(z);
                    C4236a[] aVarArr2 = this.f13553h;
                    int i = this.f13552g;
                    this.f13552g = i + 1;
                    aVarArr2[i] = aVar;
                }
            }
            z = true;
            C4260a.m18069a(z);
            C4236a[] aVarArr22 = this.f13553h;
            int i2 = this.f13552g;
            this.f13552g = i2 + 1;
            aVarArr22[i2] = aVar;
        }
        this.f13551f -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: d */
    public synchronized C4236a mo13367d() {
        C4236a aVar;
        this.f13551f++;
        if (this.f13552g > 0) {
            C4236a[] aVarArr = this.f13553h;
            int i = this.f13552g - 1;
            this.f13552g = i;
            aVar = aVarArr[i];
            this.f13553h[i] = null;
        } else {
            aVar = new C4236a(new byte[this.f13547b], 0);
        }
        return aVar;
    }

    /* renamed from: e */
    public int mo13368e() {
        return this.f13547b;
    }

    /* renamed from: f */
    public synchronized int mo13376f() {
        return this.f13551f * this.f13547b;
    }

    /* renamed from: g */
    public synchronized void mo13377g() {
        if (this.f13546a) {
            mo13378h(0);
        }
    }

    /* renamed from: h */
    public synchronized void mo13378h(int i) {
        boolean z = i < this.f13550e;
        this.f13550e = i;
        if (z) {
            mo13364a();
        }
    }
}
