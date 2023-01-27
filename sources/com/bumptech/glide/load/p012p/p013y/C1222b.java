package com.bumptech.glide.load.p012p.p013y;

import android.net.Uri;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p012p.C1175g;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.load.p012p.C1190o;
import com.bumptech.glide.load.p012p.C1196r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.y.b */
public class C1222b implements C1188n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f4406b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C1188n<C1175g, InputStream> f4407a;

    /* renamed from: com.bumptech.glide.load.p.y.b$a */
    public static class C1223a implements C1190o<Uri, InputStream> {
        /* renamed from: b */
        public C1188n<Uri, InputStream> mo5458b(C1196r rVar) {
            return new C1222b(rVar.mo5512d(C1175g.class, InputStream.class));
        }
    }

    public C1222b(C1188n<C1175g, InputStream> nVar) {
        this.f4407a = nVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<InputStream> mo5453a(Uri uri, int i, int i2, C1002i iVar) {
        return this.f4407a.mo5453a(new C1175g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5454b(Uri uri) {
        return f4406b.contains(uri.getScheme());
    }
}
