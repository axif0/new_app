package p086f.p103f.p107b;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;
import p086f.p103f.p107b.C3208b;

/* renamed from: f.f.b.h */
public class C3217h extends C3208b {

    /* renamed from: g */
    private int f10251g = 128;

    /* renamed from: h */
    private C3220i[] f10252h = new C3220i[128];

    /* renamed from: i */
    private C3220i[] f10253i = new C3220i[128];

    /* renamed from: j */
    private int f10254j = 0;

    /* renamed from: k */
    C3219b f10255k = new C3219b(this);

    /* renamed from: f.f.b.h$a */
    class C3218a implements Comparator<C3220i> {
        C3218a(C3217h hVar) {
        }

        /* renamed from: a */
        public int compare(C3220i iVar, C3220i iVar2) {
            return iVar.f10261c - iVar2.f10261c;
        }
    }

    /* renamed from: f.f.b.h$b */
    class C3219b implements Comparable {

        /* renamed from: f */
        C3220i f10256f;

        public C3219b(C3217h hVar) {
        }

        public int compareTo(Object obj) {
            return this.f10256f.f10261c - ((C3220i) obj).f10261c;
        }

        /* renamed from: e */
        public boolean mo11234e(C3220i iVar, float f) {
            boolean z = true;
            if (this.f10256f.f10259a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f10256f.f10267i;
                    fArr[i] = fArr[i] + (iVar.f10267i[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f10256f.f10267i[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C3217h.this.m13793G(this.f10256f);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = iVar.f10267i[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f10256f.f10267i[i2] = f3;
                } else {
                    this.f10256f.f10267i[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: g */
        public void mo11235g(C3220i iVar) {
            this.f10256f = iVar;
        }

        /* renamed from: h */
        public final boolean mo11236h() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f10256f.f10267i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: i */
        public final boolean mo11237i(C3220i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f10267i[i];
                float f2 = this.f10256f.f10267i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public void mo11238j() {
            Arrays.fill(this.f10256f.f10267i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f10256f != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f10256f.f10267i[i] + " ";
                }
            }
            return str + "] " + this.f10256f;
        }
    }

    public C3217h(C3210c cVar) {
        super(cVar);
    }

    /* renamed from: F */
    private final void m13792F(C3220i iVar) {
        int i;
        int i2 = this.f10254j + 1;
        C3220i[] iVarArr = this.f10252h;
        if (i2 > iVarArr.length) {
            C3220i[] iVarArr2 = (C3220i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f10252h = iVarArr2;
            this.f10253i = (C3220i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C3220i[] iVarArr3 = this.f10252h;
        int i3 = this.f10254j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f10254j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f10261c > iVar.f10261c) {
            int i5 = 0;
            while (true) {
                i = this.f10254j;
                if (i5 >= i) {
                    break;
                }
                this.f10253i[i5] = this.f10252h[i5];
                i5++;
            }
            Arrays.sort(this.f10253i, 0, i, new C3218a(this));
            for (int i6 = 0; i6 < this.f10254j; i6++) {
                this.f10252h[i6] = this.f10253i[i6];
            }
        }
        iVar.f10259a = true;
        iVar.mo11240a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m13793G(C3220i iVar) {
        int i = 0;
        while (i < this.f10254j) {
            if (this.f10252h[i] == iVar) {
                while (true) {
                    int i2 = this.f10254j;
                    if (i < i2 - 1) {
                        C3220i[] iVarArr = this.f10252h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f10254j = i2 - 1;
                        iVar.f10259a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: C */
    public void mo11178C(C3208b bVar, boolean z) {
        C3220i iVar = bVar.f10193a;
        if (iVar != null) {
            C3208b.C3209a aVar = bVar.f10197e;
            int e = aVar.mo11168e();
            for (int i = 0; i < e; i++) {
                C3220i i2 = aVar.mo11172i(i);
                float a = aVar.mo11163a(i);
                this.f10255k.mo11235g(i2);
                if (this.f10255k.mo11234e(iVar, a)) {
                    m13792F(i2);
                }
                this.f10194b += bVar.f10194b * a;
            }
            m13793G(iVar);
        }
    }

    /* renamed from: b */
    public void mo11181b(C3220i iVar) {
        this.f10255k.mo11235g(iVar);
        this.f10255k.mo11238j();
        iVar.f10267i[iVar.f10263e] = 1.0f;
        m13792F(iVar);
    }

    /* renamed from: c */
    public C3220i mo11182c(C3211d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f10254j; i2++) {
            C3220i iVar = this.f10252h[i2];
            if (!zArr[iVar.f10261c]) {
                this.f10255k.mo11235g(iVar);
                C3219b bVar = this.f10255k;
                if (i == -1) {
                    if (!bVar.mo11236h()) {
                    }
                } else if (!bVar.mo11237i(this.f10252h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f10252h[i];
    }

    public void clear() {
        this.f10254j = 0;
        this.f10194b = 0.0f;
    }

    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f10194b + ") : ";
        for (int i = 0; i < this.f10254j; i++) {
            this.f10255k.mo11235g(this.f10252h[i]);
            str = str + this.f10255k + " ";
        }
        return str;
    }
}
