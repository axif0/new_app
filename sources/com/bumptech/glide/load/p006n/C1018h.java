package com.bumptech.glide.load.p006n;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.h */
public class C1018h extends C1008b<ParcelFileDescriptor> {
    public C1018h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo5162a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5168c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ParcelFileDescriptor mo5170d(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
