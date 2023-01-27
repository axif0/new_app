package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.t */
public abstract class C0736t {

    /* renamed from: a */
    private final Map<String, Object> f2989a = new HashMap();

    /* renamed from: b */
    private static void m3663b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3712a() {
        Map<String, Object> map = this.f2989a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f2989a.values()) {
                    m3663b(b);
                }
            }
        }
        mo3495d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo3713c(String str) {
        T t;
        Map<String, Object> map = this.f2989a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f2989a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3495d() {
    }
}
