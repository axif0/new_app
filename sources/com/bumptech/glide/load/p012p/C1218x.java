package com.bumptech.glide.load.p012p;

import android.net.Uri;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p012p.C1188n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.x */
public class C1218x<Data> implements C1188n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f4401b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C1188n<C1175g, Data> f4402a;

    /* renamed from: com.bumptech.glide.load.p.x$a */
    public static class C1219a implements C1190o<Uri, InputStream> {
        /* renamed from: b */
        public C1188n<Uri, InputStream> mo5458b(C1196r rVar) {
            return new C1218x(rVar.mo5512d(C1175g.class, InputStream.class));
        }
    }

    public C1218x(C1188n<C1175g, Data> nVar) {
        this.f4402a = nVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<Data> mo5453a(Uri uri, int i, int i2, C1002i iVar) {
        return this.f4402a.mo5453a(new C1175g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5454b(Uri uri) {
        return f4401b.contains(uri.getScheme());
    }
}
