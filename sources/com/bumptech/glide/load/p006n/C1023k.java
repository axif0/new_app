package com.bumptech.glide.load.p006n;

import com.bumptech.glide.load.p006n.C1012e;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p014q.p015d.C1267u;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.k */
public final class C1023k implements C1012e<InputStream> {

    /* renamed from: a */
    private final C1267u f3986a;

    /* renamed from: com.bumptech.glide.load.n.k$a */
    public static final class C1024a implements C1012e.C1013a<InputStream> {

        /* renamed from: a */
        private final C1042b f3987a;

        public C1024a(C1042b bVar) {
            this.f3987a = bVar;
        }

        /* renamed from: a */
        public Class<InputStream> mo5182a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public C1012e<InputStream> mo5183b(InputStream inputStream) {
            return new C1023k(inputStream, this.f3987a);
        }
    }

    C1023k(InputStream inputStream, C1042b bVar) {
        C1267u uVar = new C1267u(inputStream, bVar);
        this.f3986a = uVar;
        uVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo5181b() {
        this.f3986a.mo5577j();
    }

    /* renamed from: c */
    public InputStream mo5180a() throws IOException {
        this.f3986a.reset();
        return this.f3986a;
    }
}
