package com.bumptech.glide.load.p012p;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p012p.C1188n;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.s */
public class C1200s<Data> implements C1188n<Integer, Data> {

    /* renamed from: a */
    private final C1188n<Uri, Data> f4385a;

    /* renamed from: b */
    private final Resources f4386b;

    /* renamed from: com.bumptech.glide.load.p.s$a */
    public static final class C1201a implements C1190o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f4387a;

        public C1201a(Resources resources) {
            this.f4387a = resources;
        }

        /* renamed from: b */
        public C1188n<Integer, AssetFileDescriptor> mo5458b(C1196r rVar) {
            return new C1200s(this.f4387a, rVar.mo5512d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$b */
    public static class C1202b implements C1190o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f4388a;

        public C1202b(Resources resources) {
            this.f4388a = resources;
        }

        /* renamed from: b */
        public C1188n<Integer, ParcelFileDescriptor> mo5458b(C1196r rVar) {
            return new C1200s(this.f4388a, rVar.mo5512d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$c */
    public static class C1203c implements C1190o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f4389a;

        public C1203c(Resources resources) {
            this.f4389a = resources;
        }

        /* renamed from: b */
        public C1188n<Integer, InputStream> mo5458b(C1196r rVar) {
            return new C1200s(this.f4389a, rVar.mo5512d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.s$d */
    public static class C1204d implements C1190o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f4390a;

        public C1204d(Resources resources) {
            this.f4390a = resources;
        }

        /* renamed from: b */
        public C1188n<Integer, Uri> mo5458b(C1196r rVar) {
            return new C1200s(this.f4390a, C1210v.m6201c());
        }
    }

    public C1200s(Resources resources, C1188n<Uri, Data> nVar) {
        this.f4386b = resources;
        this.f4385a = nVar;
    }

    /* renamed from: d */
    private Uri m6181d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f4386b.getResourcePackageName(num.intValue()) + '/' + this.f4386b.getResourceTypeName(num.intValue()) + '/' + this.f4386b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public C1188n.C1189a<Data> mo5453a(Integer num, int i, int i2, C1002i iVar) {
        Uri d = m6181d(num);
        if (d == null) {
            return null;
        }
        return this.f4385a.mo5453a(d, i, i2, iVar);
    }

    /* renamed from: e */
    public boolean mo5454b(Integer num) {
        return true;
    }
}
