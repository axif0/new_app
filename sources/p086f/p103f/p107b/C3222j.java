package p086f.p103f.p107b;

import java.util.Arrays;
import p086f.p103f.p107b.C3208b;

/* renamed from: f.f.b.j */
public class C3222j implements C3208b.C3209a {

    /* renamed from: m */
    private static float f10278m = 0.001f;

    /* renamed from: a */
    private int f10279a = 16;

    /* renamed from: b */
    private int f10280b = 16;

    /* renamed from: c */
    int[] f10281c = new int[16];

    /* renamed from: d */
    int[] f10282d = new int[16];

    /* renamed from: e */
    int[] f10283e = new int[16];

    /* renamed from: f */
    float[] f10284f = new float[16];

    /* renamed from: g */
    int[] f10285g = new int[16];

    /* renamed from: h */
    int[] f10286h = new int[16];

    /* renamed from: i */
    int f10287i = 0;

    /* renamed from: j */
    int f10288j = -1;

    /* renamed from: k */
    private final C3208b f10289k;

    /* renamed from: l */
    protected final C3210c f10290l;

    C3222j(C3208b bVar, C3210c cVar) {
        this.f10289k = bVar;
        this.f10290l = cVar;
        clear();
    }

    /* renamed from: l */
    private void m13810l(C3220i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f10261c % this.f10280b;
        int[] iArr2 = this.f10281c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f10282d;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f10282d[i] = -1;
    }

    /* renamed from: m */
    private void m13811m(int i, C3220i iVar, float f) {
        this.f10283e[i] = iVar.f10261c;
        this.f10284f[i] = f;
        this.f10285g[i] = -1;
        this.f10286h[i] = -1;
        iVar.mo11240a(this.f10289k);
        iVar.f10271m++;
        this.f10287i++;
    }

