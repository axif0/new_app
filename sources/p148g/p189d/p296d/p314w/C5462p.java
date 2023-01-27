package p148g.p189d.p296d.p314w;

import java.util.Arrays;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5372d;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5380l;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5382n;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.C5384p;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.p */
public abstract class C5462p extends C5457k {

    /* renamed from: d */
    static final int[] f15820d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f15821e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[][] f15822f;

    /* renamed from: g */
    static final int[][] f15823g;

    /* renamed from: a */
    private final StringBuilder f15824a = new StringBuilder(20);

    /* renamed from: b */
    private final C5461o f15825b = new C5461o();

    /* renamed from: c */
    private final C5453g f15826c = new C5453g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f15822f = iArr;
        int[][] iArr2 = new int[20][];
        f15823g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f15822f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f15823g[i] = iArr4;
        }
    }

    protected C5462p() {
    }

    /* renamed from: j */
    static boolean m22530j(CharSequence charSequence) throws C5374f {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m22535s(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* renamed from: k */
    static int m22531k(C5411a aVar, int[] iArr, int i, int[][] iArr2) throws C5377i {
        C5457k.m22507g(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = C5457k.m22506f(iArr, iArr2[i3], 0.7f);
            if (f2 < f) {
                i2 = i3;
                f = f2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: o */
    static int[] m22532o(C5411a aVar, int i, boolean z, int[] iArr) throws C5377i {
        return m22533p(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: p */
    private static int[] m22533p(C5411a aVar, int i, boolean z, int[] iArr, int[] iArr2) throws C5377i {
        int i2 = aVar.mo15656i();
        int g = z ? aVar.mo15654g(i) : aVar.mo15653f(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = g;
        while (g < i2) {
            if (aVar.mo15650d(g) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C5457k.m22506f(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, g};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            g++;
        }
        throw C5377i.m22193a();
    }

    /* renamed from: q */
    static int[] m22534q(C5411a aVar) throws C5377i {
        int[] iArr = new int[f15820d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, f15820d.length, 0);
            iArr2 = m22533p(aVar, i, false, f15820d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo15657k(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: s */
    static int m22535s(CharSequence charSequence) throws C5374f {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C5374f.m22179a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C5374f.m22179a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    /* renamed from: d */
    public C5381m mo15752d(int i, C5411a aVar, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f {
        return mo15756n(i, aVar, m22534q(aVar), map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo15760i(String str) throws C5374f {
        return m22530j(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int[] mo15761l(C5411a aVar, int i) throws C5377i {
        return m22532o(aVar, i, false, f15820d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo15753m(C5411a aVar, int[] iArr, StringBuilder sb) throws C5377i;

    /* renamed from: n */
    public C5381m mo15756n(int i, C5411a aVar, int[] iArr, Map<C5373e, ?> map) throws C5377i, C5372d, C5374f {
        int i2;
        String c;
        int[] iArr2 = null;
        C5384p pVar = map == null ? null : (C5384p) map.get(C5373e.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (pVar != null) {
            pVar.mo9796a(new C5383o(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f15824a;
        sb.setLength(0);
        int m = mo15753m(aVar, iArr, sb);
        if (pVar != null) {
            pVar.mo9796a(new C5383o((float) m, (float) i));
        }
        int[] l = mo15761l(aVar, m);
        if (pVar != null) {
            pVar.mo9796a(new C5383o(((float) (l[0] + l[1])) / 2.0f, (float) i));
        }
        int i3 = l[1];
        int i4 = (i3 - l[0]) + i3;
        if (i4 >= aVar.mo15656i() || !aVar.mo15657k(i3, i4, false)) {
            throw C5377i.m22193a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C5374f.m22179a();
        } else if (mo15760i(sb2)) {
            C5369a r = mo15754r();
            float f = (float) i;
            C5381m mVar = new C5381m(sb2, (byte[]) null, new C5383o[]{new C5383o(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C5383o(((float) (l[1] + l[0])) / 2.0f, f)}, r);
            try {
                C5381m a = this.f15825b.mo15759a(i, aVar, l[1]);
                mVar.mo15616h(C5382n.UPC_EAN_EXTENSION, a.mo15614f());
                mVar.mo15615g(a.mo15612d());
                mVar.mo15609a(a.mo15613e());
                i2 = a.mo15614f().length();
            } catch (C5380l unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(C5373e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C5377i.m22193a();
                }
            }
            if ((r == C5369a.EAN_13 || r == C5369a.UPC_A) && (c = this.f15826c.mo15755c(sb2)) != null) {
                mVar.mo15616h(C5382n.POSSIBLE_COUNTRY, c);
            }
            return mVar;
        } else {
            throw C5372d.m22177a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract C5369a mo15754r();
}
