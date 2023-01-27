package p148g.p189d.p190a.p200b.p228p0;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
import p148g.p189d.p190a.p200b.C3831b0;
import p148g.p189d.p190a.p200b.C3833c0;
import p148g.p189d.p190a.p200b.C3848h;
import p148g.p189d.p190a.p200b.p217n0.C4145m;
import p148g.p189d.p190a.p200b.p217n0.C4146n;
import p148g.p189d.p190a.p200b.p228p0.C4229e;

/* renamed from: g.d.a.b.p0.d */
public abstract class C4226d extends C4232g {

    /* renamed from: a */
    private final SparseArray<Map<C4146n, C4228b>> f13523a = new SparseArray<>();

    /* renamed from: b */
    private final SparseBooleanArray f13524b = new SparseBooleanArray();

    /* renamed from: c */
    private int f13525c = 0;

    /* renamed from: g.d.a.b.p0.d$a */
    public static final class C4227a {
        C4227a(int[] iArr, C4146n[] nVarArr, int[] iArr2, int[][][] iArr3, C4146n nVar) {
            int length = nVarArr.length;
        }
    }

    /* renamed from: g.d.a.b.p0.d$b */
    public static final class C4228b {

        /* renamed from: a */
        public final C4229e.C4230a f13526a;

        /* renamed from: b */
        public final int f13527b;

        /* renamed from: c */
        public final int[] f13528c;

        /* renamed from: a */
        public C4229e mo13355a(C4146n nVar) {
            return this.f13526a.mo13356a(nVar.mo13177a(this.f13527b), this.f13528c);
        }
    }

