package com.bumptech.glide.load.p012p;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p012p.C1188n;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.u */
public class C1206u<Data> implements C1188n<String, Data> {

    /* renamed from: a */
    private final C1188n<Uri, Data> f4392a;

    /* renamed from: com.bumptech.glide.load.p.u$a */
    public static final class C1207a implements C1190o<String, AssetFileDescriptor> {
        /* renamed from: b */
        public C1188n<String, AssetFileDescriptor> mo5458b(C1196r rVar) {
            return new C1206u(rVar.mo5512d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.u$b */
    public static class C1208b implements C1190o<String, ParcelFileDescriptor> {
        /* renamed from: b */
        public C1188n<String, ParcelFileDescriptor> mo5458b(C1196r rVar) {
            return new C1206u(rVar.mo5512d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.u$c */
    public static class C1209c implements C1190o<String, InputStream> {
        /* renamed from: b */
        public C1188n<String, InputStream> mo5458b(C1196r rVar) {
            return new C1206u(rVar.mo5512d(Uri.class, InputStream.class));
        }
    }

    public C1206u(C1188n<Uri, Data> nVar) {
        this.f4392a = nVar;
    }

    /* renamed from: e */
    private static Uri m6192e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return m6193f(str);
    }

    /* renamed from: f */
    private static Uri m6193f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C1188n.C1189a<Data> mo5453a(String str, int i, int i2, C1002i iVar) {
        Uri e = m6192e(str);
        if (e == null || !this.f4392a.mo5454b(e)) {
            return null;
        }
        return this.f4392a.mo5453a(e, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo5454b(String str) {
        return true;
    }
}
