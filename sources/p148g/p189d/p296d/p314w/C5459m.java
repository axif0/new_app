package p148g.p189d.p296d.p314w;

import java.util.EnumMap;
import java.util.Map;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5382n;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.m */
final class C5459m {

    /* renamed from: a */
    private final int[] f15812a = new int[4];

    /* renamed from: b */
    private final StringBuilder f15813b = new StringBuilder();

    C5459m() {
    }

    /* renamed from: a */
    private int m22520a(C5411a aVar, int[] iArr, StringBuilder sb) throws C5377i {
        int[] iArr2 = this.f15812a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.mo15656i();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 2 && i2 < i; i4++) {
            int k = C5462p.m22531k(aVar, iArr2, i2, C5462p.f15823g);
            sb.append((char) ((k % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k >= 10) {
                i3 |= 1 << (1 - i4);
            }
            if (i4 != 1) {
                i2 = aVar.mo15654g(aVar.mo15653f(i2));
            }
        }
        if (sb.length() != 2) {
            throw C5377i.m22193a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i3) {
            return i2;
        } else {
            throw C5377i.m22193a();
        }
    }

    /* renamed from: c */
    private static Map<C5382n, Object> m22521c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5382n.class);
        enumMap.put(C5382n.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5381m mo15757b(int i, C5411a aVar, int[] iArr) throws C5377i {
        StringBuilder sb = this.f15813b;
        sb.setLength(0);
        int a = m22520a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C5382n, Object> c = m22521c(sb2);
        float f = (float) i;
        C5381m mVar = new C5381m(sb2, (byte[]) null, new C5383o[]{new C5383o(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C5383o((float) a, f)}, C5369a.UPC_EAN_EXTENSION);
        if (c != null) {
            mVar.mo15615g(c);
        }
        return mVar;
    }
}
