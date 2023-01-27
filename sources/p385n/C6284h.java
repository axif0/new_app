package p385n;

import java.io.IOException;

/* renamed from: n.h */
public abstract class C6284h implements C6300s {

    /* renamed from: f */
    private final C6300s f17786f;

    public C6284h(C6300s sVar) {
        if (sVar != null) {
            this.f17786f = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: O */
    public long mo17355O(C6277c cVar, long j) throws IOException {
        return this.f17786f.mo17355O(cVar, j);
    }

    /* renamed from: a */
    public final C6300s mo17896a() {
        return this.f17786f;
    }

    public void close() throws IOException {
        this.f17786f.close();
    }

    public C6301t timeout() {
        return this.f17786f.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f17786f.toString() + ")";
    }
}
