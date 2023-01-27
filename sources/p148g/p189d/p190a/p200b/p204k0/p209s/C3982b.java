package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p204k0.C3923l;
import p148g.p189d.p190a.p200b.p204k0.C3926m;
import p148g.p189d.p190a.p200b.p204k0.p209s.C3989h;
import p148g.p189d.p190a.p200b.p230r0.C4265f;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.s.b */
final class C3982b extends C3989h {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4265f f12393n;

    /* renamed from: o */
    private C3983a f12394o;

    /* renamed from: g.d.a.b.k0.s.b$a */
    private class C3983a implements C3987f, C3923l {

        /* renamed from: a */
        private long[] f12395a;

        /* renamed from: b */
        private long[] f12396b;

        /* renamed from: c */
        private long f12397c = -1;

        /* renamed from: d */
        private long f12398d = -1;

        public C3983a() {
        }

        /* renamed from: a */
        public long mo12814a(C3916f fVar) throws IOException, InterruptedException {
            long j = this.f12398d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f12398d = -1;
            return j2;
        }

        /* renamed from: b */
        public C3923l mo12815b() {
            return this;
        }

        /* renamed from: c */
        public long mo12816c(long j) {
            long b = C3982b.this.mo12837b(j);
            this.f12398d = this.f12395a[C4284w.m18238d(this.f12395a, b, true, true)];
            return b;
        }

        /* renamed from: d */
        public void mo12827d(C4274m mVar) {
            mVar.mo13455K(1);
            int A = mVar.mo13445A() / 18;
            this.f12395a = new long[A];
            this.f12396b = new long[A];
            for (int i = 0; i < A; i++) {
                this.f12395a[i] = mVar.mo13472q();
                this.f12396b[i] = mVar.mo13472q();
                mVar.mo13455K(2);
            }
        }

        /* renamed from: e */
        public boolean mo12716e() {
            return true;
        }

        /* renamed from: g */
        public C3923l.C3924a mo12717g(long j) {
            int d = C4284w.m18238d(this.f12395a, C3982b.this.mo12837b(j), true, true);
            long a = C3982b.this.mo12836a(this.f12395a[d]);
            C3926m mVar = new C3926m(a, this.f12397c + this.f12396b[d]);
            if (a < j) {
                long[] jArr = this.f12395a;
                if (d != jArr.length - 1) {
                    int i = d + 1;
                    return new C3923l.C3924a(mVar, new C3926m(C3982b.this.mo12836a(jArr[i]), this.f12397c + this.f12396b[i]));
                }
            }
            return new C3923l.C3924a(mVar);
        }

        /* renamed from: h */
        public void mo12828h(long j) {
            this.f12397c = j;
        }

        /* renamed from: i */
        public long mo12718i() {
            return C3982b.this.f12393n.mo13418b();
        }
    }

    C3982b() {
    }

    /* renamed from: m */
    private int m16767m(C4274m mVar) {
        int i;
        int i2;
        int i3 = (mVar.f13643a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                mVar.mo13455K(4);
                mVar.mo13449E();
                int x = i3 == 6 ? mVar.mo13479x() : mVar.mo13448D();
                mVar.mo13454J(0);
                return x + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }

    /* renamed from: n */
    private static boolean m16768n(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: o */
    public static boolean m16769o(C4274m mVar) {
        return mVar.mo13456a() >= 5 && mVar.mo13479x() == 127 && mVar.mo13481z() == 1179402563;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo12824e(C4274m mVar) {
        if (!m16768n(mVar.f13643a)) {
            return -1;
        }
        return (long) m16767m(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo12825h(C4274m mVar, long j, C3989h.C3991b bVar) throws IOException, InterruptedException {
        byte[] bArr = mVar.f13643a;
        if (this.f12393n == null) {
            this.f12393n = new C4265f(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, mVar.mo13459d());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int a = this.f12393n.mo13417a();
            C4265f fVar = this.f12393n;
            bVar.f12433a = C4109n.m17338h((String) null, "audio/flac", (String) null, -1, a, fVar.f13617b, fVar.f13616a, singletonList, (C3900a) null, 0, (String) null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            C3983a aVar = new C3983a();
            this.f12394o = aVar;
            aVar.mo12827d(mVar);
            return true;
        } else if (!m16768n(bArr)) {
            return true;
        } else {
            C3983a aVar2 = this.f12394o;
            if (aVar2 != null) {
                aVar2.mo12828h(j);
                bVar.f12434b = this.f12394o;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo12826j(boolean z) {
        super.mo12826j(z);
        if (z) {
            this.f12393n = null;
            this.f12394o = null;
        }
    }
}
