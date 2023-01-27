package p385n;

/* renamed from: n.o */
final class C6296o {

    /* renamed from: a */
    final byte[] f17810a;

    /* renamed from: b */
    int f17811b;

    /* renamed from: c */
    int f17812c;

    /* renamed from: d */
    boolean f17813d;

    /* renamed from: e */
    boolean f17814e;

    /* renamed from: f */
    C6296o f17815f;

    /* renamed from: g */
    C6296o f17816g;

    C6296o() {
        this.f17810a = new byte[8192];
        this.f17814e = true;
        this.f17813d = false;
    }

    C6296o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f17810a = bArr;
        this.f17811b = i;
        this.f17812c = i2;
        this.f17813d = z;
        this.f17814e = z2;
    }

    /* renamed from: a */
    public final void mo17925a() {
        C6296o oVar = this.f17816g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f17814e) {
            int i = this.f17812c - this.f17811b;
            if (i <= (8192 - oVar.f17812c) + (oVar.f17813d ? 0 : oVar.f17811b)) {
                mo17930f(this.f17816g, i);
                mo17926b();
                C6297p.m25987a(this);
            }
        }
    }

    /* renamed from: b */
    public final C6296o mo17926b() {
        C6296o oVar = this.f17815f;
        if (oVar == this) {
            oVar = null;
        }
        C6296o oVar2 = this.f17816g;
        oVar2.f17815f = this.f17815f;
        this.f17815f.f17816g = oVar2;
        this.f17815f = null;
        this.f17816g = null;
        return oVar;
    }

    /* renamed from: c */
    public final C6296o mo17927c(C6296o oVar) {
        oVar.f17816g = this;
        oVar.f17815f = this.f17815f;
        this.f17815f.f17816g = oVar;
        this.f17815f = oVar;
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C6296o mo17928d() {
        this.f17813d = true;
        return new C6296o(this.f17810a, this.f17811b, this.f17812c, true, false);
    }

    /* renamed from: e */
    public final C6296o mo17929e(int i) {
        C6296o oVar;
        if (i <= 0 || i > this.f17812c - this.f17811b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            oVar = mo17928d();
        } else {
            oVar = C6297p.m25988b();
            System.arraycopy(this.f17810a, this.f17811b, oVar.f17810a, 0, i);
        }
        oVar.f17812c = oVar.f17811b + i;
        this.f17811b += i;
        this.f17816g.mo17927c(oVar);
        return oVar;
    }

    /* renamed from: f */
    public final void mo17930f(C6296o oVar, int i) {
        if (oVar.f17814e) {
            int i2 = oVar.f17812c;
            if (i2 + i > 8192) {
                if (!oVar.f17813d) {
                    int i3 = oVar.f17811b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = oVar.f17810a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        oVar.f17812c -= oVar.f17811b;
                        oVar.f17811b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f17810a, this.f17811b, oVar.f17810a, oVar.f17812c, i);
            oVar.f17812c += i;
            this.f17811b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
