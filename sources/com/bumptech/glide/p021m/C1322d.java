package com.bumptech.glide.p021m;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p340io.realm.internal.OsSharedRealm;

/* renamed from: com.bumptech.glide.m.d */
public class C1322d {

    /* renamed from: a */
    private final byte[] f4596a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f4597b;

    /* renamed from: c */
    private C1321c f4598c;

    /* renamed from: d */
    private int f4599d = 0;

    /* renamed from: b */
    private boolean m6580b() {
        return this.f4598c.f4584b != 0;
    }

    /* renamed from: d */
    private int m6581d() {
        try {
            return this.f4597b.get() & 255;
        } catch (Exception unused) {
            this.f4598c.f4584b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m6582e() {
        this.f4598c.f4586d.f4572a = m6591n();
        this.f4598c.f4586d.f4573b = m6591n();
        this.f4598c.f4586d.f4574c = m6591n();
        this.f4598c.f4586d.f4575d = m6591n();
        int d = m6581d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C1320b bVar = this.f4598c.f4586d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f4576e = z;
        C1320b bVar2 = this.f4598c.f4586d;
        if (z2) {
            bVar2.f4582k = m6584g(pow);
        } else {
            bVar2.f4582k = null;
        }
        this.f4598c.f4586d.f4581j = this.f4597b.position();
        m6594r();
        if (!m6580b()) {
            C1321c cVar = this.f4598c;
            cVar.f4585c++;
            cVar.f4587e.add(cVar.f4586d);
        }
    }

    /* renamed from: f */
    private void m6583f() {
        int d = m6581d();
        this.f4599d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f4599d) {
                try {
                    i2 = this.f4599d - i;
                    this.f4597b.get(this.f4596a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f4599d, e);
                    }
                    this.f4598c.f4584b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m6584g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f4597b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | OsSharedRealm.FILE_EXCEPTION_KIND_ACCESS_ERROR | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f4598c.f4584b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m6585h() {
        m6586i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m6586i(int i) {
        boolean z = false;
        while (!z && !m6580b() && this.f4598c.f4585c <= i) {
            int d = m6581d();
            if (d == 33) {
                int d2 = m6581d();
                if (d2 != 1) {
                    if (d2 == 249) {
                        this.f4598c.f4586d = new C1320b();
                        m6587j();
                    } else if (d2 != 254 && d2 == 255) {
                        m6583f();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.f4596a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            m6590m();
                        }
                    }
                }
                m6593q();
            } else if (d == 44) {
                C1321c cVar = this.f4598c;
                if (cVar.f4586d == null) {
                    cVar.f4586d = new C1320b();
                }
                m6582e();
            } else if (d != 59) {
                this.f4598c.f4584b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m6587j() {
        m6581d();
        int d = m6581d();
        C1320b bVar = this.f4598c.f4586d;
        int i = (d & 28) >> 2;
        bVar.f4578g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f4578g = 1;
        }
        C1320b bVar2 = this.f4598c.f4586d;
        if ((d & 1) == 0) {
            z = false;
        }
        bVar2.f4577f = z;
        int n = m6591n();
        if (n < 2) {
            n = 10;
        }
        C1320b bVar3 = this.f4598c.f4586d;
        bVar3.f4580i = n * 10;
        bVar3.f4579h = m6581d();
        m6581d();
    }

    /* renamed from: k */
    private void m6588k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m6581d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f4598c.f4584b = 1;
            return;
        }
        m6589l();
        if (this.f4598c.f4590h && !m6580b()) {
            C1321c cVar = this.f4598c;
            cVar.f4583a = m6584g(cVar.f4591i);
            C1321c cVar2 = this.f4598c;
            cVar2.f4594l = cVar2.f4583a[cVar2.f4592j];
        }
    }

    /* renamed from: l */
    private void m6589l() {
        this.f4598c.f4588f = m6591n();
        this.f4598c.f4589g = m6591n();
        int d = m6581d();
        this.f4598c.f4590h = (d & 128) != 0;
        this.f4598c.f4591i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f4598c.f4592j = m6581d();
        this.f4598c.f4593k = m6581d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6590m() {
        /*
            r3 = this;
        L_0x0000:
            r3.m6583f()
            byte[] r0 = r3.f4596a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.bumptech.glide.m.c r2 = r3.f4598c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f4595m = r0
        L_0x001b:
            int r0 = r3.f4599d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.m6580b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p021m.C1322d.m6590m():void");
    }

    /* renamed from: n */
    private int m6591n() {
        return this.f4597b.getShort();
    }

    /* renamed from: o */
    private void m6592o() {
        this.f4597b = null;
        Arrays.fill(this.f4596a, (byte) 0);
        this.f4598c = new C1321c();
        this.f4599d = 0;
    }

    /* renamed from: q */
    private void m6593q() {
        int d;
        do {
            d = m6581d();
            this.f4597b.position(Math.min(this.f4597b.position() + d, this.f4597b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m6594r() {
        m6581d();
        m6593q();
    }

    /* renamed from: a */
    public void mo5690a() {
        this.f4597b = null;
        this.f4598c = null;
    }

    /* renamed from: c */
    public C1321c mo5691c() {
        if (this.f4597b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m6580b()) {
            return this.f4598c;
        } else {
            m6588k();
            if (!m6580b()) {
                m6585h();
                C1321c cVar = this.f4598c;
                if (cVar.f4585c < 0) {
                    cVar.f4584b = 1;
                }
            }
            return this.f4598c;
        }
    }

    /* renamed from: p */
    public C1322d mo5692p(ByteBuffer byteBuffer) {
        m6592o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4597b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f4597b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
