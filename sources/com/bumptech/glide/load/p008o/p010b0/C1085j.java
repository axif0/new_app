package com.bumptech.glide.load.p008o.p010b0;

import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.p029s.C1398g;
import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.C1402k;
import com.bumptech.glide.p029s.p030l.C1404a;
import com.bumptech.glide.p029s.p030l.C1413c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.o.b0.j */
public class C1085j {

    /* renamed from: a */
    private final C1398g<C0998g, String> f4089a = new C1398g<>(1000);

    /* renamed from: b */
    private final C3346e<C1087b> f4090b = C1404a.m6996d(10, new C1086a(this));

    /* renamed from: com.bumptech.glide.load.o.b0.j$a */
    class C1086a implements C1404a.C1408d<C1087b> {
        C1086a(C1085j jVar) {
        }

        /* renamed from: b */
        public C1087b mo5304a() {
            try {
                return new C1087b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.j$b */
    private static final class C1087b implements C1404a.C1410f {

        /* renamed from: f */
        final MessageDigest f4091f;

        /* renamed from: g */
        private final C1413c f4092g = C1413c.m7013a();

        C1087b(MessageDigest messageDigest) {
            this.f4091f = messageDigest;
        }

        /* renamed from: i */
        public C1413c mo5306i() {
            return this.f4092g;
        }
    }

    /* renamed from: a */
    private String m5824a(C0998g gVar) {
        C1087b b = this.f4090b.mo5909b();
        C1401j.m6972d(b);
        C1087b bVar = b;
        try {
            gVar.mo5145b(bVar.f4091f);
            return C1402k.m6992s(bVar.f4091f.digest());
        } finally {
            this.f4090b.mo5908a(bVar);
        }
    }

    /* renamed from: b */
    public String mo5303b(C0998g gVar) {
        String g;
        synchronized (this.f4089a) {
            g = this.f4089a.mo5890g(gVar);
        }
        if (g == null) {
            g = m5824a(gVar);
        }
        synchronized (this.f4089a) {
            this.f4089a.mo5892k(gVar, g);
        }
        return g;
    }
}
