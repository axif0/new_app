package com.bumptech.glide.load.p012p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1007a;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p006n.C1019i;
import com.bumptech.glide.load.p006n.C1027n;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.w */
public class C1213w<Data> implements C1188n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f4396b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C1216c<Data> f4397a;

    /* renamed from: com.bumptech.glide.load.p.w$a */
    public static final class C1214a implements C1190o<Uri, AssetFileDescriptor>, C1216c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f4398a;

        public C1214a(ContentResolver contentResolver) {
            this.f4398a = contentResolver;
        }

        /* renamed from: a */
        public C1010d<AssetFileDescriptor> mo5525a(Uri uri) {
            return new C1007a(this.f4398a, uri);
        }

        /* renamed from: b */
        public C1188n<Uri, AssetFileDescriptor> mo5458b(C1196r rVar) {
            return new C1213w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.w$b */
    public static class C1215b implements C1190o<Uri, ParcelFileDescriptor>, C1216c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f4399a;

        public C1215b(ContentResolver contentResolver) {
            this.f4399a = contentResolver;
        }

        /* renamed from: a */
        public C1010d<ParcelFileDescriptor> mo5525a(Uri uri) {
            return new C1019i(this.f4399a, uri);
        }

        /* renamed from: b */
        public C1188n<Uri, ParcelFileDescriptor> mo5458b(C1196r rVar) {
            return new C1213w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.w$c */
    public interface C1216c<Data> {
        /* renamed from: a */
        C1010d<Data> mo5525a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.p.w$d */
    public static class C1217d implements C1190o<Uri, InputStream>, C1216c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f4400a;

        public C1217d(ContentResolver contentResolver) {
            this.f4400a = contentResolver;
        }

        /* renamed from: a */
        public C1010d<InputStream> mo5525a(Uri uri) {
            return new C1027n(this.f4400a, uri);
        }

        /* renamed from: b */
        public C1188n<Uri, InputStream> mo5458b(C1196r rVar) {
            return new C1213w(this);
        }
    }

    public C1213w(C1216c<Data> cVar) {
        this.f4397a = cVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<Data> mo5453a(Uri uri, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(uri), this.f4397a.mo5525a(uri));
    }

    /* renamed from: d */
    public boolean mo5454b(Uri uri) {
        return f4396b.contains(uri.getScheme());
    }
}
