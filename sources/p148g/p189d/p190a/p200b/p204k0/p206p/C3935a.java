package p148g.p189d.p190a.p200b.p204k0.p206p;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.Stack;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.k0.p.a */
final class C3935a implements C3938b {

    /* renamed from: a */
    private final byte[] f11948a = new byte[8];

    /* renamed from: b */
    private final Stack<C3937b> f11949b = new Stack<>();

    /* renamed from: c */
    private final C3946f f11950c = new C3946f();

    /* renamed from: d */
    private C3939c f11951d;

    /* renamed from: e */
    private int f11952e;

    /* renamed from: f */
    private int f11953f;

    /* renamed from: g */
    private long f11954g;

    /* renamed from: g.d.a.b.k0.p.a$b */
    private static final class C3937b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f11955a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f11956b;

        private C3937b(int i, long j) {
            this.f11955a = i;
            this.f11956b = j;
        }
    }

    C3935a() {
    }

    /* renamed from: d */
    private long m16512d(C3916f fVar) throws IOException, InterruptedException {
        fVar.mo12723e();
        while (true) {
            fVar.mo12727i(this.f11948a, 0, 4);
            int c = C3946f.m16584c(this.f11948a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) C3946f.m16583a(this.f11948a, c, false);
                if (this.f11951d.mo12768d(a)) {
                    fVar.mo12724f(c);
                    return (long) a;
                }
            }
            fVar.mo12724f(1);
        }
    }

    /* renamed from: e */
    private double m16513e(C3916f fVar, int i) throws IOException, InterruptedException {
        long f = m16514f(fVar, i);
        return i == 4 ? (double) Float.intBitsToFloat((int) f) : Double.longBitsToDouble(f);
    }

    /* renamed from: f */
    private long m16514f(C3916f fVar, int i) throws IOException, InterruptedException {
        fVar.readFully(this.f11948a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f11948a[i2] & 255));
        }
        return j;
    }

    /* renamed from: g */
    private String m16515g(C3916f fVar, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        byte[] bArr = new byte[i];
        fVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    /* renamed from: a */
    public boolean mo12762a(C3916f fVar) throws IOException, InterruptedException {
        C4260a.m18074f(this.f11951d != null);
        while (true) {
            if (this.f11949b.isEmpty() || fVar.mo12729k() < this.f11949b.peek().f11956b) {
                if (this.f11952e == 0) {
                    long d = this.f11950c.mo12790d(fVar, true, false, 4);
                    if (d == -2) {
                        d = m16512d(fVar);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f11953f = (int) d;
                    this.f11952e = 1;
                }
                if (this.f11952e == 1) {
                    this.f11954g = this.f11950c.mo12790d(fVar, false, true, 8);
                    this.f11952e = 2;
                }
                int b = this.f11951d.mo12766b(this.f11953f);
                if (b == 0) {
                    fVar.mo12724f((int) this.f11954g);
                    this.f11952e = 0;
                } else if (b == 1) {
                    long k = fVar.mo12729k();
                    this.f11949b.add(new C3937b(this.f11953f, this.f11954g + k));
                    this.f11951d.mo12771g(this.f11953f, k, this.f11954g);
                    this.f11952e = 0;
                    return true;
                } else if (b == 2) {
                    long j = this.f11954g;
                    if (j <= 8) {
                        this.f11951d.mo12772h(this.f11953f, m16514f(fVar, (int) j));
                        this.f11952e = 0;
                        return true;
                    }
                    throw new C4313u("Invalid integer size: " + this.f11954g);
                } else if (b == 3) {
                    long j2 = this.f11954g;
                    if (j2 <= 2147483647L) {
                        this.f11951d.mo12770f(this.f11953f, m16515g(fVar, (int) j2));
                        this.f11952e = 0;
                        return true;
                    }
                    throw new C4313u("String element size: " + this.f11954g);
                } else if (b == 4) {
                    this.f11951d.mo12769e(this.f11953f, (int) this.f11954g, fVar);
                    this.f11952e = 0;
                    return true;
                } else if (b == 5) {
                    long j3 = this.f11954g;
                    if (j3 == 4 || j3 == 8) {
                        this.f11951d.mo12767c(this.f11953f, m16513e(fVar, (int) this.f11954g));
                        this.f11952e = 0;
                        return true;
                    }
                    throw new C4313u("Invalid float size: " + this.f11954g);
                } else {
                    throw new C4313u("Invalid element type " + b);
                }
            } else {
                this.f11951d.mo12765a(this.f11949b.pop().f11955a);
                return true;
            }
        }
    }

    /* renamed from: b */
    public void mo12763b() {
        this.f11952e = 0;
        this.f11949b.clear();
        this.f11950c.mo12791e();
    }

    /* renamed from: c */
    public void mo12764c(C3939c cVar) {
        this.f11951d = cVar;
    }
}
