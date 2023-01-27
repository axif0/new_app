package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.util.Arrays;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.v9 */
public final class C4827v9 {

    /* renamed from: f */
    private static final C4827v9 f14590f = new C4827v9(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f14591a;

    /* renamed from: b */
    private int[] f14592b;

    /* renamed from: c */
    private Object[] f14593c;

    /* renamed from: d */
    private int f14594d;

    /* renamed from: e */
    private boolean f14595e;

    private C4827v9() {
        this(0, new int[8], new Object[8], true);
    }

    private C4827v9(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f14594d = -1;
        this.f14591a = i;
        this.f14592b = iArr;
        this.f14593c = objArr;
        this.f14595e = z;
    }

    /* renamed from: a */
    public static C4827v9 m20502a() {
        return f14590f;
    }

    /* renamed from: b */
    static C4827v9 m20503b(C4827v9 v9Var, C4827v9 v9Var2) {
        int i = v9Var.f14591a + v9Var2.f14591a;
        int[] copyOf = Arrays.copyOf(v9Var.f14592b, i);
        System.arraycopy(v9Var2.f14592b, 0, copyOf, v9Var.f14591a, v9Var2.f14591a);
        Object[] copyOf2 = Arrays.copyOf(v9Var.f14593c, i);
        System.arraycopy(v9Var2.f14593c, 0, copyOf2, v9Var.f14591a, v9Var2.f14591a);
        return new C4827v9(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    private static void m20504d(int i, Object obj, C4745qa qaVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            qaVar.mo14398L(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            qaVar.mo14388B(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            qaVar.mo14417p(i2, (C4773s5) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                qaVar.mo14427z(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C4636k7.m19826d());
        } else if (qaVar.mo14402a() == C4895z6.C4900e.f14690k) {
            qaVar.mo14406e(i2);
            ((C4827v9) obj).mo14688h(qaVar);
            qaVar.mo14408g(i2);
        } else {
            qaVar.mo14408g(i2);
            ((C4827v9) obj).mo14688h(qaVar);
            qaVar.mo14406e(i2);
        }
    }

    /* renamed from: g */
    static C4827v9 m20505g() {
        return new C4827v9();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14684c(int i, Object obj) {
        if (this.f14595e) {
            int i2 = this.f14591a;
            if (i2 == this.f14592b.length) {
                int i3 = this.f14591a + (i2 < 4 ? 8 : i2 >> 1);
                this.f14592b = Arrays.copyOf(this.f14592b, i3);
                this.f14593c = Arrays.copyOf(this.f14593c, i3);
            }
            int[] iArr = this.f14592b;
            int i4 = this.f14591a;
            iArr[i4] = i;
            this.f14593c[i4] = obj;
            this.f14591a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo14685e(C4745qa qaVar) throws IOException {
        if (qaVar.mo14402a() == C4895z6.C4900e.f14691l) {
            for (int i = this.f14591a - 1; i >= 0; i--) {
                qaVar.mo14422u(this.f14592b[i] >>> 3, this.f14593c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f14591a; i2++) {
            qaVar.mo14422u(this.f14592b[i2] >>> 3, this.f14593c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4827v9)) {
            return false;
        }
        C4827v9 v9Var = (C4827v9) obj;
        int i = this.f14591a;
        if (i == v9Var.f14591a) {
            int[] iArr = this.f14592b;
            int[] iArr2 = v9Var.f14592b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f14593c;
                Object[] objArr2 = v9Var.f14593c;
                int i3 = this.f14591a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14687f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f14591a; i2++) {
            C4676m8.m19969d(sb, i, String.valueOf(this.f14592b[i2] >>> 3), this.f14593c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo14688h(C4745qa qaVar) throws IOException {
        if (this.f14591a != 0) {
            if (qaVar.mo14402a() == C4895z6.C4900e.f14690k) {
                for (int i = 0; i < this.f14591a; i++) {
                    m20504d(this.f14592b[i], this.f14593c[i], qaVar);
                }
                return;
            }
            for (int i2 = this.f14591a - 1; i2 >= 0; i2--) {
                m20504d(this.f14592b[i2], this.f14593c[i2], qaVar);
            }
        }
    }

    public final int hashCode() {
        int i = this.f14591a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f14592b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f14593c;
        int i7 = this.f14591a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo14690i() {
        this.f14595e = false;
    }

    /* renamed from: j */
    public final int mo14691j() {
        int i = this.f14594d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14591a; i3++) {
            i2 += C4615j6.m19687d0(this.f14592b[i3] >>> 3, (C4773s5) this.f14593c[i3]);
        }
        this.f14594d = i2;
        return i2;
    }

    /* renamed from: k */
    public final int mo14692k() {
        int i;
        int i2 = this.f14594d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14591a; i4++) {
            int i5 = this.f14592b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C4615j6.m19692i0(i6, ((Long) this.f14593c[i4]).longValue());
            } else if (i7 == 1) {
                i = C4615j6.m19700r0(i6, ((Long) this.f14593c[i4]).longValue());
            } else if (i7 == 2) {
                i = C4615j6.m19680U(i6, (C4773s5) this.f14593c[i4]);
            } else if (i7 == 3) {
                i = (C4615j6.m19691h0(i6) << 1) + ((C4827v9) this.f14593c[i4]).mo14692k();
            } else if (i7 == 5) {
                i = C4615j6.m19707y0(i6, ((Integer) this.f14593c[i4]).intValue());
            } else {
                throw new IllegalStateException(C4636k7.m19826d());
            }
            i3 += i;
        }
        this.f14594d = i3;
        return i3;
    }
}
