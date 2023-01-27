package p148g.p189d.p190a.p200b.p219o0.p222o;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4153c;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p219o0.C4157g;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.o.a */
public final class C4188a extends C4153c {

    /* renamed from: n */
    private final C4274m f13351n = new C4274m();

    /* renamed from: o */
    private final C4189a f13352o = new C4189a();

    /* renamed from: g.d.a.b.o0.o.a$a */
    private static final class C4189a {

        /* renamed from: a */
        private final C4274m f13353a = new C4274m();

        /* renamed from: b */
        private final int[] f13354b = new int[256];

        /* renamed from: c */
        private boolean f13355c;

        /* renamed from: d */
        private int f13356d;

        /* renamed from: e */
        private int f13357e;

        /* renamed from: f */
        private int f13358f;

        /* renamed from: g */
        private int f13359g;

        /* renamed from: h */
        private int f13360h;

        /* renamed from: i */
        private int f13361i;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m17737e(C4274m mVar, int i) {
            int A;
            if (i >= 4) {
                mVar.mo13455K(3);
                int i2 = i - 4;
                if ((mVar.mo13479x() & 128) != 0) {
                    if (i2 >= 7 && (A = mVar.mo13445A()) >= 4) {
                        this.f13360h = mVar.mo13448D();
                        this.f13361i = mVar.mo13448D();
                        this.f13353a.mo13451G(A - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int c = this.f13353a.mo13458c();
                int d = this.f13353a.mo13459d();
                if (c < d && i2 > 0) {
                    int min = Math.min(i2, d - c);
                    mVar.mo13462g(this.f13353a.f13643a, c, min);
                    this.f13353a.mo13454J(c + min);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m17738f(C4274m mVar, int i) {
            if (i >= 19) {
                this.f13356d = mVar.mo13448D();
                this.f13357e = mVar.mo13448D();
                mVar.mo13455K(11);
                this.f13358f = mVar.mo13448D();
                this.f13359g = mVar.mo13448D();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m17739g(C4274m mVar, int i) {
            if (i % 5 == 2) {
                mVar.mo13455K(2);
                Arrays.fill(this.f13354b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int x = mVar.mo13479x();
                    int x2 = mVar.mo13479x();
                    int x3 = mVar.mo13479x();
                    int x4 = mVar.mo13479x();
                    int x5 = mVar.mo13479x();
                    double d = (double) x2;
                    double d2 = (double) (x3 - 128);
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    int i4 = i3;
                    double d3 = (double) (x4 - 128);
                    Double.isNaN(d3);
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d);
                    int[] iArr = this.f13354b;
                    int i5 = C4284w.m18243i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8;
                    iArr[x] = C4284w.m18243i((int) (d + (d3 * 1.772d)), 0, 255) | i5 | (x5 << 24) | (C4284w.m18243i((int) ((1.402d * d2) + d), 0, 255) << 16);
                    i3 = i4 + 1;
                }
                this.f13355c = true;
            }
        }

        /* renamed from: d */
        public C4152b mo13249d() {
            int x;
            if (this.f13356d == 0 || this.f13357e == 0 || this.f13360h == 0 || this.f13361i == 0 || this.f13353a.mo13459d() == 0 || this.f13353a.mo13458c() != this.f13353a.mo13459d() || !this.f13355c) {
                return null;
            }
            this.f13353a.mo13454J(0);
            int i = this.f13360h * this.f13361i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int x2 = this.f13353a.mo13479x();
                if (x2 != 0) {
                    x = i2 + 1;
                    iArr[i2] = this.f13354b[x2];
                } else {
                    int x3 = this.f13353a.mo13479x();
                    if (x3 != 0) {
                        x = ((x3 & 64) == 0 ? x3 & 63 : ((x3 & 63) << 8) | this.f13353a.mo13479x()) + i2;
                        Arrays.fill(iArr, i2, x, (x3 & 128) == 0 ? 0 : this.f13354b[this.f13353a.mo13479x()]);
                    }
                }
                i2 = x;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f13360h, this.f13361i, Bitmap.Config.ARGB_8888);
            int i3 = this.f13356d;
            float f = ((float) this.f13358f) / ((float) i3);
            int i4 = this.f13357e;
            return new C4152b(createBitmap, f, 0, ((float) this.f13359g) / ((float) i4), 0, ((float) this.f13360h) / ((float) i3), ((float) this.f13361i) / ((float) i4));
        }

        /* renamed from: h */
        public void mo13250h() {
            this.f13356d = 0;
            this.f13357e = 0;
            this.f13358f = 0;
            this.f13359g = 0;
            this.f13360h = 0;
            this.f13361i = 0;
            this.f13353a.mo13451G(0);
            this.f13355c = false;
        }
    }

    public C4188a() {
        super("PgsDecoder");
    }

    /* renamed from: C */
    private static C4152b m17732C(C4274m mVar, C4189a aVar) {
        int d = mVar.mo13459d();
        int x = mVar.mo13479x();
        int D = mVar.mo13448D();
        int c = mVar.mo13458c() + D;
        C4152b bVar = null;
        if (c > d) {
            mVar.mo13454J(d);
            return null;
        }
        if (x != 128) {
            switch (x) {
                case 20:
                    aVar.m17739g(mVar, D);
                    break;
                case 21:
                    aVar.m17737e(mVar, D);
                    break;
                case 22:
                    aVar.m17738f(mVar, D);
                    break;
            }
        } else {
            bVar = aVar.mo13249d();
            aVar.mo13250h();
        }
        mVar.mo13454J(c);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C4155e mo13192z(byte[] bArr, int i, boolean z) throws C4157g {
        this.f13351n.mo13452H(bArr, i);
        this.f13352o.mo13250h();
        ArrayList arrayList = new ArrayList();
        while (this.f13351n.mo13456a() >= 3) {
            C4152b C = m17732C(this.f13351n, this.f13352o);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new C4190b(Collections.unmodifiableList(arrayList));
    }
}