    /* renamed from: n */
    private int m13812n() {
        for (int i = 0; i < this.f10279a; i++) {
            if (this.f10283e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m13813o() {
        int i = this.f10279a * 2;
        this.f10283e = Arrays.copyOf(this.f10283e, i);
        this.f10284f = Arrays.copyOf(this.f10284f, i);
        this.f10285g = Arrays.copyOf(this.f10285g, i);
        this.f10286h = Arrays.copyOf(this.f10286h, i);
        this.f10282d = Arrays.copyOf(this.f10282d, i);
        for (int i2 = this.f10279a; i2 < i; i2++) {
            this.f10283e[i2] = -1;
            this.f10282d[i2] = -1;
        }
        this.f10279a = i;
    }

    /* renamed from: q */
    private void m13814q(int i, C3220i iVar, float f) {
        int n = m13812n();
        m13811m(n, iVar, f);
        if (i != -1) {
            this.f10285g[n] = i;
            int[] iArr = this.f10286h;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f10285g[n] = -1;
            if (this.f10287i > 0) {
                this.f10286h[n] = this.f10288j;
                this.f10288j = n;
            } else {
                this.f10286h[n] = -1;
            }
        }
        int[] iArr2 = this.f10286h;
        if (iArr2[n] != -1) {
            this.f10285g[iArr2[n]] = n;
        }
        m13810l(iVar, n);
    }

    /* renamed from: r */
    private void m13815r(C3220i iVar) {
        int i = iVar.f10261c;
        int i2 = i % this.f10280b;
        int[] iArr = this.f10281c;
        int i3 = iArr[i2];
        if (i3 != -1) {
            if (this.f10283e[i3] == i) {
                int[] iArr2 = this.f10282d;
                iArr[i2] = iArr2[i3];
                iArr2[i3] = -1;
                return;
            }
            while (true) {
                int[] iArr3 = this.f10282d;
                if (iArr3[i3] == -1 || this.f10283e[iArr3[i3]] == i) {
                    int[] iArr4 = this.f10282d;
                    int i4 = iArr4[i3];
                } else {
                    i3 = iArr3[i3];
                }
            }
            int[] iArr42 = this.f10282d;
            int i42 = iArr42[i3];
            if (i42 != -1 && this.f10283e[i42] == i) {
                iArr42[i3] = iArr42[i42];
                iArr42[i42] = -1;
            }
        }
    }

    /* renamed from: a */
    public float mo11163a(int i) {
        int i2 = this.f10287i;
        int i3 = this.f10288j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f10284f[i3];
            }
            i3 = this.f10286h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: b */
    public void mo11164b(C3220i iVar, float f, boolean z) {
        float f2 = f10278m;
        if (f <= (-f2) || f >= f2) {
            int p = mo11247p(iVar);
            if (p == -1) {
                mo11170g(iVar, f);
                return;
            }
            float[] fArr = this.f10284f;
            fArr[p] = fArr[p] + f;
            float f3 = fArr[p];
            float f4 = f10278m;
            if (f3 > (-f4) && fArr[p] < f4) {
                fArr[p] = 0.0f;
                mo11171h(iVar, z);
            }
        }
    }

    /* renamed from: c */
    public float mo11165c(C3220i iVar) {
        int p = mo11247p(iVar);
        if (p != -1) {
            return this.f10284f[p];
        }
        return 0.0f;
    }

    public void clear() {
        int i = this.f10287i;
        for (int i2 = 0; i2 < i; i2++) {
            C3220i i3 = mo11172i(i2);
            if (i3 != null) {
                i3.mo11241c(this.f10289k);
            }
        }
        for (int i4 = 0; i4 < this.f10279a; i4++) {
            this.f10283e[i4] = -1;
            this.f10282d[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f10280b; i5++) {
            this.f10281c[i5] = -1;
        }
        this.f10287i = 0;
        this.f10288j = -1;
    }

    /* renamed from: d */
    public boolean mo11167d(C3220i iVar) {
        return mo11247p(iVar) != -1;
    }

    /* renamed from: e */
    public int mo11168e() {
        return this.f10287i;
    }

    /* renamed from: f */
    public float mo11169f(C3208b bVar, boolean z) {
        float c = mo11165c(bVar.f10193a);
        mo11171h(bVar.f10193a, z);
        C3222j jVar = (C3222j) bVar.f10197e;
        int e = jVar.mo11168e();
        int i = jVar.f10288j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < e) {
            int[] iArr = jVar.f10283e;
            if (iArr[i3] != -1) {
                mo11164b(this.f10290l.f10202d[iArr[i3]], jVar.f10284f[i3] * c, z);
                i2++;
            }
            i3++;
        }
        return c;
    }

    /* renamed from: g */
    public void mo11170g(C3220i iVar, float f) {
        float f2 = f10278m;
        if (f <= (-f2) || f >= f2) {
            if (this.f10287i == 0) {
                m13811m(0, iVar, f);
                m13810l(iVar, 0);
                this.f10288j = 0;
                return;
            }
            int p = mo11247p(iVar);
            if (p != -1) {
                this.f10284f[p] = f;
                return;
            }
            if (this.f10287i + 1 >= this.f10279a) {
                m13813o();
            }
            int i = this.f10287i;
            int i2 = this.f10288j;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int[] iArr = this.f10283e;
                int i5 = iArr[i2];
                int i6 = iVar.f10261c;
                if (i5 == i6) {
                    this.f10284f[i2] = f;
                    return;
                }
                if (iArr[i2] < i6) {
                    i3 = i2;
                }
                i2 = this.f10286h[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m13814q(i3, iVar, f);
            return;
        }
        mo11171h(iVar, true);
    }

    /* renamed from: h */
    public float mo11171h(C3220i iVar, boolean z) {
        int p = mo11247p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        m13815r(iVar);
        float f = this.f10284f[p];
        if (this.f10288j == p) {
            this.f10288j = this.f10286h[p];
        }
        this.f10283e[p] = -1;
        int[] iArr = this.f10285g;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f10286h;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f10286h;
        if (iArr3[p] != -1) {
            int[] iArr4 = this.f10285g;
            iArr4[iArr3[p]] = iArr4[p];
        }
        this.f10287i--;
        iVar.f10271m--;
        if (z) {
            iVar.mo11241c(this.f10289k);
        }
        return f;
    }

    /* renamed from: i */
    public C3220i mo11172i(int i) {
        int i2 = this.f10287i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f10288j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f10290l.f10202d[this.f10283e[i3]];
            }
            i3 = this.f10286h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo11173j(float f) {
        int i = this.f10287i;
        int i2 = this.f10288j;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f10284f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f10286h[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo11174k() {
        int i = this.f10287i;
        int i2 = this.f10288j;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f10284f;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f10286h[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public int mo11247p(C3220i iVar) {
        if (this.f10287i == 0) {
            return -1;
        }
        int i = iVar.f10261c;
        int i2 = this.f10281c[i % this.f10280b];
        if (i2 == -1) {
            return -1;
        }
        if (this.f10283e[i2] == i) {
            return i2;
        }
        while (true) {
            int[] iArr = this.f10282d;
            if (iArr[i2] == -1 || this.f10283e[iArr[i2]] == i) {
                int[] iArr2 = this.f10282d;
            } else {
                i2 = iArr[i2];
            }
        }
        int[] iArr22 = this.f10282d;
        if (iArr22[i2] != -1 && this.f10283e[iArr22[i2]] == i) {
            return iArr22[i2];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = hashCode() + " { ";
        int i = this.f10287i;
        for (int i2 = 0; i2 < i; i2++) {
            C3220i i3 = mo11172i(i2);
            if (i3 != null) {
                String str3 = str2 + i3 + " = " + mo11163a(i2) + " ";
                int p = mo11247p(i3);
                String str4 = str3 + "[p: ";
                if (this.f10285g[p] != -1) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(this.f10290l.f10202d[this.f10283e[this.f10285g[p]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("none");
                }
                String str5 = sb.toString() + ", n: ";
                if (this.f10286h[p] != -1) {
                    str = str5 + this.f10290l.f10202d[this.f10283e[this.f10286h[p]]];
                } else {
                    str = str5 + "none";
                }
                str2 = str + "]";
            }
        }
        return str2 + " }";
    }
}
