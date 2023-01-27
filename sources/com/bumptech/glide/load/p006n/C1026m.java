package com.bumptech.glide.load.p006n;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.m */
public class C1026m extends C1008b<InputStream> {
    public C1026m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<InputStream> mo5162a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5168c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo5170d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
