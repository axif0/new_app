package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.i */
public class C1243i extends C1240f {

    /* renamed from: b */
    private static final byte[] f4435b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C0998g.f3954a);

    /* renamed from: b */
    public void mo5145b(MessageDigest messageDigest) {
        messageDigest.update(f4435b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo5546c(C1047e eVar, Bitmap bitmap, int i, int i2) {
        return C1272x.m6403b(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1243i;
    }

    public int hashCode() {
        return -599754482;
    }
}
