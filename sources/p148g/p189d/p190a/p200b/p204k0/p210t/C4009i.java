package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.Pair;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p204k0.C3927n;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4031w;
import p148g.p189d.p190a.p200b.p230r0.C4270k;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.t.i */
public final class C4009i implements C4008h {

    /* renamed from: n */
    private static final double[] f12514n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f12515a;

    /* renamed from: b */
    private C3927n f12516b;

    /* renamed from: c */
    private boolean f12517c;

    /* renamed from: d */
    private long f12518d;

    /* renamed from: e */
    private final boolean[] f12519e = new boolean[4];

    /* renamed from: f */
    private final C4010a f12520f = new C4010a(128);

    /* renamed from: g */
    private long f12521g;

    /* renamed from: h */
    private boolean f12522h;

    /* renamed from: i */
    private long f12523i;

    /* renamed from: j */
    private long f12524j;

    /* renamed from: k */
    private long f12525k;

    /* renamed from: l */
    private boolean f12526l;

    /* renamed from: m */
    private boolean f12527m;

    /* renamed from: g.d.a.b.k0.t.i$a */
    private static final class C4010a {

        /* renamed from: e */
        private static final byte[] f12528e = {0, 0, 1};

        /* renamed from: a */
        private boolean f12529a;

        /* renamed from: b */
        public int f12530b;

        /* renamed from: c */
        public int f12531c;

        /* renamed from: d */
        public byte[] f12532d;

        public C4010a(int i) {
            this.f12532d = new byte[i];
        }

        /* renamed from: a */
        public void mo12854a(byte[] bArr, int i, int i2) {
            if (this.f12529a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f12532d;
                int length = bArr2.length;
                int i4 = this.f12530b;
                if (length < i4 + i3) {
                    this.f12532d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f12532d, this.f12530b, i3);
                this.f12530b += i3;
            }
        }

        /* renamed from: b */
        public boolean mo12855b(int i, int i2) {
            if (this.f12529a) {
                int i3 = this.f12530b - i2;
                this.f12530b = i3;
                if (this.f12531c == 0 && i == 181) {
                    this.f12531c = i3;
                } else {
                    this.f12529a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f12529a = true;
            }
            byte[] bArr = f12528e;
            mo12854a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo12856c() {
            this.f12529a = false;
            this.f12530b = 0;
            this.f12531c = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<p148g.p189d.p190a.p200b.C4109n, java.lang.Long> m16899b(p148g.p189d.p190a.p200b.p204k0.p210t.C4009i.C4010a r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.f12532d
            int r2 = r0.f12530b
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            byte r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            byte r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            byte r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            byte r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L_0x0043
            r6 = 3
            if (r5 == r6) goto L_0x003d
            if (r5 == r2) goto L_0x0037
            r2 = 1065353216(0x3f800000, float:1.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004c
        L_0x0037:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L_0x0048
        L_0x003d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L_0x0048
        L_0x0043:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L_0x0048:
            float r5 = (float) r5
            float r2 = r2 / r5
            r18 = r2
        L_0x004c:
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            java.lang.String r9 = "video/mpeg2"
            r8 = r21
            g.d.a.b.n r2 = p148g.p189d.p190a.p200b.C4109n.m17346p(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = 0
            byte r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0098
            double[] r7 = f12514n
            int r8 = r7.length
            if (r3 >= r8) goto L_0x0098
            r5 = r7[r3]
            int r0 = r0.f12531c
            int r0 = r0 + 9
            byte r3 = r1[r0]
            r3 = r3 & 96
            int r3 = r3 >> r4
            byte r0 = r1[r0]
            r0 = r0 & 31
            if (r3 == r0) goto L_0x0091
            double r3 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r7
            int r0 = r0 + 1
            double r0 = (double) r0
            java.lang.Double.isNaN(r0)
            double r3 = r3 / r0
            double r5 = r5 * r3
        L_0x0091:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            long r5 = (long) r0
        L_0x0098:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p210t.C4009i.m16899b(g.d.a.b.k0.t.i$a, java.lang.String):android.util.Pair");
    }

    /* renamed from: a */
    public void mo12847a() {
        C4270k.m18118a(this.f12519e);
        this.f12520f.mo12856c();
        this.f12521g = 0;
        this.f12522h = false;
    }

    /* renamed from: c */
    public void mo12848c(C4274m mVar) {
        C4274m mVar2 = mVar;
        int c = mVar.mo13458c();
        int d = mVar.mo13459d();
        byte[] bArr = mVar2.f13643a;
        this.f12521g += (long) mVar.mo13456a();
        this.f12516b.mo12734a(mVar2, mVar.mo13456a());
        while (true) {
            int c2 = C4270k.m18120c(bArr, c, d, this.f12519e);
            if (c2 == d) {
                break;
            }
            int i = c2 + 3;
            byte b = mVar2.f13643a[i] & 255;
            if (!this.f12517c) {
                int i2 = c2 - c;
                if (i2 > 0) {
                    this.f12520f.mo12854a(bArr, c, c2);
                }
                if (this.f12520f.mo12855b(b, i2 < 0 ? -i2 : 0)) {
                    Pair<C4109n, Long> b2 = m16899b(this.f12520f, this.f12515a);
                    this.f12516b.mo12737d((C4109n) b2.first);
                    this.f12518d = ((Long) b2.second).longValue();
                    this.f12517c = true;
                }
            }
            if (b == 0 || b == 179) {
                int i3 = d - c2;
                if (this.f12522h && this.f12527m && this.f12517c) {
                    this.f12516b.mo12736c(this.f12525k, this.f12526l ? 1 : 0, ((int) (this.f12521g - this.f12524j)) - i3, i3, (C3927n.C3928a) null);
                }
                if (!this.f12522h || this.f12527m) {
                    this.f12524j = this.f12521g - ((long) i3);
                    long j = this.f12523i;
                    if (j == -9223372036854775807L) {
                        j = this.f12522h ? this.f12525k + this.f12518d : 0;
                    }
                    this.f12525k = j;
                    this.f12526l = false;
                    this.f12523i = -9223372036854775807L;
                    this.f12522h = true;
                }
                this.f12527m = b == 0;
            } else if (b == 184) {
                this.f12526l = true;
            }
            c = i;
        }
        if (!this.f12517c) {
            this.f12520f.mo12854a(bArr, c, d);
        }
    }

    /* renamed from: d */
    public void mo12849d(long j, boolean z) {
        this.f12523i = j;
    }

    /* renamed from: e */
    public void mo12850e() {
    }

    /* renamed from: f */
    public void mo12851f(C3917g gVar, C4031w.C4035d dVar) {
        dVar.mo12886a();
        this.f12515a = dVar.mo12887b();
        this.f12516b = gVar.mo12745m(dVar.mo12888c(), 2);
    }
}
