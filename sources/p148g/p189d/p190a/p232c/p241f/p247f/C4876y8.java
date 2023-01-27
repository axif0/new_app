package p148g.p189d.p190a.p232c.p241f.p247f;

import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: g.d.a.c.f.f.y8 */
final class C4876y8 implements C4619j8 {

    /* renamed from: a */
    private final C4655l8 f14650a;

    /* renamed from: b */
    private final String f14651b;

    /* renamed from: c */
    private final Object[] f14652c;

    /* renamed from: d */
    private final int f14653d;

    C4876y8(C4655l8 l8Var, String str, Object[] objArr) {
        this.f14650a = l8Var;
        this.f14651b = str;
        this.f14652c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14653d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f14653d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo14306a() {
        return (this.f14653d & 1) == 1 ? C4895z6.C4900e.f14688i : C4895z6.C4900e.f14689j;
    }

    /* renamed from: b */
    public final boolean mo14307b() {
        return (this.f14653d & 2) == 2;
    }

    /* renamed from: c */
    public final C4655l8 mo14308c() {
        return this.f14650a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo14767d() {
        return this.f14651b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Object[] mo14768e() {
        return this.f14652c;
    }
}
