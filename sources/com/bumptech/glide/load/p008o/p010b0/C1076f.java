package com.bumptech.glide.load.p008o.p010b0;

import android.content.Context;
import com.bumptech.glide.load.p008o.p010b0.C1073d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.b0.f */
public final class C1076f extends C1073d {

    /* renamed from: com.bumptech.glide.load.o.b0.f$a */
    class C1077a implements C1073d.C1074a {

        /* renamed from: a */
        final /* synthetic */ Context f4072a;

        /* renamed from: b */
        final /* synthetic */ String f4073b;

        C1077a(Context context, String str) {
            this.f4072a = context;
            this.f4073b = str;
        }

        /* renamed from: a */
        public File mo5286a() {
            File cacheDir = this.f4072a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f4073b != null ? new File(cacheDir, this.f4073b) : cacheDir;
        }
    }

    public C1076f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C1076f(Context context, String str, long j) {
        super(new C1077a(context, str), j);
    }
}
