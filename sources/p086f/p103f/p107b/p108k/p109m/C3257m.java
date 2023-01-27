package p086f.p103f.p107b.p108k.p109m;

import p086f.p103f.p107b.p108k.C3226d;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: f.f.b.k.m.m */
public abstract class C3257m implements C3245d {

    /* renamed from: a */
    public int f10477a;

    /* renamed from: b */
    C3229e f10478b;

    /* renamed from: c */
    C3254k f10479c;

    /* renamed from: d */
    protected C3229e.C3231b f10480d;

    /* renamed from: e */
    C3249g f10481e = new C3249g(this);

    /* renamed from: f */
    public int f10482f = 0;

    /* renamed from: g */
    boolean f10483g = false;

    /* renamed from: h */
    public C3247f f10484h = new C3247f(this);

    /* renamed from: i */
    public C3247f f10485i = new C3247f(this);

    /* renamed from: j */
    protected C3259b f10486j = C3259b.NONE;

    /* renamed from: f.f.b.k.m.m$a */
    static /* synthetic */ class C3258a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10487a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.f.b.k.d$b[] r0 = p086f.p103f.p107b.p108k.C3226d.C3228b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10487a = r0
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10487a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10487a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10487a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10487a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.p109m.C3257m.C3258a.<clinit>():void");
        }
    }

    /* renamed from: f.f.b.k.m.m$b */
    enum C3259b {
        NONE,
        START,
        END,
        CENTER
    }

    public C3257m(C3229e eVar) {
        this.f10478b = eVar;
    }

    /* renamed from: l */
    private void m14055l(int i, int i2) {
        int i3;
        C3249g gVar;
        int i4 = this.f10477a;
        if (i4 != 0) {
            if (i4 == 1) {
                int g = mo11416g(this.f10481e.f10467m, i);
                gVar = this.f10481e;
                i3 = Math.min(g, i2);
                gVar.mo11406d(i3);
            } else if (i4 == 2) {
                C3229e E = this.f10478b.mo11281E();
                if (E != null) {
                    C3257m mVar = i == 0 ? E.f10365d : E.f10367e;
                    if (mVar.f10481e.f10455j) {
                        C3229e eVar = this.f10478b;
                        i2 = (int) ((((float) mVar.f10481e.f10452g) * (i == 0 ? eVar.f10378o : eVar.f10381r)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i4 == 3) {
                C3229e eVar2 = this.f10478b;
                C3252j jVar = eVar2.f10365d;
                C3229e.C3231b bVar = jVar.f10480d;
                C3229e.C3231b bVar2 = C3229e.C3231b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && jVar.f10477a == 3) {
                    C3255l lVar = eVar2.f10367e;
                    if (lVar.f10480d == bVar2 && lVar.f10477a == 3) {
                        return;
                    }
                }
                C3229e eVar3 = this.f10478b;
                C3257m mVar2 = i == 0 ? eVar3.f10367e : eVar3.f10365d;
                if (mVar2.f10481e.f10455j) {
                    float r = this.f10478b.mo11332r();
                    this.f10481e.mo11406d(i == 1 ? (int) ((((float) mVar2.f10481e.f10452g) / r) + 0.5f) : (int) ((r * ((float) mVar2.f10481e.f10452g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f10481e;
        i3 = mo11416g(i2, i);
        gVar.mo11406d(i3);
    }

    /* renamed from: a */
    public void mo11388a(C3245d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11414b(C3247f fVar, C3247f fVar2, int i) {
        fVar.f10457l.add(fVar2);
        fVar.f10451f = i;
        fVar2.f10456k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11415c(C3247f fVar, C3247f fVar2, int i, C3249g gVar) {
        fVar.f10457l.add(fVar2);
        fVar.f10457l.add(this.f10481e);
        fVar.f10453h = i;
        fVar.f10454i = gVar;
        fVar2.f10456k.add(fVar);
        gVar.f10456k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo11389d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo11390e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo11391f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo11416g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C3229e eVar = this.f10478b;
            int i4 = eVar.f10377n;
            i3 = Math.max(eVar.f10376m, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C3229e eVar2 = this.f10478b;
            int i5 = eVar2.f10380q;
            int max = Math.max(eVar2.f10379p, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C3247f mo11417h(C3226d dVar) {
        C3257m mVar;
        C3257m mVar2;
        C3226d dVar2 = dVar.f10317d;
        if (dVar2 == null) {
            return null;
        }
        C3229e eVar = dVar2.f10315b;
        int i = C3258a.f10487a[dVar2.f10316c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mVar2 = eVar.f10365d;
            } else if (i == 3) {
                mVar = eVar.f10367e;
            } else if (i == 4) {
                return eVar.f10367e.f10474k;
            } else {
                if (i != 5) {
                    return null;
                }
                mVar2 = eVar.f10367e;
            }
            return mVar2.f10485i;
        }
        mVar = eVar.f10365d;
        return mVar.f10484h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C3247f mo11418i(C3226d dVar, int i) {
        C3226d dVar2 = dVar.f10317d;
        if (dVar2 == null) {
            return null;
        }
        C3229e eVar = dVar2.f10315b;
        C3257m mVar = i == 0 ? eVar.f10365d : eVar.f10367e;
        int i2 = C3258a.f10487a[dVar.f10317d.f10316c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f10485i;
        }
        return mVar.f10484h;
    }

    /* renamed from: j */
    public long mo11392j() {
        C3249g gVar = this.f10481e;
        if (gVar.f10455j) {
            return (long) gVar.f10452g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo11419k() {
        return this.f10483g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo11393m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo11420n(C3245d dVar, C3226d dVar2, C3226d dVar3, int i) {
        C3247f fVar;
        C3247f h = mo11417h(dVar2);
        C3247f h2 = mo11417h(dVar3);
        if (h.f10455j && h2.f10455j) {
            int b = h.f10452g + dVar2.mo11261b();
            int b2 = h2.f10452g - dVar3.mo11261b();
            int i2 = b2 - b;
            if (!this.f10481e.f10455j && this.f10480d == C3229e.C3231b.MATCH_CONSTRAINT) {
                m14055l(i, i2);
            }
            C3249g gVar = this.f10481e;
            if (gVar.f10455j) {
                if (gVar.f10452g == i2) {
                    this.f10484h.mo11406d(b);
                    fVar = this.f10485i;
                } else {
                    C3229e eVar = this.f10478b;
                    float u = i == 0 ? eVar.mo11338u() : eVar.mo11288I();
                    if (h == h2) {
                        b = h.f10452g;
                        b2 = h2.f10452g;
                        u = 0.5f;
                    }
                    this.f10484h.mo11406d((int) (((float) b) + 0.5f + (((float) ((b2 - b) - this.f10481e.f10452g)) * u)));
                    fVar = this.f10485i;
                    b2 = this.f10484h.f10452g + this.f10481e.f10452g;
                }
                fVar.mo11406d(b2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo11421o(C3245d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo11422p(C3245d dVar) {
    }
}
