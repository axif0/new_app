package p148g.p189d.p190a.p200b.p228p0;

import android.graphics.Point;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p148g.p189d.p190a.p200b.C3831b0;
import p148g.p189d.p190a.p200b.C3848h;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p217n0.C4145m;
import p148g.p189d.p190a.p200b.p217n0.C4146n;
import p148g.p189d.p190a.p200b.p228p0.C4229e;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.p0.b */
public class C4221b extends C4226d {

    /* renamed from: f */
    private static final int[] f13493f = new int[0];

    /* renamed from: d */
    private final C4229e.C4230a f13494d;

    /* renamed from: e */
    private final AtomicReference<C4224c> f13495e;

    /* renamed from: g.d.a.b.p0.b$a */
    private static final class C4222a {

        /* renamed from: a */
        public final int f13496a;

        /* renamed from: b */
        public final int f13497b;

        /* renamed from: c */
        public final String f13498c;

        public C4222a(int i, int i2, String str) {
            this.f13496a = i;
            this.f13497b = i2;
            this.f13498c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4222a.class != obj.getClass()) {
                return false;
            }
            C4222a aVar = (C4222a) obj;
            return this.f13496a == aVar.f13496a && this.f13497b == aVar.f13497b && TextUtils.equals(this.f13498c, aVar.f13498c);
        }

