package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.q */
public class C1263q extends C1240f {

    /* renamed from: b */
    private static final byte[] f4468b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C0998g.f3954a);

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        messageDigest.update(f4468b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo5546c(C1047e eVar, Bitmap bitmap, int i, int i2) {
        return C1272x.m6406e(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1263q;
    }

    public int hashCode() {
        return 1572326941;
    }
}
