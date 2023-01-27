package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.Log;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4273l;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.k0.t.p */
public final class C4021p implements C4031w {

    /* renamed from: a */
    private final C4008h f12651a;

    /* renamed from: b */
    private final C4273l f12652b = new C4273l(new byte[10]);

    /* renamed from: c */
    private int f12653c = 0;

    /* renamed from: d */
    private int f12654d;

    /* renamed from: e */
    private C4282u f12655e;

    /* renamed from: f */
    private boolean f12656f;

    /* renamed from: g */
    private boolean f12657g;

    /* renamed from: h */
    private boolean f12658h;

    /* renamed from: i */
    private int f12659i;

    /* renamed from: j */
    private int f12660j;

    /* renamed from: k */
    private boolean f12661k;

    /* renamed from: l */
    private long f12662l;

    public C4021p(C4008h hVar) {
        this.f12651a = hVar;
    }

    /* renamed from: d */
    private boolean m16977d(C4274m mVar, byte[] bArr, int i) {
        int min = Math.min(mVar.mo13456a(), i - this.f12654d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            mVar.mo13455K(min);
        } else {
            mVar.mo13462g(bArr, this.f12654d, min);
        }
        int i2 = this.f12654d + min;
        this.f12654d = i2;
        return i2 == i;
    }

    /* renamed from: e */
    private boolean m16978e() {
        this.f12652b.mo13441m(0);
        int h = this.f12652b.mo13436h(24);
        if (h != 1) {
            Log.w("PesReader", "Unexpected start code prefix: " + h);
            this.f12660j = -1;
            return false;
        }
        this.f12652b.mo13443o(8);
        int h2 = this.f12652b.mo13436h(16);
        this.f12652b.mo13443o(5);
        this.f12661k = this.f12652b.mo13435g();
        this.f12652b.mo13443o(2);
        this.f12656f = this.f12652b.mo13435g();
        this.f12657g = this.f12652b.mo13435g();
        this.f12652b.mo13443o(6);
        int h3 = this.f12652b.mo13436h(8);
        this.f12659i = h3;
        if (h2 == 0) {
            this.f12660j = -1;
        } else {
            this.f12660j = ((h2 + 6) - 9) - h3;
        }
        return true;
    }

    /* renamed from: f */
    private void m16979f() {
        this.f12652b.mo13441m(0);
        this.f12662l = -9223372036854775807L;
        if (this.f12656f) {
            this.f12652b.mo13443o(4);
            this.f12652b.mo13443o(1);
            this.f12652b.mo13443o(1);
            long h = (((long) this.f12652b.mo13436h(3)) << 30) | ((long) (this.f12652b.mo13436h(15) << 15)) | ((long) this.f12652b.mo13436h(15));
            this.f12652b.mo13443o(1);
            if (!this.f12658h && this.f12657g) {
                this.f12652b.mo13443o(4);
                this.f12652b.mo13443o(1);
                this.f12652b.mo13443o(1);
                this.f12652b.mo13443o(1);
                this.f12655e.mo13498b((((long) this.f12652b.mo13436h(3)) << 30) | ((long) (this.f12652b.mo13436h(15) << 15)) | ((long) this.f12652b.mo13436h(15)));
                this.f12658h = true;
            }
            this.f12662l = this.f12655e.mo13498b(h);
        }
    }

    /* renamed from: g */
    private void m16980g(int i) {
        this.f12653c = i;
        this.f12654d = 0;
    }

    /* renamed from: a */
    public final void mo12877a() {
        this.f12653c = 0;
        this.f12654d = 0;
        this.f12658h = false;
        this.f12651a.mo12847a();
    }

    /* renamed from: b */
    public void mo12878b(C4282u uVar, C3917g gVar, C4031w.C4035d dVar) {
        this.f12655e = uVar;
        this.f12651a.mo12851f(gVar, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be A[SYNTHETIC] */
    /* renamed from: c */
    public final void mo12879c(p148g.p189d.p190a.p200b.p230r0.C4274m r8, boolean r9) throws p148g.p189d.p190a.p200b.C4313u {
        /*
            r7 = this;
            r0 = -1
            r1 = 1
            r2 = 3
            r3 = 2
            if (r9 == 0) goto L_0x0037
            int r9 = r7.f12653c
            java.lang.String r4 = "PesReader"
            if (r9 == r3) goto L_0x002f
            if (r9 == r2) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            int r9 = r7.f12660j
            if (r9 == r0) goto L_0x006d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "Unexpected start indicator: expected "
            r9.append(r5)
            int r5 = r7.f12660j
            r9.append(r5)
            java.lang.String r5 = " more bytes"
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r4, r9)
            goto L_0x006d
        L_0x002f:
            java.lang.String r9 = "Unexpected start indicator reading extended header"
            android.util.Log.w(r4, r9)
        L_0x0034:
            r7.m16980g(r1)
        L_0x0037:
            int r9 = r8.mo13456a()
            if (r9 <= 0) goto L_0x00be
            int r9 = r7.f12653c
            if (r9 == 0) goto L_0x00b5
            r4 = 0
            if (r9 == r1) goto L_0x009e
            if (r9 == r3) goto L_0x0073
            if (r9 == r2) goto L_0x0049
            goto L_0x0037
        L_0x0049:
            int r9 = r8.mo13456a()
            int r5 = r7.f12660j
            if (r5 != r0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r4 = r9 - r5
        L_0x0054:
            if (r4 <= 0) goto L_0x005f
            int r9 = r9 - r4
            int r4 = r8.mo13458c()
            int r4 = r4 + r9
            r8.mo13453I(r4)
        L_0x005f:
            g.d.a.b.k0.t.h r4 = r7.f12651a
            r4.mo12848c(r8)
            int r4 = r7.f12660j
            if (r4 == r0) goto L_0x0037
            int r4 = r4 - r9
            r7.f12660j = r4
            if (r4 != 0) goto L_0x0037
        L_0x006d:
            g.d.a.b.k0.t.h r9 = r7.f12651a
            r9.mo12850e()
            goto L_0x0034
        L_0x0073:
            r9 = 10
            int r4 = r7.f12659i
            int r9 = java.lang.Math.min(r9, r4)
            g.d.a.b.r0.l r4 = r7.f12652b
            byte[] r4 = r4.f13639a
            boolean r9 = r7.m16977d(r8, r4, r9)
            if (r9 == 0) goto L_0x0037
            r9 = 0
            int r4 = r7.f12659i
            boolean r9 = r7.m16977d(r8, r9, r4)
            if (r9 == 0) goto L_0x0037
            r7.m16979f()
            g.d.a.b.k0.t.h r9 = r7.f12651a
            long r4 = r7.f12662l
            boolean r6 = r7.f12661k
            r9.mo12849d(r4, r6)
            r7.m16980g(r2)
            goto L_0x0037
        L_0x009e:
            g.d.a.b.r0.l r9 = r7.f12652b
            byte[] r9 = r9.f13639a
            r5 = 9
            boolean r9 = r7.m16977d(r8, r9, r5)
            if (r9 == 0) goto L_0x0037
            boolean r9 = r7.m16978e()
            if (r9 == 0) goto L_0x00b1
            r4 = 2
        L_0x00b1:
            r7.m16980g(r4)
            goto L_0x0037
        L_0x00b5:
            int r9 = r8.mo13456a()
            r8.mo13455K(r9)
            goto L_0x0037
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4021p.mo12879c(g.d.a.b.r0.m, boolean):void");
    }
}
