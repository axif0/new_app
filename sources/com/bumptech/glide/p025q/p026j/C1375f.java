package com.bumptech.glide.p025q.p026j;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.q.j.f */
public class C1375f {
    /* renamed from: a */
    public <Z> C1378i<ImageView, Z> mo5847a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C1371b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C1373d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
