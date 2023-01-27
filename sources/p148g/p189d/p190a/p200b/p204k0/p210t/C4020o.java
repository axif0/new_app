package p148g.p189d.p190a.p200b.p204k0.p210t;

import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.k0.t.o */
final class C4020o {

    /* renamed from: a */
    private final int f12646a;

    /* renamed from: b */
    private boolean f12647b;

    /* renamed from: c */
    private boolean f12648c;

    /* renamed from: d */
    public byte[] f12649d;

    /* renamed from: e */
    public int f12650e;

    public C4020o(int i, int i2) {
        this.f12646a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f12649d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo12872a(byte[] bArr, int i, int i2) {
        if (this.f12647b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f12649d;
            int length = bArr2.length;
            int i4 = this.f12650e;
            if (length < i4 + i3) {
                this.f12649d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f12649d, this.f12650e, i3);
            this.f12650e += i3;
        }
    }

    /* renamed from: b */
    public boolean mo12873b(int i) {
        if (!this.f12647b) {
            return false;
        }
        this.f12650e -= i;
        this.f12647b = false;
        this.f12648c = true;
        return true;
    }

    /* renamed from: c */
    public boolean mo12874c() {
        return this.f12648c;
    }

    /* renamed from: d */
    public void mo12875d() {
        this.f12647b = false;
        this.f12648c = false;
    }

    /* renamed from: e */
    public void mo12876e(int i) {
        boolean z = true;
        C4260a.m18074f(!this.f12647b);
        if (i != this.f12646a) {
            z = false;
        }
        this.f12647b = z;
        if (z) {
            this.f12650e = 3;
            this.f12648c = false;
        }
    }
}
