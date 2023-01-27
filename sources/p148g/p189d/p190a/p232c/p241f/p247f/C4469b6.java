package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: g.d.a.c.f.f.b6 */
class C4469b6 extends C4487c6 {

    /* renamed from: i */
    protected final byte[] f13992i;

    C4469b6(byte[] bArr) {
        if (bArr != null) {
            this.f13992i = bArr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo13851A(C4773s5 s5Var, int i, int i2) {
        if (i2 > s5Var.mo13854d()) {
            int d = mo13854d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > s5Var.mo13854d()) {
            int d2 = s5Var.mo13854d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(s5Var instanceof C4469b6)) {
            return s5Var.mo13857h(0, i2).equals(mo13857h(0, i2));
        } else {
            C4469b6 b6Var = (C4469b6) s5Var;
            byte[] bArr = this.f13992i;
            byte[] bArr2 = b6Var.f13992i;
            int B = mo13852B() + i2;
            int B2 = mo13852B();
            int B3 = b6Var.mo13852B();
            while (B2 < B) {
                if (bArr[B2] != bArr2[B3]) {
                    return false;
                }
                B2++;
                B3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo13852B() {
        return 0;
    }

    /* renamed from: c */
    public byte mo13853c(int i) {
        return this.f13992i[i];
    }

    /* renamed from: d */
    public int mo13854d() {
        return this.f13992i.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4773s5) || mo13854d() != ((C4773s5) obj).mo13854d()) {
            return false;
        }
        if (mo13854d() == 0) {
            return true;
        }
        if (!(obj instanceof C4469b6)) {
            return obj.equals(this);
        }
        C4469b6 b6Var = (C4469b6) obj;
        int x = mo14607x();
        int x2 = b6Var.mo14607x();
        if (x == 0 || x2 == 0 || x == x2) {
            return mo13851A(b6Var, 0, mo13854d());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo13856f(int i, int i2, int i3) {
        return C4470b7.m18813a(i, this.f13992i, mo13852B(), i3);
    }

    /* renamed from: h */
    public final C4773s5 mo13857h(int i, int i2) {
        int r = C4773s5.m20339r(0, i2, mo13854d());
        return r == 0 ? C4773s5.f14473g : new C4873y5(this.f13992i, mo13852B(), r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo13858o(Charset charset) {
        return new String(this.f13992i, mo13852B(), mo13854d(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo13859p(C4790t5 t5Var) throws IOException {
        t5Var.mo14305a(this.f13992i, mo13852B(), mo13854d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public byte mo13860q(int i) {
        return this.f13992i[i];
    }

    /* renamed from: w */
    public final boolean mo13861w() {
        int B = mo13852B();
        return C4473ba.m18885g(this.f13992i, B, mo13854d() + B);
    }
}
