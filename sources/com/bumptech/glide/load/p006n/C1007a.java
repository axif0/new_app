package com.bumptech.glide.load.p006n;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.n.a */
public final class C1007a extends C1025l<AssetFileDescriptor> {
    public C1007a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public Class<AssetFileDescriptor> mo5162a() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5163c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AssetFileDescriptor mo5164d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
