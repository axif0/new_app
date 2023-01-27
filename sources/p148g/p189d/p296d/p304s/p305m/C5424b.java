package p148g.p189d.p296d.p304s.p305m;

import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.s.m.b */
public final class C5424b {

    /* renamed from: a */
    private final C5412b f15701a;

    /* renamed from: b */
    private final int f15702b;

    /* renamed from: c */
    private final int f15703c;

    /* renamed from: d */
    private final int f15704d;

    /* renamed from: e */
    private final int f15705e;

    /* renamed from: f */
    private final int f15706f;

    /* renamed from: g */
    private final int f15707g;

    public C5424b(C5412b bVar) throws C5377i {
        this(bVar, 10, bVar.mo15673n() / 2, bVar.mo15670i() / 2);
    }

    public C5424b(C5412b bVar, int i, int i2, int i3) throws C5377i {
        this.f15701a = bVar;
        this.f15702b = bVar.mo15670i();
        int n = bVar.mo15673n();
        this.f15703c = n;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f15704d = i5;
        int i6 = i2 + i4;
        this.f15705e = i6;
        int i7 = i3 - i4;
        this.f15707g = i7;
        int i8 = i3 + i4;
        this.f15706f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= this.f15702b || i6 >= n) {
            throw C5377i.m22193a();
        }
    }

    /* renamed from: a */
    private C5383o[] m22360a(C5383o oVar, C5383o oVar2, C5383o oVar3, C5383o oVar4) {
        float c = oVar.mo15618c();
        float d = oVar.mo15619d();
        float c2 = oVar2.mo15618c();
        float d2 = oVar2.mo15619d();
        float c3 = oVar3.mo15618c();
        float d3 = oVar3.mo15619d();
        float c4 = oVar4.mo15618c();
        float d4 = oVar4.mo15619d();
        if (c < ((float) this.f15703c) / 2.0f) {
            return new C5383o[]{new C5383o(c4 - 1.0f, d4 + 1.0f), new C5383o(c2 + 1.0f, d2 + 1.0f), new C5383o(c3 - 1.0f, d3 - 1.0f), new C5383o(c + 1.0f, d - 1.0f)};
        }
        return new C5383o[]{new C5383o(c4 + 1.0f, d4 + 1.0f), new C5383o(c2 + 1.0f, d2 - 1.0f), new C5383o(c3 - 1.0f, d3 + 1.0f), new C5383o(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m22361b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f15701a.mo15665e(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f15701a.mo15665e(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C5383o m22362d(float f, float f2, float f3, float f4) {
        int c = C5423a.m22358c(C5423a.m22356a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C5423a.m22358c((f8 * f6) + f);
            int c3 = C5423a.m22358c((f8 * f7) + f2);
            if (this.f15701a.mo15665e(c2, c3)) {
                return new C5383o((float) c2, (float) c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C5383o[] mo15704c() throws C5377i {
        int i = this.f15704d;
        int i2 = this.f15705e;
        int i3 = this.f15707g;
        int i4 = this.f15706f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z7 = true;
            boolean z8 = false;
            while (true) {
                if ((z7 || !z3) && i2 < this.f15703c) {
                    z7 = m22361b(i3, i4, i2, false);
                    if (z7) {
                        i2++;
                        z3 = true;
                        z8 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f15703c) {
                boolean z9 = true;
                while (true) {
                    if ((z9 || !z4) && i4 < this.f15702b) {
                        z9 = m22361b(i, i2, i4, true);
                        if (z9) {
                            i4++;
                            z4 = true;
                            z8 = true;
                        } else if (!z4) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f15702b) {
                    boolean z10 = true;
                    while (true) {
                        if ((z10 || !z5) && i >= 0) {
                            z10 = m22361b(i3, i4, i, false);
                            if (z10) {
                                i--;
                                z5 = true;
                                z8 = true;
                            } else if (!z5) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z2 = z8;
                        boolean z11 = true;
                        while (true) {
                            if ((z11 || !z6) && i3 >= 0) {
                                z11 = m22361b(i, i2, i3, true);
                                if (z11) {
                                    i3--;
                                    z2 = true;
                                    z6 = true;
                                } else if (!z6) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i6 = i2 - i;
            C5383o oVar = null;
            C5383o oVar2 = null;
            int i7 = 1;
            while (oVar2 == null && i7 < i6) {
                oVar2 = m22362d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
                i7++;
            }
            if (oVar2 != null) {
                C5383o oVar3 = null;
                int i8 = 1;
                while (oVar3 == null && i8 < i6) {
                    oVar3 = m22362d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                    i8++;
                }
                if (oVar3 != null) {
                    C5383o oVar4 = null;
                    int i9 = 1;
                    while (oVar4 == null && i9 < i6) {
                        oVar4 = m22362d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                        i9++;
                    }
                    if (oVar4 != null) {
                        while (oVar == null && i5 < i6) {
                            oVar = m22362d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                            i5++;
                        }
                        if (oVar != null) {
                            return m22360a(oVar, oVar2, oVar4, oVar3);
                        }
                        throw C5377i.m22193a();
                    }
                    throw C5377i.m22193a();
                }
                throw C5377i.m22193a();
            }
            throw C5377i.m22193a();
        }
        throw C5377i.m22193a();
    }
}
