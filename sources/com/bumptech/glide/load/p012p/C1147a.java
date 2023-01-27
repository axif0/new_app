package com.bumptech.glide.load.p012p;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p006n.C1018h;
import com.bumptech.glide.load.p006n.C1026m;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.a */
public class C1147a<Data> implements C1188n<Uri, Data> {

    /* renamed from: c */
    private static final int f4317c = 22;

    /* renamed from: a */
    private final AssetManager f4318a;

    /* renamed from: b */
    private final C1148a<Data> f4319b;

    /* renamed from: com.bumptech.glide.load.p.a$a */
    public interface C1148a<Data> {
        /* renamed from: a */
        C1010d<Data> mo5457a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.p.a$b */
    public static class C1149b implements C1190o<Uri, ParcelFileDescriptor>, C1148a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f4320a;

        public C1149b(AssetManager assetManager) {
            this.f4320a = assetManager;
        }

        /* renamed from: a */
        public C1010d<ParcelFileDescriptor> mo5457a(AssetManager assetManager, String str) {
            return new C1018h(assetManager, str);
        }

        /* renamed from: b */
        public C1188n<Uri, ParcelFileDescriptor> mo5458b(C1196r rVar) {
            return new C1147a(this.f4320a, this);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.a$c */
    public static class C1150c implements C1190o<Uri, InputStream>, C1148a<InputStream> {

        /* renamed from: a */
        private final AssetManager f4321a;

        public C1150c(AssetManager assetManager) {
            this.f4321a = assetManager;
        }

        /* renamed from: a */
        public C1010d<InputStream> mo5457a(AssetManager assetManager, String str) {
            return new C1026m(assetManager, str);
        }

        /* renamed from: b */
        public C1188n<Uri, InputStream> mo5458b(C1196r rVar) {
            return new C1147a(this.f4321a, this);
        }
    }

    public C1147a(AssetManager assetManager, C1148a<Data> aVar) {
        this.f4318a = assetManager;
        this.f4319b = aVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<Data> mo5453a(Uri uri, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(uri), this.f4319b.mo5457a(this.f4318a, uri.toString().substring(f4317c)));
    }

    /* renamed from: d */
    public boolean mo5454b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
