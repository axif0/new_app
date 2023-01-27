package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.IOException;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.k0.s.d */
final class C3985d {

    /* renamed from: a */
    private final C3986e f12403a = new C3986e();

    /* renamed from: b */
    private final C4274m f12404b = new C4274m(new byte[65025], 0);

    /* renamed from: c */
    private int f12405c = -1;

    /* renamed from: d */
    private int f12406d;

    /* renamed from: e */
    private boolean f12407e;

    C3985d() {
    }

    /* renamed from: a */
    private int m16788a(int i) {
        int i2;
        int i3 = 0;
        this.f12406d = 0;
        do {
            int i4 = this.f12406d;
            int i5 = i + i4;
            C3986e eVar = this.f12403a;
            if (i5 >= eVar.f12412d) {
                break;
            }
            int[] iArr = eVar.f12415g;
            this.f12406d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public C3986e mo12829b() {
        return this.f12403a;
    }

    /* renamed from: c */
    public C4274m mo12830c() {
        return this.f12404b;
    }

    /* renamed from: d */
    public boolean mo12831d(C3916f fVar) throws IOException, InterruptedException {
        int i;
        C4260a.m18074f(fVar != null);
        if (this.f12407e) {
            this.f12407e = false;
            this.f12404b.mo13450F();
        }
        while (!this.f12407e) {
            if (this.f12405c < 0) {
                if (!this.f12403a.mo12834a(fVar, true)) {
                    return false;
                }
                C3986e eVar = this.f12403a;
                int i2 = eVar.f12413e;
                if ((eVar.f12410b & 1) == 1 && this.f12404b.mo13459d() == 0) {
                    i2 += m16788a(0);
                    i = this.f12406d + 0;
                } else {
                    i = 0;
                }
                fVar.mo12724f(i2);
                this.f12405c = i;
            }
            int a = m16788a(this.f12405c);
            int i3 = this.f12405c + this.f12406d;
            if (a > 0) {
                if (this.f12404b.mo13457b() < this.f12404b.mo13459d() + a) {
                    C4274m mVar = this.f12404b;
                    mVar.f13643a = Arrays.copyOf(mVar.f13643a, mVar.mo13459d() + a);
                }
                C4274m mVar2 = this.f12404b;
                fVar.readFully(mVar2.f13643a, mVar2.mo13459d(), a);
                C4274m mVar3 = this.f12404b;
                mVar3.mo13453I(mVar3.mo13459d() + a);
                this.f12407e = this.f12403a.f12415g[i3 + -1] != 255;
            }
            if (i3 == this.f12403a.f12412d) {
                i3 = -1;
            }
            this.f12405c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void mo12832e() {
        this.f12403a.mo12835b();
        this.f12404b.mo13450F();
        this.f12405c = -1;
        this.f12407e = false;
    }

    /* renamed from: f */
    public void mo12833f() {
        C4274m mVar = this.f12404b;
        byte[] bArr = mVar.f13643a;
        if (bArr.length != 65025) {
            mVar.f13643a = Arrays.copyOf(bArr, Math.max(65025, mVar.mo13459d()));
        }
    }
}
