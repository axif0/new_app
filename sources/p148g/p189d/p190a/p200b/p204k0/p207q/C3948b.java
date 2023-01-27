package p148g.p189d.p190a.p200b.p204k0.p207q;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3915e;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3919i;
import p148g.p189d.p190a.p200b.p204k0.C3921j;
import p148g.p189d.p190a.p200b.p204k0.C3922k;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4084g;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.q.b */
public final class C3948b implements C3915e {

    /* renamed from: n */
    private static final int f12075n = C4284w.m18249o("Xing");

    /* renamed from: o */
    private static final int f12076o = C4284w.m18249o("Info");

    /* renamed from: p */
    private static final int f12077p = C4284w.m18249o("VBRI");

    /* renamed from: a */
    private final int f12078a;

    /* renamed from: b */
    private final long f12079b;

    /* renamed from: c */
    private final C4274m f12080c;

    /* renamed from: d */
    private final C3921j f12081d;

    /* renamed from: e */
    private final C3919i f12082e;

    /* renamed from: f */
    private C3917g f12083f;

    /* renamed from: g */
    private C3927n f12084g;

    /* renamed from: h */
    private int f12085h;

    /* renamed from: i */
    private C4059a f12086i;

    /* renamed from: j */
    private C3949a f12087j;

    /* renamed from: k */
    private long f12088k;

    /* renamed from: l */
    private long f12089l;

    /* renamed from: m */
    private int f12090m;

    /* renamed from: g.d.a.b.k0.q.b$a */
    interface C3949a extends C3923l {
        /* renamed from: f */
        long mo12792f(long j);
    }

    public C3948b(int i) {
        this(i, -9223372036854775807L);
    }

    public C3948b(int i, long j) {
        this.f12078a = i;
        this.f12079b = j;
        this.f12080c = new C4274m(10);
        this.f12081d = new C3921j();
        this.f12082e = new C3919i();
        this.f12088k = -9223372036854775807L;
    }

    /* renamed from: e */
    private C3949a m16592e(C3916f fVar) throws IOException, InterruptedException {
        fVar.mo12727i(this.f12080c.f13643a, 0, 4);
        this.f12080c.mo13454J(0);
        C3921j.m16470b(this.f12080c.mo13464i(), this.f12081d);
        return new C3947a(fVar.mo12722d(), fVar.mo12729k(), this.f12081d);
    }

    /* renamed from: f */
    private static int m16593f(C4274m mVar, int i) {
        if (mVar.mo13459d() >= i + 4) {
            mVar.mo13454J(i);
            int i2 = mVar.mo13464i();
            if (i2 == f12075n || i2 == f12076o) {
                return i2;
            }
        }
        if (mVar.mo13459d() < 40) {
            return 0;
        }
        mVar.mo13454J(36);
        int i3 = mVar.mo13464i();
        int i4 = f12077p;
        if (i3 == i4) {
            return i4;
        }
        return 0;
    }

