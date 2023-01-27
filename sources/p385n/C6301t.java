package p385n;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: n.t */
public class C6301t {

    /* renamed from: d */
    public static final C6301t f17821d = new C6302a();

    /* renamed from: a */
    private boolean f17822a;

    /* renamed from: b */
    private long f17823b;

    /* renamed from: c */
    private long f17824c;

    /* renamed from: n.t$a */
    class C6302a extends C6301t {
        C6302a() {
        }

        /* renamed from: d */
        public C6301t mo17901d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo17903f() throws IOException {
        }

        /* renamed from: g */
        public C6301t mo17904g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public C6301t mo17898a() {
        this.f17822a = false;
        return this;
    }

    /* renamed from: b */
    public C6301t mo17899b() {
        this.f17824c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo17900c() {
        if (this.f17822a) {
            return this.f17823b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C6301t mo17901d(long j) {
        this.f17822a = true;
        this.f17823b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo17902e() {
        return this.f17822a;
    }

    /* renamed from: f */
    public void mo17903f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f17822a && this.f17823b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C6301t mo17904g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.f17824c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: h */
    public long mo17905h() {
        return this.f17824c;
    }
}
