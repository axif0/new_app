package com.bumptech.glide.p029s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.s.g */
public class C1398g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f4791a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private long f4792b;

    /* renamed from: c */
    private long f4793c;

    public C1398g(long j) {
        this.f4792b = j;
    }

    /* renamed from: f */
    private void m6957f() {
        mo5894m(this.f4792b);
    }

    /* renamed from: b */
    public void mo5889b() {
        mo5894m(0);
    }

    /* renamed from: g */
    public synchronized Y mo5890g(T t) {
        return this.f4791a.get(t);
    }

    /* renamed from: h */
    public synchronized long mo5891h() {
        return this.f4792b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo5291i(Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo5292j(T t, Y y) {
    }

    /* renamed from: k */
    public synchronized Y mo5892k(T t, Y y) {
        long i = (long) mo5291i(y);
        if (i >= this.f4792b) {
            mo5292j(t, y);
            return null;
        }
        if (y != null) {
            this.f4793c += i;
        }
        Y put = this.f4791a.put(t, y);
        if (put != null) {
            this.f4793c -= (long) mo5291i(put);
            if (!put.equals(y)) {
                mo5292j(t, put);
            }
        }
        m6957f();
        return put;
    }

    /* renamed from: l */
    public synchronized Y mo5893l(T t) {
        Y remove;
        remove = this.f4791a.remove(t);
        if (remove != null) {
            this.f4793c -= (long) mo5291i(remove);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo5894m(long j) {
        while (this.f4793c > j) {
            Iterator<Map.Entry<T, Y>> it = this.f4791a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f4793c -= (long) mo5291i(value);
            Object key = next.getKey();
            it.remove();
            mo5292j(key, value);
        }
    }
}