    /* renamed from: g */
    private static boolean m16594g(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p148g.p189d.p190a.p200b.p204k0.p207q.C3948b.C3949a m16595i(p148g.p189d.p190a.p200b.p204k0.C3916f r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            g.d.a.b.r0.m r5 = new g.d.a.b.r0.m
            g.d.a.b.k0.j r0 = r9.f12081d
            int r0 = r0.f11904c
            r5.<init>((int) r0)
            byte[] r0 = r5.f13643a
            g.d.a.b.k0.j r1 = r9.f12081d
            int r1 = r1.f11904c
            r6 = 0
            r10.mo12727i(r0, r6, r1)
            g.d.a.b.k0.j r0 = r9.f12081d
            int r1 = r0.f11902a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            int r0 = r0.f11906e
            if (r1 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0028
            r3 = 36
            r7 = 36
            goto L_0x002f
        L_0x0026:
            if (r0 == r2) goto L_0x002b
        L_0x0028:
            r7 = 21
            goto L_0x002f
        L_0x002b:
            r3 = 13
            r7 = 13
        L_0x002f:
            int r8 = m16593f(r5, r7)
            int r0 = f12075n
            if (r8 == r0) goto L_0x005b
            int r0 = f12076o
            if (r8 != r0) goto L_0x003c
            goto L_0x005b
        L_0x003c:
            int r0 = f12077p
            if (r8 != r0) goto L_0x0056
            long r0 = r10.mo12722d()
            long r2 = r10.mo12729k()
            g.d.a.b.k0.j r4 = r9.f12081d
            g.d.a.b.k0.q.c r0 = p148g.p189d.p190a.p200b.p204k0.p207q.C3950c.m16605a(r0, r2, r4, r5)
            g.d.a.b.k0.j r1 = r9.f12081d
            int r1 = r1.f11904c
            r10.mo12724f(r1)
            goto L_0x00ab
        L_0x0056:
            r0 = 0
            r10.mo12723e()
            goto L_0x00ab
        L_0x005b:
            long r0 = r10.mo12722d()
            long r2 = r10.mo12729k()
            g.d.a.b.k0.j r4 = r9.f12081d
            g.d.a.b.k0.q.d r0 = p148g.p189d.p190a.p200b.p204k0.p207q.C3951d.m16610a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x0093
            g.d.a.b.k0.i r1 = r9.f12082e
            boolean r1 = r1.mo12746a()
            if (r1 != 0) goto L_0x0093
            r10.mo12723e()
            int r7 = r7 + 141
            r10.mo12728j(r7)
            g.d.a.b.r0.m r1 = r9.f12080c
            byte[] r1 = r1.f13643a
            r2 = 3
            r10.mo12727i(r1, r6, r2)
            g.d.a.b.r0.m r1 = r9.f12080c
            r1.mo13454J(r6)
            g.d.a.b.k0.i r1 = r9.f12082e
            g.d.a.b.r0.m r2 = r9.f12080c
            int r2 = r2.mo13445A()
            r1.mo12748d(r2)
        L_0x0093:
            g.d.a.b.k0.j r1 = r9.f12081d
            int r1 = r1.f11904c
            r10.mo12724f(r1)
            if (r0 == 0) goto L_0x00ab
            boolean r1 = r0.mo12716e()
            if (r1 != 0) goto L_0x00ab
            int r1 = f12076o
            if (r8 != r1) goto L_0x00ab
            g.d.a.b.k0.q.b$a r10 = r9.m16592e(r10)
            return r10
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p207q.C3948b.m16595i(g.d.a.b.k0.f):g.d.a.b.k0.q.b$a");
    }

    /* renamed from: j */
    private void m16596j(C3916f fVar) throws IOException, InterruptedException {
        int i = 0;
        while (true) {
            fVar.mo12727i(this.f12080c.f13643a, 0, 10);
            this.f12080c.mo13454J(0);
            if (this.f12080c.mo13445A() != C4084g.f12888b) {
                fVar.mo12723e();
                fVar.mo12728j(i);
                return;
            }
            this.f12080c.mo13455K(3);
            int w = this.f12080c.mo13478w();
            int i2 = w + 10;
            if (this.f12086i == null) {
                byte[] bArr = new byte[i2];
                System.arraycopy(this.f12080c.f13643a, 0, bArr, 0, 10);
                fVar.mo12727i(bArr, 10, w);
                C4059a c = new C4084g((this.f12078a & 2) != 0 ? C3919i.f11891c : null).mo13006c(bArr, i2);
                this.f12086i = c;
                if (c != null) {
                    this.f12082e.mo12747c(c);
                }
            } else {
                fVar.mo12728j(w);
            }
            i += i2;
        }
    }

    /* renamed from: k */
    private int m16597k(C3916f fVar) throws IOException, InterruptedException {
        if (this.f12090m == 0) {
            fVar.mo12723e();
            if (!fVar.mo12725g(this.f12080c.f13643a, 0, 4, true)) {
                return -1;
            }
            this.f12080c.mo13454J(0);
            int i = this.f12080c.mo13464i();
            if (!m16594g(i, (long) this.f12085h) || C3921j.m16469a(i) == -1) {
                fVar.mo12724f(1);
                this.f12085h = 0;
                return 0;
            }
            C3921j.m16470b(i, this.f12081d);
            if (this.f12088k == -9223372036854775807L) {
                this.f12088k = this.f12087j.mo12792f(fVar.mo12729k());
                if (this.f12079b != -9223372036854775807L) {
                    this.f12088k += this.f12079b - this.f12087j.mo12792f(0);
                }
            }
            this.f12090m = this.f12081d.f11904c;
        }
        int b = this.f12084g.mo12735b(fVar, this.f12090m, true);
        if (b == -1) {
            return -1;
        }
        int i2 = this.f12090m - b;
        this.f12090m = i2;
        if (i2 > 0) {
            return 0;
        }
        long j = this.f12088k;
        C3921j jVar = this.f12081d;
        this.f12084g.mo12736c(j + ((this.f12089l * 1000000) / ((long) jVar.f11905d)), 1, jVar.f11904c, 0, (C3927n.C3928a) null);
        this.f12089l += (long) this.f12081d.f11908g;
        this.f12090m = 0;
        return 0;
    }

    /* renamed from: l */
    private boolean m16598l(C3916f fVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        int i3;
        int a;
        int i4 = z ? 16384 : 131072;
        fVar.mo12723e();
        if (fVar.mo12729k() == 0) {
            m16596j(fVar);
            i = (int) fVar.mo12726h();
            if (!z) {
                fVar.mo12724f(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (!fVar.mo12725g(this.f12080c.f13643a, 0, 4, i2 > 0)) {
                break;
            }
            this.f12080c.mo13454J(0);
            int i7 = this.f12080c.mo13464i();
            if ((i5 == 0 || m16594g(i7, (long) i5)) && (a = C3921j.m16469a(i7)) != -1) {
                i3 = i2 + 1;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    C3921j.m16470b(i7, this.f12081d);
                    i5 = i7;
                }
                fVar.mo12728j(a - 4);
            } else {
                int i8 = i6 + 1;
                if (i6 != i4) {
                    if (z) {
                        fVar.mo12723e();
                        fVar.mo12728j(i + i8);
                    } else {
                        fVar.mo12724f(1);
                    }
                    i6 = i8;
                    i3 = 0;
                    i5 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new C4313u("Searched too many bytes.");
                }
            }
        }
        if (z) {
            fVar.mo12724f(i + i6);
        } else {
            fVar.mo12723e();
        }
        this.f12085h = i5;
        return true;
    }

    /* renamed from: a */
    public void mo12738a() {
    }

    /* renamed from: b */
    public void mo12739b(C3917g gVar) {
        this.f12083f = gVar;
        this.f12084g = gVar.mo12745m(0, 1);
        this.f12083f.mo12744c();
    }

    /* renamed from: c */
    public void mo12740c(long j, long j2) {
        this.f12085h = 0;
        this.f12088k = -9223372036854775807L;
        this.f12089l = 0;
        this.f12090m = 0;
    }

    /* renamed from: d */
    public boolean mo12741d(C3916f fVar) throws IOException, InterruptedException {
        return m16598l(fVar, true);
    }

    /* renamed from: h */
    public int mo12742h(C3916f fVar, C3922k kVar) throws IOException, InterruptedException {
        if (this.f12085h == 0) {
            try {
                m16598l(fVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        } else {
            C3916f fVar2 = fVar;
        }
        if (this.f12087j == null) {
            C3949a i = m16595i(fVar);
            this.f12087j = i;
            if (i == null || (!i.mo12716e() && (this.f12078a & 1) != 0)) {
                this.f12087j = m16592e(fVar);
            }
            this.f12083f.mo12743b(this.f12087j);
            C3927n nVar = this.f12084g;
            C3921j jVar = this.f12081d;
            String str = jVar.f11903b;
            int i2 = jVar.f11906e;
            int i3 = jVar.f11905d;
            C3919i iVar = this.f12082e;
            nVar.mo12737d(C4109n.m17336f((String) null, str, (String) null, -1, 4096, i2, i3, -1, iVar.f11893a, iVar.f11894b, (List<byte[]>) null, (C3900a) null, 0, (String) null, (this.f12078a & 2) != 0 ? null : this.f12086i));
        }
        return m16597k(fVar);
    }
}
