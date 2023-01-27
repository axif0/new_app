package p385n;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: n.k */
public final class C6287k implements C6300s {

    /* renamed from: f */
    private final C6281e f17793f;

    /* renamed from: g */
    private final Inflater f17794g;

    /* renamed from: h */
    private int f17795h;

    /* renamed from: i */
    private boolean f17796i;

    C6287k(C6281e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f17793f = eVar;
            this.f17794g = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: h */
    private void m25927h() throws IOException {
        int i = this.f17795h;
        if (i != 0) {
            int remaining = i - this.f17794g.getRemaining();
            this.f17795h -= remaining;
            this.f17793f.mo17815c((long) remaining);
        }
    }

    /* renamed from: O */
    public long mo17355O(C6277c cVar, long j) throws IOException {
        C6296o o0;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f17796i) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo17908a();
                try {
                    o0 = cVar.mo17838o0(1);
                    int inflate = this.f17794g.inflate(o0.f17810a, o0.f17812c, (int) Math.min(j, (long) (8192 - o0.f17812c)));
                    if (inflate > 0) {
                        o0.f17812c += inflate;
                        long j2 = (long) inflate;
                        cVar.f17777g += j2;
                        return j2;
                    } else if (this.f17794g.finished()) {
                        break;
                    } else if (this.f17794g.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m25927h();
            if (o0.f17811b != o0.f17812c) {
                return -1;
            }
            cVar.f17776f = o0.mo17926b();
            C6297p.m25987a(o0);
            return -1;
        }
    }

    /* renamed from: a */
    public final boolean mo17908a() throws IOException {
        if (!this.f17794g.needsInput()) {
            return false;
        }
        m25927h();
        if (this.f17794g.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f17793f.mo17794A()) {
            return true;
        } else {
            C6296o oVar = this.f17793f.mo17813b().f17776f;
            int i = oVar.f17812c;
            int i2 = oVar.f17811b;
            int i3 = i - i2;
            this.f17795h = i3;
            this.f17794g.setInput(oVar.f17810a, i2, i3);
            return false;
        }
    }

    public void close() throws IOException {
        if (!this.f17796i) {
            this.f17794g.end();
            this.f17796i = true;
            this.f17793f.close();
        }
    }

    public C6301t timeout() {
        return this.f17793f.timeout();
    }
}
