package p148g.p189d.p296d.p314w;

import java.util.EnumMap;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5382n;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.n */
final class C5460n {

    /* renamed from: c */
    private static final int[] f15814c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f15815a = new int[4];

    /* renamed from: b */
    private final StringBuilder f15816b = new StringBuilder();

    C5460n() {
    }

    /* renamed from: a */
    private int m22523a(C5411a aVar, int[] iArr, StringBuilder sb) throws C5377i {
        int[] iArr2 = this.f15815a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.mo15656i();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 5 && i2 < i; i4++) {
            int k = C5462p.m22531k(aVar, iArr2, i2, C5462p.f15823g);
            sb.append((char) ((k % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k >= 10) {
                i3 |= 1 << (4 - i4);
            }
            if (i4 != 4) {
                i2 = aVar.mo15654g(aVar.mo15653f(i2));
            }
        }
        if (sb.length() == 5) {
            if (m22525d(sb.toString()) == m22524c(i3)) {
                return i2;
            }
            throw C5377i.m22193a();
        }
        throw C5377i.m22193a();
    }

    /* renamed from: c */
    private static int m22524c(int i) throws C5377i {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f15814c[i2]) {
                return i2;
            }
        }
        throw C5377i.m22193a();
    }

    /* renamed from: d */
    private static int m22525d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.equals("90000") != false) goto L_0x003d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m22526e(java.lang.String r6) {
        /*
            r0 = 0
            char r1 = r6.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L_0x004f
            r2 = 53
            if (r1 == r2) goto L_0x004c
            r2 = 57
            if (r1 == r2) goto L_0x0015
            goto L_0x0051
        L_0x0015:
            r1 = -1
            int r2 = r6.hashCode()
            r5 = 2
            switch(r2) {
                case 54118329: goto L_0x0033;
                case 54395376: goto L_0x0029;
                case 54395377: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x003c
        L_0x001f:
            java.lang.String r0 = "99991"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x0029:
            java.lang.String r0 = "99990"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003c
            r0 = 2
            goto L_0x003d
        L_0x0033:
            java.lang.String r2 = "90000"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = -1
        L_0x003d:
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x0047
            if (r0 == r5) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            java.lang.String r6 = "Used"
            return r6
        L_0x0047:
            java.lang.String r6 = "0.00"
            return r6
        L_0x004a:
            r6 = 0
            return r6
        L_0x004c:
            java.lang.String r3 = "$"
            goto L_0x0051
        L_0x004f:
            java.lang.String r3 = "£"
        L_0x0051:
            java.lang.String r6 = r6.substring(r4)
            int r6 = java.lang.Integer.parseInt(r6)
            int r0 = r6 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r6 % 100
            r1 = 10
            if (r6 >= r1) goto L_0x0070
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "0"
            java.lang.String r6 = r1.concat(r6)
            goto L_0x0074
        L_0x0070:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x0074:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.C5460n.m22526e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map<C5382n, Object> m22527f(String str) {
        String e;
        if (str.length() != 5 || (e = m22526e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5382n.class);
        enumMap.put(C5382n.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5381m mo15758b(int i, C5411a aVar, int[] iArr) throws C5377i {
        StringBuilder sb = this.f15816b;
        sb.setLength(0);
        int a = m22523a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C5382n, Object> f = m22527f(sb2);
        float f2 = (float) i;
        C5381m mVar = new C5381m(sb2, (byte[]) null, new C5383o[]{new C5383o(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C5383o((float) a, f2)}, C5369a.UPC_EAN_EXTENSION);
        if (f != null) {
            mVar.mo15615g(f);
        }
        return mVar;
    }
}
