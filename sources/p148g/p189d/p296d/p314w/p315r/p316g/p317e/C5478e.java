package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.r.g.e.e */
final class C5478e extends C5482i {

    /* renamed from: c */
    private final String f15868c;

    /* renamed from: d */
    private final String f15869d;

    C5478e(C5411a aVar, String str, String str2) {
        super(aVar);
        this.f15868c = str2;
        this.f15869d = str;
    }

    /* renamed from: k */
    private void m22611k(StringBuilder sb, int i) {
        int f = mo15803b().mo15827f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f15868c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    /* renamed from: d */
    public String mo15799d() throws C5377i {
        if (mo15804c().mo15656i() == 84) {
            StringBuilder sb = new StringBuilder();
            mo15800f(sb, 8);
            mo15802j(sb, 48, 20);
            m22611k(sb, 68);
            return sb.toString();
        }
        throw C5377i.m22193a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo15797h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f15869d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo15798i(int i) {
        return i % 100000;
    }
}
