package p148g.p189d.p190a.p200b.p213m0;

import p148g.p189d.p190a.p200b.C4109n;

/* renamed from: g.d.a.b.m0.d */
public interface C4064d {

    /* renamed from: a */
    public static final C4064d f12845a = new C4065a();

    /* renamed from: g.d.a.b.m0.d$a */
    static class C4065a implements C4064d {
        C4065a() {
        }

        /* renamed from: a */
        public boolean mo12952a(C4109n nVar) {
            String str = nVar.f12949k;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p148g.p189d.p190a.p200b.p213m0.C4062b mo12953b(p148g.p189d.p190a.p200b.C4109n r5) {
            /*
                r4 = this;
                java.lang.String r5 = r5.f12949k
                int r0 = r5.hashCode()
                r1 = -1248341703(0xffffffffb597d139, float:-1.1311269E-6)
                r2 = 2
                r3 = 1
                if (r0 == r1) goto L_0x002c
                r1 = 1154383568(0x44ce7ed0, float:1651.9629)
                if (r0 == r1) goto L_0x0022
                r1 = 1652648887(0x62816bb7, float:1.1936958E21)
                if (r0 == r1) goto L_0x0018
                goto L_0x0036
            L_0x0018:
                java.lang.String r0 = "application/x-scte35"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = 2
                goto L_0x0037
            L_0x0022:
                java.lang.String r0 = "application/x-emsg"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = 1
                goto L_0x0037
            L_0x002c:
                java.lang.String r0 = "application/id3"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = 0
                goto L_0x0037
            L_0x0036:
                r5 = -1
            L_0x0037:
                if (r5 == 0) goto L_0x0051
                if (r5 == r3) goto L_0x004b
                if (r5 != r2) goto L_0x0043
                g.d.a.b.m0.j.c r5 = new g.d.a.b.m0.j.c
                r5.<init>()
                return r5
            L_0x0043:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r5.<init>(r0)
                throw r5
            L_0x004b:
                g.d.a.b.m0.h.b r5 = new g.d.a.b.m0.h.b
                r5.<init>()
                return r5
            L_0x0051:
                g.d.a.b.m0.i.g r5 = new g.d.a.b.m0.i.g
                r5.<init>()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p213m0.C4064d.C4065a.mo12953b(g.d.a.b.n):g.d.a.b.m0.b");
        }
    }

    /* renamed from: a */
    boolean mo12952a(C4109n nVar);

    /* renamed from: b */
    C4062b mo12953b(C4109n nVar);
}
