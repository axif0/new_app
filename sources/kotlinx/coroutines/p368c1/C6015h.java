package kotlinx.coroutines.p368c1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6080v;

/* renamed from: kotlinx.coroutines.c1.h */
public final class C6015h<E> {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f16968e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f16969f;

    /* renamed from: g */
    public static final C6021l f16970g = new C6021l("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C6016a f16971h = new C6016a((C5954e) null);
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f16972a;

    /* renamed from: b */
    public /* synthetic */ AtomicReferenceArray f16973b = new AtomicReferenceArray(this.f16974c);

    /* renamed from: c */
    private final int f16974c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f16975d;

    /* renamed from: kotlinx.coroutines.c1.h$a */
    public static final class C6016a {
        private C6016a() {
        }

        public /* synthetic */ C6016a(C5954e eVar) {
            this();
        }

        /* renamed from: a */
        public final int mo17073a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo17074b(long j, int i) {
            return mo17076d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo17075c(long j, int i) {
            return mo17076d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo17076d(long j, long j2) {
            return j & (j2 ^ -1);
        }
    }

    /* renamed from: kotlinx.coroutines.c1.h$b */
    public static final class C6017b {

        /* renamed from: a */
        public final int f16976a;

        public C6017b(int i) {
            this.f16976a = i;
        }
    }

    static {
        Class<C6015h> cls = C6015h.class;
        f16968e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f16969f = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    public C6015h(int i, boolean z) {
        this.f16974c = i;
        this.f16975d = z;
        boolean z2 = true;
        this.f16972a = i - 1;
        if (this.f16972a <= 1073741823) {
            if (!((this.f16974c & this.f16972a) != 0 ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: e */
    private final C6015h<E> m24618e(long j) {
        C6015h<E> hVar = new C6015h<>(this.f16974c * 2, this.f16975d);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f16972a;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f16973b.get(i3 & i);
                if (obj == null) {
                    obj = new C6017b(i);
                }
                hVar.f16973b.set(hVar.f16972a & i, obj);
                i++;
            } else {
                hVar._state$internal = f16971h.mo17076d(j, 1152921504606846976L);
                return hVar;
            }
        }
    }

    /* renamed from: f */
    private final C6015h<E> m24619f(long j) {
        while (true) {
            C6015h<E> hVar = (C6015h) this._next;
            if (hVar != null) {
                return hVar;
            }
            f16968e.compareAndSet(this, (Object) null, m24618e(j));
        }
    }

    /* renamed from: h */
    private final C6015h<E> m24620h(int i, E e) {
        Object obj = this.f16973b.get(this.f16972a & i);
        if (!(obj instanceof C6017b) || ((C6017b) obj).f16976a != i) {
            return null;
        }
        this.f16973b.set(i & this.f16972a, e);
        return this;
    }

    /* renamed from: j */
    private final long m24621j() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f16969f.compareAndSet(this, j, j2));
        return j2;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final C6015h<E> m24622m(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C6080v.m24813a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo17071k();
            }
        } while (!f16969f.compareAndSet(this, j, f16971h.mo17074b(j, i2)));
        this.f16973b.set(this.f16972a & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[LOOP:1: B:20:0x006c->B:23:0x007e, LOOP_START, PHI: r1 
      PHI: (r1v7 kotlinx.coroutines.c1.h) = (r1v6 kotlinx.coroutines.c1.h), (r1v9 kotlinx.coroutines.c1.h) binds: [B:19:0x0064, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo17068d(E r13) {
        /*
            r12 = this;
            java.lang.String r0 = "element"
            p351k.p361v.p363d.C5956g.m24501f(r13, r0)
        L_0x0005:
            long r3 = r12._state$internal
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r3
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0017
            kotlinx.coroutines.c1.h$a r13 = f16971h
            int r13 = r13.mo17073a(r3)
            return r13
        L_0x0017:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r3
            r9 = 0
            long r0 = r0 >> r9
            int r1 = (int) r0
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r0 = 30
            long r5 = r5 >> r0
            int r0 = (int) r5
            int r10 = r12.f16972a
            int r2 = r0 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0033
            return r6
        L_0x0033:
            boolean r2 = r12.f16975d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f16973b
            r11 = r0 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x0051
            int r2 = r12.f16974c
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0050
            int r0 = r0 - r1
            r0 = r0 & r5
            int r1 = r2 >> 1
            if (r0 <= r1) goto L_0x0005
        L_0x0050:
            return r6
        L_0x0051:
            int r1 = r0 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f16969f
            kotlinx.coroutines.c1.h$a r5 = f16971h
            long r5 = r5.mo17075c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0005
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f16973b
            r2 = r0 & r10
            r1.set(r2, r13)
            r1 = r12
        L_0x006c:
            long r2 = r1._state$internal
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            kotlinx.coroutines.c1.h r1 = r1.mo17071k()
            kotlinx.coroutines.c1.h r1 = r1.m24620h(r0, r13)
            if (r1 == 0) goto L_0x0081
            goto L_0x006c
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p368c1.C6015h.mo17068d(java.lang.Object):int");
    }

    /* renamed from: g */
    public final boolean mo17069g() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f16969f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: i */
    public final boolean mo17070i() {
        long j = this._state$internal;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: k */
    public final C6015h<E> mo17071k() {
        return m24619f(m24621j());
    }

    /* renamed from: l */
    public final Object mo17072l() {
        Object obj;
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                if ((this.f16972a & ((int) ((1152921503533105152L & j) >> 30))) != (this.f16972a & i)) {
                    obj = this.f16973b.get(this.f16972a & i);
                    if (obj != null) {
                        if (!(obj instanceof C6017b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!f16969f.compareAndSet(this, j, f16971h.mo17074b(j, i2))) {
                                if (this.f16975d) {
                                    C6015h hVar = this;
                                    do {
                                        hVar = hVar.m24622m(i, i2);
                                    } while (hVar != null);
                                    break;
                                }
                            } else {
                                this.f16973b.set(this.f16972a & i, (Object) null);
                                break;
                            }
                        } else {
                            return null;
                        }
                    } else if (this.f16975d) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return f16970g;
            }
        }
        return obj;
    }
}
