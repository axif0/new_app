package p374m.p375g0.p376e;

import java.io.IOException;
import p385n.C6277c;
import p385n.C6283g;
import p385n.C6299r;

/* renamed from: m.g0.e.e */
class C6146e extends C6283g {

    /* renamed from: g */
    private boolean f17275g;

    C6146e(C6299r rVar) {
        super(rVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17373a(IOException iOException) {
        throw null;
    }

    public void close() throws IOException {
        if (!this.f17275g) {
            try {
                super.close();
            } catch (IOException e) {
                this.f17275g = true;
                mo17373a(e);
            }
        }
    }

    /* renamed from: f */
    public void mo17384f(C6277c cVar, long j) throws IOException {
        if (this.f17275g) {
            cVar.mo17815c(j);
            return;
        }
        try {
            super.mo17384f(cVar, j);
        } catch (IOException e) {
            this.f17275g = true;
            mo17373a(e);
        }
    }

    public void flush() throws IOException {
        if (!this.f17275g) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f17275g = true;
                mo17373a(e);
            }
        }
    }
}
