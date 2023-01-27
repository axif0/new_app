package p385n;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: n.m */
final class C6293m implements C6280d {

    /* renamed from: f */
    public final C6277c f17803f = new C6277c();

    /* renamed from: g */
    public final C6299r f17804g;

    /* renamed from: h */
    boolean f17805h;

    C6293m(C6299r rVar) {
        if (rVar != null) {
            this.f17804g = rVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: B */
    public C6280d mo17796B(int i) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17852t0(i);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: G */
    public C6280d mo17800G(byte[] bArr) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17841q0(bArr);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: I */
    public C6280d mo17801I(C6282f fVar) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17839p0(fVar);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: L */
    public C6280d mo17804L() throws IOException {
        if (!this.f17805h) {
            long t = this.f17803f.mo17851t();
            if (t > 0) {
                this.f17804g.mo17384f(this.f17803f, t);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Y */
    public C6280d mo17810Y(String str) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17864z0(str);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Z */
    public C6280d mo17811Z(long j) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17855u0(j);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public C6277c mo17813b() {
        return this.f17803f;
    }

    public void close() throws IOException {
        if (!this.f17805h) {
            try {
                if (this.f17803f.f17777g > 0) {
                    this.f17804g.mo17384f(this.f17803f, this.f17803f.f17777g);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f17804g.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f17805h = true;
            if (th != null) {
                C6303u.m26022e(th);
                throw null;
            }
        }
    }

    /* renamed from: d */
    public C6280d mo17818d(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17843r0(bArr, i, i2);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public void mo17384f(C6277c cVar, long j) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17384f(cVar, j);
            mo17804L();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.f17805h) {
            C6277c cVar = this.f17803f;
            long j = cVar.f17777g;
            if (j > 0) {
                this.f17804g.mo17384f(cVar, j);
            }
            this.f17804g.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: i */
    public C6280d mo17826i(long j) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17857v0(j);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f17805h;
    }

    /* renamed from: l */
    public C6280d mo17833l(int i) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17861x0(i);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: n */
    public C6280d mo17836n(int i) throws IOException {
        if (!this.f17805h) {
            this.f17803f.mo17858w0(i);
            mo17804L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C6301t timeout() {
        return this.f17804g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f17804g + ")";
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f17805h) {
            int write = this.f17803f.write(byteBuffer);
            mo17804L();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
