package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g.d.a.c.f.f.df */
public final class C4514df extends C4626jf {

    /* renamed from: a */
    private final AtomicReference<Bundle> f14067a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f14068b;

    /* renamed from: r */
    public static <T> T m19292r(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e);
            throw e;
        }
    }

    /* renamed from: S0 */
    public final Bundle mo14081S0(long j) {
        Bundle bundle;
        synchronized (this.f14067a) {
            if (!this.f14068b) {
                try {
                    this.f14067a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f14067a.get();
        }
        return bundle;
    }

    /* renamed from: g */
    public final void mo14082g(Bundle bundle) {
        synchronized (this.f14067a) {
            try {
                this.f14067a.set(bundle);
                this.f14068b = true;
                this.f14067a.notify();
            } catch (Throwable th) {
                this.f14067a.notify();
                throw th;
            }
        }
    }

    /* renamed from: w */
    public final String mo14083w(long j) {
        return (String) m19292r(mo14081S0(j), String.class);
    }
}
