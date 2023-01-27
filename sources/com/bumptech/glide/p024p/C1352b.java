package com.bumptech.glide.p024p;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.p.b */
public final class C1352b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f4658a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo5752a(ImageHeaderParser imageHeaderParser) {
        this.f4658a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo5753b() {
        return this.f4658a;
    }
}
