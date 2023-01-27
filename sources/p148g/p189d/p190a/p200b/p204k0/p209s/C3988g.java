package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p204k0.p209s.C3989h;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.s.g */
final class C3988g extends C3989h {

    /* renamed from: o */
    private static final int f12417o = C4284w.m18249o("Opus");

    /* renamed from: p */
    private static final byte[] f12418p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f12419n;

    C3988g() {
    }

    /* renamed from: l */
    private long m16799l(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return (long) (b3 * (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    /* renamed from: m */
    private void m16800m(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    /* renamed from: n */
    public static boolean m16801n(C4274m mVar) {
        int a = mVar.mo13456a();
        byte[] bArr = f12418p;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        mVar.mo13462g(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f12418p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo12824e(C4274m mVar) {
        return mo12837b(m16799l(mVar.f13643a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo12825h(C4274m mVar, long j, C3989h.C3991b bVar) throws IOException, InterruptedException {
        boolean z = true;
        if (!this.f12419n) {
            byte[] copyOf = Arrays.copyOf(mVar.f13643a, mVar.mo13459d());
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m16800m(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            m16800m(arrayList, 3840);
            bVar.f12433a = C4109n.m17338h((String) null, "audio/opus", (String) null, -1, -1, b, 48000, arrayList, (C3900a) null, 0, (String) null);
            this.f12419n = true;
            return true;
        }
        if (mVar.mo13464i() != f12417o) {
            z = false;
        }
        mVar.mo13454J(0);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo12826j(boolean z) {
        super.mo12826j(z);
        if (z) {
            this.f12419n = false;
        }
    }
}
