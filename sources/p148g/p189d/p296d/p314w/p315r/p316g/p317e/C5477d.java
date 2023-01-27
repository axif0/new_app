package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.r.g.e.d */
final class C5477d extends C5481h {
    C5477d(C5411a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo15799d() throws C5377i, C5374f {
        if (mo15804c().mo15656i() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo15800f(sb, 8);
            int f = mo15803b().mo15827f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo15803b().mo15827f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo15803b().mo15826c(60, (String) null).mo15817b());
            return sb.toString();
        }
        throw C5377i.m22193a();
    }
}
