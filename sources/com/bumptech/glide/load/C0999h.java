package com.bumptech.glide.load;

import com.bumptech.glide.p029s.C1401j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h */
public final class C0999h<T> {

    /* renamed from: e */
    private static final C1001b<Object> f3955e = new C1000a();

    /* renamed from: a */
    private final T f3956a;

    /* renamed from: b */
    private final C1001b<T> f3957b;

    /* renamed from: c */
    private final String f3958c;

    /* renamed from: d */
    private volatile byte[] f3959d;

    /* renamed from: com.bumptech.glide.load.h$a */
    class C1000a implements C1001b<Object> {
        C1000a() {
        }

        /* renamed from: a */
        public void mo5153a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    public interface C1001b<T> {
        /* renamed from: a */
        void mo5153a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C0999h(String str, T t, C1001b<T> bVar) {
        C1401j.m6970b(str);
        this.f3958c = str;
        this.f3956a = t;
        C1401j.m6972d(bVar);
        this.f3957b = bVar;
    }

    /* renamed from: a */
    public static <T> C0999h<T> m5542a(String str, T t, C1001b<T> bVar) {
        return new C0999h<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> C1001b<T> m5543b() {
        return f3955e;
    }

    /* renamed from: d */
    private byte[] m5544d() {
        if (this.f3959d == null) {
            this.f3959d = this.f3958c.getBytes(C0998g.f3954a);
        }
        return this.f3959d;
    }

    /* renamed from: e */
    public static <T> C0999h<T> m5545e(String str) {
        return new C0999h<>(str, (Object) null, m5543b());
    }

    /* renamed from: f */
    public static <T> C0999h<T> m5546f(String str, T t) {
        return new C0999h<>(str, t, m5543b());
    }

    /* renamed from: c */
    public T mo5148c() {
        return this.f3956a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0999h) {
            return this.f3958c.equals(((C0999h) obj).f3958c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo5150g(T t, MessageDigest messageDigest) {
        this.f3957b.mo5153a(m5544d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f3958c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f3958c + '\'' + '}';
    }
}
