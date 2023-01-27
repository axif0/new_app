package p385n;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: n.j */
public final class C6286j implements C6300s {

    /* renamed from: f */
    private int f17788f = 0;

    /* renamed from: g */
    private final C6281e f17789g;

    /* renamed from: h */
    private final Inflater f17790h;

    /* renamed from: i */
    private final C6287k f17791i;

    /* renamed from: j */
    private final CRC32 f17792j = new CRC32();

    public C6286j(C6300s sVar) {
        if (sVar != null) {
            this.f17790h = new Inflater(true);
            C6281e d = C6288l.m25933d(sVar);
            this.f17789g = d;
            this.f17791i = new C6287k(d, this.f17790h);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private void m25922a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: h */
    private void m25923h() throws IOException {
        this.f17789g.mo17809W(10);
        byte D = this.f17789g.mo17813b().mo17799D(3);
        boolean z = ((D >> 1) & 1) == 1;
        if (z) {
            m25925m(this.f17789g.mo17813b(), 0, 10);
        }
        m25922a("ID1ID2", 8075, this.f17789g.readShort());
        this.f17789g.mo17815c(8);
        if (((D >> 2) & 1) == 1) {
            this.f17789g.mo17809W(2);
            if (z) {
                m25925m(this.f17789g.mo17813b(), 0, 2);
            }
            long K = (long) this.f17789g.mo17813b().mo17803K();
            this.f17789g.mo17809W(K);
            if (z) {
                m25925m(this.f17789g.mo17813b(), 0, K);
            }
            this.f17789g.mo17815c(K);
        }
        if (((D >> 3) & 1) == 1) {
            long b0 = this.f17789g.mo17814b0((byte) 0);
            if (b0 != -1) {
                if (z) {
                    m25925m(this.f17789g.mo17813b(), 0, b0 + 1);
                }
                this.f17789g.mo17815c(b0 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((D >> 4) & 1) == 1) {
            long b02 = this.f17789g.mo17814b0((byte) 0);
            if (b02 != -1) {
                if (z) {
                    m25925m(this.f17789g.mo17813b(), 0, b02 + 1);
                }
                this.f17789g.mo17815c(b02 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m25922a("FHCRC", this.f17789g.mo17803K(), (short) ((int) this.f17792j.getValue()));
            this.f17792j.reset();
        }
    }

    /* renamed from: j */
    private void m25924j() throws IOException {
        m25922a("CRC", this.f17789g.mo17862y(), (int) this.f17792j.getValue());
        m25922a("ISIZE", this.f17789g.mo17862y(), (int) this.f17790h.getBytesWritten());
    }

    /* renamed from: m */
    private void m25925m(C6277c cVar, long j, long j2) {
        C6296o oVar = cVar.f17776f;
        while (true) {
            int i = oVar.f17812c;
            int i2 = oVar.f17811b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            oVar = oVar.f17815f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) oVar.f17811b) + j);
            int min = (int) Math.min((long) (oVar.f17812c - i3), j2);
            this.f17792j.update(oVar.f17810a, i3, min);
            j2 -= (long) min;
            oVar = oVar.f17815f;
            j = 0;
        }
    }

    /* renamed from: O */
    public long mo17355O(C6277c cVar, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f17788f == 0) {
                m25923h();
                this.f17788f = 1;
            }
            if (this.f17788f == 1) {
                long j2 = cVar.f17777g;
                long O = this.f17791i.mo17355O(cVar, j);
                if (O != -1) {
                    m25925m(cVar, j2, O);
                    return O;
                }
                this.f17788f = 2;
            }
            if (this.f17788f == 2) {
                m25924j();
                this.f17788f = 3;
                if (!this.f17789g.mo17794A()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() throws IOException {
        this.f17791i.close();
    }

    public C6301t timeout() {
        return this.f17789g.timeout();
    }
}
