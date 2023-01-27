package p148g.p189d.p296d.p314w.p315r.p316g.p317e;

import p148g.p189d.p296d.C5374f;
import p148g.p189d.p296d.C5377i;
import p148g.p189d.p296d.p304s.C5411a;

/* renamed from: g.d.d.w.r.g.e.s */
final class C5493s {

    /* renamed from: a */
    private final C5411a f15892a;

    /* renamed from: b */
    private final C5486m f15893b = new C5486m();

    /* renamed from: c */
    private final StringBuilder f15894c = new StringBuilder();

    C5493s(C5411a aVar) {
        this.f15892a = aVar;
    }

    /* renamed from: b */
    private C5488n m22651b(int i) {
        char c;
        int f = mo15827f(i, 5);
        if (f == 15) {
            return new C5488n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C5488n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo15827f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C5488n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f2)));
        }
        return new C5488n(i + 6, c);
    }

    /* renamed from: d */
    private C5488n m22652d(int i) throws C5374f {
        char c;
        int f = mo15827f(i, 5);
        if (f == 15) {
            return new C5488n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C5488n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo15827f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C5488n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C5488n(i + 7, (char) (f2 + 7));
        }
        switch (mo15827f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C5374f.m22179a();
        }
        return new C5488n(i + 8, c);
    }

    /* renamed from: e */
    private C5490p m22653e(int i) throws C5374f {
        int i2 = i + 7;
        if (i2 > this.f15892a.mo15656i()) {
            int f = mo15827f(i, 4);
            return f == 0 ? new C5490p(this.f15892a.mo15656i(), 10, 10) : new C5490p(this.f15892a.mo15656i(), f - 1, 10);
        }
        int f2 = mo15827f(i, 7) - 8;
        return new C5490p(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: g */
    static int m22654g(C5411a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo15650d(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m22655h(int i) {
        int i2 = i + 3;
        if (i2 > this.f15892a.mo15656i()) {
            return false;
        }
        while (i < i2) {
            if (this.f15892a.mo15650d(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m22656i(int i) {
        int i2;
        if (i + 1 > this.f15892a.mo15656i()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f15892a.mo15656i()) {
            if (i3 == 2) {
                if (!this.f15892a.mo15650d(i + 2)) {
                    return false;
                }
            } else if (this.f15892a.mo15650d(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m22657j(int i) {
        int i2;
        if (i + 1 > this.f15892a.mo15656i()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f15892a.mo15656i()) {
            if (this.f15892a.mo15650d(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = mo15827f(r6, 6);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22658k(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            g.d.d.s.a r1 = r5.f15892a
            int r1 = r1.mo15656i()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.mo15827f(r6, r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            g.d.d.s.a r1 = r5.f15892a
            int r1 = r1.mo15656i()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.mo15827f(r6, r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            return r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.p315r.p316g.p317e.C5493s.m22658k(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = mo15827f(r5, 8);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22659l(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            g.d.d.s.a r1 = r4.f15892a
            int r1 = r1.mo15656i()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.mo15827f(r5, r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            g.d.d.s.a r1 = r4.f15892a
            int r1 = r1.mo15656i()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.mo15827f(r5, r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            g.d.d.s.a r1 = r4.f15892a
            int r1 = r1.mo15656i()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.mo15827f(r5, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            return r3
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p296d.p314w.p315r.p316g.p317e.C5493s.m22659l(int):boolean");
    }

    /* renamed from: m */
    private boolean m22660m(int i) {
        if (i + 7 > this.f15892a.mo15656i()) {
            return i + 4 <= this.f15892a.mo15656i();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f15892a.mo15650d(i3);
            }
            if (this.f15892a.mo15650d(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: n */
    private C5485l m22661n() {
        while (m22658k(this.f15893b.mo15807a())) {
            C5488n b = m22651b(this.f15893b.mo15807a());
            this.f15893b.mo15814h(b.mo15824a());
            if (b.mo15816c()) {
                return new C5485l(new C5489o(this.f15893b.mo15807a(), this.f15894c.toString()), true);
            }
            this.f15894c.append(b.mo15815b());
        }
        if (m22655h(this.f15893b.mo15807a())) {
            this.f15893b.mo15808b(3);
            this.f15893b.mo15813g();
        } else if (m22656i(this.f15893b.mo15807a())) {
            if (this.f15893b.mo15807a() + 5 < this.f15892a.mo15656i()) {
                this.f15893b.mo15808b(5);
            } else {
                this.f15893b.mo15814h(this.f15892a.mo15656i());
            }
            this.f15893b.mo15812f();
        }
        return new C5485l(false);
    }

    /* renamed from: o */
    private C5489o m22662o() throws C5374f {
        C5485l n;
        boolean b;
        do {
            int a = this.f15893b.mo15807a();
            n = this.f15893b.mo15809c() ? m22661n() : this.f15893b.mo15810d() ? m22663p() : m22664q();
            b = n.mo15806b();
            if (!(a != this.f15893b.mo15807a()) && !b) {
                break;
            }
        } while (!b);
        return n.mo15805a();
    }

    /* renamed from: p */
    private C5485l m22663p() throws C5374f {
        while (m22659l(this.f15893b.mo15807a())) {
            C5488n d = m22652d(this.f15893b.mo15807a());
            this.f15893b.mo15814h(d.mo15824a());
            if (d.mo15816c()) {
                return new C5485l(new C5489o(this.f15893b.mo15807a(), this.f15894c.toString()), true);
            }
            this.f15894c.append(d.mo15815b());
        }
        if (m22655h(this.f15893b.mo15807a())) {
            this.f15893b.mo15808b(3);
            this.f15893b.mo15813g();
        } else if (m22656i(this.f15893b.mo15807a())) {
            if (this.f15893b.mo15807a() + 5 < this.f15892a.mo15656i()) {
                this.f15893b.mo15808b(5);
            } else {
                this.f15893b.mo15814h(this.f15892a.mo15656i());
            }
            this.f15893b.mo15811e();
        }
        return new C5485l(false);
    }

    /* renamed from: q */
    private C5485l m22664q() throws C5374f {
        while (m22660m(this.f15893b.mo15807a())) {
            C5490p e = m22653e(this.f15893b.mo15807a());
            this.f15893b.mo15814h(e.mo15824a());
            if (e.mo15822d()) {
                return new C5485l(e.mo15823e() ? new C5489o(this.f15893b.mo15807a(), this.f15894c.toString()) : new C5489o(this.f15893b.mo15807a(), this.f15894c.toString(), e.mo15821c()), true);
            }
            this.f15894c.append(e.mo15820b());
            if (e.mo15823e()) {
                return new C5485l(new C5489o(this.f15893b.mo15807a(), this.f15894c.toString()), true);
            }
            this.f15894c.append(e.mo15821c());
        }
        if (m22657j(this.f15893b.mo15807a())) {
            this.f15893b.mo15811e();
            this.f15893b.mo15808b(4);
        }
        return new C5485l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo15825a(StringBuilder sb, int i) throws C5377i, C5374f {
        String str = null;
        while (true) {
            C5489o c = mo15826c(i, str);
            String a = C5492r.m22648a(c.mo15817b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo15819d() ? String.valueOf(c.mo15818c()) : null;
            if (i == c.mo15824a()) {
                return sb.toString();
            }
            i = c.mo15824a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5489o mo15826c(int i, String str) throws C5374f {
        this.f15894c.setLength(0);
        if (str != null) {
            this.f15894c.append(str);
        }
        this.f15893b.mo15814h(i);
        C5489o o = m22662o();
        return (o == null || !o.mo15819d()) ? new C5489o(this.f15893b.mo15807a(), this.f15894c.toString()) : new C5489o(this.f15893b.mo15807a(), this.f15894c.toString(), o.mo15818c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo15827f(int i, int i2) {
        return m22654g(this.f15892a, i, i2);
    }
}
