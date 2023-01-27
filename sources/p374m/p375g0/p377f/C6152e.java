package p374m.p375g0.p377f;

import java.io.IOException;
import p374m.p375g0.C6130c;

/* renamed from: m.g0.f.e */
public final class C6152e extends RuntimeException {

    /* renamed from: f */
    private IOException f17296f;

    /* renamed from: g */
    private IOException f17297g;

    public C6152e(IOException iOException) {
        super(iOException);
        this.f17296f = iOException;
        this.f17297g = iOException;
    }

    /* renamed from: a */
    public void mo17404a(IOException iOException) {
        C6130c.m25038a(this.f17296f, iOException);
        this.f17297g = iOException;
    }

    /* renamed from: b */
    public IOException mo17405b() {
        return this.f17296f;
    }

    /* renamed from: c */
    public IOException mo17406c() {
        return this.f17297g;
    }
}
