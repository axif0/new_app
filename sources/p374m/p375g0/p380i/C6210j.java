package p374m.p375g0.p380i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p374m.p375g0.C6130c;
import p374m.p375g0.p380i.C6182d;
import p385n.C6277c;
import p385n.C6280d;

/* renamed from: m.g0.i.j */
final class C6210j implements Closeable {

    /* renamed from: l */
    private static final Logger f17525l = Logger.getLogger(C6185e.class.getName());

    /* renamed from: f */
    private final C6280d f17526f;

    /* renamed from: g */
    private final boolean f17527g;

    /* renamed from: h */
    private final C6277c f17528h;

    /* renamed from: i */
    private int f17529i = 16384;

    /* renamed from: j */
    private boolean f17530j;

    /* renamed from: k */
    final C6182d.C6184b f17531k;

    C6210j(C6280d dVar, boolean z) {
        this.f17526f = dVar;
        this.f17527g = z;
        C6277c cVar = new C6277c();
        this.f17528h = cVar;
        this.f17531k = new C6182d.C6184b(cVar);
    }

    /* renamed from: Q */
    private void m25416Q(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f17529i, j);
            long j2 = (long) min;
            j -= j2;
            mo17542o(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f17526f.mo17384f(this.f17528h, j2);
        }
    }

    /* renamed from: S */
    private static void m25417S(C6280d dVar, int i) throws IOException {
        dVar.mo17796B((i >>> 16) & 255);
        dVar.mo17796B((i >>> 8) & 255);
        dVar.mo17796B(i & 255);
    }

    /* renamed from: D */
    public synchronized void mo17533D(C6215m mVar) throws IOException {
        if (!this.f17530j) {
            int i = 0;
            mo17542o(0, mVar.mo17565j() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (mVar.mo17562g(i)) {
                    this.f17526f.mo17833l(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f17526f.mo17836n(mVar.mo17557b(i));
                }
                i++;
            }
            this.f17526f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: H */
    public synchronized void mo17534H(boolean z, int i, int i2, List<C6180c> list) throws IOException {
        if (!this.f17530j) {
            mo17544r(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: J */
    public synchronized void mo17535J(int i, long j) throws IOException {
        if (this.f17530j) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            C6185e.m25292c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            mo17542o(i, 4, (byte) 8, (byte) 0);
            this.f17526f.mo17836n((int) j);
            this.f17526f.flush();
        }
    }

    /* renamed from: a */
    public synchronized void mo17536a(C6215m mVar) throws IOException {
        if (!this.f17530j) {
            this.f17529i = mVar.mo17561f(this.f17529i);
            if (mVar.mo17558c() != -1) {
                this.f17531k.mo17468e(mVar.mo17558c());
            }
            mo17542o(0, 0, (byte) 4, (byte) 1);
            this.f17526f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.f17530j = true;
        this.f17526f.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.f17530j) {
            this.f17526f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public synchronized void mo17539h() throws IOException {
        if (this.f17530j) {
            throw new IOException("closed");
        } else if (this.f17527g) {
            if (f17525l.isLoggable(Level.FINE)) {
                f17525l.fine(C6130c.m25055r(">> CONNECTION %s", C6185e.f17415a.mo17885q()));
            }
            this.f17526f.mo17800G(C6185e.f17415a.mo17876B());
            this.f17526f.flush();
        }
    }

    /* renamed from: j */
    public synchronized void mo17540j(boolean z, int i, C6277c cVar, int i2) throws IOException {
        if (!this.f17530j) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo17541m(i, b, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo17541m(int i, byte b, C6277c cVar, int i2) throws IOException {
        mo17542o(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f17526f.mo17384f(cVar, (long) i2);
        }
    }

    /* renamed from: o */
    public void mo17542o(int i, int i2, byte b, byte b2) throws IOException {
        if (f17525l.isLoggable(Level.FINE)) {
            f17525l.fine(C6185e.m25291b(false, i, i2, b, b2));
        }
        int i3 = this.f17529i;
        if (i2 > i3) {
            C6185e.m25292c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m25417S(this.f17526f, i2);
            this.f17526f.mo17796B(b & 255);
            this.f17526f.mo17796B(b2 & 255);
            this.f17526f.mo17836n(i & Integer.MAX_VALUE);
        } else {
            C6185e.m25292c("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: q */
    public synchronized void mo17543q(int i, C6179b bVar, byte[] bArr) throws IOException {
        if (this.f17530j) {
            throw new IOException("closed");
        } else if (bVar.f17386f != -1) {
            mo17542o(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f17526f.mo17836n(i);
            this.f17526f.mo17836n(bVar.f17386f);
            if (bArr.length > 0) {
                this.f17526f.mo17800G(bArr);
            }
            this.f17526f.flush();
        } else {
            C6185e.m25292c("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo17544r(boolean z, int i, List<C6180c> list) throws IOException {
        if (!this.f17530j) {
            this.f17531k.mo17470g(list);
            long l0 = this.f17528h.mo17834l0();
            int min = (int) Math.min((long) this.f17529i, l0);
            long j = (long) min;
            byte b = l0 == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo17542o(i, min, (byte) 1, b);
            this.f17526f.mo17384f(this.f17528h, j);
            if (l0 > j) {
                m25416Q(i, l0 - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: t */
    public int mo17545t() {
        return this.f17529i;
    }

    /* renamed from: u */
    public synchronized void mo17546u(boolean z, int i, int i2) throws IOException {
        if (!this.f17530j) {
            mo17542o(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f17526f.mo17836n(i);
            this.f17526f.mo17836n(i2);
            this.f17526f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: w */
    public synchronized void mo17547w(int i, int i2, List<C6180c> list) throws IOException {
        if (!this.f17530j) {
            this.f17531k.mo17470g(list);
            long l0 = this.f17528h.mo17834l0();
            int min = (int) Math.min((long) (this.f17529i - 4), l0);
            long j = (long) min;
            mo17542o(i, min + 4, (byte) 5, l0 == j ? (byte) 4 : 0);
            this.f17526f.mo17836n(i2 & Integer.MAX_VALUE);
            this.f17526f.mo17384f(this.f17528h, j);
            if (l0 > j) {
                m25416Q(i, l0 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: x */
    public synchronized void mo17548x(int i, C6179b bVar) throws IOException {
        if (this.f17530j) {
            throw new IOException("closed");
        } else if (bVar.f17386f != -1) {
            mo17542o(i, 4, (byte) 3, (byte) 0);
            this.f17526f.mo17836n(bVar.f17386f);
            this.f17526f.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
