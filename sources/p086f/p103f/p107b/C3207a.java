package p086f.p103f.p107b;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import p086f.p103f.p107b.C3208b;

/* renamed from: f.f.b.a */
public class C3207a implements C3208b.C3209a {

    /* renamed from: l */
    private static float f10181l = 0.001f;

    /* renamed from: a */
    int f10182a = 0;

    /* renamed from: b */
    private final C3208b f10183b;

    /* renamed from: c */
    protected final C3210c f10184c;

    /* renamed from: d */
    private int f10185d = 8;

    /* renamed from: e */
    private C3220i f10186e = null;

    /* renamed from: f */
    private int[] f10187f = new int[8];

    /* renamed from: g */
    private int[] f10188g = new int[8];

    /* renamed from: h */
    private float[] f10189h = new float[8];

    /* renamed from: i */
    private int f10190i = -1;

    /* renamed from: j */
    private int f10191j = -1;

    /* renamed from: k */
    private boolean f10192k = false;

    C3207a(C3208b bVar, C3210c cVar) {
        this.f10183b = bVar;
        this.f10184c = cVar;
    }

    /* renamed from: a */
    public float mo11163a(int i) {
        int i2 = this.f10190i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f10182a) {
            if (i3 == i) {
                return this.f10189h[i2];
            }
            i2 = this.f10188g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public void mo11164b(C3220i iVar, float f, boolean z) {
        float f2 = f10181l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f10190i;
            if (i == -1) {
                this.f10190i = 0;
                this.f10189h[0] = f;
                this.f10187f[0] = iVar.f10261c;
                this.f10188g[0] = -1;
                iVar.f10271m++;
                iVar.mo11240a(this.f10183b);
                this.f10182a++;
                if (!this.f10192k) {
                    int i2 = this.f10191j + 1;
                    this.f10191j = i2;
                    int[] iArr = this.f10187f;
                    if (i2 >= iArr.length) {
                        this.f10192k = true;
                        this.f10191j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f10182a) {
                int[] iArr2 = this.f10187f;
                int i5 = iArr2[i];
                int i6 = iVar.f10261c;
                if (i5 == i6) {
                    float f3 = this.f10189h[i] + f;
                    float f4 = f10181l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    this.f10189h[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f10190i) {
                            this.f10190i = this.f10188g[i];
                        } else {
                            int[] iArr3 = this.f10188g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo11241c(this.f10183b);
                        }
                        if (this.f10192k) {
                            this.f10191j = i;
                        }
                        iVar.f10271m--;
                        this.f10182a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f10188g[i];
                i3++;
            }
            int i7 = this.f10191j;
            int i8 = i7 + 1;
            if (this.f10192k) {
                int[] iArr4 = this.f10187f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f10187f;
            if (i7 >= iArr5.length && this.f10182a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f10187f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f10187f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f10185d * 2;
                this.f10185d = i10;
                this.f10192k = false;
                this.f10191j = i7 - 1;
                this.f10189h = Arrays.copyOf(this.f10189h, i10);
                this.f10187f = Arrays.copyOf(this.f10187f, this.f10185d);
                this.f10188g = Arrays.copyOf(this.f10188g, this.f10185d);
            }
            this.f10187f[i7] = iVar.f10261c;
            this.f10189h[i7] = f;
            int[] iArr8 = this.f10188g;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f10190i;
                this.f10190i = i7;
            }
            iVar.f10271m++;
            iVar.mo11240a(this.f10183b);
            this.f10182a++;
            if (!this.f10192k) {
                this.f10191j++;
            }
            int i11 = this.f10191j;
            int[] iArr9 = this.f10187f;
            if (i11 >= iArr9.length) {
                this.f10192k = true;
                this.f10191j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: c */
    public final float mo11165c(C3220i iVar) {
        int i = this.f10190i;
        int i2 = 0;
        while (i != -1 && i2 < this.f10182a) {
            if (this.f10187f[i] == iVar.f10261c) {
                return this.f10189h[i];
            }
            i = this.f10188g[i];
            i2++;
        }
        return 0.0f;
    }

    public final void clear() {
        int i = this.f10190i;
        int i2 = 0;
        while (i != -1 && i2 < this.f10182a) {
            C3220i iVar = this.f10184c.f10202d[this.f10187f[i]];
            if (iVar != null) {
                iVar.mo11241c(this.f10183b);
            }
            i = this.f10188g[i];
            i2++;
        }
        this.f10190i = -1;
        this.f10191j = -1;
        this.f10192k = false;
        this.f10182a = 0;
    }

    /* renamed from: d */
    public boolean mo11167d(C3220i iVar) {
        int i = this.f10190i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f10182a) {
            if (this.f10187f[i] == iVar.f10261c) {
                return true;
            }
            i = this.f10188g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: e */
    public int mo11168e() {
        return this.f10182a;
    }

    /* renamed from: f */
    public float mo11169f(C3208b bVar, boolean z) {
        float c = mo11165c(bVar.f10193a);
        mo11171h(bVar.f10193a, z);
        C3208b.C3209a aVar = bVar.f10197e;
        int e = aVar.mo11168e();
        for (int i = 0; i < e; i++) {
            C3220i i2 = aVar.mo11172i(i);
            mo11164b(i2, aVar.mo11165c(i2) * c, z);
        }
        return c;
    }

    /* renamed from: g */
    public final void mo11170g(C3220i iVar, float f) {
        if (f == 0.0f) {
            mo11171h(iVar, true);
            return;
        }
        int i = this.f10190i;
        if (i == -1) {
            this.f10190i = 0;
            this.f10189h[0] = f;
            this.f10187f[0] = iVar.f10261c;
            this.f10188g[0] = -1;
            iVar.f10271m++;
            iVar.mo11240a(this.f10183b);
            this.f10182a++;
            if (!this.f10192k) {
                int i2 = this.f10191j + 1;
                this.f10191j = i2;
                int[] iArr = this.f10187f;
                if (i2 >= iArr.length) {
                    this.f10192k = true;
                    this.f10191j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f10182a) {
            int[] iArr2 = this.f10187f;
            int i5 = iArr2[i];
            int i6 = iVar.f10261c;
            if (i5 == i6) {
                this.f10189h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f10188g[i];
            i3++;
        }
        int i7 = this.f10191j;
        int i8 = i7 + 1;
        if (this.f10192k) {
            int[] iArr3 = this.f10187f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f10187f;
        if (i7 >= iArr4.length && this.f10182a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f10187f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f10187f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f10185d * 2;
            this.f10185d = i10;
            this.f10192k = false;
            this.f10191j = i7 - 1;
            this.f10189h = Arrays.copyOf(this.f10189h, i10);
            this.f10187f = Arrays.copyOf(this.f10187f, this.f10185d);
            this.f10188g = Arrays.copyOf(this.f10188g, this.f10185d);
        }
        this.f10187f[i7] = iVar.f10261c;
        this.f10189h[i7] = f;
        int[] iArr7 = this.f10188g;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f10190i;
            this.f10190i = i7;
        }
        iVar.f10271m++;
        iVar.mo11240a(this.f10183b);
        this.f10182a++;
        if (!this.f10192k) {
            this.f10191j++;
        }
        if (this.f10182a >= this.f10187f.length) {
            this.f10192k = true;
        }
        int i11 = this.f10191j;
        int[] iArr8 = this.f10187f;
        if (i11 >= iArr8.length) {
            this.f10192k = true;
            this.f10191j = iArr8.length - 1;
        }
    }

    /* renamed from: h */
    public final float mo11171h(C3220i iVar, boolean z) {
        if (this.f10186e == iVar) {
            this.f10186e = null;
        }
        int i = this.f10190i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f10182a) {
            if (this.f10187f[i] == iVar.f10261c) {
                if (i == this.f10190i) {
                    this.f10190i = this.f10188g[i];
                } else {
                    int[] iArr = this.f10188g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo11241c(this.f10183b);
                }
                iVar.f10271m--;
                this.f10182a--;
                this.f10187f[i] = -1;
                if (this.f10192k) {
                    this.f10191j = i;
                }
                return this.f10189h[i];
            }
            i2++;
            i3 = i;
            i = this.f10188g[i];
        }
        return 0.0f;
    }

    /* renamed from: i */
    public C3220i mo11172i(int i) {
        int i2 = this.f10190i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f10182a) {
            if (i3 == i) {
                return this.f10184c.f10202d[this.f10187f[i2]];
            }
            i2 = this.f10188g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: j */
    public void mo11173j(float f) {
        int i = this.f10190i;
        int i2 = 0;
        while (i != -1 && i2 < this.f10182a) {
            float[] fArr = this.f10189h;
            fArr[i] = fArr[i] / f;
            i = this.f10188g[i];
            i2++;
        }
    }

    /* renamed from: k */
    public void mo11174k() {
        int i = this.f10190i;
        int i2 = 0;
        while (i != -1 && i2 < this.f10182a) {
            float[] fArr = this.f10189h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f10188g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f10190i;
        String str = BuildConfig.FLAVOR;
        int i2 = 0;
        while (i != -1 && i2 < this.f10182a) {
            str = ((str + " -> ") + this.f10189h[i] + " : ") + this.f10184c.f10202d[this.f10187f[i]];
            i = this.f10188g[i];
            i2++;
        }
        return str;
    }
}