    /* renamed from: d */
    private boolean[] m17954d(C3831b0[] b0VarArr, C4229e[] eVarArr) {
        int length = eVarArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = !this.f13524b.get(i) && (b0VarArr[i].mo12416i() == 5 || eVarArr[i] != null);
        }
        return zArr;
    }

    /* renamed from: e */
    private static int m17955e(C3831b0[] b0VarArr, C4145m mVar) throws C3848h {
        int length = b0VarArr.length;
        int i = 0;
        for (int i2 = 0; i2 < b0VarArr.length; i2++) {
            C3831b0 b0Var = b0VarArr[i2];
            for (int i3 = 0; i3 < mVar.f13156a; i3++) {
                int a = b0Var.mo12437a(mVar.mo13173a(i3)) & 7;
                if (a > i) {
                    if (a == 4) {
                        return i2;
                    }
                    length = i2;
                    i = a;
                }
            }
        }
        return length;
    }

    /* renamed from: f */
    private static int[] m17956f(C3831b0 b0Var, C4145m mVar) throws C3848h {
        int[] iArr = new int[mVar.f13156a];
        for (int i = 0; i < mVar.f13156a; i++) {
            iArr[i] = b0Var.mo12437a(mVar.mo13173a(i));
        }
        return iArr;
    }

    /* renamed from: g */
    private static int[] m17957g(C3831b0[] b0VarArr) throws C3848h {
        int length = b0VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = b0VarArr[i].mo12412b();
        }
        return iArr;
    }

    /* renamed from: i */
    private static void m17958i(C3831b0[] b0VarArr, C4146n[] nVarArr, int[][][] iArr, C3833c0[] c0VarArr, C4229e[] eVarArr, int i) {
        boolean z;
        if (i != 0) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= b0VarArr.length) {
                    z = true;
                    break;
                }
                int i5 = b0VarArr[i2].mo12416i();
                C4229e eVar = eVarArr[i2];
                if ((i5 == 1 || i5 == 2) && eVar != null && m17959j(iArr[i2], nVarArr[i2], eVar)) {
                    if (i5 == 1) {
                        if (i4 != -1) {
                            break;
                        }
                        i4 = i2;
                    } else if (i3 != -1) {
                        break;
                    } else {
                        i3 = i2;
                    }
                }
                i2++;
            }
            z = false;
            if (!(i4 == -1 || i3 == -1)) {
                z2 = true;
            }
            if (z && z2) {
                C3833c0 c0Var = new C3833c0(i);
                c0VarArr[i4] = c0Var;
                c0VarArr[i3] = c0Var;
            }
        }
    }

    /* renamed from: j */
    private static boolean m17959j(int[][] iArr, C4146n nVar, C4229e eVar) {
        if (eVar == null) {
            return false;
        }
        int b = nVar.mo13178b(eVar.mo13329d());
        for (int i = 0; i < eVar.length(); i++) {
            if ((iArr[b][eVar.mo13328c(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo13352b(Object obj) {
        C4227a aVar = (C4227a) obj;
    }

    /* renamed from: c */
    public final C4234h mo13353c(C3831b0[] b0VarArr, C4146n nVar) throws C3848h {
        C3831b0[] b0VarArr2 = b0VarArr;
        C4146n nVar2 = nVar;
        int[] iArr = new int[(b0VarArr2.length + 1)];
        int length = b0VarArr2.length + 1;
        C4145m[][] mVarArr = new C4145m[length][];
        int[][][] iArr2 = new int[(b0VarArr2.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = nVar2.f13160a;
            mVarArr[i] = new C4145m[i2];
            iArr2[i] = new int[i2][];
        }
        int[] g = m17957g(b0VarArr);
        for (int i3 = 0; i3 < nVar2.f13160a; i3++) {
            C4145m a = nVar2.mo13177a(i3);
            int e = m17955e(b0VarArr2, a);
            int[] f = e == b0VarArr2.length ? new int[a.f13156a] : m17956f(b0VarArr2[e], a);
            int i4 = iArr[e];
            mVarArr[e][i4] = a;
            iArr2[e][i4] = f;
            iArr[e] = iArr[e] + 1;
        }
        C4146n[] nVarArr = new C4146n[b0VarArr2.length];
        int[] iArr3 = new int[b0VarArr2.length];
        for (int i5 = 0; i5 < b0VarArr2.length; i5++) {
            int i6 = iArr[i5];
            nVarArr[i5] = new C4146n((C4145m[]) Arrays.copyOf(mVarArr[i5], i6));
            iArr2[i5] = (int[][]) Arrays.copyOf(iArr2[i5], i6);
            iArr3[i5] = b0VarArr2[i5].mo12416i();
        }
        C4146n nVar3 = new C4146n((C4145m[]) Arrays.copyOf(mVarArr[b0VarArr2.length], iArr[b0VarArr2.length]));
        C4229e[] k = mo13342k(b0VarArr2, nVarArr, iArr2);
        int i7 = 0;
        while (true) {
            C4229e eVar = null;
            if (i7 >= b0VarArr2.length) {
                break;
            }
            if (this.f13524b.get(i7)) {
                k[i7] = null;
            } else {
                C4146n nVar4 = nVarArr[i7];
                if (mo13354h(i7, nVar4)) {
                    C4228b bVar = (C4228b) this.f13523a.get(i7).get(nVar4);
                    if (bVar != null) {
                        eVar = bVar.mo13355a(nVar4);
                    }
                    k[i7] = eVar;
                }
            }
            i7++;
        }
        boolean[] d = m17954d(b0VarArr2, k);
        C4227a aVar = new C4227a(iArr3, nVarArr, g, iArr2, nVar3);
        C3833c0[] c0VarArr = new C3833c0[b0VarArr2.length];
        for (int i8 = 0; i8 < b0VarArr2.length; i8++) {
            c0VarArr[i8] = d[i8] ? C3833c0.f11530b : null;
        }
        m17958i(b0VarArr, nVarArr, iArr2, c0VarArr, k, this.f13525c);
        return new C4234h(nVar, d, new C4231f(k), aVar, c0VarArr);
    }

    /* renamed from: h */
    public final boolean mo13354h(int i, C4146n nVar) {
        Map map = this.f13523a.get(i);
        return map != null && map.containsKey(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C4229e[] mo13342k(C3831b0[] b0VarArr, C4146n[] nVarArr, int[][][] iArr) throws C3848h;
}
