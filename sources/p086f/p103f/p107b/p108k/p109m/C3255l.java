package p086f.p103f.p107b.p108k.p109m;

import p086f.p103f.p107b.p108k.C3229e;
import p086f.p103f.p107b.p108k.p109m.C3247f;

/* renamed from: f.f.b.k.m.l */
public class C3255l extends C3257m {

    /* renamed from: k */
    public C3247f f10474k;

    /* renamed from: l */
    C3249g f10475l = null;

    /* renamed from: f.f.b.k.m.l$a */
    static /* synthetic */ class C3256a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10476a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                f.f.b.k.m.m$b[] r0 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10476a = r0
                f.f.b.k.m.m$b r1 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10476a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.k.m.m$b r1 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10476a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.k.m.m$b r1 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3255l.C3256a.<clinit>():void");
        }
    }

    public C3255l(C3229e eVar) {
        super(eVar);
        C3247f fVar = new C3247f(this);
        this.f10474k = fVar;
        this.f10484h.f10450e = C3247f.C3248a.TOP;
        this.f10485i.f10450e = C3247f.C3248a.BOTTOM;
        fVar.f10450e = C3247f.C3248a.BASELINE;
        this.f10482f = 1;
    }

    /* renamed from: a */
    public void mo11388a(C3245d dVar) {
        int i;
        float f;
        int i2 = C3256a.f10476a[this.f10486j.ordinal()];
        if (i2 == 1) {
            mo11422p(dVar);
        } else if (i2 == 2) {
            mo11421o(dVar);
        } else if (i2 == 3) {
            C3229e eVar = this.f10478b;
            mo11420n(dVar, eVar.f10389z, eVar.f10334B, 1);
            return;
        }
        C3249g gVar = this.f10481e;
        if (gVar.f10448c && !gVar.f10455j && this.f10480d == C3229e.C3231b.MATCH_CONSTRAINT) {
            C3229e eVar2 = this.f10478b;
            int i3 = eVar2.f10374k;
            if (i3 == 2) {
                C3229e E = eVar2.mo11281E();
                if (E != null) {
                    C3249g gVar2 = E.f10367e.f10481e;
                    if (gVar2.f10455j) {
                        i = (int) ((((float) gVar2.f10452g) * this.f10478b.f10381r) + 0.5f);
                    }
                }
            } else if (i3 == 3 && eVar2.f10365d.f10481e.f10455j) {
                int s = eVar2.mo11334s();
                if (s != -1) {
                    if (s == 0) {
                        C3229e eVar3 = this.f10478b;
                        f = ((float) eVar3.f10365d.f10481e.f10452g) * eVar3.mo11332r();
                        i = (int) (f + 0.5f);
                    } else if (s != 1) {
                        i = 0;
                    }
                }
                C3229e eVar4 = this.f10478b;
                f = ((float) eVar4.f10365d.f10481e.f10452g) / eVar4.mo11332r();
                i = (int) (f + 0.5f);
            }
            this.f10481e.mo11406d(i);
        }
        C3247f fVar = this.f10484h;
        if (fVar.f10448c) {
            C3247f fVar2 = this.f10485i;
            if (fVar2.f10448c) {
                if (!fVar.f10455j || !fVar2.f10455j || !this.f10481e.f10455j) {
                    if (!this.f10481e.f10455j && this.f10480d == C3229e.C3231b.MATCH_CONSTRAINT) {
                        C3229e eVar5 = this.f10478b;
                        if (eVar5.f10373j == 0 && !eVar5.mo11300V()) {
                            int i4 = this.f10484h.f10457l.get(0).f10452g;
                            C3247f fVar3 = this.f10484h;
                            int i5 = i4 + fVar3.f10451f;
                            int i6 = this.f10485i.f10457l.get(0).f10452g + this.f10485i.f10451f;
                            fVar3.mo11406d(i5);
                            this.f10485i.mo11406d(i6);
                            this.f10481e.mo11406d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f10481e.f10455j && this.f10480d == C3229e.C3231b.MATCH_CONSTRAINT && this.f10477a == 1 && this.f10484h.f10457l.size() > 0 && this.f10485i.f10457l.size() > 0) {
                        int i7 = (this.f10485i.f10457l.get(0).f10452g + this.f10485i.f10451f) - (this.f10484h.f10457l.get(0).f10452g + this.f10484h.f10451f);
                        C3249g gVar3 = this.f10481e;
                        int i8 = gVar3.f10467m;
                        if (i7 < i8) {
                            gVar3.mo11406d(i7);
                        } else {
                            gVar3.mo11406d(i8);
                        }
                    }
                    if (this.f10481e.f10455j && this.f10484h.f10457l.size() > 0 && this.f10485i.f10457l.size() > 0) {
                        C3247f fVar4 = this.f10484h.f10457l.get(0);
                        C3247f fVar5 = this.f10485i.f10457l.get(0);
                        int i9 = fVar4.f10452g + this.f10484h.f10451f;
                        int i10 = fVar5.f10452g + this.f10485i.f10451f;
                        float I = this.f10478b.mo11288I();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f10452g;
                            i10 = fVar5.f10452g;
                            I = 0.5f;
                        }
                        this.f10484h.mo11406d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f10481e.f10452g)) * I)));
                        this.f10485i.mo11406d(this.f10484h.f10452g + this.f10481e.f10452g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ed, code lost:
        if (r9.f10478b.mo11296Q() != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x034e, code lost:
        if (r0.f10480d == p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0380, code lost:
        if (r9.f10478b.mo11296Q() != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03f9, code lost:
        if (r0.f10480d == p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT) goto L_0x03fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11389d() {
        /*
            r9 = this;
            f.f.b.k.e r0 = r9.f10478b
            boolean r1 = r0.f10359a
            if (r1 == 0) goto L_0x000f
            f.f.b.k.m.g r1 = r9.f10481e
            int r0 = r0.mo11336t()
            r1.mo11406d(r0)
        L_0x000f:
            f.f.b.k.m.g r0 = r9.f10481e
            boolean r0 = r0.f10455j
            if (r0 != 0) goto L_0x0097
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.e$b r0 = r0.mo11290K()
            r9.f10480d = r0
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x002c
            f.f.b.k.m.a r0 = new f.f.b.k.m.a
            r0.<init>(r9)
            r9.f10475l = r0
        L_0x002c:
            f.f.b.k.e$b r0 = r9.f10480d
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.e r0 = r0.mo11281E()
            if (r0 == 0) goto L_0x0085
            f.f.b.k.e$b r1 = r0.mo11290K()
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.mo11336t()
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d r2 = r2.f10389z
            int r2 = r2.mo11261b()
            int r1 = r1 - r2
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d r2 = r2.f10334B
            int r2 = r2.mo11261b()
            int r1 = r1 - r2
            f.f.b.k.m.f r2 = r9.f10484h
            f.f.b.k.m.l r3 = r0.f10367e
            f.f.b.k.m.f r3 = r3.f10484h
            f.f.b.k.e r4 = r9.f10478b
            f.f.b.k.d r4 = r4.f10389z
            int r4 = r4.mo11261b()
            r9.mo11414b(r2, r3, r4)
            f.f.b.k.m.f r2 = r9.f10485i
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.f r0 = r0.f10485i
            f.f.b.k.e r3 = r9.f10478b
            f.f.b.k.d r3 = r3.f10334B
            int r3 = r3.mo11261b()
            int r3 = -r3
            r9.mo11414b(r2, r0, r3)
            f.f.b.k.m.g r0 = r9.f10481e
            r0.mo11406d(r1)
            return
        L_0x0085:
            f.f.b.k.e$b r0 = r9.f10480d
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r0 != r1) goto L_0x00d1
            f.f.b.k.m.g r0 = r9.f10481e
            f.f.b.k.e r1 = r9.f10478b
            int r1 = r1.mo11336t()
            r0.mo11406d(r1)
            goto L_0x00d1
        L_0x0097:
            f.f.b.k.e$b r0 = r9.f10480d
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.e r0 = r0.mo11281E()
            if (r0 == 0) goto L_0x00d1
            f.f.b.k.e$b r1 = r0.mo11290K()
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.FIXED
            if (r1 != r2) goto L_0x00d1
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.l r2 = r0.f10367e
            f.f.b.k.m.f r2 = r2.f10484h
            f.f.b.k.e r3 = r9.f10478b
            f.f.b.k.d r3 = r3.f10389z
            int r3 = r3.mo11261b()
            r9.mo11414b(r1, r2, r3)
            f.f.b.k.m.f r1 = r9.f10485i
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.f r0 = r0.f10485i
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d r2 = r2.f10334B
            int r2 = r2.mo11261b()
            int r2 = -r2
            r9.mo11414b(r1, r0, r2)
            return
        L_0x00d1:
            f.f.b.k.m.g r0 = r9.f10481e
            boolean r0 = r0.f10455j
            r1 = 0
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 3
            if (r0 == 0) goto L_0x023d
            f.f.b.k.e r0 = r9.f10478b
            boolean r6 = r0.f10359a
            if (r6 == 0) goto L_0x023d
            f.f.b.k.d[] r6 = r0.f10339G
            r7 = r6[r4]
            f.f.b.k.d r7 = r7.f10317d
            if (r7 == 0) goto L_0x016a
            r6 = r6[r5]
            f.f.b.k.d r6 = r6.f10317d
            if (r6 == 0) goto L_0x016a
            boolean r0 = r0.mo11300V()
            if (r0 == 0) goto L_0x0114
            f.f.b.k.m.f r0 = r9.f10484h
            f.f.b.k.e r1 = r9.f10478b
            f.f.b.k.d[] r1 = r1.f10339G
            r1 = r1[r4]
            int r1 = r1.mo11261b()
            r0.f10451f = r1
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.e r1 = r9.f10478b
            f.f.b.k.d[] r1 = r1.f10339G
            r1 = r1[r5]
            int r1 = r1.mo11261b()
            int r1 = -r1
            r0.f10451f = r1
            goto L_0x0153
        L_0x0114:
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.d[] r0 = r0.f10339G
            r0 = r0[r4]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x012f
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d[] r2 = r2.f10339G
            r2 = r2[r4]
            int r2 = r2.mo11261b()
            r9.mo11414b(r1, r0, r2)
        L_0x012f:
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.d[] r0 = r0.f10339G
            r0 = r0[r5]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x014b
            f.f.b.k.m.f r1 = r9.f10485i
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d[] r2 = r2.f10339G
            r2 = r2[r5]
            int r2 = r2.mo11261b()
            int r2 = -r2
            r9.mo11414b(r1, r0, r2)
        L_0x014b:
            f.f.b.k.m.f r0 = r9.f10484h
            r0.f10447b = r3
            f.f.b.k.m.f r0 = r9.f10485i
            r0.f10447b = r3
        L_0x0153:
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x0423
        L_0x015b:
            f.f.b.k.m.f r0 = r9.f10474k
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.e r2 = r9.f10478b
            int r2 = r2.mo11320l()
        L_0x0165:
            r9.mo11414b(r0, r1, r2)
            goto L_0x0423
        L_0x016a:
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.d[] r3 = r0.f10339G
            r6 = r3[r4]
            f.f.b.k.d r6 = r6.f10317d
            if (r6 == 0) goto L_0x019f
            r0 = r3[r4]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x0423
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d[] r2 = r2.f10339G
            r2 = r2[r4]
            int r2 = r2.mo11261b()
            r9.mo11414b(r1, r0, r2)
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10481e
            int r2 = r2.f10452g
            r9.mo11414b(r0, r1, r2)
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x0423
            goto L_0x015b
        L_0x019f:
            r4 = r3[r5]
            f.f.b.k.d r4 = r4.f10317d
            if (r4 == 0) goto L_0x01d2
            r0 = r3[r5]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x01c9
            f.f.b.k.m.f r1 = r9.f10485i
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d[] r2 = r2.f10339G
            r2 = r2[r5]
            int r2 = r2.mo11261b()
            int r2 = -r2
            r9.mo11414b(r1, r0, r2)
            f.f.b.k.m.f r0 = r9.f10484h
            f.f.b.k.m.f r1 = r9.f10485i
            f.f.b.k.m.g r2 = r9.f10481e
            int r2 = r2.f10452g
            int r2 = -r2
            r9.mo11414b(r0, r1, r2)
        L_0x01c9:
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x0423
            goto L_0x015b
        L_0x01d2:
            r4 = r3[r2]
            f.f.b.k.d r4 = r4.f10317d
            if (r4 == 0) goto L_0x01fd
            r0 = r3[r2]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x0423
            f.f.b.k.m.f r2 = r9.f10474k
            r9.mo11414b(r2, r0, r1)
            f.f.b.k.m.f r0 = r9.f10484h
            f.f.b.k.m.f r1 = r9.f10474k
            f.f.b.k.e r2 = r9.f10478b
            int r2 = r2.mo11320l()
            int r2 = -r2
            r9.mo11414b(r0, r1, r2)
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10481e
            int r2 = r2.f10452g
            goto L_0x0165
        L_0x01fd:
            boolean r1 = r0 instanceof p086f.p103f.p107b.p108k.C3235h
            if (r1 != 0) goto L_0x0423
            f.f.b.k.e r0 = r0.mo11281E()
            if (r0 == 0) goto L_0x0423
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.CENTER
            f.f.b.k.d r0 = r0.mo11318k(r1)
            f.f.b.k.d r0 = r0.f10317d
            if (r0 != 0) goto L_0x0423
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.e r0 = r0.mo11281E()
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.f r0 = r0.f10484h
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.e r2 = r9.f10478b
            int r2 = r2.mo11295P()
            r9.mo11414b(r1, r0, r2)
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10481e
            int r2 = r2.f10452g
            r9.mo11414b(r0, r1, r2)
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x0423
            goto L_0x015b
        L_0x023d:
            f.f.b.k.m.g r0 = r9.f10481e
            boolean r0 = r0.f10455j
            if (r0 != 0) goto L_0x0290
            f.f.b.k.e$b r0 = r9.f10480d
            f.f.b.k.e$b r6 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r0 != r6) goto L_0x0290
            f.f.b.k.e r0 = r9.f10478b
            int r6 = r0.f10374k
            if (r6 == r4) goto L_0x0262
            if (r6 == r5) goto L_0x0252
            goto L_0x0295
        L_0x0252:
            boolean r0 = r0.mo11300V()
            if (r0 != 0) goto L_0x0295
            f.f.b.k.e r0 = r9.f10478b
            int r6 = r0.f10373j
            if (r6 != r5) goto L_0x025f
            goto L_0x0295
        L_0x025f:
            f.f.b.k.m.j r0 = r0.f10365d
            goto L_0x026b
        L_0x0262:
            f.f.b.k.e r0 = r0.mo11281E()
            if (r0 != 0) goto L_0x0269
            goto L_0x0295
        L_0x0269:
            f.f.b.k.m.l r0 = r0.f10367e
        L_0x026b:
            f.f.b.k.m.g r0 = r0.f10481e
            f.f.b.k.m.g r6 = r9.f10481e
            java.util.List<f.f.b.k.m.f> r6 = r6.f10457l
            r6.add(r0)
            java.util.List<f.f.b.k.m.d> r0 = r0.f10456k
            f.f.b.k.m.g r6 = r9.f10481e
            r0.add(r6)
            f.f.b.k.m.g r0 = r9.f10481e
            r0.f10447b = r3
            java.util.List<f.f.b.k.m.d> r0 = r0.f10456k
            f.f.b.k.m.f r6 = r9.f10484h
            r0.add(r6)
            f.f.b.k.m.g r0 = r9.f10481e
            java.util.List<f.f.b.k.m.d> r0 = r0.f10456k
            f.f.b.k.m.f r6 = r9.f10485i
            r0.add(r6)
            goto L_0x0295
        L_0x0290:
            f.f.b.k.m.g r0 = r9.f10481e
            r0.mo11404b(r9)
        L_0x0295:
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.d[] r6 = r0.f10339G
            r7 = r6[r4]
            f.f.b.k.d r7 = r7.f10317d
            if (r7 == 0) goto L_0x02fa
            r6 = r6[r5]
            f.f.b.k.d r6 = r6.f10317d
            if (r6 == 0) goto L_0x02fa
            boolean r0 = r0.mo11300V()
            if (r0 == 0) goto L_0x02c9
            f.f.b.k.m.f r0 = r9.f10484h
            f.f.b.k.e r1 = r9.f10478b
            f.f.b.k.d[] r1 = r1.f10339G
            r1 = r1[r4]
            int r1 = r1.mo11261b()
            r0.f10451f = r1
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.e r1 = r9.f10478b
            f.f.b.k.d[] r1 = r1.f10339G
            r1 = r1[r5]
            int r1 = r1.mo11261b()
            int r1 = -r1
            r0.f10451f = r1
            goto L_0x02e7
        L_0x02c9:
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.d[] r0 = r0.f10339G
            r0 = r0[r4]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            f.f.b.k.e r1 = r9.f10478b
            f.f.b.k.d[] r1 = r1.f10339G
            r1 = r1[r5]
            f.f.b.k.m.f r1 = r9.mo11417h(r1)
            r0.mo11404b(r9)
            r1.mo11404b(r9)
            f.f.b.k.m.m$b r0 = p086f.p103f.p107b.p108k.p109m.C3257m.C3259b.CENTER
            r9.f10486j = r0
        L_0x02e7:
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x0415
        L_0x02ef:
            f.f.b.k.m.f r0 = r9.f10474k
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10475l
        L_0x02f5:
            r9.mo11415c(r0, r1, r3, r2)
            goto L_0x0415
        L_0x02fa:
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.d[] r6 = r0.f10339G
            r7 = r6[r4]
            f.f.b.k.d r7 = r7.f10317d
            r8 = 0
            if (r7 == 0) goto L_0x0352
            r0 = r6[r4]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x0415
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d[] r2 = r2.f10339G
            r2 = r2[r4]
            int r2 = r2.mo11261b()
            r9.mo11414b(r1, r0, r2)
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10481e
            r9.mo11415c(r0, r1, r3, r2)
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x0336
            f.f.b.k.m.f r0 = r9.f10474k
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10475l
            r9.mo11415c(r0, r1, r3, r2)
        L_0x0336:
            f.f.b.k.e$b r0 = r9.f10480d
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0415
            f.f.b.k.e r0 = r9.f10478b
            float r0 = r0.mo11332r()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0415
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.m.j r0 = r0.f10365d
            f.f.b.k.e$b r1 = r0.f10480d
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x0415
            goto L_0x03fb
        L_0x0352:
            r4 = r6[r5]
            f.f.b.k.d r4 = r4.f10317d
            r7 = -1
            if (r4 == 0) goto L_0x0384
            r0 = r6[r5]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x0415
            f.f.b.k.m.f r1 = r9.f10485i
            f.f.b.k.e r2 = r9.f10478b
            f.f.b.k.d[] r2 = r2.f10339G
            r2 = r2[r5]
            int r2 = r2.mo11261b()
            int r2 = -r2
            r9.mo11414b(r1, r0, r2)
            f.f.b.k.m.f r0 = r9.f10484h
            f.f.b.k.m.f r1 = r9.f10485i
            f.f.b.k.m.g r2 = r9.f10481e
            r9.mo11415c(r0, r1, r7, r2)
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x0415
            goto L_0x02ef
        L_0x0384:
            r4 = r6[r2]
            f.f.b.k.d r4 = r4.f10317d
            if (r4 == 0) goto L_0x03a8
            r0 = r6[r2]
            f.f.b.k.m.f r0 = r9.mo11417h(r0)
            if (r0 == 0) goto L_0x0415
            f.f.b.k.m.f r2 = r9.f10474k
            r9.mo11414b(r2, r0, r1)
            f.f.b.k.m.f r0 = r9.f10484h
            f.f.b.k.m.f r1 = r9.f10474k
            f.f.b.k.m.g r2 = r9.f10475l
            r9.mo11415c(r0, r1, r7, r2)
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10481e
            goto L_0x02f5
        L_0x03a8:
            boolean r1 = r0 instanceof p086f.p103f.p107b.p108k.C3235h
            if (r1 != 0) goto L_0x0415
            f.f.b.k.e r0 = r0.mo11281E()
            if (r0 == 0) goto L_0x0415
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.e r0 = r0.mo11281E()
            f.f.b.k.m.l r0 = r0.f10367e
            f.f.b.k.m.f r0 = r0.f10484h
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.e r2 = r9.f10478b
            int r2 = r2.mo11295P()
            r9.mo11414b(r1, r0, r2)
            f.f.b.k.m.f r0 = r9.f10485i
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10481e
            r9.mo11415c(r0, r1, r3, r2)
            f.f.b.k.e r0 = r9.f10478b
            boolean r0 = r0.mo11296Q()
            if (r0 == 0) goto L_0x03e1
            f.f.b.k.m.f r0 = r9.f10474k
            f.f.b.k.m.f r1 = r9.f10484h
            f.f.b.k.m.g r2 = r9.f10475l
            r9.mo11415c(r0, r1, r3, r2)
        L_0x03e1:
            f.f.b.k.e$b r0 = r9.f10480d
            f.f.b.k.e$b r1 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0415
            f.f.b.k.e r0 = r9.f10478b
            float r0 = r0.mo11332r()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0415
            f.f.b.k.e r0 = r9.f10478b
            f.f.b.k.m.j r0 = r0.f10365d
            f.f.b.k.e$b r1 = r0.f10480d
            f.f.b.k.e$b r2 = p086f.p103f.p107b.p108k.C3229e.C3231b.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x0415
        L_0x03fb:
            f.f.b.k.m.g r0 = r0.f10481e
            java.util.List<f.f.b.k.m.d> r0 = r0.f10456k
            f.f.b.k.m.g r1 = r9.f10481e
            r0.add(r1)
            f.f.b.k.m.g r0 = r9.f10481e
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            f.f.b.k.e r1 = r9.f10478b
            f.f.b.k.m.j r1 = r1.f10365d
            f.f.b.k.m.g r1 = r1.f10481e
            r0.add(r1)
            f.f.b.k.m.g r0 = r9.f10481e
            r0.f10446a = r9
        L_0x0415:
            f.f.b.k.m.g r0 = r9.f10481e
            java.util.List<f.f.b.k.m.f> r0 = r0.f10457l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0423
            f.f.b.k.m.g r0 = r9.f10481e
            r0.f10448c = r3
        L_0x0423:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3255l.mo11389d():void");
    }

    /* renamed from: e */
    public void mo11390e() {
        C3247f fVar = this.f10484h;
        if (fVar.f10455j) {
            this.f10478b.mo11280D0(fVar.f10452g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11391f() {
        this.f10479c = null;
        this.f10484h.mo11405c();
        this.f10485i.mo11405c();
        this.f10474k.mo11405c();
        this.f10481e.mo11405c();
        this.f10483g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo11393m() {
        return this.f10480d != C3229e.C3231b.MATCH_CONSTRAINT || this.f10478b.f10374k == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo11412q() {
        this.f10483g = false;
        this.f10484h.mo11405c();
        this.f10484h.f10455j = false;
        this.f10485i.mo11405c();
        this.f10485i.f10455j = false;
        this.f10474k.mo11405c();
        this.f10474k.f10455j = false;
        this.f10481e.f10455j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f10478b.mo11328p();
    }
}
