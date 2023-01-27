package p385n;

import java.io.IOException;

/* renamed from: n.g */
public abstract class C6283g implements C6299r {

    /* renamed from: f */
    private final C6299r f17785f;

    public C6283g(C6299r rVar) {
        if (rVar != null) {
            this.f17785f = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.f17785f.close();
    }

    /* renamed from: f */
    public void mo17384f(C6277c cVar, long j) throws IOException {
        this.f17785f.mo17384f(cVar, j);
    }

    public void flush() throws IOException {
        this.f17785f.flush();
    }

    public C6301t timeout() {
        return this.f17785f.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f17785f.toString() + ")";
    }
}
