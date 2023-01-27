package com.bumptech.glide.load.p012p.p013y;

import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p012p.C1175g;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.load.p012p.C1190o;
import com.bumptech.glide.load.p012p.C1196r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.p.y.e */
public class C1228e implements C1188n<URL, InputStream> {

    /* renamed from: a */
    private final C1188n<C1175g, InputStream> f4412a;

    /* renamed from: com.bumptech.glide.load.p.y.e$a */
    public static class C1229a implements C1190o<URL, InputStream> {
        /* renamed from: b */
        public C1188n<URL, InputStream> mo5458b(C1196r rVar) {
            return new C1228e(rVar.mo5512d(C1175g.class, InputStream.class));
        }
    }

    public C1228e(C1188n<C1175g, InputStream> nVar) {
        this.f4412a = nVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<InputStream> mo5453a(URL url, int i, int i2, C1002i iVar) {
        return this.f4412a.mo5453a(new C1175g(url), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5454b(URL url) {
        return true;
    }
}
