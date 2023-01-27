package com.bumptech.glide.load.p012p.p013y;

import com.bumptech.glide.load.C0999h;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1020j;
import com.bumptech.glide.load.p012p.C1175g;
import com.bumptech.glide.load.p012p.C1185m;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.load.p012p.C1190o;
import com.bumptech.glide.load.p012p.C1196r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.a */
public class C1220a implements C1188n<C1175g, InputStream> {

    /* renamed from: b */
    public static final C0999h<Integer> f4403b = C0999h.m5546f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C1185m<C1175g, C1175g> f4404a;

    /* renamed from: com.bumptech.glide.load.p.y.a$a */
    public static class C1221a implements C1190o<C1175g, InputStream> {

        /* renamed from: a */
        private final C1185m<C1175g, C1175g> f4405a = new C1185m<>(500);

        /* renamed from: b */
        public C1188n<C1175g, InputStream> mo5458b(C1196r rVar) {
            return new C1220a(this.f4405a);
        }
    }

    public C1220a(C1185m<C1175g, C1175g> mVar) {
        this.f4404a = mVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<InputStream> mo5453a(C1175g gVar, int i, int i2, C1002i iVar) {
        C1185m<C1175g, C1175g> mVar = this.f4404a;
        if (mVar != null) {
            C1175g a = mVar.mo5498a(gVar, 0, 0);
            if (a == null) {
                this.f4404a.mo5499b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new C1188n.C1189a<>(gVar, new C1020j(gVar, ((Integer) iVar.mo5154c(f4403b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo5454b(C1175g gVar) {
        return true;
    }
}
