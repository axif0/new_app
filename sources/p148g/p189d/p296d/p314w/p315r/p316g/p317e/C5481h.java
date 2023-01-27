package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.r.g.e.h */
abstract class C5481h extends C5483j {
    C5481h(C5411a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static void m22617e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo15800f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo15801g(sb, i, length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo15801g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo15803b().mo15827f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m22617e(sb, i2);
    }
}
