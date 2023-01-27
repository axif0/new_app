package com.bumptech.glide.load.p008o.p010b0;

import com.bumptech.glide.load.p008o.p010b0.C1066a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.b0.d */
public class C1073d implements C1066a.C1067a {

    /* renamed from: a */
    private final long f4065a;

    /* renamed from: b */
    private final C1074a f4066b;

    /* renamed from: com.bumptech.glide.load.o.b0.d$a */
    public interface C1074a {
        /* renamed from: a */
        File mo5286a();
    }

    public C1073d(C1074a aVar, long j) {
        this.f4065a = j;
        this.f4066b = aVar;
    }

    /* renamed from: a */
    public C1066a mo5280a() {
        File a = this.f4066b.mo5286a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C1075e.m5794c(a, this.f4065a);
        }
        return null;
    }
}