        public int hashCode() {
            int i = ((this.f13496a * 31) + this.f13497b) * 31;
            String str = this.f13498c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: g.d.a.b.p0.b$b */
    private static final class C4223b implements Comparable<C4223b> {

        /* renamed from: f */
        private final C4224c f13499f;

        /* renamed from: g */
        private final int f13500g;

        /* renamed from: h */
        private final int f13501h;

        /* renamed from: i */
        private final int f13502i;

        /* renamed from: j */
        private final int f13503j;

        /* renamed from: k */
        private final int f13504k;

        /* renamed from: l */
        private final int f13505l;

        public C4223b(C4109n nVar, C4224c cVar, int i) {
            this.f13499f = cVar;
            int i2 = 0;
            this.f13500g = C4221b.m17944x(i, false) ? 1 : 0;
            this.f13501h = C4221b.m17936p(nVar, cVar.f13507a) ? 1 : 0;
            this.f13502i = (nVar.f12940C & 1) != 0 ? 1 : i2;
            this.f13503j = nVar.f12961w;
            this.f13504k = nVar.f12962x;
            this.f13505l = nVar.f12945g;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
            r0 = r3.f13504k;
            r2 = r4.f13504k;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compareTo(p148g.p189d.p190a.p200b.p228p0.C4221b.C4223b r4) {
            /*
                r3 = this;
                int r0 = r3.f13500g
                int r1 = r4.f13500g
                if (r0 == r1) goto L_0x000b
                int r4 = p148g.p189d.p190a.p200b.p228p0.C4221b.m17934n(r0, r1)
                return r4
            L_0x000b:
                int r1 = r3.f13501h
                int r2 = r4.f13501h
                if (r1 == r2) goto L_0x0016
                int r4 = p148g.p189d.p190a.p200b.p228p0.C4221b.m17934n(r1, r2)
                return r4
            L_0x0016:
                int r1 = r3.f13502i
                int r2 = r4.f13502i
                if (r1 == r2) goto L_0x0021
                int r4 = p148g.p189d.p190a.p200b.p228p0.C4221b.m17934n(r1, r2)
                return r4
            L_0x0021:
                g.d.a.b.p0.b$c r1 = r3.f13499f
                boolean r1 = r1.f13518l
                if (r1 == 0) goto L_0x0030
                int r4 = r4.f13505l
                int r0 = r3.f13505l
                int r4 = p148g.p189d.p190a.p200b.p228p0.C4221b.m17934n(r4, r0)
                return r4
            L_0x0030:
                r1 = 1
                if (r0 != r1) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r1 = -1
            L_0x0035:
                int r0 = r3.f13503j
                int r2 = r4.f13503j
                if (r0 == r2) goto L_0x0042
            L_0x003b:
                int r4 = p148g.p189d.p190a.p200b.p228p0.C4221b.m17934n(r0, r2)
            L_0x003f:
                int r1 = r1 * r4
                return r1
            L_0x0042:
                int r0 = r3.f13504k
                int r2 = r4.f13504k
                if (r0 == r2) goto L_0x0049
                goto L_0x003b
            L_0x0049:
                int r0 = r3.f13505l
                int r4 = r4.f13505l
                int r4 = p148g.p189d.p190a.p200b.p228p0.C4221b.m17934n(r0, r4)
                goto L_0x003f
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p228p0.C4221b.C4223b.compareTo(g.d.a.b.p0.b$b):int");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4223b.class != obj.getClass()) {
                return false;
            }
            C4223b bVar = (C4223b) obj;
            return this.f13500g == bVar.f13500g && this.f13501h == bVar.f13501h && this.f13502i == bVar.f13502i && this.f13503j == bVar.f13503j && this.f13504k == bVar.f13504k && this.f13505l == bVar.f13505l;
        }

        public int hashCode() {
            return (((((((((this.f13500g * 31) + this.f13501h) * 31) + this.f13502i) * 31) + this.f13503j) * 31) + this.f13504k) * 31) + this.f13505l;
        }
    }

    /* renamed from: g.d.a.b.p0.b$c */
    public static final class C4224c {

        /* renamed from: p */
        public static final C4224c f13506p = new C4224c();

        /* renamed from: a */
        public final String f13507a;

        /* renamed from: b */
        public final String f13508b;

        /* renamed from: c */
        public final boolean f13509c;

        /* renamed from: d */
        public final int f13510d;

        /* renamed from: e */
        public final int f13511e;

        /* renamed from: f */
        public final int f13512f;

        /* renamed from: g */
        public final int f13513g;

        /* renamed from: h */
        public final boolean f13514h;

        /* renamed from: i */
        public final int f13515i;

        /* renamed from: j */
        public final int f13516j;

        /* renamed from: k */
        public final boolean f13517k;

        /* renamed from: l */
        public final boolean f13518l;

        /* renamed from: m */
        public final boolean f13519m;

        /* renamed from: n */
        public final boolean f13520n;

        /* renamed from: o */
        public final boolean f13521o;

        private C4224c() {
            this((String) null, (String) null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        private C4224c(String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7) {
            this.f13507a = C4284w.m18260z(str);
            this.f13508b = C4284w.m18260z(str2);
            this.f13509c = z;
            this.f13510d = i;
            this.f13518l = z2;
            this.f13519m = z3;
            this.f13520n = z4;
            this.f13511e = i2;
            this.f13512f = i3;
            this.f13513g = i4;
            this.f13514h = z5;
            this.f13521o = z6;
            this.f13515i = i5;
            this.f13516j = i6;
            this.f13517k = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4224c.class != obj.getClass()) {
                return false;
            }
            C4224c cVar = (C4224c) obj;
            return this.f13509c == cVar.f13509c && this.f13510d == cVar.f13510d && this.f13518l == cVar.f13518l && this.f13519m == cVar.f13519m && this.f13520n == cVar.f13520n && this.f13511e == cVar.f13511e && this.f13512f == cVar.f13512f && this.f13514h == cVar.f13514h && this.f13521o == cVar.f13521o && this.f13517k == cVar.f13517k && this.f13515i == cVar.f13515i && this.f13516j == cVar.f13516j && this.f13513g == cVar.f13513g && TextUtils.equals(this.f13507a, cVar.f13507a) && TextUtils.equals(this.f13508b, cVar.f13508b);
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((this.f13509c ? 1 : 0) * true) + this.f13510d) * 31) + (this.f13518l ? 1 : 0)) * 31) + (this.f13519m ? 1 : 0)) * 31) + (this.f13520n ? 1 : 0)) * 31) + this.f13511e) * 31) + this.f13512f) * 31) + (this.f13514h ? 1 : 0)) * 31) + (this.f13521o ? 1 : 0)) * 31) + (this.f13517k ? 1 : 0)) * 31) + this.f13515i) * 31) + this.f13516j) * 31) + this.f13513g) * 31) + this.f13507a.hashCode()) * 31) + this.f13508b.hashCode();
        }
    }

    public C4221b() {
        this((C4229e.C4230a) null);
    }

    public C4221b(C4229e.C4230a aVar) {
        this.f13494d = aVar;
        this.f13495e = new AtomicReference<>(C4224c.f13506p);
    }

    /* renamed from: A */
    private static C4229e m17930A(C3831b0 b0Var, C4146n nVar, int[][] iArr, C4224c cVar, C4229e.C4230a aVar) throws C3848h {
        C4146n nVar2 = nVar;
        C4224c cVar2 = cVar;
        int i = cVar2.f13520n ? 24 : 16;
        boolean z = cVar2.f13519m && (b0Var.mo12412b() & i) != 0;
        for (int i2 = 0; i2 < nVar2.f13160a; i2++) {
            C4145m a = nVar2.mo13177a(i2);
            int[] u = m17941u(a, iArr[i2], z, i, cVar2.f13511e, cVar2.f13512f, cVar2.f13513g, cVar2.f13515i, cVar2.f13516j, cVar2.f13517k);
            if (u.length > 0) {
                return aVar.mo13356a(a, u);
            }
            C4229e.C4230a aVar2 = aVar;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r15 = r2.f12953o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r4 = r2.f12954p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r4 = r2.f12945g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (m17933m(r2.f12945g, r10) < 0) goto L_0x0088;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p148g.p189d.p190a.p200b.p228p0.C4229e m17931C(p148g.p189d.p190a.p200b.p217n0.C4146n r18, int[][] r19, p148g.p189d.p190a.p200b.p228p0.C4221b.C4224c r20) {
        /*
            r0 = r18
            r1 = r20
            r3 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x000b:
            int r11 = r0.f13160a
            if (r5 >= r11) goto L_0x00c1
            g.d.a.b.n0.m r11 = r0.mo13177a(r5)
            int r12 = r1.f13515i
            int r13 = r1.f13516j
            boolean r14 = r1.f13517k
            java.util.List r12 = m17943w(r11, r12, r13, r14)
            r13 = r19[r5]
            r14 = 0
        L_0x0020:
            int r15 = r11.f13156a
            if (r14 >= r15) goto L_0x00ba
            r15 = r13[r14]
            boolean r2 = r1.f13521o
            boolean r2 = m17944x(r15, r2)
            if (r2 == 0) goto L_0x00b3
            g.d.a.b.n r2 = r11.mo13173a(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r15 = r12.contains(r15)
            r16 = 1
            if (r15 == 0) goto L_0x0058
            int r15 = r2.f12953o
            if (r15 == r3) goto L_0x0046
            int r4 = r1.f13511e
            if (r15 > r4) goto L_0x0058
        L_0x0046:
            int r4 = r2.f12954p
            if (r4 == r3) goto L_0x004e
            int r15 = r1.f13512f
            if (r4 > r15) goto L_0x0058
        L_0x004e:
            int r4 = r2.f12945g
            if (r4 == r3) goto L_0x0056
            int r15 = r1.f13513g
            if (r4 > r15) goto L_0x0058
        L_0x0056:
            r4 = 1
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r4 != 0) goto L_0x0060
            boolean r15 = r1.f13514h
            if (r15 != 0) goto L_0x0060
            goto L_0x00b3
        L_0x0060:
            if (r4 == 0) goto L_0x0064
            r15 = 2
            goto L_0x0065
        L_0x0064:
            r15 = 1
        L_0x0065:
            r3 = r13[r14]
            r0 = 0
            boolean r3 = m17944x(r3, r0)
            if (r3 == 0) goto L_0x0070
            int r15 = r15 + 1000
        L_0x0070:
            if (r15 <= r8) goto L_0x0075
            r17 = 1
            goto L_0x0077
        L_0x0075:
            r17 = 0
        L_0x0077:
            if (r15 != r8) goto L_0x00a6
            boolean r0 = r1.f13518l
            if (r0 == 0) goto L_0x008b
            int r0 = r2.f12945g
            int r0 = m17933m(r0, r10)
            if (r0 >= 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r16 = 0
        L_0x0088:
            r17 = r16
            goto L_0x00a6
        L_0x008b:
            int r0 = r2.mo13065w()
            if (r0 == r9) goto L_0x0096
            int r0 = m17933m(r0, r9)
            goto L_0x009c
        L_0x0096:
            int r0 = r2.f12945g
            int r0 = m17933m(r0, r10)
        L_0x009c:
            if (r3 == 0) goto L_0x00a3
            if (r4 == 0) goto L_0x00a3
            if (r0 <= 0) goto L_0x0086
            goto L_0x0088
        L_0x00a3:
            if (r0 >= 0) goto L_0x0086
            goto L_0x0088
        L_0x00a6:
            if (r17 == 0) goto L_0x00b3
            int r0 = r2.f12945g
            int r2 = r2.mo13065w()
            r10 = r0
            r9 = r2
            r6 = r11
            r7 = r14
            r8 = r15
        L_0x00b3:
            int r14 = r14 + 1
            r0 = r18
            r3 = -1
            goto L_0x0020
        L_0x00ba:
            int r5 = r5 + 1
            r0 = r18
            r3 = -1
            goto L_0x000b
        L_0x00c1:
            if (r6 != 0) goto L_0x00c5
            r2 = 0
            goto L_0x00ca
        L_0x00c5:
            g.d.a.b.p0.c r2 = new g.d.a.b.p0.c
            r2.<init>(r6, r7)
        L_0x00ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p228p0.C4221b.m17931C(g.d.a.b.n0.n, int[][], g.d.a.b.p0.b$c):g.d.a.b.p0.e");
    }

    /* renamed from: m */
    private static int m17933m(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static int m17934n(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: o */
    private static void m17935o(C4145m mVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            C4145m mVar2 = mVar;
            if (!m17946z(mVar.mo13173a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list2.remove(size);
            }
        }
    }

    /* renamed from: p */
    protected static boolean m17936p(C4109n nVar, String str) {
        return str != null && TextUtils.equals(str, C4284w.m18260z(nVar.f12941D));
    }

    /* renamed from: q */
    protected static boolean m17937q(C4109n nVar) {
        return TextUtils.isEmpty(nVar.f12941D) || m17936p(nVar, "und");
    }

    /* renamed from: r */
    private static int m17938r(C4145m mVar, int[] iArr, C4222a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < mVar.f13156a; i2++) {
            if (m17945y(mVar.mo13173a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: s */
    private static int[] m17939s(C4145m mVar, int[] iArr, boolean z) {
        int r;
        HashSet hashSet = new HashSet();
        C4222a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < mVar.f13156a; i2++) {
            C4109n a = mVar.mo13173a(i2);
            C4222a aVar2 = new C4222a(a.f12961w, a.f12962x, z ? null : a.f12949k);
            if (hashSet.add(aVar2) && (r = m17938r(mVar, iArr, aVar2)) > i) {
                i = r;
                aVar = aVar2;
            }
        }
        if (i <= 1) {
            return f13493f;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < mVar.f13156a; i4++) {
            if (m17945y(mVar.mo13173a(i4), iArr[i4], aVar)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    /* renamed from: t */
    private static int m17940t(C4145m mVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            C4145m mVar2 = mVar;
            if (m17946z(mVar.mo13173a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: u */
    private static int[] m17941u(C4145m mVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        String str;
        int t;
        C4145m mVar2 = mVar;
        if (mVar2.f13156a < 2) {
            return f13493f;
        }
        List<Integer> w = m17943w(mVar2, i5, i6, z2);
        if (w.size() < 2) {
            return f13493f;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < w.size(); i8++) {
                String str3 = mVar2.mo13173a(w.get(i8).intValue()).f12949k;
                if (hashSet.add(str3) && (t = m17940t(mVar, iArr, i, str3, i2, i3, i4, w)) > i7) {
                    i7 = t;
                    str2 = str3;
                }
            }
            str = str2;
        } else {
            str = null;
        }
        m17935o(mVar, iArr, i, str, i2, i3, i4, w);
        return w.size() < 2 ? f13493f : C4284w.m18232E(w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point m17942v(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18239e(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18239e(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p228p0.C4221b.m17942v(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: w */
    private static List<Integer> m17943w(C4145m mVar, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(mVar.f13156a);
        for (int i4 = 0; i4 < mVar.f13156a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < mVar.f13156a; i6++) {
                C4109n a = mVar.mo13173a(i6);
                int i7 = a.f12953o;
                if (i7 > 0 && (i3 = a.f12954p) > 0) {
                    Point v = m17942v(z, i, i2, i7, i3);
                    int i8 = a.f12953o;
                    int i9 = a.f12954p;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (((float) v.x) * 0.98f)) && i9 >= ((int) (((float) v.y) * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int w = mVar.mo13173a(((Integer) arrayList.get(size)).intValue()).mo13065w();
                    if (w == -1 || w > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    protected static boolean m17944x(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: y */
    private static boolean m17945y(C4109n nVar, int i, C4222a aVar) {
        if (!m17944x(i, false) || nVar.f12961w != aVar.f13496a || nVar.f12962x != aVar.f13497b) {
            return false;
        }
        String str = aVar.f13498c;
        return str == null || TextUtils.equals(str, nVar.f12949k);
    }

    /* renamed from: z */
    private static boolean m17946z(C4109n nVar, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m17944x(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C4284w.m18236b(nVar.f12949k, str)) {
            return false;
        }
        int i6 = nVar.f12953o;
        if (i6 != -1 && i6 > i3) {
            return false;
        }
        int i7 = nVar.f12954p;
        if (i7 != -1 && i7 > i4) {
            return false;
        }
        int i8 = nVar.f12945g;
        return i8 == -1 || i8 <= i5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C4229e mo13338B(C4146n nVar, int[][] iArr, C4224c cVar, C4229e.C4230a aVar) throws C3848h {
        C4146n nVar2 = nVar;
        C4224c cVar2 = cVar;
        C4229e.C4230a aVar2 = aVar;
        C4223b bVar = null;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < nVar2.f13160a; i3++) {
            C4145m a = nVar2.mo13177a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a.f13156a; i4++) {
                if (m17944x(iArr2[i4], cVar2.f13521o)) {
                    C4223b bVar2 = new C4223b(a.mo13173a(i4), cVar2, iArr2[i4]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i = i3;
                        i2 = i4;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        C4145m a2 = nVar2.mo13177a(i);
        if (!cVar2.f13518l && aVar2 != null) {
            int[] s = m17939s(a2, iArr[i], cVar2.f13519m);
            if (s.length > 0) {
                return aVar2.mo13356a(a2, s);
            }
        }
        return new C4225c(a2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C4229e mo13339D(int i, C4146n nVar, int[][] iArr, C4224c cVar) throws C3848h {
        C4145m mVar = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < nVar.f13160a; i4++) {
            C4145m a = nVar.mo13177a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a.f13156a; i5++) {
                if (m17944x(iArr2[i5], cVar.f13521o)) {
                    int i6 = 1;
                    if ((a.mo13173a(i5).f12940C & 1) != 0) {
                        i6 = 2;
                    }
                    if (m17944x(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i3) {
                        mVar = a;
                        i2 = i5;
                        i3 = i6;
                    }
                }
            }
        }
        if (mVar == null) {
            return null;
        }
        return new C4225c(mVar, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C4229e mo13340E(C4146n nVar, int[][] iArr, C4224c cVar) throws C3848h {
        C4146n nVar2 = nVar;
        C4224c cVar2 = cVar;
        C4145m mVar = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < nVar2.f13160a; i3++) {
            C4145m a = nVar2.mo13177a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a.f13156a; i4++) {
                if (m17944x(iArr2[i4], cVar2.f13521o)) {
                    C4109n a2 = a.mo13173a(i4);
                    int i5 = a2.f12940C & (cVar2.f13510d ^ -1);
                    int i6 = 1;
                    boolean z = (i5 & 1) != 0;
                    boolean z2 = (i5 & 2) != 0;
                    boolean p = m17936p(a2, cVar2.f13508b);
                    if (p || (cVar2.f13509c && m17937q(a2))) {
                        i6 = (z ? 8 : !z2 ? 6 : 4) + (p ? 1 : 0);
                    } else if (z) {
                        i6 = 3;
                    } else if (z2) {
                        if (m17936p(a2, cVar2.f13507a)) {
                            i6 = 2;
                        }
                    }
                    if (m17944x(iArr2[i4], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i2) {
                        mVar = a;
                        i = i4;
                        i2 = i6;
                    }
                }
            }
        }
        if (mVar == null) {
            return null;
        }
        return new C4225c(mVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public C4229e mo13341F(C3831b0 b0Var, C4146n nVar, int[][] iArr, C4224c cVar, C4229e.C4230a aVar) throws C3848h {
        C4229e A = (cVar.f13518l || aVar == null) ? null : m17930A(b0Var, nVar, iArr, cVar, aVar);
        return A == null ? m17931C(nVar, iArr, cVar) : A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4229e[] mo13342k(C3831b0[] b0VarArr, C4146n[] nVarArr, int[][][] iArr) throws C3848h {
        C3831b0[] b0VarArr2 = b0VarArr;
        int length = b0VarArr2.length;
        C4229e[] eVarArr = new C4229e[length];
        C4224c cVar = this.f13495e.get();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i >= length) {
                break;
            }
            if (2 == b0VarArr2[i].mo12416i()) {
                if (!z) {
                    eVarArr[i] = mo13341F(b0VarArr2[i], nVarArr[i], iArr[i], cVar, this.f13494d);
                    z = eVarArr[i] != null;
                }
                if (nVarArr[i].f13160a <= 0) {
                    z3 = false;
                }
                z2 |= z3;
            }
            i++;
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = b0VarArr2[i2].mo12416i();
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        eVarArr[i2] = mo13339D(b0VarArr2[i2].mo12416i(), nVarArr[i2], iArr[i2], cVar);
                    } else if (!z5) {
                        eVarArr[i2] = mo13340E(nVarArr[i2], iArr[i2], cVar);
                        z5 = eVarArr[i2] != null;
                    }
                }
            } else if (!z4) {
                eVarArr[i2] = mo13338B(nVarArr[i2], iArr[i2], cVar, z2 ? null : this.f13494d);
                z4 = eVarArr[i2] != null;
            }
        }
        return eVarArr;
    }
}
