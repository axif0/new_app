package p148g.p189d.p190a.p200b.p204k0;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p229q0.C4238c;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.b */
public final class C3912b implements C3916f {

    /* renamed from: a */
    private final byte[] f11877a = new byte[4096];

    /* renamed from: b */
    private final C4238c f11878b;

    /* renamed from: c */
    private final long f11879c;

    /* renamed from: d */
    private long f11880d;

    /* renamed from: e */
    private byte[] f11881e = new byte[65536];

    /* renamed from: f */
    private int f11882f;

    /* renamed from: g */
    private int f11883g;

    public C3912b(C4238c cVar, long j, long j2) {
        this.f11878b = cVar;
        this.f11880d = j;
        this.f11879c = j2;
    }

    /* renamed from: m */
    private void m16420m(int i) {
        if (i != -1) {
            this.f11880d += (long) i;
        }
    }

    /* renamed from: n */
    private void m16421n(int i) {
        int i2 = this.f11882f + i;
        byte[] bArr = this.f11881e;
        if (i2 > bArr.length) {
            this.f11881e = Arrays.copyOf(this.f11881e, C4284w.m18243i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: o */
    private int m16422o(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f11878b.mo13369a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: p */
    private int m16423p(byte[] bArr, int i, int i2) {
        int i3 = this.f11883g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f11881e, 0, bArr, i, min);
        m16425s(min);
        return min;
    }

    /* renamed from: q */
    private int m16424q(int i) {
        int min = Math.min(this.f11883g, i);
        m16425s(min);
        return min;
    }

    /* renamed from: s */
    private void m16425s(int i) {
        int i2 = this.f11883g - i;
        this.f11883g = i2;
        this.f11882f = 0;
        byte[] bArr = this.f11881e;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f11881e, i, bArr, 0, this.f11883g);
        this.f11881e = bArr;
    }

    /* renamed from: a */
    public int mo12719a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int p = m16423p(bArr, i, i2);
        if (p == 0) {
            p = m16422o(bArr, i, i2, 0, true);
        }
        m16420m(p);
        return p;
    }

    /* renamed from: b */
    public int mo12720b(int i) throws IOException, InterruptedException {
        int q = m16424q(i);
        if (q == 0) {
            byte[] bArr = this.f11877a;
            q = m16422o(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m16420m(q);
        return q;
    }

    /* renamed from: c */
    public boolean mo12721c(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int p = m16423p(bArr, i, i2);
        while (p < i2 && p != -1) {
            p = m16422o(bArr, i, i2, p, z);
        }
        m16420m(p);
        return p != -1;
    }

    /* renamed from: d */
    public long mo12722d() {
        return this.f11879c;
    }

    /* renamed from: e */
    public void mo12723e() {
        this.f11882f = 0;
    }

    /* renamed from: f */
    public void mo12724f(int i) throws IOException, InterruptedException {
        mo12731r(i, false);
    }

    /* renamed from: g */
    public boolean mo12725g(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo12730l(i2, z)) {
            return false;
        }
        System.arraycopy(this.f11881e, this.f11882f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: h */
    public long mo12726h() {
        return this.f11880d + ((long) this.f11882f);
    }

    /* renamed from: i */
    public void mo12727i(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo12725g(bArr, i, i2, false);
    }

    /* renamed from: j */
    public void mo12728j(int i) throws IOException, InterruptedException {
        mo12730l(i, false);
    }

    /* renamed from: k */
    public long mo12729k() {
        return this.f11880d;
    }

    /* renamed from: l */
    public boolean mo12730l(int i, boolean z) throws IOException, InterruptedException {
        m16421n(i);
        int min = Math.min(this.f11883g - this.f11882f, i);
        while (min < i) {
            min = m16422o(this.f11881e, this.f11882f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i2 = this.f11882f + i;
        this.f11882f = i2;
        this.f11883g = Math.max(this.f11883g, i2);
        return true;
    }

    /* renamed from: r */
    public boolean mo12731r(int i, boolean z) throws IOException, InterruptedException {
        int q = m16424q(i);
        while (q < i && q != -1) {
            q = m16422o(this.f11877a, -q, Math.min(i, this.f11877a.length + q), q, z);
        }
        m16420m(q);
        return q != -1;
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo12721c(bArr, i, i2, false);
    }
}
