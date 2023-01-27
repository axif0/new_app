package p148g.p189d.p190a.p232c.p237d;

import java.util.concurrent.Callable;

/* renamed from: g.d.a.c.d.e0 */
final class C4374e0 extends C4369c0 {

    /* renamed from: e */
    private final Callable<String> f13915e;

    private C4374e0(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.f13915e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo13687a() {
        try {
            return this.f13915e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
