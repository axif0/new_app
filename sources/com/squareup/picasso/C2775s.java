package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import p374m.C6099a0;
import p374m.C6106c;
import p374m.C6113c0;
import p374m.C6120e;
import p374m.C6265x;

/* renamed from: com.squareup.picasso.s */
public final class C2775s implements C2761j {

    /* renamed from: a */
    final C6120e.C6121a f8854a;

    /* renamed from: b */
    private final C6106c f8855b;

    public C2775s(Context context) {
        this(C2748d0.m12142e(context));
    }

    public C2775s(File file) {
        this(file, C2748d0.m12138a(file));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2775s(java.io.File r3, long r4) {
        /*
            r2 = this;
            m.x$b r0 = new m.x$b
            r0.<init>()
            m.c r1 = new m.c
            r1.<init>(r3, r4)
            r0.mo17769c(r1)
            m.x r3 = r0.mo17768b()
            r2.<init>((p374m.C6265x) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C2775s.<init>(java.io.File, long):void");
    }

    public C2775s(C6265x xVar) {
        this.f8854a = xVar;
        this.f8855b = xVar.mo17750d();
    }

    /* renamed from: a */
    public C6113c0 mo10074a(C6099a0 a0Var) throws IOException {
        return this.f8854a.mo17318b(a0Var).execute();
    }
}
